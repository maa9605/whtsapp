package com.whatsapp.biz.catalog;

import X.C2N3;
import X.C2VC;
import X.C468628o;
import X.C49462Ko;
import X.C56172mp;
import X.C643132w;
import X.InterfaceC002901k;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.UserJid;

/* loaded from: classes2.dex */
public class CatalogCarouselDetailImageView extends C2VC {
    public RecyclerView A00;
    public CarouselScrollbarView A01;
    public C49462Ko A02;
    public C643132w A03;
    public C2N3 A04;
    public C468628o A05;
    public UserJid A06;
    public InterfaceC002901k A07;
    public boolean A08;
    public boolean A09;

    public CatalogCarouselDetailImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public static void A00(CatalogCarouselDetailImageView catalogCarouselDetailImageView, C56172mp c56172mp, boolean z, ThumbnailButton thumbnailButton, Bitmap bitmap, View view) {
        if (catalogCarouselDetailImageView != null) {
            int[] iArr = {c56172mp.A01, c56172mp.A00};
            if (z) {
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, iArr));
            } else {
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr));
            }
            thumbnailButton.setImageBitmap(bitmap);
            return;
        }
        throw null;
    }
}
