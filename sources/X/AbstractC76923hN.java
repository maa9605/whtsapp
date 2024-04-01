package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageView;

/* renamed from: X.3hN  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC76923hN implements C3NG {
    public final int A00;

    public AbstractC76923hN(int i) {
        this.A00 = i;
    }

    public View A00(Context context) {
        WaImageView waImageView = new WaImageView(context);
        waImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        waImageView.setImageResource(this.A00);
        C07O.A0i(waImageView, PorterDuff.Mode.SRC_IN);
        C07O.A0h(waImageView, ColorStateList.valueOf(C02160Ac.A00(context, R.color.number_entry_keyboard_text_color)));
        return waImageView;
    }
}
