package X;

import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.2nT  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class View$OnClickListenerC56522nT extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ VideoSurfaceView A01;

    public /* synthetic */ View$OnClickListenerC56522nT(View view, VideoSurfaceView videoSurfaceView) {
        this.A00 = view;
        this.A01 = videoSurfaceView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2 = this.A00;
        VideoSurfaceView videoSurfaceView = this.A01;
        view2.setVisibility(8);
        if (!videoSurfaceView.isPlaying()) {
            videoSurfaceView.start();
        }
    }
}
