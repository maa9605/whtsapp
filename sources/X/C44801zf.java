package X;

/* renamed from: X.1zf  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44801zf extends AbstractC44611zM implements InterfaceC44781zd {
    public final long A00;
    public final AbstractC005302j A01;
    public final AnonymousClass094 A02;
    public final boolean A03;

    public C44801zf(String str, AnonymousClass094 anonymousClass094, boolean z, long j, long j2, C44651zQ c44651zQ, boolean z2, AbstractC005302j abstractC005302j) {
        super(j, str, 3, c44651zQ, z2, C44841zk.A03, "regular_high");
        this.A02 = anonymousClass094;
        this.A01 = abstractC005302j;
        this.A03 = z;
        this.A00 = j2;
    }

    @Override // X.AbstractC44611zM
    public C877940o A01() {
        C877940o A01 = super.A01();
        C0CT AVX = AnonymousClass209.A03.AVX();
        boolean z = this.A03;
        AVX.A02();
        AnonymousClass209 anonymousClass209 = (AnonymousClass209) AVX.A00;
        anonymousClass209.A00 |= 1;
        anonymousClass209.A02 = z;
        long j = this.A00;
        AVX.A02();
        AnonymousClass209 anonymousClass2092 = (AnonymousClass209) AVX.A00;
        anonymousClass2092.A00 |= 2;
        anonymousClass2092.A01 = j;
        A01.A02();
        AnonymousClass204 anonymousClass204 = (AnonymousClass204) A01.A00;
        if (anonymousClass204 != null) {
            anonymousClass204.A06 = (AnonymousClass209) AVX.A01();
            anonymousClass204.A00 |= 32768;
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
        return this.A02;
    }

    @Override // X.AbstractC44611zM
    public String toString() {
        StringBuilder A0P = C000200d.A0P("DeleteMessageForMeMutation{rowId=");
        A0P.append(this.A07);
        A0P.append(", key=");
        A0P.append(this.A02);
        A0P.append(", participant=");
        A0P.append(this.A01);
        A0P.append(", deleteMedia=");
        A0P.append(this.A03);
        A0P.append(", timestamp=");
        A0P.append(this.A04);
        A0P.append(", messageTimestamp=");
        A0P.append(this.A00);
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
