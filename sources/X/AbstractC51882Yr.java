package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageView;
import com.whatsapp.biz.catalog.AspectRatioFrameLayout;

/* renamed from: X.2Yr */
/* loaded from: classes2.dex */
public abstract class AbstractC51882Yr extends AbstractC51892Ys {
    public final FrameLayout A00;
    public final LinearLayout A01;
    public final WaImageView A02;

    public abstract int getMark();

    public int getMarkTintColor() {
        return -1;
    }

    public abstract float getRatio();

    public AbstractC51882Yr(Context context) {
        super(context);
        ((AspectRatioFrameLayout) this).A00 = getRatio();
        FrameLayout.inflate(context, R.layout.search_message_video_preview, this);
        this.A00 = (FrameLayout) C0AT.A0D(this, R.id.overlay);
        this.A01 = (LinearLayout) C0AT.A0D(this, R.id.button_frame);
        this.A02 = (WaImageView) C0AT.A0D(this, R.id.starred_status);
        ImageView imageView = (ImageView) C0AT.A0D(this, R.id.button_image);
        Drawable A03 = C02160Ac.A03(context, getMark());
        if (A03 == null) {
            return;
        }
        int markTintColor = getMarkTintColor();
        A03 = markTintColor != -1 ? C02180Ae.A0Q(A03, C02160Ac.A00(context, markTintColor)) : A03;
        imageView.setImageDrawable(A03);
        this.A00.setLayoutParams(new FrameLayout.LayoutParams(-1, A03.getIntrinsicHeight() << 1, 80));
        this.A00.setVisibility(0);
        imageView.setImageDrawable(A03);
    }

    @Override // X.AbstractC51892Ys
    public void setMessage(AnonymousClass097 anonymousClass097) {
        ((AbstractC51892Ys) this).A01 = anonymousClass097;
        WaImageView waImageView = this.A02;
        if (anonymousClass097 != null) {
            if (anonymousClass097.A0j) {
                waImageView.setVisibility(0);
            } else {
                waImageView.setVisibility(8);
            }
        }
    }

    @Override // X.AbstractC51892Ys
    public void setRadius(int i) {
        super.setRadius(i);
        if (i > 0) {
            FrameLayout frameLayout = this.A00;
            frameLayout.setBackground(C02160Ac.A03(getContext(), R.drawable.search_media_thumbnail_rounded_overlay));
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            ((GradientDrawable) frameLayout.getBackground()).setCornerRadius(i);
        }
    }
}
