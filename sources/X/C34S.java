package X;

import android.os.Bundle;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.34S  reason: invalid class name */
/* loaded from: classes2.dex */
public class C34S extends C0MU {
    public boolean A00;
    public boolean A01;
    public final int A02;
    public final C0HK A03;
    public final C49452Kn A09;
    public final C56372nB A0A;
    public final UserJid A0B;
    public final C0HK A06 = new C0HK();
    public final C0HK A08 = new C0HK();
    public final C0HK A04 = new C0HK();
    public final C0HK A05 = new C0HK();
    public final C0HK A07 = new C0HK();

    public C34S(C56372nB c56372nB, UserJid userJid, C49452Kn c49452Kn, int i) {
        C0HK c0hk = new C0HK();
        this.A03 = c0hk;
        this.A0A = c56372nB;
        this.A0B = userJid;
        this.A09 = c49452Kn;
        this.A02 = i;
        c49452Kn.A02 = this.A06;
        c49452Kn.A01 = this.A04;
        c49452Kn.A04 = this.A08;
        c49452Kn.A00 = c0hk;
        c49452Kn.A03 = this.A07;
    }

    public static boolean A00(int i, C468628o c468628o) {
        C468728p c468728p;
        return (c468628o == null || !c468628o.A00 || i != 0 || c468628o.A01() || (c468728p = c468628o.A04) == null || c468728p.A00 != 0 || c468628o.A01) ? false : true;
    }

    public void A02(ActivityC02290Ap activityC02290Ap) {
        C56372nB c56372nB = this.A0A;
        UserJid userJid = this.A0B;
        if (c56372nB != null) {
            CartFragment cartFragment = new CartFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_business_id", userJid);
            cartFragment.A0P(bundle);
            activityC02290Ap.AUh(cartFragment);
            return;
        }
        throw null;
    }
}
