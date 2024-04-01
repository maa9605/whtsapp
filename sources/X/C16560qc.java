package X;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0qc */
/* loaded from: classes.dex */
public class C16560qc {
    public static final String A00 = AbstractC16430qO.A01("Schedulers");

    public static InterfaceC16550qb A00(Context context, C0OP workManager) {
        String str;
        InterfaceC16550qb interfaceC16550qb;
        if (Build.VERSION.SDK_INT >= 23) {
            C29121Vl c29121Vl = new C29121Vl(context, workManager);
            C17080rW.A00(context, SystemJobService.class, true);
            AbstractC16430qO.A00().A02(A00, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return c29121Vl;
        }
        try {
            interfaceC16550qb = (InterfaceC16550qb) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(context);
            AbstractC16430qO A002 = AbstractC16430qO.A00();
            str = A00;
            A002.A02(str, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
        } catch (Throwable th) {
            AbstractC16430qO A003 = AbstractC16430qO.A00();
            str = A00;
            A003.A02(str, "Unable to create GCM Scheduler", th);
        }
        if (interfaceC16550qb != null) {
            return interfaceC16550qb;
        }
        InterfaceC16550qb interfaceC16550qb2 = new InterfaceC16550qb(context) { // from class: X.1Vk
            public static final String A01 = AbstractC16430qO.A01("SystemAlarmScheduler");
            public final Context A00;

            @Override // X.InterfaceC16550qb
            public boolean AET() {
                return true;
            }

            {
                this.A00 = context.getApplicationContext();
            }

            @Override // X.InterfaceC16550qb
            public void A5z(String workSpecId) {
                Context context2 = this.A00;
                Intent intent = new Intent(context2, SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", workSpecId);
                context2.startService(intent);
            }

            @Override // X.InterfaceC16550qb
            public void ASD(C0OL... workSpecs) {
                for (C0OL c0ol : workSpecs) {
                    AbstractC16430qO.A00().A02(A01, String.format("Scheduling work with workSpecId %s", c0ol.A0D), new Throwable[0]);
                    Context context2 = this.A00;
                    String str2 = c0ol.A0D;
                    Intent intent = new Intent(context2, SystemAlarmService.class);
                    intent.setAction("ACTION_SCHEDULE_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str2);
                    context2.startService(intent);
                }
            }
        };
        C17080rW.A00(context, SystemAlarmService.class, true);
        AbstractC16430qO.A00().A02(str, "Created SystemAlarmScheduler", new Throwable[0]);
        return interfaceC16550qb2;
    }

    public static void A01(WorkDatabase workDatabase, List list) {
        int A07;
        int A072;
        int A073;
        int A074;
        int A075;
        int A076;
        int A077;
        int A078;
        int A079;
        int A0710;
        int A0711;
        int A0712;
        int A0713;
        int A0714;
        if (list == null || list.size() == 0) {
            return;
        }
        InterfaceC17010rO A0B = workDatabase.A0B();
        workDatabase.A03();
        try {
            int i = Build.VERSION.SDK_INT == 23 ? 10 : 20;
            C1W8 c1w8 = (C1W8) A0B;
            C28911Uj A002 = C28911Uj.A00("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
            A002.A03[1] = 2;
            A002.A04[1] = i;
            AbstractC15540ov abstractC15540ov = c1w8.A01;
            abstractC15540ov.A02();
            Cursor A003 = C15600p1.A00(abstractC15540ov, A002, false);
            try {
                A07 = C07O.A07(A003, "required_network_type");
                A072 = C07O.A07(A003, "requires_charging");
                A073 = C07O.A07(A003, "requires_device_idle");
                A074 = C07O.A07(A003, "requires_battery_not_low");
                A075 = C07O.A07(A003, "requires_storage_not_low");
                A076 = C07O.A07(A003, "trigger_content_update_delay");
                A077 = C07O.A07(A003, "trigger_max_content_delay");
                A078 = C07O.A07(A003, "content_uri_triggers");
                A079 = C07O.A07(A003, "id");
                A0710 = C07O.A07(A003, "state");
                A0711 = C07O.A07(A003, "worker_class_name");
                A0712 = C07O.A07(A003, "input_merger_class_name");
                A0713 = C07O.A07(A003, "input");
                A0714 = C07O.A07(A003, "output");
            } catch (Throwable th) {
                th = th;
            }
            try {
                int A0715 = C07O.A07(A003, "initial_delay");
                int A0716 = C07O.A07(A003, "interval_duration");
                int A0717 = C07O.A07(A003, "flex_duration");
                int A0718 = C07O.A07(A003, "run_attempt_count");
                int A0719 = C07O.A07(A003, "backoff_policy");
                int A0720 = C07O.A07(A003, "backoff_delay_duration");
                int A0721 = C07O.A07(A003, "period_start_time");
                int A0722 = C07O.A07(A003, "minimum_retention_duration");
                int A0723 = C07O.A07(A003, "schedule_requested_at");
                int A0724 = C07O.A07(A003, "run_in_foreground");
                ArrayList arrayList = new ArrayList(A003.getCount());
                while (A003.moveToNext()) {
                    String string = A003.getString(A079);
                    String string2 = A003.getString(A0711);
                    C0OH c0oh = new C0OH();
                    c0oh.A03 = C07K.A0d(A003.getInt(A07));
                    c0oh.A05 = A003.getInt(A072) != 0;
                    c0oh.A06 = A003.getInt(A073) != 0;
                    c0oh.A04 = A003.getInt(A074) != 0;
                    c0oh.A07 = A003.getInt(A075) != 0;
                    c0oh.A00 = A003.getLong(A076);
                    c0oh.A01 = A003.getLong(A077);
                    c0oh.A02 = C07K.A0c(A003.getBlob(A078));
                    C0OL c0ol = new C0OL(string, string2);
                    c0ol.A0C = C07K.A0e(A003.getInt(A0710));
                    c0ol.A0E = A003.getString(A0712);
                    c0ol.A0A = C0OF.A00(A003.getBlob(A0713));
                    c0ol.A0B = C0OF.A00(A003.getBlob(A0714));
                    c0ol.A03 = A003.getLong(A0715);
                    c0ol.A04 = A003.getLong(A0716);
                    c0ol.A02 = A003.getLong(A0717);
                    c0ol.A00 = A003.getInt(A0718);
                    c0ol.A08 = C07K.A0b(A003.getInt(A0719));
                    c0ol.A01 = A003.getLong(A0720);
                    c0ol.A06 = A003.getLong(A0721);
                    c0ol.A05 = A003.getLong(A0722);
                    c0ol.A07 = A003.getLong(A0723);
                    boolean z = false;
                    if (A003.getInt(A0724) != 0) {
                        z = true;
                    }
                    c0ol.A0G = z;
                    c0ol.A09 = c0oh;
                    arrayList.add(c0ol);
                }
                A003.close();
                A002.A01();
                List A03 = c1w8.A03();
                if (arrayList.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        c1w8.A0B(((C0OL) it.next()).A0D, currentTimeMillis);
                    }
                }
                workDatabase.A05();
                workDatabase.A04();
                if (arrayList.size() > 0) {
                    C0OL[] c0olArr = (C0OL[]) arrayList.toArray(new C0OL[arrayList.size()]);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        InterfaceC16550qb interfaceC16550qb = (InterfaceC16550qb) it2.next();
                        if (interfaceC16550qb.AET()) {
                            interfaceC16550qb.ASD(c0olArr);
                        }
                    }
                }
                AbstractCollection abstractCollection = (AbstractCollection) A03;
                if (abstractCollection.size() > 0) {
                    C0OL[] c0olArr2 = (C0OL[]) abstractCollection.toArray(new C0OL[abstractCollection.size()]);
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        InterfaceC16550qb interfaceC16550qb2 = (InterfaceC16550qb) it3.next();
                        if (!interfaceC16550qb2.AET()) {
                            interfaceC16550qb2.ASD(c0olArr2);
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                A003.close();
                A002.A01();
                throw th;
            }
        } catch (Throwable th3) {
            workDatabase.A04();
            throw th3;
        }
    }
}
