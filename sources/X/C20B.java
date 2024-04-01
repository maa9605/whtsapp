package X;

/* renamed from: X.20B  reason: invalid class name */
/* loaded from: classes2.dex */
public class C20B extends AbstractC44611zM {
    public final int A00;

    public C20B(String str, long j, int i, C44651zQ c44651zQ, String str2, boolean z) {
        super(j, str, 3, c44651zQ, z, C44841zk.A03, str2);
        this.A00 = i;
    }

    @Override // X.AbstractC44611zM
    public C877940o A01() {
        C877940o A01 = super.A01();
        C0CT AVX = C20A.A02.AVX();
        int i = this.A00;
        AVX.A02();
        C20A c20a = (C20A) AVX.A00;
        c20a.A00 |= 1;
        c20a.A01 = i;
        A01.A02();
        AnonymousClass204 anonymousClass204 = (AnonymousClass204) A01.A00;
        if (anonymousClass204 != null) {
            anonymousClass204.A07 = (C20A) AVX.A01();
            anonymousClass204.A00 |= 65536;
            return A01;
        }
        throw null;
    }

    @Override // X.AbstractC44611zM
    public String toString() {
        StringBuilder A0P = C000200d.A0P("SentinelMutation{rowId=");
        A0P.append(this.A07);
        A0P.append(", expiredKeyEpoch=");
        A0P.append(this.A00);
        A0P.append(", timestamp=");
        A0P.append(this.A04);
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
