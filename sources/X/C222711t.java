package X;

import android.app.Application;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: X.11t  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C222711t extends C0R9 implements InterfaceC04070Ih {
    public final long A00;
    public final C04470Kh A01;
    public final C001200o A02;
    public final C0HA A03;
    public final C27851Pa A04;
    public final C0CG A05;
    public final String A06;
    public volatile File A07;
    public volatile boolean A08;

    public C222711t(long j, String str, C0CG c0cg, C001200o c001200o, C0EL c0el, C01B c01b, C27851Pa c27851Pa, C0IY c0iy, C000400f c000400f, C0HA c0ha, C04470Kh c04470Kh, C04000Ia c04000Ia) {
        super(c0el, c01b, c0iy, c000400f, c04000Ia);
        this.A00 = j;
        this.A06 = str;
        this.A05 = c0cg;
        this.A02 = c001200o;
        this.A04 = c27851Pa;
        this.A03 = c0ha;
        this.A01 = c04470Kh;
        A59(this);
    }

    @Override // X.C0L1
    public C43211x2 A00(C04020Ic c04020Ic) {
        return new C43211x2();
    }

    @Override // X.C0L1
    public Object A03() {
        this.A08 = true;
        C27851Pa c27851Pa = this.A04;
        String str = c27851Pa.A04;
        C1MF c1mf = new C1MF(null, "ppic", null, str, null);
        File A01 = C04490Kj.A01(this.A02.A00, c27851Pa.A05, str);
        this.A07 = A01;
        return new C63172zG(c1mf, A01, C0DC.A0A);
    }

    public final void A05(boolean z) {
        if (z) {
            Application application = this.A02.A00;
            C27851Pa c27851Pa = this.A04;
            File A01 = C04490Kj.A01(application, c27851Pa.A05, c27851Pa.A04);
            if (A01.exists()) {
                A01.delete();
            }
        } else {
            this.A07.delete();
        }
        this.A05.A54(this.A06);
        this.A08 = false;
    }

    @Override // X.InterfaceC04070Ih
    public void AJX(boolean z) {
        A05(true);
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.InterfaceC04070Ih
    public void AJY(C04020Ic c04020Ic, C43211x2 c43211x2) {
        int i;
        Double d;
        FileInputStream fileInputStream;
        if (c04020Ic.A02()) {
            int length = (int) this.A07.length();
            byte[] bArr = new byte[length];
            try {
                fileInputStream = new FileInputStream(this.A07);
            } catch (FileNotFoundException e) {
                Log.w("ProfilePictureDownload: Could not find picture download file", e);
            } catch (IOException e2) {
                Log.w("ProfilePictureDownload: IO Exception while reading the picture download file", e2);
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                bufferedInputStream.read(bArr, 0, length);
                bufferedInputStream.close();
                fileInputStream.close();
                C27851Pa c27851Pa = this.A04;
                c27851Pa.A00 = bArr;
                C04470Kh c04470Kh = this.A01;
                c04470Kh.A00.A00.post(new C1NN(c04470Kh, c27851Pa));
                i = 1;
            } finally {
            }
        } else {
            i = 6;
            if (C04020Ic.A01(c04020Ic.A01)) {
                i = 4;
            }
        }
        C0HA c0ha = this.A03;
        int i2 = this.A04.A02 == 1 ? 2 : 1;
        Long valueOf = Long.valueOf(SystemClock.elapsedRealtime() - this.A00);
        if (this.A07 != null) {
            d = Double.valueOf(this.A07.length());
        } else {
            d = null;
        }
        c0ha.A02(i, i2, valueOf, d);
        A05(false);
    }
}
