package X;

import com.whatsapp.data.ProfilePhotoChange;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.07A */
/* loaded from: classes.dex */
public class C07A {
    public static volatile C07A A06;
    public final AbstractC000600i A00;
    public final C02L A01;
    public final C01B A02;
    public final C05W A03;
    public final AnonymousClass075 A04;
    public final C05V A05;

    public C07A(AbstractC000600i abstractC000600i, C02L c02l, C01B c01b, C05W c05w, C05V c05v, AnonymousClass075 anonymousClass075) {
        this.A00 = abstractC000600i;
        this.A01 = c02l;
        this.A02 = c01b;
        this.A03 = c05w;
        this.A05 = c05v;
        this.A04 = anonymousClass075;
    }

    public static C04300Jq A00(AnonymousClass094 anonymousClass094, long j, int i, AbstractC000600i abstractC000600i) {
        if (i == 6) {
            return new C04390Jz(anonymousClass094, j);
        }
        if (i != 28 && i != 10) {
            if (C002701i.A1O(i)) {
                if (i == 37) {
                    return new C04610Lc(anonymousClass094, j);
                }
                if (i == 39) {
                    return new C04600Lb(anonymousClass094, j);
                }
                if (i == 64) {
                    return new AbstractC05550Pe(anonymousClass094, j) { // from class: X.0zm
                    };
                }
                if (i == 65) {
                    return new AbstractC05550Pe(anonymousClass094, j) { // from class: X.0zo
                    };
                }
                return new C04590La(anonymousClass094, j, i);
            } else if (C002701i.A1M(i)) {
                if (i == 1) {
                    return new C04450Kf(anonymousClass094, j);
                }
                if (i == 56) {
                    return new C04350Jv(anonymousClass094, j);
                }
                return new C04360Jw(anonymousClass094, j, i);
            } else if (C002701i.A1N(i)) {
                return new C0LZ(anonymousClass094, j, i);
            } else {
                if (i == 57) {
                    return new C04340Ju(anonymousClass094, j);
                }
                if (i == 58) {
                    return new C0LW(anonymousClass094, j);
                }
                if (i == 59) {
                    return new C04330Jt(anonymousClass094, j);
                }
                if (i == 60) {
                    return new C0LY(anonymousClass094, j);
                }
                if (i == 19) {
                    return new C04380Jy(anonymousClass094, j);
                }
                if (i == 61) {
                    return new C04320Js(anonymousClass094, j);
                }
                return new C04300Jq(anonymousClass094, j, i);
            }
        }
        return new C04370Jx(anonymousClass094, j, i, abstractC000600i);
    }

    public static C07A A01() {
        if (A06 == null) {
            synchronized (C05V.class) {
                if (A06 == null) {
                    A06 = new C07A(AbstractC000600i.A00(), C02L.A00(), C01B.A00(), C05W.A00(), C05V.A01(), AnonymousClass075.A00());
                }
            }
        }
        return A06;
    }

    public C04300Jq A02(AbstractC005302j abstractC005302j, long j, UserJid userJid, int i, int i2) {
        C05V c05v = this.A05;
        C04340Ju c04340Ju = (C04340Ju) A00(C05V.A00(c05v.A01, c05v.A00, abstractC005302j, true), j, 57, this.A00);
        c04340Ju.A0d(userJid);
        c04340Ju.A00 = i;
        c04340Ju.A01 = i2;
        return c04340Ju;
    }

    public C04300Jq A03(AbstractC005302j abstractC005302j, String str, long j, UserJid userJid, int i, ProfilePhotoChange profilePhotoChange) {
        AnonymousClass094 anonymousClass094;
        if (str == null) {
            C05V c05v = this.A05;
            anonymousClass094 = C05V.A00(c05v.A01, c05v.A00, abstractC005302j, true);
        } else {
            anonymousClass094 = new AnonymousClass094(abstractC005302j, true, str);
        }
        C04390Jz c04390Jz = new C04390Jz(anonymousClass094, j);
        c04390Jz.A0l(i == -1 ? null : Integer.toString(i));
        c04390Jz.A0d(userJid);
        c04390Jz.A00 = profilePhotoChange;
        return c04390Jz;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0006, code lost:
        if (r8 == 3) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C04300Jq A04(com.whatsapp.jid.GroupJid r5, long r6, int r8, java.lang.String r9, java.util.List r10) {
        /*
            r4 = this;
            r3 = 1
            r0 = 2
            if (r8 == r0) goto L8
            r0 = 3
            r2 = 0
            if (r8 != r0) goto L9
        L8:
            r2 = 1
        L9:
            java.lang.String r1 = "This method not suppose to be used for action = "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            X.C000700j.A08(r2, r0)
            X.05V r0 = r4.A05
            X.012 r1 = r0.A01
            X.02L r0 = r0.A00
            X.094 r1 = X.C05V.A00(r1, r0, r5, r3)
            X.00i r0 = r4.A00
            X.0Jq r0 = A00(r1, r6, r8, r0)
            r0.A0l(r9)
            if (r10 == 0) goto L32
            r0.A0u(r10)
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07A.A04(com.whatsapp.jid.GroupJid, long, int, java.lang.String, java.util.List):X.0Jq");
    }

    public C04300Jq A05(C04420Kc c04420Kc, C011005l c011005l, UserJid userJid, int i, long j) {
        C04350Jv c04350Jv = (C04350Jv) A07(c04420Kc, c011005l, j, 56, null);
        c04350Jv.A0d(userJid);
        c04350Jv.A00 = i;
        return c04350Jv;
    }

    public C04300Jq A06(C04420Kc c04420Kc, C011005l c011005l, C04410Kb c04410Kb) {
        C04360Jw A07 = A07(c04420Kc, c011005l, c04410Kb.A00 * 1000, 27, null);
        A07.A0l(c04410Kb.A02);
        A07.A0d(c04410Kb.A01);
        return A07;
    }

    public C04360Jw A07(C04420Kc c04420Kc, AbstractC011205o abstractC011205o, long j, int i, C02630Ce c02630Ce) {
        C04360Jw c04360Jw;
        boolean A1M = C002701i.A1M(i);
        StringBuilder sb = new StringBuilder("Not supposed to be used for action = ");
        sb.append(i);
        C000700j.A08(A1M, sb.toString());
        if (c04420Kc != null) {
            if (i == 1) {
                c04360Jw = new C04450Kf(c04420Kc, c02630Ce, j);
            } else if (i != 56) {
                c04360Jw = new C04360Jw(c04420Kc, c02630Ce, j, i);
            } else {
                c04360Jw = new C04350Jv(c04420Kc, c02630Ce, j);
            }
            c04360Jw.A0s = c04420Kc.A00;
            return c04360Jw;
        }
        C000700j.A07(abstractC011205o != null);
        C05V c05v = this.A05;
        return (C04360Jw) A00(C05V.A00(c05v.A01, c05v.A00, abstractC011205o, true), j, i, this.A00);
    }

    public C04360Jw A08(C04420Kc c04420Kc, AbstractC011205o abstractC011205o, long j, int i, UserJid userJid, long j2) {
        StringBuilder sb = new StringBuilder("SystemMessageFactory/newParticipantStatusMessage; stanzaKey=");
        sb.append(c04420Kc);
        sb.append("; gjid=");
        sb.append(abstractC011205o);
        sb.append("; action=");
        C000200d.A1F(sb, i);
        C04360Jw A07 = A07(c04420Kc, abstractC011205o, j, i, null);
        A07.A0d(userJid);
        A07.A03 = j2;
        if (i == 4 && this.A01.A0A(userJid)) {
            A07.A00 = 1;
        }
        return A07;
    }

    public C04360Jw A09(C04420Kc c04420Kc, AbstractC011205o abstractC011205o, long j, int i, UserJid userJid, List list, C02630Ce c02630Ce, long j2) {
        StringBuilder sb = new StringBuilder("SystemMessageFactory/newParticipantsStatusMessage; stanzaKey=");
        sb.append(c04420Kc);
        sb.append("; gjid=");
        sb.append(abstractC011205o);
        sb.append("; action=");
        sb.append(i);
        sb.append("; author=");
        sb.append(userJid);
        Log.i(sb.toString());
        C04360Jw A07 = A07(c04420Kc, abstractC011205o, j, i, c02630Ce);
        A07.A0d(userJid);
        A07.A0u(list);
        A07.A03 = j2;
        if (i == 12 || i == 20) {
            C02L c02l = this.A01;
            c02l.A05();
            if (list.contains(c02l.A03)) {
                A07.A00 = 1;
            }
        }
        return A07;
    }

    public C0LZ A0A(AbstractC005302j abstractC005302j, long j, int i, String str) {
        boolean A1N = C002701i.A1N(i);
        StringBuilder sb = new StringBuilder("Not supposed to be used for action = ");
        sb.append(i);
        C000700j.A08(A1N, sb.toString());
        C05V c05v = this.A05;
        C0LZ c0lz = (C0LZ) A00(C05V.A00(c05v.A01, c05v.A00, abstractC005302j, true), j, i, this.A00);
        c0lz.A00 = str;
        return c0lz;
    }

    public C04370Jx A0B(AbstractC005302j abstractC005302j, long j, UserJid userJid, UserJid userJid2) {
        C05V c05v = this.A05;
        C04370Jx c04370Jx = (C04370Jx) A00(C05V.A00(c05v.A01, c05v.A00, abstractC005302j, true), j, 28, this.A00);
        c04370Jx.A01 = userJid;
        c04370Jx.A00 = userJid2;
        return c04370Jx;
    }

    public C04590La A0C(AbstractC005302j abstractC005302j, long j, int i) {
        C05V c05v = this.A05;
        return (C04590La) A00(C05V.A00(c05v.A01, c05v.A00, abstractC005302j, true), j, i, this.A00);
    }
}
