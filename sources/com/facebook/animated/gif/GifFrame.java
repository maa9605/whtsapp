package com.facebook.animated.gif;

import X.C0JE;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class GifFrame implements C0JE {
    public long mNativeContext;

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDisposalMode();

    private native int nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetTransparentPixelColor();

    private native int nativeGetWidth();

    private native int nativeGetXOffset();

    private native int nativeGetYOffset();

    private native boolean nativeHasTransparency();

    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    public GifFrame(long j) {
        this.mNativeContext = j;
    }

    @Override // X.C0JE
    public void dispose() {
        nativeDispose();
    }

    public void finalize() {
        nativeFinalize();
    }

    public int getDisposalMode() {
        return nativeGetDisposalMode();
    }

    @Override // X.C0JE
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // X.C0JE
    public int getWidth() {
        return nativeGetWidth();
    }

    @Override // X.C0JE
    public int getXOffset() {
        return nativeGetXOffset();
    }

    @Override // X.C0JE
    public int getYOffset() {
        return nativeGetYOffset();
    }

    @Override // X.C0JE
    public void renderFrame(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }
}
