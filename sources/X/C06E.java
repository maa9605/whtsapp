package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.06E  reason: invalid class name */
/* loaded from: classes.dex */
public final class C06E {
    public static volatile C06E A01;
    public final C06F A00 = new C06F(SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);

    public static C06E A00() {
        if (A01 == null) {
            synchronized (C06E.class) {
                if (A01 == null) {
                    A01 = new C06E();
                }
            }
        }
        return A01;
    }

    public static final UserJid A01(String str, String str2) {
        int hashCode = str2.hashCode();
        if (hashCode != -2070199035) {
            if (hashCode == -1673355044 && str2.equals("s.whatsapp.net")) {
                int hashCode2 = str.hashCode();
                if (hashCode2 != -1821959325) {
                    if (hashCode2 == 48 && str.equals("0")) {
                        return C06D.A00;
                    }
                } else if (str.equals("Server")) {
                    return C08060aX.A00;
                }
                return new UserJid(str);
            }
        } else if (str2.equals("status_me")) {
            return C011405q.A00;
        }
        throw new C011305p(Jid.buildRawString(str, str2));
    }
}
