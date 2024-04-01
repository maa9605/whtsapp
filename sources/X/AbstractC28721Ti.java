package X;

import android.content.Context;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* renamed from: X.1Ti */
/* loaded from: classes.dex */
public abstract class AbstractC28721Ti extends C13930m5 {
    public long A00;
    public final Executor A01;
    public volatile RunnableC28711Th A02;
    public volatile RunnableC28711Th A03;

    public abstract Object A07();

    public void A08() {
    }

    public void A0B(Object obj) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC28721Ti(Context context) {
        super(context);
        Executor executor = AbstractC13990mB.A07;
        this.A00 = -10000L;
        this.A01 = executor;
    }

    @Override // X.C13930m5
    public void A00() {
        A06();
        this.A03 = new RunnableC28711Th(this);
        A09();
    }

    @Override // X.C13930m5
    public void A05(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.A05(str, fileDescriptor, printWriter, strArr);
        if (this.A03 != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.A03);
            printWriter.print(" waiting=");
            printWriter.println(false);
        }
        if (this.A02 != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.A02);
            printWriter.print(" waiting=");
            printWriter.println(false);
        }
    }

    @Override // X.C13930m5
    public boolean A06() {
        if (this.A03 != null) {
            if (!this.A06) {
                super.A03 = true;
            }
            if (this.A02 != null) {
                this.A03 = null;
                return false;
            }
            RunnableC28711Th runnableC28711Th = this.A03;
            runnableC28711Th.A02.set(true);
            boolean cancel = ((AbstractC13990mB) runnableC28711Th).A01.cancel(false);
            if (cancel) {
                this.A02 = this.A03;
                A08();
            }
            this.A03 = null;
            return cancel;
        }
        return false;
    }

    public void A09() {
        if (this.A02 == null && this.A03 != null) {
            RunnableC28711Th runnableC28711Th = this.A03;
            Executor executor = this.A01;
            if (runnableC28711Th.A04 != EnumC13980mA.PENDING) {
                int ordinal = runnableC28711Th.A04.ordinal();
                if (ordinal == 1) {
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                }
                if (ordinal != 2) {
                    throw new IllegalStateException("We should never reach this state");
                }
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            runnableC28711Th.A04 = EnumC13980mA.RUNNING;
            executor.execute(((AbstractC13990mB) runnableC28711Th).A01);
        }
    }

    public void A0A(RunnableC28711Th runnableC28711Th, Object obj) {
        A0B(obj);
        if (this.A02 == runnableC28711Th) {
            if (this.A04) {
                if (this.A06) {
                    A00();
                } else {
                    super.A03 = true;
                }
            }
            this.A00 = SystemClock.uptimeMillis();
            this.A02 = null;
            A09();
        }
    }
}
