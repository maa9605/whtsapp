package X;

import android.view.View;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.0ev  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C09880ev extends AbstractView$OnClickListenerC49532Ky {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C08190as A01;

    public C09880ev(C08190as c08190as, View view) {
        this.A01 = c08190as;
        this.A00 = view;
    }

    @Override // X.AbstractView$OnClickListenerC49532Ky
    public void A00(View view) {
        Log.i("EducationBannerView/updateUserNoticeBanner/banner dismissed");
        C08190as c08190as = this.A01;
        c08190as.A0J.A01(10);
        this.A00.setVisibility(8);
        c08190as.A0K.A05();
        C02L c02l = c08190as.A06;
        c02l.A05();
        UserJid userJid = c02l.A03;
        if (userJid != null) {
            C06K c06k = c08190as.A08;
            c06k.A08.ARy(new C36331kd(c06k, userJid, new C1N6() { // from class: X.1hL
                @Override // X.C1N6
                public final void AI2(C05210Nt c05210Nt) {
                    C09880ev.this.A01.A03();
                }
            }), new Void[0]);
        }
    }
}
