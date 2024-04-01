package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.qrcode.contactqr.ErrorDialogFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.3wV  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C85933wV extends AbstractC52172aB {
    public final int A00;
    public final AnonymousClass075 A01;
    public final C0E7 A02;
    public final WeakReference A03;
    public final boolean A04;

    public C85933wV(C018508q c018508q, InterfaceC002901k interfaceC002901k, AnonymousClass011 anonymousClass011, C05Y c05y, C05W c05w, C04480Ki c04480Ki, C2L9 c2l9, C0E7 c0e7, AnonymousClass075 anonymousClass075, C41681uL c41681uL, String str, int i, int i2, C50692Su c50692Su) {
        super(c018508q, interfaceC002901k, anonymousClass011, c05y, c05w, c04480Ki, c2l9, c41681uL, str, i);
        this.A02 = c0e7;
        this.A01 = anonymousClass075;
        this.A03 = new WeakReference(c50692Su);
        this.A00 = i2;
        this.A04 = c50692Su.A00;
    }

    @Override // X.AbstractC52172aB
    public void A01() {
        AbstractC50702Sv abstractC50702Sv = (AbstractC50702Sv) this.A03.get();
        if (abstractC50702Sv != null) {
            if (this.A02.A05()) {
                if (this.A04) {
                    abstractC50702Sv.A01.A12(R.string.contact_qr_wait);
                }
                super.A01();
                return;
            }
            AnonymousClass029.A1F(this.A09, this.A00, 3, null, null, null, null, AnonymousClass029.A1X(this.A0D));
            abstractC50702Sv.A0D = false;
            abstractC50702Sv.A01.AUg(ErrorDialogFragment.A00(3), "qr_code_scanning_dialog_fragment_tag");
        }
    }
}
