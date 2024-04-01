package X;

import android.app.PendingIntent;
import android.content.Intent;
import com.whatsapp.schedulers.alarm.SchedulerExperimentAlarmReceiver;

/* renamed from: X.3mn  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C80143mn implements C3VZ {
    public final C71153Va A00;

    @Override // X.C3VZ
    public void A6S() {
    }

    @Override // X.C3VZ
    public int ABO() {
        return 15;
    }

    public C80143mn(C71153Va c71153Va) {
        this.A00 = c71153Va;
    }

    @Override // X.C3VZ
    public boolean AFj() {
        C001200o c001200o = this.A00.A01;
        Intent intent = new Intent(c001200o.A00, SchedulerExperimentAlarmReceiver.class);
        intent.setAction("com.whatsapp.schexp.PERIODIC_MANUAL");
        return PendingIntent.getBroadcast(c001200o.A00, 0, intent, 536870912) != null;
    }

    @Override // X.C3VZ
    public void ASC() {
        this.A00.A03();
    }

    @Override // X.C3VZ
    public void cancel() {
        C71153Va c71153Va = this.A00;
        Intent intent = new Intent(c71153Va.A01.A00, SchedulerExperimentAlarmReceiver.class);
        intent.setAction("com.whatsapp.schexp.PERIODIC_MANUAL");
        c71153Va.A04(intent);
    }
}
