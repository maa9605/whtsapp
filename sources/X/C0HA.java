package X;

import android.net.NetworkInfo;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;

/* renamed from: X.0HA */
/* loaded from: classes.dex */
public class C0HA {
    public static volatile C0HA A0G;
    public WamCall A00;
    public final AbstractC000600i A01;
    public final C02L A02;
    public final C01B A03;
    public final C02E A04;
    public final AnonymousClass012 A05;
    public final C001200o A06;
    public final C000500h A07;
    public final C0ED A08;
    public final C003701t A09;
    public final C006202t A0A;
    public final AnonymousClass011 A0B;
    public final C010605h A0C;
    public final C0EE A0D;
    public final C02O A0E;
    public final InterfaceC002901k A0F;

    public C0HA(C001200o c001200o, AnonymousClass012 anonymousClass012, C003701t c003701t, AbstractC000600i abstractC000600i, C02L c02l, InterfaceC002901k interfaceC002901k, AnonymousClass011 anonymousClass011, C01B c01b, C0ED c0ed, C02E c02e, C0EE c0ee, C006202t c006202t, C000500h c000500h, C02O c02o, C010605h c010605h) {
        this.A06 = c001200o;
        this.A05 = anonymousClass012;
        this.A09 = c003701t;
        this.A01 = abstractC000600i;
        this.A02 = c02l;
        this.A0F = interfaceC002901k;
        this.A0B = anonymousClass011;
        this.A03 = c01b;
        this.A08 = c0ed;
        this.A04 = c02e;
        this.A0D = c0ee;
        this.A0A = c006202t;
        this.A07 = c000500h;
        this.A0E = c02o;
        this.A0C = c010605h;
    }

    public static C0HA A00() {
        if (A0G == null) {
            synchronized (C0HA.class) {
                if (A0G == null) {
                    A0G = new C0HA(C001200o.A01, AnonymousClass012.A00(), C003701t.A00(), AbstractC000600i.A00(), C02L.A00(), C002801j.A00(), AnonymousClass011.A00(), C01B.A00(), C0ED.A01(), C02E.A00(), C0EE.A00(), C006202t.A00(), C000500h.A00(), C02O.A00(), C010605h.A03);
                }
            }
        }
        return A0G;
    }

    public static Integer A01(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return null;
        }
        int type = networkInfo.getType();
        int subtype = networkInfo.getSubtype();
        if (type != 0) {
            return type == 1 ? 1 : null;
        }
        switch (subtype) {
            case 1:
                return 104;
            case 2:
                return 100;
            case 3:
                return 102;
            case 4:
                return Integer.valueOf((int) C0M6.A03);
            case 5:
            case 6:
            case 12:
                return 103;
            case 7:
                return 109;
            case 8:
                return 105;
            case 9:
                return 106;
            case 10:
                return 107;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                return 101;
            case 13:
                return 111;
            case 14:
                return 110;
            case 15:
                return 112;
            default:
                return 0;
        }
    }

    public void A02(int i, int i2, Long l, Double d) {
        C37351mH c37351mH = new C37351mH();
        c37351mH.A01 = Integer.valueOf(i);
        c37351mH.A02 = Integer.valueOf(i2);
        c37351mH.A00 = d;
        c37351mH.A03 = l;
        this.A0B.A0B(c37351mH, null, false);
    }

    public void A03(int i, long j) {
        C37601mg c37601mg = new C37601mg();
        c37601mg.A00 = Integer.valueOf(i);
        c37601mg.A01 = Long.valueOf(j);
        AnonymousClass011 anonymousClass011 = this.A0B;
        anonymousClass011.A0B(c37601mg, null, false);
        C01B c01b = this.A03;
        if (c01b.A0E(C01C.A2a)) {
            C37611mh c37611mh = new C37611mh();
            c37611mh.A00 = Boolean.valueOf(this.A0C.A03());
            anonymousClass011.A0B(c37611mh, null, false);
        }
        if (!c01b.A0E(C01C.A09) && !this.A09.A0C(241)) {
            anonymousClass011.A0D(false);
            return;
        }
        anonymousClass011.A0D(true);
        int A07 = c01b.A07(C01C.A0E);
        synchronized (anonymousClass011) {
            anonymousClass011.A0J = A07;
        }
        C37671mn c37671mn = new C37671mn();
        c37671mn.A00 = Boolean.valueOf(this.A0C.A03());
        anonymousClass011.A0B(c37671mn, null, false);
    }

    public void A04(int i, long j, long j2, boolean z) {
        C37381mK c37381mK = new C37381mK();
        c37381mK.A02 = Integer.valueOf(i);
        c37381mK.A01 = Double.valueOf(Math.round(j / 1000.0d) * 1000);
        c37381mK.A04 = Long.valueOf(Math.round(j2 / 1000.0d));
        c37381mK.A00 = Boolean.valueOf(z);
        c37381mK.A03 = 0;
        this.A0B.A09(c37381mK, 1);
        AnonymousClass011.A01(c37381mK, "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x000b, code lost:
        if (r6.getType() != 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A05(android.net.NetworkInfo r6) {
        /*
            r5 = this;
            X.02t r4 = r5.A0A
            r3 = 0
            r2 = 1
            if (r6 == 0) goto Ld
            int r1 = r6.getType()
            r0 = 1
            if (r1 == r2) goto Le
        Ld:
            r0 = 0
        Le:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 23
            r4.A03(r0, r1, r3)
            r4.A03(r0, r1, r2)
            java.lang.Integer r1 = A01(r6)
            r0 = 105(0x69, float:1.47E-43)
            r4.A03(r0, r1, r3)
            r4.A03(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HA.A05(android.net.NetworkInfo):void");
    }

    public void A06(WamCall wamCall, boolean z) {
        this.A00 = wamCall;
        AnonymousClass011 anonymousClass011 = this.A0B;
        anonymousClass011.A09(wamCall, 1);
        AnonymousClass011.A01(wamCall, "");
        if (z) {
            anonymousClass011.A03();
        }
    }

    public void A07(AnonymousClass092 anonymousClass092, int i) {
        Integer num;
        Integer num2;
        C37321mE c37321mE = new C37321mE();
        c37321mE.A02 = Integer.valueOf(i);
        AbstractC005302j abstractC005302j = anonymousClass092.A0n.A00;
        if (C003101m.A0U(abstractC005302j)) {
            num = 2;
        } else if (C003101m.A0Z(abstractC005302j)) {
            num = 3;
        } else if (C003101m.A0Q(abstractC005302j)) {
            num = 4;
        } else {
            num = 1;
        }
        c37321mE.A03 = Integer.valueOf(num.intValue());
        c37321mE.A05 = Long.valueOf(this.A05.A05() - anonymousClass092.A0C);
        byte b = anonymousClass092.A0m;
        if (b == 11) {
            num2 = 1;
        } else if (b == 31) {
            num2 = 2;
        } else {
            num2 = 0;
        }
        c37321mE.A04 = Integer.valueOf(num2.intValue());
        c37321mE.A01 = Integer.valueOf(C0E3.A03(anonymousClass092));
        c37321mE.A00 = Integer.valueOf(C0E3.A04(anonymousClass092, this.A08));
        this.A0B.A09(c37321mE, 1);
        AnonymousClass011.A01(c37321mE, "");
    }

    public void A08(boolean z, int i) {
        int i2;
        C36861lU c36861lU = new C36861lU();
        if (z) {
            i2 = 1;
        } else {
            i2 = 2;
            if (i > 1) {
                i2 = 3;
            }
        }
        c36861lU.A00 = Integer.valueOf(i2);
        c36861lU.A01 = Long.valueOf(i);
        this.A0B.A09(c36861lU, 1);
        AnonymousClass011.A01(c36861lU, "");
    }
}
