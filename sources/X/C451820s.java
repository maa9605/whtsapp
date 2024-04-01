package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.20s  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C451820s {
    public static volatile C451820s A05;
    public final C06T A00;
    public final C05Q A01;
    public final C05A A02;
    public final C05M A03;
    public final C05N A04;

    public C451820s(C05A c05a, C05M c05m, C06T c06t, C05Q c05q, C05N c05n) {
        this.A02 = c05a;
        this.A03 = c05m;
        this.A00 = c06t;
        this.A01 = c05q;
        this.A04 = c05n;
    }

    public static C451820s A00() {
        if (A05 == null) {
            synchronized (C451820s.class) {
                if (A05 == null) {
                    A05 = new C451820s(C05A.A00(), C05M.A00(), C06T.A02, C05Q.A00(), C05N.A00());
                }
            }
        }
        return A05;
    }

    public C04370Jx A01(UserJid userJid) {
        C0IT A07 = this.A03.A07(userJid);
        if (A07 != null) {
            long j = A07.A09;
            if (j != -1) {
                AnonymousClass092 A01 = this.A01.A01(j);
                if ((A01 instanceof C04300Jq) && ((C04300Jq) A01).A00 == 28) {
                    return (C04370Jx) A01;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public void A02(UserJid userJid) {
        C0IT A07 = this.A03.A07(userJid);
        if (A07 != null) {
            A07.A09 = -1L;
            this.A00.A01(new RunnableEBaseShape1S0200000_I0_1(this, A07, 32), 19);
        }
    }

    public boolean A03(UserJid userJid) {
        C0IT A07 = this.A03.A07(userJid);
        return (A07 == null || A07.A09 == -1) ? false : true;
    }
}
