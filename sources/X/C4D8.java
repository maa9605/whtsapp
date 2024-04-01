package X;

import android.view.View;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;

/* renamed from: X.4D8  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4D8 implements C49D {
    public final /* synthetic */ PinBottomSheetDialogFragment A00;
    public final /* synthetic */ BrazilPaymentCardDetailsActivity A01;

    public C4D8(BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity, PinBottomSheetDialogFragment pinBottomSheetDialogFragment) {
        this.A01 = brazilPaymentCardDetailsActivity;
        this.A00 = pinBottomSheetDialogFragment;
    }

    public void A00(PinBottomSheetDialogFragment pinBottomSheetDialogFragment, InterfaceC03640Gm interfaceC03640Gm, C02590Ca c02590Ca, C28Q c28q) {
        if (c28q != null) {
            pinBottomSheetDialogFragment.A1C();
            BrazilPaymentCardDetailsActivity.A00(this.A01, pinBottomSheetDialogFragment, c28q);
            return;
        }
        BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = this.A01;
        brazilPaymentCardDetailsActivity.A08.A0D(((C4KP) brazilPaymentCardDetailsActivity).A07.A07, interfaceC03640Gm, c02590Ca, null);
    }

    @Override // X.C49D
    public void AIo(final String str) {
        BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = this.A01;
        final PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A00;
        if (brazilPaymentCardDetailsActivity != null) {
            final C4DC c4dc = new C4DC(brazilPaymentCardDetailsActivity, pinBottomSheetDialogFragment, new C4EA(brazilPaymentCardDetailsActivity, null, 0));
            pinBottomSheetDialogFragment.A1D();
            final AnonymousClass498 anonymousClass498 = brazilPaymentCardDetailsActivity.A0D;
            final AnonymousClass497 anonymousClass497 = new AnonymousClass497() { // from class: X.3ir
                @Override // X.AnonymousClass497
                public final void AO8(C02590Ca c02590Ca, C28Q c28q) {
                    C4D8.this.A00(pinBottomSheetDialogFragment, c4dc, c02590Ca, c28q);
                }
            };
            anonymousClass498.A01("FB", new AnonymousClass495() { // from class: X.3iH
                @Override // X.AnonymousClass495
                public final void AO7(C49A c49a) {
                    AnonymousClass498.this.A06(str, anonymousClass497, c49a);
                }
            }, new AnonymousClass496() { // from class: X.3iI
                @Override // X.AnonymousClass496
                public final void AO5(C28Q c28q) {
                    AnonymousClass497.this.AO8(null, c28q);
                }
            });
            return;
        }
        throw null;
    }

    @Override // X.C49D
    public void AKa(View view) {
        BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = this.A01;
        if (brazilPaymentCardDetailsActivity.A03 != null) {
            ((C4Kv) brazilPaymentCardDetailsActivity).A0D.ARy(new C4BY(brazilPaymentCardDetailsActivity.A0A, new C76943hP(brazilPaymentCardDetailsActivity)), new Void[0]);
            return;
        }
        throw null;
    }
}
