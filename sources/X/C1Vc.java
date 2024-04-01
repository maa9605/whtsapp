package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1Vc */
/* loaded from: classes.dex */
public class C1Vc implements InterfaceC16550qb, InterfaceC16530qZ, InterfaceC16760qy {
    public static final String A08 = AbstractC16430qO.A01("GreedyScheduler");
    public C16640qk A00;
    public Boolean A01;
    public boolean A02;
    public final Context A03;
    public final C0OP A04;
    public final C29131Vn A05;
    public final Set A07 = new HashSet();
    public final Object A06 = new Object();

    @Override // X.InterfaceC16550qb
    public boolean AET() {
        return false;
    }

    public C1Vc(Context context, C01e configuration, InterfaceC17300rs taskExecutor, C0OP workManagerImpl) {
        this.A03 = context;
        this.A04 = workManagerImpl;
        this.A05 = new C29131Vn(context, taskExecutor, this);
        this.A00 = new C16640qk(this, configuration.A06);
    }

    @Override // X.InterfaceC16550qb
    public void A5z(String workSpecId) {
        Runnable runnable;
        Boolean bool = this.A01;
        if (bool == null) {
            bool = Boolean.valueOf(C17100rY.A00(this.A03));
            this.A01 = bool;
        }
        if (!bool.booleanValue()) {
            AbstractC16430qO.A00().A04(A08, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.A02) {
            this.A04.A03.A02(this);
            this.A02 = true;
        }
        AbstractC16430qO.A00().A02(A08, String.format("Cancelling work ID %s", workSpecId), new Throwable[0]);
        C16640qk c16640qk = this.A00;
        if (c16640qk != null && (runnable = (Runnable) c16640qk.A02.remove(workSpecId)) != null) {
            c16640qk.A00.A00.removeCallbacks(runnable);
        }
        this.A04.A05(workSpecId);
    }

    @Override // X.InterfaceC16760qy
    public void AH3(List workSpecIds) {
        Iterator it = workSpecIds.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC16430qO.A00().A02(A08, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            C0OP c0op = this.A04;
            ((C1WH) c0op.A06).A01.execute(new RunnableC17130rb(c0op, str, null));
        }
    }

    @Override // X.InterfaceC16760qy
    public void AH4(List workSpecIds) {
        Iterator it = workSpecIds.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC16430qO.A00().A02(A08, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.A04.A05(str);
        }
    }

    @Override // X.InterfaceC16530qZ
    public void AK7(String workSpecId, boolean needsReschedule) {
        synchronized (this.A06) {
            Set set = this.A07;
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0OL c0ol = (C0OL) it.next();
                if (c0ol.A0D.equals(workSpecId)) {
                    AbstractC16430qO.A00().A02(A08, String.format("Stopping tracking for %s", workSpecId), new Throwable[0]);
                    set.remove(c0ol);
                    this.A05.A01(set);
                    break;
                }
            }
        }
    }

    @Override // X.InterfaceC16550qb
    public void ASD(C0OL... workSpecs) {
        Boolean bool = this.A01;
        if (bool == null) {
            bool = Boolean.valueOf(C17100rY.A00(this.A03));
            this.A01 = bool;
        }
        if (!bool.booleanValue()) {
            AbstractC16430qO.A00().A04(A08, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.A02) {
            this.A04.A03.A02(this);
            this.A02 = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (final C0OL c0ol : workSpecs) {
            long A00 = c0ol.A00();
            long currentTimeMillis = System.currentTimeMillis();
            if (c0ol.A0C == C07M.ENQUEUED) {
                if (currentTimeMillis < A00) {
                    final C16640qk c16640qk = this.A00;
                    if (c16640qk != null) {
                        Runnable runnable = (Runnable) c16640qk.A02.remove(c0ol.A0D);
                        if (runnable != null) {
                            c16640qk.A00.A00.removeCallbacks(runnable);
                        }
                        Runnable runnable2 = new Runnable() { // from class: X.0qj
                            @Override // java.lang.Runnable
                            public void run() {
                                AbstractC16430qO A002 = AbstractC16430qO.A00();
                                String str = C16640qk.A03;
                                C0OL c0ol2 = c0ol;
                                A002.A02(str, String.format("Scheduling work %s", c0ol2.A0D), new Throwable[0]);
                                c16640qk.A01.ASD(c0ol2);
                            }
                        };
                        c16640qk.A02.put(c0ol.A0D, runnable2);
                        c16640qk.A00.A00.postDelayed(runnable2, c0ol.A00() - System.currentTimeMillis());
                    }
                } else if (!C0OH.A08.equals(c0ol.A09)) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 23 && c0ol.A09.A06) {
                        AbstractC16430qO.A00().A02(A08, String.format("Ignoring WorkSpec %s, Requires device idle.", c0ol), new Throwable[0]);
                    } else if (i >= 24 && c0ol.A09.A02.A00.size() > 0) {
                        AbstractC16430qO.A00().A02(A08, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", c0ol), new Throwable[0]);
                    } else {
                        hashSet.add(c0ol);
                        hashSet2.add(c0ol.A0D);
                    }
                } else {
                    AbstractC16430qO.A00().A02(A08, String.format("Starting work for %s", c0ol.A0D), new Throwable[0]);
                    C0OP c0op = this.A04;
                    ((C1WH) c0op.A06).A01.execute(new RunnableC17130rb(c0op, c0ol.A0D, null));
                }
            }
        }
        synchronized (this.A06) {
            if (!hashSet.isEmpty()) {
                AbstractC16430qO.A00().A02(A08, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                Set set = this.A07;
                set.addAll(hashSet);
                this.A05.A01(set);
            }
        }
    }
}
