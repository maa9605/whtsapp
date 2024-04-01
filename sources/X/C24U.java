package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* renamed from: X.24U  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C24U extends C0L1 {
    public final C01B A00;
    public final C0EL A01;
    public final C000400f A02;
    public final C04000Ia A03;
    public final C0IY A04;

    public C24U(C0EL c0el, C01B c01b, C0IY c0iy, C000400f c000400f, C04000Ia c04000Ia, Executor executor) {
        super(executor);
        this.A01 = c0el;
        this.A00 = c01b;
        this.A04 = c0iy;
        this.A02 = c000400f;
        this.A03 = c04000Ia;
    }

    @Override // X.C0L1
    public InterfaceC63142zC A02(Object obj, final C0L2 c0l2) {
        C63152zE c63152zE = (C63152zE) obj;
        final C2zD c2zD = new C2zD(c63152zE.A02, new C3GC(this.A02, c63152zE.A03), c63152zE.A04, c63152zE.A05, c63152zE.A01);
        final C0EL c0el = this.A01;
        final C01B c01b = this.A00;
        final C0IY c0iy = this.A04;
        final C04000Ia c04000Ia = this.A03;
        final C63132zB c63132zB = c63152zE.A00;
        return new InterfaceC63142zC(c0el, c01b, c0iy, c04000Ia, c2zD, c0l2, c63132zB) { // from class: X.3G8
            public final C3GA A00;
            public final C3GB A01;

            {
                C3GB c3gb = new C3GB(c2zD.A00, c2zD.A03, c2zD.A04, c2zD.A01);
                this.A01 = c3gb;
                this.A00 = new C3GA(c0el, c01b, c0iy, c04000Ia, new C63162zF(c2zD.A02, c3gb), c0l2, c63132zB);
            }

            @Override // X.InterfaceC63142zC
            public C24V A7S() {
                C24V A7S = this.A00.A7S();
                C04020Ic c04020Ic = A7S.A00;
                if (c04020Ic.A02()) {
                    C3GB c3gb = this.A01;
                    String str = c3gb.A03;
                    MessageDigest messageDigest = c3gb.A04;
                    if (messageDigest == null) {
                        C000200d.A15("MMS download failed in verifyFileSha256 with Exception; plainFileHash=", str);
                    } else if (!Arrays.equals(messageDigest.digest(), Base64.decode(str, 0))) {
                        StringBuilder A0W = C000200d.A0W("MMS download failed during media decryption due to plaintext hash mismatch; mediaHash=", str, "; calculatedHash=");
                        A0W.append(Base64.encodeToString(messageDigest.digest(), 2));
                        Log.w(A0W.toString());
                    }
                    Log.e("encrypteddownloadtransfer/download/hash verification fail");
                    return new C24V(new C04020Ic(7, c04020Ic.A03, c04020Ic.A04));
                }
                return A7S;
            }

            @Override // X.InterfaceC63142zC
            public void cancel() {
                this.A00.A07.cancel(true);
            }
        };
    }
}
