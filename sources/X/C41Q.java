package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.Jid;

/* renamed from: X.41Q  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C41Q extends AbstractC86853yY {
    public C41Q(Context context, AnonymousClass012 anonymousClass012, C02L c02l, C40081rY c40081rY, C52782bL c52782bL, C05W c05w, C02E c02e, C018708s c018708s, C002301c c002301c, C2AR c2ar, C52682b9 c52682b9, C02O c02o) {
        super(context, anonymousClass012, c02l, c40081rY, c52782bL, c05w, c02e, c018708s, c002301c, c2ar, c52682b9, c02o);
    }

    @Override // X.AbstractC86853yY
    public CharSequence A02(AnonymousClass092 anonymousClass092, C06C c06c) {
        Drawable A04;
        CharSequence A0L;
        Jid A02;
        if ((c06c == null || (A02 = c06c.A02()) == null || this.A08.A0A(A02)) && !anonymousClass092.A0n.A02) {
            return "";
        }
        CharSequence A08 = C23X.A08(c06c, anonymousClass092.A0n.A02, this.A08, this.A0A, this.A0F);
        if (this instanceof C3MG) {
            A04 = C23X.A04((C09G) anonymousClass092, getContext());
        } else if (this instanceof C61962x6) {
            int i = R.drawable.ic_inline_live_location;
            if (anonymousClass092 instanceof C0LP) {
                i = R.drawable.msg_status_location;
            }
            A04 = C02180Ae.A0O(getContext(), i, R.color.msgStatusTint);
        } else if (this instanceof C61972x7) {
            A04 = ((C61972x7) this).getMessageIcon();
        } else if (!(this instanceof C61992xA)) {
            A04 = ((C69083Nb) this).getMessageIcon();
        } else {
            A04 = C02180Ae.A0O(getContext(), R.drawable.msg_status_contact, R.color.msgStatusTint);
        }
        if (this instanceof C3MG) {
            A0L = C40731sm.A0L((C09G) anonymousClass092, this.A0F);
        } else if (this instanceof C61962x6) {
            C52782bL c52782bL = this.A0C;
            A0L = c52782bL.A08;
            if (anonymousClass092 instanceof C0LP) {
                A0L = c52782bL.A09;
            }
        } else if (this instanceof C61972x7) {
            A0L = this.A0C.A02;
        } else if (!(this instanceof C61992xA)) {
            A0L = C40731sm.A0L((C09G) anonymousClass092, this.A0F);
        } else {
            A0L = this.A0C.A01;
        }
        return C23X.A0A(A08, C50262Ra.A01(A0L, A04, ((AbstractC86853yY) this).A01.getPaint()));
    }
}
