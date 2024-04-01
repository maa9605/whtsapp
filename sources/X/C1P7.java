package X;

import java.net.InetAddress;

/* renamed from: X.1P7  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1P7 {
    public final long A00;
    public final InetAddress A01;

    public C1P7(InetAddress inetAddress, long j) {
        this.A01 = inetAddress;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("InetAddressWithExpiry{address=");
        A0P.append(this.A01);
        A0P.append(", expireTimeMillis=");
        A0P.append(this.A00);
        A0P.append('}');
        return A0P.toString();
    }
}
