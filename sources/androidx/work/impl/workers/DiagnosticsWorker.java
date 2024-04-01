package androidx.work.impl.workers;

import X.AbstractC09650eU;
import X.AbstractC15540ov;
import X.AbstractC16430qO;
import X.C07K;
import X.C07O;
import X.C0OF;
import X.C0OH;
import X.C0OL;
import X.C0OP;
import X.C15600p1;
import X.C16940rH;
import X.C1VF;
import X.C1W8;
import X.C1W9;
import X.C28911Uj;
import X.C29201Vv;
import X.C29211Vw;
import X.InterfaceC16950rI;
import X.InterfaceC16970rK;
import X.InterfaceC17010rO;
import X.InterfaceC17030rQ;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {
    public static final String A00 = AbstractC16430qO.A01("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
    }

    public static String A00(InterfaceC16970rK workNameDao, InterfaceC17030rQ workTagDao, InterfaceC16950rI systemIdInfoDao, List workSpecs) {
        Integer num;
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"));
        Iterator it = workSpecs.iterator();
        while (it.hasNext()) {
            C0OL c0ol = (C0OL) it.next();
            C16940rH A002 = ((C29201Vv) systemIdInfoDao).A00(c0ol.A0D);
            if (A002 != null) {
                num = Integer.valueOf(A002.A00);
            } else {
                num = null;
            }
            String str = c0ol.A0D;
            C29211Vw c29211Vw = (C29211Vw) workNameDao;
            if (c29211Vw != null) {
                C28911Uj A003 = C28911Uj.A00("SELECT name FROM workname WHERE work_spec_id=?", 1);
                if (str == null) {
                    A003.A03[1] = 1;
                } else {
                    A003.A02(1, str);
                }
                AbstractC15540ov abstractC15540ov = c29211Vw.A01;
                abstractC15540ov.A02();
                Cursor A004 = C15600p1.A00(abstractC15540ov, A003, false);
                try {
                    ArrayList arrayList = new ArrayList(A004.getCount());
                    while (A004.moveToNext()) {
                        arrayList.add(A004.getString(0));
                    }
                    A004.close();
                    A003.A01();
                    sb.append(String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", c0ol.A0D, c0ol.A0F, num, c0ol.A0C.name(), TextUtils.join(",", arrayList), TextUtils.join(",", ((C1W9) workTagDao).A00(c0ol.A0D))));
                } catch (Throwable th) {
                    A004.close();
                    A003.A01();
                    throw th;
                }
            } else {
                throw null;
            }
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public AbstractC09650eU A03() {
        int i;
        WorkDatabase workDatabase = C0OP.A00(((ListenableWorker) this).A00).A04;
        InterfaceC17010rO A0B = workDatabase.A0B();
        InterfaceC16970rK A09 = workDatabase.A09();
        InterfaceC17030rQ A0C = workDatabase.A0C();
        InterfaceC16950rI A08 = workDatabase.A08();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        C1W8 c1w8 = (C1W8) A0B;
        if (c1w8 != null) {
            C28911Uj A002 = C28911Uj.A00("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
            A002.A03[1] = 2;
            A002.A04[1] = currentTimeMillis;
            AbstractC15540ov abstractC15540ov = c1w8.A01;
            abstractC15540ov.A02();
            Cursor A003 = C15600p1.A00(abstractC15540ov, A002, false);
            try {
                int A07 = C07O.A07(A003, "required_network_type");
                int A072 = C07O.A07(A003, "requires_charging");
                int A073 = C07O.A07(A003, "requires_device_idle");
                int A074 = C07O.A07(A003, "requires_battery_not_low");
                int A075 = C07O.A07(A003, "requires_storage_not_low");
                int A076 = C07O.A07(A003, "trigger_content_update_delay");
                int A077 = C07O.A07(A003, "trigger_max_content_delay");
                int A078 = C07O.A07(A003, "content_uri_triggers");
                int A079 = C07O.A07(A003, "id");
                int A0710 = C07O.A07(A003, "state");
                int A0711 = C07O.A07(A003, "worker_class_name");
                int A0712 = C07O.A07(A003, "input_merger_class_name");
                int A0713 = C07O.A07(A003, "input");
                int A0714 = C07O.A07(A003, "output");
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
                    List A04 = c1w8.A04();
                    List A03 = c1w8.A03();
                    if (!arrayList.isEmpty()) {
                        AbstractC16430qO A004 = AbstractC16430qO.A00();
                        String str = A00;
                        i = 0;
                        A004.A04(str, "Recently completed work:\n\n", new Throwable[0]);
                        AbstractC16430qO.A00().A04(str, A00(A09, A0C, A08, arrayList), new Throwable[0]);
                    } else {
                        i = 0;
                    }
                    if (!((AbstractCollection) A04).isEmpty()) {
                        AbstractC16430qO A005 = AbstractC16430qO.A00();
                        String str2 = A00;
                        A005.A04(str2, "Running work:\n\n", new Throwable[i]);
                        AbstractC16430qO.A00().A04(str2, A00(A09, A0C, A08, A04), new Throwable[i]);
                    }
                    if (!((AbstractCollection) A03).isEmpty()) {
                        AbstractC16430qO A006 = AbstractC16430qO.A00();
                        String str3 = A00;
                        A006.A04(str3, "Enqueued work:\n\n", new Throwable[i]);
                        AbstractC16430qO.A00().A04(str3, A00(A09, A0C, A08, A03), new Throwable[i]);
                    }
                    return new C1VF();
                } catch (Throwable th) {
                    th = th;
                    A003.close();
                    A002.A01();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            throw null;
        }
    }
}
