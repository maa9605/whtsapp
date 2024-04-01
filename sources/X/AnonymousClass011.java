package X;

import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.util.Log;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.011 */
/* loaded from: classes.dex */
public class AnonymousClass011 {
    public static volatile AnonymousClass011 A0L;
    public C0QO A00;
    public C0QO A01;
    public C0QO A02;
    public C0ST A03;
    public C0ST A04;
    public C0ST A05;
    public InterfaceC05340Oh A06;
    public InterfaceC05340Oh A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final C000500h A0B;
    public final C006502w A0C;
    public final C006202t A0D;
    public final C006002r A0E;
    public final C005902q A0F;
    public volatile int A0J;
    public volatile boolean A0K;
    public final CountDownLatch A0G = new CountDownLatch(1);
    public final CountDownLatch A0I = new CountDownLatch(1);
    public final CountDownLatch A0H = new CountDownLatch(1);

    public AnonymousClass011(C005902q c005902q, C006002r c006002r, C006202t c006202t, C000500h c000500h, C006502w c006502w) {
        this.A0F = c005902q;
        this.A0E = c006002r;
        this.A0D = c006202t;
        this.A0B = c000500h;
        this.A0C = c006502w;
    }

    public static AnonymousClass011 A00() {
        if (A0L == null) {
            synchronized (AnonymousClass011.class) {
                if (A0L == null) {
                    C005902q A00 = C005902q.A00();
                    if (C006002r.A01 == null) {
                        synchronized (C006002r.class) {
                            if (C006002r.A01 == null) {
                                C006002r.A01 = new C006002r(C000500h.A00());
                            }
                        }
                    }
                    A0L = new AnonymousClass011(A00, C006002r.A01, C006202t.A00(), C000500h.A00(), C006502w.A00());
                }
            }
        }
        return A0L;
    }

    public static final void A01(AnonymousClass014 anonymousClass014, String str) {
        if (anonymousClass014 instanceof WamCall) {
            StringBuilder A0W = C000200d.A0W("wamruntime/printevent", str, ": ");
            A0W.append(anonymousClass014.toString());
            Log.i(A0W.toString());
        }
    }

    public final Integer A02(int i, AnonymousClass015 anonymousClass015, boolean z) {
        int i2 = this.A0C.A01().getInt(String.valueOf(i), 0);
        if (i2 != 0) {
            int abs = Math.abs(i2);
            anonymousClass015 = new AnonymousClass015(abs, abs, abs, false);
        } else {
            i2 = anonymousClass015.A02;
            if (z) {
                i2 = -i2;
            }
        }
        if (anonymousClass015.A00()) {
            return Integer.valueOf(i2);
        }
        return null;
    }

    public void A03() {
        this.A0F.A01.execute(new Runnable() { // from class: X.1PE
            {
                AnonymousClass011.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AnonymousClass011 anonymousClass011 = AnonymousClass011.this;
                C000200d.A0j(anonymousClass011.A0B, "wam_is_current_buffer_real_time", true);
                if (anonymousClass011.A0F()) {
                    anonymousClass011.A07.ASO(anonymousClass011.A00, false);
                }
            }
        });
    }

    public final void A04() {
        if (this.A04.A00() > this.A02.A03() && !this.A02.A0K()) {
            if (this.A02.A0J()) {
                this.A02.A0E();
                this.A04.A01();
            } else {
                A05();
                return;
            }
        }
        if (this.A04.A00() > this.A02.A02()) {
            Log.e("wamruntime/logevent: dropping wam real time event because it is larger than the buffer itself");
            return;
        }
        C0QO c0qo = this.A02;
        C0ST c0st = this.A04;
        c0qo.A0G(c0st.A00, c0st.A01);
        this.A02.A0C();
        this.A07.ASO(this.A02, false);
    }

    public final void A05() {
        C006002r c006002r = this.A0E;
        Long l = c006002r.A0I;
        if (l == null) {
            c006002r.A0I = 0L;
            l = 0L;
        }
        Long l2 = c006002r.A0J;
        if (l2 == null) {
            c006002r.A0J = 0L;
            l2 = 0L;
        }
        c006002r.A0I = C000200d.A04(l);
        c006002r.A0J = Long.valueOf(l2.longValue() + this.A05.A00());
        c006002r.A06();
        Log.w("wamruntime/logevent: no room for a new event record");
    }

    public void A06(AnonymousClass014 anonymousClass014) {
        A09(anonymousClass014, 1);
        A01(anonymousClass014, "");
    }

    public void A07(AnonymousClass014 anonymousClass014) {
        A0B(anonymousClass014, null, false);
    }

    public void A08(AnonymousClass014 anonymousClass014, int i) {
        A09(anonymousClass014, i);
        StringBuilder sb = new StringBuilder("(with weight=");
        sb.append(i);
        sb.append(")");
        A01(anonymousClass014, sb.toString());
    }

    public final void A09(final AnonymousClass014 anonymousClass014, final int i) {
        if (anonymousClass014.channel != 2) {
            this.A0F.A01.execute(new Runnable() { // from class: X.1PI
                {
                    AnonymousClass011.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass011 anonymousClass011 = AnonymousClass011.this;
                    AnonymousClass014 anonymousClass0142 = anonymousClass014;
                    int i2 = i;
                    int i3 = anonymousClass0142.channel;
                    AnonymousClass014 anonymousClass0143 = (AnonymousClass014) anonymousClass0142.clone();
                    if (i3 == 1) {
                        if (anonymousClass011.A0H()) {
                            anonymousClass011.A04.A04(anonymousClass0143, i2);
                            anonymousClass011.A04.A01();
                            anonymousClass011.A04();
                            return;
                        }
                        return;
                    }
                    anonymousClass011.A0A(anonymousClass0143, i2, false);
                }
            });
        } else if (!this.A0K) {
        } else {
            this.A0F.A02.execute(new Runnable() { // from class: X.1PC
                {
                    AnonymousClass011.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass011 anonymousClass011 = AnonymousClass011.this;
                    AnonymousClass014 anonymousClass0142 = anonymousClass014;
                    int i2 = i;
                    AnonymousClass014 anonymousClass0143 = (AnonymousClass014) anonymousClass0142.clone();
                    if (anonymousClass011.A0K && anonymousClass011.A0G()) {
                        anonymousClass011.A03.A04(anonymousClass0143, i2);
                        anonymousClass011.A03.A01();
                        if (anonymousClass011.A03.A00() > anonymousClass011.A01.A03() && !anonymousClass011.A01.A0K()) {
                            if (anonymousClass011.A01.A0J()) {
                                anonymousClass011.A01.A0E();
                                anonymousClass011.A03.A01();
                            } else {
                                C006002r c006002r = anonymousClass011.A0E;
                                Long l = c006002r.A0K;
                                if (l == null) {
                                    c006002r.A0K = 0L;
                                    l = 0L;
                                }
                                Long l2 = c006002r.A0L;
                                if (l2 == null) {
                                    c006002r.A0L = 0L;
                                    l2 = 0L;
                                }
                                c006002r.A0K = C000200d.A04(l);
                                c006002r.A0L = Long.valueOf(l2.longValue() + anonymousClass011.A03.A00());
                                c006002r.A06();
                                Log.w("wamruntime/recordPrivateStatsDroppedEvent: no space in buffer for more events ");
                                return;
                            }
                        }
                        if (anonymousClass011.A03.A00() > anonymousClass011.A01.A02()) {
                            Log.e("wamruntime/logPrivateStatsEventInternal: dropping event because it is larger than the buffer itself");
                            return;
                        }
                        C0QO c0qo = anonymousClass011.A01;
                        C0ST c0st = anonymousClass011.A03;
                        c0qo.A0G(c0st.A00, c0st.A01);
                        anonymousClass011.A01.A0C();
                    }
                }
            });
        }
    }

    public final void A0A(AnonymousClass014 anonymousClass014, int i, boolean z) {
        if (A0F()) {
            this.A05.A04(anonymousClass014, i);
            this.A05.A01();
            A0E(z);
            C006002r c006002r = this.A0E;
            if (anonymousClass014 == c006002r) {
                c006002r.A0I = null;
                c006002r.A0J = null;
                ((C006102s) c006002r).A00 = null;
                c006002r.A0K = null;
                c006002r.A0L = null;
                c006002r.A0M = null;
                c006002r.A0N = null;
                c006002r.A01 = null;
                c006002r.A02 = null;
                c006002r.A03 = null;
                c006002r.A04 = null;
                c006002r.A05 = null;
                c006002r.A06 = null;
                c006002r.A07 = null;
                c006002r.A08 = null;
                c006002r.A09 = null;
                c006002r.A0A = null;
                c006002r.A0B = null;
                c006002r.A0C = null;
                c006002r.A0D = null;
                c006002r.A0E = null;
                c006002r.A0F = null;
                c006002r.A0G = null;
                c006002r.A0H = null;
                c006002r.A06();
            }
            if (z) {
                return;
            }
            this.A00.A0C();
        }
    }

    public void A0B(AnonymousClass014 anonymousClass014, AnonymousClass015 anonymousClass015, boolean z) {
        String str;
        int i = anonymousClass014.code;
        if (anonymousClass015 == null) {
            anonymousClass015 = anonymousClass014.samplingRate;
        }
        Integer A02 = A02(i, anonymousClass015, z);
        if (A02 != null) {
            A09(anonymousClass014, A02.intValue());
            StringBuilder sb = new StringBuilder("(sampled with weight ");
            sb.append(A02);
            sb.append(")");
            str = sb.toString();
        } else {
            str = "(dropped)";
        }
        A01(anonymousClass014, str);
    }

    public final void A0C(CountDownLatch countDownLatch) {
        if (countDownLatch == this.A0H) {
            this.A0F.A02.A00();
        } else {
            this.A0F.A01.A00();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            StringBuilder sb = new StringBuilder("wamruntime: unexpected thread interrupt (");
            sb.append(e);
            sb.append(")");
            Log.a(sb.toString());
            Thread.currentThread().interrupt();
        }
    }

    public void A0D(boolean z) {
        synchronized (this) {
            boolean z2 = this.A0K;
            this.A0K = z;
            if (!z2 && z) {
                this.A0F.A02.execute(new RunnableC07160Xb(this));
            }
        }
    }

    public final void A0E(boolean z) {
        if (this.A05.A00() > this.A00.A03() && !this.A00.A0K()) {
            if (this.A00.A0J()) {
                this.A00.A0E();
                C000200d.A0j(this.A0B, "wam_is_current_buffer_real_time", false);
                this.A05.A01();
            } else {
                A05();
                return;
            }
        }
        if (this.A05.A00() > this.A00.A02()) {
            Log.e("wamruntime/logevent: dropping event because it is larger than the buffer itself");
            return;
        }
        C0QO c0qo = this.A00;
        C0ST c0st = this.A05;
        c0qo.A0G(c0st.A00, c0st.A01);
        C0QO c0qo2 = this.A00;
        if (c0qo2.A00() != 1 || z) {
            return;
        }
        if (!c0qo2.A04) {
            this.A0E.A0C = Boolean.TRUE;
        }
        C006002r c006002r = this.A0E;
        if (c006002r.A00()) {
            return;
        }
        A0A(c006002r, 0, true);
    }

    public final boolean A0F() {
        if (!this.A08) {
            A0C(this.A0G);
            this.A0D.A01(0);
            this.A08 = true;
        }
        return this.A00.A04;
    }

    public final boolean A0G() {
        if (!this.A09) {
            A0C(this.A0H);
            this.A0D.A01(2);
            this.A09 = true;
        }
        return this.A01.A04;
    }

    public final boolean A0H() {
        if (!this.A0A) {
            A0C(this.A0I);
            this.A0D.A01(1);
            this.A0A = true;
        }
        return this.A02.A04;
    }
}
