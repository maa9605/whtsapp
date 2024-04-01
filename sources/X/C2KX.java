package X;

import android.util.Pair;

/* renamed from: X.2KX  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2KX implements C2KY {
    public final /* synthetic */ C2KZ A00;

    public C2KX(C2KZ c2kz) {
        this.A00 = c2kz;
    }

    @Override // X.C2KY
    public void AJq(Pair pair) {
        if (405 == ((Number) pair.first).intValue()) {
            C0HK c0hk = this.A00.A03;
            if (c0hk != null) {
                c0hk.A0A(Boolean.TRUE);
                return;
            }
            return;
        }
        C0HK c0hk2 = this.A00.A07;
        if (c0hk2 == null) {
            return;
        }
        c0hk2.A0A(Boolean.TRUE);
    }

    @Override // X.C2KY
    public void APH(Object obj) {
        this.A00.A0J.AS1(new RunnableEBaseShape0S0200000_I0_0(this, obj, 19));
    }
}
