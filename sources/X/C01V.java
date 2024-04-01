package X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.facebook.profilo.logger.Logger;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.01V */
/* loaded from: classes.dex */
public class C01V {
    public static volatile C01V A0W;
    public AnonymousClass015 A02;
    public C001800u A03;
    public Long A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public final C01B A0F;
    public final AnonymousClass012 A0G;
    public final C001200o A0H;
    public final AnonymousClass011 A0I;
    public final AnonymousClass006 A0J;
    public final AnonymousClass057 A0K;
    public final AnonymousClass056 A0L;
    public final AnonymousClass055 A0M;
    public final C008103m A0T;
    public final InterfaceC004201y A0U;
    public final InterfaceC002901k A0V;
    public final int A08 = 200;
    public final int A0D = 2000;
    public final int A09 = 2000;
    public final AnonymousClass015 A0N = new AnonymousClass015(1, 200, SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, false);
    public final AnonymousClass015 A0S = new AnonymousClass015(10, 2000, SearchActionVerificationClientService.NOTIFICATION_ID, false);
    public final AnonymousClass015 A0O = new AnonymousClass015(10, 2000, SearchActionVerificationClientService.NOTIFICATION_ID, false);
    public final int A0A = SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
    public final int A0C = SearchActionVerificationClientService.NOTIFICATION_ID;
    public final int A0B = SearchActionVerificationClientService.NOTIFICATION_ID;
    public final AnonymousClass015 A0P = new AnonymousClass015(10, SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, 25000, false);
    public final AnonymousClass015 A0R = new AnonymousClass015(100, SearchActionVerificationClientService.NOTIFICATION_ID, 250000, false);
    public final AnonymousClass015 A0Q = new AnonymousClass015(100, SearchActionVerificationClientService.NOTIFICATION_ID, 250000, false);
    public final Handler A0E = new Handler(Looper.getMainLooper());
    public int A00 = -1;
    public int A01 = 1;

    public C01V(AnonymousClass012 anonymousClass012, C001200o c001200o, InterfaceC002901k interfaceC002901k, AnonymousClass055 anonymousClass055, AnonymousClass011 anonymousClass011, C01B c01b, AnonymousClass006 anonymousClass006, AnonymousClass056 anonymousClass056, AnonymousClass057 anonymousClass057, InterfaceC004201y interfaceC004201y, C008103m c008103m) {
        this.A0G = anonymousClass012;
        this.A0H = c001200o;
        this.A0V = interfaceC002901k;
        this.A0M = anonymousClass055;
        this.A0I = anonymousClass011;
        this.A0F = c01b;
        this.A0J = anonymousClass006;
        this.A0L = anonymousClass056;
        this.A0K = anonymousClass057;
        this.A0U = interfaceC004201y;
        this.A0T = c008103m;
    }

    public static C01V A00() {
        if (A0W == null) {
            synchronized (C01V.class) {
                if (A0W == null) {
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C001200o c001200o = C001200o.A01;
                    InterfaceC002901k A002 = C002801j.A00();
                    if (AnonymousClass055.A03 == null) {
                        synchronized (AnonymousClass055.class) {
                            if (AnonymousClass055.A03 == null) {
                                AnonymousClass055.A03 = new AnonymousClass055(C02E.A00(), C02O.A00());
                            }
                        }
                    }
                    A0W = new C01V(A00, c001200o, A002, AnonymousClass055.A03, AnonymousClass011.A00(), C01B.A00(), AnonymousClass006.A03, AnonymousClass056.A00(), AnonymousClass057.A00, C03U.A00(), C008103m.A00());
                }
            }
        }
        return A0W;
    }

    public void A01() {
        C20120wq c20120wq;
        int i = this.A00;
        if (i == -1) {
            return;
        }
        if (this.A07 && C28061Pw.A00 == 2 && (c20120wq = C20120wq.A07) != null) {
            c20120wq.A03(C37841n8.A00, 0, i, 2);
        }
        C001800u c001800u = this.A03;
        if (c001800u != null) {
            c001800u.A03.AGI(c001800u.A01.A00, (short) 105);
        }
        this.A00 = -1;
        this.A05 = null;
        this.A07 = false;
        this.A04 = null;
    }

    public final void A02() {
        if (this.A03 == null) {
            this.A03 = new C001800u(this.A0G, this.A0U, this.A0T, "StartupTracker", new C004301z(703928054));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:261:0x017c, code lost:
        if (r0 == 1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A03(int r39, java.lang.String r40) {
        /*
            Method dump skipped, instructions count: 930
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01V.A03(int, java.lang.String):void");
    }

    public final void A04(long j, String str) {
        C001800u c001800u = this.A03;
        if (c001800u == null) {
            return;
        }
        if (j <= 0) {
            c001800u.A03.AGI(c001800u.A01.A00, (short) 4);
        }
        C001800u c001800u2 = this.A03;
        c001800u2.A03.AGG(c001800u2.A01.A00, "startup_type", str);
    }

    public void A05(View view, String str, int i, Runnable runnable) {
        if (this.A00 != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" onRestart");
            A07(sb.toString());
        } else if (this.A06) {
        } else {
            this.A06 = true;
            A02();
            C002701i.A1G(view, new RunnableC28051Pv(this, str, i, runnable), this.A0E);
            this.A01 = 2;
            this.A02 = this.A0O;
            A03(24772611, str);
        }
    }

    public void A06(String str) {
        if (this.A00 != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" onCreate");
            A07(sb.toString());
        } else if (this.A06) {
        } else {
            this.A06 = true;
            A02();
            this.A01 = 3;
            this.A02 = this.A0S;
            A03(24772610, str);
        }
    }

    public void A07(String str) {
        Long l;
        int i = this.A00;
        if (i != -1 && this.A07 && (l = this.A04) != null) {
            AnonymousClass055 anonymousClass055 = this.A0M;
            long longValue = l.longValue();
            if (anonymousClass055 != null) {
                int i2 = C37831n7.A00;
                Logger.writeBytesEntry(i2, 1, 83, Logger.writeStandardEntry(i2, 7, 50, 0L, 0, i, 0, longValue), str);
                return;
            }
            throw null;
        }
    }
}
