package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;

/* renamed from: X.41V */
/* loaded from: classes2.dex */
public abstract class C41V extends AbstractC86853yY {
    public AbstractC51892Ys A00;

    public abstract String getDefaultMessageText();

    public abstract int getDrawableRes();

    public C0FK getTimestampStrings() {
        return null;
    }

    public C41V(Context context, AnonymousClass012 anonymousClass012, C02L c02l, C40081rY c40081rY, C52782bL c52782bL, C05W c05w, C02E c02e, C018708s c018708s, C002301c c002301c, C2AR c2ar, C52682b9 c52682b9, C02O c02o) {
        super(context, anonymousClass012, c02l, c40081rY, c52782bL, c05w, c02e, c018708s, c002301c, c2ar, c52682b9, c02o);
    }

    @Override // X.AbstractC86853yY
    public CharSequence A02(AnonymousClass092 anonymousClass092, C06C c06c) {
        Drawable A0O = C02180Ae.A0O(getContext(), getDrawableRes(), R.color.msgStatusTint);
        TextPaint paint = ((AbstractC86853yY) this).A01.getPaint();
        int iconSizeIncrease = getIconSizeIncrease() + ((int) paint.getTextSize());
        StringBuilder sb = new StringBuilder("  ");
        sb.append((Object) "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
        C50262Ra.A02(spannableStringBuilder, A0O, paint, iconSizeIncrease, 0, 1);
        return C23X.A09(spannableStringBuilder, c06c, anonymousClass092.A0n.A02, this.A08, this.A0A, this.A0F);
    }

    public int getIconSizeIncrease() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.search_icon_label_size_increase);
    }

    public void setThumbnailOnClickListener(View.OnClickListener onClickListener) {
        this.A00.setId(R.id.thumb_view);
        this.A00.setOnClickListener(onClickListener);
    }

    public void setUpThumbView(AbstractC51892Ys abstractC51892Ys) {
        abstractC51892Ys.setRadius(getResources().getDimensionPixelSize(R.dimen.search_media_thumbnail_corner_radius));
        abstractC51892Ys.setLayoutParams(new FrameLayout.LayoutParams(getResources().getDimensionPixelSize(R.dimen.search_media_thumbnail_size), getResources().getDimensionPixelSize(R.dimen.search_media_thumbnail_size)));
        C0LX.A05(this.A0F, abstractC51892Ys, getResources().getDimensionPixelSize(R.dimen.search_attachment_margin), 0);
    }
}
