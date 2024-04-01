package X;

import com.whatsapp.util.Log;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.02t  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C006202t {
    public static volatile C006202t A04;
    public final C005902q A02;
    public final C006302u A00 = new C006302u();
    public final C006302u A01 = new C006302u();
    public final CountDownLatch A03 = new CountDownLatch(1);

    public C006202t(C005902q c005902q) {
        this.A02 = c005902q;
    }

    public static C006202t A00() {
        if (A04 == null) {
            synchronized (C006202t.class) {
                if (A04 == null) {
                    A04 = new C006202t(C005902q.A00());
                }
            }
        }
        return A04;
    }

    public void A01(int i) {
        if (i != 2) {
            this.A02.A01.A00();
        } else {
            this.A02.A02.A00();
        }
        try {
            this.A03.await();
        } catch (InterruptedException e) {
            StringBuilder sb = new StringBuilder("wamruntime: unexpected thread interrupt (");
            sb.append(e);
            sb.append(")");
            Log.a(sb.toString());
            Thread.currentThread().interrupt();
        }
    }

    public void A02(int i, Object obj, int i2) {
        if (i2 == 1 || i2 == 0) {
            this.A00.A01(i, obj);
        } else {
            this.A01.A01(i, obj);
        }
    }

    public void A03(final int i, final Object obj, final int i2) {
        C005902q c005902q = this.A02;
        if (c005902q.A00.A05 == Thread.currentThread().getId()) {
            A02(i, obj, i2);
        } else if (i2 != 2) {
            c005902q.A01.execute(new Runnable() { // from class: X.0Ri
                @Override // java.lang.Runnable
                public final void run() {
                    C006202t c006202t = C006202t.this;
                    int i3 = i2;
                    int i4 = i;
                    Object obj2 = obj;
                    c006202t.A01(i3);
                    c006202t.A02(i4, obj2, i3);
                }
            });
        } else {
            c005902q.A02.execute(new Runnable() { // from class: X.1PA
                public final /* synthetic */ int A00 = 2;

                @Override // java.lang.Runnable
                public final void run() {
                    C006202t c006202t = C006202t.this;
                    int i3 = this.A00;
                    int i4 = i;
                    Object obj2 = obj;
                    c006202t.A01(i3);
                    c006202t.A02(i4, obj2, i3);
                }
            });
        }
    }
}
