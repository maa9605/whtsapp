package X;

import android.util.Pair;
import java.util.concurrent.Executor;

/* renamed from: X.3G9  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3G9 implements InterfaceC04070Ih {
    public final C0CK A00 = new C0CK();
    public final C0CK A01 = new C0CK();
    public final Executor A02;

    public C3G9(Executor executor) {
        this.A02 = executor;
    }

    @Override // X.InterfaceC04070Ih
    public void AJX(boolean z) {
        this.A00.A04(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC04070Ih
    public void AJY(C04020Ic c04020Ic, C43211x2 c43211x2) {
        this.A01.A04(Pair.create(c04020Ic, c43211x2));
    }
}
