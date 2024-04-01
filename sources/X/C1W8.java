package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteProgram;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1W8 */
/* loaded from: classes.dex */
public final class C1W8 implements InterfaceC17010rO {
    public final AbstractC28861Ue A00;
    public final AbstractC15540ov A01;
    public final AbstractC15570oy A02;
    public final AbstractC15570oy A03;
    public final AbstractC15570oy A04;
    public final AbstractC15570oy A05;
    public final AbstractC15570oy A06;
    public final AbstractC15570oy A07;
    public final AbstractC15570oy A08;

    public C1W8(AbstractC15540ov __db) {
        this.A01 = __db;
        this.A00 = new AbstractC28861Ue(__db) { // from class: X.1pI
            @Override // X.AbstractC15570oy
            public String A01() {
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX WARN: Code restructure failed: missing block: B:165:0x0185, code lost:
                if (r2 == null) goto L63;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:161:0x017d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:155:0x016c -> B:184:0x016f). Please submit an issue!!! */
            @Override // X.AbstractC28861Ue
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void A03(X.C38621oi r17, java.lang.Object r18) {
                /*
                    Method dump skipped, instructions count: 467
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C38951pI.A03(X.1oi, java.lang.Object):void");
            }
        };
        this.A02 = new AbstractC15570oy(__db) { // from class: X.1W1
            @Override // X.AbstractC15570oy
            public String A01() {
                return "DELETE FROM workspec WHERE id=?";
            }
        };
        this.A07 = new AbstractC15570oy(__db) { // from class: X.1W2
            @Override // X.AbstractC15570oy
            public String A01() {
                return "UPDATE workspec SET output=? WHERE id=?";
            }
        };
        this.A08 = new AbstractC15570oy(__db) { // from class: X.1W3
            @Override // X.AbstractC15570oy
            public String A01() {
                return "UPDATE workspec SET period_start_time=? WHERE id=?";
            }
        };
        this.A03 = new AbstractC15570oy(__db) { // from class: X.1W4
            @Override // X.AbstractC15570oy
            public String A01() {
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            }
        };
        this.A06 = new AbstractC15570oy(__db) { // from class: X.1W5
            @Override // X.AbstractC15570oy
            public String A01() {
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            }
        };
        this.A04 = new AbstractC15570oy(__db) { // from class: X.1W6
            @Override // X.AbstractC15570oy
            public String A01() {
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            }
        };
        this.A05 = new AbstractC15570oy(__db) { // from class: X.1W7
            @Override // X.AbstractC15570oy
            public String A01() {
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            }
        };
    }

    public static void A00(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    public C07M A01(final String id) {
        C28911Uj A00 = C28911Uj.A00("SELECT state FROM workspec WHERE id=?", 1);
        if (id == null) {
            A00.A03[1] = 1;
        } else {
            A00.A02(1, id);
        }
        AbstractC15540ov abstractC15540ov = this.A01;
        abstractC15540ov.A02();
        Cursor A002 = C15600p1.A00(abstractC15540ov, A00, false);
        try {
            return A002.moveToFirst() ? C07K.A0e(A002.getInt(0)) : null;
        } finally {
            A002.close();
            A00.A01();
        }
    }

    public C0OL A02(final String id) {
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
        C0OL c0ol;
        C28911Uj A00 = C28911Uj.A00("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE id=?", 1);
        if (id == null) {
            A00.A03[1] = 1;
        } else {
            A00.A02(1, id);
        }
        AbstractC15540ov abstractC15540ov = this.A01;
        abstractC15540ov.A02();
        Cursor A002 = C15600p1.A00(abstractC15540ov, A00, false);
        try {
            A07 = C07O.A07(A002, "required_network_type");
            A072 = C07O.A07(A002, "requires_charging");
            A073 = C07O.A07(A002, "requires_device_idle");
            A074 = C07O.A07(A002, "requires_battery_not_low");
            A075 = C07O.A07(A002, "requires_storage_not_low");
            A076 = C07O.A07(A002, "trigger_content_update_delay");
            A077 = C07O.A07(A002, "trigger_max_content_delay");
            A078 = C07O.A07(A002, "content_uri_triggers");
            A079 = C07O.A07(A002, "id");
            A0710 = C07O.A07(A002, "state");
            A0711 = C07O.A07(A002, "worker_class_name");
            A0712 = C07O.A07(A002, "input_merger_class_name");
            A0713 = C07O.A07(A002, "input");
            A0714 = C07O.A07(A002, "output");
        } catch (Throwable th) {
            th = th;
        }
        try {
            int A0715 = C07O.A07(A002, "initial_delay");
            int A0716 = C07O.A07(A002, "interval_duration");
            int A0717 = C07O.A07(A002, "flex_duration");
            int A0718 = C07O.A07(A002, "run_attempt_count");
            int A0719 = C07O.A07(A002, "backoff_policy");
            int A0720 = C07O.A07(A002, "backoff_delay_duration");
            int A0721 = C07O.A07(A002, "period_start_time");
            int A0722 = C07O.A07(A002, "minimum_retention_duration");
            int A0723 = C07O.A07(A002, "schedule_requested_at");
            int A0724 = C07O.A07(A002, "run_in_foreground");
            if (A002.moveToFirst()) {
                String string = A002.getString(A079);
                String string2 = A002.getString(A0711);
                C0OH c0oh = new C0OH();
                c0oh.A03 = C07K.A0d(A002.getInt(A07));
                c0oh.A05 = A002.getInt(A072) != 0;
                c0oh.A06 = A002.getInt(A073) != 0;
                c0oh.A04 = A002.getInt(A074) != 0;
                c0oh.A07 = A002.getInt(A075) != 0;
                c0oh.A00 = A002.getLong(A076);
                c0oh.A01 = A002.getLong(A077);
                c0oh.A02 = C07K.A0c(A002.getBlob(A078));
                c0ol = new C0OL(string, string2);
                c0ol.A0C = C07K.A0e(A002.getInt(A0710));
                c0ol.A0E = A002.getString(A0712);
                c0ol.A0A = C0OF.A00(A002.getBlob(A0713));
                c0ol.A0B = C0OF.A00(A002.getBlob(A0714));
                c0ol.A03 = A002.getLong(A0715);
                c0ol.A04 = A002.getLong(A0716);
                c0ol.A02 = A002.getLong(A0717);
                c0ol.A00 = A002.getInt(A0718);
                c0ol.A08 = C07K.A0b(A002.getInt(A0719));
                c0ol.A01 = A002.getLong(A0720);
                c0ol.A06 = A002.getLong(A0721);
                c0ol.A05 = A002.getLong(A0722);
                c0ol.A07 = A002.getLong(A0723);
                c0ol.A0G = A002.getInt(A0724) != 0;
                c0ol.A09 = c0oh;
            } else {
                c0ol = null;
            }
            A002.close();
            A00.A01();
            return c0ol;
        } catch (Throwable th2) {
            th = th2;
            A002.close();
            A00.A01();
            throw th;
        }
    }

    public List A03() {
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
        C28911Uj A00 = C28911Uj.A00("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        A00.A03[1] = 2;
        A00.A04[1] = 200;
        AbstractC15540ov abstractC15540ov = this.A01;
        abstractC15540ov.A02();
        Cursor A002 = C15600p1.A00(abstractC15540ov, A00, false);
        try {
            A07 = C07O.A07(A002, "required_network_type");
            A072 = C07O.A07(A002, "requires_charging");
            A073 = C07O.A07(A002, "requires_device_idle");
            A074 = C07O.A07(A002, "requires_battery_not_low");
            A075 = C07O.A07(A002, "requires_storage_not_low");
            A076 = C07O.A07(A002, "trigger_content_update_delay");
            A077 = C07O.A07(A002, "trigger_max_content_delay");
            A078 = C07O.A07(A002, "content_uri_triggers");
            A079 = C07O.A07(A002, "id");
            A0710 = C07O.A07(A002, "state");
            A0711 = C07O.A07(A002, "worker_class_name");
            A0712 = C07O.A07(A002, "input_merger_class_name");
            A0713 = C07O.A07(A002, "input");
            A0714 = C07O.A07(A002, "output");
        } catch (Throwable th) {
            th = th;
        }
        try {
            int A0715 = C07O.A07(A002, "initial_delay");
            int A0716 = C07O.A07(A002, "interval_duration");
            int A0717 = C07O.A07(A002, "flex_duration");
            int A0718 = C07O.A07(A002, "run_attempt_count");
            int A0719 = C07O.A07(A002, "backoff_policy");
            int A0720 = C07O.A07(A002, "backoff_delay_duration");
            int A0721 = C07O.A07(A002, "period_start_time");
            int A0722 = C07O.A07(A002, "minimum_retention_duration");
            int A0723 = C07O.A07(A002, "schedule_requested_at");
            int A0724 = C07O.A07(A002, "run_in_foreground");
            ArrayList arrayList = new ArrayList(A002.getCount());
            while (A002.moveToNext()) {
                String string = A002.getString(A079);
                String string2 = A002.getString(A0711);
                C0OH c0oh = new C0OH();
                c0oh.A03 = C07K.A0d(A002.getInt(A07));
                c0oh.A05 = A002.getInt(A072) != 0;
                c0oh.A06 = A002.getInt(A073) != 0;
                c0oh.A04 = A002.getInt(A074) != 0;
                c0oh.A07 = A002.getInt(A075) != 0;
                c0oh.A00 = A002.getLong(A076);
                c0oh.A01 = A002.getLong(A077);
                c0oh.A02 = C07K.A0c(A002.getBlob(A078));
                C0OL c0ol = new C0OL(string, string2);
                c0ol.A0C = C07K.A0e(A002.getInt(A0710));
                c0ol.A0E = A002.getString(A0712);
                c0ol.A0A = C0OF.A00(A002.getBlob(A0713));
                c0ol.A0B = C0OF.A00(A002.getBlob(A0714));
                c0ol.A03 = A002.getLong(A0715);
                c0ol.A04 = A002.getLong(A0716);
                c0ol.A02 = A002.getLong(A0717);
                c0ol.A00 = A002.getInt(A0718);
                c0ol.A08 = C07K.A0b(A002.getInt(A0719));
                c0ol.A01 = A002.getLong(A0720);
                c0ol.A06 = A002.getLong(A0721);
                c0ol.A05 = A002.getLong(A0722);
                c0ol.A07 = A002.getLong(A0723);
                boolean z = false;
                if (A002.getInt(A0724) != 0) {
                    z = true;
                }
                c0ol.A0G = z;
                c0ol.A09 = c0oh;
                arrayList.add(c0ol);
            }
            A002.close();
            A00.A01();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            A002.close();
            A00.A01();
            throw th;
        }
    }

    public List A04() {
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
        C28911Uj A00 = C28911Uj.A00("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=1", 0);
        AbstractC15540ov abstractC15540ov = this.A01;
        abstractC15540ov.A02();
        Cursor A002 = C15600p1.A00(abstractC15540ov, A00, false);
        try {
            A07 = C07O.A07(A002, "required_network_type");
            A072 = C07O.A07(A002, "requires_charging");
            A073 = C07O.A07(A002, "requires_device_idle");
            A074 = C07O.A07(A002, "requires_battery_not_low");
            A075 = C07O.A07(A002, "requires_storage_not_low");
            A076 = C07O.A07(A002, "trigger_content_update_delay");
            A077 = C07O.A07(A002, "trigger_max_content_delay");
            A078 = C07O.A07(A002, "content_uri_triggers");
            A079 = C07O.A07(A002, "id");
            A0710 = C07O.A07(A002, "state");
            A0711 = C07O.A07(A002, "worker_class_name");
            A0712 = C07O.A07(A002, "input_merger_class_name");
            A0713 = C07O.A07(A002, "input");
            A0714 = C07O.A07(A002, "output");
        } catch (Throwable th) {
            th = th;
        }
        try {
            int A0715 = C07O.A07(A002, "initial_delay");
            int A0716 = C07O.A07(A002, "interval_duration");
            int A0717 = C07O.A07(A002, "flex_duration");
            int A0718 = C07O.A07(A002, "run_attempt_count");
            int A0719 = C07O.A07(A002, "backoff_policy");
            int A0720 = C07O.A07(A002, "backoff_delay_duration");
            int A0721 = C07O.A07(A002, "period_start_time");
            int A0722 = C07O.A07(A002, "minimum_retention_duration");
            int A0723 = C07O.A07(A002, "schedule_requested_at");
            int A0724 = C07O.A07(A002, "run_in_foreground");
            ArrayList arrayList = new ArrayList(A002.getCount());
            while (A002.moveToNext()) {
                String string = A002.getString(A079);
                String string2 = A002.getString(A0711);
                C0OH c0oh = new C0OH();
                c0oh.A03 = C07K.A0d(A002.getInt(A07));
                c0oh.A05 = A002.getInt(A072) != 0;
                c0oh.A06 = A002.getInt(A073) != 0;
                c0oh.A04 = A002.getInt(A074) != 0;
                c0oh.A07 = A002.getInt(A075) != 0;
                c0oh.A00 = A002.getLong(A076);
                c0oh.A01 = A002.getLong(A077);
                c0oh.A02 = C07K.A0c(A002.getBlob(A078));
                C0OL c0ol = new C0OL(string, string2);
                c0ol.A0C = C07K.A0e(A002.getInt(A0710));
                c0ol.A0E = A002.getString(A0712);
                c0ol.A0A = C0OF.A00(A002.getBlob(A0713));
                c0ol.A0B = C0OF.A00(A002.getBlob(A0714));
                c0ol.A03 = A002.getLong(A0715);
                c0ol.A04 = A002.getLong(A0716);
                c0ol.A02 = A002.getLong(A0717);
                c0ol.A00 = A002.getInt(A0718);
                c0ol.A08 = C07K.A0b(A002.getInt(A0719));
                c0ol.A01 = A002.getLong(A0720);
                c0ol.A06 = A002.getLong(A0721);
                c0ol.A05 = A002.getLong(A0722);
                c0ol.A07 = A002.getLong(A0723);
                boolean z = false;
                if (A002.getInt(A0724) != 0) {
                    z = true;
                }
                c0ol.A0G = z;
                c0ol.A09 = c0oh;
                arrayList.add(c0ol);
            }
            A002.close();
            A00.A01();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            A002.close();
            A00.A01();
            throw th;
        }
    }

    public List A05() {
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
        C28911Uj A00 = C28911Uj.A00("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        AbstractC15540ov abstractC15540ov = this.A01;
        abstractC15540ov.A02();
        Cursor A002 = C15600p1.A00(abstractC15540ov, A00, false);
        try {
            A07 = C07O.A07(A002, "required_network_type");
            A072 = C07O.A07(A002, "requires_charging");
            A073 = C07O.A07(A002, "requires_device_idle");
            A074 = C07O.A07(A002, "requires_battery_not_low");
            A075 = C07O.A07(A002, "requires_storage_not_low");
            A076 = C07O.A07(A002, "trigger_content_update_delay");
            A077 = C07O.A07(A002, "trigger_max_content_delay");
            A078 = C07O.A07(A002, "content_uri_triggers");
            A079 = C07O.A07(A002, "id");
            A0710 = C07O.A07(A002, "state");
            A0711 = C07O.A07(A002, "worker_class_name");
            A0712 = C07O.A07(A002, "input_merger_class_name");
            A0713 = C07O.A07(A002, "input");
            A0714 = C07O.A07(A002, "output");
        } catch (Throwable th) {
            th = th;
        }
        try {
            int A0715 = C07O.A07(A002, "initial_delay");
            int A0716 = C07O.A07(A002, "interval_duration");
            int A0717 = C07O.A07(A002, "flex_duration");
            int A0718 = C07O.A07(A002, "run_attempt_count");
            int A0719 = C07O.A07(A002, "backoff_policy");
            int A0720 = C07O.A07(A002, "backoff_delay_duration");
            int A0721 = C07O.A07(A002, "period_start_time");
            int A0722 = C07O.A07(A002, "minimum_retention_duration");
            int A0723 = C07O.A07(A002, "schedule_requested_at");
            int A0724 = C07O.A07(A002, "run_in_foreground");
            ArrayList arrayList = new ArrayList(A002.getCount());
            while (A002.moveToNext()) {
                String string = A002.getString(A079);
                String string2 = A002.getString(A0711);
                C0OH c0oh = new C0OH();
                c0oh.A03 = C07K.A0d(A002.getInt(A07));
                c0oh.A05 = A002.getInt(A072) != 0;
                c0oh.A06 = A002.getInt(A073) != 0;
                c0oh.A04 = A002.getInt(A074) != 0;
                c0oh.A07 = A002.getInt(A075) != 0;
                c0oh.A00 = A002.getLong(A076);
                c0oh.A01 = A002.getLong(A077);
                c0oh.A02 = C07K.A0c(A002.getBlob(A078));
                C0OL c0ol = new C0OL(string, string2);
                c0ol.A0C = C07K.A0e(A002.getInt(A0710));
                c0ol.A0E = A002.getString(A0712);
                c0ol.A0A = C0OF.A00(A002.getBlob(A0713));
                c0ol.A0B = C0OF.A00(A002.getBlob(A0714));
                c0ol.A03 = A002.getLong(A0715);
                c0ol.A04 = A002.getLong(A0716);
                c0ol.A02 = A002.getLong(A0717);
                c0ol.A00 = A002.getInt(A0718);
                c0ol.A08 = C07K.A0b(A002.getInt(A0719));
                c0ol.A01 = A002.getLong(A0720);
                c0ol.A06 = A002.getLong(A0721);
                c0ol.A05 = A002.getLong(A0722);
                c0ol.A07 = A002.getLong(A0723);
                boolean z = false;
                if (A002.getInt(A0724) != 0) {
                    z = true;
                }
                c0ol.A0G = z;
                c0ol.A09 = c0oh;
                arrayList.add(c0ol);
            }
            A002.close();
            A00.A01();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            A002.close();
            A00.A01();
            throw th;
        }
    }

    public List A06(final String name) {
        C28911Uj A00 = C28911Uj.A00("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (name == null) {
            A00.A03[1] = 1;
        } else {
            A00.A02(1, name);
        }
        AbstractC15540ov abstractC15540ov = this.A01;
        abstractC15540ov.A02();
        Cursor A002 = C15600p1.A00(abstractC15540ov, A00, false);
        try {
            int A07 = C07O.A07(A002, "id");
            int A072 = C07O.A07(A002, "state");
            ArrayList arrayList = new ArrayList(A002.getCount());
            while (A002.moveToNext()) {
                C16990rM c16990rM = new C16990rM();
                c16990rM.A01 = A002.getString(A07);
                c16990rM.A00 = C07K.A0e(A002.getInt(A072));
                arrayList.add(c16990rM);
            }
            return arrayList;
        } finally {
            A002.close();
            A00.A01();
        }
    }

    public final void A07(final C006702y _map) {
        ArrayList arrayList;
        int i;
        C06410Ta c06410Ta = (C06410Ta) _map.keySet();
        if (c06410Ta.isEmpty()) {
            return;
        }
        if (((C006802z) _map).A00 > 999) {
            C006702y c006702y = new C006702y(999);
            int i2 = ((C006802z) _map).A00;
            int i3 = 0;
            loop0: while (true) {
                i = 0;
                while (i3 < i2) {
                    Object[] objArr = _map.A02;
                    int i4 = i3 << 1;
                    c006702y.put(objArr[i4], objArr[i4 + 1]);
                    i3++;
                    i++;
                    if (i == 999) {
                        break;
                    }
                }
                A07(c006702y);
                c006702y = new C006702y(999);
            }
            if (i > 0) {
                A07(c006702y);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = c06410Ta.size();
        A00(sb, size);
        sb.append(")");
        C28911Uj A00 = C28911Uj.A00(sb.toString(), size + 0);
        Iterator it = c06410Ta.iterator();
        int i5 = 1;
        while (true) {
            C06440Td c06440Td = (C06440Td) it;
            if (!c06440Td.hasNext()) {
                break;
            }
            String str = (String) c06440Td.next();
            if (str == null) {
                A00.A03[i5] = 1;
            } else {
                A00.A02(i5, str);
            }
            i5++;
        }
        Cursor A002 = C15600p1.A00(this.A01, A00, false);
        try {
            int columnIndex = A002.getColumnIndex("work_spec_id");
            if (columnIndex < 0) {
                StringBuilder sb2 = new StringBuilder("`");
                sb2.append("work_spec_id");
                sb2.append("`");
                columnIndex = A002.getColumnIndex(sb2.toString());
                if (columnIndex == -1) {
                    return;
                }
            }
            while (A002.moveToNext()) {
                if (!A002.isNull(columnIndex) && (arrayList = (ArrayList) _map.get(A002.getString(columnIndex))) != null) {
                    arrayList.add(C0OF.A00(A002.getBlob(0)));
                }
            }
        } finally {
            A002.close();
        }
    }

    public final void A08(final C006702y _map) {
        ArrayList arrayList;
        int i;
        C06410Ta c06410Ta = (C06410Ta) _map.keySet();
        if (c06410Ta.isEmpty()) {
            return;
        }
        if (((C006802z) _map).A00 > 999) {
            C006702y c006702y = new C006702y(999);
            int i2 = ((C006802z) _map).A00;
            int i3 = 0;
            loop0: while (true) {
                i = 0;
                while (i3 < i2) {
                    Object[] objArr = _map.A02;
                    int i4 = i3 << 1;
                    c006702y.put(objArr[i4], objArr[i4 + 1]);
                    i3++;
                    i++;
                    if (i == 999) {
                        break;
                    }
                }
                A08(c006702y);
                c006702y = new C006702y(999);
            }
            if (i > 0) {
                A08(c006702y);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = c06410Ta.size();
        A00(sb, size);
        sb.append(")");
        C28911Uj A00 = C28911Uj.A00(sb.toString(), size + 0);
        Iterator it = c06410Ta.iterator();
        int i5 = 1;
        while (true) {
            C06440Td c06440Td = (C06440Td) it;
            if (!c06440Td.hasNext()) {
                break;
            }
            String str = (String) c06440Td.next();
            if (str == null) {
                A00.A03[i5] = 1;
            } else {
                A00.A02(i5, str);
            }
            i5++;
        }
        Cursor A002 = C15600p1.A00(this.A01, A00, false);
        try {
            int columnIndex = A002.getColumnIndex("work_spec_id");
            if (columnIndex < 0) {
                StringBuilder sb2 = new StringBuilder("`");
                sb2.append("work_spec_id");
                sb2.append("`");
                columnIndex = A002.getColumnIndex(sb2.toString());
                if (columnIndex == -1) {
                    return;
                }
            }
            while (A002.moveToNext()) {
                if (!A002.isNull(columnIndex) && (arrayList = (ArrayList) _map.get(A002.getString(columnIndex))) != null) {
                    arrayList.add(A002.getString(0));
                }
            }
        } finally {
            A002.close();
        }
    }

    public void A09(final C07M state, final String... ids) {
        AbstractC15540ov abstractC15540ov = this.A01;
        abstractC15540ov.A02();
        StringBuilder sb = new StringBuilder("UPDATE workspec SET state=");
        sb.append("?");
        sb.append(" WHERE id IN (");
        A00(sb, ids.length);
        sb.append(")");
        C38621oi A00 = abstractC15540ov.A00(sb.toString());
        SQLiteProgram sQLiteProgram = ((C28961Up) A00).A00;
        sQLiteProgram.bindLong(1, C07K.A0D(state));
        int i = 2;
        for (String str : ids) {
            if (str == null) {
                sQLiteProgram.bindNull(i);
            } else {
                sQLiteProgram.bindString(i, str);
            }
            i++;
        }
        abstractC15540ov.A03();
        try {
            A00.A00.executeUpdateDelete();
            abstractC15540ov.A05();
        } finally {
            abstractC15540ov.A04();
        }
    }

    public void A0A(final String id) {
        AbstractC15540ov abstractC15540ov = this.A01;
        abstractC15540ov.A02();
        AbstractC15570oy abstractC15570oy = this.A02;
        C38621oi A00 = abstractC15570oy.A00();
        if (id == null) {
            ((C28961Up) A00).A00.bindNull(1);
        } else {
            ((C28961Up) A00).A00.bindString(1, id);
        }
        abstractC15540ov.A03();
        try {
            A00.A00.executeUpdateDelete();
            abstractC15540ov.A05();
            abstractC15540ov.A04();
            if (A00 == abstractC15570oy.A02) {
                abstractC15570oy.A01.set(false);
            }
        } catch (Throwable th) {
            abstractC15540ov.A04();
            abstractC15570oy.A02(A00);
            throw th;
        }
    }

    public void A0B(final String id, final long startTime) {
        AbstractC15540ov abstractC15540ov = this.A01;
        abstractC15540ov.A02();
        AbstractC15570oy abstractC15570oy = this.A04;
        C38621oi A00 = abstractC15570oy.A00();
        SQLiteProgram sQLiteProgram = ((C28961Up) A00).A00;
        sQLiteProgram.bindLong(1, startTime);
        if (id == null) {
            sQLiteProgram.bindNull(2);
        } else {
            sQLiteProgram.bindString(2, id);
        }
        abstractC15540ov.A03();
        try {
            A00.A00.executeUpdateDelete();
            abstractC15540ov.A05();
        } finally {
            abstractC15540ov.A04();
            if (A00 == abstractC15570oy.A02) {
                abstractC15570oy.A01.set(false);
            }
        }
    }

    public void A0C(final String id, final long periodStartTime) {
        AbstractC15540ov abstractC15540ov = this.A01;
        abstractC15540ov.A02();
        AbstractC15570oy abstractC15570oy = this.A08;
        C38621oi A00 = abstractC15570oy.A00();
        SQLiteProgram sQLiteProgram = ((C28961Up) A00).A00;
        sQLiteProgram.bindLong(1, periodStartTime);
        if (id == null) {
            sQLiteProgram.bindNull(2);
        } else {
            sQLiteProgram.bindString(2, id);
        }
        abstractC15540ov.A03();
        try {
            A00.A00.executeUpdateDelete();
            abstractC15540ov.A05();
        } finally {
            abstractC15540ov.A04();
            if (A00 == abstractC15570oy.A02) {
                abstractC15570oy.A01.set(false);
            }
        }
    }

    public void A0D(final String id, final C0OF output) {
        SQLiteProgram sQLiteProgram;
        AbstractC15540ov abstractC15540ov = this.A01;
        abstractC15540ov.A02();
        AbstractC15570oy abstractC15570oy = this.A07;
        C38621oi A00 = abstractC15570oy.A00();
        byte[] A01 = C0OF.A01(output);
        if (A01 == null) {
            sQLiteProgram = ((C28961Up) A00).A00;
            sQLiteProgram.bindNull(1);
        } else {
            sQLiteProgram = ((C28961Up) A00).A00;
            sQLiteProgram.bindBlob(1, A01);
        }
        if (id == null) {
            sQLiteProgram.bindNull(2);
        } else {
            sQLiteProgram.bindString(2, id);
        }
        abstractC15540ov.A03();
        try {
            A00.A00.executeUpdateDelete();
            abstractC15540ov.A05();
            abstractC15540ov.A04();
            if (A00 == abstractC15570oy.A02) {
                abstractC15570oy.A01.set(false);
            }
        } catch (Throwable th) {
            abstractC15540ov.A04();
            abstractC15570oy.A02(A00);
            throw th;
        }
    }
}
