package X;

import android.view.View;
import com.whatsapp.Conversation;
import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1iL  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C34941iL extends C0GA {
    public final /* synthetic */ Conversation A00;

    public C34941iL(Conversation conversation) {
        this.A00 = conversation;
    }

    @Override // X.C0GA
    public void A00() {
        Conversation.A0N(this.A00);
    }

    @Override // X.C0GA
    public void A01(final AbstractC005302j abstractC005302j) {
        Conversation conversation = this.A00;
        if (Conversation.A0T(conversation, abstractC005302j)) {
            conversation.A1n();
        }
        conversation.A0X.post(new Runnable() { // from class: X.1Fs
            @Override // java.lang.Runnable
            public final void run() {
                C34941iL.this.A08(abstractC005302j);
            }
        });
    }

    @Override // X.C0GA
    public void A03(UserJid userJid) {
        C018108l A0E;
        Conversation conversation = this.A00;
        if (Conversation.A0T(conversation, userJid)) {
            conversation.A1n();
        }
        C2JU c2ju = conversation.A1h;
        C05920Qu c05920Qu = c2ju.A00;
        if (!(c05920Qu instanceof C659139a) || userJid == null || !userJid.equals(((C659139a) c05920Qu).A00) || (A0E = c2ju.A09.A04.A0E(userJid)) == null) {
            return;
        }
        C05920Qu c05920Qu2 = c2ju.A00;
        c05920Qu2.A0D = A0E.A08;
        c2ju.A01.A0B(c05920Qu2);
    }

    @Override // X.C0GA
    public void A04(UserJid userJid) {
        Conversation conversation = this.A00;
        if (Conversation.A0T(conversation, userJid)) {
            conversation.A1n();
        }
    }

    @Override // X.C0GA
    public void A05(Collection collection) {
        Conversation conversation = this.A00;
        C59402sh c59402sh = conversation.A1f;
        if (c59402sh.A02 == null && c59402sh.A03 == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (Conversation.A0T(conversation, (AbstractC005302j) it.next())) {
                conversation.A1y();
            }
        }
    }

    public /* synthetic */ void A08(AbstractC005302j abstractC005302j) {
        int i = 0;
        while (true) {
            Conversation conversation = this.A00;
            if (i >= conversation.A0X.getChildCount()) {
                return;
            }
            View childAt = conversation.A0X.getChildAt(i);
            if (childAt instanceof AbstractC48182Ef) {
                ((AbstractC48182Ef) childAt).A0W(abstractC005302j);
            }
            i++;
        }
    }
}
