package X;

import com.whatsapp.net.tls13.WtCachedPsk;
import com.whatsapp.util.Log;
import com.whatsapp.watls13.WtPersistentSession;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import javax.net.ssl.X509TrustManager;

/* renamed from: X.3Mc */
/* loaded from: classes2.dex */
public abstract class AbstractC68833Mc {
    public void A00(C68853Me c68853Me, InterfaceC68843Md interfaceC68843Md, C68913Mk c68913Mk, int i) {
        long j;
        int intValue;
        C68983Mr c68983Mr;
        int intValue2;
        int intValue3;
        C68983Mr c68983Mr2;
        String str;
        if (this instanceof C76483gf) {
            C76513gi c76513gi = (C76513gi) interfaceC68843Md;
            c76513gi.A0C.A02 = System.currentTimeMillis();
            try {
                c76513gi.A0D.A00((byte[]) c68853Me.A00);
            } catch (C27871Pc e) {
                throw new C68883Mh("Failed to update transcripts.", c68853Me, c76513gi, c68913Mk, i, e) { // from class: X.3gM
                    public final int actionType;
                    public final InterfaceC68843Md entity;
                    public final C68853Me event;
                    public final C68913Mk transition;

                    {
                        this.event = c68853Me;
                        this.entity = c76513gi;
                        this.actionType = i;
                        this.transition = c68913Mk;
                    }
                };
            }
        } else if (this instanceof C76473ge) {
            C76513gi c76513gi2 = (C76513gi) interfaceC68843Md;
            if (c68853Me instanceof C76713h2) {
                try {
                    c76513gi2.A0C.A02 = System.currentTimeMillis();
                    C40841sx.A0e(C40841sx.A0r((byte[]) ((C76713h2) c68853Me).A00), false, c76513gi2);
                    return;
                } catch (C27871Pc e2) {
                    throw new C68883Mh(e2.ex.getMessage(), c68853Me, c76513gi2, c68913Mk, i, e2) { // from class: X.3gM
                        public final int actionType;
                        public final InterfaceC68843Md entity;
                        public final C68853Me event;
                        public final C68913Mk transition;

                        {
                            this.event = c68853Me;
                            this.entity = c76513gi2;
                            this.actionType = i;
                            this.transition = c68913Mk;
                        }
                    };
                } catch (RuntimeException e3) {
                    throw new C68883Mh("Server Hello parse error.", c68853Me, c76513gi2, c68913Mk, i, e3) { // from class: X.3gM
                        public final int actionType;
                        public final InterfaceC68843Md entity;
                        public final C68853Me event;
                        public final C68913Mk transition;

                        {
                            this.event = c68853Me;
                            this.entity = c76513gi2;
                            this.actionType = i;
                            this.transition = c68913Mk;
                        }
                    };
                }
            }
            throw new C68883Mh("Unexpected event type", c68853Me, c76513gi2, c68913Mk, i, new C27871Pc((byte) 80, new SSLException("Unexpected event"))) { // from class: X.3gM
                public final int actionType;
                public final InterfaceC68843Md entity;
                public final C68853Me event;
                public final C68913Mk transition;

                {
                    this.event = c68853Me;
                    this.entity = c76513gi2;
                    this.actionType = i;
                    this.transition = c68913Mk;
                }
            };
        } else if (this instanceof C76463gd) {
            C76513gi c76513gi3 = (C76513gi) interfaceC68843Md;
            if (c68853Me instanceof C76703h1) {
                try {
                    c76513gi3.A0C.A02 = System.currentTimeMillis();
                    if (C40841sx.A0k(C40841sx.A0s((byte[]) c76513gi3.A0U.get("server_finished"), c76513gi3.A0D.A02(), c76513gi3.A0P), C40841sx.A0r((byte[]) c68853Me.A00))) {
                        return;
                    }
                    throw new C68883Mh("Failed to verify server fin.", c68853Me, c76513gi3, c68913Mk, i, new C27871Pc((byte) 80, new SSLException("Failed to verify server fin."))) { // from class: X.3gM
                        public final int actionType;
                        public final InterfaceC68843Md entity;
                        public final C68853Me event;
                        public final C68913Mk transition;

                        {
                            this.event = c68853Me;
                            this.entity = c76513gi3;
                            this.actionType = i;
                            this.transition = c68913Mk;
                        }
                    };
                } catch (C27871Pc e4) {
                    throw new C68883Mh("Failed to process finished message.", c68853Me, c76513gi3, c68913Mk, i, e4) { // from class: X.3gM
                        public final int actionType;
                        public final InterfaceC68843Md entity;
                        public final C68853Me event;
                        public final C68913Mk transition;

                        {
                            this.event = c68853Me;
                            this.entity = c76513gi3;
                            this.actionType = i;
                            this.transition = c68913Mk;
                        }
                    };
                }
            }
            throw new C68883Mh("Unexpected event type", c68853Me, c76513gi3, c68913Mk, i, new C27871Pc((byte) 80, new SSLException("Unexpected event"))) { // from class: X.3gM
                public final int actionType;
                public final InterfaceC68843Md entity;
                public final C68853Me event;
                public final C68913Mk transition;

                {
                    this.event = c68853Me;
                    this.entity = c76513gi3;
                    this.actionType = i;
                    this.transition = c68913Mk;
                }
            };
        } else if (this instanceof C76453gc) {
            C76513gi c76513gi4 = (C76513gi) interfaceC68843Md;
            c76513gi4.A0C.A02 = System.currentTimeMillis();
            if (c68853Me instanceof C76693h0) {
                try {
                    byte[] bytes = "TLS 1.3, server CertificateVerify".getBytes("UTF-8");
                    byte[] bArr = new byte[64];
                    Arrays.fill(bArr, (byte) 32);
                    try {
                        ByteBuffer wrap = ByteBuffer.wrap(C40841sx.A0r((byte[]) c68853Me.A00));
                        short s = wrap.getShort();
                        byte[] bArr2 = new byte[2];
                        wrap.get(bArr2);
                        byte[] bArr3 = new byte[C40841sx.A05(bArr2)];
                        wrap.get(bArr3);
                        C03H c03h = c76513gi4.A0I;
                        if (c03h == null) {
                            throw null;
                        }
                        if (s != 1027) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Expected signature scheme ");
                            if (c03h != null) {
                                sb.append(1027);
                                sb.append(" got ");
                                sb.append((int) s);
                                String obj = sb.toString();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Expected signature scheme ");
                                sb2.append(1027);
                                sb2.append(" got ");
                                sb2.append((int) s);
                                throw new C68883Mh(obj, c68853Me, c76513gi4, c68913Mk, i, new C27871Pc((byte) 80, new SSLException(sb2.toString()))) { // from class: X.3gM
                                    public final int actionType;
                                    public final InterfaceC68843Md entity;
                                    public final C68853Me event;
                                    public final C68913Mk transition;

                                    {
                                        this.event = c68853Me;
                                        this.entity = c76513gi4;
                                        this.actionType = i;
                                        this.transition = c68913Mk;
                                    }
                                };
                            }
                            throw null;
                        }
                        byte[] A02 = c76513gi4.A0D.A02();
                        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 64 + 1 + A02.length);
                        allocate.put(bArr);
                        allocate.put(bytes);
                        allocate.put((byte) 0);
                        allocate.put(A02);
                        byte[] array = allocate.array();
                        ArrayList arrayList = new ArrayList();
                        for (C68943Mn c68943Mn : c76513gi4.A0T) {
                            try {
                                arrayList.add(CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(c68943Mn.A01)));
                            } catch (CertificateException e5) {
                                throw new C68883Mh("Bad certificate", c68853Me, c76513gi4, c68913Mk, i, new SSLException(e5)) { // from class: X.3gM
                                    public final int actionType;
                                    public final InterfaceC68843Md entity;
                                    public final C68853Me event;
                                    public final C68913Mk transition;

                                    {
                                        this.event = c68853Me;
                                        this.entity = c76513gi4;
                                        this.actionType = i;
                                        this.transition = c68913Mk;
                                    }
                                };
                            }
                        }
                        try {
                            C38131nb c38131nb = c76513gi4.A0J;
                            X509Certificate[] x509CertificateArr = (X509Certificate[]) arrayList.toArray(new X509Certificate[0]);
                            String str2 = c76513gi4.A0Q;
                            try {
                                try {
                                    try {
                                        if (c38131nb.A00 != null) {
                                            if (x509CertificateArr != null && x509CertificateArr.length != 0) {
                                                Signature signature = Signature.getInstance("SHA256withECDSA");
                                                signature.initVerify(x509CertificateArr[0]);
                                                signature.update(array);
                                                boolean verify = signature.verify(bArr3);
                                                if (verify) {
                                                    try {
                                                        X509TrustManager x509TrustManager = c38131nb.A00;
                                                        if (c38131nb.A01 != null) {
                                                            x509TrustManager.checkServerTrusted(x509CertificateArr, "EC");
                                                        } else {
                                                            throw null;
                                                        }
                                                    } catch (CertificateException e6) {
                                                        throw new C27871Pc((byte) 42, new SSLException("Certificate could not be verified", e6));
                                                    }
                                                }
                                                C27891Pf c27891Pf = new C27891Pf(null, "", -1, "");
                                                c27891Pf.A01(x509CertificateArr);
                                                boolean verify2 = HttpsURLConnection.getDefaultHostnameVerifier().verify(str2, c27891Pf);
                                                if (verify && verify2) {
                                                    c76513gi4.A0C.A01((Certificate[]) arrayList.toArray(new Certificate[0]));
                                                    c76513gi4.A0b = true;
                                                    return;
                                                }
                                                throw new C68883Mh("Certificates could not be verified.", c68853Me, c76513gi4, c68913Mk, i, new C27871Pc((byte) 42, new SSLException("ServerCertificate verify failed."))) { // from class: X.3gM
                                                    public final int actionType;
                                                    public final InterfaceC68843Md entity;
                                                    public final C68853Me event;
                                                    public final C68913Mk transition;

                                                    {
                                                        this.event = c68853Me;
                                                        this.entity = c76513gi4;
                                                        this.actionType = i;
                                                        this.transition = c68913Mk;
                                                    }
                                                };
                                            }
                                            throw new C27871Pc((byte) 80, new SSLException("Null or empty certificates certificates"));
                                        }
                                        throw new C27871Pc((byte) 80, new SSLException("Trust Manager cannot be null."));
                                    } catch (NoSuchAlgorithmException unused) {
                                        throw new C27871Pc((byte) 80, new SSLException("SHA256withECDSA not found."));
                                    }
                                } catch (InvalidKeyException unused2) {
                                    throw new C27871Pc((byte) 42, new SSLException("Certificate key is invalid."));
                                }
                            } catch (SignatureException unused3) {
                                throw new C27871Pc((byte) 42, new SSLException("Signature is invalid"));
                            }
                        } catch (C27871Pc e7) {
                            throw new C68883Mh("Certificates verify failed.", c68853Me, c76513gi4, c68913Mk, i, e7) { // from class: X.3gM
                                public final int actionType;
                                public final InterfaceC68843Md entity;
                                public final C68853Me event;
                                public final C68913Mk transition;

                                {
                                    this.event = c68853Me;
                                    this.entity = c76513gi4;
                                    this.actionType = i;
                                    this.transition = c68913Mk;
                                }
                            };
                        }
                    } catch (C27871Pc e8) {
                        throw new C68883Mh("", c68853Me, c76513gi4, c68913Mk, i, e8) { // from class: X.3gM
                            public final int actionType;
                            public final InterfaceC68843Md entity;
                            public final C68853Me event;
                            public final C68913Mk transition;

                            {
                                this.event = c68853Me;
                                this.entity = c76513gi4;
                                this.actionType = i;
                                this.transition = c68913Mk;
                            }
                        };
                    }
                } catch (UnsupportedEncodingException e9) {
                    throw new C68883Mh("Could not encode context string in UTF-8", c68853Me, c76513gi4, c68913Mk, i, new C27871Pc((byte) 80, new SSLException(e9))) { // from class: X.3gM
                        public final int actionType;
                        public final InterfaceC68843Md entity;
                        public final C68853Me event;
                        public final C68913Mk transition;

                        {
                            this.event = c68853Me;
                            this.entity = c76513gi4;
                            this.actionType = i;
                            this.transition = c68913Mk;
                        }
                    };
                }
            }
            throw new C68883Mh("Unexpected event type", c68853Me, c76513gi4, c68913Mk, i, new C27871Pc((byte) 80, new SSLException("Unexpected event"))) { // from class: X.3gM
                public final int actionType;
                public final InterfaceC68843Md entity;
                public final C68853Me event;
                public final C68913Mk transition;

                {
                    this.event = c68853Me;
                    this.entity = c76513gi4;
                    this.actionType = i;
                    this.transition = c68913Mk;
                }
            };
        } else if (this instanceof C76443gb) {
            C76513gi c76513gi5 = (C76513gi) interfaceC68843Md;
            if (c68853Me instanceof C76683gz) {
                try {
                    c76513gi5.A0C.A02 = System.currentTimeMillis();
                    ByteBuffer wrap2 = ByteBuffer.wrap(C40841sx.A0r((byte[]) ((C76683gz) c68853Me).A00));
                    if (wrap2.get() == 0) {
                        byte[] bArr4 = new byte[3];
                        wrap2.get(bArr4);
                        int A04 = C40841sx.A04(bArr4);
                        byte[] bArr5 = new byte[A04];
                        wrap2.get(bArr5);
                        ArrayList arrayList2 = new ArrayList();
                        ByteBuffer wrap3 = ByteBuffer.wrap(bArr5);
                        int i2 = 0;
                        while (i2 < A04) {
                            byte[] bArr6 = new byte[3];
                            wrap3.get(bArr6);
                            int A042 = C40841sx.A04(bArr6);
                            byte[] bArr7 = new byte[A042];
                            wrap3.get(bArr7);
                            byte[] bArr8 = new byte[2];
                            wrap3.get(bArr8);
                            int A05 = C40841sx.A05(bArr8);
                            byte[] bArr9 = new byte[A05];
                            wrap3.get(bArr9);
                            i2 += A042 + 3 + 2 + A05;
                            arrayList2.add(new C68943Mn(bArr7, new C68993Ms(bArr9)));
                        }
                        c76513gi5.A0T = arrayList2;
                        return;
                    }
                    throw new C68883Mh("Unexpected certificate size", c68853Me, c76513gi5, c68913Mk, i, new C27871Pc((byte) 80, new SSLException("Unexpected Message"))) { // from class: X.3gM
                        public final int actionType;
                        public final InterfaceC68843Md entity;
                        public final C68853Me event;
                        public final C68913Mk transition;

                        {
                            this.event = c68853Me;
                            this.entity = c76513gi5;
                            this.actionType = i;
                            this.transition = c68913Mk;
                        }
                    };
                } catch (C27871Pc e10) {
                    throw new C68883Mh("Failed to process certificate", c68853Me, c76513gi5, c68913Mk, i, e10) { // from class: X.3gM
                        public final int actionType;
                        public final InterfaceC68843Md entity;
                        public final C68853Me event;
                        public final C68913Mk transition;

                        {
                            this.event = c68853Me;
                            this.entity = c76513gi5;
                            this.actionType = i;
                            this.transition = c68913Mk;
                        }
                    };
                } catch (RuntimeException e11) {
                    throw new C68883Mh("Failed to parse certificate.", c68853Me, c76513gi5, c68913Mk, i, e11) { // from class: X.3gM
                        public final int actionType;
                        public final InterfaceC68843Md entity;
                        public final C68853Me event;
                        public final C68913Mk transition;

                        {
                            this.event = c68853Me;
                            this.entity = c76513gi5;
                            this.actionType = i;
                            this.transition = c68913Mk;
                        }
                    };
                }
            }
            throw new C68883Mh("Unexpected event type", c68853Me, c76513gi5, c68913Mk, i, new C27871Pc((byte) 80, new SSLException("Unexpected event"))) { // from class: X.3gM
                public final int actionType;
                public final InterfaceC68843Md entity;
                public final C68853Me event;
                public final C68913Mk transition;

                {
                    this.event = c68853Me;
                    this.entity = c76513gi5;
                    this.actionType = i;
                    this.transition = c68913Mk;
                }
            };
        } else if (this instanceof C76433ga) {
            C76513gi c76513gi6 = (C76513gi) interfaceC68843Md;
            c76513gi6.A0C.A02 = System.currentTimeMillis();
            throw new C68883Mh("Unexpected event type", c68853Me, c76513gi6, c68913Mk, i, new C27871Pc((byte) 80, new SSLException("Unexpected event"))) { // from class: X.3gM
                public final int actionType;
                public final InterfaceC68843Md entity;
                public final C68853Me event;
                public final C68913Mk transition;

                {
                    this.event = c68853Me;
                    this.entity = c76513gi6;
                    this.actionType = i;
                    this.transition = c68913Mk;
                }
            };
        } else if (this instanceof C76423gZ) {
            C76513gi c76513gi7 = (C76513gi) interfaceC68843Md;
            c76513gi7.A0C.A02 = System.currentTimeMillis();
            if (c68853Me instanceof C76663gx) {
                try {
                    ByteBuffer wrap4 = ByteBuffer.wrap(C40841sx.A0r((byte[]) c68853Me.A00));
                    byte b = wrap4.get();
                    if (b != 1 && b != 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid key update type ");
                        sb3.append((int) b);
                        String obj2 = sb3.toString();
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid key update type ");
                        sb4.append((int) b);
                        throw new C68883Mh(obj2, c68853Me, c76513gi7, c68913Mk, i, new C27871Pc((byte) 10, new SSLException(sb4.toString()))) { // from class: X.3gM
                            public final int actionType;
                            public final InterfaceC68843Md entity;
                            public final C68853Me event;
                            public final C68913Mk transition;

                            {
                                this.event = c68853Me;
                                this.entity = c76513gi7;
                                this.actionType = i;
                                this.transition = c68913Mk;
                            }
                        };
                    }
                    byte[] A01 = c76513gi7.A09.A01((byte[]) c76513gi7.A0U.get("server_app_traffic_secret"), C40841sx.A0q("traffic upd", new byte[0], c76513gi7.A02), c76513gi7.A02);
                    c76513gi7.A0U.put("server_app_traffic_secret", A01);
                    C3MY c3my = c76513gi7.A09;
                    byte[] bArr10 = new byte[0];
                    if (c76513gi7.A0F != null) {
                        byte[] A0q = C40841sx.A0q("key", bArr10, 16);
                        if (c76513gi7.A0F != null) {
                            c76513gi7.A0U.put("server_app_key", c3my.A01(A01, A0q, 16));
                            C3MY c3my2 = c76513gi7.A09;
                            byte[] bArr11 = new byte[0];
                            if (c76513gi7.A0F != null) {
                                byte[] A0q2 = C40841sx.A0q("iv", bArr11, 12);
                                if (c76513gi7.A0F != null) {
                                    c76513gi7.A0U.put("server_app_iv", c3my2.A01(A01, A0q2, 12));
                                    int i3 = c76513gi7.A03 + 1;
                                    c76513gi7.A03 = i3;
                                    EnumC68813Ma enumC68813Ma = EnumC68813Ma.DEBUG;
                                    StringBuilder A0P = C000200d.A0P("Updated Server App Traffic Keys : Current Gen = ");
                                    A0P.append(i3);
                                    C3MZ.A00(enumC68813Ma, A0P.toString());
                                    AbstractC69023Mv abstractC69023Mv = c76513gi7.A0A;
                                    if (abstractC69023Mv != null) {
                                        if (abstractC69023Mv.A00.available() > 0) {
                                            throw new C68883Mh("Unexpected Messages: Found pending handshake messages", c68853Me, c76513gi7, c68913Mk, i, new C27871Pc((byte) 10, new SSLException("Found unprocessed messages in handshake buffer."))) { // from class: X.3gM
                                                public final int actionType;
                                                public final InterfaceC68843Md entity;
                                                public final C68853Me event;
                                                public final C68913Mk transition;

                                                {
                                                    this.event = c68853Me;
                                                    this.entity = c76513gi7;
                                                    this.actionType = i;
                                                    this.transition = c68913Mk;
                                                }
                                            };
                                        }
                                    }
                                    InterfaceC27881Pd A00 = C03M.A00();
                                    A00.AEk((byte[]) c76513gi7.A0U.get("server_app_key"), (byte[]) c76513gi7.A0U.get("server_app_iv"));
                                    c76513gi7.A0A = new C76493gg(c76513gi7.A0M, c76513gi7.A08, A00);
                                    if (b == 1) {
                                        byte[] A0l = C40841sx.A0l((byte) 24, new byte[]{0});
                                        c76513gi7.A0B.A01((byte) 23, A0l, 0, A0l.length);
                                        byte[] A012 = c76513gi7.A09.A01((byte[]) c76513gi7.A0U.get("client_app_traffic_secret"), C40841sx.A0q("traffic upd", new byte[0], c76513gi7.A02), c76513gi7.A02);
                                        c76513gi7.A0U.put("client_app_traffic_secret", A012);
                                        C3MY c3my3 = c76513gi7.A09;
                                        byte[] bArr12 = new byte[0];
                                        if (c76513gi7.A0F != null) {
                                            byte[] A0q3 = C40841sx.A0q("key", bArr12, 16);
                                            if (c76513gi7.A0F != null) {
                                                c76513gi7.A0U.put("client_app_key", c3my3.A01(A012, A0q3, 16));
                                                C3MY c3my4 = c76513gi7.A09;
                                                byte[] bArr13 = new byte[0];
                                                if (c76513gi7.A0F != null) {
                                                    byte[] A0q4 = C40841sx.A0q("iv", bArr13, 12);
                                                    if (c76513gi7.A0F != null) {
                                                        c76513gi7.A0U.put("client_app_iv", c3my4.A01(A012, A0q4, 12));
                                                        int i4 = c76513gi7.A01 + 1;
                                                        c76513gi7.A01 = i4;
                                                        StringBuilder A0P2 = C000200d.A0P("Updated Client App Traffic Keys : Current Gen = ");
                                                        A0P2.append(i4);
                                                        C3MZ.A00(enumC68813Ma, A0P2.toString());
                                                        InterfaceC27881Pd A002 = C03M.A00();
                                                        A002.AEk((byte[]) c76513gi7.A0U.get("client_app_key"), (byte[]) c76513gi7.A0U.get("client_app_iv"));
                                                        c76513gi7.A0B = new C76503gh(c76513gi7.A0N, A002);
                                                    } else {
                                                        throw null;
                                                    }
                                                } else {
                                                    throw null;
                                                }
                                            } else {
                                                throw null;
                                            }
                                        } else {
                                            throw null;
                                        }
                                    }
                                    if (wrap4.hasRemaining()) {
                                        throw new C68883Mh("Key update message has more than expected bytes.", c68853Me, c76513gi7, c68913Mk, i, new C27871Pc((byte) 80, new SSLException("Key update message has more than expected bytes."))) { // from class: X.3gM
                                            public final int actionType;
                                            public final InterfaceC68843Md entity;
                                            public final C68853Me event;
                                            public final C68913Mk transition;

                                            {
                                                this.event = c68853Me;
                                                this.entity = c76513gi7;
                                                this.actionType = i;
                                                this.transition = c68913Mk;
                                            }
                                        };
                                    }
                                    return;
                                }
                                throw null;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                } catch (C27871Pc e12) {
                    throw new C68883Mh("Receive key update failed.", c68853Me, c76513gi7, c68913Mk, i, e12) { // from class: X.3gM
                        public final int actionType;
                        public final InterfaceC68843Md entity;
                        public final C68853Me event;
                        public final C68913Mk transition;

                        {
                            this.event = c68853Me;
                            this.entity = c76513gi7;
                            this.actionType = i;
                            this.transition = c68913Mk;
                        }
                    };
                }
            }
            throw new C68883Mh("Unexpected event type", c68853Me, c76513gi7, c68913Mk, i, new C27871Pc((byte) 80, new SSLException("Unexpected event"))) { // from class: X.3gM
                public final int actionType;
                public final InterfaceC68843Md entity;
                public final C68853Me event;
                public final C68913Mk transition;

                {
                    this.event = c68853Me;
                    this.entity = c76513gi7;
                    this.actionType = i;
                    this.transition = c68913Mk;
                }
            };
        } else if (this instanceof C76413gY) {
            C76513gi c76513gi8 = (C76513gi) interfaceC68843Md;
            c76513gi8.A0C.A02 = System.currentTimeMillis();
            if (c68853Me instanceof C76643gv) {
                try {
                    ByteBuffer wrap5 = ByteBuffer.wrap(C40841sx.A0r((byte[]) c68853Me.A00));
                    byte[] bArr14 = new byte[4];
                    wrap5.get(bArr14);
                    if (C40841sx.A06(bArr14) != 0) {
                        byte[] bArr15 = new byte[4];
                        wrap5.get(bArr15);
                        byte[] bArr16 = new byte[(short) (((short) (wrap5.get() & 255)) | 0)];
                        wrap5.get(bArr16);
                        int i5 = 2;
                        byte[] bArr17 = new byte[2];
                        wrap5.get(bArr17);
                        byte[] bArr18 = new byte[C40841sx.A05(bArr17)];
                        wrap5.get(bArr18);
                        byte[] bArr19 = new byte[2];
                        wrap5.get(bArr19);
                        int A052 = C40841sx.A05(bArr19);
                        byte[] bArr20 = new byte[A052];
                        wrap5.get(bArr20);
                        HashMap hashMap = new HashMap();
                        ArrayList arrayList3 = new ArrayList();
                        ByteBuffer wrap6 = ByteBuffer.wrap(bArr20);
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < A052) {
                            short s2 = wrap6.getShort();
                            byte[] bArr21 = new byte[i5];
                            wrap6.get(bArr21);
                            int A053 = C40841sx.A05(bArr21);
                            byte[] bArr22 = new byte[A053];
                            wrap6.get(bArr22);
                            arrayList3.add(new C68983Mr(s2, bArr22));
                            hashMap.put(Short.valueOf(s2), Integer.valueOf(i7));
                            i7++;
                            i6 += A053 + 4;
                            i5 = 2;
                        }
                        if (i6 == A052) {
                            ArrayList arrayList4 = new ArrayList(arrayList3);
                            Number number = (Number) hashMap.get((short) 42);
                            if (number != null && (intValue = number.intValue()) < i7 && (c68983Mr = (C68983Mr) arrayList4.get(intValue)) != null) {
                                j = C40841sx.A06(c68983Mr.A01);
                            } else {
                                j = 0;
                            }
                            byte[] A013 = c76513gi8.A09.A01((byte[]) c76513gi8.A0U.get("resumption_master_secret"), C40841sx.A0q("resumption", bArr16, c76513gi8.A02), c76513gi8.A02);
                            if (c76513gi8.A0F != null) {
                                c76513gi8.A0C.A07.add(new WtCachedPsk(A013, j, bArr15, bArr14, bArr18, c76513gi8.A0Q, c76513gi8.A0C.A00().byteValue()));
                                if (!wrap5.hasRemaining()) {
                                    C03I c03i = c76513gi8.A0L;
                                    C27891Pf c27891Pf2 = c76513gi8.A0C;
                                    synchronized (c03i) {
                                        C1R5 c1r5 = new C1R5(c27891Pf2.getId());
                                        try {
                                            Map map = c03i.A01;
                                            synchronized (map) {
                                                C27891Pf c27891Pf3 = (C27891Pf) map.get(c1r5);
                                                if (c27891Pf3 == null) {
                                                    c27891Pf3 = new C27891Pf(c03i, c27891Pf2.getPeerHost(), c27891Pf2.getPeerPort(), c27891Pf2.getCipherSuite());
                                                    map.put(c1r5, c27891Pf3);
                                                }
                                                c27891Pf3.A08.put(c27891Pf2.A00(), c27891Pf2.getPeerCertificates());
                                                Iterator it = c27891Pf2.A07.iterator();
                                                while (it.hasNext()) {
                                                    c27891Pf3.A07.add((WtCachedPsk) it.next());
                                                }
                                                C03J c03j = c03i.A00;
                                                if (c03j != null) {
                                                    c03j.A06(c1r5.A01, new WtPersistentSession(c27891Pf3.getPeerHost(), c27891Pf3.getPeerPort(), c27891Pf3.getCipherSuite(), c27891Pf3.A07, c27891Pf3.A08));
                                                }
                                            }
                                        } catch (C27871Pc e13) {
                                            StringBuilder sb5 = new StringBuilder();
                                            sb5.append("Encountered Exception ");
                                            sb5.append(e13.toString());
                                            Log.e(sb5.toString());
                                        }
                                    }
                                    return;
                                }
                                throw new C68883Mh("New session ticket has excess bytes than expected", c68853Me, c76513gi8, c68913Mk, i, new C27871Pc((byte) 80, new SSLException("New session ticket has more bytes than expected."))) { // from class: X.3gM
                                    public final int actionType;
                                    public final InterfaceC68843Md entity;
                                    public final C68853Me event;
                                    public final C68913Mk transition;

                                    {
                                        this.event = c68853Me;
                                        this.entity = c76513gi8;
                                        this.actionType = i;
                                        this.transition = c68913Mk;
                                    }
                                };
                            }
                            throw null;
                        }
                        throw new C27871Pc((byte) 80, new SSLException("Error while parsing extension"));
                    }
                    return;
                } catch (C27871Pc e14) {
                    throw new C68883Mh("Failed to process new session ticket", c68853Me, c76513gi8, c68913Mk, i, e14) { // from class: X.3gM
                        public final int actionType;
                        public final InterfaceC68843Md entity;
                        public final C68853Me event;
                        public final C68913Mk transition;

                        {
                            this.event = c68853Me;
                            this.entity = c76513gi8;
                            this.actionType = i;
                            this.transition = c68913Mk;
                        }
                    };
                }
            }
            throw new C68883Mh("Unexpected event type", c68853Me, c76513gi8, c68913Mk, i, new C27871Pc((byte) 80, new SSLException("Unexpected event"))) { // from class: X.3gM
                public final int actionType;
                public final InterfaceC68843Md entity;
                public final C68853Me event;
                public final C68913Mk transition;

                {
                    this.event = c68853Me;
                    this.entity = c76513gi8;
                    this.actionType = i;
                    this.transition = c68913Mk;
                }
            };
        } else if (this instanceof C76403gX) {
            C76513gi c76513gi9 = (C76513gi) interfaceC68843Md;
            if (c68853Me instanceof C76633gu) {
                try {
                    c76513gi9.A0C.A02 = System.currentTimeMillis();
                    byte[] bArr23 = (byte[]) ((C76633gu) c68853Me).A00;
                    C40841sx.A0e(C40841sx.A0r(bArr23), true, c76513gi9);
                    c76513gi9.A0c = true;
                    c76513gi9.A0f = false;
                    byte[] A022 = c76513gi9.A0D.A02();
                    C3N0 c3n0 = c76513gi9.A0D;
                    c3n0.A00.reset();
                    c3n0.A01 = null;
                    c76513gi9.A0D.A00(C40841sx.A0l((byte) -2, A022));
                    c76513gi9.A0D.A00(bArr23);
                    return;
                } catch (C27871Pc e15) {
                    throw new C68883Mh(e15.ex.getMessage(), c68853Me, c76513gi9, c68913Mk, i, e15) { // from class: X.3gM
                        public final int actionType;
                        public final InterfaceC68843Md entity;
                        public final C68853Me event;
                        public final C68913Mk transition;

                        {
                            this.event = c68853Me;
                            this.entity = c76513gi9;
                            this.actionType = i;
                            this.transition = c68913Mk;
                        }
                    };
                } catch (RuntimeException e16) {
                    throw new C68883Mh("Hello retry parse error.", c68853Me, c76513gi9, c68913Mk, i, e16) { // from class: X.3gM
                        public final int actionType;
                        public final InterfaceC68843Md entity;
                        public final C68853Me event;
                        public final C68913Mk transition;

                        {
                            this.event = c68853Me;
                            this.entity = c76513gi9;
                            this.actionType = i;
                            this.transition = c68913Mk;
                        }
                    };
                }
            }
            throw new C68883Mh("Unexpected event type", c68853Me, c76513gi9, c68913Mk, i, new C27871Pc((byte) 80, new SSLException("Unexpected event"))) { // from class: X.3gM
                public final int actionType;
                public final InterfaceC68843Md entity;
                public final C68853Me event;
                public final C68913Mk transition;

                {
                    this.event = c68853Me;
                    this.entity = c76513gi9;
                    this.actionType = i;
                    this.transition = c68913Mk;
                }
            };
        } else if (this instanceof C76393gW) {
            C76513gi c76513gi10 = (C76513gi) interfaceC68843Md;
            c76513gi10.A0C.A02 = System.currentTimeMillis();
            if (c68853Me instanceof C76623gt) {
                try {
                    ByteBuffer wrap7 = ByteBuffer.wrap(C40841sx.A0r((byte[]) c68853Me.A00));
                    byte[] bArr24 = new byte[2];
                    wrap7.get(bArr24);
                    int A054 = C40841sx.A05(bArr24);
                    byte[] bArr25 = new byte[A054];
                    wrap7.get(bArr25);
                    HashMap hashMap2 = new HashMap();
                    ArrayList arrayList5 = new ArrayList();
                    ByteBuffer wrap8 = ByteBuffer.wrap(bArr25);
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < A054) {
                        short s3 = wrap8.getShort();
                        byte[] bArr26 = new byte[2];
                        wrap8.get(bArr26);
                        int A055 = C40841sx.A05(bArr26);
                        byte[] bArr27 = new byte[A055];
                        wrap8.get(bArr27);
                        arrayList5.add(new C68983Mr(s3, bArr27));
                        hashMap2.put(Short.valueOf(s3), Integer.valueOf(i9));
                        i9++;
                        i8 += A055 + 4;
                    }
                    if (i8 == A054) {
                        ArrayList arrayList6 = new ArrayList(arrayList5);
                        Integer num = (Integer) hashMap2.get((short) 16);
                        if (num != null && (intValue3 = num.intValue()) < i9 && (c68983Mr2 = (C68983Mr) arrayList6.get(intValue3)) != null && (str = c76513gi10.A0O) != null && !str.isEmpty()) {
                            ByteBuffer wrap9 = ByteBuffer.wrap(c68983Mr2.A01);
                            byte[] bArr28 = new byte[2];
                            wrap9.get(bArr28);
                            int A056 = C40841sx.A05(bArr28);
                            HashSet hashSet = new HashSet();
                            int i10 = 0;
                            while (i10 < A056) {
                                int i11 = wrap9.get();
                                byte[] bArr29 = new byte[i11];
                                wrap9.get(bArr29);
                                try {
                                    hashSet.add(new String(bArr29, "UTF-8"));
                                    i10 += i11 + 1;
                                } catch (UnsupportedEncodingException e17) {
                                    throw new C68883Mh("Server protocol is not encoded using UTF-8", c68853Me, c76513gi10, c68913Mk, i, new C27871Pc((byte) 80, new SSLException(e17))) { // from class: X.3gM
                                        public final int actionType;
                                        public final InterfaceC68843Md entity;
                                        public final C68853Me event;
                                        public final C68913Mk transition;

                                        {
                                            this.event = c68853Me;
                                            this.entity = c76513gi10;
                                            this.actionType = i;
                                            this.transition = c68913Mk;
                                        }
                                    };
                                }
                            }
                            if (!hashSet.contains(c76513gi10.A0O)) {
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("Server selected wrong supported version ");
                                sb6.append(c68983Mr2.toString());
                                sb6.append(" expected: ");
                                sb6.append(c76513gi10.A0O);
                                throw new C68883Mh("Server sent unsupported protocol version.", c68853Me, c76513gi10, c68913Mk, i, new C27871Pc((byte) 110, new SSLException(sb6.toString()))) { // from class: X.3gM
                                    public final int actionType;
                                    public final InterfaceC68843Md entity;
                                    public final C68853Me event;
                                    public final C68913Mk transition;

                                    {
                                        this.event = c68853Me;
                                        this.entity = c76513gi10;
                                        this.actionType = i;
                                        this.transition = c68913Mk;
                                    }
                                };
                            }
                        }
                        Integer num2 = (Integer) hashMap2.get((short) 42);
                        if (num2 != null && (intValue2 = num2.intValue()) < i9 && ((C68983Mr) arrayList6.get(intValue2)) != null) {
                            boolean z = c76513gi10.A0Z;
                            if (z && c76513gi10.A0C.A03 != null) {
                                c76513gi10.A0f = true;
                            } else if (!z) {
                                throw new C68883Mh("Received server early data indication without sending early data.", c68853Me, c76513gi10, c68913Mk, i, new C27871Pc((byte) 10, new SSLException("Should not have received early data indication without sending early data."))) { // from class: X.3gM
                                    public final int actionType;
                                    public final InterfaceC68843Md entity;
                                    public final C68853Me event;
                                    public final C68913Mk transition;

                                    {
                                        this.event = c68853Me;
                                        this.entity = c76513gi10;
                                        this.actionType = i;
                                        this.transition = c68913Mk;
                                    }
                                };
                            }
                        }
                        Set set = C68963Mp.A06;
                        HashSet hashSet2 = new HashSet(hashMap2.keySet());
                        hashSet2.removeAll(set);
                        if (hashSet2.size() != 0) {
                            throw new C68883Mh("Unexpected extension provided by the server", c68853Me, c76513gi10, c68913Mk, i, new C27871Pc((byte) 47, new SSLException("Unexpected extension provided by the server"))) { // from class: X.3gM
                                public final int actionType;
                                public final InterfaceC68843Md entity;
                                public final C68853Me event;
                                public final C68913Mk transition;

                                {
                                    this.event = c68853Me;
                                    this.entity = c76513gi10;
                                    this.actionType = i;
                                    this.transition = c68913Mk;
                                }
                            };
                        }
                        if (wrap7.hasRemaining()) {
                            throw new C68883Mh("Encrypted extensions has excess bytes than expected", c68853Me, c76513gi10, c68913Mk, i, new C27871Pc((byte) 80, new SSLException("Encrypted extensions has more bytes than expected."))) { // from class: X.3gM
                                public final int actionType;
                                public final InterfaceC68843Md entity;
                                public final C68853Me event;
                                public final C68913Mk transition;

                                {
                                    this.event = c68853Me;
                                    this.entity = c76513gi10;
                                    this.actionType = i;
                                    this.transition = c68913Mk;
                                }
                            };
                        }
                        return;
                    }
                    throw new C27871Pc((byte) 80, new SSLException("Error while parsing extension"));
                } catch (C27871Pc e18) {
                    throw new C68883Mh("Failed to process encrypted extensions", c68853Me, c76513gi10, c68913Mk, i, e18) { // from class: X.3gM
                        public final int actionType;
                        public final InterfaceC68843Md entity;
                        public final C68853Me event;
                        public final C68913Mk transition;

                        {
                            this.event = c68853Me;
                            this.entity = c76513gi10;
                            this.actionType = i;
                            this.transition = c68913Mk;
                        }
                    };
                } catch (RuntimeException e19) {
                    e = e19;
                    String message = e.getMessage();
                    if (e.getCause() != null) {
                        e = e.getCause();
                    }
                    throw new C68883Mh("Failed to parse encrypted extensions", c68853Me, c76513gi10, c68913Mk, i, new C27871Pc((byte) 80, new SSLException(message, e))) { // from class: X.3gM
                        public final int actionType;
                        public final InterfaceC68843Md entity;
                        public final C68853Me event;
                        public final C68913Mk transition;

                        {
                            this.event = c68853Me;
                            this.entity = c76513gi10;
                            this.actionType = i;
                            this.transition = c68913Mk;
                        }
                    };
                }
            }
            throw new C68883Mh("Unexpected event type", c68853Me, c76513gi10, c68913Mk, i, new C27871Pc((byte) 80, new SSLException("Unexpected event"))) { // from class: X.3gM
                public final int actionType;
                public final InterfaceC68843Md entity;
                public final C68853Me event;
                public final C68913Mk transition;

                {
                    this.event = c68853Me;
                    this.entity = c76513gi10;
                    this.actionType = i;
                    this.transition = c68913Mk;
                }
            };
        } else if (this instanceof C76383gV) {
            C76513gi c76513gi11 = (C76513gi) interfaceC68843Md;
            C27891Pf c27891Pf4 = c76513gi11.A0C;
            c27891Pf4.A02 = System.currentTimeMillis();
            if (c68853Me instanceof C76603gr) {
                C3MX c3mx = (C3MX) c68853Me.A00;
                WtCachedPsk wtCachedPsk = c27891Pf4.A03;
                try {
                    int i12 = c3mx.A00;
                    if (i12 <= wtCachedPsk.maxEarlyDataSize) {
                        c76513gi11.A0B.A01((byte) 23, c3mx.A02, c3mx.A01, i12);
                        return;
                    }
                    throw new C68883Mh("Data size exceeds early data", c68853Me, c76513gi11, c68913Mk, i, new C27871Pc((byte) 80, new SSLException("Data to be written more than early data size"))) { // from class: X.3gM
                        public final int actionType;
                        public final InterfaceC68843Md entity;
                        public final C68853Me event;
                        public final C68913Mk transition;

                        {
                            this.event = c68853Me;
                            this.entity = c76513gi11;
                            this.actionType = i;
                            this.transition = c68913Mk;
                        }
                    };
                } catch (C27871Pc e20) {
                    throw new C68883Mh("App write for early data failed.", c68853Me, c76513gi11, c68913Mk, i, e20) { // from class: X.3gM
                        public final int actionType;
                        public final InterfaceC68843Md entity;
                        public final C68853Me event;
                        public final C68913Mk transition;

                        {
                            this.event = c68853Me;
                            this.entity = c76513gi11;
                            this.actionType = i;
                            this.transition = c68913Mk;
                        }
                    };
                }
            }
            throw new C68883Mh("Unexpected event type", c68853Me, c76513gi11, c68913Mk, i, new C27871Pc((byte) 80, new SSLException("Unexpected event"))) { // from class: X.3gM
                public final int actionType;
                public final InterfaceC68843Md entity;
                public final C68853Me event;
                public final C68913Mk transition;

                {
                    this.event = c68853Me;
                    this.entity = c76513gi11;
                    this.actionType = i;
                    this.transition = c68913Mk;
                }
            };
        } else if (this instanceof C76373gU) {
            C76513gi c76513gi12 = (C76513gi) interfaceC68843Md;
            try {
                byte[] A014 = c76513gi12.A0D.A01();
                byte[] bArr30 = (byte[]) c76513gi12.A0U.get("master_secret");
                if (bArr30 != null) {
                    c76513gi12.A0U.put("resumption_master_secret", c76513gi12.A09.A01(bArr30, C40841sx.A0q("res master", A014, c76513gi12.A02), c76513gi12.A02));
                    InterfaceC27881Pd A003 = C03M.A00();
                    A003.AEk((byte[]) c76513gi12.A0U.get("client_app_key"), (byte[]) c76513gi12.A0U.get("client_app_iv"));
                    c76513gi12.A0B = new C76503gh(c76513gi12.A0N, A003);
                    AbstractC69023Mv abstractC69023Mv2 = c76513gi12.A0A;
                    if (abstractC69023Mv2 != null) {
                        if (abstractC69023Mv2.A00.available() > 0) {
                            throw new C68883Mh("Unexpected Messages: Found pending handshake messages", c68853Me, c76513gi12, c68913Mk, i, new C27871Pc((byte) 10, new SSLException("Found unprocessed messages in handshake buffer."))) { // from class: X.3gM
                                public final int actionType;
                                public final InterfaceC68843Md entity;
                                public final C68853Me event;
                                public final C68913Mk transition;

                                {
                                    this.event = c68853Me;
                                    this.entity = c76513gi12;
                                    this.actionType = i;
                                    this.transition = c68913Mk;
                                }
                            };
                        }
                    }
                    InterfaceC27881Pd A004 = C03M.A00();
                    A004.AEk((byte[]) c76513gi12.A0U.get("server_app_key"), (byte[]) c76513gi12.A0U.get("server_app_iv"));
                    c76513gi12.A0A = new C76493gg(c76513gi12.A0M, c76513gi12.A08, A004);
                    return;
                }
                throw new C68883Mh("Master Secret is null", c68853Me, c76513gi12, c68913Mk, i, new C27871Pc((byte) 80, new SSLException("Master Secret is null"))) { // from class: X.3gM
                    public final int actionType;
                    public final InterfaceC68843Md entity;
                    public final C68853Me event;
                    public final C68913Mk transition;

                    {
                        this.event = c68853Me;
                        this.entity = c76513gi12;
                        this.actionType = i;
                        this.transition = c68913Mk;
                    }
                };
            } catch (C27871Pc e21) {
                throw new C68883Mh("Failed to derive resumption keys", c68853Me, c76513gi12, c68913Mk, i, e21) { // from class: X.3gM
                    public final int actionType;
                    public final InterfaceC68843Md entity;
                    public final C68853Me event;
                    public final C68913Mk transition;

                    {
                        this.event = c68853Me;
                        this.entity = c76513gi12;
                        this.actionType = i;
                        this.transition = c68913Mk;
                    }
                };
            }
        } else if (this instanceof C76363gT) {
            C76513gi c76513gi13 = (C76513gi) interfaceC68843Md;
            c76513gi13.A0C.A02 = System.currentTimeMillis();
            try {
                byte[] A015 = c76513gi13.A0D.A01();
                byte[] A043 = c76513gi13.A0G.A00.A04(c76513gi13.A0m, c76513gi13.A0h);
                int i13 = c76513gi13.A02;
                byte[] bArr31 = new byte[i13];
                WtCachedPsk wtCachedPsk2 = c76513gi13.A0C.A03;
                if (wtCachedPsk2 != null && c76513gi13.A0g) {
                    bArr31 = wtCachedPsk2.pskVal;
                }
                byte[] A005 = c76513gi13.A09.A00(new byte[i13], bArr31);
                c76513gi13.A0U.put("early_secret", A005);
                MessageDigest messageDigest = MessageDigest.getInstance(c76513gi13.A0P);
                byte[] A016 = c76513gi13.A09.A01(A005, C40841sx.A0q("derived", messageDigest.digest(), c76513gi13.A02), c76513gi13.A02);
                c76513gi13.A0U.put("derived_secret", A016);
                byte[] A006 = c76513gi13.A09.A00(A016, A043);
                c76513gi13.A0U.put("handshake_secret", A006);
                byte[] A017 = c76513gi13.A09.A01(A006, C40841sx.A0q("c hs traffic", A015, c76513gi13.A02), c76513gi13.A02);
                c76513gi13.A0U.put("client_hs_traffic_secret", A017);
                byte[] A018 = c76513gi13.A09.A01(A006, C40841sx.A0q("s hs traffic", A015, c76513gi13.A02), c76513gi13.A02);
                c76513gi13.A0U.put("server_hs_traffic_secret", A018);
                c76513gi13.A0U.put("derived_secret", c76513gi13.A09.A01(A006, C40841sx.A0q("derived", messageDigest.digest(), c76513gi13.A02), c76513gi13.A02));
                C3MY c3my5 = c76513gi13.A09;
                byte[] bArr32 = new byte[0];
                if (c76513gi13.A0F != null) {
                    byte[] A0q5 = C40841sx.A0q("key", bArr32, 16);
                    if (c76513gi13.A0F != null) {
                        c76513gi13.A0U.put("client_hs_key", c3my5.A01(A017, A0q5, 16));
                        C3MY c3my6 = c76513gi13.A09;
                        byte[] bArr33 = new byte[0];
                        if (c76513gi13.A0F != null) {
                            byte[] A0q6 = C40841sx.A0q("iv", bArr33, 12);
                            if (c76513gi13.A0F != null) {
                                c76513gi13.A0U.put("client_hs_iv", c3my6.A01(A017, A0q6, 12));
                                C3MY c3my7 = c76513gi13.A09;
                                byte[] bArr34 = new byte[0];
                                if (c76513gi13.A0F != null) {
                                    byte[] A0q7 = C40841sx.A0q("key", bArr34, 16);
                                    if (c76513gi13.A0F != null) {
                                        byte[] A019 = c3my7.A01(A018, A0q7, 16);
                                        c76513gi13.A0U.put("server_hs_key", A019);
                                        C3MY c3my8 = c76513gi13.A09;
                                        byte[] bArr35 = new byte[0];
                                        if (c76513gi13.A0F != null) {
                                            byte[] A0q8 = C40841sx.A0q("iv", bArr35, 12);
                                            if (c76513gi13.A0F != null) {
                                                byte[] A0110 = c3my8.A01(A018, A0q8, 12);
                                                c76513gi13.A0U.put("server_hs_iv", A0110);
                                                c76513gi13.A0U.put("client_finished", c76513gi13.A09.A01(A017, C40841sx.A0q("finished", new byte[0], c76513gi13.A02), c76513gi13.A02));
                                                c76513gi13.A0U.put("server_finished", c76513gi13.A09.A01(A018, C40841sx.A0q("finished", new byte[0], c76513gi13.A02), c76513gi13.A02));
                                                InterfaceC27881Pd A007 = C03M.A00();
                                                A007.AEk(A019, A0110);
                                                AbstractC69023Mv abstractC69023Mv3 = c76513gi13.A0A;
                                                if (abstractC69023Mv3 != null) {
                                                    if (abstractC69023Mv3.A00.available() > 0) {
                                                        throw new C68883Mh("Unexpected Messages: Found pending handshake messages", c68853Me, c76513gi13, c68913Mk, i, new C27871Pc((byte) 10, new SSLException("Found unprocessed messages in handshake buffer."))) { // from class: X.3gM
                                                            public final int actionType;
                                                            public final InterfaceC68843Md entity;
                                                            public final C68853Me event;
                                                            public final C68913Mk transition;

                                                            {
                                                                this.event = c68853Me;
                                                                this.entity = c76513gi13;
                                                                this.actionType = i;
                                                                this.transition = c68913Mk;
                                                            }
                                                        };
                                                    }
                                                }
                                                c76513gi13.A0A = new C76493gg(c76513gi13.A0M, c76513gi13.A08, A007);
                                                return;
                                            }
                                            throw null;
                                        }
                                        throw null;
                                    }
                                    throw null;
                                }
                                throw null;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            } catch (C27871Pc e22) {
                throw new C68883Mh("Failed in action handshake traffic keys", c68853Me, c76513gi13, c68913Mk, i, e22) { // from class: X.3gM
                    public final int actionType;
                    public final InterfaceC68843Md entity;
                    public final C68853Me event;
                    public final C68913Mk transition;

                    {
                        this.event = c68853Me;
                        this.entity = c76513gi13;
                        this.actionType = i;
                        this.transition = c68913Mk;
                    }
                };
            } catch (NoSuchAlgorithmException e23) {
                throw new C68883Mh(C000200d.A0L(new StringBuilder(), c76513gi13.A0P, " algorithm not found"), c68853Me, c76513gi13, c68913Mk, i, new C27871Pc((byte) 80, new SSLException(e23))) { // from class: X.3gM
                    public final int actionType;
                    public final InterfaceC68843Md entity;
                    public final C68853Me event;
                    public final C68913Mk transition;

                    {
                        this.event = c68853Me;
                        this.entity = c76513gi13;
                        this.actionType = i;
                        this.transition = c68913Mk;
                    }
                };
            }
        } else if (this instanceof C76353gS) {
            C76513gi c76513gi14 = (C76513gi) interfaceC68843Md;
            C27891Pf c27891Pf5 = c76513gi14.A0C;
            c27891Pf5.A02 = System.currentTimeMillis();
            try {
                byte[] A008 = c76513gi14.A09.A00(new byte[c76513gi14.A02], c27891Pf5.A03.pskVal);
                c76513gi14.A0U.put("early_secret", A008);
                byte[] A0111 = c76513gi14.A09.A01(A008, C40841sx.A0q("c e traffic", c76513gi14.A0D.A01(), c76513gi14.A02), c76513gi14.A02);
                c76513gi14.A0U.put("client_early_traffic_secret", A0111);
                C3MY c3my9 = c76513gi14.A09;
                byte[] bArr36 = new byte[0];
                if (c76513gi14.A0F != null) {
                    byte[] A0q9 = C40841sx.A0q("key", bArr36, 16);
                    if (c76513gi14.A0F != null) {
                        byte[] A0112 = c3my9.A01(A0111, A0q9, 16);
                        C3MY c3my10 = c76513gi14.A09;
                        byte[] bArr37 = new byte[0];
                        if (c76513gi14.A0F != null) {
                            byte[] A0q10 = C40841sx.A0q("iv", bArr37, 12);
                            if (c76513gi14.A0F != null) {
                                byte[] A0113 = c3my10.A01(A0111, A0q10, 12);
                                InterfaceC27881Pd A009 = C03M.A00();
                                A009.AEk(A0112, A0113);
                                c76513gi14.A0B = new C76503gh(c76513gi14.A0N, A009);
                                return;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            } catch (C27871Pc e24) {
                throw new C68883Mh("Failed in action early data keys", c68853Me, c76513gi14, c68913Mk, i, e24) { // from class: X.3gM
                    public final int actionType;
                    public final InterfaceC68843Md entity;
                    public final C68853Me event;
                    public final C68913Mk transition;

                    {
                        this.event = c68853Me;
                        this.entity = c76513gi14;
                        this.actionType = i;
                        this.transition = c68913Mk;
                    }
                };
            }
        } else if (this instanceof C76343gR) {
            C76513gi c76513gi15 = (C76513gi) interfaceC68843Md;
            c76513gi15.A0C.A02 = System.currentTimeMillis();
            try {
                byte[] A0114 = c76513gi15.A0D.A01();
                byte[] bArr38 = (byte[]) c76513gi15.A0U.get("derived_secret");
                if (bArr38 != null) {
                    byte[] A0010 = c76513gi15.A09.A00(bArr38, new byte[c76513gi15.A02]);
                    c76513gi15.A0U.put("master_secret", A0010);
                    byte[] A0115 = c76513gi15.A09.A01(A0010, C40841sx.A0q("c ap traffic", A0114, c76513gi15.A02), c76513gi15.A02);
                    c76513gi15.A0U.put("client_app_traffic_secret", A0115);
                    C3MY c3my11 = c76513gi15.A09;
                    byte[] bArr39 = new byte[0];
                    if (c76513gi15.A0F != null) {
                        byte[] A0q11 = C40841sx.A0q("key", bArr39, 16);
                        if (c76513gi15.A0F != null) {
                            c76513gi15.A0U.put("client_app_key", c3my11.A01(A0115, A0q11, 16));
                            C3MY c3my12 = c76513gi15.A09;
                            byte[] bArr40 = new byte[0];
                            if (c76513gi15.A0F != null) {
                                byte[] A0q12 = C40841sx.A0q("iv", bArr40, 12);
                                if (c76513gi15.A0F != null) {
                                    c76513gi15.A0U.put("client_app_iv", c3my12.A01(A0115, A0q12, 12));
                                    byte[] A0116 = c76513gi15.A09.A01(A0010, C40841sx.A0q("s ap traffic", A0114, c76513gi15.A02), c76513gi15.A02);
                                    c76513gi15.A0U.put("server_app_traffic_secret", A0116);
                                    C3MY c3my13 = c76513gi15.A09;
                                    byte[] bArr41 = new byte[0];
                                    if (c76513gi15.A0F != null) {
                                        byte[] A0q13 = C40841sx.A0q("key", bArr41, 16);
                                        if (c76513gi15.A0F != null) {
                                            c76513gi15.A0U.put("server_app_key", c3my13.A01(A0116, A0q13, 16));
                                            C3MY c3my14 = c76513gi15.A09;
                                            byte[] bArr42 = new byte[0];
                                            if (c76513gi15.A0F != null) {
                                                byte[] A0q14 = C40841sx.A0q("iv", bArr42, 12);
                                                if (c76513gi15.A0F != null) {
                                                    c76513gi15.A0U.put("server_app_iv", c3my14.A01(A0116, A0q14, 12));
                                                    c76513gi15.A0U.put("exporter_master_secret", c76513gi15.A09.A01(A0010, C40841sx.A0q("exp master", A0114, c76513gi15.A02), c76513gi15.A02));
                                                    return;
                                                }
                                                throw null;
                                            }
                                            throw null;
                                        }
                                        throw null;
                                    }
                                    throw null;
                                }
                                throw null;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw new C68883Mh("Derived secret not found.", c68853Me, c76513gi15, c68913Mk, i, new C27871Pc((byte) 80, new SSLException("Derived secret not found."))) { // from class: X.3gM
                    public final int actionType;
                    public final InterfaceC68843Md entity;
                    public final C68853Me event;
                    public final C68913Mk transition;

                    {
                        this.event = c68853Me;
                        this.entity = c76513gi15;
                        this.actionType = i;
                        this.transition = c68913Mk;
                    }
                };
            } catch (C27871Pc e25) {
                throw new C68883Mh("Failed to derive app traffic keys", c68853Me, c76513gi15, c68913Mk, i, e25) { // from class: X.3gM
                    public final int actionType;
                    public final InterfaceC68843Md entity;
                    public final C68853Me event;
                    public final C68913Mk transition;

                    {
                        this.event = c68853Me;
                        this.entity = c76513gi15;
                        this.actionType = i;
                        this.transition = c68913Mk;
                    }
                };
            }
        } else if (this instanceof C76333gQ) {
            C76513gi c76513gi16 = (C76513gi) interfaceC68843Md;
            if (c68853Me instanceof C76553gm) {
                try {
                    ByteBuffer wrap10 = ByteBuffer.wrap(C40841sx.A0r((byte[]) c68853Me.A00));
                    if (((short) (((short) (wrap10.get() & 255)) | 0)) == 0) {
                        byte[] bArr43 = new byte[2];
                        wrap10.get(bArr43);
                        int A057 = C40841sx.A05(bArr43);
                        byte[] bArr44 = new byte[A057];
                        wrap10.get(bArr44);
                        HashMap hashMap3 = new HashMap();
                        ArrayList arrayList7 = new ArrayList();
                        ByteBuffer wrap11 = ByteBuffer.wrap(bArr44);
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < A057) {
                            short s4 = wrap11.getShort();
                            byte[] bArr45 = new byte[2];
                            wrap11.get(bArr45);
                            int A058 = C40841sx.A05(bArr45);
                            byte[] bArr46 = new byte[A058];
                            wrap11.get(bArr46);
                            arrayList7.add(new C68983Mr(s4, bArr46));
                            hashMap3.put(Short.valueOf(s4), Integer.valueOf(i15));
                            i15++;
                            i14 += A058 + 4;
                        }
                        if (i14 == A057) {
                            new ArrayList(arrayList7);
                            c76513gi16.A0X = true;
                            return;
                        }
                        throw new C27871Pc((byte) 80, new SSLException("Error while parsing extension"));
                    }
                    throw new C68883Mh("Certificate context is not expected", c68853Me, c76513gi16, c68913Mk, i, new C27871Pc((byte) 10, new SSLException("Certificate context is not expected."))) { // from class: X.3gM
                        public final int actionType;
                        public final InterfaceC68843Md entity;
                        public final C68853Me event;
                        public final C68913Mk transition;

                        {
                            this.event = c68853Me;
                            this.entity = c76513gi16;
                            this.actionType = i;
                            this.transition = c68913Mk;
                        }
                    };
                } catch (C27871Pc e26) {
                    throw new C68883Mh("Failed to process certificate request ", c68853Me, c76513gi16, c68913Mk, i, e26) { // from class: X.3gM
                        public final int actionType;
                        public final InterfaceC68843Md entity;
                        public final C68853Me event;
                        public final C68913Mk transition;

                        {
                            this.event = c68853Me;
                            this.entity = c76513gi16;
                            this.actionType = i;
                            this.transition = c68913Mk;
                        }
                    };
                }
            }
            throw new C68883Mh("Unexpected event type", c68853Me, c76513gi16, c68913Mk, i, new C27871Pc((byte) 80, new SSLException("Unexpected event"))) { // from class: X.3gM
                public final int actionType;
                public final InterfaceC68843Md entity;
                public final C68853Me event;
                public final C68913Mk transition;

                {
                    this.event = c68853Me;
                    this.entity = c76513gi16;
                    this.actionType = i;
                    this.transition = c68913Mk;
                }
            };
        } else if (this instanceof C76323gP) {
            C76513gi c76513gi17 = (C76513gi) interfaceC68843Md;
            c76513gi17.A0C.A02 = System.currentTimeMillis();
            if (c68853Me instanceof C76543gl) {
                C3MX c3mx2 = (C3MX) c68853Me.A00;
                try {
                    c76513gi17.A0B.A01((byte) 23, c3mx2.A02, c3mx2.A01, c3mx2.A00);
                    return;
                } catch (C27871Pc e27) {
                    throw new C68883Mh("App write failed.", c68853Me, c76513gi17, c68913Mk, i, e27) { // from class: X.3gM
                        public final int actionType;
                        public final InterfaceC68843Md entity;
                        public final C68853Me event;
                        public final C68913Mk transition;

                        {
                            this.event = c68853Me;
                            this.entity = c76513gi17;
                            this.actionType = i;
                            this.transition = c68913Mk;
                        }
                    };
                }
            }
            throw new C68883Mh("Unexpected event type", c68853Me, c76513gi17, c68913Mk, i, new C27871Pc((byte) 80, new SSLException("Unexpected event"))) { // from class: X.3gM
                public final int actionType;
                public final InterfaceC68843Md entity;
                public final C68853Me event;
                public final C68913Mk transition;

                {
                    this.event = c68853Me;
                    this.entity = c76513gi17;
                    this.actionType = i;
                    this.transition = c68913Mk;
                }
            };
        } else if (!(this instanceof C76313gO)) {
            ((C76513gi) interfaceC68843Md).A0C.A02 = System.currentTimeMillis();
        } else {
            C76513gi c76513gi18 = (C76513gi) interfaceC68843Md;
            c76513gi18.A0C.A02 = System.currentTimeMillis();
            if (c68853Me instanceof C76533gk) {
                byte[] bArr47 = (byte[]) c68853Me.A00;
                if (bArr47 != null) {
                    try {
                        ((C76273gK) c76513gi18.A07).A01(bArr47, bArr47.length);
                        return;
                    } catch (IOException e28) {
                        throw new C68883Mh("App read failed.", c68853Me, c76513gi18, c68913Mk, i, e28) { // from class: X.3gM
                            public final int actionType;
                            public final InterfaceC68843Md entity;
                            public final C68853Me event;
                            public final C68913Mk transition;

                            {
                                this.event = c68853Me;
                                this.entity = c76513gi18;
                                this.actionType = i;
                                this.transition = c68913Mk;
                            }
                        };
                    }
                }
                throw new C68883Mh("App read failed.", c68853Me, c76513gi18, c68913Mk, i, new SSLException("App read failed.")) { // from class: X.3gM
                    public final int actionType;
                    public final InterfaceC68843Md entity;
                    public final C68853Me event;
                    public final C68913Mk transition;

                    {
                        this.event = c68853Me;
                        this.entity = c76513gi18;
                        this.actionType = i;
                        this.transition = c68913Mk;
                    }
                };
            }
            throw new C68883Mh("Unexpected event type", c68853Me, c76513gi18, c68913Mk, i, new C27871Pc((byte) 80, new SSLException("Unexpected event"))) { // from class: X.3gM
                public final int actionType;
                public final InterfaceC68843Md entity;
                public final C68853Me event;
                public final C68913Mk transition;

                {
                    this.event = c68853Me;
                    this.entity = c76513gi18;
                    this.actionType = i;
                    this.transition = c68913Mk;
                }
            };
        }
    }
}
