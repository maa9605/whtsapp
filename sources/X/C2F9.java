package X;

import android.content.Context;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2F9  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2F9 {
    public static volatile C2F9 A05;
    public int A00;
    public C2FB A01;
    public Boolean A02;
    public final AnonymousClass011 A03;
    public final C2FD A04;

    public C2F9(AnonymousClass011 anonymousClass011, C2FD c2fd) {
        this.A03 = anonymousClass011;
        this.A04 = c2fd;
    }

    public static C2F9 A00() {
        if (A05 == null) {
            synchronized (C2F9.class) {
                if (A05 == null) {
                    AnonymousClass011 A00 = AnonymousClass011.A00();
                    if (C2FD.A02 == null) {
                        synchronized (C2FD.class) {
                            if (C2FD.A02 == null) {
                                C2FD.A02 = new C2FD(C002801j.A00(), AnonymousClass057.A00);
                            }
                        }
                    }
                    A05 = new C2F9(A00, C2FD.A02);
                }
            }
        }
        return A05;
    }

    public void A01() {
        C2FB c2fb = this.A01;
        if (c2fb != null) {
            C0RH c0rh = c2fb.A02;
            if (c0rh.A05) {
                c0rh.A05 = false;
                C0RI c0ri = c0rh.A03;
                c0ri.A03 = false;
                c0ri.A05.removeFrameCallback(c0ri.A04);
                double min = Math.min(c0rh.A01, 3600.0d);
                double min2 = Math.min(c0rh.A00, 1000.0d);
                long millis = TimeUnit.NANOSECONDS.toMillis(Math.min(c0rh.A02, C0RH.A07));
                C2FE c2fe = (C2FE) c0rh.A04;
                C2FB c2fb2 = c2fe.A00;
                Integer num = c2fb2.A00;
                if (num != null) {
                    if (!c2fb2.A05.containsKey(num)) {
                        C2FB c2fb3 = c2fe.A00;
                        c2fb3.A05.put(c2fb3.A00, new C2FC());
                    }
                    C2FB c2fb4 = c2fe.A00;
                    C2FC c2fc = (C2FC) c2fb4.A05.get(c2fb4.A00);
                    c2fc.A02++;
                    c2fc.A00 += min2;
                    c2fc.A01 += min;
                    c2fc.A03 += millis;
                }
                if (c0rh.A04 != null) {
                    c0rh.A01 = 0.0d;
                    c0rh.A00 = 0.0d;
                    c0rh.A02 = 0L;
                } else {
                    throw null;
                }
            }
            c2fb.A00 = null;
        }
    }

    public void A02(int i) {
        C2FB c2fb = this.A01;
        if (c2fb != null) {
            C0RH c0rh = c2fb.A02;
            if (!c0rh.A05) {
                c0rh.A05 = true;
                C0RI c0ri = c0rh.A03;
                if (!c0ri.A03) {
                    c0ri.A00 = -1L;
                }
                c0ri.A03 = true;
                c0ri.A05.postFrameCallback(c0ri.A04);
                if (c0rh.A04 == null) {
                    throw null;
                }
            }
            c2fb.A00 = Integer.valueOf(i);
            if (c2fb.A04 == null) {
                throw null;
            }
        }
    }

    public void A03(Context context) {
        Boolean bool = this.A02;
        if (bool == null) {
            bool = Boolean.valueOf(new Random().nextInt(1500) == 0);
            this.A02 = bool;
            this.A00 = 1500;
        }
        if (bool.booleanValue() && this.A01 == null) {
            this.A01 = new C2FB(this.A03, this.A04, context, this.A00);
        }
    }
}
