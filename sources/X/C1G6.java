package X;

import com.whatsapp.Conversation;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1G6  reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C1G6 implements Runnable {
    public final /* synthetic */ Conversation A00;
    public final /* synthetic */ UserJid A01;

    public /* synthetic */ C1G6(Conversation conversation, UserJid userJid) {
        this.A00 = conversation;
        this.A01 = userJid;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A2K(this.A01);
    }
}
