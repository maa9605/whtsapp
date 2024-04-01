package X;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.1uD  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41601uD {
    public static volatile C41601uD A0D;
    public boolean A00;
    public final C0E7 A02;
    public final AnonymousClass012 A03;
    public final C003701t A04;
    public final C41571uA A05;
    public final C42451vl A06;
    public final C47772Cn A07;
    public final InterfaceC002901k A08;
    public final C05480Ox A09;
    public final C0L6 A0A;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final ArrayList A0C = new ArrayList();
    public final Runnable A0B = new RunnableEBaseShape3S0100000_I0_3(this, 42);

    public C41601uD(AnonymousClass012 anonymousClass012, C003701t c003701t, InterfaceC002901k interfaceC002901k, C05480Ox c05480Ox, C0L6 c0l6, C41571uA c41571uA, C0E7 c0e7, C42451vl c42451vl, C47772Cn c47772Cn) {
        this.A03 = anonymousClass012;
        this.A04 = c003701t;
        this.A08 = interfaceC002901k;
        this.A09 = c05480Ox;
        this.A0A = c0l6;
        this.A05 = c41571uA;
        this.A02 = c0e7;
        this.A06 = c42451vl;
        this.A07 = c47772Cn;
    }

    public static C41601uD A00() {
        if (A0D == null) {
            synchronized (C41601uD.class) {
                if (A0D == null) {
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C003701t A002 = C003701t.A00();
                    InterfaceC002901k A003 = C002801j.A00();
                    C05480Ox c05480Ox = C05480Ox.A00;
                    C0L6 A004 = C0L6.A00();
                    C41571uA A005 = C41571uA.A00();
                    C0E7 A006 = C0E7.A00();
                    C42451vl A007 = C42451vl.A00();
                    if (C47772Cn.A03 == null) {
                        synchronized (C47772Cn.class) {
                            C47772Cn.A03 = new C47772Cn(C05M.A00(), C0CB.A00(), C000500h.A00());
                        }
                    }
                    A0D = new C41601uD(A00, A002, A003, c05480Ox, A004, A005, A006, A007, C47772Cn.A03);
                }
            }
        }
        return A0D;
    }

    public void A01() {
        Log.i("mediaautodownload/updatequeue");
        this.A08.AS1(new RunnableEBaseShape3S0100000_I0_3(this, 41));
    }

    public void A02(AnonymousClass097 anonymousClass097) {
        A04(anonymousClass097, false, this.A02.A03(true));
    }

    public void A03(AnonymousClass097 anonymousClass097, int i, InterfaceC04070Ih interfaceC04070Ih, boolean z) {
        long j;
        long j2;
        StringBuilder A0P = C000200d.A0P("mediaautodownload/queue ");
        A0P.append(anonymousClass097.A09);
        Log.i(A0P.toString());
        Log.i("mediaautodownload/getPriorityValue");
        long A05 = this.A03.A05();
        int A03 = this.A04.A03(60);
        AbstractC005302j abstractC005302j = anonymousClass097.A0n.A00;
        if (abstractC005302j != null && A03 != 0) {
            Log.i("mediaautodownload/getPriorityValue/getHeuristicDownloadPriority");
            C47772Cn c47772Cn = this.A07;
            if (c47772Cn != null) {
                if (C003101m.A0Z(abstractC005302j)) {
                    if (anonymousClass097.A0m == 1) {
                        A05 -= 345600000;
                    } else {
                        j = 518400000;
                        A05 -= j;
                    }
                } else {
                    if (anonymousClass097.A0g) {
                        byte b = anonymousClass097.A0m;
                        if (b == 42) {
                            j2 = 40000;
                        } else if (b == 20) {
                            j2 = 30000;
                        } else if (b == 1) {
                            j2 = 20000;
                        }
                        A05 += j2;
                    }
                    long j3 = c47772Cn.A00.A00.getLong("last_read_conversation_time", 0L);
                    long A06 = c47772Cn.A01.A06(abstractC005302j);
                    boolean z2 = 86400000 + A06 < j3;
                    boolean A0Q = c47772Cn.A02.A0Q(abstractC005302j);
                    byte b2 = anonymousClass097.A0m;
                    if (b2 != 20 && b2 != 42) {
                        A05 = b2 == 1 ? A05 - 172800000 : A05 - 345600000;
                    }
                    if (A0Q) {
                        if (z2) {
                            j = 259200000;
                            A05 -= j;
                        } else {
                            A05 -= 86400000;
                        }
                    } else if (z2) {
                        A05 -= 172800000;
                    }
                    A05 = (A05 - j3) + A06;
                }
            } else {
                throw null;
            }
        }
        if (C0L6.A02()) {
            Log.i("mediaautodownload/queue waiting to download because call is active");
            AnonymousClass226 anonymousClass226 = new AnonymousClass226(anonymousClass097, i, A05, interfaceC04070Ih, z);
            ArrayList arrayList = this.A0C;
            synchronized (arrayList) {
                arrayList.add(anonymousClass226);
            }
            return;
        }
        this.A06.A06(anonymousClass097, i, interfaceC04070Ih, A05, z, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x014d, code lost:
        if (r0.A08 != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0152, code lost:
        if (r13.A08 != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01c7, code lost:
        if (X.AnonymousClass024.A0l(r3, r9.A02()) == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01cd, code lost:
        if (r1.A08 == null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01e9, code lost:
        if (r1.A01((X.AbstractC005302j) r0) == 1) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01ef, code lost:
        if (r2.A08 != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
        if (r9 >= (r20.A00 == 0 ? 0 : (long) java.lang.Math.ceil((((float) r2) / ((float) r0)) * 5.0f))) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009a, code lost:
        if (r7.A05(r20) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a1, code lost:
        if (r7.A05(r20) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a9, code lost:
        if (X.C003101m.A0Z(r5.A00) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b3, code lost:
        if (X.C0HW.A03(X.C0DC.A02(r20)) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b5, code lost:
        A03(r20, r11, null, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ba, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00bb, code lost:
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0128, code lost:
        if ((r7.A04.A05() - r3.getLong("status_tab_last_opened_time", 0)) > 1209600000) goto L155;
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A04(X.AnonymousClass097 r20, boolean r21, int r22) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41601uD.A04(X.097, boolean, int):void");
    }
}
