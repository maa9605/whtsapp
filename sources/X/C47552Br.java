package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.ExecutionException;

/* renamed from: X.2Br  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47552Br {
    public static volatile C47552Br A08;
    public final C018508q A00;
    public final C0F2 A01;
    public final C01B A02;
    public final C0EL A03;
    public final C000400f A04;
    public final C04000Ia A05;
    public final C42451vl A06;
    public final C0IY A07;

    public C47552Br(C018508q c018508q, C0EL c0el, C01B c01b, C0IY c0iy, C000400f c000400f, C42451vl c42451vl, C04000Ia c04000Ia, C0F2 c0f2) {
        this.A00 = c018508q;
        this.A03 = c0el;
        this.A02 = c01b;
        this.A07 = c0iy;
        this.A04 = c000400f;
        this.A06 = c42451vl;
        this.A05 = c04000Ia;
        this.A01 = c0f2;
    }

    public static C47552Br A00() {
        if (A08 == null) {
            synchronized (C47552Br.class) {
                if (A08 == null) {
                    A08 = new C47552Br(C018508q.A00(), C0EL.A00(), C01B.A00(), C0IY.A00(), C000400f.A00(), C42451vl.A00(), C04000Ia.A00(), C0F2.A00());
                }
            }
        }
        return A08;
    }

    public File A01(C0JM c0jm, File file) {
        C04020Ic c04020Ic;
        final C2CM c2cm = new C2CM(this, c0jm, file);
        if (c2cm.A03.A06.A0B(null, null, new InterfaceC04070Ih() { // from class: X.2CN
            @Override // X.InterfaceC04070Ih
            public void AJX(boolean z) {
                if (z) {
                    C0Ml c0Ml = C2CM.this.A01;
                    c0Ml.A01 = new C04020Ic(0);
                    c0Ml.A02 = true;
                    c0Ml.A03.countDown();
                    return;
                }
                C0Ml c0Ml2 = C2CM.this.A01;
                c0Ml2.A01 = new C04020Ic(1);
                c0Ml2.A02 = true;
                c0Ml2.A03.countDown();
            }

            @Override // X.InterfaceC04070Ih
            public void AJY(C04020Ic c04020Ic2, C43211x2 c43211x2) {
                C0Ml c0Ml = C2CM.this.A01;
                c0Ml.A01 = c04020Ic2;
                c0Ml.A02 = true;
                c0Ml.A03.countDown();
            }
        }, false, c2cm.A00.A0B, c2cm)) {
            try {
                c04020Ic = (C04020Ic) c2cm.A01.get();
            } catch (InterruptedException | ExecutionException e) {
                Log.e("DuplicateStickerDownloadListener/waitForResult ", e);
                c04020Ic = new C04020Ic(1);
            }
        } else {
            c2cm.A59(c2cm);
            c04020Ic = c2cm.A01().A00;
        }
        if (c04020Ic.A02()) {
            return file;
        }
        return null;
    }
}
