package X;

import android.view.ViewTreeObserver;
import com.whatsapp.usernotice.UserNoticeBottomSheetDialogFragment;

/* renamed from: X.3Zh  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class ViewTreeObserver$OnGlobalLayoutListenerC72263Zh implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ UserNoticeBottomSheetDialogFragment A00;

    public ViewTreeObserver$OnGlobalLayoutListenerC72263Zh(UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment) {
        this.A00 = userNoticeBottomSheetDialogFragment;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment = this.A00;
        userNoticeBottomSheetDialogFragment.A08.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        userNoticeBottomSheetDialogFragment.A1D(!((userNoticeBottomSheetDialogFragment.A02.getY() - ((float) userNoticeBottomSheetDialogFragment.A08.getHeight())) - ((float) userNoticeBottomSheetDialogFragment.A08.getScrollY()) < 0.0f), false);
    }
}
