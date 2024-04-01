package com.whatsapp.payments.ui.widget;

import X.AnonymousClass092;
import X.AnonymousClass093;
import X.C002301c;
import X.C018308n;
import X.C02160Ac;
import X.C02180Ae;
import X.C02980Dr;
import X.C03750Gx;
import X.C05W;
import X.C0AT;
import X.C0C9;
import X.C0DV;
import X.C0DX;
import X.C0L5;
import X.C0L7;
import X.C0Zn;
import X.C2Ly;
import X.C2OS;
import X.C2OU;
import X.C3SN;
import X.C40841sx;
import X.C4AE;
import X.C4FV;
import X.InterfaceC03590Gh;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.QuickContactActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* loaded from: classes3.dex */
public class PeerPaymentTransactionRow extends C4FV implements C4AE {
    public View A00;
    public View A01;
    public FrameLayout A02;
    public ImageView A03;
    public ImageView A04;
    public LinearLayout A05;
    public LinearLayout A06;
    public TextView A07;
    public TextEmojiLabel A08;
    public TextEmojiLabel A09;
    public TextEmojiLabel A0A;
    public TextEmojiLabel A0B;
    public WaImageView A0C;
    public WaTextView A0D;
    public WaTextView A0E;
    public C0L7 A0F;
    public C05W A0G;
    public C0Zn A0H;
    public C0L5 A0I;
    public C002301c A0J;
    public C0C9 A0K;
    public AnonymousClass093 A0L;
    public C02980Dr A0M;
    public C2OS A0N;
    public C2OU A0O;
    public C0DV A0P;
    public C2Ly A0Q;
    public C03750Gx A0R;

    public PeerPaymentTransactionRow(Context context) {
        super(context);
        A00();
    }

    public PeerPaymentTransactionRow(Context context, C2OS c2os) {
        super(context);
        A00();
        this.A0N = c2os;
    }

    public PeerPaymentTransactionRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        LayoutInflater.from(getContext()).inflate(R.layout.payment_transaction_row, (ViewGroup) this, true);
        setOrientation(1);
        setBackground(C02160Ac.A03(getContext(), R.drawable.selector_orange_gradient));
        this.A04 = (ImageView) findViewById(R.id.transaction_icon);
        this.A0A = (TextEmojiLabel) findViewById(R.id.transaction_receiver);
        this.A09 = (TextEmojiLabel) findViewById(R.id.transaction_note);
        this.A08 = (TextEmojiLabel) findViewById(R.id.transaction_amount);
        this.A07 = (TextView) findViewById(R.id.transaction_status);
        this.A01 = findViewById(R.id.transaction_shimmer);
        this.A03 = (ImageView) findViewById(R.id.sales_icon);
        this.A0E = (WaTextView) findViewById(R.id.requested_from_note);
        this.A00 = findViewById(R.id.action_buttons_container);
        this.A05 = (LinearLayout) findViewById(R.id.transaction_row_details);
        this.A0C = (WaImageView) findViewById(R.id.transaction_loading_error);
        this.A02 = (FrameLayout) findViewById(R.id.custom_country_view_container);
        this.A06 = (LinearLayout) findViewById(R.id.transaction_row_not_supported);
        this.A0B = (TextEmojiLabel) findViewById(R.id.transaction_receiver_not_supported);
        this.A0D = (WaTextView) findViewById(R.id.transaction_not_supported_description);
        this.A0H = this.A0I.A04(getContext());
        C02180Ae.A17(this.A0C, C02160Ac.A00(getContext(), R.color.payments_error_exclamation));
        setOnClickListener(new C3SN(this));
    }

    public /* synthetic */ void A01() {
        C0DX c0dx;
        InterfaceC03590Gh A02 = this.A0P.A02(this.A0L.A0E);
        if (A02 != null) {
            c0dx = A02.ACJ(this.A0L.A0G);
        } else {
            c0dx = null;
        }
        C40841sx.A0V(getContext(), c0dx, this.A0L);
    }

    public /* synthetic */ void A02(View view) {
        QuickContactActivity.A00(C018308n.A00(getContext()), view, this.A0L.A0B, C0AT.A0G(this.A04));
    }

    public /* synthetic */ void A03(View view) {
        QuickContactActivity.A00(C018308n.A00(getContext()), view, this.A0L.A0C, C0AT.A0G(this.A04));
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0024, code lost:
        if (r1 != 200) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x010f  */
    @Override // X.C4AE
    /* renamed from: A04 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A5j(X.AnonymousClass093 r16) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.widget.PeerPaymentTransactionRow.A5j(X.093):void");
    }

    @Override // X.C4AE
    public void ARG() {
        AnonymousClass093 anonymousClass093 = this.A0L;
        if (anonymousClass093 == null || this.A0N == null) {
            return;
        }
        A5j(anonymousClass093);
    }

    public String getAmountText() {
        String A0C = this.A0R.A0C(this.A0L);
        if (!this.A0L.A0O()) {
            int i = this.A0L.A02;
            return (i == 1 || i == 100) ? getContext().getString(R.string.payments_history_amount_debited, A0C) : (i == 2 || i == 200) ? getContext().getString(R.string.payments_history_amount_credited, A0C) : A0C;
        }
        return A0C;
    }

    public C2OS getCallback() {
        return this.A0N;
    }

    public int getLayoutResourceId() {
        return R.layout.payment_transaction_row;
    }

    public int getStatusColor() {
        return C02160Ac.A00(getContext(), C03750Gx.A00(this.A0L));
    }

    public String getStatusLabel() {
        return this.A0R.A0D(this.A0L);
    }

    public String getTransactionTitle() {
        return this.A0R.A0L(this.A0L, false);
    }

    public void setCallback(C2OS c2os) {
        this.A0N = c2os;
    }

    public void setupTransactionNote(AnonymousClass092 anonymousClass092) {
        if (anonymousClass092 == null || TextUtils.isEmpty(anonymousClass092.A0G())) {
            this.A09.setVisibility(8);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(anonymousClass092.A0G());
        this.A0M.A03(getContext(), spannableStringBuilder, anonymousClass092.A0c, true);
        this.A09.A06(spannableStringBuilder, null, false, 0);
        this.A09.setVisibility(0);
    }
}
