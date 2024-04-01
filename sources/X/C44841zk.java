package X;

import java.util.Arrays;

/* renamed from: X.1zk  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44841zk {
    public final EnumC458824c A00;
    public final byte[] A01;
    public static final C44841zk A03 = new C44841zk(new byte[]{1}, EnumC458824c.SET);
    public static final C44841zk A02 = new C44841zk(new byte[]{2}, EnumC458824c.REMOVE);

    public C44841zk(byte[] bArr, EnumC458824c enumC458824c) {
        this.A01 = bArr;
        this.A00 = enumC458824c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C44841zk) {
            C44841zk c44841zk = (C44841zk) obj;
            return Arrays.equals(this.A01, c44841zk.A01) && this.A00 == c44841zk.A00;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.A01) + (Arrays.hashCode(new Object[]{this.A00}) * 31);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("SyncdOperation{bytes=");
        A0P.append(Arrays.toString(this.A01));
        A0P.append(", syncdOperation=");
        A0P.append(this.A00);
        A0P.append('}');
        return A0P.toString();
    }
}
