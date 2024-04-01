package X;

import com.whatsapp.util.Log;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.22m  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C455422m extends AbstractC43161wx {
    public static volatile C455422m A01;
    public final C41491u0 A00;

    public C455422m(final InterfaceC002901k interfaceC002901k, C41491u0 c41491u0) {
        super(C007203d.A00(new InterfaceC007103c() { // from class: X.3GH
            @Override // X.InterfaceC007103c
            public final Object get() {
                ThreadPoolExecutor A6y = InterfaceC002901k.this.A6y("MediaUploadQueue", 10, 10, 5L, 1, new LinkedBlockingQueue());
                A6y.allowCoreThreadTimeOut(true);
                return A6y;
            }
        }));
        this.A00 = c41491u0;
    }

    public static C455422m A00() {
        if (A01 == null) {
            synchronized (C455422m.class) {
                if (A01 == null) {
                    A01 = new C455422m(C002801j.A00(), C41491u0.A00());
                }
            }
        }
        return A01;
    }

    @Override // X.AbstractC43161wx
    /* renamed from: A07 */
    public boolean A06(C22e c22e) {
        StringBuilder sb = new StringBuilder("mediauploadqueue/cancel ");
        sb.append(c22e);
        Log.i(sb.toString());
        return super.A06(c22e);
    }
}
