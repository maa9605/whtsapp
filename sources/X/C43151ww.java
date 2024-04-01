package X;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.1ww  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43151ww extends AbstractC43161wx {
    public static volatile C43151ww A01;
    public final C003701t A00;

    public C43151ww(C003701t c003701t, final InterfaceC002901k interfaceC002901k) {
        super(C007203d.A00(new InterfaceC007103c() { // from class: X.3Fb
            @Override // X.InterfaceC007103c
            public final Object get() {
                ThreadPoolExecutor A6y = InterfaceC002901k.this.A6y("MediaDownload", 1, 1, 60L, 10, new PriorityBlockingQueue());
                A6y.allowCoreThreadTimeOut(true);
                return A6y;
            }
        }));
        this.A00 = c003701t;
    }

    @Override // X.AbstractC43161wx
    public /* bridge */ /* synthetic */ Runnable A01(Object obj, Object obj2) {
        return A07((AnonymousClass097) obj, null);
    }

    public synchronized C43221x3 A07(AnonymousClass097 anonymousClass097, C43221x3 c43221x3) {
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) super.A00.get();
        int corePoolSize = threadPoolExecutor.getCorePoolSize();
        int max = Math.max(1, Math.min(10, this.A00.A03(49)));
        if (corePoolSize != max) {
            if (max > corePoolSize) {
                threadPoolExecutor.setMaximumPoolSize(max);
                threadPoolExecutor.setCorePoolSize(max);
            } else {
                threadPoolExecutor.setCorePoolSize(max);
                threadPoolExecutor.setMaximumPoolSize(max);
            }
        }
        return (C43221x3) super.A01(anonymousClass097, c43221x3);
    }
}
