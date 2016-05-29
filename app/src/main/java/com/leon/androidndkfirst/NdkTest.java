package com.leon.androidndkfirst;

/**
 * Created by LML on 2016-05-03.
 */
public class NdkTest {
    static {
        System.loadLibrary("ndkfirst"); //so库名称，对应libndkfirst.so
    }
    public static native String getStringFromNative();
}
