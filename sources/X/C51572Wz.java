package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape0S0200000_I0_0;
import com.google.android.search.verification.client.R;

/* renamed from: X.2Wz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C51572Wz extends C2X0 {
    public C013306k A00;
    public C0DV A01;
    public C03750Gx A02;
    public final TextView A03;

    public C51572Wz(Context context, AnonymousClass092 anonymousClass092) {
        super(context, anonymousClass092);
        this.A03 = (TextView) findViewById(R.id.info);
        A0j();
    }

    @Override // X.AbstractC48182Ef
    public void A0I() {
        A0j();
        A0e(false);
    }

    @Override // X.AbstractC48182Ef
    public void A0X(AnonymousClass092 anonymousClass092, boolean z) {
        boolean z2 = anonymousClass092 != getFMessage();
        super.A0X(anonymousClass092, z);
        if (z || z2) {
            A0j();
        }
    }

    public final void A0j() {
        String str;
        AnonymousClass093 anonymousClass093;
        String str2;
        TextView textView = this.A03;
        textView.setTextSize(AbstractC48182Ef.A03(getResources()));
        textView.setBackgroundResource(R.drawable.business_balloon);
        AnonymousClass092 fMessage = getFMessage();
        if (fMessage instanceof C0LS) {
            str = ((C0LR) fMessage).A00;
        } else if (fMessage instanceof C0LQ) {
            str = ((C0LR) fMessage).A00;
        } else {
            throw new IllegalStateException("PAY: message is not FMessagePaymentRequestDeclined or FMessagePaymentRequestCancelled");
        }
        if (TextUtils.isEmpty(str)) {
            anonymousClass093 = null;
            str2 = null;
        } else {
            anonymousClass093 = this.A00.A0P(str, null);
            if (anonymousClass093 != null) {
                str2 = this.A02.A0N(getFMessage(), anonymousClass093);
            } else {
                str2 = null;
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            textView.setOnClickListener(new ViewOnClickEBaseShape0S0200000_I0_0(this, anonymousClass093, 17));
            textView.setText(str2);
            textView.setTextColor(C02160Ac.A00(getContext(), R.color.bubbleBusinessText));
            return;
        }
        textView.setOnClickListener(null);
    }

    @Override // X.AbstractC48202Eh
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_divider;
    }

    @Override // X.AbstractC48202Eh
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_divider;
    }

    @Override // X.AbstractC48202Eh
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_divider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0007, code lost:
        if ((r3 instanceof X.C0LS) != false) goto L8;
     */
    @Override // X.AbstractC48202Eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setFMessage(X.AnonymousClass092 r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof X.C0LQ
            if (r0 != 0) goto L9
            boolean r1 = r3 instanceof X.C0LS
            r0 = 0
            if (r1 == 0) goto La
        L9:
            r0 = 1
        La:
            X.C000700j.A07(r0)
            super.setFMessage(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51572Wz.setFMessage(X.092):void");
    }
}
