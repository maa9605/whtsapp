package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.order.view.fragment.OrderDetailFragment;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.math.BigDecimal;
import java.util.List;

/* renamed from: X.346  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass346 extends AbstractC04890Mh {
    public final C2N3 A00;
    public final OrderDetailFragment A01;
    public final C002301c A02;
    public final List A03;

    public AnonymousClass346(C002301c c002301c, C2N3 c2n3, List list, OrderDetailFragment orderDetailFragment) {
        this.A03 = list;
        this.A00 = c2n3;
        this.A02 = c002301c;
        this.A01 = orderDetailFragment;
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A03.size();
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        return new AnonymousClass347(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_order_detail, viewGroup, false));
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        String string;
        AnonymousClass347 anonymousClass347 = (AnonymousClass347) c0ts;
        C56322n5 c56322n5 = (C56322n5) this.A03.get(i);
        anonymousClass347.A02.setText(c56322n5.A03);
        BigDecimal bigDecimal = c56322n5.A05;
        C09R c09r = c56322n5.A02;
        C002301c c002301c = this.A02;
        Context context = anonymousClass347.A01.getContext();
        if (bigDecimal != null && c09r != null) {
            string = c09r.A03(c002301c, bigDecimal, true);
        } else {
            string = context.getString(R.string.ask_for_price);
        }
        anonymousClass347.A01.setText(anonymousClass347.A01.getContext().getString(R.string.order_item_price_quantity, string, Integer.valueOf(c56322n5.A00)));
        ImageView imageView = anonymousClass347.A00;
        C2n7 c2n7 = c56322n5.A01;
        C2N3 c2n3 = this.A00;
        imageView.setBackgroundResource(R.color.light_gray);
        imageView.setImageResource(R.drawable.ic_product_image_loading);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (c2n7 != null) {
            String str = c2n7.A01;
            if (!TextUtils.isEmpty(str)) {
                c2n3.A02(new C2A2(c2n7.A00, str, null, 0, 0), 2, C31061be.A00, null, C31081bg.A00, imageView);
            }
        }
        anonymousClass347.A0H.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, c56322n5, 6));
    }
}
