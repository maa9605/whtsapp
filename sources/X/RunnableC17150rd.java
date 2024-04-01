package X;

import androidx.work.impl.WorkDatabase;

/* renamed from: X.0rd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC17150rd implements Runnable {
    public static final String A03 = AbstractC16430qO.A01("StopWorkRunnable");
    public final C0OP A00;
    public final String A01;
    public final boolean A02;

    public RunnableC17150rd(C0OP workManagerImpl, String workSpecId, boolean stopInForeground) {
        this.A00 = workManagerImpl;
        this.A01 = workSpecId;
        this.A02 = stopInForeground;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean containsKey;
        boolean A00;
        C0OP c0op = this.A00;
        WorkDatabase workDatabase = c0op.A04;
        C1VP c1vp = c0op.A03;
        InterfaceC17010rO A0B = workDatabase.A0B();
        workDatabase.A03();
        try {
            String str = this.A01;
            synchronized (c1vp.A08) {
                containsKey = c1vp.A06.containsKey(str);
            }
            if (this.A02) {
                C1VP c1vp2 = c0op.A03;
                synchronized (c1vp2.A08) {
                    AbstractC16430qO.A00().A02(C1VP.A0A, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
                    A00 = C1VP.A00(str, (RunnableC16620qi) c1vp2.A06.remove(str));
                }
            } else {
                if (!containsKey) {
                    C1W8 c1w8 = (C1W8) A0B;
                    if (c1w8.A01(str) == C07M.RUNNING) {
                        c1w8.A09(C07M.ENQUEUED, str);
                    }
                }
                C1VP c1vp3 = c0op.A03;
                synchronized (c1vp3.A08) {
                    AbstractC16430qO.A00().A02(C1VP.A0A, String.format("Processor stopping background work %s", str), new Throwable[0]);
                    A00 = C1VP.A00(str, (RunnableC16620qi) c1vp3.A05.remove(str));
                }
            }
            AbstractC16430qO.A00().A02(A03, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", str, Boolean.valueOf(A00)), new Throwable[0]);
            workDatabase.A05();
        } finally {
            workDatabase.A04();
        }
    }
}
