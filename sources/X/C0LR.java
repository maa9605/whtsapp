package X;

/* renamed from: X.0LR  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0LR extends AnonymousClass092 implements AnonymousClass099 {
    public String A00;

    public C0LR(AnonymousClass094 anonymousClass094, long j, byte b) {
        super(anonymousClass094, j, b);
        this.A01 = 0;
    }

    @Override // X.AnonymousClass092
    public String A0J() {
        return this.A00;
    }

    @Override // X.AnonymousClass092
    public void A0o(String str) {
        this.A00 = str;
    }

    @Override // X.AnonymousClass092
    public String A16() {
        return this.A00;
    }

    @Override // X.AnonymousClass092
    public void A17(String str) {
        this.A00 = str;
    }

    public void A18(C452521b c452521b) {
        AbstractC005302j abstractC005302j = this.A0n.A00;
        if (abstractC005302j != null) {
            c452521b.A06(abstractC005302j.getRawString());
            c452521b.A07(false);
            String str = this.A00;
            if (str != null) {
                c452521b.A02();
                C452421a.A0A((C452421a) c452521b.A00, str);
            }
            AbstractC005302j abstractC005302j2 = this.A0G;
            if (abstractC005302j2 != null) {
                c452521b.A05(abstractC005302j2.getRawString());
                return;
            }
            return;
        }
        throw null;
    }
}
