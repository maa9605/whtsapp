package com.whatsapp.ui.media;

import X.C002301c;
import X.C02160Ac;
import X.C08540bf;
import X.C0AT;
import X.C0LX;
import X.C0We;
import X.C2ZO;
import X.C3ZZ;
import X.C51282Vt;
import X.InterfaceC72193Za;
import X.InterfaceC72213Zc;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I0_5;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I0_6;
import com.google.android.search.verification.client.R;
import com.whatsapp.InfoCard;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.ui.media.MediaCard;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class MediaCard extends C2ZO {
    public View A00;
    public HorizontalScrollView A01;
    public ImageView A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public RelativeLayout A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public C002301c A0B;
    public InterfaceC72193Za A0C;

    public MediaCard(final Context context, final AttributeSet attributeSet) {
        new InfoCard(context, attributeSet, 0) { // from class: X.2ZO
            public boolean A00;

            {
                A00();
            }

            @Override // X.AbstractC08330bH
            public void A00() {
                if (this.A00) {
                    return;
                }
                this.A00 = true;
                ((AbstractC07960aN) generatedComponent()).A2q((MediaCard) this);
            }
        };
        LayoutInflater.from(getContext()).inflate(R.layout.media_card, (ViewGroup) this, true);
        this.A0A = (TextView) findViewById(R.id.media_card_title);
        this.A08 = (TextView) findViewById(R.id.media_card_empty_title);
        this.A09 = (TextView) findViewById(R.id.media_card_info);
        this.A07 = (TextView) findViewById(R.id.media_card_empty_info);
        this.A04 = (LinearLayout) findViewById(R.id.media_card_thumbs);
        this.A00 = findViewById(R.id.title_container);
        this.A01 = (HorizontalScrollView) findViewById(R.id.media_card_scroller);
        this.A06 = (TextView) findViewById(R.id.media_card_error);
        this.A05 = (RelativeLayout) findViewById(R.id.media_card_thumb_container);
        this.A03 = (LinearLayout) findViewById(R.id.media_card_empty);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C08540bf.A1V, 0, 0);
            try {
                String A0B = this.A0B.A0B(1, obtainStyledAttributes);
                String A0B2 = this.A0B.A0B(0, obtainStyledAttributes);
                obtainStyledAttributes.recycle();
                this.A0A.setText(A0B);
                C0AT.A0M(this.A0A);
                this.A08.setText(A0B);
                setMediaInfo(A0B2);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    public void A02(int i, View.OnClickListener onClickListener) {
        for (int i2 = 0; i2 < i; i2++) {
            int thumbnailPixelSize = getThumbnailPixelSize();
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.medium_thumbnail_padding);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(thumbnailPixelSize, thumbnailPixelSize);
            layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            ThumbnailButton thumbnailButton = new ThumbnailButton(getContext());
            thumbnailButton.setBackgroundColor(getResources().getColor(R.color.light_gray));
            thumbnailButton.setLayoutParams(layoutParams);
            if (onClickListener != null) {
                thumbnailButton.setOnClickListener(onClickListener);
            }
            this.A04.addView(thumbnailButton);
        }
    }

    public void A03(List list, int i) {
        if (list.size() == 0) {
            this.A03.setVisibility(0);
            this.A00.setVisibility(8);
            this.A05.setVisibility(8);
            this.A06.setVisibility(8);
            return;
        }
        this.A03.setVisibility(8);
        this.A00.setVisibility(0);
        this.A05.setVisibility(0);
        this.A06.setVisibility(8);
        int thumbnailPixelSize = getThumbnailPixelSize();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.medium_thumbnail_padding);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(thumbnailPixelSize, thumbnailPixelSize);
        layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.A04.removeAllViews();
        if (this.A02 == null) {
            ImageView imageView = new ImageView(getContext());
            this.A02 = imageView;
            imageView.setBackgroundResource(R.drawable.selector_orange_gradient);
            this.A02.setLayoutParams(layoutParams);
            this.A02.setImageDrawable(new C0We(this.A0B, C02160Ac.A03(getContext(), R.drawable.group_info_chevron_right)));
            this.A02.setContentDescription(getContext().getString(R.string.more));
            this.A02.setScaleType(ImageView.ScaleType.CENTER);
            if (this.A0C != null) {
                this.A02.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 45));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3ZZ c3zz = (C3ZZ) it.next();
            C51282Vt c51282Vt = new C51282Vt(getContext());
            c51282Vt.setScaleType(ImageView.ScaleType.CENTER_CROP);
            c51282Vt.setLayoutParams(layoutParams);
            c51282Vt.A00 = thumbnailPixelSize / 6;
            c51282Vt.A03 = 5;
            C0AT.A0e(c51282Vt, c3zz.A05);
            String str = c3zz.A04;
            if (str != null) {
                c51282Vt.A09 = str;
            }
            String str2 = c3zz.A03;
            if (str2 != null) {
                c51282Vt.setContentDescription(str2);
            }
            Drawable drawable = c3zz.A00;
            if (drawable != null) {
                c51282Vt.A07 = drawable;
            }
            if (c3zz.A01 != null) {
                c51282Vt.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(c3zz, 49));
            }
            InterfaceC72213Zc interfaceC72213Zc = c3zz.A02;
            if (interfaceC72213Zc != null) {
                interfaceC72213Zc.AKJ(c51282Vt, thumbnailPixelSize);
            }
            this.A04.addView(c51282Vt);
        }
        C0LX.A0B(this.A0B, this.A04);
        if (this.A0B.A0N()) {
            this.A01.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.3ZY
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    MediaCard mediaCard = MediaCard.this;
                    mediaCard.A01.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    mediaCard.A01.fullScroll(66);
                }
            });
        }
        if (list.size() >= i) {
            this.A04.addView(this.A02);
        }
    }

    public String getError() {
        if (this.A06.getVisibility() == 0) {
            return this.A06.getText().toString();
        }
        return null;
    }

    public int getThumbnailPixelSize() {
        return getResources().getDimensionPixelSize(R.dimen.medium_thumbnail_size);
    }

    public void setError(String str) {
        this.A04.setVisibility(8);
        this.A06.setText(str);
        this.A06.setVisibility(0);
    }

    public void setLeftPadding(int i) {
        View view = this.A00;
        view.setPadding(i, view.getPaddingTop(), this.A00.getPaddingRight(), this.A00.getPaddingBottom());
        LinearLayout linearLayout = this.A04;
        linearLayout.setPadding(i, linearLayout.getPaddingTop(), this.A04.getPaddingRight(), this.A04.getPaddingBottom());
        TextView textView = this.A06;
        textView.setPadding(i, textView.getPaddingTop(), this.A06.getPaddingRight(), this.A06.getPaddingBottom());
    }

    public void setMediaInfo(String str) {
        this.A09.setText(str);
        this.A07.setText(str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C0LX.A0C(this.A0B, this.A09);
        C0LX.A0C(this.A0B, this.A07);
    }

    public void setSeeMoreClickListener(InterfaceC72193Za interfaceC72193Za) {
        this.A0C = interfaceC72193Za;
        ImageView imageView = this.A02;
        if (imageView != null) {
            imageView.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(interfaceC72193Za, 48));
        }
        this.A0A.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(interfaceC72193Za, 44));
        this.A09.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I0_6(interfaceC72193Za, 0));
        this.A08.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(interfaceC72193Za, 47));
        this.A07.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(interfaceC72193Za, 46));
    }

    public void setTitle(String str) {
        this.A0A.setText(str);
        this.A08.setText(str);
    }

    public void setTitleTextColor(int i) {
        this.A0A.setTextColor(i);
    }

    public void setTopShadowVisibility(int i) {
        int i2;
        int paddingLeft = getPaddingLeft();
        if (i == 0) {
            i2 = getContext().getResources().getDimensionPixelSize(R.dimen.info_screen_card_spacing);
        } else {
            i2 = 0;
        }
        setPadding(paddingLeft, i2, getPaddingRight(), getPaddingBottom());
    }
}
