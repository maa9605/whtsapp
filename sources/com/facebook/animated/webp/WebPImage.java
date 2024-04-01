package com.facebook.animated.webp;

import X.C0JC;
import X.C0JE;
import X.C19300vC;
import X.EnumC19280vA;
import X.EnumC19290vB;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class WebPImage implements C0JC {
    public long mNativeContext;

    public static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    public static native WebPImage nativeCreateFromNativeMemory(long j, int i);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native WebPFrame nativeGetFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    @Override // X.C0JC
    public boolean doesRenderSupportScaling() {
        return true;
    }

    public WebPImage() {
    }

    public WebPImage(long j) {
        this.mNativeContext = j;
    }

    public void dispose() {
        nativeDispose();
    }

    public void finalize() {
        nativeFinalize();
    }

    @Override // X.C0JC
    public C0JE getFrame(int i) {
        return nativeGetFrame(i);
    }

    @Override // X.C0JC
    public WebPFrame getFrame(int i) {
        return nativeGetFrame(i);
    }

    @Override // X.C0JC
    public int getFrameCount() {
        return nativeGetFrameCount();
    }

    @Override // X.C0JC
    public int[] getFrameDurations() {
        return nativeGetFrameDurations();
    }

    @Override // X.C0JC
    public C19300vC getFrameInfo(int i) {
        WebPFrame nativeGetFrame = nativeGetFrame(i);
        try {
            return new C19300vC(nativeGetFrame.getXOffset(), nativeGetFrame.getYOffset(), nativeGetFrame.getWidth(), nativeGetFrame.getHeight(), nativeGetFrame.isBlendWithPreviousFrame() ? EnumC19280vA.BLEND_WITH_PREVIOUS : EnumC19280vA.NO_BLEND, nativeGetFrame.shouldDisposeToBackgroundColor() ? EnumC19290vB.DISPOSE_TO_BACKGROUND : EnumC19290vB.DISPOSE_DO_NOT);
        } finally {
            nativeGetFrame.dispose();
        }
    }

    @Override // X.C0JC
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // X.C0JC
    public int getLoopCount() {
        return nativeGetLoopCount();
    }

    @Override // X.C0JC
    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    @Override // X.C0JC
    public int getWidth() {
        return nativeGetWidth();
    }
}
