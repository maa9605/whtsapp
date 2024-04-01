package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.071 */
/* loaded from: classes.dex */
public class AnonymousClass071 {
    public static volatile AnonymousClass071 A05;
    public final C02L A00;
    public final C01B A01;
    public final AnonymousClass072 A02;
    public final C05M A03;
    public final C05O A04;

    public AnonymousClass071(C02L c02l, C05M c05m, C05O c05o, C01B c01b, AnonymousClass072 anonymousClass072) {
        this.A00 = c02l;
        this.A03 = c05m;
        this.A04 = c05o;
        this.A01 = c01b;
        this.A02 = anonymousClass072;
    }

    public static AnonymousClass071 A00() {
        if (A05 == null) {
            synchronized (AnonymousClass071.class) {
                if (A05 == null) {
                    A05 = new AnonymousClass071(C02L.A00(), C05M.A00(), C05O.A00(), C01B.A00(), AnonymousClass072.A00());
                }
            }
        }
        return A05;
    }

    public boolean A01(int i) {
        String A0A;
        ArrayList arrayList;
        if (i < 0) {
            return false;
        }
        if (i == 0) {
            return true;
        }
        C01B c01b = this.A01;
        if (c01b != null) {
            synchronized (C01C.class) {
                A0A = c01b.A0A(C01C.A4C);
            }
            try {
                arrayList = new ArrayList();
                String[] split = A0A.split(",");
                for (String str : split) {
                    arrayList.add(Integer.valueOf(str));
                }
            } catch (Exception unused) {
                arrayList = new ArrayList();
                for (String str2 : "604800".split(",")) {
                    arrayList.add(Integer.valueOf(str2));
                }
            }
            if (arrayList.contains(Integer.valueOf(i))) {
                return true;
            }
            if (this.A02 != null) {
                return false;
            }
            throw null;
        }
        throw null;
    }

    public boolean A02(AbstractC005302j abstractC005302j) {
        C0IT c0it;
        C05M c05m = this.A03;
        boolean z = false;
        if (!c05m.A0G(abstractC005302j) && (c0it = (C0IT) c05m.A0C().get(abstractC005302j)) != null && c0it.A0G != 1) {
            z = true;
        }
        return z || this.A04.A07(abstractC005302j) != 1;
    }

    public final boolean A03(AbstractC005302j abstractC005302j, long j, int i, long j2, C0CM c0cm) {
        if (this.A01.A0E(C01C.A0n) && C003101m.A0b(abstractC005302j)) {
            if (c0cm == null) {
                return true;
            }
            if (i != c0cm.expiration && j2 <= j) {
                long j3 = c0cm.ephemeralSettingTimestamp;
                if (j2 != j3) {
                    return j2 > j3;
                }
                UserJid of = UserJid.of(abstractC005302j);
                if (of != null) {
                    C02L c02l = this.A00;
                    c02l.A05();
                    UserJid userJid = c02l.A03;
                    return userJid != null && of.getRawString().compareTo(userJid.getRawString()) < 0;
                }
                throw null;
            }
            return false;
        }
        return false;
    }

    public boolean A04(AnonymousClass092 anonymousClass092) {
        C0IT A07 = this.A03.A07(anonymousClass092.A0n.A00);
        return A07 != null && anonymousClass092.A0p <= A07.A0H;
    }
}
