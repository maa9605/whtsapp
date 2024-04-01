package X;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import android.view.Window;
import com.whatsapp.Conversation;
import com.whatsapp.Main;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0Oi  reason: invalid class name */
/* loaded from: classes.dex */
public class C0Oi implements Application.ActivityLifecycleCallbacks {
    public static volatile C0Oi A0L;
    public boolean A01;
    public final C03020Dv A03;
    public final C0RA A04;
    public final C018508q A05;
    public final C005002g A06;
    public final C03170Ep A07;
    public final C470029d A08;
    public final C011605s A09;
    public final C02E A0A;
    public final C002601h A0B;
    public final C0HA A0C;
    public final AnonymousClass011 A0D;
    public final C2F7 A0E;
    public final C40291rx A0F;
    public final C2F8 A0G;
    public final C01V A0H;
    public final C2F9 A0I;
    public final C41901uh A0J;
    public final C47222Aj A0K;
    public boolean A02 = true;
    public int A00 = 0;

    public C0Oi(C011605s c011605s, C018508q c018508q, C2F7 c2f7, C005002g c005002g, AnonymousClass011 anonymousClass011, C03170Ep c03170Ep, C470029d c470029d, C40291rx c40291rx, C01V c01v, C02E c02e, C47222Aj c47222Aj, C2F8 c2f8, C0HA c0ha, C2F9 c2f9, C03020Dv c03020Dv, C0RA c0ra, C41901uh c41901uh, C002601h c002601h) {
        this.A09 = c011605s;
        this.A05 = c018508q;
        this.A0E = c2f7;
        this.A06 = c005002g;
        this.A0D = anonymousClass011;
        this.A07 = c03170Ep;
        this.A08 = c470029d;
        this.A0F = c40291rx;
        this.A0H = c01v;
        this.A0A = c02e;
        this.A0K = c47222Aj;
        this.A0G = c2f8;
        this.A0C = c0ha;
        this.A0I = c2f9;
        this.A03 = c03020Dv;
        this.A04 = c0ra;
        this.A0J = c41901uh;
        this.A0B = c002601h;
    }

    public static C0Oi A00() {
        if (A0L == null) {
            synchronized (C0Oi.class) {
                if (A0L == null) {
                    C011605s A00 = C011605s.A00();
                    C018508q A002 = C018508q.A00();
                    if (C2F7.A00 == null) {
                        synchronized (C2F7.class) {
                            if (C2F7.A00 == null) {
                                C2F7.A00 = new C2F7();
                            }
                        }
                    }
                    C2F7 c2f7 = C2F7.A00;
                    C005002g A003 = C005002g.A00();
                    AnonymousClass011 A004 = AnonymousClass011.A00();
                    C03170Ep A005 = C03170Ep.A00();
                    C470029d A006 = C470029d.A00();
                    C40291rx A007 = C40291rx.A00();
                    C01V A008 = C01V.A00();
                    C02E A009 = C02E.A00();
                    C47222Aj A0010 = C47222Aj.A00();
                    C2F8 A0011 = C2F8.A00();
                    C0HA A0012 = C0HA.A00();
                    C2F9 A0013 = C2F9.A00();
                    C03020Dv A0014 = C03020Dv.A00();
                    if (C0RA.A01 == null) {
                        synchronized (C41321tj.class) {
                            if (C0RA.A01 == null) {
                                C0RA.A01 = new C0RA(C002601h.A00());
                            }
                        }
                    }
                    A0L = new C0Oi(A00, A002, c2f7, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, C0RA.A01, C41901uh.A00(), C002601h.A00());
                }
            }
        }
        return A0L;
    }

    public final void A01(Activity activity, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(activity.getClass().getName());
        sb.append(".on");
        sb.append(str);
        Log.i(sb.toString());
        this.A0B.A05(activity, str2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        A01(activity, "Create", "Create");
        if (this.A00 == 0) {
            this.A0H.A06 = true;
        }
        if (activity instanceof ActivityC02330At) {
            ((ActivityC02330At) activity).A0N().A0P.A01.add(new C0RD(this.A04));
        }
        Window window = activity.getWindow();
        window.setCallback(new C2FA(window.getCallback(), this.A0K));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        A01(activity, "Destroy", "Destroy");
        C2F7 c2f7 = this.A0E;
        C018508q c018508q = this.A05;
        if (c2f7 != null) {
            c018508q.A02.postDelayed(new RunnableEBaseShape4S0100000_I0_4(activity), 60000L);
            return;
        }
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (!(activity instanceof Main)) {
            this.A0H.A01();
        }
        if (!(activity instanceof Conversation)) {
            this.A0G.A01();
        }
        A01(activity, "Pause", "Pause");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        A01(activity, "Resume", "Resume");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        A01(activity, "SaveInstanceState", "Save");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        A01(activity, "Start", "Start");
        if (this.A00 == 0 && !this.A01) {
            Log.i("app-init/application foregrounded");
            MessageService.A01(activity, this.A0J);
            C005002g c005002g = this.A06;
            if (!c005002g.A04() && !c005002g.A03()) {
                this.A0F.A0D(true, false, false, false, 1);
            }
            C470029d c470029d = this.A08;
            c470029d.A0D.execute(new RunnableEBaseShape0S0100000_I0_0(c470029d, 27));
            C03020Dv c03020Dv = this.A03;
            if (c03020Dv != null) {
                C000700j.A01();
                c03020Dv.A00 = true;
                Iterator it = ((AnonymousClass009) c03020Dv).A00.iterator();
                while (true) {
                    C0G5 c0g5 = (C0G5) it;
                    if (!c0g5.hasNext()) {
                        break;
                    }
                    ((C0IZ) c0g5.next()).AHH();
                }
            } else {
                throw null;
            }
        }
        int i = this.A00;
        this.A02 = i == 0;
        this.A00 = i + 1;
        Window window = activity.getWindow();
        Window.Callback callback = window.getCallback();
        if (!(callback instanceof C2FA)) {
            window.setCallback(new C2FA(callback, this.A0K));
        }
        C03170Ep c03170Ep = this.A07;
        if (c03170Ep.A04()) {
            return;
        }
        C000500h c000500h = c03170Ep.A03;
        if (c000500h.A00.getBoolean("privacy_fingerprint_enabled", false)) {
            Log.i("AppAuthManager/resetAppAuthSettingIfNecessary: no biometrics enrolled and setting was enabled");
            C000200d.A0j(c000500h, "privacy_fingerprint_enabled", false);
            c03170Ep.A03(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        A01(activity, "Stop", "Stop");
        boolean isChangingConfigurations = activity.isChangingConfigurations();
        this.A01 = isChangingConfigurations;
        int i = this.A00 - 1;
        this.A00 = i;
        if (i == 0 && !isChangingConfigurations) {
            C002601h c002601h = this.A0B;
            c002601h.A02.execute(new RunnableEBaseShape0S1100000_I0(c002601h, "App backgrounded", 12));
            Log.i("app-init/application backgrounded");
            C01V c01v = this.A0H;
            c01v.A01();
            c01v.A06 = false;
            final C0HA c0ha = this.A0C;
            final C02E c02e = this.A0A;
            c0ha.A0F.AS1(new Runnable() { // from class: X.1P9
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityManager A01;
                    Debug.MemoryInfo[] processMemoryInfo;
                    C0HA c0ha2 = C0HA.this;
                    C02E c02e2 = c02e;
                    C37251m7 c37251m7 = new C37251m7();
                    AnonymousClass015 anonymousClass015 = c37251m7.samplingRate;
                    if (anonymousClass015.A00() && (A01 = c02e2.A01()) != null && (processMemoryInfo = A01.getProcessMemoryInfo(new int[]{Process.myPid()})) != null && processMemoryInfo.length != 0) {
                        Debug.MemoryInfo memoryInfo = processMemoryInfo[0];
                        c37251m7.A05 = Double.valueOf(memoryInfo.getTotalPss());
                        c37251m7.A02 = Double.valueOf(memoryInfo.getTotalPrivateDirty());
                        c37251m7.A00 = Double.valueOf(memoryInfo.dalvikPrivateDirty);
                        c37251m7.A01 = Double.valueOf(memoryInfo.nativePrivateDirty);
                        c37251m7.A03 = Double.valueOf(memoryInfo.getTotalSharedDirty());
                        c37251m7.A04 = Double.valueOf((SystemClock.uptimeMillis() - C003901v.A00) / 1000.0d);
                        c37251m7.A06 = Long.valueOf(Thread.activeCount());
                        c0ha2.A0B.A08(c37251m7, anonymousClass015.A02);
                        Long l = c37251m7.A06;
                        if (l.longValue() > 140) {
                            c0ha2.A01.A09("too-many-threads", String.valueOf(l), false);
                        }
                        if (c0ha2.A0F instanceof C002801j) {
                            long largestPoolSize = C002801j.A06.getLargestPoolSize();
                            if (largestPoolSize == 128 && largestPoolSize > 0) {
                                c0ha2.A01.A09("too-many-threads-waworkers", String.valueOf(largestPoolSize), false);
                            }
                        }
                    }
                }
            });
            C03170Ep c03170Ep = this.A07;
            C000500h c000500h = c03170Ep.A03;
            if (!c000500h.A00.getBoolean("fingerprint_authentication_needed", false)) {
                Log.i("AppAuthManager/onApplicationBackground");
                c03170Ep.A03(true);
                C000200d.A0h(c000500h, "app_background_time", c03170Ep.A02.A03());
            }
            C2F9 c2f9 = this.A0I;
            C2FB c2fb = c2f9.A01;
            if (c2fb != null) {
                for (Map.Entry entry : c2fb.A05.entrySet()) {
                    C0RE c0re = new C0RE();
                    C2FC c2fc = (C2FC) entry.getValue();
                    c0re.A03 = Long.valueOf(c2fc.A03);
                    c0re.A02 = (Integer) entry.getKey();
                    long j = c2fc.A03;
                    if (j > 0) {
                        double d = j;
                        c0re.A00 = Double.valueOf((c2fc.A01 * 60000.0d) / d);
                        c0re.A01 = Double.valueOf((c2fc.A00 * 60000.0d) / d);
                    }
                    if (c2fb.A04 != null) {
                        c2fb.A03.A08(c0re, c2fb.A01);
                    } else {
                        throw null;
                    }
                }
                c2fb.A05.clear();
                c2f9.A02 = Boolean.FALSE;
                c2f9.A01 = null;
            }
            C470029d c470029d = this.A08;
            c470029d.A0D.execute(new RunnableEBaseShape0S0100000_I0_0(c470029d, 26));
            C03020Dv c03020Dv = this.A03;
            if (c03020Dv != null) {
                C000700j.A01();
                c03020Dv.A00 = false;
                Iterator it = ((AnonymousClass009) c03020Dv).A00.iterator();
                while (true) {
                    C0G5 c0g5 = (C0G5) it;
                    if (!c0g5.hasNext()) {
                        break;
                    }
                    ((C0IZ) c0g5.next()).AHG();
                }
                this.A02 = true;
            } else {
                throw null;
            }
        }
        C0RF c0rf = new C0RF();
        c0rf.A00 = activity.getClass().getSimpleName();
        this.A0D.A0B(c0rf, null, false);
    }
}
