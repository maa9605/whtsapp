package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class PreverificationHelper {
    public boolean shouldUseHardwareBitmapConfig(Bitmap.Config config) {
        return config == Bitmap.Config.HARDWARE;
    }
}
