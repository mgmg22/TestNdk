#include <jni.h>
#include <string>

JNIEXPORT jstring JNICALL
Java_com_google_testndk_JniTest_getPackname(JNIEnv *env, jclass type, jobject o) {

    // TODO


    return env->NewStringUTF("UTF-8");
}

JNIEXPORT jstring JNICALL
Java_com_google_testndk_JNIDynamicUtils_getHelloStringFromJNI(JNIEnv *env, jclass type) {

    // TODO


    return env->NewStringUTF("UTF-8");
}

JNIEXPORT jstring JNICALL
Java_com_google_testndk_JNIStaticUtils_getStringFromJNI(JNIEnv *env, jclass type) {

    // TODO


    return env->NewStringUTF("UTF-8");
}

extern "C"
jstring
Java_com_google_testndk_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
