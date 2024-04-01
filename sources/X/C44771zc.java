package X;

/* renamed from: X.1zc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44771zc extends AbstractC44611zM implements InterfaceC44781zd, InterfaceC44641zP {
    public final AbstractC005302j A00;
    public final AnonymousClass094 A01;
    public final boolean A02;

    public C44771zc(String str, AnonymousClass094 anonymousClass094, boolean z, long j, C44651zQ c44651zQ, boolean z2, AbstractC005302j abstractC005302j) {
        super(j, str, 2, c44651zQ, z2, C44841zk.A03, "regular_high");
        this.A01 = anonymousClass094;
        this.A00 = abstractC005302j;
        this.A02 = z;
    }

    @Override // X.AbstractC44611zM
    public C877940o A01() {
        C877940o A01 = super.A01();
        C0CT AVX = C20E.A02.AVX();
        boolean z = this.A02;
        AVX.A02();
        C20E c20e = (C20E) AVX.A00;
        c20e.A00 |= 1;
        c20e.A01 = z;
        A01.A02();
        AnonymousClass204 anonymousClass204 = (AnonymousClass204) A01.A00;
        if (anonymousClass204 != null) {
            anonymousClass204.A0K = (C20E) AVX.A01();
            anonymousClass204.A00 |= 2;
            return A01;
        }
        throw null;
    }

    @Override // X.InterfaceC44781zd, X.InterfaceC44621zN
    public /* synthetic */ AbstractC005302j A8o() {
        AbstractC005302j abstractC005302j = ABG().A00;
        if (abstractC005302j != null) {
            return abstractC005302j;
        }
        throw null;
    }

    @Override // X.InterfaceC44781zd
    public AnonymousClass094 ABG() {
        return this.A01;
    }

    @Override // X.InterfaceC44641zP
    public boolean AFw() {
        return !this.A02;
    }

    @Override // X.AbstractC44611zM
    public String toString() {
        StringBuilder A0P = C000200d.A0P("StarMessageMutation{rowId=");
        A0P.append(this.A07);
        A0P.append(", key=");
        A0P.append(this.A01);
        A0P.append(", participant=");
        A0P.append(this.A00);
        A0P.append(", starred=");
        A0P.append(this.A02);
        A0P.append(", timestamp=");
        A0P.append(this.A04);
        A0P.append(", areDependenciesMissing=");
        A0P.append(A05());
        A0P.append(", operation=");
        A0P.append(this.A05);
        A0P.append(", collectionName=");
        A0P.append(this.A06);
        A0P.append(", keyId=");
        A0P.append(super.A00);
        A0P.append('}');
        return A0P.toString();
    }
}
