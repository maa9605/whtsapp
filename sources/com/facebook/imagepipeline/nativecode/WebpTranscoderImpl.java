package com.facebook.imagepipeline.nativecode;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class WebpTranscoderImpl {
    public static native void nativeTranscodeWebpToJpeg(InputStream inputStream, OutputStream outputStream, int i);

    public static native void nativeTranscodeWebpToPng(InputStream inputStream, OutputStream outputStream);
}
