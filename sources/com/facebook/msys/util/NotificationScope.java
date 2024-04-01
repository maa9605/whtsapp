package com.facebook.msys.util;

import com.facebook.simplejni.NativeHolder;

/* loaded from: classes.dex */
public final class NotificationScope {
    public final McfReferenceHolder mMcfReference = new McfReferenceHolder();
    public final NativeHolder mNativeHolder = initNativeHolder(this);

    public static native NativeHolder initNativeHolder(NotificationScope notificationScope);
}
