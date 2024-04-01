package X;

/* renamed from: X.0PO  reason: invalid class name */
/* loaded from: classes.dex */
public class C0PO extends C0PJ {
    public long mobileBytesRx;
    public long mobileBytesTx;
    public long wifiBytesRx;
    public long wifiBytesTx;

    @Override // X.C0PJ
    public C0PJ A00(C0PJ c0pj) {
        C0PO c0po = (C0PO) c0pj;
        this.mobileBytesRx = c0po.mobileBytesRx;
        this.mobileBytesTx = c0po.mobileBytesTx;
        this.wifiBytesRx = c0po.wifiBytesRx;
        this.wifiBytesTx = c0po.wifiBytesTx;
        return this;
    }

    @Override // X.C0PJ
    public C0PJ A01(C0PJ c0pj, C0PJ c0pj2) {
        C0PO c0po = (C0PO) c0pj;
        C0PO c0po2 = (C0PO) c0pj2;
        if (c0po2 == null) {
            c0po2 = new C0PO();
        }
        if (c0po == null) {
            c0po2.mobileBytesRx = this.mobileBytesRx;
            c0po2.mobileBytesTx = this.mobileBytesTx;
            c0po2.wifiBytesRx = this.wifiBytesRx;
            c0po2.wifiBytesTx = this.wifiBytesTx;
            return c0po2;
        }
        c0po2.mobileBytesTx = this.mobileBytesTx - c0po.mobileBytesTx;
        c0po2.mobileBytesRx = this.mobileBytesRx - c0po.mobileBytesRx;
        c0po2.wifiBytesTx = this.wifiBytesTx - c0po.wifiBytesTx;
        c0po2.wifiBytesRx = this.wifiBytesRx - c0po.wifiBytesRx;
        return c0po2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0PO.class != obj.getClass()) {
            return false;
        }
        C0PO c0po = (C0PO) obj;
        return this.mobileBytesTx == c0po.mobileBytesTx && this.mobileBytesRx == c0po.mobileBytesRx && this.wifiBytesTx == c0po.wifiBytesTx && this.wifiBytesRx == c0po.wifiBytesRx;
    }

    public int hashCode() {
        long j = this.mobileBytesTx;
        long j2 = this.mobileBytesRx;
        long j3 = this.wifiBytesTx;
        long j4 = this.wifiBytesRx;
        return (((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("NetworkMetrics{mobileBytesTx=");
        A0P.append(this.mobileBytesTx);
        A0P.append(", mobileBytesRx=");
        A0P.append(this.mobileBytesRx);
        A0P.append(", wifiBytesTx=");
        A0P.append(this.wifiBytesTx);
        A0P.append(", wifiBytesRx=");
        A0P.append(this.wifiBytesRx);
        A0P.append('}');
        return A0P.toString();
    }
}
