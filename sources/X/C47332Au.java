package X;

import com.whatsapp.util.Log;

/* renamed from: X.2Au  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47332Au extends AbstractC05360Ok {
    public static volatile C47332Au A03;
    public boolean A00;
    public final C01B A01;
    public final C000500h A02;

    public C47332Au(C01B c01b, C000500h c000500h) {
        this.A01 = c01b;
        this.A02 = c000500h;
    }

    public static C47332Au A00() {
        if (A03 == null) {
            synchronized (C47332Au.class) {
                if (A03 == null) {
                    A03 = new C47332Au(C01B.A00(), C000500h.A00());
                }
            }
        }
        return A03;
    }

    @Override // X.AbstractC05360Ok
    public void A01() {
        if (this.A00 || !this.A01.A0E(C01C.A2U)) {
            return;
        }
        Log.i("ViewOnceMessageServerPropsObserver/view once read enabled");
        C000200d.A0j(this.A02, "future_proof_processing_needed", true);
        this.A00 = true;
    }

    @Override // X.AbstractC05360Ok
    public void A02() {
        this.A00 = this.A01.A0E(C01C.A2U);
    }
}
