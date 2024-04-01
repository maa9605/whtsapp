package X;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.invites.InviteGroupParticipantsActivity;
import java.util.List;

/* renamed from: X.3DQ  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3DQ extends AbstractC04890Mh {
    public List A00;
    public final /* synthetic */ InviteGroupParticipantsActivity A01;

    public C3DQ(InviteGroupParticipantsActivity inviteGroupParticipantsActivity) {
        this.A01 = inviteGroupParticipantsActivity;
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        List list = this.A00;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        return new C3DP(this.A01.A00.inflate(R.layout.accept_invite_participant, viewGroup, false));
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        C3DP c3dp = (C3DP) c0ts;
        C06C c06c = (C06C) this.A00.get(i);
        InviteGroupParticipantsActivity inviteGroupParticipantsActivity = this.A01;
        TextView textView = c3dp.A01;
        if (inviteGroupParticipantsActivity != null) {
            if (!TextUtils.isEmpty(c06c.A0F)) {
                textView.setText(c06c.A0F);
                textView.setTextColor(C02160Ac.A00(inviteGroupParticipantsActivity, R.color.primary_text));
            } else if (c06c.A0E()) {
                textView.setText(C018708s.A02(c06c, false));
                textView.setSingleLine(false);
                textView.setTextColor(C02160Ac.A00(inviteGroupParticipantsActivity, R.color.primary_text));
            } else {
                String A0A = inviteGroupParticipantsActivity.A0B.A0A((AbstractC005302j) c06c.A03(AbstractC005302j.class));
                if (!TextUtils.isEmpty(A0A)) {
                    textView.setSingleLine(false);
                    textView.setTextColor(C02160Ac.A00(inviteGroupParticipantsActivity, R.color.primary_text));
                } else if (!TextUtils.isEmpty(c06c.A0O)) {
                    StringBuilder A0P = C000200d.A0P("~");
                    A0P.append(c06c.A0O);
                    A0A = A0P.toString();
                    textView.setSingleLine(false);
                    textView.setTextColor(C02160Ac.A00(inviteGroupParticipantsActivity, R.color.secondary_text));
                } else {
                    A0A = inviteGroupParticipantsActivity.A0A.A0F(C04630Le.A00(c06c));
                    textView.setSingleLine(true);
                    textView.setTextColor(C02160Ac.A00(inviteGroupParticipantsActivity, R.color.primary_text));
                }
                textView.setText(A0A);
            }
            C0Zn c0Zn = inviteGroupParticipantsActivity.A05;
            c0Zn.A04(c06c, c3dp.A00, false, new C52352aa(c0Zn.A04.A02, c06c));
            return;
        }
        throw null;
    }
}
