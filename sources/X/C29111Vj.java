package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.1Vj */
/* loaded from: classes.dex */
public class C29111Vj implements InterfaceC16530qZ {
    public static final String A0A = AbstractC16430qO.A01("SystemAlarmDispatcher");
    public Intent A00;
    public InterfaceC16710qt A01;
    public final Context A02;
    public final Handler A03;
    public final C1VP A04;
    public final C0OP A05;
    public final C29091Vd A06;
    public final C17210rj A07;
    public final InterfaceC17300rs A08;
    public final List A09;

    public C29111Vj(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.A02 = applicationContext;
        this.A06 = new C29091Vd(applicationContext);
        this.A07 = new C17210rj();
        C0OP A00 = C0OP.A00(context);
        this.A05 = A00;
        C1VP c1vp = A00.A03;
        this.A04 = c1vp;
        this.A08 = A00.A06;
        c1vp.A02(this);
        this.A09 = new ArrayList();
        this.A00 = null;
        this.A03 = new Handler(Looper.getMainLooper());
    }

    public void A00() {
        AbstractC16430qO.A00().A02(A0A, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.A04.A03(this);
        ScheduledExecutorService scheduledExecutorService = this.A07.A03;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.A01 = null;
    }

    public final void A01() {
        if (this.A03.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void A02() {
        A01();
        PowerManager.WakeLock A00 = C17160re.A00(this.A02, "ProcessCommand");
        try {
            A00.acquire();
            InterfaceC17300rs interfaceC17300rs = this.A05.A06;
            ((C1WH) interfaceC17300rs).A01.execute(new Runnable() { // from class: X.0qr
                {
                    C29111Vj.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    Runnable runnable;
                    C29111Vj c29111Vj = C29111Vj.this;
                    List list = c29111Vj.A09;
                    synchronized (list) {
                        c29111Vj.A00 = (Intent) list.get(0);
                    }
                    Intent intent = c29111Vj.A00;
                    if (intent != null) {
                        String action = intent.getAction();
                        int intExtra = c29111Vj.A00.getIntExtra("KEY_START_ID", 0);
                        AbstractC16430qO A002 = AbstractC16430qO.A00();
                        String str = C29111Vj.A0A;
                        Integer valueOf = Integer.valueOf(intExtra);
                        A002.A02(str, String.format("Processing command %s, %s", c29111Vj.A00, valueOf), new Throwable[0]);
                        PowerManager.WakeLock A003 = C17160re.A00(c29111Vj.A02, String.format("%s (%s)", action, valueOf));
                        try {
                            AbstractC16430qO.A00().A02(str, String.format("Acquiring operation wake lock (%s) %s", action, A003), new Throwable[0]);
                            A003.acquire();
                            C29091Vd c29091Vd = c29111Vj.A06;
                            Intent intent2 = c29111Vj.A00;
                            String action2 = intent2.getAction();
                            if ("ACTION_CONSTRAINTS_CHANGED".equals(action2)) {
                                AbstractC16430qO.A00().A02(C29091Vd.A03, String.format("Handling constraints changed %s", intent2), new Throwable[0]);
                                C16680qp c16680qp = new C16680qp(c29091Vd.A00, intExtra, c29111Vj);
                                C29111Vj c29111Vj2 = c16680qp.A02;
                                List<C0OL> A05 = ((C1W8) c29111Vj2.A05.A04.A0B()).A05();
                                Context context = c16680qp.A01;
                                boolean z = false;
                                boolean z2 = false;
                                boolean z3 = false;
                                boolean z4 = false;
                                for (C0OL c0ol : A05) {
                                    C0OH c0oh = c0ol.A09;
                                    z |= c0oh.A04;
                                    z2 |= c0oh.A05;
                                    z3 |= c0oh.A07;
                                    z4 |= c0oh.A03 != C07j.NOT_REQUIRED;
                                    if (z && z2 && z3 && z4) {
                                        break;
                                    }
                                }
                                Intent intent3 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
                                intent3.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
                                intent3.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
                                context.sendBroadcast(intent3);
                                C29131Vn c29131Vn = c16680qp.A03;
                                c29131Vn.A01(A05);
                                ArrayList arrayList = (ArrayList) A05;
                                ArrayList arrayList2 = new ArrayList(arrayList.size());
                                long currentTimeMillis = System.currentTimeMillis();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    C0OL c0ol2 = (C0OL) it.next();
                                    String str2 = c0ol2.A0D;
                                    if (currentTimeMillis >= c0ol2.A00() && (!(!C0OH.A08.equals(c0ol2.A09)) || c29131Vn.A02(str2))) {
                                        arrayList2.add(c0ol2);
                                    }
                                }
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    String str3 = ((C0OL) it2.next()).A0D;
                                    Intent intent4 = new Intent(context, SystemAlarmService.class);
                                    intent4.setAction("ACTION_DELAY_MET");
                                    intent4.putExtra("KEY_WORKSPEC_ID", str3);
                                    AbstractC16430qO.A00().A02(C16680qp.A04, String.format("Creating a delay_met command for workSpec with id (%s)", str3), new Throwable[0]);
                                    c29111Vj2.A03.post(new RunnableC16700qs(c29111Vj2, intent4, c16680qp.A00));
                                }
                                c29131Vn.A00();
                            } else if ("ACTION_RESCHEDULE".equals(action2)) {
                                AbstractC16430qO.A00().A02(C29091Vd.A03, String.format("Handling reschedule %s, %s", intent2, valueOf), new Throwable[0]);
                                c29111Vj.A05.A04();
                            } else {
                                Bundle extras = intent2.getExtras();
                                String[] strArr = {"KEY_WORKSPEC_ID"};
                                if (extras != null && !extras.isEmpty() && extras.get(strArr[0]) != null) {
                                    if ("ACTION_SCHEDULE_WORK".equals(action2)) {
                                        String string = intent2.getExtras().getString("KEY_WORKSPEC_ID");
                                        AbstractC16430qO A004 = AbstractC16430qO.A00();
                                        String str4 = C29091Vd.A03;
                                        A004.A02(str4, String.format("Handling schedule work for %s", string), new Throwable[0]);
                                        C0OP c0op = c29111Vj.A05;
                                        WorkDatabase workDatabase = c0op.A04;
                                        workDatabase.A03();
                                        C0OL A02 = ((C1W8) workDatabase.A0B()).A02(string);
                                        if (A02 == null) {
                                            AbstractC16430qO A005 = AbstractC16430qO.A00();
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("Skipping scheduling ");
                                            sb.append(string);
                                            sb.append(" because it's no longer in the DB");
                                            A005.A05(str4, sb.toString(), new Throwable[0]);
                                        } else if (A02.A0C.A00()) {
                                            AbstractC16430qO A006 = AbstractC16430qO.A00();
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("Skipping scheduling ");
                                            sb2.append(string);
                                            sb2.append("because it is finished.");
                                            A006.A05(str4, sb2.toString(), new Throwable[0]);
                                        } else {
                                            long A007 = A02.A00();
                                            if (!(!C0OH.A08.equals(A02.A09))) {
                                                AbstractC16430qO.A00().A02(str4, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(A007)), new Throwable[0]);
                                                C16650ql.A00(c29091Vd.A00, c0op, string, A007);
                                            } else {
                                                AbstractC16430qO.A00().A02(str4, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(A007)), new Throwable[0]);
                                                Context context2 = c29091Vd.A00;
                                                C16650ql.A00(context2, c0op, string, A007);
                                                Intent intent5 = new Intent(context2, SystemAlarmService.class);
                                                intent5.setAction("ACTION_CONSTRAINTS_CHANGED");
                                                c29111Vj.A03.post(new RunnableC16700qs(c29111Vj, intent5, intExtra));
                                            }
                                            workDatabase.A05();
                                        }
                                        workDatabase.A04();
                                    } else if ("ACTION_DELAY_MET".equals(action2)) {
                                        Bundle extras2 = intent2.getExtras();
                                        synchronized (c29091Vd.A01) {
                                            String string2 = extras2.getString("KEY_WORKSPEC_ID");
                                            AbstractC16430qO A008 = AbstractC16430qO.A00();
                                            String str5 = C29091Vd.A03;
                                            A008.A02(str5, String.format("Handing delay met for %s", string2), new Throwable[0]);
                                            Map map = c29091Vd.A02;
                                            if (!map.containsKey(string2)) {
                                                C29101Vi c29101Vi = new C29101Vi(c29091Vd.A00, intExtra, string2, c29111Vj);
                                                map.put(string2, c29101Vi);
                                                Context context3 = c29101Vi.A04;
                                                String str6 = c29101Vi.A08;
                                                c29101Vi.A01 = C17160re.A00(context3, String.format("%s (%s)", str6, Integer.valueOf(c29101Vi.A03)));
                                                AbstractC16430qO A009 = AbstractC16430qO.A00();
                                                String str7 = C29101Vi.A09;
                                                A009.A02(str7, String.format("Acquiring wakelock %s for WorkSpec %s", c29101Vi.A01, str6), new Throwable[0]);
                                                c29101Vi.A01.acquire();
                                                C0OL A022 = ((C1W8) c29101Vi.A05.A05.A04.A0B()).A02(str6);
                                                if (A022 == null) {
                                                    c29101Vi.A01();
                                                } else {
                                                    boolean z5 = !C0OH.A08.equals(A022.A09);
                                                    c29101Vi.A02 = z5;
                                                    if (!z5) {
                                                        AbstractC16430qO.A00().A02(str7, String.format("No constraints for %s", str6), new Throwable[0]);
                                                        c29101Vi.AH3(Collections.singletonList(str6));
                                                    } else {
                                                        c29101Vi.A06.A01(Collections.singletonList(A022));
                                                    }
                                                }
                                            } else {
                                                AbstractC16430qO.A00().A02(str5, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string2), new Throwable[0]);
                                            }
                                        }
                                    } else if ("ACTION_STOP_WORK".equals(action2)) {
                                        String string3 = intent2.getExtras().getString("KEY_WORKSPEC_ID");
                                        AbstractC16430qO.A00().A02(C29091Vd.A03, String.format("Handing stopWork work for %s", string3), new Throwable[0]);
                                        C0OP c0op2 = c29111Vj.A05;
                                        c0op2.A05(string3);
                                        Context context4 = c29091Vd.A00;
                                        C29201Vv c29201Vv = (C29201Vv) c0op2.A04.A08();
                                        C16940rH A0010 = c29201Vv.A00(string3);
                                        if (A0010 != null) {
                                            C16650ql.A01(context4, string3, A0010.A00);
                                            AbstractC16430qO.A00().A02(C16650ql.A00, String.format("Removing SystemIdInfo for workSpecId (%s)", string3), new Throwable[0]);
                                            c29201Vv.A02(string3);
                                        }
                                        c29111Vj.AK7(string3, false);
                                    } else if (!"ACTION_EXECUTION_COMPLETED".equals(action2)) {
                                        AbstractC16430qO.A00().A05(C29091Vd.A03, String.format("Ignoring intent %s", intent2), new Throwable[0]);
                                    } else {
                                        Bundle extras3 = intent2.getExtras();
                                        String string4 = extras3.getString("KEY_WORKSPEC_ID");
                                        boolean z6 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
                                        AbstractC16430qO.A00().A02(C29091Vd.A03, String.format("Handling onExecutionCompleted %s, %s", intent2, valueOf), new Throwable[0]);
                                        c29091Vd.AK7(string4, z6);
                                    }
                                } else {
                                    AbstractC16430qO.A00().A03(C29091Vd.A03, String.format("Invalid request for %s, requires %s.", action2, "KEY_WORKSPEC_ID"), new Throwable[0]);
                                }
                            }
                            AbstractC16430qO.A00().A02(str, String.format("Releasing operation wake lock (%s) %s", action, A003), new Throwable[0]);
                            A003.release();
                            runnable = new Runnable(c29111Vj) { // from class: X.0qu
                                public final C29111Vj A00;

                                {
                                    this.A00 = c29111Vj;
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    boolean z7;
                                    boolean z8;
                                    C29111Vj c29111Vj3 = this.A00;
                                    if (c29111Vj3 != null) {
                                        AbstractC16430qO A0011 = AbstractC16430qO.A00();
                                        String str8 = C29111Vj.A0A;
                                        A0011.A02(str8, "Checking if commands are complete.", new Throwable[0]);
                                        c29111Vj3.A01();
                                        List list2 = c29111Vj3.A09;
                                        synchronized (list2) {
                                            if (c29111Vj3.A00 != null) {
                                                AbstractC16430qO.A00().A02(str8, String.format("Removing command %s", c29111Vj3.A00), new Throwable[0]);
                                                if (((Intent) list2.remove(0)).equals(c29111Vj3.A00)) {
                                                    c29111Vj3.A00 = null;
                                                } else {
                                                    throw new IllegalStateException("Dequeue-d command is not the first.");
                                                }
                                            }
                                            ExecutorC17120ra executorC17120ra = ((C1WH) c29111Vj3.A08).A01;
                                            C29091Vd c29091Vd2 = c29111Vj3.A06;
                                            synchronized (c29091Vd2.A01) {
                                                z7 = c29091Vd2.A02.isEmpty() ? false : true;
                                            }
                                            if (!z7 && list2.isEmpty()) {
                                                synchronized (executorC17120ra.A00) {
                                                    z8 = executorC17120ra.A01.isEmpty() ? false : true;
                                                }
                                                if (!z8) {
                                                    AbstractC16430qO.A00().A02(str8, "No more commands & intents.", new Throwable[0]);
                                                    InterfaceC16710qt interfaceC16710qt = c29111Vj3.A01;
                                                    if (interfaceC16710qt != null) {
                                                        SystemAlarmService systemAlarmService = (SystemAlarmService) interfaceC16710qt;
                                                        systemAlarmService.A01 = true;
                                                        AbstractC16430qO.A00().A02(SystemAlarmService.A02, "All commands completed in dispatcher", new Throwable[0]);
                                                        HashMap hashMap = new HashMap();
                                                        WeakHashMap weakHashMap = C17160re.A01;
                                                        synchronized (weakHashMap) {
                                                            hashMap.putAll(weakHashMap);
                                                        }
                                                        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
                                                            if (wakeLock != null && wakeLock.isHeld()) {
                                                                AbstractC16430qO.A00().A05(C17160re.A00, String.format("WakeLock held for %s", hashMap.get(wakeLock)), new Throwable[0]);
                                                            }
                                                        }
                                                        systemAlarmService.stopSelf();
                                                    }
                                                }
                                            }
                                            if (!list2.isEmpty()) {
                                                c29111Vj3.A02();
                                            }
                                        }
                                        return;
                                    }
                                    throw null;
                                }
                            };
                        } catch (Throwable th) {
                            try {
                                AbstractC16430qO.A00().A03(str, "Unexpected error in onHandleIntent", th);
                                AbstractC16430qO.A00().A02(str, String.format("Releasing operation wake lock (%s) %s", action, A003), new Throwable[0]);
                                A003.release();
                                runnable = new Runnable(c29111Vj) { // from class: X.0qu
                                    public final C29111Vj A00;

                                    {
                                        this.A00 = c29111Vj;
                                    }

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        boolean z7;
                                        boolean z8;
                                        C29111Vj c29111Vj3 = this.A00;
                                        if (c29111Vj3 != null) {
                                            AbstractC16430qO A0011 = AbstractC16430qO.A00();
                                            String str8 = C29111Vj.A0A;
                                            A0011.A02(str8, "Checking if commands are complete.", new Throwable[0]);
                                            c29111Vj3.A01();
                                            List list2 = c29111Vj3.A09;
                                            synchronized (list2) {
                                                if (c29111Vj3.A00 != null) {
                                                    AbstractC16430qO.A00().A02(str8, String.format("Removing command %s", c29111Vj3.A00), new Throwable[0]);
                                                    if (((Intent) list2.remove(0)).equals(c29111Vj3.A00)) {
                                                        c29111Vj3.A00 = null;
                                                    } else {
                                                        throw new IllegalStateException("Dequeue-d command is not the first.");
                                                    }
                                                }
                                                ExecutorC17120ra executorC17120ra = ((C1WH) c29111Vj3.A08).A01;
                                                C29091Vd c29091Vd2 = c29111Vj3.A06;
                                                synchronized (c29091Vd2.A01) {
                                                    z7 = c29091Vd2.A02.isEmpty() ? false : true;
                                                }
                                                if (!z7 && list2.isEmpty()) {
                                                    synchronized (executorC17120ra.A00) {
                                                        z8 = executorC17120ra.A01.isEmpty() ? false : true;
                                                    }
                                                    if (!z8) {
                                                        AbstractC16430qO.A00().A02(str8, "No more commands & intents.", new Throwable[0]);
                                                        InterfaceC16710qt interfaceC16710qt = c29111Vj3.A01;
                                                        if (interfaceC16710qt != null) {
                                                            SystemAlarmService systemAlarmService = (SystemAlarmService) interfaceC16710qt;
                                                            systemAlarmService.A01 = true;
                                                            AbstractC16430qO.A00().A02(SystemAlarmService.A02, "All commands completed in dispatcher", new Throwable[0]);
                                                            HashMap hashMap = new HashMap();
                                                            WeakHashMap weakHashMap = C17160re.A01;
                                                            synchronized (weakHashMap) {
                                                                hashMap.putAll(weakHashMap);
                                                            }
                                                            for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
                                                                if (wakeLock != null && wakeLock.isHeld()) {
                                                                    AbstractC16430qO.A00().A05(C17160re.A00, String.format("WakeLock held for %s", hashMap.get(wakeLock)), new Throwable[0]);
                                                                }
                                                            }
                                                            systemAlarmService.stopSelf();
                                                        }
                                                    }
                                                }
                                                if (!list2.isEmpty()) {
                                                    c29111Vj3.A02();
                                                }
                                            }
                                            return;
                                        }
                                        throw null;
                                    }
                                };
                            } catch (Throwable th2) {
                                AbstractC16430qO.A00().A02(str, String.format("Releasing operation wake lock (%s) %s", action, A003), new Throwable[0]);
                                A003.release();
                                c29111Vj.A03.post(new Runnable(c29111Vj) { // from class: X.0qu
                                    public final C29111Vj A00;

                                    {
                                        this.A00 = c29111Vj;
                                    }

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        boolean z7;
                                        boolean z8;
                                        C29111Vj c29111Vj3 = this.A00;
                                        if (c29111Vj3 != null) {
                                            AbstractC16430qO A0011 = AbstractC16430qO.A00();
                                            String str8 = C29111Vj.A0A;
                                            A0011.A02(str8, "Checking if commands are complete.", new Throwable[0]);
                                            c29111Vj3.A01();
                                            List list2 = c29111Vj3.A09;
                                            synchronized (list2) {
                                                if (c29111Vj3.A00 != null) {
                                                    AbstractC16430qO.A00().A02(str8, String.format("Removing command %s", c29111Vj3.A00), new Throwable[0]);
                                                    if (((Intent) list2.remove(0)).equals(c29111Vj3.A00)) {
                                                        c29111Vj3.A00 = null;
                                                    } else {
                                                        throw new IllegalStateException("Dequeue-d command is not the first.");
                                                    }
                                                }
                                                ExecutorC17120ra executorC17120ra = ((C1WH) c29111Vj3.A08).A01;
                                                C29091Vd c29091Vd2 = c29111Vj3.A06;
                                                synchronized (c29091Vd2.A01) {
                                                    z7 = c29091Vd2.A02.isEmpty() ? false : true;
                                                }
                                                if (!z7 && list2.isEmpty()) {
                                                    synchronized (executorC17120ra.A00) {
                                                        z8 = executorC17120ra.A01.isEmpty() ? false : true;
                                                    }
                                                    if (!z8) {
                                                        AbstractC16430qO.A00().A02(str8, "No more commands & intents.", new Throwable[0]);
                                                        InterfaceC16710qt interfaceC16710qt = c29111Vj3.A01;
                                                        if (interfaceC16710qt != null) {
                                                            SystemAlarmService systemAlarmService = (SystemAlarmService) interfaceC16710qt;
                                                            systemAlarmService.A01 = true;
                                                            AbstractC16430qO.A00().A02(SystemAlarmService.A02, "All commands completed in dispatcher", new Throwable[0]);
                                                            HashMap hashMap = new HashMap();
                                                            WeakHashMap weakHashMap = C17160re.A01;
                                                            synchronized (weakHashMap) {
                                                                hashMap.putAll(weakHashMap);
                                                            }
                                                            for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
                                                                if (wakeLock != null && wakeLock.isHeld()) {
                                                                    AbstractC16430qO.A00().A05(C17160re.A00, String.format("WakeLock held for %s", hashMap.get(wakeLock)), new Throwable[0]);
                                                                }
                                                            }
                                                            systemAlarmService.stopSelf();
                                                        }
                                                    }
                                                }
                                                if (!list2.isEmpty()) {
                                                    c29111Vj3.A02();
                                                }
                                            }
                                            return;
                                        }
                                        throw null;
                                    }
                                });
                                throw th2;
                            }
                        }
                        c29111Vj.A03.post(runnable);
                    }
                }
            });
        } finally {
            A00.release();
        }
    }

    public void A03(final Intent intent, final int startId) {
        AbstractC16430qO A00 = AbstractC16430qO.A00();
        String str = A0A;
        A00.A02(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(startId)), new Throwable[0]);
        A01();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            AbstractC16430qO.A00().A05(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            A01();
            List<Intent> list = this.A09;
            synchronized (list) {
                for (Intent intent2 : list) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(intent2.getAction())) {
                        return;
                    }
                }
            }
        }
        intent.putExtra("KEY_START_ID", startId);
        List list2 = this.A09;
        synchronized (list2) {
            boolean z = list2.isEmpty() ? false : true;
            list2.add(intent);
            if (!z) {
                A02();
            }
        }
    }

    @Override // X.InterfaceC16530qZ
    public void AK7(String workSpecId, boolean needsReschedule) {
        Intent intent = new Intent(this.A02, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", workSpecId);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", needsReschedule);
        this.A03.post(new RunnableC16700qs(this, intent, 0));
    }
}
