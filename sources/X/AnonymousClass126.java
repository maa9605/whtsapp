package X;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: X.126 */
/* loaded from: classes.dex */
public final class AnonymousClass126 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final Uri A05;
    public final String A06;
    public final byte[] A07;
    public final byte[] A08;

    public AnonymousClass126(Uri uri, long j, long j2) {
        this(uri, null, j, j, j2, null, 0);
    }

    public AnonymousClass126(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = true;
        int i2 = bArr != null ? 2 : 1;
        C002701i.A1J(j >= 0);
        C002701i.A1J(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        C002701i.A1J(z);
        this.A05 = uri;
        this.A01 = i2;
        bArr = (bArr == null || bArr.length == 0) ? null : null;
        this.A07 = bArr;
        this.A08 = bArr;
        this.A02 = j;
        this.A04 = j2;
        this.A03 = j3;
        this.A06 = str;
        this.A00 = i;
    }

    public String toString() {
        String str;
        StringBuilder A0P = C000200d.A0P("DataSpec[");
        int i = this.A01;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else if (i != 3) {
            throw new AssertionError(i);
        } else {
            str = "HEAD";
        }
        A0P.append(str);
        A0P.append(" ");
        A0P.append(this.A05);
        A0P.append(", ");
        A0P.append(Arrays.toString(this.A07));
        A0P.append(", ");
        A0P.append(this.A02);
        A0P.append(", ");
        A0P.append(this.A04);
        A0P.append(", ");
        A0P.append(this.A03);
        A0P.append(", ");
        A0P.append(this.A06);
        A0P.append(", ");
        return C000200d.A0K(A0P, this.A00, "]");
    }
}
