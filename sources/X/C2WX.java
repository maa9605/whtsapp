package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.Conversation;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collections;

/* renamed from: X.2WX */
/* loaded from: classes2.dex */
public class C2WX extends C2WY {
    public C42471vn A00;
    public boolean A01;
    public final View A02;
    public final View A03;
    public final ImageView A04;
    public final TextView A05;
    public final CircularProgressBar A06;
    public final TextEmojiLabel A07;
    public final ConversationRowImage$RowImageView A08;
    public final InterfaceC43821y3 A09;
    public final boolean A0A;

    public C2WX(Context context, AnonymousClass095 anonymousClass095) {
        super(context, anonymousClass095);
        this.A09 = new InterfaceC43821y3() { // from class: X.38Q
            {
                C2WX.this = this;
            }

            @Override // X.InterfaceC43821y3
            public int ADA() {
                C2WX c2wx = C2WX.this;
                if (c2wx.A0A) {
                    return c2wx.A08.A03.A02();
                }
                return (C2JE.A01(c2wx.getContext()) * (((AbstractC48202Eh) c2wx).A0P ? 100 : 72)) / 100;
            }

            @Override // X.InterfaceC43821y3
            public void AKM() {
                C2WX.this.A0m();
            }

            @Override // X.InterfaceC43821y3
            public void AUc(View view, Bitmap bitmap, AnonymousClass092 anonymousClass092) {
                int i;
                if (bitmap != null && (anonymousClass092 instanceof AnonymousClass097)) {
                    C09H c09h = ((AnonymousClass097) anonymousClass092).A02;
                    if (c09h != null) {
                        int i2 = c09h.A08;
                        if (i2 != 0 && (i = c09h.A06) != 0) {
                            C2WX c2wx = C2WX.this;
                            boolean z = c2wx instanceof C51362Wd;
                            ConversationRowImage$RowImageView conversationRowImage$RowImageView = c2wx.A08;
                            conversationRowImage$RowImageView.A03(i2, i);
                            conversationRowImage$RowImageView.setScaleType((((AbstractC48202Eh) c2wx).A0P || z) ? ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.MATRIX);
                        }
                        C2WX.this.A08.setImageBitmap(bitmap);
                        return;
                    }
                    throw null;
                }
                C2WX c2wx2 = C2WX.this;
                c2wx2.A08.setImageResource(R.drawable.media_image);
                c2wx2.A01 = false;
            }

            @Override // X.InterfaceC43821y3
            public void AUo(View view) {
                C2WX c2wx = C2WX.this;
                c2wx.A01 = false;
                c2wx.A08.setBackgroundColor(-7829368);
            }
        };
        this.A0A = this.A0m.A0C(400);
        this.A05 = (TextView) findViewById(R.id.control_btn);
        ConversationRowImage$RowImageView conversationRowImage$RowImageView = (ConversationRowImage$RowImageView) findViewById(R.id.image);
        this.A08 = conversationRowImage$RowImageView;
        conversationRowImage$RowImageView.A09 = this.A0A;
        CircularProgressBar circularProgressBar = (CircularProgressBar) findViewById(R.id.progress_bar);
        this.A06 = circularProgressBar;
        circularProgressBar.A0B = 0;
        this.A04 = (ImageView) findViewById(R.id.cancel_download);
        this.A02 = findViewById(R.id.control_frame);
        this.A03 = findViewById(R.id.text_and_date);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.caption);
        this.A07 = textEmojiLabel;
        if (textEmojiLabel != null) {
            C000200d.A0b(textEmojiLabel);
            this.A07.setAutoLinkMask(0);
            this.A07.setLinksClickable(false);
            this.A07.setFocusable(false);
            this.A07.setClickable(false);
            this.A07.setLongClickable(false);
        }
        A00(true);
    }

    private void A00(boolean z) {
        int i;
        AnonymousClass097 fMessage = super.getFMessage();
        C09H c09h = fMessage.A02;
        if (c09h == null) {
            ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A08;
            conversationRowImage$RowImageView.setImageBitmap(null);
            conversationRowImage$RowImageView.A03(1, 1);
            conversationRowImage$RowImageView.setOnClickListener(null);
            this.A02.setVisibility(4);
            return;
        }
        if (z) {
            this.A05.setTag(Collections.singletonList(fMessage));
            this.A08.setImageBitmap(null);
        }
        ConversationRowImage$RowImageView conversationRowImage$RowImageView2 = this.A08;
        conversationRowImage$RowImageView2.setImageData(new C09H(c09h));
        conversationRowImage$RowImageView2.setFullWidth(((AbstractC48202Eh) this).A0P);
        AnonymousClass094 anonymousClass094 = fMessage.A0n;
        C0AT.A0e(conversationRowImage$RowImageView2, C000200d.A0H("thumb-transition-", anonymousClass094.toString()));
        C0AT.A0e(this.A1E, C2JE.A02(fMessage));
        ImageView imageView = this.A1D;
        if (imageView != null) {
            C0AT.A0e(imageView, C2JE.A07(fMessage));
        }
        AnonymousClass088.A1T(conversationRowImage$RowImageView2);
        if (C0DB.A0n(getFMessage())) {
            View view = this.A02;
            view.setVisibility(0);
            CircularProgressBar circularProgressBar = this.A06;
            ImageView imageView2 = this.A04;
            TextView textView = this.A05;
            C2JE.A09(true, !z, false, view, circularProgressBar, imageView2, textView);
            conversationRowImage$RowImageView2.setContentDescription(getContext().getString(R.string.image_transfer_in_progress));
            if (anonymousClass094.A02) {
                conversationRowImage$RowImageView2.setOnClickListener(((C2JE) this).A0C);
            } else {
                conversationRowImage$RowImageView2.setOnClickListener(null);
            }
            AbstractView$OnClickListenerC49532Ky abstractView$OnClickListenerC49532Ky = ((C2JE) this).A09;
            textView.setOnClickListener(abstractView$OnClickListenerC49532Ky);
            circularProgressBar.setOnClickListener(abstractView$OnClickListenerC49532Ky);
        } else {
            boolean A0o = C0DB.A0o(getFMessage());
            View view2 = this.A02;
            if (A0o) {
                view2.setVisibility(8);
                CircularProgressBar circularProgressBar2 = this.A06;
                ImageView imageView3 = this.A04;
                TextView textView2 = this.A05;
                C2JE.A09(false, false, false, view2, circularProgressBar2, imageView3, textView2);
                conversationRowImage$RowImageView2.setContentDescription(getContext().getString(R.string.action_open_image));
                AbstractView$OnClickListenerC49532Ky abstractView$OnClickListenerC49532Ky2 = ((C2JE) this).A0C;
                textView2.setOnClickListener(abstractView$OnClickListenerC49532Ky2);
                conversationRowImage$RowImageView2.setOnClickListener(abstractView$OnClickListenerC49532Ky2);
            } else {
                view2.setVisibility(0);
                CircularProgressBar circularProgressBar3 = this.A06;
                ImageView imageView4 = this.A04;
                TextView textView3 = this.A05;
                C2JE.A09(false, !z, false, view2, circularProgressBar3, imageView4, textView3);
                if (!C0DB.A0m(getFMessage())) {
                    textView3.setText(R.string.retry);
                    textView3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_upload, 0, 0, 0);
                    textView3.setOnClickListener(((C2JE) this).A0B);
                    conversationRowImage$RowImageView2.setOnClickListener(((C2JE) this).A0C);
                    conversationRowImage$RowImageView2.setContentDescription(getContext().getString(R.string.action_open_image));
                } else {
                    A0V(textView3, Collections.singletonList(fMessage), fMessage.A01);
                    textView3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_download, 0, 0, 0);
                    View.OnClickListener onClickListener = ((C2JE) this).A0A;
                    textView3.setOnClickListener(onClickListener);
                    conversationRowImage$RowImageView2.setOnClickListener(onClickListener);
                    conversationRowImage$RowImageView2.setContentDescription(getContext().getString(R.string.conversation_row_image_not_downloaded_content_description, textView3.getText()));
                    AnonymousClass088.A1V(conversationRowImage$RowImageView2, R.string.button_download);
                }
            }
        }
        A0M();
        conversationRowImage$RowImageView2.setOnLongClickListener(this.A19);
        A0k(this.A03, this.A07);
        conversationRowImage$RowImageView2.A06 = TextUtils.isEmpty(fMessage.A1A());
        conversationRowImage$RowImageView2.setOutgoing(anonymousClass094.A02);
        conversationRowImage$RowImageView2.A08 = false;
        int i2 = c09h.A08;
        if (i2 != 0 && (i = c09h.A06) != 0) {
            conversationRowImage$RowImageView2.A03(i2, i);
            conversationRowImage$RowImageView2.setScaleType((((AbstractC48202Eh) this).A0P || (this instanceof C51362Wd)) ? ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.MATRIX);
        } else {
            int A00 = C42471vn.A00(fMessage, 100);
            if (A00 > 0) {
                conversationRowImage$RowImageView2.A03(100, A00);
            } else {
                int A01 = C003301p.A01(getContext());
                conversationRowImage$RowImageView2.A03(A01, (A01 * 9) >> 4);
            }
            conversationRowImage$RowImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        C42471vn c42471vn = this.A00;
        if (c42471vn != null) {
            if (this.A01 && !z) {
                this.A01 = false;
                c42471vn.A0A(fMessage, conversationRowImage$RowImageView2, this.A09, anonymousClass094, false);
            } else {
                this.A01 = false;
                c42471vn.A0C(fMessage, conversationRowImage$RowImageView2, this.A09, false);
            }
            A0l(fMessage);
            return;
        }
        throw null;
    }

    @Override // X.AbstractC48202Eh
    public boolean A07() {
        return C0DB.A0K(((AbstractC48182Ef) this).A0K, super.getFMessage());
    }

    @Override // X.AbstractC48202Eh
    public boolean A08() {
        return C0DB.A0g(super.getFMessage());
    }

    @Override // X.AbstractC48202Eh
    public boolean A09() {
        return ((AbstractC48182Ef) this).A0K.A0E(C01C.A2C) && ((AbstractC48182Ef) this).A0K.A0E(C01C.A26) && C0DB.A0o(getFMessage()) && ((AnonymousClass092) super.getFMessage()).A03 >= 127 && A0g();
    }

    @Override // X.AbstractC48182Ef
    public int A0C(int i) {
        if (!TextUtils.isEmpty(super.getFMessage().A1A())) {
            return super.A0C(i);
        }
        if (C0D6.A00(i, 13) >= 0) {
            return R.drawable.message_got_read_receipt_from_target_onmedia;
        }
        if (C0D6.A00(i, 5) >= 0) {
            return R.drawable.message_got_receipt_from_target_onmedia;
        }
        return C0D6.A00(i, 4) == 0 ? R.drawable.message_got_receipt_from_server_onmedia : R.drawable.message_unsent_onmedia;
    }

    @Override // X.AbstractC48182Ef
    public int A0D(int i) {
        if (TextUtils.isEmpty(super.getFMessage().A1A())) {
            return 0;
        }
        return super.A0D(i);
    }

    @Override // X.AbstractC48182Ef
    public void A0I() {
        A0e(false);
        A00(false);
    }

    @Override // X.AbstractC48182Ef
    public void A0J() {
        AnonymousClass097 fMessage = super.getFMessage();
        this.A01 = true;
        C42471vn c42471vn = this.A00;
        if (c42471vn != null) {
            c42471vn.A0A(fMessage, this.A08, this.A09, fMessage.A0n, false);
            return;
        }
        throw null;
    }

    @Override // X.AbstractC48182Ef
    public void A0M() {
        int A00;
        CircularProgressBar circularProgressBar = this.A06;
        if (A0j(circularProgressBar, super.getFMessage()) == 0) {
            A00 = C02160Ac.A00(getContext(), R.color.media_message_progress_indeterminate);
        } else {
            A00 = C02160Ac.A00(getContext(), R.color.media_message_progress_determinate);
        }
        circularProgressBar.A0C = A00;
    }

    @Override // X.AbstractC48182Ef
    public void A0N() {
        boolean z;
        if (((C2JE) this).A02 == null || RequestPermissionActivity.A0Q(getContext(), ((C2JE) this).A02)) {
            AnonymousClass097 fMessage = super.getFMessage();
            C09H c09h = fMessage.A02;
            if (c09h != null) {
                AnonymousClass094 anonymousClass094 = fMessage.A0n;
                boolean z2 = anonymousClass094.A02;
                if (z2 || c09h.A0P) {
                    File file = c09h.A0F;
                    boolean z3 = false;
                    if (file != null) {
                        z = new File(Uri.fromFile(file).getPath()).exists();
                    } else if (z2 && !c09h.A0O) {
                        ((AbstractC48182Ef) this).A0G.A07(R.string.cannot_open_image_wait_until_processed, 0);
                        return;
                    } else {
                        z = false;
                    }
                    StringBuilder A0P = C000200d.A0P("viewmessage/ from_me:");
                    A0P.append(z2);
                    A0P.append(" type:");
                    A0P.append((int) fMessage.A0m);
                    A0P.append(" name:");
                    A0P.append(fMessage.A08);
                    A0P.append(" url:");
                    A0P.append(C40841sx.A0N(fMessage.A09));
                    A0P.append(" file:");
                    A0P.append(c09h.A0F);
                    A0P.append(" progress:");
                    A0P.append(c09h.A0C);
                    A0P.append(" transferred:");
                    A0P.append(c09h.A0P);
                    A0P.append(" transferring:");
                    A0P.append(c09h.A0a);
                    A0P.append(" fileSize:");
                    A0P.append(c09h.A0A);
                    A0P.append(" media_size:");
                    A0P.append(fMessage.A01);
                    A0P.append(" timestamp:");
                    C000200d.A1I(A0P, fMessage.A0E);
                    if (!z) {
                        Log.w("viewmessage/ no file");
                        if (A0m()) {
                            return;
                        }
                        if (((AbstractC48202Eh) this).A0X instanceof C68313Ja) {
                            ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) C02180Ae.A0G(getContext(), ActivityC02290Ap.class);
                            if (activityC02290Ap != null) {
                                ((AbstractC48202Eh) this).A0M.A03(activityC02290Ap);
                                return;
                            }
                            return;
                        }
                        Intent intent = new Intent(getContext(), MediaGalleryActivity.class);
                        intent.putExtra("pos", -1);
                        intent.putExtra("alert", true);
                        intent.putExtra("jid", C003101m.A07(anonymousClass094.A00));
                        intent.putExtra("key", anonymousClass094.hashCode());
                        getContext().startActivity(intent);
                        return;
                    }
                    C658038p c658038p = ((AbstractC48202Eh) this).A0X;
                    if (c658038p != null) {
                        if (c658038p instanceof C68313Ja) {
                            z3 = true;
                        }
                    }
                    AnonymousClass317 A09 = C40841sx.A09(getContext());
                    A09.A07 = z3;
                    AbstractC005302j abstractC005302j = anonymousClass094.A00;
                    if (abstractC005302j != null) {
                        A09.A03 = abstractC005302j;
                        A09.A04 = anonymousClass094;
                        ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A08;
                        A09.A02 = conversationRowImage$RowImageView;
                        A09.A06 = C02180Ae.A0G(getContext(), Conversation.class) != null;
                        C2HC.A06(getContext(), new C1M7(getContext()), A09.A00(), conversationRowImage$RowImageView, C000200d.A0H("thumb-transition-", anonymousClass094.toString()));
                        return;
                    }
                    throw null;
                }
                return;
            }
            throw null;
        }
    }

    @Override // X.AbstractC48182Ef
    public void A0X(AnonymousClass092 anonymousClass092, boolean z) {
        boolean z2 = anonymousClass092 != super.getFMessage();
        super.A0X(anonymousClass092, z);
        if (z || z2) {
            A00(z2);
        }
    }

    @Override // X.AbstractC48182Ef
    public int getBroadcastDrawableId() {
        return TextUtils.isEmpty(super.getFMessage().A1A()) ? R.drawable.broadcast_status_icon_onmedia : R.drawable.broadcast_status_icon;
    }

    @Override // X.AbstractC48202Eh
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_image_left;
    }

    @Override // X.C2JE
    public ViewGroup getExternalAdContentHolder() {
        return (ViewGroup) findViewById(R.id.web_page_preview_holder);
    }

    @Override // X.C2JE, X.AbstractC48202Eh
    public /* bridge */ /* synthetic */ AnonymousClass092 getFMessage() {
        return super.getFMessage();
    }

    @Override // X.C2JE, X.AbstractC48202Eh
    public AnonymousClass095 getFMessage() {
        return (AnonymousClass095) super.getFMessage();
    }

    @Override // X.C2JE, X.AbstractC48202Eh
    public /* bridge */ /* synthetic */ AnonymousClass097 getFMessage() {
        return super.getFMessage();
    }

    @Override // X.AbstractC48202Eh
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_image_left;
    }

    @Override // X.AbstractC48202Eh
    public int getMainChildMaxWidth() {
        if (this.A0A) {
            return this.A08.A03.A02();
        }
        return (C2JE.A01(getContext()) * (((AbstractC48202Eh) this).A0P ? 100 : 72)) / 100;
    }

    @Override // X.AbstractC48202Eh
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_image_right;
    }

    @Override // X.AbstractC48182Ef
    public Drawable getStarDrawable() {
        return TextUtils.isEmpty(super.getFMessage().A1A()) ? C02160Ac.A03(getContext(), R.drawable.message_star_media) : super.getStarDrawable();
    }

    @Override // X.C2JE, X.AbstractC48202Eh
    public void setFMessage(AnonymousClass092 anonymousClass092) {
        C000700j.A07(anonymousClass092 instanceof AnonymousClass095);
        super.setFMessage(anonymousClass092);
    }
}
