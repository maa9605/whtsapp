package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.components.ConversationListRowHeaderView;
import com.whatsapp.jid.Jid;
import java.util.List;

/* renamed from: X.2jd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C54952jd {
    public ConversationListRowHeaderView A00;
    public C54962je A01;
    public final C018708s A02;

    public C54952jd(Context context, ConversationListRowHeaderView conversationListRowHeaderView, C018708s c018708s, C2AR c2ar) {
        this.A00 = conversationListRowHeaderView;
        this.A02 = c018708s;
        this.A01 = new C54962je(context, conversationListRowHeaderView.A00, c018708s, c2ar);
    }

    public void A00() {
        this.A00.A01.setVisibility(8);
        this.A01.A01.setText("");
        this.A01.A01.setPlaceholder(50);
    }

    public void A01(C06C c06c, List list, AbstractC54772jK abstractC54772jK) {
        String A08;
        this.A01.A01.setPlaceholder(0);
        if (c06c.A0D() && TextUtils.isEmpty(c06c.A0F)) {
            C018708s c018708s = this.A02;
            Jid A03 = c06c.A03(C0I1.class);
            if (A03 != null) {
                A08 = c018708s.A0A((AbstractC011205o) A03);
            } else {
                throw null;
            }
        } else {
            A08 = this.A02.A08(c06c, false);
        }
        this.A01.A05(A08, list, abstractC54772jK);
    }
}
