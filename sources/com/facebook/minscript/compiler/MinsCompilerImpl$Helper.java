package com.facebook.minscript.compiler;

import com.facebook.soloader.SoLoader;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class MinsCompilerImpl$Helper {
    public static native ByteBuffer doCompile(String str);

    static {
        SoLoader.A03("minscompiler-jni");
    }
}
