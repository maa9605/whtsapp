package X;

import android.view.View;

/* renamed from: X.2LH */
/* loaded from: classes2.dex */
public class C2LH extends C2LF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C0TT A02;
    public final /* synthetic */ C0TS A03;
    public final /* synthetic */ C2LD A04;

    public C2LH(C2LD c2ld, C0TS c0ts, int i, int i2, C0TT c0tt) {
        this.A04 = c2ld;
        this.A03 = c0ts;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = c0tt;
    }

    @Override // X.C0TU
    public void AH8(View view) {
        this.A02.A06(null);
        C2LD c2ld = this.A04;
        C0TS c0ts = this.A03;
        c2ld.A03(c0ts);
        c2ld.A04.remove(c0ts);
        if (!c2ld.A08()) {
            c2ld.A02();
        }
    }

    @Override // X.C0TU
    public void AHC(View view) {
        if (this.A04 == null) {
            throw null;
        }
    }
}
