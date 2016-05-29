//
// Created by LML on 2016-05-03.
//

#include "com_leon_androidndkfirst_NdkTest.h"
JNIEXPORT jstring JNICALL Java_com_leon_androidndkfirst_NdkTest_getStringFromNative
  (JNIEnv *env, jclass clazz) {
    return (*env)->NewStringUTF(env,"这是来自native的string"); // 返回一条字符串
}
