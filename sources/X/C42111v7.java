package X;

import com.whatsapp.util.Log;

/* renamed from: X.1v7  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C42111v7 implements InterfaceC007103c {
    public static C469829b A00() {
        C469829b A00 = C469829b.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    public static C470129e A01() {
        if (C470129e.A0M == null) {
            synchronized (C470129e.class) {
                if (C470129e.A0M == null) {
                    C470129e.A0M = new C470129e(C001200o.A01, C002801j.A00(), C002301c.A00(), C0E7.A00(), C000500h.A00(), C005102h.A00(), C000800k.A02, C469829b.A00());
                }
            }
        }
        C470129e c470129e = C470129e.A0M;
        C02180Ae.A1B(c470129e);
        return c470129e;
    }

    public static C42171vH A02() {
        C42171vH A00 = C42171vH.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    public static C455822q A03() {
        C455822q A00 = C455822q.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    public static C47212Ai A04() {
        C47212Ai A00 = C47212Ai.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    public static C2MQ A05() {
        C2MQ c2mq;
        synchronized (C2MQ.class) {
            if (C2MQ.A09 == null) {
                int A07 = C01B.A00().A07(C01C.A32);
                if (A07 == 1) {
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C01H.A00();
                    C2MQ.A09 = new C53712hO(A00, C455822q.A00(), C004902f.A00(), C002801j.A00(), AnonymousClass011.A00(), C002301c.A00(), new C50212Qr(C02E.A00()));
                } else if (A07 == 2) {
                    AnonymousClass012 A002 = AnonymousClass012.A00();
                    C01H.A00();
                    C2MQ.A09 = new C53702hN(A002, C455822q.A00(), C004902f.A00(), C002801j.A00(), AnonymousClass011.A00(), C002301c.A00(), new C50212Qr(C02E.A00()));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected value of gif_provider server prop ");
                    sb.append(A07);
                    Log.e(sb.toString());
                    AnonymousClass012 A003 = AnonymousClass012.A00();
                    C01H.A00();
                    C2MQ.A09 = new C53702hN(A003, C455822q.A00(), C004902f.A00(), C002801j.A00(), AnonymousClass011.A00(), C002301c.A00(), new C50212Qr(C02E.A00()));
                }
            }
            c2mq = C2MQ.A09;
        }
        C02180Ae.A1B(c2mq);
        return c2mq;
    }

    public static C00Y A06() {
        C00Y c00y = C00Y.A00;
        if (c00y != null) {
            C02180Ae.A1B(c00y);
            return c00y;
        }
        throw null;
    }

    public static C2AX A07() {
        C2AX A00 = C2AX.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    public static C42121v8 A08() {
        if (C42121v8.A0E == null) {
            synchronized (C42121v8.class) {
                if (C42121v8.A0E == null) {
                    C42121v8.A0E = new C42121v8(AnonymousClass012.A00(), C003701t.A00(), C001200o.A01, AnonymousClass011.A00(), C01B.A00(), C40291rx.A00(), C470029d.A00(), C26X.A00(), C47872Cx.A03, C462526a.A00(), C2Aa.A00(), C000500h.A00(), C41461tx.A00(), C41901uh.A00());
                }
            }
        }
        C42121v8 c42121v8 = C42121v8.A0E;
        C02180Ae.A1B(c42121v8);
        return c42121v8;
    }

    public static C42161vG A09() {
        C42161vG A00 = C42161vG.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    public static C2MH A0A() {
        if (C2MH.A06 == null) {
            synchronized (C2MH.class) {
                if (C2MH.A06 == null) {
                    C2MH.A06 = new C2MH(C018508q.A00(), C03230Ew.A00(), C02E.A00(), C000500h.A00(), C0DV.A00(), C0DW.A00());
                }
            }
        }
        C2MH c2mh = C2MH.A06;
        C02180Ae.A1B(c2mh);
        return c2mh;
    }
}
