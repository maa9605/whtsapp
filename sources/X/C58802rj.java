package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2rj  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C58802rj {
    public final int A00;
    public final UserJid A01;
    public final String A02;

    public C58802rj(String str, int i) {
        this.A02 = str;
        this.A01 = null;
        this.A00 = i;
    }

    public C58802rj(String str, UserJid userJid) {
        this.A02 = str;
        this.A01 = userJid;
        this.A00 = 0;
    }

    public String toString() {
        return this.A02;
    }
}
