package X;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.01e */
/* loaded from: classes.dex */
public final class C01e {
    public final int A00;
    public final int A01;
    public final int A03;
    public final Executor A07 = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
    public final Executor A08 = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
    public final AbstractC16500qV A05 = new AbstractC16500qV() { // from class: X.1VN
    };
    public final C1VD A04 = new Object() { // from class: X.1VD
    };
    public final C16520qY A06 = new C16520qY();
    public final int A02 = 20;

    /* JADX WARN: Type inference failed for: r0v13, types: [X.1VD] */
    public C01e(C002401d builder) {
        this.A00 = builder.A00;
        this.A03 = builder.A03;
        this.A01 = builder.A01;
    }
}
