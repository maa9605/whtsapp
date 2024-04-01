package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* renamed from: X.1xJ */
/* loaded from: classes2.dex */
public class C43381xJ {
    public static final C43511xW A06 = new C43511xW(4, 5);
    public static volatile C43381xJ A07;
    public final AbstractC000600i A00;
    public final AnonymousClass012 A01;
    public final C05Q A02;
    public final C02C A03;
    public final C42591vz A04;
    public final SecureRandom A05 = new SecureRandom();

    public C43381xJ(AnonymousClass012 anonymousClass012, AbstractC000600i abstractC000600i, C05Q c05q, C42591vz c42591vz, C02C c02c) {
        this.A01 = anonymousClass012;
        this.A00 = abstractC000600i;
        this.A02 = c05q;
        this.A03 = c02c;
        this.A04 = c42591vz;
    }

    public static final C43541xZ A00(InputStream inputStream, C42621w3 c42621w3, int i) {
        try {
            C43521xX c43521xX = new C43521xX(inputStream, c42621w3, i);
            do {
            } while (c43521xX.read(new byte[8192]) >= 0);
            C43541xZ c43541xZ = c43521xX.A04;
            c43521xX.close();
            return c43541xZ;
        } catch (IOException e) {
            Log.e("mediaupload/calculate-sidecar/ioexception", e);
            throw e;
        }
    }

    public static final String A01() {
        try {
            byte[] bArr = new byte[32];
            SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
            return Base64.encodeToString(bArr, 2);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public C43561xb A02(InterfaceC43551xa interfaceC43551xa, File file, int[] iArr) {
        if (file != null) {
            FileInputStream A0I = C0DD.A0I(file);
            this.A03.A07(A0I);
            long A00 = C43141wv.A00(iArr);
            if (A00 == -1) {
                return A04(new BufferedInputStream(A0I), interfaceC43551xa);
            }
            C43571xc c43571xc = new C43571xc(new BufferedInputStream(A0I), MessageDigest.getInstance("SHA-256"));
            C43571xc c43571xc2 = new C43571xc(new C43351xG(c43571xc, A00), MessageDigest.getInstance("SHA-256"));
            return new C43561xb(this, c43571xc, new C43571xc(interfaceC43551xa.A7a(new C43581xd(c43571xc2, c43571xc)), MessageDigest.getInstance("SHA-256")), c43571xc2);
        }
        throw null;
    }

    public C43561xb A03(C04150It c04150It, InterfaceC43551xa interfaceC43551xa, File file) {
        C43591xe c43591xe = c04150It.A02;
        if (!c43591xe.A0A) {
            C43571xc c43571xc = new C43571xc(A06(c04150It, file), MessageDigest.getInstance("SHA-256"));
            return new C43561xb(this, c43571xc, c43571xc);
        }
        int[] iArr = c43591xe.A0E;
        if (iArr != null && iArr.length > 0) {
            return A02(interfaceC43551xa, file, iArr);
        }
        return A04(A06(c04150It, file), interfaceC43551xa);
    }

    public C43561xb A04(InputStream inputStream, InterfaceC43551xa interfaceC43551xa) {
        C43571xc c43571xc = new C43571xc(inputStream, MessageDigest.getInstance("SHA-256"));
        return new C43561xb(this, c43571xc, new C43571xc(interfaceC43551xa.A7a(c43571xc), MessageDigest.getInstance("SHA-256")));
    }

    public C43641xj A05(C43601xf c43601xf, C04150It c04150It, InterfaceC43611xg interfaceC43611xg) {
        C43571xc c43571xc;
        C43561xb A03 = A03(c04150It, interfaceC43611xg.A9w(c43601xf.A00.A01), c04150It.A03());
        try {
            byte[] bArr = new byte[16384];
            do {
                c43571xc = A03.A00;
            } while (c43571xc.read(bArr) >= 0);
            return new C43641xj(new C43631xi(A03.A02.A00(), false), new C43631xi(c43571xc.A00(), false), c43601xf);
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A03.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final InputStream A06(C04150It c04150It, File file) {
        if (c04150It instanceof C43651xk) {
            final C43651xk c43651xk = (C43651xk) c04150It;
            return new FileInputStream(c04150It.A03()) { // from class: X.1xl
                public long A00;

                @Override // java.io.FileInputStream, java.io.InputStream
                public int read(byte[] bArr, int i, int i2) {
                    while (getChannel().size() < this.A00 + i2 && (!c43651xk.A01)) {
                        try {
                            Thread.sleep(200L);
                        } catch (InterruptedException unused) {
                            return 0;
                        }
                    }
                    int read = super.read(bArr, i, i2);
                    if (read >= 0) {
                        this.A00 += read;
                    }
                    return read;
                }
            };
        } else if (file != null) {
            FileInputStream A0I = C0DD.A0I(file);
            C0DC c0dc = c04150It.A02.A05;
            if (c0dc != C0DC.A0I && c0dc != C0DC.A08 && c0dc != C0DC.A0B && c0dc != C0DC.A0O && c0dc != C0DC.A09) {
                this.A03.A07(A0I);
            }
            return new BufferedInputStream(A0I);
        } else {
            throw null;
        }
    }

    public String A07(C0DC c0dc, File file, boolean z) {
        C000700j.A07(A08(c0dc, file, z));
        if (C0DC.A05 == c0dc || C0DC.A0D == c0dc) {
            if (z) {
                return C42591vz.A0B(A06);
            }
            return C42591vz.A0B(C42591vz.A05(file));
        } else if (C0DC.A0N == c0dc || C0DC.A04 == c0dc || C0DC.A0Q == c0dc) {
            return C42591vz.A0A(this.A00, file);
        } else {
            return null;
        }
    }

    public boolean A08(C0DC c0dc, File file, boolean z) {
        if (C0DC.A05 == c0dc || C0DC.A0D == c0dc) {
            return z || this.A04.A0J(file);
        } else if (C0DC.A0N == c0dc || C0DC.A04 == c0dc || C0DC.A0Q == c0dc) {
            return this.A04.A0K(file);
        } else {
            return true;
        }
    }
}
