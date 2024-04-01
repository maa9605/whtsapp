package X;

import android.app.Activity;

/* renamed from: X.39R  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C39R extends C06020Rf {
    public C39S A00;
    public Runnable A01;
    public final ActivityC02320As A02;
    public final C018308n A03;
    public final C34841iB A04;
    public final InterfaceC018908u A05;
    public final C0B5 A06;
    public final C018508q A07;
    public final C005002g A08;
    public final C01B A09;
    public final C04950Mp A0A;
    public final C09I A0B;
    public final C018608r A0C;
    public final C40261rr A0D;
    public final C05W A0E;
    public final C018708s A0F;
    public final C2MW A0G;
    public final C2MR A0H;
    public final C59372se A0I;
    public final AnonymousClass012 A0J;
    public final C000500h A0K;
    public final C002301c A0L;
    public final C0DK A0M;
    public final C40081rY A0N;
    public final C018808t A0O;
    public final AbstractC005302j A0P;
    public final C40071rX A0Q;
    public final C2MZ A0R;
    public final InterfaceC002901k A0S;

    public C39R(ActivityC02320As activityC02320As, AnonymousClass012 anonymousClass012, C09I c09i, C018508q c018508q, InterfaceC002901k interfaceC002901k, C005002g c005002g, C40081rY c40081rY, C01B c01b, C018608r c018608r, C018308n c018308n, C05W c05w, C40071rX c40071rX, C018708s c018708s, C002301c c002301c, C40261rr c40261rr, C2MR c2mr, C018808t c018808t, C04950Mp c04950Mp, C000500h c000500h, C2MW c2mw, C2MZ c2mz, C0DK c0dk, C0B5 c0b5, InterfaceC018908u interfaceC018908u, C34841iB c34841iB, AbstractC005302j abstractC005302j, C59372se c59372se) {
        this.A02 = activityC02320As;
        this.A0J = anonymousClass012;
        this.A0B = c09i;
        this.A07 = c018508q;
        this.A0S = interfaceC002901k;
        this.A08 = c005002g;
        this.A0N = c40081rY;
        this.A09 = c01b;
        this.A0C = c018608r;
        this.A03 = c018308n;
        this.A0E = c05w;
        this.A0Q = c40071rX;
        this.A0F = c018708s;
        this.A0L = c002301c;
        this.A0D = c40261rr;
        this.A0H = c2mr;
        this.A0O = c018808t;
        this.A0A = c04950Mp;
        this.A0K = c000500h;
        this.A0G = c2mw;
        this.A0R = c2mz;
        this.A0M = c0dk;
        this.A06 = c0b5;
        this.A05 = interfaceC018908u;
        this.A04 = c34841iB;
        this.A0P = abstractC005302j;
        this.A0I = c59372se;
        this.A01 = new RunnableEBaseShape2S0300000_I1(c34841iB, this, c0b5, 3);
    }

    @Override // X.C06020Rf, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.A01 = null;
        C39S c39s = this.A00;
        if (c39s != null) {
            c39s.A01 = null;
            c39s.A00 = null;
            c39s.A05(true);
            this.A00 = null;
        }
    }
}
