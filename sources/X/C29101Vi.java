package X;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Vi  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C29101Vi implements InterfaceC16530qZ, InterfaceC16760qy, InterfaceC17190rh {
    public static final String A09 = AbstractC16430qO.A01("DelayMetCommandHandler");
    public PowerManager.WakeLock A01;
    public final int A03;
    public final Context A04;
    public final C29111Vj A05;
    public final C29131Vn A06;
    public final String A08;
    public boolean A02 = false;
    public int A00 = 0;
    public final Object A07 = new Object();

    public C29101Vi(Context context, int startId, String workSpecId, C29111Vj dispatcher) {
        this.A04 = context;
        this.A03 = startId;
        this.A05 = dispatcher;
        this.A08 = workSpecId;
        this.A06 = new C29131Vn(context, dispatcher.A08, this);
    }

    public final void A00() {
        synchronized (this.A07) {
            this.A06.A00();
            C17210rj c17210rj = this.A05.A07;
            String str = this.A08;
            c17210rj.A00(str);
            PowerManager.WakeLock wakeLock = this.A01;
            if (wakeLock != null && wakeLock.isHeld()) {
                AbstractC16430qO.A00().A02(A09, String.format("Releasing wakelock %s for WorkSpec %s", this.A01, str), new Throwable[0]);
                this.A01.release();
            }
        }
    }

    public final void A01() {
        synchronized (this.A07) {
            if (this.A00 < 2) {
                this.A00 = 2;
                AbstractC16430qO A00 = AbstractC16430qO.A00();
                String str = A09;
                String str2 = this.A08;
                A00.A02(str, String.format("Stopping work for WorkSpec %s", str2), new Throwable[0]);
                Context context = this.A04;
                Intent intent = new Intent(context, SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", str2);
                C29111Vj c29111Vj = this.A05;
                int i = this.A03;
                RunnableC16700qs runnableC16700qs = new RunnableC16700qs(c29111Vj, intent, i);
                Handler handler = c29111Vj.A03;
                handler.post(runnableC16700qs);
                if (c29111Vj.A04.A04(str2)) {
                    AbstractC16430qO.A00().A02(str, String.format("WorkSpec %s needs to be rescheduled", str2), new Throwable[0]);
                    Intent intent2 = new Intent(context, SystemAlarmService.class);
                    intent2.setAction("ACTION_SCHEDULE_WORK");
                    intent2.putExtra("KEY_WORKSPEC_ID", str2);
                    handler.post(new RunnableC16700qs(c29111Vj, intent2, i));
                } else {
                    AbstractC16430qO.A00().A02(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", str2), new Throwable[0]);
                }
            } else {
                AbstractC16430qO.A00().A02(A09, String.format("Already stopped work for %s", this.A08), new Throwable[0]);
            }
        }
    }

    @Override // X.InterfaceC16760qy
    public void AH3(List workSpecIds) {
        String str = this.A08;
        if (workSpecIds.contains(str)) {
            synchronized (this.A07) {
                if (this.A00 == 0) {
                    this.A00 = 1;
                    AbstractC16430qO.A00().A02(A09, String.format("onAllConstraintsMet for %s", str), new Throwable[0]);
                    C29111Vj c29111Vj = this.A05;
                    if (c29111Vj.A04.A05(str, null)) {
                        C17210rj c17210rj = c29111Vj.A07;
                        synchronized (c17210rj.A00) {
                            AbstractC16430qO.A00().A02(C17210rj.A05, String.format("Starting timer for %s", str), new Throwable[0]);
                            c17210rj.A00(str);
                            Runnable runnable = new Runnable(c17210rj, str) { // from class: X.0ri
                                public final C17210rj A00;
                                public final String A01;

                                {
                                    this.A00 = c17210rj;
                                    this.A01 = str;
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    C17210rj c17210rj2 = this.A00;
                                    synchronized (c17210rj2.A00) {
                                        Map map = c17210rj2.A02;
                                        String str2 = this.A01;
                                        if (((RunnableC17200ri) map.remove(str2)) != null) {
                                            InterfaceC17190rh interfaceC17190rh = (InterfaceC17190rh) c17210rj2.A01.remove(str2);
                                            if (interfaceC17190rh != null) {
                                                interfaceC17190rh.APc(str2);
                                            }
                                        } else {
                                            AbstractC16430qO.A00().A02("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", str2), new Throwable[0]);
                                        }
                                    }
                                }
                            };
                            c17210rj.A02.put(str, runnable);
                            c17210rj.A01.put(str, this);
                            c17210rj.A03.schedule(runnable, 600000L, TimeUnit.MILLISECONDS);
                        }
                    } else {
                        A00();
                    }
                } else {
                    AbstractC16430qO.A00().A02(A09, String.format("Already started work for %s", str), new Throwable[0]);
                }
            }
        }
    }

    @Override // X.InterfaceC16760qy
    public void AH4(List ignored) {
        A01();
    }

    @Override // X.InterfaceC16530qZ
    public void AK7(String workSpecId, boolean needsReschedule) {
        AbstractC16430qO.A00().A02(A09, String.format("onExecuted %s, %s", workSpecId, Boolean.valueOf(needsReschedule)), new Throwable[0]);
        A00();
        if (needsReschedule) {
            Context context = this.A04;
            String str = this.A08;
            Intent intent = new Intent(context, SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            intent.putExtra("KEY_WORKSPEC_ID", str);
            C29111Vj c29111Vj = this.A05;
            c29111Vj.A03.post(new RunnableC16700qs(c29111Vj, intent, this.A03));
        }
        if (this.A02) {
            Intent intent2 = new Intent(this.A04, SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            C29111Vj c29111Vj2 = this.A05;
            c29111Vj2.A03.post(new RunnableC16700qs(c29111Vj2, intent2, this.A03));
        }
    }

    @Override // X.InterfaceC17190rh
    public void APc(String workSpecId) {
        AbstractC16430qO.A00().A02(A09, String.format("Exceeded time limits on execution for %s", workSpecId), new Throwable[0]);
        A01();
    }
}
