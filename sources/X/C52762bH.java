package X;

import java.util.UUID;

/* renamed from: X.2bH  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C52762bH {
    public Integer A00;
    public String A01;
    public final C01B A02;
    public final C02E A03;
    public final C02F A04;
    public final AnonymousClass011 A05;

    public C52762bH(AnonymousClass011 anonymousClass011, C01B c01b, C02E c02e, C02F c02f) {
        this.A05 = anonymousClass011;
        this.A02 = c01b;
        this.A03 = c02e;
        this.A04 = c02f;
    }

    public void A00() {
        if (!this.A02.A0E(C01C.A0L) || this.A01 == null) {
            return;
        }
        C09570eK c09570eK = new C09570eK();
        A01(c09570eK);
        c09570eK.A00 = 3;
        this.A05.A0B(c09570eK, null, false);
        this.A01 = null;
        this.A00 = null;
    }

    public final void A01(C09570eK c09570eK) {
        c09570eK.A03 = this.A01;
        c09570eK.A01 = this.A00;
        Integer A0B = C23X.A0B(this.A03, this.A04);
        if (A0B != null) {
            c09570eK.A02 = Long.valueOf(A0B.longValue());
        }
    }

    public void A02(boolean z, int i) {
        if (this.A02.A0E(C01C.A0L)) {
            this.A01 = UUID.randomUUID().toString();
            this.A00 = Integer.valueOf(i);
            C09570eK c09570eK = new C09570eK();
            A01(c09570eK);
            c09570eK.A00 = Integer.valueOf(z ? 1 : 2);
            this.A05.A0B(c09570eK, null, false);
        }
    }
}
