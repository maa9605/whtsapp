package X;

import java.util.Random;

/* renamed from: X.2Lw  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2Lw {
    public static volatile C2Lw A05;
    public long A00;
    public AnonymousClass012 A01;
    public String A02;
    public Random A03 = new Random();
    public final C014406v A04 = C014406v.A00("PaymentFieldStats", "notification", "COMMON");

    public C2Lw(AnonymousClass012 anonymousClass012) {
        this.A01 = anonymousClass012;
    }

    public static C2Lw A00() {
        if (A05 == null) {
            synchronized (C2Lw.class) {
                if (A05 == null) {
                    A05 = new C2Lw(AnonymousClass012.A00());
                }
            }
        }
        return A05;
    }

    public long A01() {
        if (this.A00 > 0) {
            return this.A01.A05() - this.A00;
        }
        return -1L;
    }

    public String A02() {
        byte[] bArr = new byte[8];
        this.A03.nextBytes(bArr);
        String A03 = C02A.A03(bArr);
        this.A02 = A03;
        return A03;
    }

    public void A03() {
        this.A02 = null;
        this.A00 = 0L;
    }

    public void A04() {
        this.A04.A07(null, "PaymentWamEvent timer reset.", null);
        this.A00 = this.A01.A05();
    }
}
