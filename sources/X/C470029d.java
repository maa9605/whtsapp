package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.29d  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C470029d {
    public static volatile C470029d A0E;
    public C0TL A00;
    public C0PI A01;
    public boolean A03;
    public final AbstractC000600i A07;
    public final C01B A08;
    public final C0EL A09;
    public final C003701t A0A;
    public final AnonymousClass011 A0B;
    public final C02O A0C;
    public final ExecutorC004702d A0D;
    public boolean A04 = false;
    public AtomicInteger A02 = new AtomicInteger();
    public boolean[] A06 = new boolean[6];
    public boolean[] A05 = new boolean[6];

    public C470029d(AbstractC000600i abstractC000600i, C003701t c003701t, AnonymousClass011 anonymousClass011, C0EL c0el, C01B c01b, ExecutorC004702d executorC004702d, C02O c02o) {
        this.A07 = abstractC000600i;
        this.A0A = c003701t;
        this.A0B = anonymousClass011;
        this.A09 = c0el;
        this.A08 = c01b;
        this.A0D = executorC004702d;
        this.A0C = c02o;
    }

    public static C470029d A00() {
        if (A0E == null) {
            synchronized (C470029d.class) {
                if (A0E == null) {
                    A0E = new C470029d(AbstractC000600i.A00(), C003701t.A00(), AnonymousClass011.A00(), C0EL.A00(), C01B.A00(), new ExecutorC004702d(C002801j.A00(), false), C02O.A00());
                }
            }
        }
        return A0E;
    }

    public void A01(int i, boolean z) {
        this.A0D.execute(new C2CX(this, i, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A02(java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C470029d.A02(java.lang.String):void");
    }
}
