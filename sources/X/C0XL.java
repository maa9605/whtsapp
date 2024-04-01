package X;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* renamed from: X.0XL  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0XL implements HostnameVerifier {
    public final String A00;
    public final HostnameVerifier A01;

    public C0XL(String str, HostnameVerifier hostnameVerifier) {
        this.A00 = str;
        this.A01 = hostnameVerifier;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0XL.class != obj.getClass()) {
            return false;
        }
        C0XL c0xl = (C0XL) obj;
        if (this.A00.equals(c0xl.A00)) {
            return this.A01.equals(c0xl.A01);
        }
        return false;
    }

    public int hashCode() {
        return this.A01.hashCode() + (this.A00.hashCode() * 31);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        return this.A01.verify(this.A00, sSLSession);
    }
}
