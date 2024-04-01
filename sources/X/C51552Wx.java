package X;

import android.content.Context;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape0S0200000_I0_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

/* renamed from: X.2Wx  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C51552Wx extends AbstractC51562Wy {
    public AbstractC000600i A00;
    public C0GZ A01;
    public C0DW A02;
    public C0DV A03;
    public final TextView A04;

    @Override // X.C2WA
    public int getBackgroundResource() {
        return 0;
    }

    public C51552Wx(Context context, C04300Jq c04300Jq) {
        super(context, c04300Jq);
        this.A04 = (TextView) findViewById(R.id.setup_payment_account_button);
        A02();
    }

    private void A02() {
        boolean z = true;
        if (!this.A02.A04()) {
            Log.i("PAY: Cannot render payment invite system messages because payment is not enabled");
            findViewById(R.id.divider).setVisibility(8);
            this.A04.setVisibility(8);
            this.A00.A09("ConversationRowPaymentInviteSystemMessage/fillView", "Cannot render payment invite message because payment is disabled", true);
            return;
        }
        C04300Jq fMessage = getFMessage();
        int i = fMessage.A00;
        if (i == 40) {
            if (this.A01.A09()) {
                this.A04.setVisibility(8);
                findViewById(R.id.divider).setVisibility(8);
                return;
            }
            findViewById(R.id.divider).setVisibility(0);
            TextView textView = this.A04;
            textView.setVisibility(0);
            textView.setText(R.string.payments_setup_account_reminder_button_text);
            textView.setOnClickListener(new ViewOnClickEBaseShape0S0200000_I0_0(this, fMessage, 14));
        } else if (i != 41 && i != 64) {
            if (i != 42 && i != 65) {
                return;
            }
            findViewById(R.id.divider).setVisibility(8);
            this.A04.setVisibility(8);
        } else {
            if (i != 41 && (!(fMessage instanceof AbstractC05550Pe) || !((AbstractC05550Pe) fMessage).A01)) {
                z = false;
            }
            findViewById(R.id.divider).setVisibility(z ? 0 : 8);
            TextView textView2 = this.A04;
            textView2.setVisibility(z ? 0 : 8);
            textView2.setText(R.string.payments_send_money_text);
            if (!this.A01.A09()) {
                textView2.setOnClickListener(new ViewOnClickEBaseShape0S0200000_I0_0(this, fMessage, 15));
            } else {
                textView2.setOnClickListener(new ViewOnClickEBaseShape0S0200000_I0_0(this, fMessage, 16));
            }
        }
    }

    @Override // X.C2WA, X.AbstractC48182Ef
    public void A0I() {
        A02();
        super.A0I();
    }

    @Override // X.C2WA, X.AbstractC48182Ef
    public void A0X(AnonymousClass092 anonymousClass092, boolean z) {
        boolean z2 = anonymousClass092 != getFMessage();
        super.A0X(anonymousClass092, z);
        if (z || z2) {
            A02();
        }
    }

    @Override // X.C2WA, X.AbstractC48202Eh
    public int getCenteredLayoutId() {
        return R.layout.conversation_payment_invite_system_message;
    }

    @Override // X.C2WA, X.AbstractC48202Eh
    public int getIncomingLayoutId() {
        return R.layout.conversation_payment_invite_system_message;
    }

    @Override // X.AbstractC48202Eh
    public int getMainChildMaxWidth() {
        return (((int) getResources().getDimension(R.dimen.payment_bubble_margin_width)) << 1) + ((int) getResources().getDimension(R.dimen.payment_bubble_amount_width));
    }

    @Override // X.C2WA, X.AbstractC48202Eh
    public int getOutgoingLayoutId() {
        return R.layout.conversation_payment_invite_system_message;
    }
}
