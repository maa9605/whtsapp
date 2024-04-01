package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import java.io.File;

/* renamed from: X.1yp */
/* loaded from: classes2.dex */
public class C44291yp extends SQLiteOpenHelper implements C04k {
    public static volatile C44291yp A05;
    public C0CE A00;
    public final AbstractC000600i A01;
    public final C001200o A02;
    public final C04l A03;
    public final C04Z A04;

    public C44291yp(C001200o c001200o, AbstractC000600i abstractC000600i, C04Z c04z) {
        super(c001200o.A00, "sync.db", (SQLiteDatabase.CursorFactory) null, 36);
        this.A02 = c001200o;
        this.A01 = abstractC000600i;
        this.A04 = c04z;
        this.A03 = new C04l();
    }

    public static C44291yp A00() {
        if (A05 == null) {
            synchronized (C44291yp.class) {
                if (A05 == null) {
                    A05 = new C44291yp(C001200o.A01, AbstractC000600i.A00(), C04Z.A00());
                }
            }
        }
        return A05;
    }

    public C0CD A01() {
        return new C0CD(null, this, false);
    }

    public C0CD A02() {
        return new C0CD(null, this, true);
    }

    public void A03() {
        AE6().A00.close();
        File databasePath = this.A02.A00.getDatabasePath("sync.db");
        if (!databasePath.delete()) {
            Log.w("sync-db-helper/failed to delete db");
        }
        C002501g.A0O(databasePath, "synd-db-helper");
    }

    public void A04(SQLiteDatabase sQLiteDatabase) {
        Log.i("sync-db-helper/reset");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS syncd_mutations");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS collection_versions");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS pending_mutations");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS peer_messages");
        C000200d.A0a(sQLiteDatabase, "DROP TABLE IF EXISTS encrypted_mutations", "DROP TABLE IF EXISTS msg_history_sync", "DROP TABLE IF EXISTS crypto_info", "DROP TRIGGER IF EXISTS peer_messages_bi_for_fanout_backfill_messages_trigger");
        C000200d.A0a(sQLiteDatabase, "DROP INDEX IF EXISTS peer_messages_message_key_index", "DROP TABLE IF EXISTS fanout_backfill_messages", "DROP TRIGGER IF EXISTS crypto_info_bi_for_missing_keys_trigger", "DROP TABLE IF EXISTS missing_keys");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS syncd_mutations_active_mutations_index");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS syncd_mutations_active_mutations_chat_jid_index");
        onCreate(sQLiteDatabase);
    }

    @Override // X.C04k
    public C04l ABg() {
        return this.A03;
    }

    @Override // X.C04k
    public synchronized C0CE ACk() {
        return AE6();
    }

    @Override // X.C04k
    public synchronized C0CE AE6() {
        C0CE c0ce = this.A00;
        if (c0ce == null || !c0ce.A00.isOpen()) {
            this.A00 = C002501g.A05(super.getWritableDatabase(), this.A04);
        }
        return this.A00;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized SQLiteDatabase getReadableDatabase() {
        C000700j.A08(false, "Use getReadableLoggableDatabase instead");
        return ACk().A00;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized SQLiteDatabase getWritableDatabase() {
        C000700j.A08(false, "Use getWritableLoggableDatabase instead");
        return AE6().A00;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C000200d.A0a(sQLiteDatabase, "CREATE TABLE syncd_mutations(_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, mutation_index TEXT UNIQUE NOT NULL, mutation_value BLOB, mutation_version INTEGER NOT NULL, collection_name TEXT NOT NULL, are_dependencies_missing BOOLEAN NOT NULL, mutation_mac BLOB, device_id INTEGER NOT NULL, epoch INTEGER NOT NULL, chat_jid TEXT )", "CREATE TABLE collection_versions (collection_name TEXT PRIMARY KEY, version INTEGER NOT NULL, lt_hash BLOB, dirty_version INTEGER NOT NULL DEFAULT -1 ) ", "CREATE TABLE pending_mutations(_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, mutation_index TEXT UNIQUE NOT NULL, mutation_value BLOB, mutation_version INTEGER NOT NULL, operation BLOB NOT NULL, is_ready_to_sync BOOLEAN NOT NULL, collection_name TEXT, device_id INTEGER, epoch INTEGER, are_dependencies_missing BOOLEAN NOT NULL )", "CREATE TABLE peer_messages(_id INTEGER PRIMARY KEY AUTOINCREMENT,message_type INTEGER NOT NULL, key_remote_jid TEXT NOT NULL, key_from_me INTEGER, key_id TEXT NOT NULL, device_id TEXT, timestamp INTEGER, data TEXT, acked BOOLEAN )");
        C000200d.A0a(sQLiteDatabase, "CREATE TABLE encrypted_mutations (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, key_id BLOB NOT NULL, operation BLOB NOT NULL, index_hash BLOB NOT NULL, index_and_value_cipher_text BLOB NOT NULL)", "CREATE TABLE msg_history_sync(_id INTEGER PRIMARY KEY AUTOINCREMENT, device_id TEXT NOT NULL, sync_type INTEGER NOT NULL, last_processed_msg_row_id INTEGER, oldest_msg_row_id INTEGER, sent_msgs_count INTEGER, chunk_order INTEGER, sent_bytes INTEGER, last_chunk_timestamp INTEGER, status INTEGER, peer_msg_row_id INTEGER, oldest_message_to_sync_row_id INTEGER)", "CREATE TABLE crypto_info (device_id INTEGER NOT NULL, epoch INTEGER NOT NULL, key_data BLOB NOT NULL, timestamp INTEGER NOT NULL, fingerprint BLOB NOT NULL, stale_timestamp INTEGER NOT NULL DEFAULT 0, PRIMARY KEY ( device_id , epoch ) )", "CREATE TABLE missing_keys (device_id INTEGER NOT NULL, epoch INTEGER NOT NULL, collection_name TEXT NOT NULL, PRIMARY KEY ( device_id , epoch , collection_name ) )");
        C000200d.A0Z(sQLiteDatabase, "CREATE TRIGGER crypto_info_bi_for_missing_keys_trigger AFTER INSERT ON crypto_info BEGIN DELETE FROM missing_keys WHERE device_id=new.device_id AND epoch=new.epoch; END", "CREATE INDEX IF NOT EXISTS syncd_mutations_active_mutations_index ON syncd_mutations (are_dependencies_missing)", "CREATE INDEX IF NOT EXISTS syncd_mutations_active_mutations_chat_jid_index ON syncd_mutations (chat_jid, are_dependencies_missing)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C000200d.A0t("sync-db-helper/onDowngrade oldVersion:", i, ", newVersion:", i2);
        A04(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C000200d.A0t("sync-db-helper/onUpgrade oldVersion:", i, ", newVersion:", i2);
        switch (i) {
            case 23:
                C000200d.A0a(sQLiteDatabase, "DROP TRIGGER IF EXISTS crypto_info_bi_for_missing_keys_trigger", "DROP TABLE IF EXISTS missing_keys", "CREATE TABLE missing_keys (device_id INTEGER NOT NULL, epoch INTEGER NOT NULL, collection_name TEXT NOT NULL, PRIMARY KEY ( device_id , epoch , collection_name ) )", "CREATE TRIGGER crypto_info_bi_for_missing_keys_trigger AFTER INSERT ON crypto_info BEGIN DELETE FROM missing_keys WHERE device_id=new.device_id AND epoch=new.epoch; END");
            case 24:
                C000200d.A0Z(sQLiteDatabase, "DROP TRIGGER IF EXISTS peer_messages_bi_for_fanout_backfill_messages_trigger", "DROP INDEX IF EXISTS peer_messages_message_key_index", "DROP TABLE IF EXISTS fanout_backfill_messages");
            case 25:
                sQLiteDatabase.execSQL("ALTER TABLE collection_versions ADD lt_hash BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE syncd_mutations ADD mutation_mac BLOB");
            case 26:
                sQLiteDatabase.execSQL("ALTER TABLE msg_history_sync ADD oldest_message_to_sync_row_id INTEGER");
            case 27:
                sQLiteDatabase.execSQL("ALTER TABLE pending_mutations ADD is_ready_to_sync BOOLEAN NOT NULL DEFAULT 1");
            case 28:
                sQLiteDatabase.execSQL("ALTER TABLE pending_mutations ADD collection_name TEXT");
            case 29:
                C000200d.A0a(sQLiteDatabase, "ALTER TABLE pending_mutations ADD device_id INTEGER", "ALTER TABLE pending_mutations ADD epoch INTEGER", "ALTER TABLE syncd_mutations ADD device_id INTEGER NOT NULL DEFAULT 0", "ALTER TABLE syncd_mutations ADD epoch INTEGER NOT NULL DEFAULT 0");
            case 30:
                sQLiteDatabase.execSQL("ALTER TABLE crypto_info ADD stale_timestamp INTEGER NOT NULL DEFAULT 0");
            case 31:
                sQLiteDatabase.execSQL("ALTER TABLE pending_mutations ADD are_dependencies_missing BOOLEAN NOT NULL DEFAULT 0");
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                sQLiteDatabase.execSQL("ALTER TABLE syncd_mutations ADD chat_jid TEXT");
            case 33:
                sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS syncd_mutations_active_mutations_index ON syncd_mutations (are_dependencies_missing)");
                sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS syncd_mutations_active_mutations_chat_jid_index ON syncd_mutations (chat_jid, are_dependencies_missing)");
            case 34:
                sQLiteDatabase.execSQL("ALTER TABLE collection_versions ADD dirty_version INTEGER NOT NULL DEFAULT -1");
                break;
            case 35:
                break;
            default:
                StringBuilder sb = new StringBuilder("sync-db-helper/onUpgrade unknown oldVersion:");
                sb.append(i);
                sb.append(", newVersion:");
                sb.append(i2);
                Log.e(sb.toString());
                A04(sQLiteDatabase);
                return;
        }
        sQLiteDatabase.execSQL("ALTER TABLE peer_messages ADD acked BOOLEAN ");
    }
}
