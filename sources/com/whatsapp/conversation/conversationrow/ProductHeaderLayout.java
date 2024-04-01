package com.whatsapp.conversation.conversationrow;

import X.C0AT;
import X.InterfaceC43821y3;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaFrameLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.conversation.conversationrow.ProductHeaderLayout;

/* loaded from: classes2.dex */
public class ProductHeaderLayout extends WaFrameLayout {
    public final TextEmojiLabel A00;
    public final TextEmojiLabel A01;
    public final WaImageView A02;
    public final InterfaceC43821y3 A03;

    public ProductHeaderLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A03 = new InterfaceC43821y3() { // from class: X.38y
            @Override // X.InterfaceC43821y3
            public void AKM() {
            }

            @Override // X.InterfaceC43821y3
            public int ADA() {
                return ProductHeaderLayout.this.getResources().getDimensionPixelSize(R.dimen.link_preview_thumb_width);
            }

            @Override // X.InterfaceC43821y3
            public void AUc(View view, Bitmap bitmap, AnonymousClass092 anonymousClass092) {
                WaImageView waImageView = ProductHeaderLayout.this.A02;
                if (bitmap != null) {
                    waImageView.setImageBitmap(bitmap);
                } else {
                    waImageView.setVisibility(8);
                }
            }

            @Override // X.InterfaceC43821y3
            public void AUo(View view) {
                ProductHeaderLayout.this.A02.setVisibility(8);
            }
        };
        LayoutInflater.from(context).inflate(R.layout.conversation_row_header_product, (ViewGroup) this, true);
        this.A00 = (TextEmojiLabel) C0AT.A0D(this, R.id.items_count);
        this.A02 = (WaImageView) C0AT.A0D(this, R.id.thumbnail);
        this.A01 = (TextEmojiLabel) C0AT.A0D(this, R.id.header_title);
    }
}
