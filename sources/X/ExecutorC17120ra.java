package X;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: X.0ra  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class ExecutorC17120ra implements Executor {
    public final Executor A02;
    public volatile Runnable A03;
    public final ArrayDeque A01 = new ArrayDeque();
    public final Object A00 = new Object();

    public ExecutorC17120ra(Executor executor) {
        this.A02 = executor;
    }

    public void A00() {
        synchronized (this.A00) {
            Runnable runnable = (Runnable) this.A01.poll();
            this.A03 = runnable;
            if (runnable != null) {
                this.A02.execute(this.A03);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable command) {
        synchronized (this.A00) {
            this.A01.add(new Runnable(this, command) { // from class: X.0rZ
                public final ExecutorC17120ra A00;
                public final Runnable A01;

                {
                    this.A00 = this;
                    this.A01 = command;
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        this.A01.run();
                    } finally {
                        this.A00.A00();
                    }
                }
            });
            if (this.A03 == null) {
                A00();
            }
        }
    }
}
