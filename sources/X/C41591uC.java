package X;

import android.util.Pair;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.RehydrateHsmJob;
import com.whatsapp.jobqueue.job.RehydrateTemplateJob;
import com.whatsapp.util.Log;

/* renamed from: X.1uC  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41591uC {
    public static volatile C41591uC A0B;
    public final C01B A00;
    public final C0E6 A01;
    public final AnonymousClass012 A02;
    public final C002301c A03;
    public final C0C9 A04;
    public final C2ES A05;
    public final C0EA A06;
    public final C0EN A07;
    public final C0EG A08;
    public final C41521u3 A09;
    public final C05U A0A;

    public C41591uC(AnonymousClass012 anonymousClass012, C0EG c0eg, C01B c01b, C0EA c0ea, C0EN c0en, C0E6 c0e6, C41521u3 c41521u3, C002301c c002301c, C05U c05u, C0C9 c0c9, C2ES c2es) {
        this.A02 = anonymousClass012;
        this.A08 = c0eg;
        this.A00 = c01b;
        this.A06 = c0ea;
        this.A07 = c0en;
        this.A01 = c0e6;
        this.A09 = c41521u3;
        this.A03 = c002301c;
        this.A0A = c05u;
        this.A04 = c0c9;
        this.A05 = c2es;
    }

    public static C41591uC A00() {
        if (A0B == null) {
            synchronized (C41591uC.class) {
                if (A0B == null) {
                    A0B = new C41591uC(AnonymousClass012.A00(), C0EG.A00(), C01B.A00(), C0EA.A00(), C0EN.A00(), C0E6.A00(), C41521u3.A00(), C002301c.A00(), C05U.A01(), C0C9.A00(), C2ES.A00());
                }
            }
        }
        return A0B;
    }

    public final Pair A01(C40531sQ c40531sQ, C05190Nr c05190Nr, C07910aI c07910aI, C75983fr c75983fr) {
        int A00 = c05190Nr.A00();
        if (A00 == 0) {
            c07910aI.A06 = 1;
            try {
                C0Ho.A0H(c40531sQ.A1A(), c05190Nr.A05(), false);
                long A05 = this.A02.A05();
                C0E6 c0e6 = this.A01;
                C05U c05u = this.A0A;
                C002301c c002301c = this.A03;
                String str = c05190Nr.A0d;
                AbstractC005302j A02 = c05190Nr.A02();
                if (A02 != null) {
                    c0e6.A00.A01(new RehydrateTemplateJob(c05u, c002301c, c40531sQ, str, A02, C003101m.A04(c05190Nr.A06), c05190Nr.A0Y, A05 + 86400000, c05190Nr.A0L, c05190Nr.A03, c05190Nr.A01));
                    return new Pair(Boolean.TRUE, Boolean.FALSE);
                }
                throw null;
            } catch (C22W unused) {
                this.A08.A0C(c05190Nr.A02(), c05190Nr.A0d, C003101m.A04(c05190Nr.A06), 1008, "content", null);
                return new Pair(Boolean.FALSE, Boolean.TRUE);
            }
        }
        StringBuilder A0P = C000200d.A0P("decryptioncallbackv2/invalid-edit-version edit=");
        A0P.append(A00);
        A0P.append(", type=hsm, id=");
        A0P.append(c05190Nr.A0d);
        Log.e(A0P.toString());
        c75983fr.A00.A00(19);
        Boolean bool = Boolean.TRUE;
        return new Pair(bool, bool);
    }

    public final AnonymousClass092 A02(C05U c05u, C05190Nr c05190Nr, C48612Fx c48612Fx, C07910aI c07910aI) {
        c07910aI.A06 = 1;
        C0Ho.A0H(c48612Fx, c05190Nr.A05(), true);
        String str = c05190Nr.A0d;
        AbstractC005302j A02 = c05190Nr.A02();
        if (A02 != null) {
            AnonymousClass092 A0B2 = C40841sx.A0B(c05u, c48612Fx, str, A02, c05190Nr.A0Y, UserJid.of(C003101m.A04(c05190Nr.A06)), c05190Nr.A0L, c05190Nr.A03, false, false, c05190Nr.A01);
            if (A0B2 == null) {
                this.A08.A0C(c05190Nr.A02(), str, C003101m.A04(c05190Nr.A06), null, null, null);
                return null;
            }
            return A0B2;
        }
        throw null;
    }

    public final boolean A03(C40531sQ c40531sQ, C05190Nr c05190Nr, C07910aI c07910aI, C75983fr c75983fr) {
        int A00 = c05190Nr.A00();
        if (A00 == 0) {
            c07910aI.A06 = 1;
            C0Ho.A0I(c40531sQ, c05190Nr.A05());
            long A05 = this.A02.A05();
            C0E6 c0e6 = this.A01;
            C002301c c002301c = this.A03;
            C05U c05u = this.A0A;
            String str = c05190Nr.A0d;
            AbstractC005302j A02 = c05190Nr.A02();
            if (A02 != null) {
                c0e6.A00.A01(new RehydrateHsmJob(c002301c, c05u, c40531sQ, str, A02, C003101m.A04(c05190Nr.A06), c05190Nr.A0Y, 86400000 + A05, c05190Nr.A0L, c05190Nr.A03, null, c05190Nr.A01));
                return false;
            }
            throw null;
        }
        StringBuilder A0P = C000200d.A0P("decryptioncallbackv2/invalid-edit-version edit=");
        A0P.append(A00);
        A0P.append(", type=hsm, id=");
        A0P.append(c05190Nr.A0d);
        Log.e(A0P.toString());
        c75983fr.A00.A00(19);
        return true;
    }
}
