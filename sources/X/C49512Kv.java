package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2Kv  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C49512Kv {
    public C06C A00;
    public UserJid A01;
    public String A02;
    public final String A03;

    public C49512Kv(C06C c06c, C002301c c002301c) {
        this.A02 = C04630Le.A00(c06c);
        this.A03 = (String) C018708s.A01(c002301c, c06c);
        if (c06c.A0X) {
            this.A01 = (UserJid) c06c.A03(UserJid.class);
        }
        this.A00 = c06c;
    }

    public C49512Kv(String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
    }
}
