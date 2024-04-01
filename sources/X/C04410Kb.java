package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.0Kb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C04410Kb {
    public static final C04410Kb A04 = new C04410Kb(null, 0, null, null);
    public final long A00;
    public final UserJid A01;
    public final String A02;
    public final String A03;

    public C04410Kb(String str, long j, UserJid userJid, String str2) {
        this.A03 = str;
        this.A00 = j;
        this.A01 = userJid;
        this.A02 = str2;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("GroupDescription{id=");
        A0P.append(this.A03);
        A0P.append(", time=");
        A0P.append(this.A00);
        A0P.append(", setterJid='");
        A0P.append(this.A01);
        A0P.append('\'');
        A0P.append(", len(description)='");
        String str = this.A02;
        A0P.append(str == null ? "null" : Integer.valueOf(str.length()));
        A0P.append('\'');
        A0P.append('}');
        return A0P.toString();
    }
}
