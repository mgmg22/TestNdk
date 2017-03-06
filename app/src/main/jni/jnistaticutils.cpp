#include <stdio.h>
#include <jni.h>
#include <stdlib.h>
#include "jnistaticutils.h"

JNIEXPORT jstring JNICALL Java_com_google_testndk_JNIStaticUtils_getStringFromJNI(JNIEnv *env,
                                                                                  jclass clazz) {
    return env->NewStringUTF("this is string from jni.");
}