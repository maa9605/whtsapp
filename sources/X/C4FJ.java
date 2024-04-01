package X;

import android.view.View;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.4FJ  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4FJ implements C49D {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ActivityC02270An A01;
    public final /* synthetic */ PinBottomSheetDialogFragment A02;
    public final /* synthetic */ C4FL A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public C4FJ(C4FL c4fl, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, String str, String str2, String str3, int i, ActivityC02270An activityC02270An) {
        this.A03 = c4fl;
        this.A02 = pinBottomSheetDialogFragment;
        this.A04 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A00 = i;
        this.A01 = activityC02270An;
    }

    @Override // X.C49D
    public void AIo(final String str) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A02;
        pinBottomSheetDialogFragment.A1D();
        C4FL c4fl = this.A03;
        final AnonymousClass498 anonymousClass498 = c4fl.A05;
        final String str2 = this.A04;
        String str3 = this.A06;
        final C78483jz c78483jz = new C78483jz(c4fl, 1, pinBottomSheetDialogFragment, null, this.A00, this.A05, str2, this.A01, str3);
        anonymousClass498.A01(str3, new AnonymousClass495() { // from class: X.3iC
            @Override // X.AnonymousClass495
            public final void AO7(C49A c49a) {
                AnonymousClass498.this.A08(str, str2, c78483jz, c49a);
            }
        }, new AnonymousClass496() { // from class: X.3iE
            @Override // X.AnonymousClass496
            public final void AO5(C28Q c28q) {
                AnonymousClass497.this.AO8(null, c28q);
            }
        });
    }

    @Override // X.C49D
    public void AKa(View view) {
        this.A03.A00.A0A(Boolean.TRUE);
    }
}
