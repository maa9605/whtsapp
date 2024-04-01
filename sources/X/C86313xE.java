package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.3xE  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C86313xE extends AbstractC81423os {
    public final ImageView A00;
    public final ImageView A01;
    public final TextView A02;

    public C86313xE(Context context) {
        super(context);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.wallpaper_category_view, this);
        this.A02 = (TextView) C0AT.A0D(this, R.id.wallpaper_category_title);
        this.A01 = (ImageView) C0AT.A0D(this, R.id.wallpaper_category_preview);
        this.A00 = (ImageView) C0AT.A0D(this, R.id.wallpaper_category_preview_icon);
    }

    public void A00(String str, Drawable drawable, Drawable drawable2) {
        this.A02.setText(str);
        this.A01.setImageDrawable(drawable);
        ImageView imageView = this.A00;
        if (drawable2 == null) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setImageDrawable(drawable2);
        imageView.setVisibility(0);
    }

    public void setPreviewScaleType(ImageView.ScaleType scaleType) {
        this.A01.setScaleType(scaleType);
    }
}
