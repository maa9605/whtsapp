package X;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.registration.directmigration.MigrationProviderOrderedBroadcastReceiver;
import com.whatsapp.util.Log;

/* renamed from: X.1vG */
/* loaded from: classes2.dex */
public class C42161vG {
    public static volatile C42161vG A06;
    public final C001200o A00;
    public final C000500h A01;
    public final C05N A02;
    public final C05E A03;
    public final C40431sF A04;
    public final InterfaceC002901k A05;

    public C42161vG(C001200o c001200o, InterfaceC002901k interfaceC002901k, C40431sF c40431sF, C05E c05e, C000500h c000500h, C05N c05n) {
        this.A00 = c001200o;
        this.A05 = interfaceC002901k;
        this.A04 = c40431sF;
        this.A03 = c05e;
        this.A01 = c000500h;
        this.A02 = c05n;
    }

    public static C42161vG A00() {
        if (A06 == null) {
            synchronized (C42161vG.class) {
                if (A06 == null) {
                    A06 = new C42161vG(C001200o.A01, C002801j.A00(), C40431sF.A00(), C05E.A00(), C000500h.A00(), C05N.A00());
                }
            }
        }
        return A06;
    }

    public void A01() {
        String string = this.A01.A00.getString("registration_sibling_app_country_code", null);
        StringBuilder sb = new StringBuilder("InterAppCommunicationManager/migrateFromConsumerAppFlowEnabled/sibling-country-code = ");
        sb.append(string);
        Log.i(sb.toString());
        StringBuilder sb2 = new StringBuilder("InterAppCommunicationManager/smbIsCapableOfMigratingFromConsumer=");
        sb2.append(false);
        Log.i(sb2.toString());
        C000200d.A1V(new StringBuilder("InterAppCommunicationManager/migrateFromConsumerAppFlowEnabled = "), false);
    }

    public void A02() {
        Bundle bundle = new Bundle();
        StringBuilder sb = new StringBuilder("InterAppCommunicationManager/smbIsCapableOfMigratingFromConsumer=");
        sb.append(false);
        Log.i(sb.toString());
        bundle.putBoolean("database_migration_is_enabled_on_requester_side", false);
        Log.i("InterAppCommunicationManager/sendInitialMigrationInfoNeededBroadcast/sendInitialMigrationInfoNeededBroadcast");
        A03("com.whatsapp.registration.directmigration.initialMigrationInfoAction", bundle);
    }

    public final void A03(String str, Bundle bundle) {
        StringBuilder sb = new StringBuilder("InterAppCommunicationManager/sendRequesterToProviderOrderedBroadcast/action = ");
        sb.append(str);
        Log.i(sb.toString());
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.whatsapp.w4b", MigrationProviderOrderedBroadcastReceiver.class.getName()));
        intent.setAction(str);
        intent.addFlags(32);
        this.A00.A00.sendOrderedBroadcast(intent, "com.whatsapp.permission.REGISTRATION", new C42191vK(), null, 1, null, bundle);
    }
}
