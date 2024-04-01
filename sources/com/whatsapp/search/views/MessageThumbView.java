package com.whatsapp.search.views;

import X.AnonymousClass088;
import X.AnonymousClass095;
import X.AnonymousClass097;
import X.C002301c;
import X.C09A;
import X.C09D;
import X.C0DB;
import X.C0JP;
import X.C0LO;
import X.C2YQ;
import X.C42471vn;
import X.InterfaceC43821y3;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageView;
import com.whatsapp.search.views.MessageThumbView;

/* loaded from: classes2.dex */
public class MessageThumbView extends C2YQ {
    public int A00;
    public C002301c A01;
    public AnonymousClass097 A02;
    public C42471vn A03;
    public final InterfaceC43821y3 A04;

    public MessageThumbView(Context context, AttributeSet attributeSet) {
        new WaImageView(context, attributeSet) { // from class: X.2YQ
            public boolean A00;

            {
                A00();
            }

            @Override // X.AbstractC08140aj
            public void A00() {
                if (this.A00) {
                    return;
                }
                this.A00 = true;
                ((AbstractC07960aN) generatedComponent()).A2L((MessageThumbView) this);
            }
        };
        this.A04 = new InterfaceC43821y3() { // from class: X.3nq
            @Override // X.InterfaceC43821y3
            public void AKM() {
            }

            {
                MessageThumbView.this = this;
            }

            public final void A00(Bitmap bitmap) {
                MessageThumbView messageThumbView = MessageThumbView.this;
                Drawable drawable = messageThumbView.getDrawable();
                BitmapDrawable bitmapDrawable = new BitmapDrawable(messageThumbView.getResources(), bitmap);
                if (drawable == null || (drawable instanceof ColorDrawable)) {
                    messageThumbView.setImageDrawable(bitmapDrawable);
                    return;
                }
                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, bitmapDrawable});
                messageThumbView.setImageDrawable(transitionDrawable);
                transitionDrawable.startTransition(150);
            }

            @Override // X.InterfaceC43821y3
            public int ADA() {
                return MessageThumbView.this.getWidth();
            }

            @Override // X.InterfaceC43821y3
            public void AUc(View view, Bitmap bitmap, AnonymousClass092 anonymousClass092) {
                MessageThumbView messageThumbView = MessageThumbView.this;
                if (messageThumbView.A00 > 0) {
                    A00(C0DD.A07(bitmap, messageThumbView.getResources().getDimensionPixelSize(R.dimen.search_media_thumbnail_size), messageThumbView.A00));
                } else {
                    A00(bitmap);
                }
            }

            @Override // X.InterfaceC43821y3
            public void AUo(View view) {
                MessageThumbView.this.setImageDrawable(new ColorDrawable(view.getResources().getColor(R.color.search_grid_item_bg)));
            }
        };
    }

    private int getNotDownloadedContentDescription() {
        AnonymousClass097 anonymousClass097 = this.A02;
        if (!(anonymousClass097 instanceof AnonymousClass095) && !(anonymousClass097 instanceof C09D)) {
            if (anonymousClass097 instanceof C0LO) {
                return R.string.conversation_row_gif_not_downloaded_content_description;
            }
            if ((anonymousClass097 instanceof C0JP) || (anonymousClass097 instanceof C09A)) {
                return R.string.conversation_row_video_not_downloaded_content_description;
            }
            return -1;
        }
        return R.string.conversation_row_image_not_downloaded_content_description;
    }

    public void setMessage(AnonymousClass097 anonymousClass097) {
        if (this.A03 == null) {
            return;
        }
        this.A02 = anonymousClass097;
        InterfaceC43821y3 interfaceC43821y3 = this.A04;
        interfaceC43821y3.AUo(this);
        this.A03.A0C(anonymousClass097, this, interfaceC43821y3, false);
    }

    public void setRadius(int i) {
        this.A00 = i;
    }

    public void setStatus(int i) {
        if (this.A01 != null && this.A02 != null) {
            AnonymousClass088.A1T(this);
            if (i == 0 || i == 1) {
                setContentDescription(getResources().getString(R.string.image_transfer_in_progress));
                if (i == 0) {
                    setOnClickListener(null);
                } else {
                    setOnClickListener(null);
                }
            } else if (i != 2 && i != 3) {
                AnonymousClass088.A1V(this, R.string.button_download);
                setOnClickListener(null);
                int notDownloadedContentDescription = getNotDownloadedContentDescription();
                if (notDownloadedContentDescription != -1) {
                    setContentDescription(getResources().getString(notDownloadedContentDescription, C0DB.A07(this.A01, this.A02.A01)));
                }
            } else {
                setContentDescription(getResources().getString(R.string.action_open_image));
                setOnClickListener(null);
            }
        }
    }
}
