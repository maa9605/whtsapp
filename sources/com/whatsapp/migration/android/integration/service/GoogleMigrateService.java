package com.whatsapp.migration.android.integration.service;

import X.C001200o;
import X.C005402l;
import X.C2H9;
import X.C3MM;
import X.C3MN;
import X.C42291vV;
import X.C42311vX;
import X.InterfaceC002901k;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.search.verification.client.R;
import com.whatsapp.migration.android.integration.service.GoogleMigrateService;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class GoogleMigrateService extends C2H9 {
    public C42311vX A00;
    public C42291vV A01;
    public C3MN A02;
    public InterfaceC002901k A03;
    public boolean A04;
    public final C3MM A05 = new C3MM() { // from class: X.3gC
        {
            GoogleMigrateService.this = this;
        }

        @Override // X.C3MM
        public void AIk() {
            Log.i("GoogleMigrateImporterViewModel/onComplete");
            C3MN c3mn = GoogleMigrateService.this.A02;
            c3mn.A01(c3mn.A00.A00.getResources().getString(R.string.migration_finished), c3mn.A00.A00.getResources().getString(R.string.migration_finished_subtext), -1, true);
        }

        @Override // X.C3MM
        public void AJp(int i) {
            C3MN c3mn = GoogleMigrateService.this.A02;
            c3mn.A01(c3mn.A00.A00.getResources().getString(R.string.migration_failed), c3mn.A00.A00.getResources().getString(R.string.migration_failed_detail), -1, true);
        }

        @Override // X.C3MM
        public void ANO(int i, int i2) {
            C000200d.A0t("GoogleMigrateService/onProgress/processed=", i, "total=", i2);
            C3MN c3mn = GoogleMigrateService.this.A02;
            int i3 = (int) ((i * 100.0f) / i2);
            String string = c3mn.A00.A00.getResources().getString(R.string.migrating);
            if (i3 >= 0) {
                StringBuilder sb = new StringBuilder("GoogleMigrateNotificationManager/onProgress (");
                sb.append(i3);
                sb.append("%)");
                Log.i(sb.toString());
                c3mn.A01(string, c3mn.A00.A00.getResources().getString(R.string.migration_in_progress, c3mn.A02.A0H().format(i3 / 100.0d)), i3, false);
            }
        }
    };

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // X.C2H9, X.C0IL, X.C0IM, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.A01.A00(this.A05);
    }

    @Override // X.C0IL, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        stopForeground(true);
        this.A01.A01(this.A05);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.A04) {
            return 1;
        }
        this.A04 = true;
        C3MN c3mn = this.A02;
        C005402l A00 = c3mn.A00();
        C001200o c001200o = c3mn.A00;
        A00.A0A(c001200o.A00.getResources().getString(R.string.migrating));
        A00.A09(c001200o.A00.getResources().getString(R.string.moving_files));
        A01(i2, 31, A00.A01());
        this.A03.AS1(new RunnableEBaseShape4S0100000_I0_4(this, 33));
        return 1;
    }
}
