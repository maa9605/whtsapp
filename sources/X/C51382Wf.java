package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.Conversation;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collections;

/* renamed from: X.2Wf  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C51382Wf extends AbstractC51392Wg {
    public C42471vn A00;
    public final View A01;
    public final View A02;
    public final ImageView A03;
    public final TextView A04;
    public final TextView A05;
    public final CircularProgressBar A06;
    public final TextEmojiLabel A07;
    public final ConversationRowVideo$RowVideoView A08;
    public final InterfaceC43821y3 A09;

    public C51382Wf(Context context, C0JP c0jp) {
        super(context, c0jp);
        this.A09 = new InterfaceC43821y3() { // from class: X.38T
            @Override // X.InterfaceC43821y3
            public int ADA() {
                return (C2JE.A01(C51382Wf.this.getContext()) * 72) / 100;
            }

            @Override // X.InterfaceC43821y3
            public void AKM() {
                C51382Wf.this.A0m();
            }

            @Override // X.InterfaceC43821y3
            public void AUc(View view, Bitmap bitmap, AnonymousClass092 anonymousClass092) {
                C51382Wf c51382Wf = C51382Wf.this;
                if (bitmap != null) {
                    ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = c51382Wf.A08;
                    conversationRowVideo$RowVideoView.setImageDrawable(new BitmapDrawable(c51382Wf.getContext().getResources(), bitmap));
                    conversationRowVideo$RowVideoView.A01(bitmap.getWidth(), bitmap.getHeight(), false);
                    return;
                }
                c51382Wf.A08.setImageDrawable(new ColorDrawable(C02160Ac.A00(c51382Wf.getContext(), R.color.dark_gray)));
            }

            @Override // X.InterfaceC43821y3
            public void AUo(View view) {
                C51382Wf.this.A08.setBackgroundColor(-7829368);
            }
        };
        this.A04 = (TextView) findViewById(R.id.control_btn);
        this.A08 = (ConversationRowVideo$RowVideoView) findViewById(R.id.thumb);
        this.A06 = (CircularProgressBar) findViewById(R.id.progress_bar);
        this.A05 = (TextView) findViewById(R.id.info);
        this.A03 = (ImageView) findViewById(R.id.button_image);
        this.A01 = findViewById(R.id.control_frame);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.caption);
        this.A07 = textEmojiLabel;
        C000200d.A0b(textEmojiLabel);
        this.A02 = findViewById(R.id.text_and_date);
        this.A06.setMax(100);
        this.A06.A0B = 0;
        A00(true);
    }

    private void A00(boolean z) {
        String A0k;
        AnonymousClass097 fMessage = super.getFMessage();
        C09H c09h = fMessage.A02;
        if (c09h != null) {
            if (z) {
                this.A04.setTag(Collections.singletonList(fMessage));
            }
            TextView textView = this.A05;
            textView.setVisibility(8);
            ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = this.A08;
            conversationRowVideo$RowVideoView.setKeepRatio(((AbstractC48202Eh) this).A0P);
            conversationRowVideo$RowVideoView.setFullWidth(((AbstractC48202Eh) this).A0P);
            C0AT.A0e(conversationRowVideo$RowVideoView, C000200d.A0H("thumb-transition-", fMessage.A0n.toString()));
            C0AT.A0e(this.A1E, C2JE.A02(fMessage));
            ImageView imageView = this.A1D;
            if (imageView != null) {
                C0AT.A0e(imageView, C2JE.A07(fMessage));
            }
            if (((AbstractC48202Eh) this).A0P) {
                int A01 = C003301p.A01(getContext());
                int A00 = C42471vn.A00(fMessage, A01);
                if (A00 <= 0) {
                    A00 = (A01 * 9) >> 4;
                }
                conversationRowVideo$RowVideoView.A01(A01, A00, true);
            }
            if (C0DB.A0n(getFMessage())) {
                View view = this.A01;
                CircularProgressBar circularProgressBar = this.A06;
                ImageView imageView2 = this.A03;
                TextView textView2 = this.A04;
                C2JE.A09(true, !z, false, view, circularProgressBar, imageView2, textView2);
                conversationRowVideo$RowVideoView.setVisibility(0);
                conversationRowVideo$RowVideoView.setContentDescription(getContext().getString(R.string.video_transfer_in_progress));
                conversationRowVideo$RowVideoView.setOnClickListener(null);
                AbstractView$OnClickListenerC49532Ky abstractView$OnClickListenerC49532Ky = ((C2JE) this).A09;
                textView2.setOnClickListener(abstractView$OnClickListenerC49532Ky);
                circularProgressBar.setOnClickListener(abstractView$OnClickListenerC49532Ky);
            } else if (C0DB.A0o(getFMessage())) {
                conversationRowVideo$RowVideoView.setVisibility(0);
                View view2 = this.A01;
                CircularProgressBar circularProgressBar2 = this.A06;
                ImageView imageView3 = this.A03;
                TextView textView3 = this.A04;
                C2JE.A09(false, false, false, view2, circularProgressBar2, imageView3, textView3);
                textView3.setVisibility(8);
                imageView3.setVisibility(0);
                imageView3.setImageResource(R.drawable.ic_video_play_conv);
                imageView3.setContentDescription(getContext().getString(R.string.play_video));
                conversationRowVideo$RowVideoView.setContentDescription(getContext().getString(R.string.video_duration_seconds, AnonymousClass029.A0c(((AbstractC48202Eh) this).A0J, fMessage.A00, 0)));
                AbstractView$OnClickListenerC49532Ky abstractView$OnClickListenerC49532Ky2 = ((C2JE) this).A0C;
                imageView3.setOnClickListener(abstractView$OnClickListenerC49532Ky2);
                textView3.setOnClickListener(abstractView$OnClickListenerC49532Ky2);
                conversationRowVideo$RowVideoView.setOnClickListener(abstractView$OnClickListenerC49532Ky2);
            } else {
                TextView textView4 = this.A04;
                A0V(textView4, Collections.singletonList(fMessage), fMessage.A01);
                textView4.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_download, 0, 0, 0);
                AbstractView$OnClickListenerC49532Ky abstractView$OnClickListenerC49532Ky3 = ((C2JE) this).A0A;
                textView4.setOnClickListener(abstractView$OnClickListenerC49532Ky3);
                conversationRowVideo$RowVideoView.setOnClickListener(abstractView$OnClickListenerC49532Ky3);
                conversationRowVideo$RowVideoView.setContentDescription(getContext().getString(R.string.button_download));
                textView4.setVisibility(0);
                ImageView imageView4 = this.A03;
                imageView4.setVisibility(8);
                C2JE.A09(false, !z, false, this.A01, this.A06, imageView4, textView4);
            }
            A0M();
            conversationRowVideo$RowVideoView.setOnLongClickListener(this.A19);
            Context context = getContext();
            if (context != null) {
                conversationRowVideo$RowVideoView.A05 = C02180Ae.A0L(context);
                this.A00.A0C(fMessage, conversationRowVideo$RowVideoView, this.A09, false);
                int i = fMessage.A00;
                if (i == 0) {
                    i = C0DD.A03(c09h.A0F);
                    fMessage.A00 = i;
                }
                if (i != 0) {
                    A0k = AnonymousClass029.A0g(((AbstractC48202Eh) this).A0J, i);
                } else {
                    A0k = C02180Ae.A0k(((AbstractC48202Eh) this).A0J, fMessage.A01);
                }
                textView.setText(A0k);
                textView.setVisibility(0);
                if (((AbstractC48202Eh) this).A0J.A0M()) {
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mark_video, 0, 0, 0);
                } else {
                    textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new C0We(((AbstractC48202Eh) this).A0J, C02160Ac.A03(getContext(), R.drawable.mark_video)), (Drawable) null);
                }
                A0k(this.A02, this.A07);
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AbstractC48202Eh
    public boolean A08() {
        return C0DB.A0g(super.getFMessage());
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
        A00(false);
        A0e(false);
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
        if (((C2JE) this).A02 == null || RequestPermissionActivity.A0Q(getContext(), ((C2JE) this).A02)) {
            AnonymousClass097 fMessage = super.getFMessage();
            C09H c09h = fMessage.A02;
            if (c09h != null) {
                if (c09h.A0P) {
                    if (c09h.A07 == 1) {
                        ((AbstractC48182Ef) this).A0G.A05(R.string.gallery_unsafe_video_removed, 1);
                        return;
                    }
                    File file = c09h.A0F;
                    boolean exists = file != null ? new File(Uri.fromFile(file).getPath()).exists() : false;
                    StringBuilder A0P = C000200d.A0P("viewmessage/ from_me:");
                    AnonymousClass094 anonymousClass094 = fMessage.A0n;
                    A0P.append(anonymousClass094.A02);
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
                    if (!exists) {
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
                    boolean z = ((AbstractC48202Eh) this).A0X instanceof C68313Ja;
                    int i = z ? 3 : 1;
                    AnonymousClass317 A09 = C40841sx.A09(getContext());
                    A09.A07 = z;
                    AbstractC005302j abstractC005302j = anonymousClass094.A00;
                    if (abstractC005302j != null) {
                        A09.A03 = abstractC005302j;
                        A09.A04 = anonymousClass094;
                        A09.A01 = i;
                        ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = this.A08;
                        A09.A02 = conversationRowVideo$RowVideoView;
                        A09.A06 = C02180Ae.A0G(getContext(), Conversation.class) != null;
                        C2HC.A06(getContext(), new C1M7(getContext()), A09.A00(), conversationRowVideo$RowVideoView, C000200d.A0H("thumb-transition-", anonymousClass094.toString()));
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

    @Override // X.AbstractC48202Eh
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_legacy_video_left;
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
    public C0JP getFMessage() {
        return (C0JP) super.getFMessage();
    }

    @Override // X.AbstractC48202Eh
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_legacy_video_left;
    }

    @Override // X.AbstractC48202Eh
    public int getMainChildMaxWidth() {
        return (C2JE.A01(getContext()) * 72) / 100;
    }

    @Override // X.AbstractC48202Eh
    public int getOutgoingLayoutId() {
        throw new IllegalStateException("this row type does not support outgoing messages");
    }

    @Override // X.AbstractC48182Ef
    public Drawable getStarDrawable() {
        return TextUtils.isEmpty(super.getFMessage().A1A()) ? C02160Ac.A03(getContext(), R.drawable.message_star_media) : super.getStarDrawable();
    }

    @Override // X.C2JE, X.AbstractC48202Eh
    public void setFMessage(AnonymousClass092 anonymousClass092) {
        C000700j.A07(anonymousClass092 instanceof C0JP);
        super.setFMessage(anonymousClass092);
    }
}
