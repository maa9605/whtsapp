package X;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.util.Log;

/* renamed from: X.26I */
/* loaded from: classes2.dex */
public class C26I extends C0MU {
    public final C0HL A01;
    public final C0HK A04;
    public final C000500h A05;
    public final C05E A06;
    public final C42181vJ A07;
    public final C2S4 A09;
    public final C42161vG A0A;
    public final C25C A0B;
    public final C04880Mg A02 = new C04880Mg();
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final Runnable A0C = new RunnableEBaseShape5S0100000_I0_5(this, 39);
    public final C26H A08 = new C26H(this);
    public final C0HK A03 = new C0HK();

    public C26I(C018508q c018508q, C02L c02l, InterfaceC002901k interfaceC002901k, C41181tV c41181tV, C0EG c0eg, C0EB c0eb, C0E6 c0e6, C05W c05w, C23Y c23y, C40291rx c40291rx, C03290Fc c03290Fc, C2CS c2cs, C0ES c0es, C40431sF c40431sF, AbstractC40441sG abstractC40441sG, C0CB c0cb, C000400f c000400f, C41321tj c41321tj, C0CC c0cc, C41511u2 c41511u2, C05E c05e, C2Aa c2Aa, C000500h c000500h, C02960Do c02960Do, C49552Lb c49552Lb, C42181vJ c42181vJ, C26S c26s, C25C c25c, C42711wC c42711wC, C0C8 c0c8, C42431vj c42431vj, C03350Fj c03350Fj, C42161vG c42161vG, C05N c05n, C49562Lc c49562Lc) {
        this.A06 = c05e;
        this.A05 = c000500h;
        this.A07 = c42181vJ;
        this.A0A = c42161vG;
        this.A0B = c25c;
        C2S4 c2s4 = new C2S4(this, c018508q, c02l, interfaceC002901k, c41181tV, c0eg, c0eb, c0e6, c05w, c23y, c40291rx, c03290Fc, c2cs, c0es, c40431sF, abstractC40441sG, c0cb, c000400f, c41321tj, c0cc, c41511u2, c2Aa, c02960Do, c49552Lb, c42181vJ, c26s, c42711wC, c0c8, c42431vj, c03350Fj, c05n, c49562Lc);
        this.A09 = c2s4;
        C0HK c0hk = ((C2La) c2s4).A00;
        this.A01 = c0hk;
        this.A02.A0C(c0hk, new InterfaceC05620Pl() { // from class: X.3mQ
            {
                C26I.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                C26I c26i = C26I.this;
                if (((Number) obj).intValue() == 0) {
                    c26i.A02.A0B(0);
                }
            }
        });
        final C04880Mg c04880Mg = this.A02;
        c04880Mg.A0C(this.A03, new InterfaceC05620Pl() { // from class: X.3mT
            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                c04880Mg.A0B(obj);
            }
        });
        this.A04 = new C0HK();
        c25c.A01(this.A08);
        A02();
    }

    @Override // X.C0MU
    public void A01() {
        A03();
        C04880Mg c04880Mg = this.A02;
        C09090cd c09090cd = (C09090cd) c04880Mg.A00.A01(this.A03);
        if (c09090cd != null) {
            c09090cd.A01.A09(c09090cd);
        }
        C09090cd c09090cd2 = (C09090cd) c04880Mg.A00.A01(this.A01);
        if (c09090cd2 != null) {
            c09090cd2.A01.A09(c09090cd2);
        }
        this.A0B.A00(this.A08);
    }

    public final void A02() {
        C05E c05e = this.A06;
        c05e.A05();
        if (c05e.A01) {
            Log.i("DirectTransferBackgroundTaskViewModel/msg-store-is-already-ready");
            A06(this.A05.A00.getInt("migrate_from_other_app_attempt_count", 0), 2);
            A05(6);
            return;
        }
        C000500h c000500h = this.A05;
        c000500h.A0D().putInt("migrate_from_other_app_attempt_count", c000500h.A00.getInt("migrate_from_other_app_attempt_count", 0) + 1).apply();
        A04();
        Integer num = 1;
        if (num.equals(this.A03.A01())) {
            return;
        }
        Log.i("DirectTransferBackgroundTaskViewModel/startBackgroundTaskAfterOtherAppIsLoggedOut/start-background-task");
        A05(1);
        this.A09.A02();
    }

    public final void A03() {
        Log.i("DirectTransferBackgroundTaskViewModel/removeAllListener");
        this.A00.removeCallbacks(this.A0C);
    }

    public final void A04() {
        int i = this.A05.A00.getInt("direct_db_migration_timeout_in_secs", 180);
        long j = i * 1000;
        C000200d.A1I(C000200d.A0P("DirectTransferBackgroundTaskViewModel/setupTimeout/timeout ="), j);
        if (i > 0) {
            this.A00.postDelayed(this.A0C, j);
        }
    }

    public final void A05(int i) {
        switch (i) {
            case 1:
            case 2:
            case 7:
                this.A03.A0A(Integer.valueOf(i));
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                if (this.A05.A00.getInt("migrate_from_other_app_attempt_count", 0) >= 3) {
                    A05(7);
                    return;
                } else {
                    this.A03.A0A(Integer.valueOf(i));
                    return;
                }
            case 8:
                return;
            default:
                throw new IllegalArgumentException(C000200d.A0D("state is not supported, state  = ", i));
        }
    }

    public final void A06(int i, int i2) {
        if (i == 1) {
            this.A07.A01.A04 = Integer.valueOf(i2);
        } else if (i == 2) {
            this.A07.A01.A07 = Integer.valueOf(i2);
        } else if (i == 3) {
            this.A07.A01.A08 = Integer.valueOf(i2);
        }
        if (this.A07 == null) {
            throw null;
        }
    }
}
