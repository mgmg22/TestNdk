package com.google.testndk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        tv = (TextView) findViewById(R.id.tv_app_package_name);
        tv.setText("packageName: " + JniTest.getPackname(MainActivity.this));
        Button btn_static = (Button) findViewById(R.id.btn_static);
        btn_static.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.append("\n->>"+JNIStaticUtils.getStringFromJNI());
            }
        });
        Button btn_dynamic = (Button) findViewById(R.id.btn_dynamic);
        btn_dynamic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.append("\n->>"+JNIDynamicUtils.getHelloStringFromJNI());
            }
        });
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
