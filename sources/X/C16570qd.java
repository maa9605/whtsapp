package X;

import android.database.sqlite.SQLiteDatabase;
import android.os.Build;

/* renamed from: X.0qd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16570qd {
    public static AbstractC15580oz A00 = new AbstractC15580oz() { // from class: X.1VT
        @Override // X.AbstractC15580oz
        public void A00(InterfaceC15820pO database) {
            SQLiteDatabase sQLiteDatabase = ((C28931Um) database).A00;
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            sQLiteDatabase.execSQL("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS alarmInfo");
            sQLiteDatabase.execSQL("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    };
    public static AbstractC15580oz A01 = new AbstractC15580oz() { // from class: X.1VU
        @Override // X.AbstractC15580oz
        public void A00(InterfaceC15820pO database) {
            if (Build.VERSION.SDK_INT >= 23) {
                ((C28931Um) database).A00.execSQL("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    };
    public static AbstractC15580oz A02 = new AbstractC15580oz() { // from class: X.1VV
        @Override // X.AbstractC15580oz
        public void A00(InterfaceC15820pO database) {
            SQLiteDatabase sQLiteDatabase = ((C28931Um) database).A00;
            sQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            sQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    };
    public static AbstractC15580oz A03 = new AbstractC15580oz() { // from class: X.1VW
        @Override // X.AbstractC15580oz
        public void A00(InterfaceC15820pO database) {
            ((C28931Um) database).A00.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    };
    public static AbstractC15580oz A04 = new AbstractC15580oz() { // from class: X.1VX
        @Override // X.AbstractC15580oz
        public void A00(InterfaceC15820pO database) {
            ((C28931Um) database).A00.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    };
    public static AbstractC15580oz A05 = new AbstractC15580oz() { // from class: X.1VY
        @Override // X.AbstractC15580oz
        public void A00(InterfaceC15820pO database) {
            ((C28931Um) database).A00.execSQL("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    };
}
