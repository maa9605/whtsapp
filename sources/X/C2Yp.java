package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaTextView;
import com.whatsapp.search.views.MessageThumbView;
import com.whatsapp.search.views.itemviews.MessageGifVideoPlayer;

/* renamed from: X.2Yp */
/* loaded from: classes2.dex */
public class C2Yp extends AbstractC51872Yq {
    public AnimatorSet A00;
    public InterfaceC71333Vs A01;
    public final WaTextView A02;
    public final MessageThumbView A03;
    public final MessageGifVideoPlayer A04;

    @Override // X.AbstractC51882Yr
    public float getRatio() {
        return 1.5f;
    }

    public C2Yp(Context context) {
        super(context);
        this.A01 = new C81033oF(this);
        this.A03 = (MessageThumbView) C0AT.A0D(this, R.id.thumb_view);
        this.A04 = (MessageGifVideoPlayer) C0AT.A0D(this, R.id.video_player);
        this.A02 = (WaTextView) C0AT.A0D(this, R.id.media_time);
        this.A03.setContentDescription(context.getString(R.string.gif_preview_description));
        this.A04.A06 = this.A01;
    }

    public static void A00(C2Yp c2Yp, boolean z) {
        AnimatorSet animatorSet = c2Yp.A00;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        float f = z ? 1.0f : 0.0f;
        c2Yp.A00 = new AnimatorSet();
        FrameLayout frameLayout = ((AbstractC51882Yr) c2Yp).A00;
        c2Yp.A00.playTogether(ObjectAnimator.ofFloat(frameLayout, "alpha", frameLayout.getAlpha(), f), ObjectAnimator.ofFloat(((AbstractC51882Yr) c2Yp).A01, "alpha", frameLayout.getAlpha(), f));
        c2Yp.A00.setInterpolator(new DecelerateInterpolator());
        c2Yp.A00.setDuration(100L);
        c2Yp.A00.start();
    }

    @Override // X.AbstractC51882Yr
    public int getMark() {
        return R.drawable.msg_status_gif;
    }

    @Override // X.AbstractC51882Yr
    public int getMarkTintColor() {
        return R.color.white;
    }

    @Override // X.AbstractC51882Yr, X.AbstractC51892Ys
    public void setMessage(C0LO c0lo) {
        super.setMessage((AnonymousClass097) c0lo);
        super.setRadius(0);
        setId(R.id.gif_grid);
        MessageThumbView messageThumbView = this.A03;
        messageThumbView.setMessage(c0lo);
        this.A04.setMessage(c0lo);
        messageThumbView.setVisibility(0);
        WaTextView waTextView = this.A02;
        waTextView.setText("");
        waTextView.setVisibility(8);
    }

    @Override // X.AbstractC51892Ys
    public void setScrolling(boolean z) {
        this.A04.setScrolling(z);
    }

    @Override // X.AbstractC51892Ys
    public void setShouldPlay(boolean z) {
        this.A04.setShouldPlay(z);
    }
}
