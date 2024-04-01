package X;

import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2En  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C48252En {
    public UserJid A00;
    public final long A02;
    public final long A03;
    public final AnonymousClass012 A04;
    public final C0ED A05;
    public final List A06;
    public final List A07;
    public final List A08;
    public final Map A09;
    public final long A01 = 60000;
    public final Map A0A = new HashMap();

    public C48252En(AnonymousClass012 anonymousClass012, C0ED c0ed, long j, long j2, List list, List list2, List list3, Map map) {
        this.A04 = anonymousClass012;
        this.A05 = c0ed;
        this.A03 = j2;
        this.A02 = j;
        this.A08 = list;
        this.A07 = list2;
        this.A06 = list3;
        this.A09 = map;
    }

    public static int A00(UserJid userJid, List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (userJid.equals(((C0Hr) it.next()).A0A)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean A01(AnonymousClass092 anonymousClass092) {
        long A05 = this.A04.A05();
        Map map = this.A09;
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        Number number = (Number) map.get(anonymousClass094);
        if (number == null || A05 - number.longValue() > this.A01) {
            map.put(anonymousClass094, Long.valueOf(A05));
            return true;
        }
        return false;
    }
}
