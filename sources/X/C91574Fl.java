package X;

import androidx.appcompat.widget.Toolbar;

/* renamed from: X.4Fl */
/* loaded from: classes3.dex */
public final class C91574Fl extends AbstractC75073eJ {
    public Toolbar A00;
    public final C09O A01;
    public final C47P A02;
    public final AnonymousClass478 A03;
    public final C47Q A04;
    public final C893746t A05;
    public final C00J A06;
    public final C00J A07;
    public final C00J A08;

    public C91574Fl(C00J c00j, C00J c00j2, C47P c47p, AnonymousClass478 anonymousClass478, C47Q c47q, C09O c09o, C893746t c893746t, C00J c00j3) {
        this.A06 = c00j;
        this.A08 = c00j2;
        this.A02 = c47p;
        this.A03 = anonymousClass478;
        this.A04 = c47q;
        this.A01 = c09o;
        this.A05 = c893746t;
        this.A07 = c00j3;
    }

    @Override // X.AbstractC75073eJ
    public void A00() {
        ActivityC02290Ap activityC02290Ap = super.A01;
        AbstractC02800Cx A0N = activityC02290Ap.A0N();
        if (A0N.A03() <= 1) {
            activityC02290Ap.setResult(0, super.A00);
            super.A01.finish();
            return;
        }
        A0N.A0D();
        A0N.A0B();
    }

    public /* synthetic */ void A01() {
        A00();
    }
}
