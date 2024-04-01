package X;

import com.whatsapp.videoplayback.ExoPlaybackControlView;
import java.util.List;

/* renamed from: X.3sx */
/* loaded from: classes2.dex */
public final class C83953sx implements InterfaceC21130yq, AnonymousClass117, AnonymousClass135 {
    public final /* synthetic */ C86593xt A00;

    @Override // X.InterfaceC21130yq
    public void ALa(boolean z) {
    }

    @Override // X.InterfaceC21130yq
    public void AN0(C21120yp c21120yp) {
    }

    @Override // X.InterfaceC21130yq
    public void AN2(C20930yW c20930yW) {
    }

    @Override // X.InterfaceC21130yq
    public /* synthetic */ void AN4(int i) {
    }

    @Override // X.InterfaceC21130yq
    public /* synthetic */ void AOS() {
    }

    @Override // X.AnonymousClass135
    public /* synthetic */ void APO(int i, int i2) {
    }

    @Override // X.InterfaceC21130yq
    public /* synthetic */ void APd(AbstractC21230z0 abstractC21230z0, Object obj, int i) {
    }

    @Override // X.InterfaceC21130yq
    public void APq(C220910z c220910z, C222111l c222111l) {
    }

    public C83953sx(C86593xt c86593xt) {
        this.A00 = c86593xt;
    }

    @Override // X.AnonymousClass117
    public void AJA(List list) {
        this.A00.A0A.setCues(list);
    }

    @Override // X.InterfaceC21130yq
    public void AN3(boolean z, int i) {
        C86593xt c86593xt = this.A00;
        c86593xt.A00 = i;
        if (i == 3) {
            C72953ar c72953ar = c86593xt.A03;
            if (c72953ar != null) {
                c72953ar.A00();
                return;
            }
            return;
        }
        ExoPlaybackControlView exoPlaybackControlView = c86593xt.A02;
        if (exoPlaybackControlView != null && i == 4) {
            if (!exoPlaybackControlView.A07()) {
                c86593xt.A02.A01();
            }
            C72953ar c72953ar2 = c86593xt.A03;
            if (c72953ar2 != null) {
                c72953ar2.A00();
            }
            C06260Si c06260Si = c86593xt.A01;
            if (c06260Si != null) {
                c06260Si.ATc(false);
                c86593xt.A01.ASJ(0L);
                return;
            }
            throw null;
        } else if (i == 2) {
            C72953ar c72953ar3 = c86593xt.A03;
            if (c72953ar3 == null) {
                return;
            }
            if (c86593xt.A06) {
                c72953ar3.A02(c86593xt.A05);
            } else {
                c72953ar3.A01();
            }
        } else {
            C72953ar c72953ar4 = c86593xt.A03;
            if (c72953ar4 == null) {
                return;
            }
            c72953ar4.A00();
        }
    }

    @Override // X.AnonymousClass135
    public void ANp() {
        this.A00.A07.setVisibility(8);
    }

    @Override // X.AnonymousClass135
    public void AQN(int i, int i2, int i3, float f) {
        C000200d.A0q("WAExoPlayerView/onVideoSizeChanged/unappliedRotationDegrees=", i3);
        C86593xt c86593xt = this.A00;
        if (!c86593xt.A0C) {
            ((C84093tB) c86593xt.A08).setRotationAngle(i3);
            if (i3 != 90 && i3 != 270) {
                c86593xt.A09.setAspectRatio(i2 != 0 ? (i * f) / i2 : 1.0f);
                return;
            } else {
                c86593xt.A09.setAspectRatio(i2 != 0 ? i2 / (i * f) : 1.0f);
                return;
            }
        }
        c86593xt.A09.setAspectRatio(i2 != 0 ? (i * f) / i2 : 1.0f);
    }
}
