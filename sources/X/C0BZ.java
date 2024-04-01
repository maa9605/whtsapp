package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.0BZ  reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C0BZ implements ThreadFactory {
    public static final ThreadFactory A00 = new C0BZ();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }
}
