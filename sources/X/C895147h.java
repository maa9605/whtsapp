package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Locale;
import javax.crypto.Cipher;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.47h  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C895147h {
    public static C90574Bn A08;
    public static C90594Bp A09;
    public C90584Bo A00;
    public InterfaceC895047g A01;
    public C4B0 A02;
    public final C0EU A03;
    public final C0GR A04;
    public final C0GS A05;
    public final C49682Lx A06;
    public final InterfaceC002901k A07;

    public C895147h(Context context, C018508q c018508q, C02L c02l, InterfaceC002901k interfaceC002901k, C49682Lx c49682Lx, C0EU c0eu, C0E7 c0e7, C463026g c463026g, C0GR c0gr, C0GS c0gs, C4CV c4cv, C28S c28s, C90564Bm c90564Bm, Context context2, InterfaceC895047g interfaceC895047g, C3NV c3nv) {
        this.A07 = interfaceC002901k;
        this.A06 = c49682Lx;
        this.A03 = c0eu;
        this.A04 = c0gr;
        this.A05 = c0gs;
        this.A01 = interfaceC895047g;
        if (C4B0.A02 == null) {
            synchronized (C4B0.class) {
                if (C4B0.A02 == null) {
                    C4B0.A02 = new C4B0();
                    C4B0.A01 = C90434Az.A00(context2);
                }
            }
        }
        this.A02 = C4B0.A02;
        c02l.A05();
        UserJid userJid = c02l.A03;
        if (userJid != null) {
            C4B0 c4b0 = this.A02;
            if (c4b0 != null) {
                String str = userJid.user;
                if (str != null) {
                    this.A00 = new C90584Bo(context, c018508q, interfaceC002901k, c49682Lx, c0e7, c463026g, c4cv, c28s, c90564Bm, c3nv, interfaceC895047g, c4b0, str);
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.4Bn, X.0HS] */
    public synchronized void A00() {
        final C49682Lx c49682Lx = this.A06;
        final C4B0 c4b0 = this.A02;
        final boolean z = this.A03.A04().getBoolean("payments_sandbox", false) ? false : true;
        final InterfaceC895047g interfaceC895047g = this.A01;
        final C90584Bo c90584Bo = this.A00;
        final C0GR c0gr = this.A04;
        final C0GS c0gs = this.A05;
        ?? r3 = new C0HS(c49682Lx, c4b0, z, interfaceC895047g, c90584Bo, c0gr, c0gs) { // from class: X.4Bn
            public final InterfaceC895047g A00;
            public final C0GR A01;
            public final C0GS A02;
            public final C49682Lx A03;
            public final String A04 = "initial";
            public final WeakReference A05;
            public final C4B0 A06;
            public final boolean A07;

            {
                this.A03 = c49682Lx;
                this.A06 = c4b0;
                this.A07 = z;
                this.A00 = interfaceC895047g;
                this.A05 = new WeakReference(c90584Bo);
                this.A01 = c0gr;
                this.A02 = c0gs;
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                byte[] bytes;
                if (this.A02 != null) {
                    C4B0 c4b02 = this.A06;
                    String str = this.A04;
                    String A02 = this.A03.A02();
                    boolean z2 = this.A07;
                    synchronized (c4b02) {
                        c4b02.A00.A07("onboarding", "getChallenge called", new C03630Gl[]{new C03630Gl("device_id", A02), new C03630Gl("challenge_type", str)});
                        byte[] bArr = new byte[32];
                        new SecureRandom().nextBytes(bArr);
                        String A0p = C02180Ae.A0p(bArr);
                        byte[] bArr2 = new byte[32];
                        new SecureRandom().nextBytes(bArr2);
                        String A0p2 = C02180Ae.A0p(bArr2);
                        if (str.equalsIgnoreCase("initial")) {
                            C4B0.A01.A06(A0p2, A0p);
                            StringBuilder sb = new StringBuilder();
                            sb.append(A0p);
                            sb.append("|");
                            sb.append(A0p2);
                            sb.append("|");
                            sb.append(A02);
                            String obj = sb.toString();
                            try {
                                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                                try {
                                    try {
                                        if (!z2) {
                                            bytes = "-----BEGIN CERTIFICATE-----\nMIID9zCCAt+gAwIBAgIJAIM6xLWVJlOZMA0GCSqGSIb3DQEBCwUAMIGRMQswCQYD\nVQQGEwJJTjESMBAGA1UECAwJVGFtaWxOYWR1MRAwDgYDVQQHDAdDaGVubmFpMQ0w\nCwYDVQQKDAROUENJMQwwCgYDVQQLDANVUEkxGzAZBgNVBAMMEnVwaXVhdC5ucGNp\nLm9yZy5pbjEiMCAGCSqGSIb3DQEJARYTdmliZWV0aEBucGNpLm9yZy5pbjAeFw0x\nNzEyMDcxMDQ2MjRaFw0yNzA5MDkxMDQ2MjRaMIGRMQswCQYDVQQGEwJJTjESMBAG\nA1UECAwJVGFtaWxOYWR1MRAwDgYDVQQHDAdDaGVubmFpMQ0wCwYDVQQKDAROUENJ\nMQwwCgYDVQQLDANVUEkxGzAZBgNVBAMMEnVwaXVhdC5ucGNpLm9yZy5pbjEiMCAG\nCSqGSIb3DQEJARYTdmliZWV0aEBucGNpLm9yZy5pbjCCASIwDQYJKoZIhvcNAQEB\nBQADggEPADCCAQoCggEBALjCsVn8tFnD6ffJrgVmusoaZm+mRmRkih0SDr9OVJSD\neU21D5eshHq4e1o9Picin7Dp7UXQFYZCyRkaB8B+oBBHhTR4Hu5D3mvwd93EAG6m\nt/Zpz+RdWmmU97YyZyq3yNVrptHK3W+3QDM37eCSCzhGvrN1IeznWBJf16exIrHU\nqCd+OQo9C03y2REM0XVRqL12a3ywcicrB9dVfbQ6yFb++Qv91J3cIx7dza6szQaF\nDIeVWURZHMLnm1AJISHneYL6MrCcHdMmBqwFFza1ySQ0wI+XYgrmrFsn1mUfZbF+\nZdeIXcRfpamnUf6YCCOdw1uaBMtizF4L7drv6pkppfMCAwEAAaNQME4wHQYDVR0O\nBBYEFOMI3fS6ZLwKnCvoH1xuEIWAy3eWMB8GA1UdIwQYMBaAFOMI3fS6ZLwKnCvo\nH1xuEIWAy3eWMAwGA1UdEwQFMAMBAf8wDQYJKoZIhvcNAQELBQADggEBAJ4YflNo\nezlsuRbr8asboMw5kH0F6VpmozNxkDGbwLFGx7cVZ5m9xpmPr2eOA4uk598mFJqv\nG+6fx3naM1s7WtaEXB4L9eHCv2nPdYKav6GrB7aabXb2Y5IasIG1aa7oX+V6aw0z\nYufLTIv3Awy7Qp6lgGDvnd0zL3wJqS3kY80CpOFhLwifpPXUA0NMBU6kg1+R0fex\njKAOiC9OkDXmj0Uljeb3AbwE3jZgonoIwcbP8rSc5hN3uxUJyIfNzEzAmHGraP0M\nTPqEocFcvnj8VFJPr94MSZ9CnVUwdLlXTiWYoGkBL6tngh9MSHEaocW1M64Wp85Y\nurWQmF18TeJcJ4k=\n-----END CERTIFICATE-----\n".getBytes("UTF-8");
                                        } else {
                                            bytes = "-----BEGIN CERTIFICATE-----\nMIIErDCCA5SgAwIBAgIKFzMa/spgXyVfATANBgkqhkiG9w0BAQsFADCB9zELMAkG\nA1UEBhMCSU4xRTBDBgNVBAoTPEluc3RpdHV0ZSBmb3IgRGV2ZWxvcG1lbnQgYW5k\nIFJlc2VhcmNoIGluIEJhbmtpbmcgVGVjaG5vbG9neTEdMBsGA1UECxMUQ2VydGlm\neWluZyBBdXRob3JpdHkxDzANBgNVBBETBjUwMDA1NzEXMBUGA1UECBMOQW5kaHJh\nIFByYWRlc2gxKTAnBgNVBAkTIFJvYWQgTm8uMSwgTWFzYWIgVGFuaywgSHlkZXJh\nYmFkMRUwEwYDVQQzEwxDYXN0bGUgSGlsbHMxFjAUBgNVBAMTDUlEUkJUIENBIDIw\nMTQwHhcNMTYwMzMxMTIwMzUyWhcNMTgwMzMxMTIwMzUyWjASMRAwDgYDVQQDEwd1\ncGlucGNpMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsqMattxoTibl\naGsAneFo5TgFfvRltQ2CqteIgUVJlLMz95P35Y+GQc2EOjVEO0L1OUd5IDTIBaqh\nrTqeWypOyna+CsHPqDRY0vsklCYizw/VQkdwLBZHMMhU4jL4wciE7qcf2kdyri6B\n135SzUF5IGPn4SnSkeB3IqHzneUrabP0lJweLF7IU5l9qtpPa6A5cH1iVKQT5YAI\n4NWH+3E/MRNKvdqgU1PILlOEaVB0vJZ1pBWW1aMaecoHfzC8/pTfM2PJ5s/CDbR0\n4xqX9/AYmkt34jMwBKvboyWjD1UgCkPnJd3SaZ4vDpA+nyTITM6uGOI6e6sv/b6v\ntF7nbM3H7wIDAQABo4IBHDCCARgwDgYDVR0PAQH/BAQDAgWgMB0GA1UdDgQWBBQq\nlITKolqdgylQXHZgJ1WJMLhvnDAfBgNVHSMEGDAWgBSAdQI0B9ReDs4FarWs8BBr\nQhsHxzAdBgNVHSUEFjAUBggrBgEFBQcDAQYIKwYBBQUHAwIwOAYDVR0gBDEwLzAt\nBgZggmRkAgMwIzAhBggrBgEFBQcCAjAVGhNDbGFzcyAzIENlcnRpZmljYXRlMBIG\nA1UdEQQLMAmCB3VwaW5wY2kwWQYDVR0fBFIwUDAkoCKgIIYeaHR0cDovLzEwLjAu\nNjUuNjUvY3JsXzI3QjAuY3JsMCigJqAkhiJodHRwOi8vaWRyYnRjYS5vcmcuaW4v\nY3JsXzI3QjAuY3JsMA0GCSqGSIb3DQEBCwUAA4IBAQB6Y1FmD1GRKdEW4GINYutM\njDxZmHy4HGFmkE3xZjQx9aDT34TpLSNpsg8jUF+nW/KUMb+nWKJuIRZESYfBSCS9\n2fP1AJAO+PKopJMep/weJ+6a0ydPeoKbqKYllTlmFy+DPC56/UuEBQ9iIX3n5RW9\nxZFTB3NFC9A8zhxCBTsxizElrP8Jd4s+I3+qzJIw9ZqGknDgipyYoi0GGx2mjfwH\npg4YQ4/2xjG2ZRQwkgEmcxy/NvbXz1NV5P5u7dit9SwX3gaAZybu2guIcLFcVEvw\n1VpioZlgPjr5RVhyGzX+tBS8rapTNG1C8A7ANLxpk3nqYzNh4XjhMm5EQ3oKDD9d\n-----END CERTIFICATE-----".getBytes("UTF-8");
                                        }
                                        PublicKey publicKey = certificateFactory.generateCertificate(new ByteArrayInputStream(bytes)).getPublicKey();
                                        if (obj.getBytes().length <= publicKey.getEncoded().length) {
                                            try {
                                                byte[] bytes2 = obj.getBytes();
                                                Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                                                cipher.init(1, publicKey);
                                                return Base64.encodeToString(cipher.doFinal(bytes2), 2);
                                            } catch (Exception e) {
                                                throw new RuntimeException(e);
                                            }
                                        }
                                        throw new IllegalArgumentException("RSA cannot encrypt data larger than key-size.");
                                    } catch (UnsupportedEncodingException e2) {
                                        throw new Error(e2);
                                    }
                                } catch (CertificateException e3) {
                                    throw new RuntimeException(e3);
                                }
                            } catch (CertificateException e4) {
                                throw new RuntimeException(e4);
                            }
                        } else if (str.equalsIgnoreCase("rotate")) {
                            C90434Az c90434Az = C4B0.A01;
                            String string = c90434Az.A02.A00.getString("k0", "");
                            if (c90434Az.A07()) {
                                string = c90434Az.A01("k0", "aes_k0", string);
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(A0p);
                            sb2.append("|");
                            sb2.append(A0p2);
                            sb2.append("|");
                            sb2.append(A02);
                            String encodeToString = Base64.encodeToString(C02180Ae.A1i(sb2.toString().getBytes(), C02180Ae.A1d(string)), 0);
                            C4B0.A01.A06(A0p2, A0p);
                            return encodeToString;
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Unsupported challenge type: ");
                            sb3.append(str);
                            throw new UnsupportedOperationException(sb3.toString());
                        }
                    }
                }
                throw null;
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    Log.i("PAY: IndiaUpiSetupCoordinator/challenge got");
                    final C90584Bo c90584Bo2 = (C90584Bo) this.A05.get();
                    if (c90584Bo2 != null) {
                        String str2 = this.A04;
                        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                            Log.i("PAY: IndiaUpiSetupCoordinator/getToken called");
                            if (!TextUtils.isEmpty(str)) {
                                c90584Bo2.A06.A03.A04();
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(new C04P("action", "upi-get-token", null, (byte) 0));
                                arrayList.add(new C04P("device-id", c90584Bo2.A07.A02(), null, (byte) 0));
                                arrayList.add(new C04P("token-type", str2.toUpperCase(Locale.US), null, (byte) 0));
                                C000200d.A1A("challenge", str, arrayList);
                                String A03 = c90584Bo2.A03.A03();
                                if (!TextUtils.isEmpty(A03)) {
                                    C000200d.A1A("provider-type", A03, arrayList);
                                }
                                C3NV c3nv = ((C48B) c90584Bo2).A00;
                                c3nv.A04("upi-get-token");
                                ((C48B) c90584Bo2).A01.A0F("set", new C02590Ca("account", (C04P[]) arrayList.toArray(new C04P[0]), null, null), new C91754Gd(c90584Bo2.A00, c90584Bo2.A01, c90584Bo2.A02, c90584Bo2.A05, c3nv) { // from class: X.4IB
                                    @Override // X.C91754Gd, X.C28V
                                    public void A02(C28Q c28q) {
                                        super.A02(c28q);
                                        C90584Bo c90584Bo3 = C90584Bo.this;
                                        c90584Bo3.A06.AG6(2, c28q);
                                        InterfaceC895047g interfaceC895047g2 = c90584Bo3.A04;
                                        if (interfaceC895047g2 != null) {
                                            interfaceC895047g2.AKo(false, c28q);
                                        }
                                    }

                                    @Override // X.C91754Gd, X.C28V
                                    public void A03(C28Q c28q) {
                                        super.A03(c28q);
                                        C90584Bo c90584Bo3 = C90584Bo.this;
                                        c90584Bo3.A06.AG6(2, c28q);
                                        InterfaceC895047g interfaceC895047g2 = c90584Bo3.A04;
                                        if (interfaceC895047g2 != null) {
                                            interfaceC895047g2.AKo(false, c28q);
                                        }
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r8v3, types: [X.4Bp, X.0HS] */
                                    @Override // X.C91754Gd, X.C28V
                                    public void A04(C02590Ca c02590Ca) {
                                        String str3;
                                        String encodeToString;
                                        super.A04(c02590Ca);
                                        C02590Ca A0D = c02590Ca.A0D("account");
                                        if (A0D != null) {
                                            C90584Bo.this.A06.AG6(2, null);
                                            C04P A0A = A0D.A0A("token");
                                            if (A0A != null) {
                                                str3 = A0A.A03;
                                            } else {
                                                str3 = null;
                                            }
                                            if (!TextUtils.isEmpty(str3)) {
                                                Log.i("PAY: IndiaUpiSetupCoordinator/token stored");
                                                C90564Bm c90564Bm = C90584Bo.this.A03;
                                                synchronized (c90564Bm) {
                                                    try {
                                                        String A06 = c90564Bm.A02.A06();
                                                        long A05 = c90564Bm.A00.A05();
                                                        JSONObject jSONObject = TextUtils.isEmpty(A06) ? new JSONObject() : new JSONObject(A06);
                                                        jSONObject.put("v", "2");
                                                        jSONObject.put("token", str3);
                                                        jSONObject.put("tokenTs", A05);
                                                        c90564Bm.A02.A0H(jSONObject.toString());
                                                    } catch (JSONException e) {
                                                        Log.w("PAY: IndiaUpiPaymentSharedPrefs storeToken threw: ", e);
                                                    }
                                                }
                                                byte[] decode = Base64.decode(str3, 0);
                                                InterfaceC895047g interfaceC895047g2 = C90584Bo.this.A04;
                                                if (interfaceC895047g2 != null) {
                                                    interfaceC895047g2.AKo(true, null);
                                                }
                                                C90584Bo c90584Bo3 = C90584Bo.this;
                                                C4B0 c4b02 = c90584Bo3.A0A;
                                                String str4 = c90584Bo3.A09;
                                                InterfaceC895047g interfaceC895047g3 = c90584Bo3.A04;
                                                InterfaceC002901k interfaceC002901k = c90584Bo3.A08;
                                                C49682Lx c49682Lx2 = c90584Bo3.A07;
                                                synchronized (C895147h.class) {
                                                    String A02 = c49682Lx2.A02();
                                                    try {
                                                        StringBuilder sb = new StringBuilder();
                                                        sb.append("com.whatsapp");
                                                        sb.append("|");
                                                        sb.append(str4);
                                                        sb.append("|");
                                                        sb.append(A02);
                                                        encodeToString = Base64.encodeToString(C02180Ae.A1i(C02180Ae.A1e(sb.toString()), decode), 2);
                                                    } catch (Exception e2) {
                                                        Log.e("PAY: IndiaUpiSetupCoordinator/registerApp threw: ", e2);
                                                    }
                                                    if (encodeToString != null) {
                                                        C000700j.A07(TextUtils.isEmpty("com.whatsapp") ? false : true);
                                                        C000700j.A07(TextUtils.isEmpty(str4) ? false : true);
                                                        C000700j.A07(TextUtils.isEmpty(A02) ? false : true);
                                                        C000700j.A07(TextUtils.isEmpty(encodeToString) ? false : true);
                                                        ?? r8 = new C0HS(c49682Lx2, c4b02, encodeToString, str4, interfaceC895047g3) { // from class: X.4Bp
                                                            public final InterfaceC895047g A00;
                                                            public final C49682Lx A01;
                                                            public final String A02;
                                                            public final String A03;
                                                            public final C4B0 A04;

                                                            {
                                                                this.A01 = c49682Lx2;
                                                                this.A02 = encodeToString;
                                                                this.A04 = c4b02;
                                                                this.A03 = str4;
                                                                this.A00 = interfaceC895047g3;
                                                            }

                                                            @Override // X.C0HS
                                                            public Object A07(Object[] objArr) {
                                                                C4B0 c4b03 = this.A04;
                                                                String str5 = this.A03;
                                                                String A022 = this.A01.A02();
                                                                String str6 = this.A02;
                                                                c4b03.A00.A07("onboarding", "registerApp called", new C03630Gl[]{new C03630Gl("app_id", A022), new C03630Gl("mobile", str5), new C03630Gl("device_id", A022)});
                                                                C90434Az c90434Az = C4B0.A01;
                                                                String string = c90434Az.A02.A00.getString("token", "");
                                                                if (c90434Az.A07()) {
                                                                    string = c90434Az.A01("token", "aes_token", string);
                                                                }
                                                                String encodeToString2 = Base64.encodeToString(C02180Ae.A1h(Base64.decode(str6, 0), C02180Ae.A1d(string)), 0);
                                                                StringBuilder sb2 = new StringBuilder("com.whatsapp");
                                                                sb2.append("|");
                                                                sb2.append(str5);
                                                                sb2.append("|");
                                                                sb2.append(A022);
                                                                return Boolean.valueOf(Base64.encodeToString(C02180Ae.A1e(sb2.toString()), 0).equalsIgnoreCase(encodeToString2));
                                                            }

                                                            @Override // X.C0HS
                                                            public void A09(Object obj2) {
                                                                Boolean bool = (Boolean) obj2;
                                                                InterfaceC895047g interfaceC895047g4 = this.A00;
                                                                if (interfaceC895047g4 != null) {
                                                                    StringBuilder sb2 = new StringBuilder("PAY: IndiaUpiSetupCoordinator/registered: ");
                                                                    sb2.append(bool);
                                                                    Log.i(sb2.toString());
                                                                    interfaceC895047g4.ANj(bool.booleanValue());
                                                                }
                                                                C895147h.A09 = null;
                                                            }
                                                        };
                                                        C895147h.A09 = r8;
                                                        interfaceC002901k.ARy(r8, new Void[0]);
                                                    }
                                                    Log.w("PAY: IndiaUpiSetupCoordinator/registerApp got null intent");
                                                    if (interfaceC895047g3 != null) {
                                                        interfaceC895047g3.ANj(false);
                                                    }
                                                }
                                                return;
                                            }
                                            InterfaceC895047g interfaceC895047g4 = C90584Bo.this.A04;
                                            if (interfaceC895047g4 != null) {
                                                interfaceC895047g4.AKo(false, null);
                                                return;
                                            }
                                            return;
                                        }
                                        Log.e("PAY: IndiaUpiSetupCoordinator/token missing account node");
                                        InterfaceC895047g interfaceC895047g5 = C90584Bo.this.A04;
                                        if (interfaceC895047g5 != null) {
                                            interfaceC895047g5.AKo(false, null);
                                        }
                                    }
                                }, 0L);
                            }
                        } else {
                            StringBuilder sb = new StringBuilder("PAY: IndiaUpiSetupCoordinator/getToken called with invalid type: ");
                            sb.append(str2);
                            sb.append(" challenge: ");
                            sb.append(str);
                            Log.i(sb.toString());
                        }
                    }
                } else {
                    InterfaceC895047g interfaceC895047g2 = this.A00;
                    if (interfaceC895047g2 != null) {
                        interfaceC895047g2.AKi();
                    }
                }
                C895147h.A08 = null;
            }
        };
        A08 = r3;
        this.A07.ARy(r3, new Void[0]);
    }
}
