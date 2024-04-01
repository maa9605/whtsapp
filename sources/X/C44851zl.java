package X;

/* renamed from: X.1zl  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44851zl extends AbstractC44571zI {
    public final C44311yr A00;
    public final AnonymousClass012 A01;

    public C44851zl(AnonymousClass012 anonymousClass012, C44311yr c44311yr, C44351yv c44351yv) {
        super(c44351yv);
        this.A01 = anonymousClass012;
        this.A00 = c44311yr;
    }

    public void A08(C20B c20b, C20B c20b2) {
        if (c20b2 != null && c20b2.A00 > c20b.A00) {
            A05(c20b);
            return;
        }
        C44311yr c44311yr = this.A00;
        int i = c20b.A00;
        if (c44311yr != null) {
            C000200d.A0q("SyncdKeyManager/expireKeysWithEpochIfActive expiredKeyEpoch = ", i);
            C44941zu c44941zu = c44311yr.A08;
            C44961zw A01 = c44941zu.A01();
            if (A01 != null) {
                C44651zQ c44651zQ = A01.A01;
                if (c44651zQ.A02() <= i) {
                    try {
                        c44941zu.A00.A02().A02.A0D("UPDATE crypto_info SET timestamp = 0  WHERE device_id = ?  AND epoch = ? ", new String[]{String.valueOf(c44651zQ.A01()), String.valueOf(c44651zQ.A02())});
                    } finally {
                    }
                }
            }
            A07(c20b, c20b2);
            return;
        }
        throw null;
    }
}
