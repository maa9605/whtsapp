package X;

import android.database.Cursor;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0C8 */
/* loaded from: classes.dex */
public class C0C8 {
    public static volatile C0C8 A09;
    public final AbstractC000600i A00;
    public final C02L A01;
    public final C05W A02;
    public final C000500h A03;
    public final C0FF A04;
    public final C05E A05;
    public final C0FC A06;
    public final C0FE A07;
    public final C0F3 A08;

    public C0C8(AbstractC000600i abstractC000600i, C02L c02l, C05W c05w, C05E c05e, C000500h c000500h, C0F3 c0f3, C0FC c0fc, C0FE c0fe, C0FF c0ff) {
        this.A00 = abstractC000600i;
        this.A01 = c02l;
        this.A02 = c05w;
        this.A05 = c05e;
        this.A03 = c000500h;
        this.A08 = c0f3;
        this.A06 = c0fc;
        this.A07 = c0fe;
        this.A04 = c0ff;
    }

    public static C0C8 A00() {
        if (A09 == null) {
            synchronized (C0C8.class) {
                if (A09 == null) {
                    A09 = new C0C8(AbstractC000600i.A00(), C02L.A00(), C05W.A00(), C05E.A00(), C000500h.A00(), C0F3.A00(), C0FC.A00(), C0FE.A00(), C0FF.A00());
                }
            }
        }
        return A09;
    }

    public C02630Ce A01(AbstractC011205o abstractC011205o) {
        C0F3 c0f3 = this.A08;
        if (c0f3.A0D()) {
            return c0f3.A06.A00(abstractC011205o, c0f3.A05);
        }
        C0FE c0fe = this.A07;
        return c0fe.A07.A00(abstractC011205o, c0fe.A06);
    }

    public String A02(AbstractC011205o abstractC011205o) {
        C0F3 c0f3 = this.A08;
        if (c0f3.A0D()) {
            return C02630Ce.A00(c0f3.A03(abstractC011205o));
        }
        return C02630Ce.A00(this.A07.A01(abstractC011205o));
    }

    public Set A03(UserJid userJid) {
        C0F3 c0f3 = this.A08;
        if (c0f3.A0D()) {
            return c0f3.A04(userJid);
        }
        C0FE c0fe = this.A07;
        if (c0fe != null) {
            HashSet hashSet = new HashSet();
            try {
                Cursor A07 = c0fe.A08.A03().A02.A07("SELECT gjid FROM group_participants WHERE jid = ?", new String[]{c0fe.A01.A0A(userJid) ? "" : userJid.getRawString()});
                while (A07.moveToNext()) {
                    AbstractC011205o A05 = AbstractC011205o.A05(A07.getString(0));
                    if (A05 != null) {
                        hashSet.add(A05);
                    }
                }
                A07.close();
                return hashSet;
            } finally {
            }
        } else {
            throw null;
        }
    }

    public void A04(C02630Ce c02630Ce) {
        C0CD A04 = this.A05.A04();
        try {
            C03790Hb A00 = A04.A00();
            C0F3 c0f3 = this.A08;
            if (c0f3.A0E()) {
                c0f3.A06(c02630Ce);
            } else if (c0f3 == null) {
                throw null;
            }
            this.A07.A03(c02630Ce);
            A00.A00();
            A00.close();
            A04.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A04.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public boolean A05(GroupJid groupJid) {
        return A01(groupJid).A0B(this.A01);
    }

    public boolean A06(GroupJid groupJid) {
        C0D7 c0d7;
        C02630Ce A01 = A01(groupJid);
        C02L c02l = this.A01;
        if (A01 != null) {
            c02l.A05();
            UserJid userJid = c02l.A03;
            return (userJid == null || (c0d7 = (C0D7) A01.A01.get(userJid)) == null || c0d7.A01 == 0) ? false : true;
        }
        throw null;
    }

    public boolean A07(C011005l c011005l, UserJid userJid) {
        C0D7 c0d7 = (C0D7) A01(c011005l).A01.get(userJid);
        return (c0d7 == null || c0d7.A01 == 0) ? false : true;
    }

    public boolean A08(C011005l c011005l, UserJid userJid) {
        C0D7 c0d7 = (C0D7) A01(c011005l).A01.get(userJid);
        return c0d7 != null && c0d7.A01 == 2;
    }
}
