package X;

/* renamed from: X.20K */
/* loaded from: classes2.dex */
public class C20K extends AbstractC44611zM {
    public final String A00;

    public C20K(String str, String str2, long j, C44651zQ c44651zQ) {
        super(j, str, 3, c44651zQ, false, C44841zk.A03, "critical_block");
        this.A00 = str2;
    }

    @Override // X.AbstractC44611zM
    public C877940o A01() {
        C877940o A01 = super.A01();
        C0CT AVX = C20J.A02.AVX();
        String str = this.A00;
        AVX.A02();
        C20J c20j = (C20J) AVX.A00;
        if (str != null) {
            c20j.A00 |= 1;
            c20j.A01 = str;
            A01.A02();
            AnonymousClass204 anonymousClass204 = (AnonymousClass204) A01.A00;
            if (anonymousClass204 != null) {
                anonymousClass204.A0A = (C20J) AVX.A01();
                anonymousClass204.A00 |= 8192;
                return A01;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AbstractC44611zM
    public String toString() {
        StringBuilder A0P = C000200d.A0P("LocaleSyncMutation{rowId=");
        A0P.append(this.A07);
        A0P.append(", locale=");
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
