package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.2Tz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C50952Tz {
    public final UserJid A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public C50952Tz(UserJid userJid, List list, String str, String str2) {
        this.A00 = userJid;
        this.A03 = list;
        this.A02 = str;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C50952Tz.class != obj.getClass()) {
            return false;
        }
        C50952Tz c50952Tz = (C50952Tz) obj;
        return this.A00.equals(c50952Tz.A00) && this.A03.equals(c50952Tz.A03);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A03});
    }
}
