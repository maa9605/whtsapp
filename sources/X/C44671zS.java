package X;

/* renamed from: X.1zS  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44671zS extends AbstractC44611zM implements InterfaceC44621zN, InterfaceC44641zP {
    public final AbstractC005302j A00;
    public final boolean A01;

    public C44671zS(String str, AbstractC005302j abstractC005302j, boolean z, long j, C44651zQ c44651zQ, boolean z2) {
        super(j, str, 3, c44651zQ, z2, C44841zk.A03, "regular_low");
        this.A00 = abstractC005302j;
        this.A01 = z;
    }

    @Override // X.AbstractC44611zM
    public C877940o A01() {
        C0CT AVX = C20G.A02.AVX();
        boolean z = this.A01;
        AVX.A02();
        C20G c20g = (C20G) AVX.A00;
        c20g.A00 |= 1;
        c20g.A01 = z;
        C877940o A01 = super.A01();
        A01.A02();
        AnonymousClass204 anonymousClass204 = (AnonymousClass204) A01.A00;
        if (anonymousClass204 != null) {
            anonymousClass204.A0D = (C20G) AVX.A01();
            anonymousClass204.A00 |= 16;
            return A01;
        }
        throw null;
    }

    @Override // X.InterfaceC44621zN
    public AbstractC005302j A8o() {
        return this.A00;
    }

    @Override // X.InterfaceC44641zP
    public boolean AFw() {
        return !this.A01;
    }

    @Override // X.AbstractC44611zM
    public String toString() {
        StringBuilder A0P = C000200d.A0P("PinChatMutation{rowId=");
        A0P.append(this.A07);
        A0P.append(", chatJid=");
        A0P.append(this.A00);
        A0P.append(", isPinned=");
        A0P.append(this.A01);
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
