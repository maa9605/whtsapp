package X;

import android.view.View;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.4ER  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4ER implements C49D {
    public final /* synthetic */ PinBottomSheetDialogFragment A00;
    public final /* synthetic */ C4ES A01;

    public C4ER(C4ES c4es, PinBottomSheetDialogFragment pinBottomSheetDialogFragment) {
        this.A01 = c4es;
        this.A00 = pinBottomSheetDialogFragment;
    }

    public void A00(PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C28Q c28q) {
        pinBottomSheetDialogFragment.A1C();
        if (c28q == null) {
            this.A01.A06.ASl(false);
            pinBottomSheetDialogFragment.A10();
            return;
        }
        int i = c28q.A00;
        if (i == 1440) {
            pinBottomSheetDialogFragment.A1E(c28q.A01);
        } else if (i == 1441) {
            pinBottomSheetDialogFragment.A1F(c28q.A02 * 1000, true);
        } else {
            this.A01.A00(pinBottomSheetDialogFragment, i).show();
        }
    }

    public void A01(PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C28Q c28q) {
        pinBottomSheetDialogFragment.A1C();
        if (c28q == null) {
            this.A01.A06.ASl(true);
            pinBottomSheetDialogFragment.A10();
            return;
        }
        int i = c28q.A00;
        if (i == 1440) {
            pinBottomSheetDialogFragment.A1E(c28q.A01);
        } else if (i == 1441) {
            pinBottomSheetDialogFragment.A1F(c28q.A02 * 1000, true);
        } else {
            this.A01.A00(pinBottomSheetDialogFragment, i).show();
        }
    }

    @Override // X.C49D
    public void AIo(final String str) {
        final PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A00;
        pinBottomSheetDialogFragment.A1D();
        C4ES c4es = this.A01;
        if (c4es.A03.A01() == 1) {
            final AnonymousClass498 anonymousClass498 = c4es.A04;
            final AnonymousClass496 anonymousClass496 = new AnonymousClass496() { // from class: X.3jq
                @Override // X.AnonymousClass496
                public final void AO5(C28Q c28q) {
                    C4ER.this.A00(pinBottomSheetDialogFragment, c28q);
                }
            };
            anonymousClass498.A01("FB", new AnonymousClass495() { // from class: X.3iF
                @Override // X.AnonymousClass495
                public final void AO7(C49A c49a) {
                    AnonymousClass498.this.A03(str, anonymousClass496, c49a);
                }
            }, anonymousClass496);
            return;
        }
        AnonymousClass498 anonymousClass4982 = c4es.A04;
        AnonymousClass496 anonymousClass4962 = new AnonymousClass496() { // from class: X.3jp
            @Override // X.AnonymousClass496
            public final void AO5(C28Q c28q) {
                C4ER.this.A01(pinBottomSheetDialogFragment, c28q);
            }
        };
        anonymousClass4982.A01("FB", new C77513iK(anonymousClass4982, str, anonymousClass4962), anonymousClass4962);
    }

    @Override // X.C49D
    public void AKa(View view) {
        C4ES c4es = this.A01;
        ActivityC02270An activityC02270An = c4es.A01;
        C4HD c4hd = (C4HD) c4es;
        if (c4hd.A00 != null) {
            c4hd.A02.ARy(new C4BY(c4hd.A01, new C76943hP(activityC02270An)), new Void[0]);
            return;
        }
        throw null;
    }
}
