package X;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1Vr  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C29171Vr implements InterfaceC16530qZ, InterfaceC16760qy {
    public static final String A0A = AbstractC16430qO.A01("SystemFgDispatcher");
    public Context A00;
    public C0OP A01;
    public InterfaceC16860r9 A02;
    public String A03;
    public final C29131Vn A04;
    public final InterfaceC17300rs A05;
    public final Object A06 = new Object();
    public final Map A07;
    public final Map A08;
    public final Set A09;

    @Override // X.InterfaceC16760qy
    public void AH3(List workSpecIds) {
    }

    public C29171Vr(Context context) {
        this.A00 = context;
        C0OP A00 = C0OP.A00(context);
        this.A01 = A00;
        InterfaceC17300rs interfaceC17300rs = A00.A06;
        this.A05 = interfaceC17300rs;
        this.A03 = null;
        this.A07 = new LinkedHashMap();
        this.A09 = new HashSet();
        this.A08 = new HashMap();
        this.A04 = new C29131Vn(this.A00, interfaceC17300rs, this);
        this.A01.A03.A02(this);
    }

    public void A00() {
        this.A02 = null;
        synchronized (this.A06) {
            this.A04.A00();
        }
        this.A01.A03.A03(this);
    }

    public final void A01(Intent intent) {
        int i = 0;
        final int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        final Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        AbstractC16430qO.A00().A02(A0A, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification != null && this.A02 != null) {
            C16400qL c16400qL = new C16400qL(intExtra, notification, intExtra2);
            Map map = this.A07;
            map.put(stringExtra, c16400qL);
            if (TextUtils.isEmpty(this.A03)) {
                this.A03 = stringExtra;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.A02;
                systemForegroundService.A01.post(new RunnableC16870rA(systemForegroundService, intExtra, notification, intExtra2));
                return;
            }
            final SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.A02;
            systemForegroundService2.A01.post(new Runnable() { // from class: X.0rB
                @Override // java.lang.Runnable
                public void run() {
                    SystemForegroundService.this.A00.notify(intExtra, notification);
                }
            });
            if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
                return;
            }
            for (Map.Entry entry : map.entrySet()) {
                i |= ((C16400qL) entry.getValue()).A00;
            }
            C16400qL c16400qL2 = (C16400qL) map.get(this.A03);
            if (c16400qL2 == null) {
                return;
            }
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) this.A02;
            systemForegroundService3.A01.post(new RunnableC16870rA(systemForegroundService3, c16400qL2.A01, c16400qL2.A02, i));
        }
    }

    @Override // X.InterfaceC16760qy
    public void AH4(List workSpecIds) {
        if (workSpecIds.isEmpty()) {
            return;
        }
        Iterator it = workSpecIds.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC16430qO.A00().A02(A0A, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            C0OP c0op = this.A01;
            ((C1WH) c0op.A06).A01.execute(new RunnableC17150rd(c0op, str, true));
        }
    }

    @Override // X.InterfaceC16530qZ
    public void AK7(String workSpecId, boolean needsReschedule) {
        Map.Entry entry;
        synchronized (this.A06) {
            C0OL c0ol = (C0OL) this.A08.remove(workSpecId);
            if (c0ol != null) {
                Set set = this.A09;
                if (set.remove(c0ol)) {
                    this.A04.A01(set);
                }
            }
        }
        Map map = this.A07;
        C16400qL c16400qL = (C16400qL) map.remove(workSpecId);
        if (workSpecId.equals(this.A03) && map.size() > 0) {
            Iterator it = map.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.A03 = (String) entry.getKey();
            if (this.A02 != null) {
                C16400qL c16400qL2 = (C16400qL) entry.getValue();
                InterfaceC16860r9 interfaceC16860r9 = this.A02;
                final int i = c16400qL2.A01;
                SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC16860r9;
                systemForegroundService.A01.post(new RunnableC16870rA(systemForegroundService, i, c16400qL2.A02, c16400qL2.A00));
                final SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.A02;
                systemForegroundService2.A01.post(new Runnable() { // from class: X.0rC
                    @Override // java.lang.Runnable
                    public void run() {
                        SystemForegroundService.this.A00.cancel(i);
                    }
                });
            }
        }
        InterfaceC16860r9 interfaceC16860r92 = this.A02;
        if (c16400qL == null || interfaceC16860r92 == null) {
            return;
        }
        AbstractC16430qO A00 = AbstractC16430qO.A00();
        String str = A0A;
        final int i2 = c16400qL.A01;
        A00.A02(str, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(i2), workSpecId, Integer.valueOf(c16400qL.A00)), new Throwable[0]);
        final SystemForegroundService systemForegroundService3 = (SystemForegroundService) interfaceC16860r92;
        systemForegroundService3.A01.post(new Runnable() { // from class: X.0rC
            @Override // java.lang.Runnable
            public void run() {
                SystemForegroundService.this.A00.cancel(i2);
            }
        });
    }
}
