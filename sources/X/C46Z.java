package X;

import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: X.46Z */
/* loaded from: classes3.dex */
public class C46Z extends AbstractC42201vM {
    public static final String A0F;
    public static final String A0G;
    public static final String A0H;
    public static volatile C46Z A0I;
    public C36531kx A00;
    public Long A01;
    public String A02;
    public boolean A03;
    public final C06F A04;
    public final C018508q A05;
    public final C0EL A06;
    public final C45X A07;
    public final AnonymousClass012 A08;
    public final C001200o A09;
    public final C000500h A0A;
    public final C002301c A0B;
    public final AnonymousClass011 A0C;
    public final C0DW A0D;
    public final C0GS A0E;

    static {
        StringBuilder A0P = C000200d.A0P("downloadable");
        String str = File.separator;
        String A0L = C000200d.A0L(A0P, str, "bloks_pay");
        A0F = A0L;
        StringBuilder sb = new StringBuilder();
        sb.append(A0L);
        A0G = C000200d.A0L(sb, str, "image");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A0L);
        A0H = C000200d.A0L(sb2, str, "layout");
    }

    public C46Z(C001200o c001200o, AnonymousClass012 anonymousClass012, C018508q c018508q, InterfaceC002901k interfaceC002901k, C0EL c0el, AnonymousClass011 anonymousClass011, C002301c c002301c, C45X c45x, AnonymousClass035 anonymousClass035, C41451tw c41451tw, C000500h c000500h, C0DW c0dw, C0GS c0gs) {
        super(c001200o, interfaceC002901k, anonymousClass035, c41451tw);
        this.A04 = new C06F(50);
        this.A09 = c001200o;
        this.A08 = anonymousClass012;
        this.A05 = c018508q;
        this.A06 = c0el;
        this.A0C = anonymousClass011;
        this.A0B = c002301c;
        this.A07 = c45x;
        this.A0A = c000500h;
        this.A0D = c0dw;
        this.A0E = c0gs;
        super.A00 = 15;
        super.A01 = 4;
    }

    @Override // X.AbstractC42201vM
    public String A01() {
        String str = (String) C45R.A00.get(C03650Gn.A01(this.A0A.A0H()).A02);
        return TextUtils.isEmpty(str) ? "default" : C000200d.A0H(str, "_p");
    }

    @Override // X.AbstractC42201vM
    public void A02() {
        C000500h c000500h = this.A0A;
        StringBuilder A0P = C000200d.A0P("2.21.9.15");
        A0P.append(C03650Gn.A01(c000500h.A0H()).A02);
        A0P.append(" ");
        A0P.append(this.A0B.A04());
        C000200d.A0i(c000500h, "bloks_version", A0P.toString());
    }

    @Override // X.AbstractC42201vM
    public boolean A03() {
        File A00;
        File A002 = A00(A0G);
        return (A002 == null || A002.list() == null || A002.list().length == 0 || (A00 = A00(A0H)) == null || A00.list() == null || A00.list().length == 0) ? false : true;
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.AbstractC42201vM
    public boolean A04(InputStream inputStream) {
        FileOutputStream fileOutputStream;
        File A00 = A00(A0F);
        if (A00 != null) {
            AnonymousClass024.A0g(A00);
        }
        File A002 = A00(A0G);
        File A003 = A00(A0H);
        if (A002 != null && A003 != null) {
            try {
                ZipInputStream zipInputStream = new ZipInputStream(new C43991yL(inputStream, this.A06, 0));
                while (true) {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry != null) {
                        String A0G2 = AnonymousClass024.A0G(nextEntry.getName());
                        StringBuilder sb = new StringBuilder();
                        sb.append(AnonymousClass024.A0H(nextEntry.getName()));
                        sb.append(".");
                        sb.append(A0G2);
                        String obj = sb.toString();
                        if ("png".equals(A0G2)) {
                            File A08 = AnonymousClass024.A08(A002.getCanonicalPath(), nextEntry.getName());
                            if (A08 == null) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("BloksAssetManager/store/malicious zip file: ");
                                sb2.append(nextEntry.getName());
                                Log.e(sb2.toString());
                                zipInputStream.close();
                                return false;
                            }
                            File parentFile = A08.getParentFile();
                            if (!parentFile.exists()) {
                                parentFile.mkdirs();
                            }
                            fileOutputStream = new FileOutputStream(A08);
                            try {
                                AnonymousClass024.A0V(zipInputStream, fileOutputStream);
                                fileOutputStream.close();
                            } finally {
                            }
                        } else if ("json".equals(A0G2)) {
                            fileOutputStream = new FileOutputStream(new File(A003.getAbsolutePath(), obj));
                            try {
                                AnonymousClass024.A0V(zipInputStream, fileOutputStream);
                                fileOutputStream.close();
                            } finally {
                                try {
                                    throw th;
                                } catch (Throwable th) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        zipInputStream.close();
                        return true;
                    }
                }
            } catch (IOException e) {
                Log.e("BloksAssetManager/store/Failed!", e);
                return false;
            }
        } else {
            Log.e("BloksAssetManager/store/Could not prepare resource subdirectory");
            return false;
        }
    }

    @Override // X.AbstractC42201vM
    public boolean A05(String str, byte[] bArr) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            byte[] decode = Base64.decode(str, 0);
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxj0ym0SqSduZYfRk73qv\nj3WfGfzt76TUqcSDwDURn4Qlw4mMIgmI+WOGASQw8A97Q9SeohkZzL29HPuOPceV\n+pkmBl7LQ+BnyxvifXkohvzITpWFEwkDLlrf4lVSm7mizW8tYq1M+b65TRXFQZPO\nhdowDrdrAwR1K/T+1yppCL1zrE8YOBQf3/gFGrdKRWmGiaq+/5Zf9NKT0b5+FFBu\nP+rKp/t9aMITn9JBOI9OxP6lALyibqgf8Lbe91dT0NZOZKF1Ps5foLBsURVr40v+\nG08E8ovPO7k64OPSW8CUsmlPU0yesEiU99YLMac8oWJAwbjlV/g9SmqmkHLRcq7w\nrwIDAQAB\n", 0))));
            signature.update(bArr);
            return signature.verify(decode);
        } catch (Exception e) {
            StringBuilder A0P = C000200d.A0P("BloksAssetManager/verifySignature: ");
            A0P.append(A01());
            A0P.append("Exception:");
            A0P.append(e);
            Log.e(A0P.toString());
            return false;
        }
    }

    public final C36531kx A06() {
        C36531kx c36531kx = new C36531kx();
        c36531kx.A02 = Long.valueOf(C03650Gn.A0D.A02.equals(C03650Gn.A01(this.A0A.A0H()).A02) ? 4 : 0);
        c36531kx.A05 = "2.21.9.15";
        c36531kx.A01 = Boolean.valueOf(this.A03);
        c36531kx.A06 = this.A02;
        return c36531kx;
    }

    public void A07(InterfaceC60602uk interfaceC60602uk) {
        int i = 0;
        while (!super.A06) {
            try {
                Thread.sleep(1000L);
                i++;
                if (i >= 5) {
                    if (interfaceC60602uk != null) {
                        C018508q c018508q = this.A05;
                        c018508q.A02.post(new RunnableEBaseShape0S0100000_I0_0(interfaceC60602uk, 44));
                        return;
                    }
                    return;
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
        if (interfaceC60602uk != null) {
            C018508q c018508q2 = this.A05;
            c018508q2.A02.post(new RunnableEBaseShape0S0100000_I0_0(interfaceC60602uk, 43));
        }
    }

    public void A08(String str, boolean z, InterfaceC60602uk interfaceC60602uk) {
        this.A03 = z;
        this.A02 = str;
        if (super.A07) {
            super.A05.AS1(new RunnableC56572nZ(this, interfaceC60602uk));
        } else if (super.A07) {
            if (interfaceC60602uk == null) {
                return;
            }
            interfaceC60602uk.AGr();
        } else {
            super.A07 = true;
            super.A06 = false;
            super.A05.ARy(new C0HS(super.A04, this, super.A03, interfaceC60602uk) { // from class: X.3AJ
                public final InterfaceC60602uk A01;
                public final AbstractC42201vM A02;
                public final C41451tw A03;
                public final AnonymousClass035 A04;
                public final C0J5 A05 = new C0J5(1, 1000);
                public boolean A00 = false;

                {
                    this.A04 = r6;
                    this.A02 = this;
                    this.A03 = r8;
                    this.A01 = interfaceC60602uk;
                    C46Z c46z = (C46Z) this;
                    c46z.A00 = c46z.A06();
                    c46z.A01 = Long.valueOf(c46z.A08.A05());
                    c46z.A0C.A07(c46z.A00);
                }

                /* JADX WARN: Removed duplicated region for block: B:147:0x010b  */
                /* JADX WARN: Removed duplicated region for block: B:180:0x00e0 A[SYNTHETIC] */
                @Override // X.C0HS
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.lang.Object A07(java.lang.Object[] r15) {
                    /*
                        Method dump skipped, instructions count: 343
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C3AJ.A07(java.lang.Object[]):java.lang.Object");
                }

                @Override // X.C0HS
                public void A09(Object obj) {
                    Boolean bool = (Boolean) obj;
                    this.A02.A07 = false;
                    InterfaceC60602uk interfaceC60602uk2 = this.A01;
                    if (interfaceC60602uk2 != null) {
                        if (bool.booleanValue()) {
                            interfaceC60602uk2.APE();
                        } else if (this.A00) {
                            interfaceC60602uk2.APe();
                        } else {
                            interfaceC60602uk2.AJo();
                        }
                    }
                }
            }, new Void[0]);
        }
    }

    public boolean A09() {
        StringBuilder sb = new StringBuilder("2.21.9.15");
        C000500h c000500h = this.A0A;
        sb.append(C03650Gn.A01(c000500h.A0H()).A02);
        sb.append(" ");
        sb.append(this.A0B.A04());
        return sb.toString().equals(c000500h.A00.getString("bloks_version", null));
    }
}
