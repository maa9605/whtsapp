package androidx.work.impl.foreground;

import X.AbstractC16430qO;
import X.AbstractRunnableC17040rR;
import X.C0OP;
import X.C1Tb;
import X.C1WH;
import X.C29171Vr;
import X.InterfaceC16860r9;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public class SystemForegroundService extends C1Tb implements InterfaceC16860r9 {
    public static final String A04 = AbstractC16430qO.A01("SystemFgService");
    public NotificationManager A00;
    public Handler A01;
    public C29171Vr A02;
    public boolean A03;

    public final void A00() {
        this.A01 = new Handler(Looper.getMainLooper());
        this.A00 = (NotificationManager) getApplicationContext().getSystemService("notification");
        C29171Vr c29171Vr = new C29171Vr(getApplicationContext());
        this.A02 = c29171Vr;
        if (c29171Vr.A02 != null) {
            AbstractC16430qO.A00().A03(C29171Vr.A0A, "A callback already exists.", new Throwable[0]);
        } else {
            c29171Vr.A02 = this;
        }
    }

    @Override // X.C1Tb, android.app.Service
    public void onCreate() {
        super.onCreate();
        A00();
    }

    @Override // X.C1Tb, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.A02.A00();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        if (this.A03) {
            AbstractC16430qO.A00().A04(A04, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.A02.A00();
            A00();
            this.A03 = false;
        }
        if (intent != null) {
            final C29171Vr c29171Vr = this.A02;
            if (c29171Vr != null) {
                String action = intent.getAction();
                if ("ACTION_START_FOREGROUND".equals(action)) {
                    AbstractC16430qO.A00().A04(C29171Vr.A0A, String.format("Started foreground service %s", intent), new Throwable[0]);
                    final String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                    final WorkDatabase workDatabase = c29171Vr.A01.A04;
                    ((C1WH) c29171Vr.A05).A01.execute(new Runnable() { // from class: X.0r8
                        @Override // java.lang.Runnable
                        public void run() {
                            InterfaceC17010rO A0B = workDatabase.A0B();
                            String str = stringExtra;
                            C0OL A02 = ((C1W8) A0B).A02(str);
                            if (A02 == null || !(!C0OH.A08.equals(A02.A09))) {
                                return;
                            }
                            C29171Vr c29171Vr2 = c29171Vr;
                            synchronized (c29171Vr2.A06) {
                                c29171Vr2.A08.put(str, A02);
                                Set set = c29171Vr2.A09;
                                set.add(A02);
                                c29171Vr2.A04.A01(set);
                            }
                        }
                    });
                    c29171Vr.A01(intent);
                    return 3;
                } else if ("ACTION_NOTIFY".equals(action)) {
                    c29171Vr.A01(intent);
                    return 3;
                } else if ("ACTION_CANCEL_WORK".equals(action)) {
                    AbstractC16430qO.A00().A04(C29171Vr.A0A, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
                    String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
                    if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                        return 3;
                    }
                    final C0OP c0op = c29171Vr.A01;
                    final UUID fromString = UUID.fromString(stringExtra2);
                    if (c0op != null) {
                        ((C1WH) c0op.A06).A01.execute(new AbstractRunnableC17040rR() { // from class: X.1WA
                            @Override // X.AbstractRunnableC17040rR
                            public void A01() {
                                C0OP c0op2 = c0op;
                                WorkDatabase workDatabase2 = c0op2.A04;
                                workDatabase2.A03();
                                try {
                                    AbstractRunnableC17040rR.A00(c0op2, fromString.toString());
                                    workDatabase2.A05();
                                    workDatabase2.A04();
                                    C16560qc.A01(c0op2.A04, c0op2.A07);
                                } catch (Throwable th) {
                                    workDatabase2.A04();
                                    throw th;
                                }
                            }
                        });
                        return 3;
                    }
                    throw null;
                } else if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                    return 3;
                } else {
                    AbstractC16430qO.A00().A04(C29171Vr.A0A, "Stopping foreground service", new Throwable[0]);
                    InterfaceC16860r9 interfaceC16860r9 = c29171Vr.A02;
                    if (interfaceC16860r9 == null) {
                        return 3;
                    }
                    SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC16860r9;
                    systemForegroundService.A03 = true;
                    AbstractC16430qO.A00().A02(A04, "All commands completed.", new Throwable[0]);
                    if (Build.VERSION.SDK_INT >= 26) {
                        systemForegroundService.stopForeground(true);
                    }
                    systemForegroundService.stopSelf();
                    return 3;
                }
            }
            throw null;
        }
        return 3;
    }
}
