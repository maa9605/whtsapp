package X;

import android.content.DialogInterface;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.4ES */
/* loaded from: classes3.dex */
public abstract class C4ES {
    public boolean A00 = false;
    public final ActivityC02270An A01;
    public final C002301c A02;
    public final AnonymousClass493 A03;
    public final AnonymousClass498 A04;
    public final AnonymousClass499 A05;
    public final InterfaceC899349a A06;

    public C4ES(ActivityC02270An activityC02270An, C002301c c002301c, AnonymousClass498 anonymousClass498, AnonymousClass499 anonymousClass499, AnonymousClass493 anonymousClass493) {
        this.A04 = anonymousClass498;
        this.A02 = c002301c;
        this.A05 = anonymousClass499;
        this.A03 = anonymousClass493;
        this.A01 = activityC02270An;
        this.A06 = (InterfaceC899349a) activityC02270An;
    }

    public DialogInterfaceC019408z A00(final PinBottomSheetDialogFragment pinBottomSheetDialogFragment, int i) {
        C002301c c002301c = this.A02;
        C895547l c895547l = new C895547l(c002301c);
        DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: X.3RE
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                pinBottomSheetDialogFragment.A11();
            }
        };
        DialogInterface.OnDismissListener onDismissListener2 = new DialogInterface.OnDismissListener() { // from class: X.3RD
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                pinBottomSheetDialogFragment.A1B();
            }
        };
        ActivityC02270An activityC02270An = this.A01;
        DialogInterfaceC019408z A03 = c895547l.A03(activityC02270An, i, onDismissListener, onDismissListener2);
        if (A03 == null && (A03 = c895547l.A02(activityC02270An, i, onDismissListener, onDismissListener2)) == null) {
            return C895547l.A00(activityC02270An, c002301c.A06(R.string.payments_generic_error), onDismissListener2);
        }
        return A03;
    }
}
