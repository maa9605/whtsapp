package com.whatsapp.voipcalling;

import X.C74413dE;
import X.InterfaceC74493dM;
import android.content.Context;
import android.graphics.Point;
import android.view.SurfaceHolder;

/* loaded from: classes.dex */
public interface VideoPort {
    public static final int ERROR_CREATE_EGL = -5;
    public static final int ERROR_CREATE_RENDERER = -2;
    public static final int ERROR_NO_EGL = -6;
    public static final int ERROR_NO_SURFACE = -1;
    public static final int ERROR_POST_TO_LOOPER = -100;
    public static final int ERROR_STALE_TEXTURE = -7;
    public static final int ERROR_SWAP_BUFFERS = -3;
    public static final int ERROR_UPDATE_WINDOW_SIZE = -4;
    public static final int SUCCESS = 0;

    C74413dE createSurfaceTexture();

    Context getContext();

    SurfaceHolder getSurfaceHolder();

    Point getWindowSize();

    void release();

    void releaseSurfaceTexture(C74413dE c74413dE);

    int renderNativeFrame(long j, int i, int i2, int i3, int i4, int i5);

    int renderTexture(C74413dE c74413dE, int i, int i2);

    int resetBlackScreen();

    void setListener(InterfaceC74493dM interfaceC74493dM);

    int setScaleType(int i);
}
