package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.TextAndDateLayout;
import com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;
import java.util.Collections;

/* renamed from: X.2X3  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2X3 extends C2X4 {
    public C06960Vv A00;
    public InterfaceC43821y3 A01;
    public C42471vn A02;
    public boolean A03;
    public final View A04;
    public final ImageView A05;
    public final TextView A06;
    public final CircularProgressBar A07;
    public final TextEmojiLabel A08;
    public final TextEmojiLabel A09;
    public final TextAndDateLayout A0A;
    public final ConversationRowImage$RowImageView A0B;

    public C2X3(Context context, C04160Iu c04160Iu) {
        super(context, c04160Iu);
        this.A01 = new InterfaceC43821y3() { // from class: X.38d
            @Override // X.InterfaceC43821y3
            public int ADA() {
                C2X3 c2x3 = C2X3.this;
                return (C2JE.A01(c2x3.getContext()) * (((AbstractC48202Eh) c2x3).A0P ? 100 : 72)) / 100;
            }

            @Override // X.InterfaceC43821y3
            public void AKM() {
                C2X3.this.A0m();
            }

            @Override // X.InterfaceC43821y3
            public void AUc(View view, Bitmap bitmap, AnonymousClass092 anonymousClass092) {
                int i;
                if (bitmap != null && (anonymousClass092 instanceof AnonymousClass097)) {
                    C09H c09h = ((AnonymousClass097) anonymousClass092).A02;
                    if (c09h != null) {
                        int i2 = c09h.A08;
                        if (i2 != 0 && (i = c09h.A06) != 0) {
                            ConversationRowImage$RowImageView conversationRowImage$RowImageView = C2X3.this.A0B;
                            conversationRowImage$RowImageView.A03(i2, i);
                            conversationRowImage$RowImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        }
                        C2X3.this.A0B.setImageBitmap(bitmap);
                        return;
                    }
                    throw null;
                }
                C2X3.this.A0B.setImageResource(R.drawable.media_image);
            }

            @Override // X.InterfaceC43821y3
            public void AUo(View view) {
                C2X3.this.A0B.setBackgroundColor(-7829368);
            }
        };
        this.A06 = (TextView) findViewById(R.id.control_btn);
        this.A0B = (ConversationRowImage$RowImageView) findViewById(R.id.image);
        CircularProgressBar circularProgressBar = (CircularProgressBar) findViewById(R.id.progress_bar);
        this.A07 = circularProgressBar;
        circularProgressBar.A0B = 0;
        this.A05 = (ImageView) findViewById(R.id.cancel_download);
        this.A04 = findViewById(R.id.control_frame);
        this.A08 = (TextEmojiLabel) findViewById(R.id.caption);
        this.A0A = (TextAndDateLayout) findViewById(R.id.text_and_date);
        this.A09 = (TextEmojiLabel) findViewById(R.id.product_title);
        C000200d.A0b(this.A08);
        this.A08.setAutoLinkMask(0);
        this.A08.setLinksClickable(false);
        this.A08.setFocusable(false);
        this.A08.setLongClickable(false);
        ((TextEmojiLabel) findViewById(R.id.view_product_btn)).A03(getContext().getString(R.string.view_product));
        this.A09.setAutoLinkMask(0);
        this.A09.setLinksClickable(false);
        this.A09.setFocusable(false);
        this.A09.setLongClickable(false);
        findViewById(R.id.product_message_view).setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 18));
        A00(true);
    }

    private void A00(boolean z) {
        int i;
        C04160Iu c04160Iu = (C04160Iu) super.getFMessage();
        C09H c09h = ((AnonymousClass097) c04160Iu).A02;
        if (c09h != null) {
            if (z) {
                this.A06.setTag(Collections.singletonList(c04160Iu));
            }
            ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A0B;
            conversationRowImage$RowImageView.setImageBitmap(null);
            conversationRowImage$RowImageView.setImageData(new C09H(c09h));
            conversationRowImage$RowImageView.setFullWidth(false);
            conversationRowImage$RowImageView.setPaddingOnTopOnly(true);
            if (C0DB.A0n(getFMessage())) {
                View view = this.A04;
                view.setVisibility(0);
                CircularProgressBar circularProgressBar = this.A07;
                ImageView imageView = this.A05;
                TextView textView = this.A06;
                C2JE.A09(true, !z, false, view, circularProgressBar, imageView, textView);
                conversationRowImage$RowImageView.setContentDescription(getContext().getString(R.string.image_transfer_in_progress));
                if (c04160Iu.A0n.A02) {
                    conversationRowImage$RowImageView.setOnClickListener(((C2JE) this).A0C);
                } else {
                    conversationRowImage$RowImageView.setOnClickListener(null);
                }
                AbstractView$OnClickListenerC49532Ky abstractView$OnClickListenerC49532Ky = ((C2JE) this).A09;
                textView.setOnClickListener(abstractView$OnClickListenerC49532Ky);
                circularProgressBar.setOnClickListener(abstractView$OnClickListenerC49532Ky);
            } else {
                boolean A0o = C0DB.A0o(getFMessage());
                View view2 = this.A04;
                if (A0o) {
                    view2.setVisibility(8);
                    CircularProgressBar circularProgressBar2 = this.A07;
                    ImageView imageView2 = this.A05;
                    TextView textView2 = this.A06;
                    C2JE.A09(false, false, false, view2, circularProgressBar2, imageView2, textView2);
                    conversationRowImage$RowImageView.setContentDescription(getContext().getString(R.string.view_product));
                    AbstractView$OnClickListenerC49532Ky abstractView$OnClickListenerC49532Ky2 = ((C2JE) this).A0C;
                    textView2.setOnClickListener(abstractView$OnClickListenerC49532Ky2);
                    conversationRowImage$RowImageView.setOnClickListener(abstractView$OnClickListenerC49532Ky2);
                } else {
                    view2.setVisibility(0);
                    CircularProgressBar circularProgressBar3 = this.A07;
                    ImageView imageView3 = this.A05;
                    TextView textView3 = this.A06;
                    C2JE.A09(false, !z, false, view2, circularProgressBar3, imageView3, textView3);
                    conversationRowImage$RowImageView.setContentDescription(null);
                    if (!C0DB.A0m(getFMessage())) {
                        textView3.setText(R.string.retry);
                        textView3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_upload, 0, 0, 0);
                        textView3.setOnClickListener(((C2JE) this).A0B);
                        conversationRowImage$RowImageView.setOnClickListener(((C2JE) this).A0C);
                    } else {
                        A0V(textView3, Collections.singletonList(c04160Iu), ((AnonymousClass097) c04160Iu).A01);
                        textView3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_download, 0, 0, 0);
                        AbstractView$OnClickListenerC49532Ky abstractView$OnClickListenerC49532Ky3 = ((C2JE) this).A0A;
                        textView3.setOnClickListener(abstractView$OnClickListenerC49532Ky3);
                        conversationRowImage$RowImageView.setOnClickListener(abstractView$OnClickListenerC49532Ky3);
                    }
                }
            }
            A0M();
            conversationRowImage$RowImageView.setOnLongClickListener(this.A19);
            SpannableString A03 = this.A00.A03(c04160Iu);
            String str = c04160Iu.A07;
            Resources resources = getContext().getResources();
            TextEmojiLabel textEmojiLabel = this.A09;
            textEmojiLabel.setTextSize(getTextFontSize());
            TextEmojiLabel textEmojiLabel2 = this.A08;
            textEmojiLabel2.setTextSize(AbstractC48182Ef.A05(getResources(), ((AbstractC48202Eh) this).A0J, -1));
            textEmojiLabel2.setTypeface(null, 0);
            textEmojiLabel2.setTextColor(resources.getColor(R.color.conversation_row_date));
            textEmojiLabel2.setVisibility(8);
            TextAndDateLayout textAndDateLayout = this.A0A;
            textAndDateLayout.setMaxTextLineCount(2);
            textAndDateLayout.invalidate();
            if (!TextUtils.isEmpty(str)) {
                textEmojiLabel.A03(str);
                textEmojiLabel.setVisibility(0);
            } else {
                textEmojiLabel.setVisibility(8);
            }
            if (!TextUtils.isEmpty(A03)) {
                textEmojiLabel2.A03(A03);
                textEmojiLabel2.setVisibility(0);
            } else if (!TextUtils.isEmpty(str)) {
                textEmojiLabel.setVisibility(8);
                textAndDateLayout.setMaxTextLineCount(1);
                textEmojiLabel2.setVisibility(0);
                textEmojiLabel2.A03(str);
                textEmojiLabel2.setTextSize(getTextFontSize());
                textEmojiLabel2.setTypeface(null, 1);
                textEmojiLabel2.setTextColor(resources.getColor(R.color.catalog_list_product_primary_color));
            }
            conversationRowImage$RowImageView.A06 = false;
            conversationRowImage$RowImageView.setOutgoing(c04160Iu.A0n.A02);
            conversationRowImage$RowImageView.A08 = false;
            int i2 = c09h.A08;
            if (i2 != 0 && (i = c09h.A06) != 0) {
                conversationRowImage$RowImageView.A03(i2, i);
                conversationRowImage$RowImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else {
                int A00 = C42471vn.A00(c04160Iu, 100);
                if (A00 > 0) {
                    conversationRowImage$RowImageView.A03(100, A00);
                } else {
                    int A01 = C003301p.A01(getContext());
                    conversationRowImage$RowImageView.A03(A01, (A01 * 9) >> 4);
                }
                conversationRowImage$RowImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            if (!z && this.A03) {
                this.A02.A08(c04160Iu);
            }
            this.A03 = false;
            this.A02.A0C(c04160Iu, conversationRowImage$RowImageView, this.A01, false);
            return;
        }
        throw null;
    }

    @Override // X.AbstractC48202Eh
    public boolean A08() {
        return C0DB.A0g(super.getFMessage());
    }

    @Override // X.AbstractC48182Ef
    public void A0I() {
        A0e(false);
        A00(false);
    }

    @Override // X.AbstractC48182Ef
    public void A0J() {
        AnonymousClass097 fMessage = super.getFMessage();
        this.A03 = true;
        this.A02.A08(fMessage);
        this.A02.A0C(fMessage, this.A0B, this.A01, false);
    }

    @Override // X.AbstractC48182Ef
    public void A0M() {
        int A00;
        CircularProgressBar circularProgressBar = this.A07;
        if (A0j(circularProgressBar, super.getFMessage()) == 0) {
            A00 = C02160Ac.A00(getContext(), R.color.media_message_progress_indeterminate);
        } else {
            A00 = C02160Ac.A00(getContext(), R.color.media_message_progress_determinate);
        }
        circularProgressBar.A0C = A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
        if (r0.exists() == false) goto L26;
     */
    @Override // X.AbstractC48182Ef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0N() {
        /*
            r7 = this;
            X.02F r0 = r7.A02
            if (r0 == 0) goto L11
            android.content.Context r1 = r7.getContext()
            X.02F r0 = r7.A02
            boolean r0 = com.whatsapp.RequestPermissionActivity.A0Q(r1, r0)
            if (r0 != 0) goto L11
            return
        L11:
            X.097 r3 = super.getFMessage()
            X.0Iu r3 = (X.C04160Iu) r3
            X.09H r5 = r3.A02
            if (r5 == 0) goto Lb8
            X.094 r0 = r3.A0n
            boolean r1 = r0.A02
            if (r1 != 0) goto L26
            boolean r0 = r5.A0P
            if (r0 != 0) goto L26
            return
        L26:
            java.io.File r0 = r5.A0F
            r2 = 0
            if (r0 == 0) goto L32
            boolean r0 = r0.exists()
            r6 = 1
            if (r0 != 0) goto L33
        L32:
            r6 = 0
        L33:
            java.lang.String r0 = "viewmessage/ from_me:"
            java.lang.StringBuilder r4 = X.C000200d.A0P(r0)
            r4.append(r1)
            java.lang.String r0 = " type:"
            r4.append(r0)
            byte r0 = r3.A0m
            r4.append(r0)
            java.lang.String r0 = " name:"
            r4.append(r0)
            java.lang.String r0 = r3.A08
            r4.append(r0)
            java.lang.String r0 = " url:"
            r4.append(r0)
            java.lang.String r0 = r3.A09
            java.lang.String r0 = X.C40841sx.A0N(r0)
            r4.append(r0)
            java.lang.String r0 = " file:"
            r4.append(r0)
            java.io.File r0 = r5.A0F
            r4.append(r0)
            java.lang.String r0 = " progress:"
            r4.append(r0)
            long r0 = r5.A0C
            r4.append(r0)
            java.lang.String r0 = " transferred:"
            r4.append(r0)
            boolean r0 = r5.A0P
            r4.append(r0)
            java.lang.String r0 = " transferring:"
            r4.append(r0)
            boolean r0 = r5.A0a
            r4.append(r0)
            java.lang.String r0 = " fileSize:"
            r4.append(r0)
            long r0 = r5.A0A
            r4.append(r0)
            java.lang.String r0 = " media_size:"
            r4.append(r0)
            long r0 = r3.A01
            r4.append(r0)
            java.lang.String r0 = " timestamp:"
            r4.append(r0)
            long r0 = r3.A0E
            X.C000200d.A1I(r4, r0)
            if (r6 != 0) goto Lb2
            boolean r0 = r7.A0m()
            if (r0 == 0) goto Lb2
            java.lang.String r0 = "viewmessage/ no file to download from receiver side"
            com.whatsapp.util.Log.w(r0)
            return
        Lb2:
            com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView r0 = r7.A0B
            r7.A0Z(r3, r0, r2)
            return
        Lb8:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2X3.A0N():void");
    }

    @Override // X.AbstractC48182Ef
    public void A0X(AnonymousClass092 anonymousClass092, boolean z) {
        boolean z2 = anonymousClass092 != super.getFMessage();
        super.A0X(anonymousClass092, z);
        if (z || z2) {
            A00(z2);
        }
    }

    public /* synthetic */ void A0n() {
        A0Z((C04160Iu) super.getFMessage(), this.A0B, false);
    }

    @Override // X.AbstractC48182Ef
    public int getBroadcastDrawableId() {
        return TextUtils.isEmpty(super.getFMessage().A04) ? R.drawable.broadcast_status_icon_onmedia : R.drawable.broadcast_status_icon;
    }

    @Override // X.AbstractC48202Eh
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_product_left;
    }

    @Override // X.C2JE, X.AbstractC48202Eh
    public /* bridge */ /* synthetic */ AnonymousClass092 getFMessage() {
        return super.getFMessage();
    }

    @Override // X.C2JE, X.AbstractC48202Eh
    public /* bridge */ /* synthetic */ AnonymousClass097 getFMessage() {
        return super.getFMessage();
    }

    @Override // X.C2JE, X.AbstractC48202Eh
    public C04160Iu getFMessage() {
        return (C04160Iu) super.getFMessage();
    }

    @Override // X.AbstractC48202Eh
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_product_left;
    }

    @Override // X.AbstractC48202Eh
    public int getMainChildMaxWidth() {
        return (C2JE.A01(getContext()) * (((AbstractC48202Eh) this).A0P ? 100 : 72)) / 100;
    }

    @Override // X.AbstractC48202Eh
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_product_right;
    }

    @Override // X.C2JE, X.AbstractC48202Eh
    public void setFMessage(AnonymousClass092 anonymousClass092) {
        C000700j.A07(anonymousClass092 instanceof C04160Iu);
        super.setFMessage(anonymousClass092);
    }
}
