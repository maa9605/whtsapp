package X;

/* renamed from: X.1zU */
/* loaded from: classes2.dex */
public class C44691zU extends AbstractC44611zM implements InterfaceC44621zN, InterfaceC44631zO {
    public final C44591zK A00;
    public final AbstractC005302j A01;
    public final boolean A02;

    public C44691zU(String str, AbstractC005302j abstractC005302j, boolean z, long j, C44651zQ c44651zQ, boolean z2, C44591zK c44591zK) {
        super(j, str, 3, c44651zQ, z2, C44841zk.A03, "regular_high");
        this.A01 = abstractC005302j;
        this.A02 = z;
        this.A00 = c44591zK;
    }

    @Override // X.AbstractC44611zM
    public C877940o A01() {
        C0CT AVX = AnonymousClass207.A02.AVX();
        AnonymousClass208 A04 = this.A00.A04();
        AVX.A02();
        AnonymousClass207 anonymousClass207 = (AnonymousClass207) AVX.A00;
        if (A04 != null) {
            anonymousClass207.A01 = A04;
            anonymousClass207.A00 |= 1;
            C877940o A01 = super.A01();
            A01.A02();
            AnonymousClass204 anonymousClass204 = (AnonymousClass204) A01.A00;
            if (anonymousClass204 != null) {
                anonymousClass204.A05 = (AnonymousClass207) AVX.A01();
                anonymousClass204.A00 |= 524288;
                return A01;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.InterfaceC44621zN
    public AbstractC005302j A8o() {
        return this.A01;
    }

    @Override // X.InterfaceC44631zO
    public C44591zK ABH() {
        return this.A00;
    }

    @Override // X.AbstractC44611zM
    public String toString() {
        StringBuilder A0P = C000200d.A0P("DeleteChatMutation{rowId=");
        A0P.append(this.A07);
        A0P.append(", chatJid=");
        A0P.append(this.A01);
        A0P.append(", deleteMediaFiles=");
        A0P.append(this.A02);
        A0P.append(", messageRange=");
        A0P.append(this.A00);
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
