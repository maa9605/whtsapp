package X;

import android.os.SystemClock;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: X.2EQ */
/* loaded from: classes2.dex */
public class C2EQ {
    public static volatile C2EQ A0A;
    public C48242Em A00;
    public C48252En A01;
    public final C0IZ A02;
    public final AnonymousClass012 A03;
    public final C0ED A04;
    public final AnonymousClass011 A05;
    public final C43131wu A06;
    public final InterfaceC002901k A07;
    public final Random A09 = new Random();
    public final LinkedHashMap A08 = new LinkedHashMap<AnonymousClass094, Long>() { // from class: X.2Ek
        {
            C2EQ.this = this;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<AnonymousClass094, Long> entry) {
            return ((long) size()) > 240;
        }
    };

    public C2EQ(AnonymousClass012 anonymousClass012, InterfaceC002901k interfaceC002901k, AnonymousClass011 anonymousClass011, C0ED c0ed, C43131wu c43131wu, C03020Dv c03020Dv) {
        C0IZ c0iz = new C0IZ() { // from class: X.2El
            @Override // X.C0IZ
            public void AHH() {
            }

            {
                C2EQ.this = this;
            }

            @Override // X.C0IZ
            public void AHG() {
                C2EQ.this.A02();
            }
        };
        this.A02 = c0iz;
        this.A03 = anonymousClass012;
        this.A07 = interfaceC002901k;
        this.A05 = anonymousClass011;
        this.A04 = c0ed;
        this.A06 = c43131wu;
        c03020Dv.A01(c0iz);
    }

    public static C2EQ A00() {
        if (A0A == null) {
            synchronized (C2EQ.class) {
                if (A0A == null) {
                    A0A = new C2EQ(AnonymousClass012.A00(), C002801j.A00(), AnonymousClass011.A00(), C0ED.A01(), C43131wu.A00(), C03020Dv.A00());
                }
            }
        }
        return A0A;
    }

    public final long A01() {
        C48242Em c48242Em = this.A00;
        if (c48242Em == null) {
            return 0L;
        }
        return c48242Em.A05;
    }

    public void A02() {
        C48242Em c48242Em = this.A00;
        if (c48242Em != null) {
            C05950Qy c05950Qy = new C05950Qy();
            c05950Qy.A02 = Long.valueOf(c48242Em.A05);
            c05950Qy.A04 = Long.valueOf(SystemClock.elapsedRealtime() - c48242Em.A06);
            c05950Qy.A05 = Long.valueOf(c48242Em.A03);
            c05950Qy.A03 = Long.valueOf(c48242Em.A02);
            int i = c48242Em.A00;
            if (i != 0) {
                c05950Qy.A01 = Integer.valueOf(i);
            }
            int i2 = c48242Em.A01;
            if (i2 != 0) {
                c05950Qy.A00 = Integer.valueOf(i2);
            }
            this.A05.A09(c05950Qy, 1);
            AnonymousClass011.A01(c05950Qy, "");
            this.A00 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0008, code lost:
        if (r0.A04 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03(int r5) {
        /*
            r4 = this;
            X.2Em r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.A04
            r1 = 1
            if (r0 == 0) goto Lb
        La:
            r1 = 0
        Lb:
            java.lang.String r0 = "Report tab open only once per session"
            X.C000700j.A08(r1, r0)
            X.0Qz r2 = new X.0Qz
            r2.<init>()
            long r0 = r4.A01()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A01 = r0
            long r0 = (long) r5
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A00 = r0
            X.011 r0 = r4.A05
            r0.A09(r2, r3)
            java.lang.String r0 = ""
            X.AnonymousClass011.A01(r2, r0)
            X.2Em r0 = r4.A00
            if (r0 == 0) goto L36
            r0.A04 = r3
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2EQ.A03(int):void");
    }

    public void A04(AnonymousClass092 anonymousClass092, int i) {
        Object of;
        C48272Ep c48272Ep;
        C0R0 c0r0 = new C0R0();
        c0r0.A01 = Long.valueOf(A01());
        c0r0.A00 = Integer.valueOf(i);
        this.A05.A09(c0r0, 1);
        AnonymousClass011.A01(c0r0, "");
        if (i == 1) {
            C48242Em c48242Em = this.A00;
            if (c48242Em != null) {
                c48242Em.A02++;
            }
            C48252En c48252En = this.A01;
            if (c48252En != null) {
                Map map = c48252En.A0A;
                AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
                if (anonymousClass094.A02) {
                    of = C011405q.A00;
                } else {
                    of = UserJid.of(anonymousClass092.A0A());
                }
                C48262Eo c48262Eo = (C48262Eo) map.get(of);
                if (c48262Eo == null || (c48272Ep = (C48272Ep) c48262Eo.A07.get(anonymousClass094)) == null) {
                    return;
                }
                c48272Ep.A01++;
            }
        }
    }

    public void A05(AnonymousClass092 anonymousClass092, long j, int i) {
        C0R1 c0r1 = new C0R1();
        c0r1.A04 = Long.valueOf(A01());
        c0r1.A00 = Integer.valueOf(C0E3.A04(anonymousClass092, this.A04));
        c0r1.A03 = Long.valueOf(j);
        int i2 = anonymousClass092.A04;
        int i3 = 3;
        if (i2 != 3) {
            i3 = 4;
            if (i2 == 4) {
                i3 = 1;
            } else if (i2 == 5) {
                i3 = 2;
            }
        }
        c0r1.A01 = Integer.valueOf(i3);
        c0r1.A02 = Integer.valueOf(i);
        this.A05.A09(c0r1, 1);
        AnonymousClass011.A01(c0r1, "");
    }

    public void A06(List list) {
        C0R2 c0r2 = new C0R2();
        c0r2.A01 = 0L;
        c0r2.A03 = 0L;
        c0r2.A00 = 0L;
        c0r2.A02 = 0L;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0Hr c0Hr = (C0Hr) it.next();
            if (!C011405q.A03(c0Hr.A0A)) {
                c0r2.A01 = C000200d.A04(c0r2.A01);
                int i = c0Hr.A00;
                int i2 = c0Hr.A01;
                if (i != i2) {
                    c0r2.A03 = C000200d.A04(c0r2.A03);
                }
                c0r2.A00 = Long.valueOf(c0r2.A00.longValue() + i);
                c0r2.A02 = Long.valueOf(c0r2.A02.longValue() + (i - i2));
            }
        }
        this.A05.A09(c0r2, 1);
        AnonymousClass011.A01(c0r2, "");
    }

    public void A07(List list, List list2, List list3) {
        C48242Em c48242Em = this.A00;
        if (c48242Em != null) {
            this.A01 = new C48252En(this.A03, this.A04, c48242Em.A05, this.A09.nextLong(), list, list2, list3, this.A08);
        }
    }
}
