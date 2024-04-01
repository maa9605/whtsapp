package X;

import com.whatsapp.videoplayback.ExoPlaybackControlView;

/* renamed from: X.3sh */
/* loaded from: classes2.dex */
public final /* synthetic */ class C83793sh {
    public final /* synthetic */ C48652Gd A00;

    public /* synthetic */ C83793sh(C48652Gd c48652Gd) {
        this.A00 = c48652Gd;
    }

    public final void A00(String str, boolean z, int i) {
        C48652Gd c48652Gd = this.A00;
        if (i == 1) {
            c48652Gd.A0M(str, z);
        } else if (i == 2) {
            ExoPlaybackControlView exoPlaybackControlView = c48652Gd.A0C;
            if (exoPlaybackControlView != null) {
                exoPlaybackControlView.setPlayControlVisibility(0);
            }
            c48652Gd.A09();
            c48652Gd.A08();
        }
        C86593xt c86593xt = c48652Gd.A0X;
        boolean z2 = i == 1;
        c86593xt.A05 = str;
        C72953ar c72953ar = c86593xt.A03;
        if (c72953ar != null && c86593xt.A06 != z2) {
            if (z2) {
                if (c86593xt.A00 == 2) {
                    c72953ar.A02(str);
                }
            } else if (c86593xt.A00 == 2) {
                c72953ar.A01();
            }
            c86593xt.A06 = z2;
        }
    }
}
