package X;

import androidx.work.impl.WorkDatabase;
import java.util.LinkedList;

/* renamed from: X.0rR */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC17040rR implements Runnable {
    public final C1VO A00 = new C1VO();

    public abstract void A01();

    public static void A00(C0OP workManagerImpl, String workSpecId) {
        boolean z;
        WorkDatabase workDatabase = workManagerImpl.A04;
        InterfaceC17010rO A0B = workDatabase.A0B();
        InterfaceC16910rE A06 = workDatabase.A06();
        LinkedList linkedList = new LinkedList();
        linkedList.add(workSpecId);
        while (true) {
            z = true;
            if (linkedList.isEmpty()) {
                break;
            }
            String str = (String) linkedList.remove();
            C1W8 c1w8 = (C1W8) A0B;
            C07M A01 = c1w8.A01(str);
            if (A01 != C07M.SUCCEEDED && A01 != C07M.FAILED) {
                c1w8.A09(C07M.CANCELLED, str);
            }
            linkedList.addAll(((C1Vs) A06).A00(str));
        }
        C1VP c1vp = workManagerImpl.A03;
        synchronized (c1vp.A08) {
            AbstractC16430qO.A00().A02(C1VP.A0A, String.format("Processor cancelling %s", workSpecId), new Throwable[0]);
            c1vp.A07.add(workSpecId);
            RunnableC16620qi runnableC16620qi = (RunnableC16620qi) c1vp.A06.remove(workSpecId);
            if (runnableC16620qi == null) {
                z = false;
                runnableC16620qi = (RunnableC16620qi) c1vp.A05.remove(workSpecId);
            }
            C1VP.A00(workSpecId, runnableC16620qi);
            if (z) {
                c1vp.A01();
            }
        }
        for (InterfaceC16550qb interfaceC16550qb : workManagerImpl.A07) {
            interfaceC16550qb.A5z(workSpecId);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            A01();
            this.A00.A00(C0OE.A01);
        } catch (Throwable th) {
            this.A00.A00(new C1VH(th));
        }
    }
}
