package X;

import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.45Z  reason: invalid class name */
/* loaded from: classes3.dex */
public class C45Z {
    public static final C45Z A02 = new C45Z();
    public String A00;
    public Map A01;

    public synchronized Map A00(UserJid userJid) {
        Map map;
        map = this.A01;
        if (map == null || !userJid.getRawString().equals(this.A00)) {
            this.A00 = userJid.getRawString();
            map = new HashMap();
            this.A01 = map;
        }
        return map;
    }
}
