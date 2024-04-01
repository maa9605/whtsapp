package X;

import android.util.Base64;
import com.whatsapp.net.tls13.WtCachedPsk;
import com.whatsapp.util.Log;
import com.whatsapp.watls13.WtPersistentSession;
import java.io.File;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Random;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;

/* renamed from: X.03I */
/* loaded from: classes.dex */
public class C03I implements SSLSessionContext {
    public static volatile C03I A04;
    public C03J A00;
    public volatile int A02 = 64;
    public final Map A01 = new LinkedHashMap<C1R5, SSLSession>() { // from class: X.03K
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(64, 0.75f, true);
            C03I.this = this;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<C1R5, SSLSession> entry) {
            return size() > C03I.this.A02;
        }
    };
    public volatile long A03 = 172800;

    public C03I(C03J c03j) {
        this.A00 = c03j;
    }

    @Override // javax.net.ssl.SSLSessionContext
    public Enumeration getIds() {
        SSLSession[] sSLSessionArr;
        Map map = this.A01;
        synchronized (map) {
            sSLSessionArr = (SSLSession[]) map.values().toArray(new SSLSession[0]);
        }
        final Iterator it = Arrays.asList(sSLSessionArr).iterator();
        return new Enumeration() { // from class: X.1R4
            public SSLSession A00;

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                SSLSession sSLSession;
                if (this.A00 != null) {
                    return true;
                }
                do {
                    Iterator it2 = it;
                    if (it2.hasNext()) {
                        sSLSession = (SSLSession) it2.next();
                    } else {
                        this.A00 = null;
                        return false;
                    }
                } while (!sSLSession.isValid());
                this.A00 = sSLSession;
                return true;
            }

            @Override // java.util.Enumeration
            public Object nextElement() {
                if (hasMoreElements()) {
                    byte[] id = this.A00.getId();
                    this.A00 = null;
                    return id;
                }
                throw new NoSuchElementException();
            }
        };
    }

    @Override // javax.net.ssl.SSLSessionContext
    public synchronized SSLSession getSession(byte[] bArr) {
        Map map;
        WtCachedPsk[] wtCachedPskArr;
        C1R5 c1r5 = new C1R5(bArr);
        try {
            map = this.A01;
        } catch (C27871Pc e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Encountered Exception ");
            sb.append(e.toString());
            Log.e(sb.toString());
        }
        synchronized (map) {
            C27891Pf c27891Pf = (C27891Pf) map.get(c1r5);
            if (c27891Pf == null) {
                C03J c03j = this.A00;
                if (c03j != null) {
                    synchronized (c03j) {
                        if (c03j.A04() != null) {
                            WtPersistentSession A03 = c03j.A03(new File(c03j.A04(), Base64.encodeToString(bArr, 10)));
                            if (A03 != null) {
                                c27891Pf = new C27891Pf(this, A03.sni, A03.port, A03.cipher);
                                c27891Pf.A08 = A03.certs;
                                c27891Pf.A07 = A03.psks;
                                c27891Pf.A02 = System.currentTimeMillis();
                                map.put(new C1R5(bArr), c27891Pf);
                            }
                        }
                    }
                }
                return null;
            }
            if (c27891Pf.isValid()) {
                C27891Pf c27891Pf2 = new C27891Pf(this, c27891Pf.getPeerHost(), c27891Pf.getPeerPort(), c27891Pf.getCipherSuite());
                LinkedHashSet linkedHashSet = c27891Pf.A07;
                WtCachedPsk wtCachedPsk = null;
                if (linkedHashSet != null && !linkedHashSet.isEmpty()) {
                    Random random = new Random();
                    LinkedHashSet linkedHashSet2 = c27891Pf.A07;
                    if (linkedHashSet2 != null && (wtCachedPskArr = (WtCachedPsk[]) linkedHashSet2.toArray(new WtCachedPsk[0])) != null) {
                        int nextInt = random.nextInt(wtCachedPskArr.length);
                        c27891Pf.A07.remove(wtCachedPskArr[nextInt]);
                        wtCachedPsk = wtCachedPskArr[nextInt];
                    }
                }
                Certificate[] certificateArr = (Certificate[]) c27891Pf.A08.get(Byte.valueOf(wtCachedPsk.certsID));
                if (certificateArr != null) {
                    c27891Pf2.A03 = wtCachedPsk;
                    c27891Pf2.A01(certificateArr);
                }
                C03J c03j2 = this.A00;
                if (c03j2 != null) {
                    c03j2.A06(c1r5.A01, new WtPersistentSession(c27891Pf.getPeerHost(), c27891Pf.getPeerPort(), c27891Pf.getCipherSuite(), c27891Pf.A07, c27891Pf.A08));
                }
                return c27891Pf2;
            }
            map.remove(c1r5);
            C03J c03j3 = this.A00;
            if (c03j3 != null) {
                c03j3.A05(c1r5.A01);
            }
            return null;
        }
    }

    @Override // javax.net.ssl.SSLSessionContext
    public int getSessionCacheSize() {
        return this.A02;
    }

    @Override // javax.net.ssl.SSLSessionContext
    public int getSessionTimeout() {
        return (int) this.A03;
    }

    @Override // javax.net.ssl.SSLSessionContext
    public void setSessionCacheSize(int i) {
        if (i >= 0) {
            this.A02 = i;
            return;
        }
        throw new IllegalArgumentException("Cache size < 0");
    }

    @Override // javax.net.ssl.SSLSessionContext
    public void setSessionTimeout(int i) {
        if (i >= 0) {
            this.A03 = i;
            Map map = this.A01;
            synchronized (map) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    SSLSession sSLSession = (SSLSession) it.next();
                    if (!sSLSession.isValid()) {
                        it.remove();
                        C03J c03j = this.A00;
                        if (c03j != null) {
                            c03j.A05(sSLSession.getId());
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalArgumentException("Timeout < 0");
    }
}
