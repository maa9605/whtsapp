package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.biz.cart.view.fragment.QuantityPickerDialogFragment;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* renamed from: X.32L  reason: invalid class name */
/* loaded from: classes2.dex */
public class C32L extends AbstractC04890Mh {
    public final C2KZ A02;
    public final CartFragment A03;
    public final C2N3 A04;
    public final C002301c A05;
    public List A01 = new ArrayList();
    public Date A00 = new Date();

    public C32L(C2KZ c2kz, C002301c c002301c, C2N3 c2n3, CartFragment cartFragment) {
        this.A04 = c2n3;
        this.A03 = cartFragment;
        this.A02 = c2kz;
        this.A05 = c002301c;
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A01.size();
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        return new C32M(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_cart_item, viewGroup, false));
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        C32M c32m = (C32M) c0ts;
        final C49382Kc c49382Kc = (C49382Kc) this.A01.get(i);
        TextView textView = c32m.A04;
        C468628o c468628o = c49382Kc.A01;
        textView.setText(c468628o.A0B);
        c32m.A03.setText(String.valueOf(c49382Kc.A00));
        TextView textView2 = c32m.A02;
        textView2.setText(AnonymousClass088.A0Q(c468628o.A0C, c468628o.A03, c468628o.A05, this.A05, this.A00, textView2.getContext()));
        ImageView imageView = c32m.A01;
        if (!A0H(c468628o, imageView)) {
            C2KZ c2kz = this.A02;
            C468628o A06 = c2kz.A0E.A06(c468628o.A09);
            if (A06 == null || !A0H(A06, imageView)) {
                imageView.setBackgroundResource(R.color.light_gray);
                imageView.setImageResource(R.drawable.ic_product_image_loading);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
            }
        }
        c32m.A0H.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, c49382Kc, 3));
        c32m.A00.setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.32K
            @Override // X.AbstractView$OnClickListenerC49532Ky
            public void A00(View view) {
                CartFragment cartFragment = C32L.this.A03;
                C49382Kc c49382Kc2 = c49382Kc;
                int i2 = (int) c49382Kc2.A00;
                String str = c49382Kc2.A01.A09;
                if (cartFragment.A0P.A0F != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("extra_product_id", str);
                    bundle.putInt("extra_initial_quantity", i2);
                    QuantityPickerDialogFragment quantityPickerDialogFragment = new QuantityPickerDialogFragment();
                    quantityPickerDialogFragment.A0P(bundle);
                    AbstractC02800Cx abstractC02800Cx = ((C0BA) cartFragment).A0H;
                    if (abstractC02800Cx != null) {
                        quantityPickerDialogFragment.A14(abstractC02800Cx, QuantityPickerDialogFragment.class.getName());
                        return;
                    }
                    return;
                }
                throw null;
            }
        });
    }

    public int A0G() {
        int i = 0;
        for (C49382Kc c49382Kc : this.A01) {
            i = (int) (i + c49382Kc.A00);
        }
        return i;
    }

    public final boolean A0H(C468628o c468628o, ImageView imageView) {
        List list = c468628o.A0D;
        if (list.isEmpty() || c468628o.A01()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            C2A2 c2a2 = (C2A2) list.get(i);
            if (c2a2 != null) {
                String str = c2a2.A04;
                if (!TextUtils.isEmpty(str)) {
                    String str2 = c2a2.A02;
                    C2N3 c2n3 = this.A04;
                    imageView.setBackgroundResource(R.color.light_gray);
                    imageView.setImageResource(R.drawable.ic_product_image_loading);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    if (TextUtils.isEmpty(str)) {
                        return true;
                    }
                    c2n3.A02(new C2A2(str2, str, null, 0, 0), 2, C31061be.A00, null, C31081bg.A00, imageView);
                    return true;
                }
            }
        }
        return false;
    }
}
