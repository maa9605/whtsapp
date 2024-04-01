package X;

import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: X.0qi */
/* loaded from: classes.dex */
public class RunnableC16620qi implements Runnable {
    public static final String A0J = AbstractC16430qO.A01("WorkerWrapper");
    public Context A00;
    public C01e A01;
    public C16510qW A04;
    public WorkDatabase A05;
    public InterfaceC16840r7 A06;
    public InterfaceC16910rE A07;
    public C0OL A08;
    public InterfaceC17010rO A09;
    public InterfaceC17030rQ A0A;
    public InterfaceC17300rs A0C;
    public String A0E;
    public String A0F;
    public List A0G;
    public List A0H;
    public volatile boolean A0I;
    public AbstractC09650eU A02 = new C1VE();
    public C09610eQ A0B = new C09610eQ();
    public InterfaceFutureC09630eS A0D = null;
    public ListenableWorker A03 = null;

    public RunnableC16620qi(C16610qh builder) {
        this.A00 = builder.A00;
        this.A0C = builder.A05;
        this.A06 = builder.A04;
        this.A0F = builder.A06;
        this.A0G = builder.A07;
        this.A04 = builder.A02;
        this.A01 = builder.A01;
        WorkDatabase workDatabase = builder.A03;
        this.A05 = workDatabase;
        this.A09 = workDatabase.A0B();
        this.A07 = this.A05.A06();
        this.A0A = this.A05.A0C();
    }

    public void A00() {
        if (!A06()) {
            this.A05.A03();
            try {
                C07M A01 = ((C1W8) this.A09).A01(this.A0F);
                InterfaceC16980rL A0A = this.A05.A0A();
                String str = this.A0F;
                C29241Vz c29241Vz = (C29241Vz) A0A;
                AbstractC15540ov abstractC15540ov = c29241Vz.A00;
                abstractC15540ov.A02();
                AbstractC15570oy abstractC15570oy = c29241Vz.A01;
                C38621oi A00 = abstractC15570oy.A00();
                if (str == null) {
                    ((C28961Up) A00).A00.bindNull(1);
                } else {
                    ((C28961Up) A00).A00.bindString(1, str);
                }
                abstractC15540ov.A03();
                A00.A00.executeUpdateDelete();
                abstractC15540ov.A05();
                abstractC15540ov.A04();
                if (A00 == abstractC15570oy.A02) {
                    abstractC15570oy.A01.set(false);
                }
                if (A01 != null) {
                    if (A01 == C07M.RUNNING) {
                        AbstractC09650eU abstractC09650eU = this.A02;
                        if (abstractC09650eU instanceof C1VF) {
                            AbstractC16430qO A002 = AbstractC16430qO.A00();
                            String str2 = A0J;
                            A002.A04(str2, String.format("Worker result SUCCESS for %s", this.A0E), new Throwable[0]);
                            if (this.A08.A04 != 0) {
                                A03();
                            } else {
                                this.A05.A03();
                                ((C1W8) this.A09).A09(C07M.SUCCEEDED, this.A0F);
                                ((C1W8) this.A09).A0D(this.A0F, ((C1VF) this.A02).A00);
                                long currentTimeMillis = System.currentTimeMillis();
                                Iterator it = ((ArrayList) ((C1Vs) this.A07).A00(this.A0F)).iterator();
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    if (((C1W8) this.A09).A01(str3) == C07M.BLOCKED) {
                                        C1Vs c1Vs = (C1Vs) this.A07;
                                        C28911Uj A003 = C28911Uj.A00("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
                                        if (str3 == null) {
                                            A003.A03[1] = 1;
                                        } else {
                                            A003.A02(1, str3);
                                        }
                                        AbstractC15540ov abstractC15540ov2 = c1Vs.A01;
                                        abstractC15540ov2.A02();
                                        boolean z = false;
                                        Cursor A004 = C15600p1.A00(abstractC15540ov2, A003, false);
                                        try {
                                            if (A004.moveToFirst()) {
                                                z = A004.getInt(0) != 0;
                                            }
                                            if (z) {
                                                AbstractC16430qO.A00().A04(str2, String.format("Setting status to enqueued for %s", str3), new Throwable[0]);
                                                ((C1W8) this.A09).A09(C07M.ENQUEUED, str3);
                                                ((C1W8) this.A09).A0C(str3, currentTimeMillis);
                                            }
                                        } finally {
                                            A004.close();
                                            A003.A01();
                                        }
                                    }
                                }
                                this.A05.A05();
                                this.A05.A04();
                                A05(false);
                            }
                        } else if (abstractC09650eU instanceof C09640eT) {
                            AbstractC16430qO.A00().A04(A0J, String.format("Worker result RETRY for %s", this.A0E), new Throwable[0]);
                            A02();
                        } else {
                            AbstractC16430qO.A00().A04(A0J, String.format("Worker result FAILURE for %s", this.A0E), new Throwable[0]);
                            if (this.A08.A04 != 0) {
                                A03();
                            } else {
                                A01();
                            }
                        }
                    } else if (!A01.A00()) {
                        A02();
                    }
                } else {
                    A05(false);
                }
                this.A05.A05();
            } finally {
                this.A05.A04();
            }
        }
        List<InterfaceC16550qb> list = this.A0G;
        if (list != null) {
            for (InterfaceC16550qb interfaceC16550qb : list) {
                interfaceC16550qb.A5z(this.A0F);
            }
            C16560qc.A01(this.A05, this.A0G);
        }
    }

    public void A01() {
        this.A05.A03();
        try {
            String str = this.A0F;
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (!linkedList.isEmpty()) {
                String str2 = (String) linkedList.remove();
                if (((C1W8) this.A09).A01(str2) != C07M.CANCELLED) {
                    ((C1W8) this.A09).A09(C07M.FAILED, str2);
                }
                linkedList.addAll(((C1Vs) this.A07).A00(str2));
            }
            ((C1W8) this.A09).A0D(this.A0F, ((C1VE) this.A02).A00);
            this.A05.A05();
        } finally {
            this.A05.A04();
            A05(false);
        }
    }

    public final void A02() {
        this.A05.A03();
        try {
            ((C1W8) this.A09).A09(C07M.ENQUEUED, this.A0F);
            ((C1W8) this.A09).A0C(this.A0F, System.currentTimeMillis());
            ((C1W8) this.A09).A0B(this.A0F, -1L);
            this.A05.A05();
        } finally {
            this.A05.A04();
            A05(true);
        }
    }

    public final void A03() {
        this.A05.A03();
        try {
            ((C1W8) this.A09).A0C(this.A0F, System.currentTimeMillis());
            ((C1W8) this.A09).A09(C07M.ENQUEUED, this.A0F);
            InterfaceC17010rO interfaceC17010rO = this.A09;
            String str = this.A0F;
            C1W8 c1w8 = (C1W8) interfaceC17010rO;
            AbstractC15540ov abstractC15540ov = c1w8.A01;
            abstractC15540ov.A02();
            AbstractC15570oy abstractC15570oy = c1w8.A06;
            C38621oi A00 = abstractC15570oy.A00();
            if (str == null) {
                ((C28961Up) A00).A00.bindNull(1);
            } else {
                ((C28961Up) A00).A00.bindString(1, str);
            }
            abstractC15540ov.A03();
            A00.A00.executeUpdateDelete();
            abstractC15540ov.A05();
            abstractC15540ov.A04();
            if (A00 == abstractC15570oy.A02) {
                abstractC15570oy.A01.set(false);
            }
            ((C1W8) this.A09).A0B(this.A0F, -1L);
            this.A05.A05();
        } finally {
            this.A05.A04();
            A05(false);
        }
    }

    public final void A04() {
        C07M A01 = ((C1W8) this.A09).A01(this.A0F);
        if (A01 == C07M.RUNNING) {
            AbstractC16430qO.A00().A02(A0J, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.A0F), new Throwable[0]);
            A05(true);
            return;
        }
        AbstractC16430qO.A00().A02(A0J, String.format("Status for %s is %s; not doing any work", this.A0F, A01), new Throwable[0]);
        A05(false);
    }

    public final void A05(final boolean needsReschedule) {
        ListenableWorker listenableWorker;
        this.A05.A03();
        try {
            C1W8 c1w8 = (C1W8) this.A05.A0B();
            C28911Uj A00 = C28911Uj.A00("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
            AbstractC15540ov abstractC15540ov = c1w8.A01;
            abstractC15540ov.A02();
            Cursor A002 = C15600p1.A00(abstractC15540ov, A00, false);
            ArrayList arrayList = new ArrayList(A002.getCount());
            while (A002.moveToNext()) {
                arrayList.add(A002.getString(0));
            }
            A002.close();
            A00.A01();
            if (arrayList.isEmpty()) {
                C17080rW.A00(this.A00, RescheduleReceiver.class, false);
            }
            if (needsReschedule) {
                ((C1W8) this.A09).A09(C07M.ENQUEUED, this.A0F);
                ((C1W8) this.A09).A0B(this.A0F, -1L);
            }
            if (this.A08 != null && (listenableWorker = this.A03) != null && listenableWorker.A02()) {
                InterfaceC16840r7 interfaceC16840r7 = this.A06;
                String str = this.A0F;
                C1VP c1vp = (C1VP) interfaceC16840r7;
                synchronized (c1vp.A08) {
                    c1vp.A06.remove(str);
                    c1vp.A01();
                }
            }
            this.A05.A05();
            this.A05.A04();
            this.A0B.A08(Boolean.valueOf(needsReschedule));
        } catch (Throwable th) {
            this.A05.A04();
            throw th;
        }
    }

    public final boolean A06() {
        if (this.A0I) {
            AbstractC16430qO.A00().A02(A0J, String.format("Work interrupted for %s", this.A0E), new Throwable[0]);
            C07M A01 = ((C1W8) this.A09).A01(this.A0F);
            if (A01 == null) {
                A05(false);
                return true;
            }
            A05(!A01.A00());
            return true;
        }
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0OF A00;
        boolean z;
        List<String> A002 = ((C1W9) this.A0A).A00(this.A0F);
        this.A0H = A002;
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.A0F);
        sb.append(", tags={ ");
        boolean z2 = true;
        for (String str : A002) {
            if (z2) {
                z2 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        this.A0E = sb.toString();
        C07M c07m = C07M.ENQUEUED;
        if (!A06()) {
            this.A05.A03();
            try {
                C0OL A02 = ((C1W8) this.A09).A02(this.A0F);
                this.A08 = A02;
                if (A02 == null) {
                    AbstractC16430qO.A00().A03(A0J, String.format("Didn't find WorkSpec for id %s", this.A0F), new Throwable[0]);
                    A05(false);
                    this.A05.A05();
                } else {
                    C07M c07m2 = A02.A0C;
                    if (c07m2 != c07m) {
                        A04();
                        this.A05.A05();
                        AbstractC16430qO.A00().A02(A0J, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.A08.A0F), new Throwable[0]);
                    } else {
                        if ((A02.A04 != 0) || (c07m2 == c07m && A02.A00 > 0)) {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (A02.A06 != 0 && currentTimeMillis < A02.A00()) {
                                AbstractC16430qO.A00().A02(A0J, String.format("Delaying execution for %s because it is being executed before schedule.", this.A08.A0F), new Throwable[0]);
                                A05(true);
                                this.A05.A05();
                            }
                        }
                        this.A05.A05();
                        this.A05.A04();
                        C0OL c0ol = this.A08;
                        if (c0ol.A04 != 0) {
                            A00 = c0ol.A0A;
                        } else {
                            C1VD c1vd = this.A01.A04;
                            String str2 = c0ol.A0E;
                            if (c1vd != null) {
                                try {
                                    AbstractC16420qN abstractC16420qN = (AbstractC16420qN) Class.forName(str2).newInstance();
                                    if (abstractC16420qN != null) {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(this.A08.A0A);
                                        InterfaceC17010rO interfaceC17010rO = this.A09;
                                        String str3 = this.A0F;
                                        C1W8 c1w8 = (C1W8) interfaceC17010rO;
                                        if (c1w8 != null) {
                                            C28911Uj A003 = C28911Uj.A00("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
                                            if (str3 == null) {
                                                A003.A03[1] = 1;
                                            } else {
                                                A003.A02(1, str3);
                                            }
                                            AbstractC15540ov abstractC15540ov = c1w8.A01;
                                            abstractC15540ov.A02();
                                            Cursor A004 = C15600p1.A00(abstractC15540ov, A003, false);
                                            try {
                                                ArrayList arrayList2 = new ArrayList(A004.getCount());
                                                while (A004.moveToNext()) {
                                                    arrayList2.add(C0OF.A00(A004.getBlob(0)));
                                                }
                                                A004.close();
                                                A003.A01();
                                                arrayList.addAll(arrayList2);
                                                A00 = abstractC16420qN.A00(arrayList);
                                            } catch (Throwable th) {
                                                A004.close();
                                                A003.A01();
                                                throw th;
                                            }
                                        } else {
                                            throw null;
                                        }
                                    }
                                } catch (Exception e) {
                                    AbstractC16430qO.A00().A03(AbstractC16420qN.A00, C000200d.A0H("Trouble instantiating + ", str2), e);
                                }
                                AbstractC16430qO.A00().A03(A0J, String.format("Could not create Input Merger %s", this.A08.A0E), new Throwable[0]);
                                A01();
                                return;
                            }
                            throw null;
                        }
                        UUID fromString = UUID.fromString(this.A0F);
                        List list = this.A0H;
                        int i = this.A08.A00;
                        C01e c01e = this.A01;
                        Executor executor = c01e.A07;
                        AbstractC16500qV abstractC16500qV = c01e.A05;
                        WorkDatabase workDatabase = this.A05;
                        new InterfaceC16460qR() { // from class: X.1WE
                            static {
                                AbstractC16430qO.A01("WorkProgressUpdater");
                            }
                        };
                        new Object(workDatabase) { // from class: X.0rf
                            {
                                workDatabase.A0B();
                            }
                        };
                        WorkerParameters workerParameters = new WorkerParameters(fromString, A00, list, i, executor, abstractC16500qV);
                        ListenableWorker listenableWorker = this.A03;
                        if (listenableWorker == null) {
                            listenableWorker = this.A01.A05.A00(this.A00, this.A08.A0F, workerParameters);
                            this.A03 = listenableWorker;
                        }
                        if (listenableWorker == null) {
                            AbstractC16430qO.A00().A03(A0J, String.format("Could not create Worker %s", this.A08.A0F), new Throwable[0]);
                            A01();
                        } else if (listenableWorker.A02) {
                            AbstractC16430qO.A00().A03(A0J, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.A08.A0F), new Throwable[0]);
                            A01();
                        } else {
                            listenableWorker.A02 = true;
                            this.A05.A03();
                            try {
                                if (((C1W8) this.A09).A01(this.A0F) == c07m) {
                                    z = true;
                                    ((C1W8) this.A09).A09(C07M.RUNNING, this.A0F);
                                    InterfaceC17010rO interfaceC17010rO2 = this.A09;
                                    String str4 = this.A0F;
                                    C1W8 c1w82 = (C1W8) interfaceC17010rO2;
                                    AbstractC15540ov abstractC15540ov2 = c1w82.A01;
                                    abstractC15540ov2.A02();
                                    AbstractC15570oy abstractC15570oy = c1w82.A03;
                                    C38621oi A005 = abstractC15570oy.A00();
                                    if (str4 == null) {
                                        ((C28961Up) A005).A00.bindNull(1);
                                    } else {
                                        ((C28961Up) A005).A00.bindString(1, str4);
                                    }
                                    abstractC15540ov2.A03();
                                    A005.A00.executeUpdateDelete();
                                    abstractC15540ov2.A05();
                                    abstractC15540ov2.A04();
                                    if (A005 == abstractC15570oy.A02) {
                                        abstractC15570oy.A01.set(false);
                                    }
                                } else {
                                    z = false;
                                }
                                this.A05.A05();
                                if (z) {
                                    if (!A06()) {
                                        final C09610eQ c09610eQ = new C09610eQ();
                                        ((C1WH) this.A0C).A02.execute(new Runnable() { // from class: X.0qf
                                            {
                                                RunnableC16620qi.this = this;
                                            }

                                            @Override // java.lang.Runnable
                                            public void run() {
                                                try {
                                                    AbstractC16430qO A006 = AbstractC16430qO.A00();
                                                    String str5 = RunnableC16620qi.A0J;
                                                    RunnableC16620qi runnableC16620qi = RunnableC16620qi.this;
                                                    A006.A02(str5, String.format("Starting work for %s", runnableC16620qi.A08.A0F), new Throwable[0]);
                                                    InterfaceFutureC09630eS A007 = runnableC16620qi.A03.A00();
                                                    runnableC16620qi.A0D = A007;
                                                    c09610eQ.A07(A007);
                                                } catch (Throwable th2) {
                                                    c09610eQ.A09(th2);
                                                }
                                            }
                                        });
                                        final String str5 = this.A0E;
                                        c09610eQ.A5E(new Runnable() { // from class: X.0qg
                                            {
                                                RunnableC16620qi.this = this;
                                            }

                                            @Override // java.lang.Runnable
                                            public void run() {
                                                try {
                                                    try {
                                                        AbstractC09650eU abstractC09650eU = (AbstractC09650eU) c09610eQ.get();
                                                        if (abstractC09650eU == null) {
                                                            AbstractC16430qO.A00().A03(RunnableC16620qi.A0J, String.format("%s returned a null result. Treating it as a failure.", RunnableC16620qi.this.A08.A0F), new Throwable[0]);
                                                        } else {
                                                            AbstractC16430qO A006 = AbstractC16430qO.A00();
                                                            String str6 = RunnableC16620qi.A0J;
                                                            RunnableC16620qi runnableC16620qi = RunnableC16620qi.this;
                                                            A006.A02(str6, String.format("%s returned a %s result.", runnableC16620qi.A08.A0F, abstractC09650eU), new Throwable[0]);
                                                            runnableC16620qi.A02 = abstractC09650eU;
                                                        }
                                                    } catch (InterruptedException e2) {
                                                        e = e2;
                                                        AbstractC16430qO.A00().A03(RunnableC16620qi.A0J, String.format("%s failed because it threw an exception/error", str5), e);
                                                    } catch (CancellationException e3) {
                                                        AbstractC16430qO.A00().A04(RunnableC16620qi.A0J, String.format("%s was cancelled", str5), e3);
                                                    } catch (ExecutionException e4) {
                                                        e = e4;
                                                        AbstractC16430qO.A00().A03(RunnableC16620qi.A0J, String.format("%s failed because it threw an exception/error", str5), e);
                                                    }
                                                } finally {
                                                    RunnableC16620qi.this.A00();
                                                }
                                            }
                                        }, ((C1WH) this.A0C).A01);
                                        return;
                                    }
                                    return;
                                }
                                A04();
                            } finally {
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }
}
