package com.facebook.animated.gif;

import X.C0JC;
import X.C0JE;
import X.C19300vC;
import X.EnumC19280vA;
import X.EnumC19290vB;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class GifImage implements C0JC {
    public static volatile boolean sInitialized;
    public long mNativeContext;

    public static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i, boolean z);

    public static native GifImage nativeCreateFromFileDescriptor(int i, int i2, boolean z);

    public static native GifImage nativeCreateFromNativeMemory(long j, int i, int i2, boolean z);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native GifFrame nativeGetFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    private native boolean nativeIsAnimated();

    @Override // X.C0JC
    public boolean doesRenderSupportScaling() {
        return false;
    }

    public GifImage() {
    }

    public GifImage(long j) {
        this.mNativeContext = j;
    }

    public void dispose() {
        nativeDispose();
    }

    public void finalize() {
        nativeFinalize();
    }

    public int getDuration() {
        return nativeGetDuration();
    }

    @Override // X.C0JC
    public C0JE getFrame(int i) {
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
        GifFrame nativeGetFrame = nativeGetFrame(i);
        try {
            int xOffset = nativeGetFrame.getXOffset();
            int yOffset = nativeGetFrame.getYOffset();
            int width = nativeGetFrame.getWidth();
            int height = nativeGetFrame.getHeight();
            EnumC19280vA enumC19280vA = EnumC19280vA.BLEND_WITH_PREVIOUS;
            int disposalMode = nativeGetFrame.getDisposalMode();
            EnumC19290vB enumC19290vB = EnumC19290vB.DISPOSE_DO_NOT;
            if (disposalMode != 0 && disposalMode != 1) {
                if (disposalMode != 2) {
                    if (disposalMode == 3) {
                        enumC19290vB = EnumC19290vB.DISPOSE_TO_PREVIOUS;
                    }
                } else {
                    enumC19290vB = EnumC19290vB.DISPOSE_TO_BACKGROUND;
                }
            }
            return new C19300vC(xOffset, yOffset, width, height, enumC19280vA, enumC19290vB);
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
        int nativeGetLoopCount = nativeGetLoopCount();
        if (nativeGetLoopCount != -1) {
            if (nativeGetLoopCount != 0) {
                return nativeGetLoopCount + 1;
            }
            return 0;
        }
        return 1;
    }

    @Override // X.C0JC
    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    @Override // X.C0JC
    public int getWidth() {
        return nativeGetWidth();
    }

    public boolean isAnimated() {
        return nativeIsAnimated();
    }
}
