package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.1vK  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42191vK extends BroadcastReceiver {
    public C000500h A00;
    public C42181vJ A01;
    public volatile boolean A03 = false;
    public final Object A02 = new Object();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    ((C0C5) AnonymousClass029.A0Y(context)).A2G(this);
                    this.A03 = true;
                }
            }
        }
        Log.i("ProcessProviderMigrationInfo/on-receive");
        Bundle resultExtras = getResultExtras(true);
        if (getResultCode() == -1 && resultExtras != null && intent != null) {
            if ("com.whatsapp.registration.directmigration.initialMigrationInfoAction".equals(intent.getAction())) {
                Log.i("ProcessProviderMigrationInfo/received-phone-number");
                C000200d.A0i(this.A00, "registration_sibling_app_country_code", resultExtras.getString("me_country_code", null));
                C000200d.A0i(this.A00, "registration_sibling_app_phone_number", resultExtras.getString("phone_number", null));
                C000200d.A0g(this.A00, "direct_db_migration_timeout_in_secs", resultExtras.getInt("direct_db_migration_timeout_in_secs", 180));
                boolean z = resultExtras.getBoolean("sister_app_content_provider_enabled", false);
                this.A00.A0D().putBoolean("sister_app_content_provider_is_enabled", z).apply();
                StringBuilder sb = new StringBuilder("ProcessProviderMigrationInfo/sister-app-content-provider-is-enabled = ");
                sb.append(z);
                Log.i(sb.toString());
            } else if (!"com.whatsapp.registration.directmigration.recoveryTokenAction".equals(intent.getAction())) {
            } else {
                Log.i("ProcessProviderMigrationInfo/received-recovery-token");
                String string = this.A00.A00.getString("registration_sibling_app_country_code", null);
                String string2 = this.A00.A00.getString("registration_sibling_app_phone_number", null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(string2);
                String A0S = C40731sm.A0S(sb2.toString());
                byte[] byteArray = resultExtras.getByteArray("key_recovery_token");
                if (TextUtils.isEmpty(A0S) || byteArray == null) {
                    return;
                }
                C02A.A09(context, byteArray, A0S);
                this.A01.A01.A00 = Boolean.TRUE;
            }
        }
    }
}
