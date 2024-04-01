package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1Lz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C27101Lz {
    public final long A00;
    public final UserJid A01;
    public final String A02;

    public C27101Lz(long j, UserJid userJid, String str) {
        this.A00 = j;
        this.A01 = userJid;
        this.A02 = str;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("id=");
        A0P.append(this.A00);
        A0P.append(" jid=");
        A0P.append(this.A01);
        A0P.append(" display=");
        A0P.append(this.A02);
        return A0P.toString();
    }
}
