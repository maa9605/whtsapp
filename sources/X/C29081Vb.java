package X;

import android.database.sqlite.SQLiteDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.1Vb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C29081Vb extends AbstractC15550ow {
    public final /* synthetic */ WorkDatabase_Impl A00;

    public C29081Vb(WorkDatabase_Impl workDatabase_Impl) {
        this.A00 = workDatabase_Impl;
    }

    @Override // X.AbstractC15550ow
    public C15560ox A00(InterfaceC15820pO _db) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new C15610p2("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap.put("prerequisite_id", new C15610p2("prerequisite_id", "TEXT", true, 2, null, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new C15620p3("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new C15620p3("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new C15640p5("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
        hashSet2.add(new C15640p5("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
        C15650p6 c15650p6 = new C15650p6("Dependency", hashMap, hashSet, hashSet2);
        C15650p6 A00 = C15650p6.A00(_db, "Dependency");
        if (!c15650p6.equals(A00)) {
            StringBuilder sb = new StringBuilder("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n");
            sb.append(c15650p6);
            sb.append("\n Found:\n");
            sb.append(A00);
            return new C15560ox(false, sb.toString());
        }
        HashMap hashMap2 = new HashMap(24);
        hashMap2.put("id", new C15610p2("id", "TEXT", true, 1, null, 1));
        hashMap2.put("state", new C15610p2("state", "INTEGER", true, 0, null, 1));
        hashMap2.put("worker_class_name", new C15610p2("worker_class_name", "TEXT", true, 0, null, 1));
        hashMap2.put("input_merger_class_name", new C15610p2("input_merger_class_name", "TEXT", false, 0, null, 1));
        hashMap2.put("input", new C15610p2("input", "BLOB", true, 0, null, 1));
        hashMap2.put("output", new C15610p2("output", "BLOB", true, 0, null, 1));
        hashMap2.put("initial_delay", new C15610p2("initial_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("interval_duration", new C15610p2("interval_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("flex_duration", new C15610p2("flex_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_attempt_count", new C15610p2("run_attempt_count", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_policy", new C15610p2("backoff_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_delay_duration", new C15610p2("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("period_start_time", new C15610p2("period_start_time", "INTEGER", true, 0, null, 1));
        hashMap2.put("minimum_retention_duration", new C15610p2("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("schedule_requested_at", new C15610p2("schedule_requested_at", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_in_foreground", new C15610p2("run_in_foreground", "INTEGER", true, 0, null, 1));
        hashMap2.put("required_network_type", new C15610p2("required_network_type", "INTEGER", false, 0, null, 1));
        hashMap2.put("requires_charging", new C15610p2("requires_charging", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_device_idle", new C15610p2("requires_device_idle", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_battery_not_low", new C15610p2("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_storage_not_low", new C15610p2("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_content_update_delay", new C15610p2("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_max_content_delay", new C15610p2("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("content_uri_triggers", new C15610p2("content_uri_triggers", "BLOB", false, 0, null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new C15640p5("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
        hashSet4.add(new C15640p5("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
        C15650p6 c15650p62 = new C15650p6("WorkSpec", hashMap2, hashSet3, hashSet4);
        C15650p6 A002 = C15650p6.A00(_db, "WorkSpec");
        if (!c15650p62.equals(A002)) {
            StringBuilder sb2 = new StringBuilder("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n");
            sb2.append(c15650p62);
            sb2.append("\n Found:\n");
            sb2.append(A002);
            return new C15560ox(false, sb2.toString());
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new C15610p2("tag", "TEXT", true, 1, null, 1));
        hashMap3.put("work_spec_id", new C15610p2("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new C15620p3("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new C15640p5("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
        C15650p6 c15650p63 = new C15650p6("WorkTag", hashMap3, hashSet5, hashSet6);
        C15650p6 A003 = C15650p6.A00(_db, "WorkTag");
        if (!c15650p63.equals(A003)) {
            StringBuilder sb3 = new StringBuilder("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n");
            sb3.append(c15650p63);
            sb3.append("\n Found:\n");
            sb3.append(A003);
            return new C15560ox(false, sb3.toString());
        }
        HashMap hashMap4 = new HashMap(2);
        hashMap4.put("work_spec_id", new C15610p2("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap4.put("system_id", new C15610p2("system_id", "INTEGER", true, 0, null, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new C15620p3("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        C15650p6 c15650p64 = new C15650p6("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        C15650p6 A004 = C15650p6.A00(_db, "SystemIdInfo");
        if (!c15650p64.equals(A004)) {
            StringBuilder sb4 = new StringBuilder("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n");
            sb4.append(c15650p64);
            sb4.append("\n Found:\n");
            sb4.append(A004);
            return new C15560ox(false, sb4.toString());
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new C15610p2("name", "TEXT", true, 1, null, 1));
        hashMap5.put("work_spec_id", new C15610p2("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new C15620p3("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new C15640p5("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
        C15650p6 c15650p65 = new C15650p6("WorkName", hashMap5, hashSet8, hashSet9);
        C15650p6 A005 = C15650p6.A00(_db, "WorkName");
        if (!c15650p65.equals(A005)) {
            StringBuilder sb5 = new StringBuilder("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n");
            sb5.append(c15650p65);
            sb5.append("\n Found:\n");
            sb5.append(A005);
            return new C15560ox(false, sb5.toString());
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new C15610p2("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap6.put("progress", new C15610p2("progress", "BLOB", true, 0, null, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new C15620p3("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        C15650p6 c15650p66 = new C15650p6("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        C15650p6 A006 = C15650p6.A00(_db, "WorkProgress");
        if (!c15650p66.equals(A006)) {
            StringBuilder sb6 = new StringBuilder("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n");
            sb6.append(c15650p66);
            sb6.append("\n Found:\n");
            sb6.append(A006);
            return new C15560ox(false, sb6.toString());
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new C15610p2("key", "TEXT", true, 1, null, 1));
        hashMap7.put("long_value", new C15610p2("long_value", "INTEGER", false, 0, null, 1));
        C15650p6 c15650p67 = new C15650p6("Preference", hashMap7, new HashSet(0), new HashSet(0));
        C15650p6 A007 = C15650p6.A00(_db, "Preference");
        if (!c15650p67.equals(A007)) {
            StringBuilder sb7 = new StringBuilder("Preference(androidx.work.impl.model.Preference).\n Expected:\n");
            sb7.append(c15650p67);
            sb7.append("\n Found:\n");
            sb7.append(A007);
            return new C15560ox(false, sb7.toString());
        }
        return new C15560ox(true, null);
    }

    @Override // X.AbstractC15550ow
    public void A01(InterfaceC15820pO _db) {
        SQLiteDatabase sQLiteDatabase = ((C28931Um) _db).A00;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cf029002fffdcadf079e8d0a1c9a70ac')");
    }
}
