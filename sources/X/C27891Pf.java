package X;

import com.whatsapp.net.tls13.WtCachedPsk;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionBindingEvent;
import javax.net.ssl.SSLSessionBindingListener;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.CertificateException;
import javax.security.cert.X509Certificate;

/* renamed from: X.1Pf  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C27891Pf implements SSLSession {
    public int A00;
    public long A01;
    public long A02;
    public WtCachedPsk A03;
    public C03I A04;
    public String A05;
    public String A06;
    public byte[] A0A;
    public Certificate[] A0B;
    public final Map A0C = new HashMap();
    public Map A08 = new HashMap();
    public LinkedHashSet A07 = new LinkedHashSet();
    public boolean A09 = true;

    @Override // javax.net.ssl.SSLSession
    public int getApplicationBufferSize() {
        return 16384;
    }

    @Override // javax.net.ssl.SSLSession
    public Certificate[] getLocalCertificates() {
        return null;
    }

    @Override // javax.net.ssl.SSLSession
    public Principal getLocalPrincipal() {
        return null;
    }

    @Override // javax.net.ssl.SSLSession
    public int getPacketBufferSize() {
        return 16645;
    }

    @Override // javax.net.ssl.SSLSession
    public final String getProtocol() {
        return "TLSv1.3";
    }

    public C27891Pf(C03I c03i, String str, int i, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        this.A02 = currentTimeMillis;
        this.A01 = currentTimeMillis;
        this.A04 = c03i;
        this.A06 = str;
        this.A00 = i;
        this.A05 = str2;
        this.A0A = C40841sx.A0p(str, i, str2);
    }

    public Byte A00() {
        Certificate[] certificateArr = this.A0B;
        if (certificateArr == null) {
            return null;
        }
        byte b = 0;
        for (Certificate certificate : certificateArr) {
            for (byte b2 : certificate.getPublicKey().getEncoded()) {
                b = (byte) (b ^ b2);
            }
        }
        return Byte.valueOf(b);
    }

    public void A01(Certificate[] certificateArr) {
        if (certificateArr != null) {
            this.A0B = (Certificate[]) certificateArr.clone();
        } else {
            this.A0B = null;
        }
    }

    @Override // javax.net.ssl.SSLSession
    public String getCipherSuite() {
        return this.A05;
    }

    @Override // javax.net.ssl.SSLSession
    public long getCreationTime() {
        return this.A01;
    }

    @Override // javax.net.ssl.SSLSession
    public byte[] getId() {
        byte[] bArr = this.A0A;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        return null;
    }

    @Override // javax.net.ssl.SSLSession
    public long getLastAccessedTime() {
        return this.A02;
    }

    @Override // javax.net.ssl.SSLSession
    public X509Certificate[] getPeerCertificateChain() {
        Certificate[] certificateArr = this.A0B;
        if (certificateArr != null && (r7 = certificateArr.length) != 0) {
            ArrayList arrayList = new ArrayList();
            for (Certificate certificate : certificateArr) {
                try {
                    arrayList.add(X509Certificate.getInstance(certificate.getEncoded()));
                } catch (CertificateEncodingException | CertificateException e) {
                    EnumC68813Ma enumC68813Ma = EnumC68813Ma.DEBUG;
                    StringBuilder sb = new StringBuilder("Could not parse certificates. Exception ");
                    sb.append(e);
                    C3MZ.A00(enumC68813Ma, sb.toString());
                }
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[0]);
        }
        throw new SSLPeerUnverifiedException("No peer certificates found");
    }

    @Override // javax.net.ssl.SSLSession
    public Certificate[] getPeerCertificates() {
        Certificate[] certificateArr = this.A0B;
        if (certificateArr != null) {
            return (Certificate[]) certificateArr.clone();
        }
        return null;
    }

    @Override // javax.net.ssl.SSLSession
    public String getPeerHost() {
        return this.A06;
    }

    @Override // javax.net.ssl.SSLSession
    public int getPeerPort() {
        return this.A00;
    }

    @Override // javax.net.ssl.SSLSession
    public Principal getPeerPrincipal() {
        Certificate[] certificateArr = this.A0B;
        if (certificateArr != null && certificateArr.length != 0) {
            return ((java.security.cert.X509Certificate) certificateArr[0]).getSubjectX500Principal();
        }
        throw new SSLPeerUnverifiedException("No peer certificates found.");
    }

    @Override // javax.net.ssl.SSLSession
    public SSLSessionContext getSessionContext() {
        return this.A04;
    }

    @Override // javax.net.ssl.SSLSession
    public Object getValue(String str) {
        if (str != null) {
            return this.A0C.get(str);
        }
        throw new IllegalArgumentException("key cannot be null.");
    }

    @Override // javax.net.ssl.SSLSession
    public String[] getValueNames() {
        return (String[]) this.A0C.keySet().toArray(new String[0]);
    }

    @Override // javax.net.ssl.SSLSession
    public void invalidate() {
        this.A09 = false;
    }

    @Override // javax.net.ssl.SSLSession
    public boolean isValid() {
        WtCachedPsk[] wtCachedPskArr;
        boolean z = this.A09;
        if (z) {
            HashSet hashSet = new HashSet();
            LinkedHashSet linkedHashSet = this.A07;
            if (linkedHashSet != null && (wtCachedPskArr = (WtCachedPsk[]) linkedHashSet.toArray(new WtCachedPsk[0])) != null) {
                for (WtCachedPsk wtCachedPsk : wtCachedPskArr) {
                    if ((wtCachedPsk.useTestTime ? 3600000L : System.currentTimeMillis()) - wtCachedPsk.ticketIssuedTime > wtCachedPsk.ticketLifetime || !wtCachedPsk.sni.equals(this.A06)) {
                        this.A07.remove(wtCachedPsk);
                    } else {
                        hashSet.add(Byte.valueOf(wtCachedPsk.certsID));
                    }
                }
            }
            Iterator it = this.A08.keySet().iterator();
            while (it.hasNext()) {
                if (!hashSet.contains(it.next())) {
                    it.remove();
                }
            }
            LinkedHashSet linkedHashSet2 = this.A07;
            if (linkedHashSet2 == null || linkedHashSet2.isEmpty()) {
                this.A09 = false;
            }
            return this.A09;
        }
        return z;
    }

    @Override // javax.net.ssl.SSLSession
    public void putValue(String str, Object obj) {
        if (str != null && obj != null) {
            Object put = this.A0C.put(str, obj);
            if (put instanceof SSLSessionBindingListener) {
                ((SSLSessionBindingListener) put).valueUnbound(new SSLSessionBindingEvent(this, str));
            }
            if (obj instanceof SSLSessionBindingListener) {
                ((SSLSessionBindingListener) obj).valueBound(new SSLSessionBindingEvent(this, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("key and value cannot be null.");
    }

    @Override // javax.net.ssl.SSLSession
    public void removeValue(String str) {
        if (str != null) {
            Object remove = this.A0C.remove(str);
            if (remove instanceof SSLSessionBindingListener) {
                ((SSLSessionBindingListener) remove).valueUnbound(new SSLSessionBindingEvent(this, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("key cannot be null");
    }
}
