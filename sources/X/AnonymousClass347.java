package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.347  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass347 extends C0TS {
    public ImageView A00;
    public TextView A01;
    public TextView A02;

    public AnonymousClass347(View view) {
        super(view);
        this.A02 = (TextView) view.findViewById(R.id.order_product_title);
        this.A01 = (TextView) view.findViewById(R.id.order_product_price_qty);
        this.A00 = (ImageView) view.findViewById(R.id.order_product_thumbnail);
    }
}
