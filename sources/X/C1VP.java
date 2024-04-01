package X;

import android.content.Context;
import android.content.Intent;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* renamed from: X.1VP */
/* loaded from: classes.dex */
public class C1VP implements InterfaceC16530qZ, InterfaceC16840r7 {
    public static final String A0A = AbstractC16430qO.A01("Processor");
    public Context A00;
    public C01e A01;
    public WorkDatabase A02;
    public InterfaceC17300rs A03;
    public List A04;
    public Map A05 = new HashMap();
    public Map A06 = new HashMap();
    public Set A07 = new HashSet();
    public final List A09 = new ArrayList();
    public final Object A08 = new Object();

    public C1VP(Context appContext, C01e configuration, InterfaceC17300rs workTaskExecutor, WorkDatabase workDatabase, List schedulers) {
        this.A00 = appContext;
        this.A01 = configuration;
        this.A03 = workTaskExecutor;
        this.A02 = workDatabase;
        this.A04 = schedulers;
    }

    public static boolean A00(String id, RunnableC16620qi wrapper) {
        boolean z;
        if (wrapper != null) {
            wrapper.A0I = true;
            wrapper.A06();
            InterfaceFutureC09630eS interfaceFutureC09630eS = wrapper.A0D;
            if (interfaceFutureC09630eS != null) {
                z = interfaceFutureC09630eS.isDone();
                wrapper.A0D.cancel(true);
            } else {
                z = false;
            }
            ListenableWorker listenableWorker = wrapper.A03;
            if (listenableWorker != null && !z) {
                listenableWorker.A03 = true;
                listenableWorker.A01();
            } else {
                AbstractC16430qO.A00().A02(RunnableC16620qi.A0J, String.format("WorkSpec %s is already done. Not interrupting.", wrapper.A08), new Throwable[0]);
            }
            AbstractC16430qO.A00().A02(A0A, String.format("WorkerWrapper interrupted for %s", id), new Throwable[0]);
            return true;
        }
        AbstractC16430qO.A00().A02(A0A, String.format("WorkerWrapper could not be found for %s", id), new Throwable[0]);
        return false;
    }

    public final void A01() {
        synchronized (this.A08) {
            if (!(!this.A06.isEmpty())) {
                Intent intent = new Intent(this.A00, SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                this.A00.startService(intent);
            }
        }
    }

    public void A02(InterfaceC16530qZ executionListener) {
        synchronized (this.A08) {
            this.A09.add(executionListener);
        }
    }

    public void A03(InterfaceC16530qZ executionListener) {
        synchronized (this.A08) {
            this.A09.remove(executionListener);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0012, code lost:
        if (r3.A06.containsKey(r4) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A04(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A08
            monitor-enter(r2)
            java.util.Map r0 = r3.A05     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.containsKey(r4)     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L14
            java.util.Map r0 = r3.A06     // Catch: java.lang.Throwable -> L17
            boolean r1 = r0.containsKey(r4)     // Catch: java.lang.Throwable -> L17
            r0 = 0
            if (r1 == 0) goto L15
        L14:
            r0 = 1
        L15:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1VP.A04(java.lang.String):boolean");
    }

    public boolean A05(String id, C16510qW runtimeExtras) {
        synchronized (this.A08) {
            if (!A04(id)) {
                C16610qh c16610qh = new C16610qh(this.A00, this.A01, this.A03, this, this.A02, id);
                c16610qh.A07 = this.A04;
                if (runtimeExtras != null) {
                    c16610qh.A02 = runtimeExtras;
                }
                RunnableC16620qi runnableC16620qi = new RunnableC16620qi(c16610qh);
                C09610eQ c09610eQ = runnableC16620qi.A0B;
                c09610eQ.A5E(new Runnable(this, id, c09610eQ) { // from class: X.0qa
                    public InterfaceC16530qZ A00;
                    public InterfaceFutureC09630eS A01;
                    public String A02;

                    {
                        this.A00 = this;
                        this.A02 = id;
                        this.A01 = c09610eQ;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        boolean z;
                        try {
                            z = ((Boolean) this.A01.get()).booleanValue();
                        } catch (InterruptedException | ExecutionException unused) {
                            z = true;
                        }
                        this.A00.AK7(this.A02, z);
                    }
                }, ((C1WH) this.A03).A02);
                this.A05.put(id, runnableC16620qi);
                ((C1WH) this.A03).A01.execute(runnableC16620qi);
                AbstractC16430qO.A00().A02(A0A, String.format("%s: processing %s", "Processor", id), new Throwable[0]);
                return true;
            }
            AbstractC16430qO.A00().A02(A0A, String.format("Work %s is already enqueued for processing", id), new Throwable[0]);
            return false;
        }
    }

    @Override // X.InterfaceC16530qZ
    public void AK7(final String workSpecId, boolean needsReschedule) {
        synchronized (this.A08) {
            this.A05.remove(workSpecId);
            AbstractC16430qO.A00().A02(A0A, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), workSpecId, Boolean.valueOf(needsReschedule)), new Throwable[0]);
            for (InterfaceC16530qZ interfaceC16530qZ : this.A09) {
                interfaceC16530qZ.AK7(workSpecId, needsReschedule);
            }
        }
    }
}
