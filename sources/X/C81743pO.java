package X;

import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.SetStatus;
import java.util.Iterator;

/* renamed from: X.3pO  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C81743pO extends C0GA {
    public final /* synthetic */ SetStatus A00;

    public C81743pO(SetStatus setStatus) {
        this.A00 = setStatus;
    }

    @Override // X.C0GA
    public void A04(UserJid userJid) {
        if (userJid != null) {
            SetStatus setStatus = this.A00;
            C02L c02l = setStatus.A01;
            c02l.A05();
            if (userJid.equals(c02l.A03)) {
                String A01 = setStatus.A02.A01();
                if (setStatus.A06) {
                    setStatus.A06 = false;
                    Iterator it = SetStatus.A09.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals(A01)) {
                                break;
                            }
                        } else {
                            SetStatus.A09.add(0, A01);
                            break;
                        }
                    }
                    setStatus.A1Q();
                }
                TextEmojiLabel textEmojiLabel = setStatus.A03;
                textEmojiLabel.setText(C002701i.A0d(A01, textEmojiLabel.getContext(), setStatus.A03.getPaint(), ((ActivityC02290Ap) setStatus).A0H));
                setStatus.A05.notifyDataSetInvalidated();
                setStatus.A00.setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1(this, 16));
            }
        }
    }
}
