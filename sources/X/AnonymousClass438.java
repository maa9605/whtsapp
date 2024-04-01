package X;

/* renamed from: X.438  reason: invalid class name */
/* loaded from: classes3.dex */
public class AnonymousClass438 {
    public boolean A00;
    public final C44I A01;

    public AnonymousClass438(C44I c44i) {
        this.A01 = c44i;
    }

    public final void A00(String str) {
        StringBuilder sb = new StringBuilder("Can only check if prepared on the Optic thread. ");
        sb.append(str);
        A01(sb.toString());
        if (this.A00) {
            return;
        }
        StringBuilder A0W = C000200d.A0W("Not prepared: ", str, " Current thread: ");
        A0W.append(Thread.currentThread().getName());
        throw new IllegalStateException(A0W.toString());
    }

    public final void A01(String str) {
        if (this.A01.A08()) {
            return;
        }
        StringBuilder A0V = C000200d.A0V(str, " Current thread: ");
        A0V.append(Thread.currentThread().getName());
        throw new RuntimeException(A0V.toString());
    }

    public final void A02(boolean z, String str) {
        StringBuilder sb = new StringBuilder("Can only set the prepared state on the Optic thread. ");
        sb.append(str);
        A01(sb.toString());
        this.A00 = z;
    }
}
