package X;

import android.os.Bundle;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2my  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C56262my {
    public static void A00(UserJid userJid, ActivityC02290Ap activityC02290Ap) {
        CartFragment cartFragment = new CartFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_business_id", userJid);
        cartFragment.A0P(bundle);
        activityC02290Ap.AUh(cartFragment);
    }
}
