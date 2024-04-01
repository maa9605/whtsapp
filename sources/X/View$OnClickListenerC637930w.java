package X;

import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.videoplayback.ExoPlaybackControlView;

/* renamed from: X.30w  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class View$OnClickListenerC637930w extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ C09B A01;
    public final /* synthetic */ ExoPlaybackControlView A02;
    public final /* synthetic */ C48652Gd A03;

    public /* synthetic */ View$OnClickListenerC637930w(MediaViewFragment mediaViewFragment, C09B c09b, ExoPlaybackControlView exoPlaybackControlView, C48652Gd c48652Gd) {
        this.A00 = mediaViewFragment;
        this.A01 = c09b;
        this.A02 = exoPlaybackControlView;
        this.A03 = c48652Gd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MediaViewFragment mediaViewFragment = this.A00;
        C09B c09b = this.A01;
        ExoPlaybackControlView exoPlaybackControlView = this.A02;
        C48652Gd c48652Gd = this.A03;
        if (((AnonymousClass097) c09b).A09 != null) {
            exoPlaybackControlView.setPlayControlVisibility(0);
            c48652Gd.A09();
            mediaViewFragment.A0I.A0B((ActivityC02290Ap) mediaViewFragment.A0A(), c09b, false);
            c48652Gd.A08();
            return;
        }
        StringBuilder A0P = C000200d.A0P("cannot retry download on message with null url, key=");
        A0P.append(c09b.A0n);
        throw new IllegalStateException(A0P.toString());
    }
}
