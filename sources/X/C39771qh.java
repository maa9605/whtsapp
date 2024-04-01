package X;

import android.content.Context;
import android.os.RemoteException;
import java.util.Collections;

/* renamed from: X.1qh */
/* loaded from: classes.dex */
public final class C39771qh extends AbstractC31511cO {
    public C17Q A00;
    public final AnonymousClass179 A01;
    public final C17I A02;
    public final C17Z A03;

    @Override // X.AbstractC31511cO
    public final void A0D() {
    }

    public C39771qh(AnonymousClass176 anonymousClass176) {
        super(anonymousClass176);
        this.A03 = new C17Z(anonymousClass176.A03);
        this.A01 = new AnonymousClass179(this);
        this.A02 = new C17I(anonymousClass176) { // from class: X.1cP
            {
                C39771qh.this = this;
            }

            @Override // X.C17I
            public final void A01() {
                C39771qh c39771qh = C39771qh.this;
                if (c39771qh != null) {
                    C13H.A00();
                    if (c39771qh.A0G()) {
                        c39771qh.A03("Inactivity, disconnecting from device AnalyticsService");
                        c39771qh.A0E();
                        return;
                    }
                    return;
                }
                throw null;
            }
        };
    }

    public final void A0E() {
        C231815n A00;
        Context context;
        AnonymousClass179 anonymousClass179;
        C13H.A00();
        A0C();
        try {
            A00 = C231815n.A00();
            context = ((AnonymousClass174) this).A00.A00;
            anonymousClass179 = this.A01;
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        if (A00 == null) {
            throw null;
        }
        context.unbindService(anonymousClass179);
        if (this.A00 != null) {
            this.A00 = null;
            C39761qg c39761qg = ((AnonymousClass174) this).A00.A04;
            AnonymousClass176.A01(c39761qg);
            c39761qg.A0C();
            C13H.A00();
            C39801qk c39801qk = c39761qg.A00;
            C13H.A00();
            c39801qk.A0C();
            c39801qk.A03("Service disconnected");
        }
    }

    public final void A0F() {
        this.A03.A00();
        this.A02.A02(((Number) C17L.A05.A00).longValue());
    }

    public final boolean A0G() {
        C13H.A00();
        A0C();
        return this.A00 != null;
    }

    public final boolean A0H(C17P c17p) {
        String str;
        C07K.A1P(c17p);
        C13H.A00();
        A0C();
        C17Q c17q = this.A00;
        if (c17q == null) {
            return false;
        }
        if (c17p.A04) {
            str = (String) C17L.A0K.A00;
        } else {
            str = (String) C17L.A0J.A00;
        }
        try {
            c17q.AWz(c17p.A03, c17p.A02, str, Collections.emptyList());
            A0F();
            return true;
        } catch (RemoteException unused) {
            A03("Failed to send hits to AnalyticsService");
            return false;
        }
    }
}
