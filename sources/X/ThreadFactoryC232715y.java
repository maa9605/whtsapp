package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.15y  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class ThreadFactoryC232715y implements ThreadFactory {
    public final String A00;
    public final ThreadFactory A01 = Executors.defaultThreadFactory();

    public ThreadFactoryC232715y(String str) {
        C07K.A1Q(str, "Name must not be null");
        this.A00 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread newThread = this.A01.newThread(new AnonymousClass160(runnable));
        newThread.setName(this.A00);
        return newThread;
    }
}
