package X;

/* renamed from: X.2Ea  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C48152Ea extends C03950Hv {
    public final String A00;

    public C48152Ea(AbstractC005302j abstractC005302j, String str, boolean z) {
        super(abstractC005302j, 1, 0L, 0L);
        this.A00 = str;
        this.A0A = z;
    }

    public C48152Ea(AbstractC005302j abstractC005302j, boolean z) {
        super(abstractC005302j, 1, 0L, 0L);
        this.A00 = null;
        this.A0A = z;
    }

    @Override // X.C03950Hv
    public C03950Hv A00() {
        return new C48152Ea(this.A06, this.A00, this.A0A);
    }
}
