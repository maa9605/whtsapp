package X;

/* renamed from: X.1zp  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44891zp extends AbstractC44611zM {
    public final String A00;

    public C44891zp(String str, String str2, long j, C44651zQ c44651zQ) {
        super(j, str, 1, c44651zQ, false, C44841zk.A03, "critical_block");
        this.A00 = str2;
    }

    @Override // X.AbstractC44611zM
    public C877940o A01() {
        C0CT AVX = C20D.A02.AVX();
        String str = this.A00;
        AVX.A02();
        C20D c20d = (C20D) AVX.A00;
        if (str != null) {
            c20d.A00 |= 1;
            c20d.A01 = str;
            C877940o A01 = super.A01();
            A01.A02();
            AnonymousClass204 anonymousClass204 = (AnonymousClass204) A01.A00;
            if (anonymousClass204 != null) {
                anonymousClass204.A0E = (C20D) AVX.A01();
                anonymousClass204.A00 |= 64;
                return A01;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AbstractC44611zM
    public String toString() {
        StringBuilder A0P = C000200d.A0P("PushNameSettingMutation{rowId=");
        A0P.append(this.A07);
        A0P.append(", pushName=");
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
