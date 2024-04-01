package com.whatsapp.registration.directmigration;

import X.AnonymousClass029;
import X.C000200d;
import X.C000500h;
import X.C0C5;
import X.C0MF;
import X.C42181vJ;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class MigrationRequesterBroadcastReceiver extends BroadcastReceiver {
    public C000500h A00;
    public C42181vJ A01;
    public final Object A02;
    public volatile boolean A03;

    public MigrationRequesterBroadcastReceiver() {
        this(0);
    }

    public MigrationRequesterBroadcastReceiver(int i) {
        this.A03 = false;
        this.A02 = new Object();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    ((C0C5) AnonymousClass029.A0Y(context)).A2F(this);
                    this.A03 = true;
                }
            }
        }
        if (intent != null) {
            Log.i("MigrationRequesterBroadcastReceiver/received-broadcast");
            if ("com.whatsapp.registration.directmigration.providerAppMigrationSpaceNeededAction".equals(intent.getAction())) {
                long longExtra = intent.getLongExtra("extra_min_storage_needed", 0L);
                long longExtra2 = intent.getLongExtra("extra_msg_db_size", 0L);
                C0MF c0mf = this.A01.A01;
                c0mf.A03 = Double.valueOf(longExtra);
                c0mf.A02 = Double.valueOf(longExtra2);
                C000200d.A0h(this.A00, "registration_sibling_app_min_storage_needed", longExtra);
            }
        }
    }
}
