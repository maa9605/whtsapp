package X;

import java.io.File;

/* renamed from: X.2w3  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61382w3 {
    public final long A00;
    public final long A01;
    public final File A02;
    public final byte[] A03;

    public C61382w3(File file, long j, long j2, byte[] bArr) {
        this.A02 = file;
        this.A00 = j;
        this.A01 = j2;
        this.A03 = bArr;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("DownloadResult{fileSize=");
        A0P.append(this.A00);
        A0P.append(", roundTripTime=");
        A0P.append(this.A01);
        A0P.append('}');
        return A0P.toString();
    }
}
