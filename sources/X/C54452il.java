package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape0S1100000_I0;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2il */
/* loaded from: classes2.dex */
public class C54452il extends C2J9 {
    public View A00;
    public C06C A01;
    public UserJid A02;
    public UserJid A03;
    public final ViewGroup A04;
    public final C05W A05;
    public final C018708s A06;
    public final C451820s A07;
    public final UserJid A08;
    public final C41521u3 A09;
    public final InterfaceC002901k A0A;
    public final boolean A0B;
    public final boolean A0C;

    public C54452il(Conversation conversation, InterfaceC002901k interfaceC002901k, C05W c05w, C018708s c018708s, C41521u3 c41521u3, C451820s c451820s, UserJid userJid, C06C c06c, ViewGroup viewGroup, boolean z, boolean z2) {
        super(conversation, 30);
        this.A0A = interfaceC002901k;
        this.A05 = c05w;
        this.A06 = c018708s;
        this.A09 = c41521u3;
        this.A07 = c451820s;
        this.A08 = userJid;
        this.A04 = viewGroup;
        this.A0B = z;
        this.A0C = z2;
        this.A01 = c06c;
    }

    public final void A05() {
        View view = this.A00;
        if (view != null) {
            TextView textView = (TextView) view.findViewById(R.id.change_number_text);
            boolean equals = this.A08.equals(this.A03);
            int i = R.string.change_number_notification_alert_new;
            if (equals) {
                i = R.string.change_number_notification_alert_old;
            }
            C05W c05w = this.A05;
            UserJid userJid = this.A03;
            if (userJid != null) {
                String A08 = this.A06.A08(c05w.A0A(userJid), false);
                textView.setText(super.A01.getString(i, A08));
                this.A00.setOnClickListener(new ViewOnClickEBaseShape0S1100000_I0(this, A08, 3));
                this.A00.findViewById(R.id.change_number_dismiss).setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 8));
                return;
            }
            throw null;
        }
        throw null;
    }

    public final void A06(C37Q c37q) {
        View view = this.A00;
        if (view != null) {
            view.setVisibility(8);
            this.A04.removeView(this.A00);
            this.A00 = null;
            c37q.A00.A01 = null;
            return;
        }
        throw null;
    }
}
