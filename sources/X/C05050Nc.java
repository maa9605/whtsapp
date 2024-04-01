package X;

import android.net.NetworkInfo;

/* renamed from: X.0Nc */
/* loaded from: classes.dex */
public class C05050Nc {
    public final int A00;
    public final long A01;
    public final boolean A02;
    public final boolean A03;

    public C05050Nc(boolean z, boolean z2, int i, long j) {
        this.A02 = z;
        this.A03 = z2;
        this.A00 = i;
        this.A01 = j;
    }

    public static C05050Nc A00(NetworkInfo networkInfo, long j) {
        if (networkInfo != null) {
            return new C05050Nc(networkInfo.isConnected(), networkInfo.isRoaming(), networkInfo.getType(), j);
        }
        return new C05050Nc(false, false, -1, j);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("Connectivity{connected=");
        A0P.append(this.A02);
        A0P.append(", roaming=");
        A0P.append(this.A03);
        A0P.append(", type=");
        A0P.append(this.A00);
        A0P.append(", ntpEventTimeMillis=");
        A0P.append(this.A01);
        A0P.append('}');
        return A0P.toString();
    }
}
