package X;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.HashSet;

/* renamed from: X.0rS  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC17050rS implements Runnable {
    public static final String A02 = AbstractC16430qO.A01("EnqueueRunnable");
    public final C1VO A00 = new C1VO();
    public final C0OR A01;

    public RunnableC17050rS(C0OR workContinuation) {
        this.A01 = workContinuation;
    }

    public static void A00(C0OL workSpec) {
        C0OH c0oh = workSpec.A09;
        if (c0oh.A04 || c0oh.A07) {
            String str = workSpec.A0F;
            C16380qJ c16380qJ = new C16380qJ();
            c16380qJ.A00(workSpec.A0A.A00);
            c16380qJ.A00.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            workSpec.A0F = ConstraintTrackingWorker.class.getName();
            C0OF c0of = new C0OF(c16380qJ.A00);
            C0OF.A01(c0of);
            workSpec.A0A = c0of;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x017d, code lost:
        if (r1.getInt(0) == 0) goto L184;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f0  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(X.C0OR r26) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC17050rS.A01(X.0OR):boolean");
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C0OR c0or = this.A01;
            if (c0or != null) {
                if (!C0OR.A01(c0or, new HashSet())) {
                    C0OP c0op = c0or.A03;
                    WorkDatabase workDatabase = c0op.A04;
                    workDatabase.A03();
                    boolean A01 = A01(c0or);
                    workDatabase.A05();
                    workDatabase.A04();
                    if (A01) {
                        C17080rW.A00(c0op.A01, RescheduleReceiver.class, true);
                        C16560qc.A01(c0op.A04, c0op.A07);
                    }
                    this.A00.A00(C0OE.A01);
                    return;
                }
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", c0or));
            }
            throw null;
        } catch (Throwable th) {
            this.A00.A00(new C1VH(th));
        }
    }
}
