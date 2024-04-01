package X;

import android.app.Application;
import android.os.SystemClock;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.GetVNameCertificateJob;

/* renamed from: X.2JU */
/* loaded from: classes2.dex */
public class C2JU extends C0QY {
    public C05920Qu A00;
    public final C0HK A01;
    public final C018508q A02;
    public final C01B A03;
    public final C0E6 A04;
    public final C06K A05;
    public final InterfaceC04730Lp A06;
    public final C2L3 A07;
    public final AnonymousClass272 A08;
    public final AnonymousClass075 A09;
    public final C002301c A0A;
    public final C0ED A0B;
    public final C003701t A0C;
    public final C05Y A0D;
    public final InterfaceC002901k A0E;

    public C2JU(Application application, C003701t c003701t, C018508q c018508q, InterfaceC002901k interfaceC002901k, C01B c01b, C0E6 c0e6, C05Y c05y, C2L3 c2l3, C0ED c0ed, C002301c c002301c, AnonymousClass272 anonymousClass272, AnonymousClass075 anonymousClass075, C06K c06k, InterfaceC04730Lp interfaceC04730Lp) {
        super(application);
        this.A01 = new C0HK();
        this.A0C = c003701t;
        this.A02 = c018508q;
        this.A06 = interfaceC04730Lp;
        this.A0E = interfaceC002901k;
        this.A03 = c01b;
        this.A04 = c0e6;
        this.A0D = c05y;
        this.A07 = c2l3;
        this.A0B = c0ed;
        this.A0A = c002301c;
        this.A09 = anonymousClass075;
        this.A08 = anonymousClass272;
        this.A05 = c06k;
    }

    public final void A02(UserJid userJid) {
        if (this.A00 == null) {
            return;
        }
        C06K c06k = this.A05;
        String A02 = c06k.A02(userJid);
        if (A02 != null) {
            this.A00.A0A = A02;
            A03(userJid);
            return;
        }
        c06k.A01(userJid, null).A00(this.A06);
    }

    public final void A03(UserJid userJid) {
        if (this.A00 == null) {
            return;
        }
        C018108l A0E = this.A09.A04.A0E(userJid);
        if (A0E != null) {
            C05920Qu c05920Qu = this.A00;
            c05920Qu.A0D = A0E.A08;
            this.A01.A0B(c05920Qu);
            return;
        }
        C0E6 c0e6 = this.A04;
        c0e6.A00.A01(new GetVNameCertificateJob(userJid));
    }

    public final void A04(UserJid userJid, String str, C2N3 c2n3) {
        this.A00 = new C659139a(str, userJid);
        int dimensionPixelSize = ((C0QY) this).A00.getResources().getDimensionPixelSize(R.dimen.thumbnail_size);
        C2A2 A07 = this.A08.A07(userJid);
        if (A07 != null) {
            c2n3.A01(A07, 2, new C39Z(this, userJid), null, null);
            return;
        }
        C2L3 c2l3 = this.A07;
        C2A1 A04 = c2l3.A0B.A04(userJid);
        if ((A04 == null || A04.A01) && !c2l3.A01) {
            c2l3.A05(userJid, dimensionPixelSize, c2l3.A00(userJid));
        } else {
            A02(userJid);
        }
    }

    public final void A05(String str) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        C1Lh.A01(this.A02, this.A0E, this.A03, this.A0A, str, new InterfaceC26921Lg() { // from class: X.39Y
            {
                C2JU.this = this;
            }

            @Override // X.InterfaceC26921Lg
            public final void AMf(C05920Qu c05920Qu, boolean z) {
                C2JU c2ju = C2JU.this;
                long elapsedRealtime2 = 1000 - (SystemClock.elapsedRealtime() - elapsedRealtime);
                if (elapsedRealtime2 < 0) {
                    elapsedRealtime2 = 0;
                }
                C018508q c018508q = c2ju.A02;
                c018508q.A02.postDelayed(new RunnableEBaseShape1S0200000_I0_1(c2ju, c05920Qu, 20), elapsedRealtime2);
            }
        });
    }

    public final boolean A06(String str) {
        return this.A0B.A07(str) && this.A03.A0E(C01C.A0Y);
    }
}
