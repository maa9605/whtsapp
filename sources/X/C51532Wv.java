package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.ConversationPaymentRowTransactionLayout;

/* renamed from: X.2Wv  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C51532Wv extends AbstractC51542Ww implements C2OS {
    public C09I A00;
    public C40261rr A01;
    public C0GZ A02;
    public C2MY A03;
    public C2OU A04;
    public C0GR A05;
    public C0DW A06;
    public C0DV A07;
    public C2Ly A08;
    public C03750Gx A09;
    public final View A0A;
    public final View A0B;
    public final View A0C;
    public final View A0D;
    public final View A0E;
    public final View A0F;
    public final View A0G;
    public final View A0H;
    public final View A0I;
    public final FrameLayout A0J;
    public final LinearLayout A0K;
    public final TextEmojiLabel A0L;
    public final TextEmojiLabel A0M;
    public final TextEmojiLabel A0N;
    public final WaTextView A0O;
    public final ConversationPaymentRowTransactionLayout A0P;

    @Override // X.AbstractC48202Eh
    public int getBubbleAlpha() {
        return 255;
    }

    public C51532Wv(Context context, AnonymousClass092 anonymousClass092) {
        super(context, anonymousClass092);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.message_text);
        this.A0L = textEmojiLabel;
        textEmojiLabel.setTypeface(null, 0);
        C000200d.A0b(this.A0L);
        this.A0L.setAutoLinkMask(0);
        this.A0L.setLinksClickable(false);
        this.A0L.setFocusable(false);
        this.A0L.setClickable(false);
        this.A0L.setLongClickable(false);
        this.A0D = findViewById(R.id.payment_unsupported_icon);
        this.A0K = (LinearLayout) findViewById(R.id.main_layout);
        this.A0M = (TextEmojiLabel) findViewById(R.id.payment_note);
        this.A0N = (TextEmojiLabel) findViewById(R.id.transaction_status);
        this.A0J = (FrameLayout) findViewById(R.id.payment_amount_container);
        this.A0P = (ConversationPaymentRowTransactionLayout) findViewById(R.id.transaction_status_container);
        this.A0I = findViewById(R.id.text_and_date);
        this.A0O = (WaTextView) findViewById(R.id.payment_symbol);
        this.A0A = findViewById(R.id.accept_payment_container);
        this.A0H = findViewById(R.id.send_payment_again_container);
        this.A0G = findViewById(R.id.retry_withdrawal_container);
        this.A0E = findViewById(R.id.request_actions_container);
        this.A0F = findViewById(R.id.requested_message_holder);
        this.A0B = findViewById(R.id.payment_shimmer);
        this.A0C = findViewById(R.id.payment_loading_error);
        A0k();
    }

    @Override // X.AbstractC48182Ef
    public void A0I() {
        A0e(false);
        A0k();
    }

    @Override // X.AbstractC48182Ef
    public void A0X(AnonymousClass092 anonymousClass092, boolean z) {
        boolean z2 = anonymousClass092 != getFMessage();
        super.A0X(anonymousClass092, z);
        if (z || z2) {
            A0k();
        }
    }

    public final void A0j() {
        this.A0J.setVisibility(8);
        View view = this.A0A;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.A0G;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.A0H;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        this.A0K.setOnClickListener(null);
        this.A0N.setVisibility(8);
        this.A0F.setVisibility(8);
        View view4 = this.A0E;
        if (view4 != null) {
            view4.setVisibility(8);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01e7, code lost:
        if (r1 == 10) goto L244;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0k() {
        /*
            Method dump skipped, instructions count: 2048
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51532Wv.A0k():void");
    }

    @Override // X.C2OS
    public void AMs() {
        A0I();
    }

    @Override // X.AbstractC48202Eh
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_payment_left;
    }

    @Override // X.AbstractC48202Eh
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_payment_left;
    }

    @Override // X.AbstractC48202Eh
    public int getMainChildMaxWidth() {
        return (((int) getResources().getDimension(R.dimen.payment_bubble_margin_width)) << 1) + ((int) getResources().getDimension(R.dimen.payment_bubble_amount_width));
    }

    @Override // X.AbstractC48202Eh
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_payment_right;
    }

    @Override // X.AbstractC48202Eh
    public void setFMessage(AnonymousClass092 anonymousClass092) {
        C000700j.A07(anonymousClass092.A0F != null);
        super.setFMessage(anonymousClass092);
    }
}
