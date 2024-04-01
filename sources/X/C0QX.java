package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.0QX */
/* loaded from: classes.dex */
public final class C0QX {
    public final UserJid A00;

    public C0QX(UserJid userJid) {
        this.A00 = userJid;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("VNameCertificateEvent{jid='");
        A0P.append(this.A00);
        A0P.append('\'');
        A0P.append('}');
        return A0P.toString();
    }
}
