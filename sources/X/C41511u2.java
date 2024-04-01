package X;

import android.os.Message;
import java.util.Collections;

/* renamed from: X.1u2 */
/* loaded from: classes2.dex */
public class C41511u2 {
    public static volatile C41511u2 A0K;
    public final AbstractC000600i A00;
    public final C03940Hu A01;
    public final C02L A02;
    public final C0E3 A03;
    public final C01B A04;
    public final C0E6 A05;
    public final C010005b A06;
    public final AnonymousClass012 A07;
    public final C01R A08;
    public final AnonymousClass070 A09;
    public final C26T A0A;
    public final C0E9 A0B;
    public final C003701t A0C;
    public final C009905a A0D;
    public final C05Y A0E;
    public final C40291rx A0F;
    public final C0EE A0G;
    public final AnonymousClass247 A0H;
    public final C26S A0I;
    public final ExecutorC004702d A0J;

    public C41511u2(AnonymousClass012 anonymousClass012, C003701t c003701t, AbstractC000600i abstractC000600i, C02L c02l, InterfaceC002901k interfaceC002901k, C01B c01b, C0E6 c0e6, C05Y c05y, C0E3 c0e3, C40291rx c40291rx, C01R c01r, C009905a c009905a, C010005b c010005b, C03940Hu c03940Hu, AnonymousClass247 anonymousClass247, C0EE c0ee, C0E9 c0e9, AnonymousClass070 anonymousClass070, C26S c26s, C26T c26t) {
        this.A07 = anonymousClass012;
        this.A0C = c003701t;
        this.A00 = abstractC000600i;
        this.A02 = c02l;
        this.A04 = c01b;
        this.A05 = c0e6;
        this.A0E = c05y;
        this.A03 = c0e3;
        this.A0F = c40291rx;
        this.A08 = c01r;
        this.A0D = c009905a;
        this.A06 = c010005b;
        this.A01 = c03940Hu;
        this.A0H = anonymousClass247;
        this.A0G = c0ee;
        this.A0B = c0e9;
        this.A09 = anonymousClass070;
        this.A0I = c26s;
        this.A0A = c26t;
        this.A0J = new ExecutorC004702d(interfaceC002901k, true);
    }

    public static C41511u2 A00() {
        if (A0K == null) {
            synchronized (C41511u2.class) {
                if (A0K == null) {
                    A0K = new C41511u2(AnonymousClass012.A00(), C003701t.A00(), AbstractC000600i.A00(), C02L.A00(), C002801j.A00(), C01B.A00(), C0E6.A00(), C05Y.A01(), C0E3.A06(), C40291rx.A00(), C01R.A02, C009905a.A02, C010005b.A07, C03940Hu.A00(), AnonymousClass247.A00(), C0EE.A00(), C0E9.A00(), AnonymousClass070.A01(), C26S.A00(), C26T.A00());
                }
            }
        }
        return A0K;
    }

    public void A01(AnonymousClass092 anonymousClass092) {
        A04(anonymousClass092, false, false, null);
    }

    public void A02(AnonymousClass092 anonymousClass092) {
        A04(anonymousClass092, true, true, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0069, code lost:
        if (r2.contains(X.C009905a.A00(r0, r45)) == false) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A03(X.AnonymousClass092 r44, com.whatsapp.jid.DeviceJid r45, com.whatsapp.jid.UserJid r46, java.util.Set r47, boolean r48, boolean r49, long r50, long r52, java.lang.Runnable r54, X.C0Ml r55) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41511u2.A03(X.092, com.whatsapp.jid.DeviceJid, com.whatsapp.jid.UserJid, java.util.Set, boolean, boolean, long, long, java.lang.Runnable, X.0Ml):void");
    }

    public void A04(AnonymousClass092 anonymousClass092, boolean z, boolean z2, Runnable runnable) {
        A03(anonymousClass092, null, null, Collections.emptySet(), z, z2, 0L, 0L, runnable, null);
    }

    public void A05(boolean z) {
        this.A0F.A1Z = z;
        this.A0E.A0A(Message.obtain(null, 0, 37, 0, Boolean.valueOf(z)), null, false);
    }
}
