package com.google.testndk;

/**
 * Created by uniware on 2017/3/1.
 */

public class JNIStaticUtils {
    /**
     * 调用C++代码的方法，返回对应的字符串
     * @return
     */
    public static native String getStringFromJNI();

    /**
     * 加载so库或jni库
     */
    static {
        System.loadLibrary("JNI_STATIC_ANDROID_TEST");
    }
}