package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2sN  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C59202sN {
    public final C42811wM A00;
    public final UserJid A01;

    public C59202sN(UserJid userJid, C42811wM c42811wM) {
        this.A01 = userJid;
        this.A00 = c42811wM;
    }

    public int A00() {
        if (!(this instanceof C39D)) {
            return this.A00.A00();
        }
        return ((C39D) this).A01;
    }

    public long A01(int i) {
        if (this instanceof C39D) {
            return 0L;
        }
        return this.A00.A01(i);
    }
}
