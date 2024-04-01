package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.text.Collator;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2pt  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C57722pt implements Comparator {
    public final C018708s A00;
    public final Collator A01;
    public final Map A02 = new HashMap();

    public C57722pt(C018708s c018708s, C002301c c002301c) {
        this.A00 = c018708s;
        Collator collator = Collator.getInstance(c002301c.A0I());
        this.A01 = collator;
        collator.setDecomposition(1);
    }

    @Override // java.util.Comparator
    /* renamed from: A00 */
    public int compare(C06C c06c, C06C c06c2) {
        String A01 = A01(c06c);
        String A012 = A01(c06c2);
        if (A01 == null && A012 == null) {
            return 0;
        }
        if (A01 == null) {
            return 1;
        }
        if (A012 == null) {
            return -1;
        }
        int compare = this.A01.compare(A01, A012);
        if (compare != 0) {
            return compare;
        }
        Jid A02 = c06c.A02();
        if (A02 == null && c06c2.A02() == null) {
            return 0;
        }
        if (A02 == null) {
            return 1;
        }
        Jid A022 = c06c2.A02();
        if (A022 == null) {
            return -1;
        }
        return A02.getRawString().compareTo(A022.getRawString());
    }

    public final String A01(C06C c06c) {
        if (c06c == null) {
            return null;
        }
        String str = c06c.A0K;
        if (str != null && str.length() > 0) {
            return str;
        }
        if (c06c.A02() == null) {
            return null;
        }
        Map map = this.A02;
        String str2 = (String) map.get(c06c.A03(UserJid.class));
        if (str2 == null) {
            String A08 = this.A00.A08(c06c, false);
            map.put(c06c.A03(UserJid.class), A08);
            return A08;
        }
        return str2;
    }
}
