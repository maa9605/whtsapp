package X;

/* renamed from: X.1zY */
/* loaded from: classes2.dex */
public class C44731zY extends AbstractC44611zM implements InterfaceC44621zN, InterfaceC44641zP {
    public final long A00;
    public final AbstractC005302j A01;
    public final boolean A02;

    public C44731zY(String str, AbstractC005302j abstractC005302j, boolean z, C44651zQ c44651zQ, boolean z2, long j, long j2) {
        super(j2, str, 2, c44651zQ, z2, C44841zk.A03, "regular_high");
        this.A01 = abstractC005302j;
        this.A02 = z;
        this.A00 = j;
    }

    @Override // X.AbstractC44611zM
    public C877940o A01() {
        C0CT AVX = C20F.A03.AVX();
        boolean z = this.A02;
        AVX.A02();
        C20F c20f = (C20F) AVX.A00;
        c20f.A00 |= 1;
        c20f.A02 = z;
        if (z) {
            long j = this.A00;
            AVX.A02();
            C20F c20f2 = (C20F) AVX.A00;
            c20f2.A00 |= 2;
            c20f2.A01 = j;
        }
        C877940o A01 = super.A01();
        A01.A02();
        AnonymousClass204 anonymousClass204 = (AnonymousClass204) A01.A00;
        if (anonymousClass204 != null) {
            anonymousClass204.A0C = (C20F) AVX.A01();
            anonymousClass204.A00 |= 8;
            return A01;
        }
        throw null;
    }

    @Override // X.InterfaceC44621zN
    public AbstractC005302j A8o() {
        return this.A01;
    }

    @Override // X.InterfaceC44641zP
    public boolean AFw() {
        return !this.A02;
    }

    @Override // X.AbstractC44611zM
    public String toString() {
        StringBuilder A0P = C000200d.A0P("MuteChatMutation{rowId=");
        A0P.append(this.A07);
        A0P.append(", chatJid=");
        A0P.append(this.A01);
        A0P.append(", muteEndTimestamp=");
        A0P.append(this.A00);
        A0P.append(", isMuted=");
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
