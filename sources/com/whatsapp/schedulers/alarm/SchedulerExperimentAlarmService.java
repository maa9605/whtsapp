package com.whatsapp.schedulers.alarm;

import X.AbstractServiceC86013wf;
import X.C000200d;
import X.C41861ud;
import X.C41881uf;
import X.C71153Va;
import android.content.Intent;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public class SchedulerExperimentAlarmService extends AbstractServiceC86013wf {
    public C41881uf A00;
    public C71153Va A01;

    @Override // X.AbstractServiceC05030Na
    public void A05(Intent intent) {
        String action = intent.getAction();
        if ("com.whatsapp.schexp.PERIODIC_API".equals(action)) {
            this.A00.A01("/ntp/alarm/api/started");
            try {
                C71153Va c71153Va = this.A01;
                if (c71153Va.A02.A01() != 2) {
                    c71153Va.A04(c71153Va.A01());
                } else {
                    long longExtra = intent.getLongExtra("alarm_period", 0L);
                    C41861ud c41861ud = c71153Va.A02;
                    if (longExtra != c41861ud.A02()) {
                        c71153Va.A04(c71153Va.A01());
                        c71153Va.A02();
                    }
                    SystemClock.sleep(c41861ud.A03());
                }
            } finally {
                this.A00.A01("/ntp/alarm/api/completed");
            }
        } else if ("com.whatsapp.schexp.PERIODIC_MANUAL".equals(action)) {
            this.A00.A01("/ntp/alarm/manual/started");
            try {
                C71153Va c71153Va2 = this.A01;
                if (c71153Va2.A02.A01() == 3) {
                    c71153Va2.A03();
                    SystemClock.sleep(c71153Va2.A02.A03());
                }
            } finally {
                this.A00.A01("/ntp/alarm/manual/completed");
            }
        } else {
            C000200d.A13("onHandleWork; unsupported action=", action);
            this.A01.A04(intent);
        }
    }
}
