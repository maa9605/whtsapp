package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaTextView;
import com.whatsapp.search.views.MessageThumbView;

/* renamed from: X.2Yu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C51912Yu extends AbstractC51922Yv {
    public C002301c A00;
    public final LinearLayout A01;
    public final WaTextView A02;
    public final MessageThumbView A03;

    @Override // X.AbstractC51882Yr
    public float getRatio() {
        return 1.0f;
    }

    public C51912Yu(Context context) {
        super(context);
        this.A02 = (WaTextView) C0AT.A0D(this, R.id.media_time);
        this.A03 = (MessageThumbView) C0AT.A0D(this, R.id.thumb_view);
        this.A01 = (LinearLayout) C0AT.A0D(this, R.id.button_frame);
        this.A03.setContentDescription(context.getString(R.string.video_preview_description));
    }

    @Override // X.AbstractC51882Yr
    public int getMark() {
        return R.drawable.mark_video;
    }

    @Override // X.AbstractC51882Yr, X.AbstractC51892Ys
    public void setMessage(C0JP c0jp) {
        super.setMessage((AnonymousClass097) c0jp);
        MessageThumbView messageThumbView = this.A03;
        messageThumbView.setVisibility(0);
        messageThumbView.A00 = ((AbstractC51892Ys) this).A00;
        messageThumbView.setMessage(c0jp);
        WaTextView waTextView = this.A02;
        waTextView.setText(C23X.A0E(this.A00, c0jp));
        waTextView.setVisibility(0);
        int dimensionPixelSize = (getResources().getDimensionPixelSize(R.dimen.search_grid_video_mark_margin_bottom) << 1) + ((int) waTextView.getTextSize());
        LinearLayout linearLayout = this.A01;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        int i = layoutParams.height;
        int i2 = layoutParams.width;
        if (i < dimensionPixelSize) {
            linearLayout.setLayoutParams(new FrameLayout.LayoutParams(i2, dimensionPixelSize, (this.A00.A0N() ? 5 : 3) | 80));
        }
    }
}
