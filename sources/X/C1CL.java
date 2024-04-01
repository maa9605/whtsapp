package X;

import java.util.concurrent.Executor;

/* renamed from: X.1CL  reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C1CL implements Executor {
    public static final Executor A00 = new C1CL();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
