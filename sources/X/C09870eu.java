package X;

import android.view.View;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.0eu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C09870eu extends AbstractView$OnClickListenerC49532Ky {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C08190as A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ boolean A04;

    public C09870eu(C08190as c08190as, boolean z, String str, Map map, View view) {
        this.A01 = c08190as;
        this.A04 = z;
        this.A02 = str;
        this.A03 = map;
        this.A00 = view;
    }

    @Override // X.AbstractView$OnClickListenerC49532Ky
    public void A00(View view) {
        C08190as c08190as;
        Log.i("EducationBannerView/updateUserNoticeBanner/banner tapped");
        if (this.A04) {
            c08190as = this.A01;
            c08190as.A0K.A05();
            c08190as.A0I.A00(c08190as.getContext(), true);
        } else {
            c08190as = this.A01;
            C41951um c41951um = c08190as.A0K;
            if (c41951um != null) {
                StringBuilder sb = new StringBuilder("UserNoticeManager/updateUserNoticeStage/expected current stage: ");
                sb.append(2);
                Log.i(sb.toString());
                C2A7 A02 = c41951um.A02();
                if (A02 != null) {
                    int i = A02.A01;
                    if (2 < i) {
                        C000200d.A1F(C000200d.A0P("UserNoticeManager/updateUserNoticeStage/already moved forward, stored current stage: "), i);
                    } else {
                        C40781sr A03 = c41951um.A07.A03(A02);
                        if (A03 != null) {
                            c41951um.A0A(A02, C02180Ae.A02(2, A03));
                        } else {
                            throw null;
                        }
                    }
                    c08190as.A0I.A01(this.A02, this.A03, c08190as.getContext());
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        c08190as.A0J.A01(2);
        this.A00.setVisibility(8);
        C02L c02l = c08190as.A06;
        c02l.A05();
        UserJid userJid = c02l.A03;
        if (userJid != null) {
            C06K c06k = c08190as.A08;
            c06k.A08.ARy(new C36331kd(c06k, userJid, new C1N6() { // from class: X.1hK
                @Override // X.C1N6
                public final void AI2(C05210Nt c05210Nt) {
                    C09870eu.this.A01.A03();
                }
            }), new Void[0]);
        }
    }
}
