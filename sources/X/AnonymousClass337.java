package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.biz.catalog.CatalogHeader;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape3S0300000_I1;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.math.BigDecimal;
import java.util.List;

/* renamed from: X.337 */
/* loaded from: classes2.dex */
public abstract class AnonymousClass337 extends C0TS {
    public final C018308n A00;
    public final C02L A01;
    public final C05W A02;

    public AnonymousClass337(C02L c02l, C018308n c018308n, C05W c05w, View view) {
        super(view);
        this.A01 = c02l;
        this.A00 = c018308n;
        this.A02 = c05w;
    }

    public void A0C(UserJid userJid, int i) {
        C09R c09r;
        if (this instanceof AbstractC68293Ix) {
            AbstractC68293Ix abstractC68293Ix = (AbstractC68293Ix) this;
            FrameLayout frameLayout = abstractC68293Ix.A00;
            if (i == 0) {
                frameLayout.setPadding(0, (int) abstractC68293Ix.A0H.getResources().getDimension(R.dimen.product_catalog_list_thumb_margin_vertical), 0, 0);
            } else {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            C468628o ACa = abstractC68293Ix.A06.ACa(i);
            abstractC68293Ix.A04.A03(ACa.A0B);
            String str = ACa.A06;
            if (!AnonymousClass024.A0j(str)) {
                TextEmojiLabel textEmojiLabel = abstractC68293Ix.A03;
                textEmojiLabel.setVisibility(0);
                textEmojiLabel.A06(str, null, true, 0);
            } else {
                abstractC68293Ix.A03.setVisibility(8);
            }
            BigDecimal bigDecimal = ACa.A0C;
            if (bigDecimal != null && (c09r = ACa.A03) != null) {
                TextView textView = abstractC68293Ix.A02;
                textView.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AnonymousClass088.A0Q(bigDecimal, c09r, ACa.A05, abstractC68293Ix.A07, abstractC68293Ix.A08, textView.getContext()));
                if (1 == ACa.A02) {
                    spannableStringBuilder.append((CharSequence) " • ").append((CharSequence) textView.getContext().getString(R.string.out_of_stock));
                }
                textView.setText(spannableStringBuilder);
            } else {
                abstractC68293Ix.A02.setVisibility(8);
            }
            C3LH c3lh = (C3LH) abstractC68293Ix;
            c3lh.A0H.setOnClickListener(new ViewOnClickCListenerShape3S0300000_I1(c3lh, userJid, ACa, 0));
            if (ACa.A02 != 0) {
                TextEmojiLabel textEmojiLabel2 = ((AbstractC68293Ix) c3lh).A04;
                int i2 = c3lh.A00;
                textEmojiLabel2.setTextColor(i2);
                ((AbstractC68293Ix) c3lh).A03.setTextColor(i2);
                ((AbstractC68293Ix) c3lh).A02.setTextColor(i2);
                ((AbstractC68293Ix) c3lh).A01.setAlpha(0.5f);
            } else {
                TextEmojiLabel textEmojiLabel3 = ((AbstractC68293Ix) c3lh).A04;
                textEmojiLabel3.setTextColor(textEmojiLabel3.getTextColors().getDefaultColor());
                TextEmojiLabel textEmojiLabel4 = ((AbstractC68293Ix) c3lh).A03;
                textEmojiLabel4.setTextColor(textEmojiLabel4.getTextColors().getDefaultColor());
                TextView textView2 = ((AbstractC68293Ix) c3lh).A02;
                textView2.setTextColor(textView2.getTextColors().getDefaultColor());
                ((AbstractC68293Ix) c3lh).A01.setAlpha(1.0f);
            }
            ImageView imageView = abstractC68293Ix.A01;
            imageView.setBackgroundResource(R.color.light_gray);
            imageView.setImageResource(R.drawable.ic_product_image_loading);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            List list = ACa.A0D;
            if (list.isEmpty()) {
                Log.w("ProductBaseViewHolder/bindViewInSection/no-product-images");
            }
            if (ACa.A01() || list.isEmpty()) {
                return;
            }
            abstractC68293Ix.A05.A01((C2A2) list.get(0), 2, new InterfaceC49482Kq() { // from class: X.34R
                @Override // X.InterfaceC49482Kq
                public final void ALY(C40231ro c40231ro, Bitmap bitmap, boolean z) {
                    ImageView A002 = c40231ro.A00();
                    if (A002 != null) {
                        A002.setBackgroundColor(0);
                        A002.setImageBitmap(bitmap);
                        A002.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    }
                }
            }, null, imageView);
        } else if (this instanceof AbstractC68263Iu) {
            AbstractC68263Iu abstractC68263Iu = (AbstractC68263Iu) this;
            C644433j c644433j = (C644433j) abstractC68263Iu.A04.A09.get(abstractC68263Iu.A00());
            abstractC68263Iu.A03.setText(c644433j.A01);
            int i3 = c644433j.A00;
            if (i3 == 0) {
                abstractC68263Iu.A02.setText(R.string.collection_zero_item);
            } else {
                abstractC68263Iu.A02.setText(abstractC68263Iu.A05.A0A(R.plurals.total_items, i3, Integer.valueOf(i3)));
            }
            abstractC68263Iu.A01.setVisibility(c644433j.A02 ? 0 : 8);
            abstractC68263Iu.A00.setVisibility(c644433j.A03 ? 0 : 8);
        } else if (!(this instanceof C68203In)) {
            C3LF c3lf = (C3LF) this;
            View view = c3lf.A0H;
            view.setVisibility(0);
            ProgressBar progressBar = c3lf.A03;
            progressBar.setVisibility(8);
            LinearLayout linearLayout = c3lf.A02;
            linearLayout.setVisibility(8);
            Button button = c3lf.A01;
            button.setVisibility(8);
            TextView textView3 = c3lf.A04;
            textView3.setVisibility(8);
            int i4 = c3lf.A00;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        progressBar.setVisibility(4);
                        linearLayout.setVisibility(0);
                        textView3.setVisibility(0);
                        textView3.setText(view.getContext().getString(R.string.catalog_server_error_retrieving_products));
                        return;
                    } else if (i4 != 3) {
                        if (i4 == 4) {
                            progressBar.setVisibility(4);
                            linearLayout.setVisibility(0);
                            textView3.setVisibility(0);
                            textView3.setText(view.getContext().getString(R.string.catalog_error_retrieving_products));
                            return;
                        } else if (i4 == 5) {
                            progressBar.setVisibility(8);
                            linearLayout.setVisibility(8);
                            textView3.setVisibility(8);
                            return;
                        } else {
                            return;
                        }
                    }
                }
                progressBar.setVisibility(4);
                if (((AnonymousClass337) c3lf).A01.A0A(userJid)) {
                    return;
                }
                linearLayout.setVisibility(0);
                C018108l A0E = c3lf.A05.A04.A0E(userJid);
                String str2 = A0E == null ? null : A0E.A08;
                C06C A0A = ((AnonymousClass337) c3lf).A02.A0A(userJid);
                Context context = view.getContext();
                Object[] objArr = new Object[1];
                if (AnonymousClass024.A0j(str2)) {
                    str2 = c3lf.A06.A08(A0A, false);
                }
                objArr[0] = str2;
                textView3.setText(context.getString(R.string.business_product_catalog_end_of_results_title, objArr));
                button.setText(view.getContext().getString(R.string.business_product_catalog_end_of_results_button));
                button.setVisibility(0);
                textView3.setVisibility(0);
                button.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(c3lf, A0A, 4));
                return;
            }
            progressBar.setVisibility(0);
            linearLayout.setVisibility(4);
        } else {
            C68203In c68203In = (C68203In) this;
            CatalogHeader catalogHeader = c68203In.A00;
            catalogHeader.setUp(userJid);
            if (((AnonymousClass337) c68203In).A01.A0A(userJid)) {
                return;
            }
            catalogHeader.setOnTextClickListener(new ViewOnClickCListenerShape4S0200000_I1(c68203In, userJid, 5));
        }
    }
}
