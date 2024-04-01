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
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape0S0200000_I0_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape8S0100000_I0_0;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2JC */
/* loaded from: classes2.dex */
public class C2JC extends C2JD {
    public int A00;
    public int A01;
    public long A02;
    public C012005w A03;
    public C42471vn A04;
    public C48652Gd A05;
    public C2ML A06;
    public Runnable A07;
    public Runnable A08;
    public boolean A09;
    public final View A0A;
    public final View A0B;
    public final ViewGroup A0C;
    public final ImageView A0D;
    public final ImageView A0E;
    public final TextView A0F;
    public final CircularProgressBar A0G;
    public final TextEmojiLabel A0H;
    public final ConversationRowVideo$RowVideoView A0I;
    public final InterfaceC43821y3 A0J;
    public final AbstractView$OnClickListenerC49532Ky A0K;

    public C2JC(Context context, C0LO c0lo) {
        super(context, c0lo);
        this.A0K = new ViewOnClickCListenerShape8S0100000_I0_0(this, 48);
        this.A02 = 0L;
        this.A09 = false;
        this.A0J = new InterfaceC43821y3() { // from class: X.38N
            {
                C2JC.this = this;
            }

            @Override // X.InterfaceC43821y3
            public int ADA() {
                return (C2JE.A01(C2JC.this.getContext()) * 72) / 100;
            }

            @Override // X.InterfaceC43821y3
            public void AKM() {
                C2JC.this.A0m();
            }

            @Override // X.InterfaceC43821y3
            public void AUc(View view, Bitmap bitmap, AnonymousClass092 anonymousClass092) {
                C2JC c2jc = C2JC.this;
                if (bitmap != null) {
                    ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = c2jc.A0I;
                    conversationRowVideo$RowVideoView.setImageDrawable(new BitmapDrawable(c2jc.getContext().getResources(), bitmap));
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    if (c2jc.A00 <= 0 || c2jc.A01 <= 0) {
                        c2jc.A00 = height;
                        c2jc.A01 = width;
                    }
                    conversationRowVideo$RowVideoView.A01(width, height, false);
                    return;
                }
                c2jc.A0I.setImageDrawable(new ColorDrawable(C02160Ac.A00(c2jc.getContext(), R.color.dark_gray)));
            }

            @Override // X.InterfaceC43821y3
            public void AUo(View view) {
                C2JC.this.A0I.setImageDrawable(new ColorDrawable(-7829368));
            }
        };
        this.A0F = (TextView) findViewById(R.id.control_btn);
        this.A0I = (ConversationRowVideo$RowVideoView) findViewById(R.id.thumb);
        this.A0G = (CircularProgressBar) findViewById(R.id.progress_bar);
        this.A0E = (ImageView) findViewById(R.id.button_image);
        this.A0A = findViewById(R.id.control_frame);
        this.A0H = (TextEmojiLabel) findViewById(R.id.caption);
        this.A0C = (ViewGroup) findViewById(R.id.video_containter);
        this.A0B = findViewById(R.id.text_and_date);
        this.A0D = (ImageView) findViewById(R.id.gif_attribution);
        TextEmojiLabel textEmojiLabel = this.A0H;
        if (textEmojiLabel != null) {
            C000200d.A0b(textEmojiLabel);
        }
        this.A0G.setMax(100);
        this.A0G.A0B = 0;
        A00(true);
    }

    private void A00(boolean z) {
        Drawable A0L;
        AnonymousClass097 fMessage = super.getFMessage();
        AnonymousClass094 anonymousClass094 = fMessage.A0n;
        hashCode();
        C09H c09h = fMessage.A02;
        if (c09h != null) {
            if (z) {
                this.A0F.setTag(Collections.singletonList(fMessage));
            }
            TextView textView = this.A0F;
            textView.setVisibility(0);
            A0q();
            if (z) {
                A0r(true);
            }
            ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = this.A0I;
            conversationRowVideo$RowVideoView.setKeepRatio(true);
            if (C0DB.A0n(getFMessage())) {
                textView.setVisibility(8);
                View view = this.A0A;
                CircularProgressBar circularProgressBar = this.A0G;
                C2JE.A09(true, !z, false, view, circularProgressBar, this.A0E, textView);
                conversationRowVideo$RowVideoView.setVisibility(0);
                if (anonymousClass094.A02) {
                    AbstractView$OnClickListenerC49532Ky abstractView$OnClickListenerC49532Ky = ((C2JE) this).A0C;
                    conversationRowVideo$RowVideoView.setOnClickListener(abstractView$OnClickListenerC49532Ky);
                    this.A0C.setOnClickListener(abstractView$OnClickListenerC49532Ky);
                } else {
                    conversationRowVideo$RowVideoView.setOnClickListener(null);
                    this.A0C.setOnClickListener(null);
                }
                View.OnClickListener onClickListener = ((C2JE) this).A09;
                textView.setOnClickListener(onClickListener);
                circularProgressBar.setOnClickListener(onClickListener);
            } else if (C0DB.A0o(getFMessage())) {
                View view2 = this.A0A;
                CircularProgressBar circularProgressBar2 = this.A0G;
                ImageView imageView = this.A0E;
                C2JE.A09(false, false, false, view2, circularProgressBar2, imageView, textView);
                imageView.setVisibility(0);
                imageView.setImageResource(R.drawable.ic_gif_thumb);
                textView.setVisibility(8);
                ViewGroup viewGroup = this.A0C;
                viewGroup.setOnClickListener(((C2JE) this).A0C);
                viewGroup.setContentDescription(viewGroup.getContext().getString(R.string.view_gif_content_description));
                View.OnClickListener viewOnClickEBaseShape0S0200000_I0_0 = new ViewOnClickEBaseShape0S0200000_I0_0(this, fMessage, 10);
                textView.setOnClickListener(viewOnClickEBaseShape0S0200000_I0_0);
                conversationRowVideo$RowVideoView.setOnClickListener(viewOnClickEBaseShape0S0200000_I0_0);
                conversationRowVideo$RowVideoView.setContentDescription(conversationRowVideo$RowVideoView.getContext().getString(R.string.play_gif_descr));
                InterfaceC04690Ll rowsContainer = getRowsContainer();
                if (rowsContainer != null && rowsContainer.AUN(anonymousClass094)) {
                    A0p();
                }
            } else {
                ImageView imageView2 = this.A0E;
                imageView2.setVisibility(8);
                if (!C0DB.A0m(getFMessage())) {
                    textView.setText(R.string.retry);
                    textView.setContentDescription(getContext().getString(R.string.retry));
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_upload, 0, 0, 0);
                    textView.setOnClickListener(((C2JE) this).A0B);
                    conversationRowVideo$RowVideoView.setOnClickListener(((C2JE) this).A0C);
                } else {
                    A0V(textView, Collections.singletonList(fMessage), fMessage.A01);
                    textView.setContentDescription(textView.getContext().getString(R.string.button_download));
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_download, 0, 0, 0);
                    View.OnClickListener onClickListener2 = this.A0K;
                    textView.setOnClickListener(onClickListener2);
                    conversationRowVideo$RowVideoView.setOnClickListener(onClickListener2);
                }
                C2JE.A09(false, !z, false, this.A0A, this.A0G, imageView2, textView);
            }
            A0M();
            View.OnLongClickListener onLongClickListener = this.A19;
            conversationRowVideo$RowVideoView.setOnLongClickListener(onLongClickListener);
            this.A0C.setOnLongClickListener(onLongClickListener);
            if (anonymousClass094.A02) {
                Context context = getContext();
                if (context != null) {
                    A0L = C02180Ae.A0M(context);
                } else {
                    throw null;
                }
            } else {
                Context context2 = getContext();
                if (context2 != null) {
                    A0L = C02180Ae.A0L(context2);
                } else {
                    throw null;
                }
            }
            conversationRowVideo$RowVideoView.A05 = A0L;
            int A01 = C003301p.A01(getContext());
            int A00 = C42471vn.A00(fMessage, A01);
            if (A00 > 0) {
                this.A00 = A00;
            } else {
                A00 = (A01 * 9) >> 4;
                this.A00 = A00;
            }
            this.A01 = A01;
            conversationRowVideo$RowVideoView.A01(A01, A00, true);
            this.A04.A0C(fMessage, conversationRowVideo$RowVideoView, this.A0J, false);
            if (fMessage.A00 == 0) {
                fMessage.A00 = C0DD.A03(c09h.A0F);
            }
            C09H c09h2 = super.getFMessage().A02;
            if (c09h2 != null) {
                int i = c09h2.A05;
                if (i == 1) {
                    ImageView imageView3 = this.A0D;
                    imageView3.setImageResource(R.drawable.ic_attributes_giphy);
                    imageView3.setVisibility(0);
                } else if (i != 2) {
                    this.A0D.setVisibility(8);
                } else {
                    ImageView imageView4 = this.A0D;
                    imageView4.setImageResource(R.drawable.ic_attributes_tenor);
                    imageView4.setVisibility(0);
                }
                A0k(this.A0B, this.A0H);
                hashCode();
                A0l(fMessage);
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AbstractC48202Eh
    public boolean A07() {
        return C0DB.A0K(((AbstractC48182Ef) this).A0K, super.getFMessage());
    }

    @Override // X.AbstractC48202Eh
    public boolean A08() {
        if (!(this instanceof C2WP)) {
            return C0DB.A0g(super.getFMessage());
        }
        return C0DB.A0g((C0LO) super.getFMessage());
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
        CircularProgressBar circularProgressBar = this.A0G;
        if (A0j(circularProgressBar, super.getFMessage()) == 0) {
            A00 = C02160Ac.A00(getContext(), R.color.media_message_progress_indeterminate);
        } else {
            A00 = C02160Ac.A00(getContext(), R.color.media_message_progress_determinate);
        }
        circularProgressBar.A0C = A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x00f4, code lost:
        if ((r0 instanceof X.C68313Ja) != false) goto L43;
     */
    @Override // X.AbstractC48182Ef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0N() {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2JC.A0N():void");
    }

    @Override // X.AbstractC48182Ef
    public void A0X(AnonymousClass092 anonymousClass092, boolean z) {
        boolean z2 = anonymousClass092 != super.getFMessage();
        super.A0X(anonymousClass092, z);
        if (z || z2) {
            A00(z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0n() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2JC.A0n():void");
    }

    public final void A0o() {
        Log.w("viewmessage/ no file");
        AnonymousClass097 fMessage = super.getFMessage();
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
        AnonymousClass094 anonymousClass094 = fMessage.A0n;
        intent.putExtra("jid", C003101m.A07(anonymousClass094.A00));
        intent.putExtra("key", anonymousClass094.hashCode());
        getContext().startActivity(intent);
    }

    public final void A0p() {
        C09H c09h = super.getFMessage().A02;
        if (c09h != null) {
            File file = c09h.A0F;
            if (file != null && new File(Uri.fromFile(file).getPath()).exists()) {
                if (this.A08 == null && this.A07 == null) {
                    RunnableEBaseShape1S0100000_I0_1 runnableEBaseShape1S0100000_I0_1 = new RunnableEBaseShape1S0100000_I0_1(this, 49);
                    this.A08 = runnableEBaseShape1S0100000_I0_1;
                    ((AbstractC48182Ef) this).A0G.A02.post(runnableEBaseShape1S0100000_I0_1);
                    return;
                }
                return;
            }
            A0o();
            return;
        }
        throw null;
    }

    public final void A0q() {
        Runnable runnable = this.A08;
        if (runnable != null) {
            ((AbstractC48182Ef) this).A0G.A02.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.A07;
        if (runnable2 != null) {
            ((AbstractC48182Ef) this).A0G.A02.removeCallbacks(runnable2);
        }
        this.A08 = null;
        this.A07 = null;
    }

    public final void A0r(boolean z) {
        C48652Gd c48652Gd = this.A05;
        if (c48652Gd != null) {
            c48652Gd.hashCode();
            C48652Gd c48652Gd2 = this.A05;
            ((AbstractC48662Ge) c48652Gd2).A04 = null;
            c48652Gd2.A0B = null;
            if (z) {
                C72963as c72963as = this.A06.A00;
                if (c72963as != null) {
                    C000700j.A01();
                    if (c72963as.A07.remove(c48652Gd2)) {
                        List list = c72963as.A06;
                        list.add(c48652Gd2);
                        c48652Gd2.hashCode();
                        list.size();
                    } else {
                        StringBuilder A0P = C000200d.A0P("ExoPlayerVideoPlayerPoolManager/releaseVideoPlayerInstance/playerNotProvidedByPool videoPlayerId=");
                        A0P.append(c48652Gd2.hashCode());
                        Log.e(A0P.toString());
                    }
                } else {
                    throw null;
                }
            }
            this.A05 = null;
        }
        this.A0I.setVisibility(0);
        this.A0A.setVisibility(0);
    }

    @Override // X.AbstractC48182Ef
    public int getBroadcastDrawableId() {
        return TextUtils.isEmpty(super.getFMessage().A1A()) ? R.drawable.broadcast_status_icon_onmedia : R.drawable.broadcast_status_icon;
    }

    @Override // X.AbstractC48202Eh
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_gif_left;
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
    public /* bridge */ /* synthetic */ AnonymousClass097 getFMessage() {
        return super.getFMessage();
    }

    @Override // X.C2JE, X.AbstractC48202Eh
    public C0LO getFMessage() {
        return (C0LO) super.getFMessage();
    }

    @Override // X.AbstractC48202Eh
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_gif_left;
    }

    @Override // X.AbstractC48202Eh
    public int getMainChildMaxWidth() {
        int A01 = (C2JE.A01(getContext()) * 72) / 100;
        int i = this.A00;
        int i2 = this.A01;
        return i > i2 ? (int) ((A01 / i) * i2) : A01;
    }

    @Override // X.AbstractC48202Eh
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_gif_right;
    }

    @Override // X.AbstractC48182Ef
    public Drawable getStarDrawable() {
        return TextUtils.isEmpty(super.getFMessage().A1A()) ? C02160Ac.A03(getContext(), R.drawable.message_star_media) : super.getStarDrawable();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.getFMessage();
        hashCode();
        super.onAttachedToWindow();
    }

    @Override // X.AbstractC48182Ef, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        AnonymousClass097 fMessage = super.getFMessage();
        hashCode();
        super.onDetachedFromWindow();
        A0q();
        A0r(true);
        AnonymousClass094 anonymousClass094 = fMessage.A0n;
        InterfaceC04690Ll rowsContainer = getRowsContainer();
        if (rowsContainer != null) {
            rowsContainer.A7F(anonymousClass094);
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.getFMessage();
        hashCode();
        super.onFinishTemporaryDetach();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        C09F c09f = (C09F) super.getFMessage();
        hashCode();
        super.onStartTemporaryDetach();
        InterfaceC04690Ll rowsContainer = getRowsContainer();
        if (this.A05 != null) {
            long j = this.A02;
            if (j <= 0 || rowsContainer == null) {
                return;
            }
            rowsContainer.AVq(c09f, System.currentTimeMillis() - j);
            this.A02 = 0L;
        }
    }

    @Override // X.C2JE, X.AbstractC48202Eh
    public void setFMessage(AnonymousClass092 anonymousClass092) {
        C000700j.A07(anonymousClass092 instanceof C0LO);
        super.setFMessage(anonymousClass092);
    }
}
