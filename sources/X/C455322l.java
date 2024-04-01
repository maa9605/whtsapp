package X;

/* renamed from: X.22l */
/* loaded from: classes2.dex */
public class C455322l {
    public static volatile C455322l A04;
    public final C01B A00;
    public final C02E A01;
    public final C43111ws A02;
    public final C02O A03;

    public C455322l(C01B c01b, C02E c02e, C43111ws c43111ws, C02O c02o) {
        this.A00 = c01b;
        this.A01 = c02e;
        this.A02 = c43111ws;
        this.A03 = c02o;
    }

    public static C455322l A00() {
        if (A04 == null) {
            synchronized (C455322l.class) {
                if (A04 == null) {
                    A04 = new C455322l(C01B.A00(), C02E.A00(), C43111ws.A01(), C02O.A00());
                }
            }
        }
        return A04;
    }

    public C454522c A01(byte b, boolean z) {
        if (b == 1 || b == 23 || b == 37 || b == 42) {
            C454522c A02 = A02(z);
            if (!z) {
                C01B c01b = this.A00;
                if (c01b.A0E(C01C.A19)) {
                    int A07 = c01b.A07(C01C.A38);
                    int A072 = c01b.A07(C01C.A39);
                    if (500 <= A07 && A07 <= 4000 && 20 <= A072 && A072 <= 100 && AnonymousClass029.A07(this.A03, this.A01) >= 2013 && A03(0)) {
                        return new C454522c(c01b.A07(C01C.A3B), A072, A07, A02.A00);
                    }
                }
            }
            return A02;
        }
        return null;
    }

    public final C454522c A02(boolean z) {
        C01B c01b = this.A00;
        if (z) {
            return new C454522c(c01b.A07(C01C.A3B), c01b.A07(C01C.A3v), c01b.A07(C01C.A3u));
        }
        return new C454522c(c01b.A07(C01C.A3B), c01b.A07(C01C.A3C), c01b.A07(C01C.A3A));
    }

    public final boolean A03(int i) {
        Float A02 = this.A02.A02(i);
        if (A02 != null) {
            float floatValue = A02.floatValue();
            if (floatValue > 20.0f) {
                return i != 0 ? i == 1 && floatValue >= ((float) this.A00.A07(C01C.A3e)) : floatValue >= ((float) this.A00.A07(C01C.A37));
            }
            return false;
        }
        return false;
    }
}
