package X;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.03X */
/* loaded from: classes.dex */
public class C03X {
    public static volatile C03X A02;
    public final AnonymousClass011 A00;
    public final AtomicInteger A01 = new AtomicInteger();

    public C03X(AnonymousClass011 anonymousClass011) {
        this.A00 = anonymousClass011;
    }

    public void A00(int i, String str) {
        A01(6, "markerId:%d, errorString:%s", Integer.valueOf(i), str);
    }

    public final void A01(int i, String str, Object... objArr) {
        if (this.A01.getAndIncrement() >= 5) {
            return;
        }
        C37421mO c37421mO = new C37421mO();
        c37421mO.A00 = Integer.valueOf(i);
        if (str != null) {
            c37421mO.A01 = String.format(Locale.US, str, objArr);
        }
        this.A00.A0B(c37421mO, null, false);
    }

    public void A02(String str) {
        if (str != null && str.length() > 200) {
            str = str.substring(0, 200);
        }
        A01(10, "errorString:%s", str);
    }
}
