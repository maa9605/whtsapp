package X;

import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1wC  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42711wC {
    public static volatile C42711wC A08;
    public ScheduledFuture A00;
    public final C01B A01;
    public final AnonymousClass072 A02;
    public final C3A1 A03;
    public final RunnableC42731wE A04;
    public final RunnableC42731wE A05;
    public final C0GV A06;
    public final ScheduledThreadPoolExecutor A07;

    public C42711wC(AnonymousClass012 anonymousClass012, C05A c05a, AbstractC000600i abstractC000600i, C01B c01b, C0C9 c0c9, C0E9 c0e9, C013006h c013006h, AnonymousClass070 anonymousClass070, C0GV c0gv, AnonymousClass072 anonymousClass072, C26T c26t, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.A01 = c01b;
        this.A06 = c0gv;
        C3A1 c3a1 = new C3A1(this);
        this.A03 = c3a1;
        this.A04 = new RunnableC42731wE(anonymousClass012, c05a, abstractC000600i, c0c9, c0e9, c013006h, anonymousClass070, c0gv, c26t, c3a1, 100);
        this.A05 = new RunnableC42731wE(anonymousClass012, c05a, abstractC000600i, c0c9, c0e9, c013006h, anonymousClass070, c0gv, c26t, null, 0);
        this.A02 = anonymousClass072;
        this.A07 = scheduledThreadPoolExecutor;
    }

    public static C42711wC A00() {
        if (A08 == null) {
            synchronized (C42711wC.class) {
                if (A08 == null) {
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C05A A002 = C05A.A00();
                    AbstractC000600i A003 = AbstractC000600i.A00();
                    C01B A004 = C01B.A00();
                    C0C9 A005 = C0C9.A00();
                    C0E9 A006 = C0E9.A00();
                    C013006h A007 = C013006h.A00();
                    AnonymousClass070 A01 = AnonymousClass070.A01();
                    C0GV A008 = C0GV.A00();
                    AnonymousClass072 A009 = AnonymousClass072.A00();
                    C26T A0010 = C26T.A00();
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
                    scheduledThreadPoolExecutor.setKeepAliveTime(10L, TimeUnit.MILLISECONDS);
                    scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
                    A08 = new C42711wC(A00, A002, A003, A004, A005, A006, A007, A01, A008, A009, A0010, scheduledThreadPoolExecutor);
                }
            }
        }
        return A08;
    }

    public void A01() {
        if (this.A01.A0E(C01C.A0p)) {
            this.A07.execute(new RunnableEBaseShape2S0100000_I0_2(this, 32));
        }
    }

    public final synchronized void A02(long j, boolean z, RunnableC42731wE runnableC42731wE) {
        long j2 = 0;
        if (j != 0) {
            if (this.A02 != null) {
                j2 = Math.max(30000L, j);
            } else {
                throw null;
            }
        }
        ScheduledFuture scheduledFuture = this.A00;
        if (scheduledFuture != null && !scheduledFuture.isDone() && this.A00.getDelay(TimeUnit.MILLISECONDS) > j2 && !this.A00.cancel(false)) {
            Log.e("EphemeralDeletionManager/scheduleRunnable/unable to cancel future");
        }
        if (j2 < 86400000) {
            ScheduledFuture<?> schedule = this.A07.schedule(runnableC42731wE, j2, TimeUnit.MILLISECONDS);
            this.A00 = schedule;
            if (z) {
                try {
                    schedule.get();
                } catch (InterruptedException | ExecutionException e) {
                    Log.e("EphemeralDeletionManager/scheduleNextRun", e);
                }
            }
        }
    }

    public void A03(AbstractC005302j abstractC005302j, String str) {
        C0GV c0gv = this.A06;
        if (c0gv.A00 == -1) {
            c0gv.A00 = c0gv.A01.A05();
        }
        Map map = c0gv.A03;
        Set set = (Set) map.get(abstractC005302j);
        if (set == null) {
            set = new HashSet();
        }
        set.add(str);
        map.put(abstractC005302j, set);
    }

    public void A04(AbstractC005302j abstractC005302j, String str) {
        AnonymousClass092 A02;
        C0GV c0gv = this.A06;
        Map map = c0gv.A03;
        Set set = (Set) map.get(abstractC005302j);
        if (set != null) {
            set.remove(str);
            if (set.isEmpty()) {
                map.remove(abstractC005302j);
            }
        } else {
            StringBuilder sb = new StringBuilder("EphemeralSessionManager/null session: ");
            sb.append(abstractC005302j);
            Log.e(sb.toString());
        }
        if (map.isEmpty()) {
            c0gv.A00 = -1L;
        }
        if (abstractC005302j == null || ((A02 = c0gv.A02.A02(abstractC005302j)) != null && A02.A10())) {
            A01();
        }
    }
}
