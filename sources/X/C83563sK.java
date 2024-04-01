package X;

import android.text.TextUtils;
import com.whatsapp.usernotice.UserNoticeBottomSheetDialogFragment;
import java.util.Map;

/* renamed from: X.3sK */
/* loaded from: classes2.dex */
public final /* synthetic */ class C83563sK {
    public final /* synthetic */ UserNoticeBottomSheetDialogFragment A00;

    public /* synthetic */ C83563sK(UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment) {
        this.A00 = userNoticeBottomSheetDialogFragment;
    }

    public final void A00(String str, Map map) {
        UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment = this.A00;
        userNoticeBottomSheetDialogFragment.A0B.A01(str, map, userNoticeBottomSheetDialogFragment.A00());
        C41941ul c41941ul = userNoticeBottomSheetDialogFragment.A0C;
        if (!TextUtils.isEmpty(userNoticeBottomSheetDialogFragment.A0E.A03)) {
            c41941ul.A01(5);
        } else {
            c41941ul.A01(8);
        }
    }
}
