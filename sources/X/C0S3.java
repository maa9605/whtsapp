package X;

/* renamed from: X.0S3  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0S3 {
    public final Runnable A00;
    public final String A01;
    public final byte[] A02;

    public C0S3(String str, byte[] bArr, Runnable runnable) {
        this.A01 = str;
        this.A02 = bArr;
        this.A00 = runnable;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("SendFieldStats{fieldStatsBlob=");
        byte[] bArr = this.A02;
        A0P.append(bArr != null ? bArr.length : 0);
        A0P.append(" bytes");
        A0P.append(", successCallback=");
        A0P.append(this.A00);
        A0P.append(", errorCallback=");
        A0P.append((Object) null);
        A0P.append(", readErrorCallback=");
        A0P.append((Object) null);
        A0P.append('}');
        return A0P.toString();
    }
}
