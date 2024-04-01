package X;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.02U  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C02U {
    public final int A00;
    public final C02R A01;
    public final Set A02 = new HashSet();
    public final Executor A03;

    public C02U(int i, Executor executor, C02R c02r) {
        this.A00 = i;
        this.A03 = executor;
        this.A01 = c02r;
    }
}
