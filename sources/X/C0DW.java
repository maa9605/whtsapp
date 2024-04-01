package X;

import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.0DW */
/* loaded from: classes.dex */
public class C0DW {
    public static volatile C0DW A05;
    public final C01B A00;
    public final AnonymousClass012 A01;
    public final C0EU A02;
    public final C0GR A03;
    public final C0GS A04;

    public C0DW(AnonymousClass012 anonymousClass012, C01B c01b, C0EU c0eu, C0GR c0gr, C0GS c0gs) {
        this.A01 = anonymousClass012;
        this.A00 = c01b;
        this.A02 = c0eu;
        this.A03 = c0gr;
        this.A04 = c0gs;
    }

    public static C0DW A00() {
        if (A05 == null) {
            synchronized (C0DW.class) {
                if (A05 == null) {
                    A05 = new C0DW(AnonymousClass012.A00(), C01B.A00(), C0EU.A00(), C0GR.A00(), C0GS.A00);
                }
            }
        }
        return A05;
    }

    public void A01() {
        if (this.A00 == null) {
            throw null;
        }
    }

    public boolean A02() {
        if (this.A03.A04()) {
            if (!this.A00.A0E(C01C.A1l)) {
                if (this.A04 != null) {
                    if (this.A01.A05() >= this.A02.A04().getLong("payments_enabled_till", -1L)) {
                        return false;
                    }
                } else {
                    throw null;
                }
            }
            return true;
        }
        return false;
    }

    public boolean A03() {
        return A02() && C03650Gn.A0D == this.A03.A02() && A05();
    }

    public boolean A04() {
        if (A02()) {
            return true;
        }
        A01();
        return false;
    }

    public boolean A05() {
        return this.A03.A04() && this.A00.A0E(C01C.A1k);
    }

    public boolean A06(UserJid userJid) {
        if (this.A04 != null) {
            Set set = (Set) C28011Pr.A00.get(C03650Gn.A01(C002701i.A0s(C04630Le.A02(userJid))));
            return set != null && set.contains(this.A03.A02());
        }
        throw null;
    }
}
