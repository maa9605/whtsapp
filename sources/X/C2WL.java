package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.ephemeral.ChangeEphemeralSettingActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2WL  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2WL extends C2WM {
    public C0LM A00;
    public C05M A01;
    public final TextView A02;

    public C2WL(Context context, C0KU c0ku) {
        super(context, c0ku);
        setClickable(false);
        setLongClickable(false);
        TextView textView = (TextView) findViewById(R.id.info);
        this.A02 = textView;
        textView.setBackgroundResource(R.drawable.date_balloon);
        this.A02.setCompoundDrawablePadding(context.getResources().getDimensionPixelSize(R.dimen.conversation_row_padding));
        this.A02.setTextSize(AbstractC48182Ef.A03(getResources()));
        A0k();
    }

    @Override // X.AbstractC48182Ef
    public void A0X(AnonymousClass092 anonymousClass092, boolean z) {
        boolean z2 = anonymousClass092 != super.getFMessage();
        super.A0X(anonymousClass092, z);
        if (z || z2) {
            A0k();
        }
    }

    public void A0j() {
        ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) C02180Ae.A0G(getContext(), ActivityC02290Ap.class);
        if (activityC02290Ap != null) {
            UserJid of = UserJid.of(super.getFMessage().A0n.A00);
            if (of != null) {
                ChangeEphemeralSettingActivity.A00(((AbstractC48182Ef) this).A0Q, activityC02290Ap, of, this.A01.A03(of));
                return;
            }
            throw null;
        }
    }

    public final void A0k() {
        AbstractC005302j abstractC005302j;
        C0KU c0ku = (C0KU) super.getFMessage();
        C0LM c0lm = this.A00;
        AnonymousClass094 anonymousClass094 = c0ku.A0n;
        if (anonymousClass094.A02) {
            C02L c02l = ((AbstractC48182Ef) this).A0I;
            c02l.A05();
            abstractC005302j = c02l.A03;
        } else {
            abstractC005302j = anonymousClass094.A00;
        }
        String A02 = c0lm.A02(abstractC005302j, true, c0ku.A00);
        Drawable A03 = C02160Ac.A03(getContext(), R.drawable.ic_ephemeral);
        if (A03 != null) {
            Drawable A0Q = C02180Ae.A0Q(A03, C02160Ac.A00(getContext(), R.color.conversationRowEphemeralIconTint));
            TextView textView = this.A02;
            textView.setText(C50262Ra.A01(A02, A0Q, textView.getPaint()));
            if (((AbstractC48182Ef) this).A0K.A0C()) {
                textView.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 15));
                return;
            }
            textView.setOnClickListener(null);
            textView.setClickable(false);
            return;
        }
        throw null;
    }

    @Override // X.AbstractC48202Eh
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_divider;
    }

    @Override // X.AbstractC48202Eh
    public /* bridge */ /* synthetic */ AnonymousClass092 getFMessage() {
        return super.getFMessage();
    }

    @Override // X.AbstractC48202Eh
    public C0KU getFMessage() {
        return (C0KU) super.getFMessage();
    }

    @Override // X.AbstractC48202Eh
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_divider;
    }

    @Override // X.AbstractC48202Eh
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_divider;
    }

    @Override // X.AbstractC48202Eh
    public void setFMessage(AnonymousClass092 anonymousClass092) {
        C000700j.A07(anonymousClass092 instanceof C0KU);
        super.setFMessage(anonymousClass092);
    }
}
