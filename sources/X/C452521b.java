package X;

/* renamed from: X.21b  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C452521b extends C0CT implements C0AY {
    public C452521b() {
        super(C452421a.A05);
    }

    public void A04(String str) {
        A02();
        C452421a.A0A((C452421a) this.A00, str);
    }

    public void A05(String str) {
        A02();
        C452421a c452421a = (C452421a) this.A00;
        if (str != null) {
            c452421a.A00 |= 8;
            c452421a.A02 = str;
            return;
        }
        throw null;
    }

    public void A06(String str) {
        A02();
        C452421a c452421a = (C452421a) this.A00;
        if (str != null) {
            c452421a.A00 |= 1;
            c452421a.A03 = str;
            return;
        }
        throw null;
    }

    public void A07(boolean z) {
        A02();
        C452421a c452421a = (C452421a) this.A00;
        c452421a.A00 |= 2;
        c452421a.A04 = z;
    }
}
