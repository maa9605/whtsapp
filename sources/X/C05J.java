package X;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteTransactionListener;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.05J */
/* loaded from: classes.dex */
public class C05J extends SQLiteOpenHelper implements C04k {
    public C0CE A00;
    public Boolean A01;
    public Integer A02;
    public boolean A03;
    public final C01B A04;
    public final C000500h A05;
    public final C05F A06;
    public final C04l A07;
    public final C04Z A08;
    public final C05G A09;
    public final File A0A;
    public final Object A0B;
    public volatile Boolean A0C;

    public C05J(Context context, C01B c01b, C04Z c04z, C05F c05f, C000500h c000500h, C04l c04l, C05G c05g, File file) {
        super(context, "msgstore.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.A0B = new Object();
        this.A0C = null;
        this.A01 = null;
        this.A04 = c01b;
        this.A08 = c04z;
        this.A06 = c05f;
        this.A05 = c000500h;
        this.A07 = c04l;
        this.A09 = c05g;
        this.A0A = file;
    }

    public static int A00(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            return Integer.parseInt(A05(sQLiteDatabase, str, String.valueOf(0)));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static Pair A01() {
        String lowerCase = String.format("%s_bu_for_%s_trigger", "message_ephemeral", "message_ephemeral_remove_column").toLowerCase(Locale.getDefault());
        return new Pair(lowerCase, String.format("CREATE TRIGGER %s BEFORE UPDATE ON %s BEGIN %s; END", lowerCase, "message_ephemeral", "UPDATE message_ephemeral_remove_column SET duration=new.duration, expire_timestamp=new.expire_timestamp WHERE message_row_id=new.message_row_id"));
    }

    public static Pair A02(String str, String str2, String str3) {
        String lowerCase = String.format("%s_bd_for_%s_trigger", str, str2).toLowerCase(Locale.getDefault());
        return new Pair(lowerCase, String.format("CREATE TRIGGER %s BEFORE DELETE ON %s BEGIN DELETE FROM %s WHERE %s; END", lowerCase, str, str2, str3));
    }

    public static Pair A03(String str, String str2, String str3) {
        String lowerCase = String.format("%s_bi_for_%s_trigger", str, str2).toLowerCase(Locale.getDefault());
        return new Pair(lowerCase, String.format("CREATE TRIGGER %s BEFORE INSERT ON %s BEGIN %s; END", lowerCase, str, str3));
    }

    public static Pair A04(String str, String str2, boolean z) {
        if (!z) {
            return A02("messages", str, str2);
        }
        return A02("message", str, str2);
    }

    public static String A05(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT value FROM props WHERE key = ?", new String[]{str});
        try {
            if (!rawQuery.moveToNext()) {
                rawQuery.close();
                return str2;
            }
            String string = rawQuery.getString(0);
            rawQuery.close();
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (rawQuery != null) {
                    try {
                        rawQuery.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        }
    }

    public static String A06(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        String str3 = "";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("select sql from sqlite_master where type='");
            sb.append(str);
            sb.append("' and name='");
            sb.append(str2);
            sb.append("';");
            Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
            if (rawQuery != null && rawQuery.moveToNext()) {
                str3 = rawQuery.getString(0);
            }
            if (rawQuery != null) {
                rawQuery.close();
                return str3;
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("databasehelper/getSqlFor view = ");
            sb2.append(str2);
            Log.e(sb2.toString(), e);
        }
        return str3;
    }

    public static String A07(C0CE c0ce, String str) {
        return A06(c0ce.A00, "table", str);
    }

    public static final void A08(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        if (TextUtils.isEmpty(A06(sQLiteDatabase, "table", str))) {
            sQLiteDatabase.execSQL(str2);
        }
    }

    public static void A09(C0CE c0ce, String str) {
        String A0H = C000200d.A0H("DROP TABLE IF EXISTS ", str);
        C002501g.A0E("dropLoggableDatabaseTables", C000200d.A0H("DROP_", str));
        c0ce.A0C(A0H);
    }

    public static void A0A(C0CE c0ce, String str) {
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("key", "msgtore_db_schema_version");
        contentValues.put("value", str);
        C002501g.A0E("setProp", "REPLACE_PROPS");
        c0ce.A05("props", contentValues);
    }

    public static void A0B(C0CE c0ce, String str, long j) {
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("key", str);
        contentValues.put("value", Long.valueOf(j));
        C002501g.A0E("setProp", "REPLACE_PROPS");
        c0ce.A05("props", contentValues);
    }

    public static void A0C(C0CE c0ce, String str, String str2) {
        C002501g.A0E("dropLoggableDatabaseTables", C000200d.A0H("DROP_", str));
        c0ce.A0C(str2);
    }

    public static void A0D(C0CE c0ce, boolean z) {
        SQLiteDatabase sQLiteDatabase = c0ce.A00;
        sQLiteDatabase.beginTransaction();
        try {
            c0ce.A0C("DROP VIEW IF EXISTS legacy_available_messages_view");
            c0ce.A0C("DROP VIEW IF EXISTS message_view");
            c0ce.A0C("DROP VIEW IF EXISTS available_message_view");
            c0ce.A0C("DROP VIEW IF EXISTS deleted_messages_view");
            c0ce.A0C("DROP VIEW IF EXISTS deleted_messages_ids_view");
            if (!z) {
                c0ce.A0C("CREATE VIEW legacy_available_messages_view AS\n SELECT messages.*, chat._id AS chat_row_id,expire_timestamp\n FROM messages AS messages\n    JOIN\n        jid AS jid\n    ON\n        jid.raw_string = messages.key_remote_jid\n    JOIN\n        chat AS chat\n    ON\n        chat.jid_row_id = jid._id\n    LEFT JOIN\n        deleted_chat_job as job\n    ON \n        job.chat_row_id = chat._id    LEFT JOIN\n        message_ephemeral AS message_ephemeral\n    ON messages._id = message_ephemeral.message_row_id\n WHERE IFNULL(NOT((IFNULL(messages.starred, 0) = 0 AND messages._id <= IFNULL(job.deleted_message_row_id, 1)) OR (IFNULL(messages.starred, 0) = 1 AND messages._id <= IFNULL(job.deleted_starred_message_row_id, 1)) OR ( (job.deleted_message_categories IS NOT NULL) AND   (job.deleted_message_categories LIKE '%\"' || messages.media_wa_type || '\"%') AND   ( (IFNULL(messages.starred, 0) = 0 AND messages._id <= IFNULL(job.deleted_categories_message_row_id, 1)) OR (IFNULL(messages.starred, 0) = 1 AND messages._id <= IFNULL(job.deleted_categories_starred_message_row_id, 1)) ))), 0)");
                c0ce.A0C("CREATE VIEW message_view AS SELECT messages._id AS _id, messages._id AS sort_id, chat._id AS chat_row_id, key_from_me AS from_me, key_id, -1 AS sender_jid_row_id, remote_resource AS sender_jid_raw_string, status, needs_push AS broadcast, recipient_count, participant_hash, forwarded AS origination_flags, origin, timestamp, received_timestamp, receipt_server_timestamp, CAST (CASE WHEN (messages.media_wa_type = 0 AND messages.status=6) THEN 7 ELSE messages.media_wa_type END AS INTEGER) AS message_type, '' as text_data, starred, lookup_tables, data, media_url, media_mime_type, media_size, media_name, media_caption, media_hash, media_duration, latitude, longitude, thumb_image, raw_data, quoted_row_id, mentioned_jids, multicast_id, edit_version, media_enc_hash, payment_transaction_id, preview_type, receipt_device_timestamp, read_device_timestamp, played_device_timestamp, 1 AS table_version FROM messages JOIN jid AS chat_jid ON messages.key_remote_jid= chat_jid.raw_string JOIN chat AS chat ON chat.jid_row_id = chat_jid._id");
                c0ce.A0C("CREATE VIEW available_message_view AS SELECT messages._id AS _id, messages._id AS sort_id, chat._id AS chat_row_id, key_from_me AS from_me, key_id, -1 AS sender_jid_row_id, remote_resource AS sender_jid_raw_string, status, needs_push AS broadcast, recipient_count, participant_hash, forwarded AS origination_flags, origin, timestamp, received_timestamp, receipt_server_timestamp, CAST (CASE WHEN (messages.media_wa_type = 0 AND messages.status=6) THEN 7 ELSE messages.media_wa_type END AS INTEGER) AS message_type, '' as text_data, starred, lookup_tables, data, media_url, media_mime_type, media_size, media_name, media_caption, media_hash, media_duration, latitude, longitude, thumb_image, raw_data, quoted_row_id, mentioned_jids, multicast_id, edit_version, media_enc_hash, payment_transaction_id, preview_type, receipt_device_timestamp, read_device_timestamp, played_device_timestamp, 1 AS table_version, expire_timestamp FROM messages JOIN jid AS chat_jid ON messages.key_remote_jid= chat_jid.raw_string JOIN chat AS chat ON chat.jid_row_id = chat_jid._id LEFT JOIN message_ephemeral AS message_ephemeral ON messages._id = message_ephemeral.message_row_id LEFT JOIN deleted_chat_job AS job ON job.chat_row_id = chat._id WHERE IFNULL(NOT((IFNULL(messages.starred, 0) = 0 AND messages._id <= IFNULL(job.deleted_message_row_id, 1)) OR (IFNULL(messages.starred, 0) = 1 AND messages._id <= IFNULL(job.deleted_starred_message_row_id, 1)) OR ( (job.deleted_message_categories IS NOT NULL) AND   (job.deleted_message_categories LIKE '%\"' || messages.media_wa_type || '\"%') AND   ( (IFNULL(messages.starred, 0) = 0 AND messages._id <= IFNULL(job.deleted_categories_message_row_id, 1)) OR (IFNULL(messages.starred, 0) = 1 AND messages._id <= IFNULL(job.deleted_categories_starred_message_row_id, 1)) ))), 0)");
                c0ce.A0C("CREATE VIEW IF NOT EXISTS deleted_messages_view AS \n SELECT messages._id AS _id, messages._id AS sort_id, chat._id AS chat_row_id, key_from_me AS from_me, key_id, -1 AS sender_jid_row_id, remote_resource AS sender_jid_raw_string, status, needs_push AS broadcast, recipient_count, participant_hash, forwarded AS origination_flags, origin, timestamp, received_timestamp, receipt_server_timestamp, CAST (CASE WHEN (messages.media_wa_type = 0 AND messages.status=6) THEN 7 ELSE messages.media_wa_type END AS INTEGER) AS message_type, '' as text_data, starred, lookup_tables, data, media_url, media_mime_type, media_size, media_name, media_caption, media_hash, media_duration, latitude, longitude, thumb_image, raw_data, quoted_row_id, mentioned_jids, multicast_id, edit_version, media_enc_hash, payment_transaction_id, preview_type, receipt_device_timestamp, read_device_timestamp, played_device_timestamp, 1 AS table_version, \n (( ((job.deleted_messages_remove_files == 1) AND ((IFNULL(messages.starred, 0) = 0 AND messages._id <= IFNULL(job.deleted_message_row_id, 1)) OR (IFNULL(messages.starred, 0) = 1 AND messages._id <= IFNULL(job.deleted_starred_message_row_id, 1)))) OR   ((job.deleted_categories_remove_files == 1) AND ( (job.deleted_message_categories IS NOT NULL) AND   (job.deleted_message_categories LIKE '%\"' || messages.media_wa_type || '\"%') AND   ( (IFNULL(messages.starred, 0) = 0 AND messages._id <= IFNULL(job.deleted_categories_message_row_id, 1)) OR (IFNULL(messages.starred, 0) = 1 AND messages._id <= IFNULL(job.deleted_categories_starred_message_row_id, 1)) ))))) as remove_files \n FROM deleted_chat_job AS job\n JOIN chat AS chat ON job.chat_row_id = chat._id JOIN jid AS chat_jid ON chat.jid_row_id = chat_jid._id\n LEFT JOIN messages AS messages ON messages.key_remote_jid = chat_jid.raw_string\n WHERE IFNULL((IFNULL(messages.starred, 0) = 0 AND messages._id <= IFNULL(job.deleted_message_row_id, 1)) OR (IFNULL(messages.starred, 0) = 1 AND messages._id <= IFNULL(job.deleted_starred_message_row_id, 1)) OR ( (job.deleted_message_categories IS NOT NULL) AND   (job.deleted_message_categories LIKE '%\"' || messages.media_wa_type || '\"%') AND   ( (IFNULL(messages.starred, 0) = 0 AND messages._id <= IFNULL(job.deleted_categories_message_row_id, 1)) OR (IFNULL(messages.starred, 0) = 1 AND messages._id <= IFNULL(job.deleted_categories_starred_message_row_id, 1)) )), 0) \n ORDER BY messages._id");
                c0ce.A0C("CREATE VIEW IF NOT EXISTS deleted_messages_ids_view AS \n SELECT messages._id AS _id, CAST (CASE WHEN (messages.media_wa_type = 0 AND messages.status=6) THEN 7 ELSE messages.media_wa_type END AS INTEGER) AS message_type, job.chat_row_id AS chat_row_id FROM deleted_chat_job AS job\n JOIN chat AS chat ON job.chat_row_id = chat._id JOIN jid AS chat_jid ON chat.jid_row_id = chat_jid._id\n LEFT JOIN messages AS messages ON messages.key_remote_jid = chat_jid.raw_string\n WHERE IFNULL((IFNULL(messages.starred, 0) = 0 AND messages._id <= IFNULL(job.deleted_message_row_id, 1)) OR (IFNULL(messages.starred, 0) = 1 AND messages._id <= IFNULL(job.deleted_starred_message_row_id, 1)) OR ( (job.deleted_message_categories IS NOT NULL) AND   (job.deleted_message_categories LIKE '%\"' || messages.media_wa_type || '\"%') AND   ( (IFNULL(messages.starred, 0) = 0 AND messages._id <= IFNULL(job.deleted_categories_message_row_id, 1)) OR (IFNULL(messages.starred, 0) = 1 AND messages._id <= IFNULL(job.deleted_categories_starred_message_row_id, 1)) )), 0)");
            } else {
                c0ce.A0C("CREATE VIEW message_view AS SELECT message._id AS _id, message.sort_id AS sort_id, message.chat_row_id AS chat_row_id, from_me, key_id, sender_jid_row_id, NULL AS sender_jid_raw_string, status, broadcast, recipient_count, participant_hash, origination_flags, origin, timestamp, received_timestamp, receipt_server_timestamp, message_type, text_data, starred, lookup_tables, NULL AS data, NULL AS media_url, NULL AS media_mime_type, NULL AS media_size, NULL AS media_name, NULL AS media_caption, NULL AS media_hash, NULL AS media_duration, NULL AS latitude, NULL AS longitude, NULL AS thumb_image, NULL AS raw_data, NULL AS quoted_row_id, NULL AS mentioned_jids, NULL AS multicast_id, NULL AS edit_version, NULL AS media_enc_hash, NULL AS payment_transaction_id, NULL AS preview_type, NULL AS receipt_device_timestamp, NULL AS read_device_timestamp, NULL AS played_device_timestamp, 2 AS table_version FROM message");
                c0ce.A0C("CREATE VIEW available_message_view AS  SELECT message._id AS _id, message.sort_id AS sort_id, message.chat_row_id AS chat_row_id, from_me, key_id, sender_jid_row_id, NULL AS sender_jid_raw_string, status, broadcast, recipient_count, participant_hash, origination_flags, origin, timestamp, received_timestamp, receipt_server_timestamp, message_type, text_data, starred, lookup_tables, NULL AS data, NULL AS media_url, NULL AS media_mime_type, NULL AS media_size, NULL AS media_name, NULL AS media_caption, NULL AS media_hash, NULL AS media_duration, NULL AS latitude, NULL AS longitude, NULL AS thumb_image, NULL AS raw_data, NULL AS quoted_row_id, NULL AS mentioned_jids, NULL AS multicast_id, NULL AS edit_version, NULL AS media_enc_hash, NULL AS payment_transaction_id, NULL AS preview_type, NULL AS receipt_device_timestamp, NULL AS read_device_timestamp, NULL AS played_device_timestamp, 2 AS table_version, expire_timestamp FROM message LEFT JOIN deleted_chat_job AS job ON job.chat_row_id = message.chat_row_id LEFT JOIN message_ephemeral AS message_ephemeral ON message._id = message_ephemeral.message_row_id WHERE IFNULL(NOT((IFNULL(message.starred, 0) = 0 AND message._id <= IFNULL(job.deleted_message_row_id, 1)) OR (IFNULL(message.starred, 0) = 1 AND message._id <= IFNULL(job.deleted_starred_message_row_id, 1)) OR ( (job.deleted_message_categories IS NOT NULL) AND   (job.deleted_message_categories LIKE '%\"' || message.message_type || '\"%') AND   ( (IFNULL(message.starred, 0) = 0 AND message._id <= IFNULL(job.deleted_categories_message_row_id, 1)) OR (IFNULL(message.starred, 0) = 1 AND message._id <= IFNULL(job.deleted_categories_starred_message_row_id, 1)) ))), 0)");
                c0ce.A0C("CREATE VIEW IF NOT EXISTS deleted_messages_view AS \n SELECT message._id AS _id, message.sort_id AS sort_id, message.chat_row_id AS chat_row_id, from_me, key_id, sender_jid_row_id, NULL AS sender_jid_raw_string, status, broadcast, recipient_count, participant_hash, origination_flags, origin, timestamp, received_timestamp, receipt_server_timestamp, message_type, text_data, starred, lookup_tables, NULL AS data, NULL AS media_url, NULL AS media_mime_type, NULL AS media_size, NULL AS media_name, NULL AS media_caption, NULL AS media_hash, NULL AS media_duration, NULL AS latitude, NULL AS longitude, NULL AS thumb_image, NULL AS raw_data, NULL AS quoted_row_id, NULL AS mentioned_jids, NULL AS multicast_id, NULL AS edit_version, NULL AS media_enc_hash, NULL AS payment_transaction_id, NULL AS preview_type, NULL AS receipt_device_timestamp, NULL AS read_device_timestamp, NULL AS played_device_timestamp, 2 AS table_version, \n (( ((job.deleted_messages_remove_files == 1) AND ((IFNULL(message.starred, 0) = 0 AND message._id <= IFNULL(job.deleted_message_row_id, 1)) OR (IFNULL(message.starred, 0) = 1 AND message._id <= IFNULL(job.deleted_starred_message_row_id, 1)))) OR   ((job.deleted_categories_remove_files == 1) AND ( (job.deleted_message_categories IS NOT NULL) AND   (job.deleted_message_categories LIKE '%\"' || message.message_type || '\"%') AND   ( (IFNULL(message.starred, 0) = 0 AND message._id <= IFNULL(job.deleted_categories_message_row_id, 1)) OR (IFNULL(message.starred, 0) = 1 AND message._id <= IFNULL(job.deleted_categories_starred_message_row_id, 1)) ))))) as remove_files \n FROM \ndeleted_chat_job AS job JOIN message as message \n ON job.chat_row_id = message.chat_row_id \n WHERE IFNULL((IFNULL(message.starred, 0) = 0 AND message._id <= IFNULL(job.deleted_message_row_id, 1)) OR (IFNULL(message.starred, 0) = 1 AND message._id <= IFNULL(job.deleted_starred_message_row_id, 1)) OR ( (job.deleted_message_categories IS NOT NULL) AND   (job.deleted_message_categories LIKE '%\"' || message.message_type || '\"%') AND   ( (IFNULL(message.starred, 0) = 0 AND message._id <= IFNULL(job.deleted_categories_message_row_id, 1)) OR (IFNULL(message.starred, 0) = 1 AND message._id <= IFNULL(job.deleted_categories_starred_message_row_id, 1)) )), 0) \n ORDER BY message._id");
                c0ce.A0C("CREATE VIEW IF NOT EXISTS deleted_messages_ids_view AS \n SELECT message._id, message.chat_row_id, message.message_type FROM \ndeleted_chat_job AS job \n JOIN message AS message \n ON job.chat_row_id = message.chat_row_id \n WHERE IFNULL((IFNULL(message.starred, 0) = 0 AND message._id <= IFNULL(job.deleted_message_row_id, 1)) OR (IFNULL(message.starred, 0) = 1 AND message._id <= IFNULL(job.deleted_starred_message_row_id, 1)) OR ( (job.deleted_message_categories IS NOT NULL) AND   (job.deleted_message_categories LIKE '%\"' || message.message_type || '\"%') AND   ( (IFNULL(message.starred, 0) = 0 AND message._id <= IFNULL(job.deleted_categories_message_row_id, 1)) OR (IFNULL(message.starred, 0) = 1 AND message._id <= IFNULL(job.deleted_categories_starred_message_row_id, 1)) )), 0)");
            }
            c0ce.A0C("DROP VIEW IF EXISTS chat_view");
            if (A00(sQLiteDatabase, "chat_ready") == 2) {
                c0ce.A0C("CREATE VIEW chat_view AS SELECT c._id AS _id, j.raw_string AS raw_string_jid, hidden, subject, created_timestamp, display_message_row_id, last_message_row_id, last_read_message_row_id, last_read_receipt_sent_message_row_id, last_important_message_row_id, archived, sort_timestamp, mod_tag, gen, spam_detection, unseen_earliest_message_received_time, unseen_message_count, unseen_missed_calls_count, unseen_row_count, plaintext_disabled, vcard_ui_dismissed, change_number_notified_message_row_id, show_group_description, ephemeral_expiration, last_read_ephemeral_message_row_id, ephemeral_setting_timestamp, unseen_important_message_count FROM chat c LEFT JOIN jid j ON c.jid_row_id=j._id");
            } else {
                c0ce.A0C("CREATE VIEW chat_view AS SELECT -1 AS _id, key_remote_jid AS raw_string_jid, 0 AS hidden, subject, creation AS created_timestamp, message_table_id AS display_message_row_id, last_message_table_id AS last_message_row_id, last_read_message_table_id AS last_read_message_row_id, last_read_receipt_sent_message_table_id AS last_read_receipt_sent_message_row_id, last_important_message_table_id AS last_important_message_row_id, archived, sort_timestamp, mod_tag, gen, my_messages AS spam_detection, unseen_earliest_message_received_time, unseen_message_count, unseen_missed_calls_count, unseen_row_count, plaintext_disabled, vcard_ui_dismissed, change_number_notified_message_id AS change_number_notified_message_row_id, show_group_description, ephemeral_expiration, last_read_ephemeral_message_table_id AS last_read_ephemeral_message_row_id, ephemeral_setting_timestamp, 0 AS unseen_important_message_count FROM chat_list");
            }
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public static boolean A0E(SQLiteDatabase sQLiteDatabase, String str, C0CE c0ce, String str2) {
        sQLiteDatabase.execSQL(str);
        return TextUtils.isEmpty(A06(c0ce.A00, "table", str2));
    }

    public static boolean A0F(C0CE c0ce) {
        return A00(c0ce.A00, "migration_completed") == 1;
    }

    public static boolean A0G(C0CE c0ce, String str, String str2, String str3, String str4) {
        return C002501g.A0N(c0ce, str, str2, str3, str4, "DatabaseHelper");
    }

    public Pair A0H(String str) {
        return A04(str, "message_row_id=old._id", A0I(this.A00).booleanValue());
    }

    public final Boolean A0I(C0CE c0ce) {
        if (this.A0C != null) {
            return this.A0C;
        }
        C000700j.A06(c0ce != null);
        this.A0C = Boolean.valueOf(A0F(c0ce));
        return this.A0C;
    }

    public String A0J(String str) {
        C0CE c0ce = this.A00;
        if (c0ce != null) {
            return A06(c0ce.A00, "view", str);
        }
        throw null;
    }

    public void A0K(C0CD c0cd) {
        String[] strArr;
        if (this.A00 != null) {
            C03790Hb A00 = c0cd.A00();
            try {
                for (String str : C27741Oo.A00) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("message_fts");
                    sb.append(str);
                    String obj = sb.toString();
                    C0CE c0ce = this.A00;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("DROP TABLE IF EXISTS ");
                    sb2.append(obj);
                    c0ce.A0C(sb2.toString());
                    String lowerCase = String.format("%s_bd_for_%s_trigger", A0P(c0cd) ? "message" : "messages", obj).toLowerCase(Locale.getDefault());
                    C0CE c0ce2 = this.A00;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("DROP TRIGGER IF EXISTS ");
                    sb3.append(lowerCase);
                    c0ce2.A0C(sb3.toString());
                }
                A00.A00();
                return;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                    try {
                        A00.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        throw new IllegalStateException("databasehelper/dropOldFtsTables/database is not initialized");
    }

    public final void A0L(C0CE c0ce, C01B c01b) {
        Boolean bool = C000700j.A00;
        C000700j.A00 = Boolean.FALSE;
        SQLiteDatabase sQLiteDatabase = c0ce.A00;
        C0HC c0hc = new C0HC("databasehelper/createDatabaseTables");
        sQLiteDatabase.setVersion(1);
        this.A01 = Boolean.valueOf(A0Q(c0ce, c01b));
        String A06 = A06(sQLiteDatabase, "table", "messages");
        if (this.A01.booleanValue()) {
            if (TextUtils.isEmpty(A06)) {
                c0ce.A0C("CREATE TABLE messages (_id INTEGER PRIMARY KEY AUTOINCREMENT, key_remote_jid TEXT NOT NULL, key_from_me INTEGER, key_id TEXT NOT NULL, status INTEGER, needs_push INTEGER, data TEXT, timestamp INTEGER, media_url TEXT, media_mime_type TEXT, media_wa_type TEXT, media_size INTEGER, media_name TEXT, media_caption TEXT, media_hash TEXT, media_duration INTEGER, origin INTEGER, latitude REAL, longitude REAL, thumb_image TEXT, remote_resource TEXT, received_timestamp INTEGER, send_timestamp INTEGER, receipt_server_timestamp INTEGER, receipt_device_timestamp INTEGER, read_device_timestamp INTEGER, played_device_timestamp INTEGER, raw_data BLOB, recipient_count INTEGER, participant_hash TEXT, starred INTEGER, quoted_row_id INTEGER, mentioned_jids TEXT, multicast_id TEXT, edit_version INTEGER, media_enc_hash TEXT, payment_transaction_id TEXT, forwarded INTEGER, preview_type INTEGER, send_count INTEGER, lookup_tables INTEGER)");
            } else {
                C002501g.A0N(c0ce, A06, "messages", "raw_data", "BLOB", "MessagesTable");
                C002501g.A0N(c0ce, A06, "messages", "media_hash", "TEXT", "MessagesTable");
                C002501g.A0N(c0ce, A06, "messages", "media_duration", "INTEGER", "MessagesTable");
                C002501g.A0N(c0ce, A06, "messages", "origin", "INTEGER", "MessagesTable");
                C002501g.A0N(c0ce, A06, "messages", "recipient_count", "INTEGER", "MessagesTable");
                C002501g.A0N(c0ce, A06, "messages", "read_device_timestamp", "INTEGER", "MessagesTable");
                C002501g.A0N(c0ce, A06, "messages", "played_device_timestamp", "INTEGER", "MessagesTable");
                C002501g.A0N(c0ce, A06, "messages", "media_caption", "TEXT", "MessagesTable");
                C002501g.A0N(c0ce, A06, "messages", "participant_hash", "TEXT", "MessagesTable");
                C002501g.A0N(c0ce, A06, "messages", "starred", "INTEGER", "MessagesTable");
                C002501g.A0N(c0ce, A06, "messages", "quoted_row_id", "INTEGER", "MessagesTable");
                C002501g.A0N(c0ce, A06, "messages", "mentioned_jids", "TEXT", "MessagesTable");
                C002501g.A0N(c0ce, A06, "messages", "multicast_id", "TEXT", "MessagesTable");
                C002501g.A0N(c0ce, A06, "messages", "edit_version", "INTEGER", "MessagesTable");
                C002501g.A0N(c0ce, A06, "messages", "media_enc_hash", "TEXT", "MessagesTable");
                C002501g.A0N(c0ce, A06, "messages", "payment_transaction_id", "TEXT", "MessagesTable");
                C002501g.A0N(c0ce, A06, "messages", "forwarded", "INTEGER", "MessagesTable");
                C002501g.A0N(c0ce, A06, "messages", "preview_type", "INTEGER", "MessagesTable");
                C002501g.A0N(c0ce, A06, "messages", "send_count", "INTEGER", "MessagesTable");
                C002501g.A0N(c0ce, A06, "messages", "lookup_tables", "INTEGER", "MessagesTable");
            }
            c0ce.A0C("CREATE UNIQUE INDEX IF NOT EXISTS messages_key_index on messages (key_remote_jid, key_from_me, key_id)");
            c0ce.A0C(" CREATE INDEX IF NOT EXISTS media_hash_index on messages (media_hash)");
            c0ce.A0C(" CREATE INDEX IF NOT EXISTS media_type_index on messages (media_wa_type)");
            c0ce.A0C("CREATE INDEX IF NOT EXISTS media_type_jid_index on messages (key_remote_jid, media_wa_type)");
            c0ce.A0C("CREATE INDEX IF NOT EXISTS messages_jid_id_index on messages (key_remote_jid, _id)");
            c0ce.A0C("CREATE INDEX IF NOT EXISTS starred_index on messages (starred)");
        }
        c0hc.A00();
        String A062 = A06(sQLiteDatabase, "table", "message");
        if (TextUtils.isEmpty(A062)) {
            c0ce.A0C("CREATE TABLE message (_id INTEGER PRIMARY KEY AUTOINCREMENT, chat_row_id INTEGER NOT NULL, from_me INTEGER NOT NULL, key_id TEXT NOT NULL, sender_jid_row_id INTEGER, status INTEGER, broadcast INTEGER, recipient_count INTEGER, participant_hash TEXT, origination_flags INTEGER, origin INTEGER, timestamp INTEGER, received_timestamp INTEGER, receipt_server_timestamp INTEGER, message_type INTEGER, text_data TEXT, starred INTEGER, lookup_tables INTEGER, sort_id INTEGER NOT NULL DEFAULT 0 )");
        } else {
            C002501g.A0N(c0ce, A062, "message", "sort_id", "INTEGER NOT NULL DEFAULT 0", "MessageTable");
        }
        c0ce.A0C("CREATE INDEX IF NOT EXISTS message_sort_id_index ON message (sort_id)");
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", (Integer) 1);
        contentValues.put("chat_row_id", (Integer) (-1));
        contentValues.put("from_me", (Integer) 0);
        contentValues.put("key_id", "-1");
        c0ce.A02("message", contentValues);
        c0ce.A0C("CREATE UNIQUE INDEX IF NOT EXISTS message_key_index on message (chat_row_id, from_me, key_id, sender_jid_row_id)");
        c0ce.A0C("CREATE INDEX IF NOT EXISTS message_starred_index on message (starred)");
        c0ce.A0C("CREATE INDEX IF NOT EXISTS message_type_chat_index on message (chat_row_id, message_type)");
        c0ce.A0C("CREATE INDEX IF NOT EXISTS message_chat_id_index ON message (chat_row_id,_id)");
        c0ce.A0C("CREATE INDEX IF NOT EXISTS message_type_index ON message(message_type)");
        c0hc.A00();
        String A063 = A06(sQLiteDatabase, "table", "chat_list");
        if (TextUtils.isEmpty(A063)) {
            c0ce.A0C("CREATE TABLE chat_list (_id INTEGER PRIMARY KEY AUTOINCREMENT, key_remote_jid TEXT UNIQUE, message_table_id INTEGER, subject TEXT, creation INTEGER, last_read_message_table_id INTEGER, last_read_receipt_sent_message_table_id INTEGER, archived INTEGER, sort_timestamp INTEGER, mod_tag INTEGER, gen REAL, my_messages INTEGER, plaintext_disabled BOOLEAN, last_message_table_id INTEGER, unseen_earliest_message_received_time INTEGER, unseen_message_count INTEGER, unseen_missed_calls_count INTEGER, unseen_row_count INTEGER, vcard_ui_dismissed INTEGER, change_number_notified_message_id INTEGER, last_important_message_table_id INTEGER, show_group_description INTEGER, ephemeral_expiration INTEGER, last_read_ephemeral_message_table_id INTEGER, ephemeral_setting_timestamp INTEGER)");
        } else {
            C002501g.A0N(c0ce, A063, "chat_list", "subject", "TEXT", "ChatListTable");
            C002501g.A0N(c0ce, A063, "chat_list", "creation", "INTEGER", "ChatListTable");
            C002501g.A0N(c0ce, A063, "chat_list", "last_read_message_table_id", "INTEGER", "ChatListTable");
            C002501g.A0N(c0ce, A063, "chat_list", "last_read_receipt_sent_message_table_id", "INTEGER", "ChatListTable");
            C002501g.A0N(c0ce, A063, "chat_list", "archived", "INTEGER", "ChatListTable");
            C002501g.A0N(c0ce, A063, "chat_list", "sort_timestamp", "INTEGER", "ChatListTable");
            C002501g.A0N(c0ce, A063, "chat_list", "mod_tag", "INTEGER", "ChatListTable");
            C002501g.A0N(c0ce, A063, "chat_list", "gen", "REAL", "ChatListTable");
            C002501g.A0N(c0ce, A063, "chat_list", "my_messages", "INTEGER", "ChatListTable");
            C002501g.A0N(c0ce, A063, "chat_list", "plaintext_disabled", "BOOLEAN", "ChatListTable");
            C002501g.A0N(c0ce, A063, "chat_list", "last_message_table_id", "INTEGER", "ChatListTable");
            C002501g.A0N(c0ce, A063, "chat_list", "unseen_earliest_message_received_time", "INTEGER", "ChatListTable");
            C002501g.A0N(c0ce, A063, "chat_list", "unseen_message_count", "INTEGER", "ChatListTable");
            C002501g.A0N(c0ce, A063, "chat_list", "unseen_missed_calls_count", "INTEGER", "ChatListTable");
            C002501g.A0N(c0ce, A063, "chat_list", "unseen_row_count", "INTEGER", "ChatListTable");
            C002501g.A0N(c0ce, A063, "chat_list", "vcard_ui_dismissed", "INTEGER", "ChatListTable");
            C002501g.A0N(c0ce, A063, "chat_list", "change_number_notified_message_id", "INTEGER", "ChatListTable");
            C002501g.A0N(c0ce, A063, "chat_list", "last_important_message_table_id", "INTEGER", "ChatListTable");
            C002501g.A0N(c0ce, A063, "chat_list", "show_group_description", "INTEGER", "ChatListTable");
            C002501g.A0N(c0ce, A063, "chat_list", "last_read_ephemeral_message_table_id", "INTEGER", "ChatListTable");
            C002501g.A0N(c0ce, A063, "chat_list", "ephemeral_expiration", "INTEGER", "ChatListTable");
            C002501g.A0N(c0ce, A063, "chat_list", "ephemeral_setting_timestamp", "INTEGER", "ChatListTable");
        }
        c0hc.A00();
        if (A00(sQLiteDatabase, "chat_ready") == 1) {
            A0B(c0ce, "chat_ready", 0L);
            c0ce.A0C("DELETE FROM chat_list WHERE  message_table_id=0  AND last_read_message_table_id=0  AND sort_timestamp=0  AND my_messages=0  AND plaintext_disabled=0  AND key_remote_jid NOT LIKE '%@g.us' AND key_remote_jid NOT LIKE '%@temp'");
        }
        c0hc.A00();
        if (this.A01.booleanValue() && TextUtils.isEmpty(A06(sQLiteDatabase, "table", "messages_fts"))) {
            c0ce.A0C("CREATE VIRTUAL TABLE messages_fts USING FTS3()");
        }
        if (TextUtils.isEmpty(A06(sQLiteDatabase, "table", "message_ftsv2"))) {
            c0ce.A0C("CREATE VIRTUAL TABLE message_ftsv2 USING FTS4(content, fts_jid, fts_namespace)");
            A0B(c0ce, "fts_index_start", 0L);
        }
        String A064 = A06(sQLiteDatabase, "table", "messages_quotes");
        if (TextUtils.isEmpty(A064)) {
            c0ce.A0C("CREATE TABLE messages_quotes (_id INTEGER PRIMARY KEY AUTOINCREMENT, key_remote_jid TEXT NOT NULL, key_from_me INTEGER, key_id TEXT NOT NULL, status INTEGER, needs_push INTEGER, data TEXT, timestamp INTEGER, media_url TEXT, media_mime_type TEXT, media_wa_type TEXT, media_size INTEGER, media_name TEXT, media_caption TEXT, media_hash TEXT, media_duration INTEGER, origin INTEGER, latitude REAL, longitude REAL, thumb_image TEXT, remote_resource TEXT, received_timestamp INTEGER, send_timestamp INTEGER, receipt_server_timestamp INTEGER, receipt_device_timestamp INTEGER, read_device_timestamp INTEGER, played_device_timestamp INTEGER, raw_data BLOB, recipient_count INTEGER, participant_hash TEXT, starred INTEGER, quoted_row_id INTEGER, mentioned_jids TEXT, multicast_id TEXT, edit_version INTEGER, media_enc_hash TEXT, payment_transaction_id TEXT, forwarded INTEGER, preview_type INTEGER, send_count INTEGER, lookup_tables INTEGER)");
        } else {
            C002501g.A0N(c0ce, A064, "messages_quotes", "mentioned_jids", "TEXT", "QuotesTable");
            C002501g.A0N(c0ce, A064, "messages_quotes", "multicast_id", "TEXT", "QuotesTable");
            C002501g.A0N(c0ce, A064, "messages_quotes", "edit_version", "INTEGER", "QuotesTable");
            C002501g.A0N(c0ce, A064, "messages_quotes", "media_enc_hash", "TEXT", "QuotesTable");
            C002501g.A0N(c0ce, A064, "messages_quotes", "payment_transaction_id", "TEXT", "QuotesTable");
            C002501g.A0N(c0ce, A064, "messages_quotes", "forwarded", "INTEGER", "QuotesTable");
            C002501g.A0N(c0ce, A064, "messages_quotes", "preview_type", "INTEGER", "QuotesTable");
            C002501g.A0N(c0ce, A064, "messages_quotes", "send_count", "INTEGER", "QuotesTable");
            C002501g.A0N(c0ce, A064, "messages_quotes", "lookup_tables", "INTEGER", "QuotesTable");
        }
        String A065 = A06(sQLiteDatabase, "table", "message_quoted");
        if (TextUtils.isEmpty(A065)) {
            c0ce.A0C("CREATE TABLE message_quoted (message_row_id INTEGER PRIMARY KEY AUTOINCREMENT, chat_row_id INTEGER NOT NULL, parent_message_chat_row_id INTEGER NOT NULL, from_me INTEGER NOT NULL, sender_jid_row_id INTEGER, key_id TEXT NOT NULL, timestamp INTEGER, message_type INTEGER, origin INTEGER, text_data TEXT, payment_transaction_id TEXT, lookup_tables INTEGER)");
        } else {
            A0G(c0ce, A065, "message_quoted", "origin", "INTEGER");
        }
        if (TextUtils.isEmpty(A06(sQLiteDatabase, "table", "messages_hydrated_four_row_template"))) {
            c0ce.A0C("CREATE TABLE messages_hydrated_four_row_template (message_row_id INTEGER PRIMARY KEY, message_template_id TEXT)");
        }
        String A066 = A06(sQLiteDatabase, "table", "messages_vcards");
        if (TextUtils.isEmpty(A066)) {
            c0ce.A0C("CREATE TABLE messages_vcards (_id INTEGER PRIMARY KEY AUTOINCREMENT, message_row_id INTEGER, sender_jid TEXT, chat_jid TEXT, vcard TEXT)");
        } else {
            A0G(c0ce, A066, "messages_vcards", "chat_jid", "TEXT");
        }
        if (TextUtils.isEmpty(A06(sQLiteDatabase, "table", "messages_vcards_jids"))) {
            c0ce.A0C("CREATE TABLE messages_vcards_jids (_id INTEGER PRIMARY KEY AUTOINCREMENT, message_row_id INTEGER, vcard_jid TEXT, vcard_row_id INTEGER)");
        }
        if (TextUtils.isEmpty(A06(sQLiteDatabase, "table", "message_orphaned_edit"))) {
            c0ce.A0C("CREATE TABLE message_orphaned_edit (_id INTEGER PRIMARY KEY, key_id TEXT    NOT NULL, from_me INTEGER NOT NULL, chat_row_id INTEGER NOT NULL, sender_jid_row_id INTEGER NOT NULL DEFAULT (0), timestamp INTEGER, message_type INTEGER NOT NULL, revoked_key_id TEXT, retry_count INTEGER)");
        }
        c0ce.A0C("CREATE UNIQUE INDEX IF NOT EXISTS message_orphaned_edit_key_index ON message_orphaned_edit (    key_id,    from_me,    chat_row_id,    sender_jid_row_id)");
        if (TextUtils.isEmpty(A06(sQLiteDatabase, "table", "message_quoted_mentions"))) {
            c0ce.A0C("CREATE TABLE message_quoted_mentions (_id INTEGER PRIMARY KEY AUTOINCREMENT, message_row_id INTEGER, jid_row_id INTEGER)");
        }
        c0ce.A0C("CREATE UNIQUE INDEX IF NOT EXISTS quoted_mentions_index ON message_quoted_mentions (message_row_id, jid_row_id)");
        if (TextUtils.isEmpty(A06(sQLiteDatabase, "table", "message_quoted_vcard"))) {
            c0ce.A0C("CREATE TABLE message_quoted_vcard (_id INTEGER PRIMARY KEY AUTOINCREMENT, message_row_id INTEGER, vcard TEXT)");
        }
        c0ce.A0C("CREATE UNIQUE INDEX IF NOT EXISTS message_quoted_vcard_index ON message_quoted_vcard (message_row_id, vcard)");
        String A067 = A06(sQLiteDatabase, "table", "message_product");
        if (TextUtils.isEmpty(A067)) {
            c0ce.A0C("CREATE TABLE message_product (message_row_id INTEGER PRIMARY KEY, business_owner_jid INTEGER, product_id TEXT, title TEXT, description TEXT, currency_code TEXT, amount_1000 INTEGER, retailer_id TEXT, url TEXT, product_image_count INTEGER, sale_amount_1000 INTEGER)");
        } else {
            C002501g.A0N(c0ce, A067, "message_product", "retailer_id", "TEXT", "MessageProductTable");
            C002501g.A0N(c0ce, A067, "message_product", "url", "TEXT", "MessageProductTable");
            C002501g.A0N(c0ce, A067, "message_product", "product_image_count", "INTEGER", "MessageProductTable");
            C002501g.A0N(c0ce, A067, "message_product", "sale_amount_1000", "INTEGER", "MessageProductTable");
        }
        String A068 = A06(sQLiteDatabase, "table", "quoted_message_product");
        if (TextUtils.isEmpty(A068)) {
            c0ce.A0C("CREATE TABLE quoted_message_product (message_row_id INTEGER PRIMARY KEY, business_owner_jid INTEGER, product_id TEXT, title TEXT, description TEXT, currency_code TEXT, amount_1000 INTEGER, retailer_id TEXT, url TEXT, product_image_count INTEGER, sale_amount_1000 INTEGER)");
        } else {
            C002501g.A0N(c0ce, A068, "quoted_message_product", "retailer_id", "TEXT", "MessageProductTable");
            C002501g.A0N(c0ce, A068, "quoted_message_product", "url", "TEXT", "MessageProductTable");
            C002501g.A0N(c0ce, A068, "quoted_message_product", "product_image_count", "INTEGER", "MessageProductTable");
            C002501g.A0N(c0ce, A068, "quoted_message_product", "sale_amount_1000", "INTEGER", "MessageProductTable");
        }
        String A069 = A06(sQLiteDatabase, "table", "message_quoted_product");
        if (TextUtils.isEmpty(A069)) {
            c0ce.A0C("CREATE TABLE message_quoted_product (message_row_id INTEGER PRIMARY KEY, business_owner_jid INTEGER, product_id TEXT, title TEXT, description TEXT, currency_code TEXT, amount_1000 INTEGER, retailer_id TEXT, url TEXT, product_image_count INTEGER, sale_amount_1000 INTEGER)");
        } else {
            C002501g.A0N(c0ce, A069, "message_quoted_product", "sale_amount_1000", "INTEGER", "MessageProductTable");
        }
        String A0610 = A06(sQLiteDatabase, "table", "message_order");
        if (TextUtils.isEmpty(A0610)) {
            c0ce.A0C("CREATE TABLE message_order (message_row_id INTEGER PRIMARY KEY, order_id TEXT,thumbnail BLOB,order_title TEXT,item_count INTEGER,status INTEGER,surface INTEGER,message TEXT,seller_jid INTEGER,token TEXT,currency_code TEXT,total_amount_1000 INTEGER)");
        } else {
            C002501g.A0N(c0ce, A0610, "message_order", "currency_code", "TEXT", "MessageOrderTable");
            C002501g.A0N(c0ce, A0610, "message_order", "total_amount_1000", "INTEGER", "MessageOrderTable");
        }
        if (TextUtils.isEmpty(A06(sQLiteDatabase, "table", "quoted_message_order"))) {
            c0ce.A0C("CREATE TABLE quoted_message_order (message_row_id INTEGER PRIMARY KEY, order_id TEXT,thumbnail BLOB,order_title TEXT,item_count INTEGER,status INTEGER,surface INTEGER,message TEXT,seller_jid INTEGER,token TEXT,currency_code TEXT,total_amount_1000 INTEGER)");
        }
        String A0611 = A06(sQLiteDatabase, "table", "message_quoted_order");
        if (TextUtils.isEmpty(A0611)) {
            c0ce.A0C("CREATE TABLE message_quoted_order (message_row_id INTEGER PRIMARY KEY, order_id TEXT,thumbnail BLOB,order_title TEXT,item_count INTEGER,status INTEGER,surface INTEGER,message TEXT,seller_jid INTEGER,token TEXT,currency_code TEXT,total_amount_1000 INTEGER)");
        } else {
            C002501g.A0N(c0ce, A0611, "message_quoted_order", "currency_code", "TEXT", "MessageOrderTable");
            C002501g.A0N(c0ce, A0611, "message_quoted_order", "total_amount_1000", "INTEGER", "MessageOrderTable");
        }
        if (TextUtils.isEmpty(A07(c0ce, "message_group_invite"))) {
            sQLiteDatabase.execSQL("CREATE TABLE message_group_invite (message_row_id INTEGER PRIMARY KEY, group_jid_row_id INTEGER NOT NULL, admin_jid_row_id INTEGER NOT NULL, group_name TEXT, invite_code TEXT, expiration INTEGER, invite_time INTEGER, expired INTEGER)");
        }
        String A07 = A07(c0ce, "message_quoted_group_invite");
        boolean z = !TextUtils.isEmpty(A07(c0ce, "message_quoted_group_invite_legacy"));
        boolean z2 = !TextUtils.isEmpty(A07);
        if (!z) {
            if (z2) {
                c0ce.A0C("ALTER TABLE message_quoted_group_invite RENAME TO message_quoted_group_invite_legacy");
            } else {
                c0ce.A0C("CREATE TABLE message_quoted_group_invite_legacy (message_row_id INTEGER PRIMARY KEY, group_jid_row_id INTEGER NOT NULL, admin_jid_row_id INTEGER NOT NULL, group_name TEXT, invite_code TEXT, expiration INTEGER, invite_time INTEGER, expired INTEGER)");
            }
        }
        if (!z2 || !z) {
            c0ce.A0C("CREATE TABLE message_quoted_group_invite (message_row_id INTEGER PRIMARY KEY, group_jid_row_id INTEGER NOT NULL, admin_jid_row_id INTEGER NOT NULL, group_name TEXT, invite_code TEXT, expiration INTEGER, invite_time INTEGER, expired INTEGER)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "message_template"))) {
            c0ce.A0C("CREATE TABLE message_template (message_row_id            INTEGER PRIMARY KEY, content_text_data         TEXT NOT NULL, footer_text_data          TEXT)");
        }
        c0ce.A0C("CREATE INDEX IF NOT EXISTS message_template_index ON message_template (message_row_id)");
        String A072 = A07(c0ce, "message_template_button");
        if (TextUtils.isEmpty(A072)) {
            c0ce.A0C("CREATE TABLE message_template_button (_id INTEGER PRIMARY KEY AUTOINCREMENT,message_row_id INTEGER, text_data TEXT NOT NULL, extra_data TEXT, button_type INTEGER,used INTEGER,selected_index INTEGER)");
        } else {
            C002501g.A0N(c0ce, A072, "message_template_button", "selected_index", "INTEGER", "TemplateButtonTable");
        }
        c0ce.A0C("CREATE INDEX IF NOT EXISTS message_template_button_index ON message_template_button (message_row_id)");
        if (TextUtils.isEmpty(A07(c0ce, "message_template_quoted"))) {
            c0ce.A0C("CREATE TABLE message_template_quoted (message_row_id INTEGER PRIMARY KEY, content_text_data TEXT NOT NULL,footer_text_data TEXT)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "message_location"))) {
            c0ce.A0C("CREATE TABLE message_location (message_row_id INTEGER PRIMARY KEY, chat_row_id INTEGER, latitude REAL, longitude REAL, place_name TEXT, place_address TEXT, url TEXT, live_location_share_duration INTEGER, live_location_sequence_number INTEGER, live_location_final_latitude REAL, live_location_final_longitude REAL, live_location_final_timestamp INTEGER, map_download_status INTEGER)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "message_quoted_location"))) {
            c0ce.A0C("CREATE TABLE message_quoted_location (message_row_id INTEGER PRIMARY KEY, latitude REAL, longitude REAL, place_name TEXT, place_address TEXT, url TEXT, thumbnail BLOB)");
        }
        String A073 = A07(c0ce, "message_media");
        if (TextUtils.isEmpty(A073)) {
            c0ce.A0C("CREATE TABLE message_media (  message_row_id INTEGER PRIMARY KEY, chat_row_id INTEGER, autotransfer_retry_enabled INTEGER, multicast_id TEXT, media_job_uuid TEXT, transferred INTEGER, transcoded INTEGER, file_path TEXT, file_size INTEGER, suspicious_content INTEGER, trim_from INTEGER, trim_to INTEGER, face_x INTEGER, face_y INTEGER, media_key BLOB, media_key_timestamp INTEGER, width INTEGER, height INTEGER, has_streaming_sidecar INTEGER, gif_attribution INTEGER, thumbnail_height_width_ratio REAL, direct_path TEXT, first_scan_sidecar BLOB, first_scan_length INTEGER, message_url TEXT, mime_type TEXT, file_length INTEGER, media_name TEXT, file_hash TEXT, media_duration INTEGER, page_count INTEGER, enc_file_hash TEXT, partial_media_hash TEXT, partial_media_enc_hash TEXT, is_animated_sticker INTEGER, original_file_hash TEXT, mute_video INTEGER DEFAULT 0)");
        } else {
            C002501g.A0N(c0ce, A073, "message_media", "partial_media_hash", "TEXT", "MessageMediaTable");
            C002501g.A0N(c0ce, A073, "message_media", "partial_media_enc_hash", "TEXT", "MessageMediaTable");
            C002501g.A0N(c0ce, A073, "message_media", "is_animated_sticker", "INTEGER", "MessageMediaTable");
            C002501g.A0N(c0ce, A073, "message_media", "original_file_hash", "TEXT", "MessageMediaTable");
            C002501g.A0N(c0ce, A073, "message_media", "mute_video", "INTEGER DEFAULT 0", "MessageMediaTable");
        }
        c0ce.A0C("CREATE INDEX IF NOT EXISTS message_media_chat_index ON message_media(chat_row_id)");
        c0ce.A0C("CREATE INDEX IF NOT EXISTS message_media_hash_index ON message_media(file_hash)");
        c0ce.A0C("CREATE INDEX IF NOT EXISTS message_media_original_file_hash_index ON message_media(original_file_hash)");
        if (TextUtils.isEmpty(A07(c0ce, "message_media_interactive_annotation"))) {
            c0ce.A0C("CREATE TABLE message_media_interactive_annotation (_id INTEGER PRIMARY KEY AUTOINCREMENT, message_row_id INTEGER, location_latitude REAL, location_longitude REAL, location_name TEXT, sort_order INTEGER)");
        }
        c0ce.A0C("CREATE UNIQUE INDEX IF NOT EXISTS message_media_interactive_annotation_index on message_media_interactive_annotation (message_row_id, sort_order)");
        if (TextUtils.isEmpty(A07(c0ce, "message_media_interactive_annotation_vertex"))) {
            c0ce.A0C("CREATE TABLE message_media_interactive_annotation_vertex ( _id INTEGER PRIMARY KEY AUTOINCREMENT,  message_media_interactive_annotation_row_id INTEGER,  x REAL,  y REAL,  sort_order INTEGER)");
        }
        c0ce.A0C("CREATE UNIQUE INDEX IF NOT EXISTS message_media_interactive_annotation_vertex_index on message_media_interactive_annotation_vertex (message_media_interactive_annotation_row_id, sort_order)");
        if (TextUtils.isEmpty(A07(c0ce, "message_quoted_media"))) {
            c0ce.A0C("CREATE TABLE message_quoted_media (message_row_id INTEGER PRIMARY KEY, media_job_uuid TEXT, transferred INTEGER, file_path TEXT, file_size INTEGER, media_key BLOB, media_key_timestamp INTEGER, width INTEGER, height INTEGER, direct_path TEXT, message_url TEXT, mime_type TEXT, file_length INTEGER, media_name TEXT, file_hash TEXT, media_duration INTEGER, page_count INTEGER, enc_file_hash TEXT, thumbnail BLOB)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "frequents"))) {
            sQLiteDatabase.execSQL("CREATE TABLE frequents (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, type INTEGER NOT NULL, message_count INTEGER NOT NULL)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "frequent"))) {
            sQLiteDatabase.execSQL("CREATE TABLE frequent (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid_row_id INTEGER NOT NULL, type INTEGER NOT NULL, message_count INTEGER NOT NULL)");
        }
        if (A0E(sQLiteDatabase, "CREATE UNIQUE INDEX IF NOT EXISTS frequent_index ON frequent (jid_row_id, type)", c0ce, "receipt_user")) {
            sQLiteDatabase.execSQL("CREATE TABLE receipt_user(_id INTEGER PRIMARY KEY AUTOINCREMENT,message_row_id INTEGER NOT NULL,receipt_user_jid_row_id INTEGER NOT NULL,receipt_timestamp INTEGER,read_timestamp INTEGER,played_timestamp INTEGER)");
        }
        if (A0E(sQLiteDatabase, "CREATE UNIQUE INDEX IF NOT EXISTS receipt_user_index on receipt_user(message_row_id,receipt_user_jid_row_id)", c0ce, "receipt_device")) {
            sQLiteDatabase.execSQL("CREATE TABLE receipt_device (_id INTEGER PRIMARY KEY AUTOINCREMENT, message_row_id INTEGER NOT NULL, receipt_device_jid_row_id INTEGER NOT NULL, receipt_device_timestamp INTEGER)");
        }
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS receipt_device_index ON receipt_device (message_row_id, receipt_device_jid_row_id)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS receipt_device_table_device_index on receipt_device (receipt_device_jid_row_id)");
        String A074 = A07(c0ce, "receipt_orphaned");
        if (TextUtils.isEmpty(A074)) {
            sQLiteDatabase.execSQL("CREATE TABLE receipt_orphaned (_id INTEGER PRIMARY KEY AUTOINCREMENT, chat_row_id INTEGER NOT NULL, from_me INTEGER NOT NULL, key_id TEXT NOT NULL, receipt_device_jid_row_id INTEGER NOT NULL, receipt_recipient_jid_row_id INTEGER, status INTEGER, timestamp INTEGER)");
        } else if (!C002501g.A0P(A074, "receipt_recipient_jid_row_id", "INTEGER")) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS receipt_orphaned");
            sQLiteDatabase.execSQL("CREATE TABLE receipt_orphaned (_id INTEGER PRIMARY KEY AUTOINCREMENT, chat_row_id INTEGER NOT NULL, from_me INTEGER NOT NULL, key_id TEXT NOT NULL, receipt_device_jid_row_id INTEGER NOT NULL, receipt_recipient_jid_row_id INTEGER, status INTEGER, timestamp INTEGER)");
        }
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS receipt_orphaned_index ON receipt_orphaned (chat_row_id, from_me, key_id, receipt_device_jid_row_id, receipt_recipient_jid_row_id, status)");
        c0hc.A00();
        if (TextUtils.isEmpty(A07(c0ce, "receipts"))) {
            sQLiteDatabase.execSQL("CREATE TABLE receipts (_id INTEGER PRIMARY KEY AUTOINCREMENT, key_remote_jid TEXT NOT NULL, key_id TEXT NOT NULL, remote_resource TEXT, receipt_device_timestamp INTEGER, read_device_timestamp INTEGER, played_device_timestamp INTEGER)");
        }
        if (A0E(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS receipts_key_index on receipts (key_remote_jid, key_id)", c0ce, "message_mentions")) {
            sQLiteDatabase.execSQL("CREATE TABLE message_mentions (_id INTEGER PRIMARY KEY AUTOINCREMENT, message_row_id INTEGER, jid_row_id INTEGER)");
        }
        if (A0E(sQLiteDatabase, "CREATE UNIQUE INDEX IF NOT EXISTS mentions_index ON message_mentions (message_row_id, jid_row_id)", c0ce, "message_vcard")) {
            sQLiteDatabase.execSQL("CREATE TABLE message_vcard (_id INTEGER PRIMARY KEY AUTOINCREMENT, message_row_id INTEGER, vcard TEXT)");
        }
        if (A0E(sQLiteDatabase, "CREATE UNIQUE INDEX IF NOT EXISTS message_vcard_index ON message_vcard (message_row_id, vcard)", c0ce, "message_media_vcard_count")) {
            sQLiteDatabase.execSQL("CREATE TABLE message_media_vcard_count(_id INTEGER PRIMARY KEY AUTOINCREMENT, message_row_id INTEGER, count INTEGER)");
        }
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS message_media_vcard_count_index on message_media_vcard_count(message_row_id)");
        String A075 = A07(c0ce, "message_vcard_jid");
        if (TextUtils.isEmpty(A075)) {
            sQLiteDatabase.execSQL("CREATE TABLE message_vcard_jid(_id INTEGER PRIMARY KEY AUTOINCREMENT, vcard_jid_row_id INTEGER, vcard_row_id INTEGER, message_row_id INTEGER)");
            sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS message_vcard_jid_index on message_vcard_jid(vcard_jid_row_id, vcard_row_id, message_row_id)");
        } else if (A0G(c0ce, A075, "message_vcard_jid", "message_row_id", "INTEGER")) {
            sQLiteDatabase.execSQL("DROP INDEX IF EXISTS message_vcard_jid_index");
            sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS message_vcard_jid_index on message_vcard_jid(vcard_jid_row_id, vcard_row_id, message_row_id)");
        }
        String A076 = A07(c0ce, "user_device");
        if (TextUtils.isEmpty(A076)) {
            sQLiteDatabase.execSQL("CREATE TABLE user_device (_id INTEGER PRIMARY KEY AUTOINCREMENT, user_jid_row_id INTEGER, device_jid_row_id INTEGER, key_index INTEGER NOT NULL DEFAULT 0)");
        } else {
            A0G(c0ce, A076, "user_device", "key_index", "INTEGER NOT NULL DEFAULT 0");
        }
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS user_device_index on user_device (user_jid_row_id, device_jid_row_id)");
        String A077 = A07(c0ce, "group_participant_user");
        if (TextUtils.isEmpty(A077)) {
            sQLiteDatabase.execSQL("CREATE TABLE group_participant_user (_id INTEGER PRIMARY KEY AUTOINCREMENT, group_jid_row_id INTEGER NOT NULL, user_jid_row_id INTEGER NOT NULL, rank INTEGER, pending INTEGER)");
        } else if (C002501g.A0P(A077, "admin", "INTEGER")) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS group_participant_user");
            sQLiteDatabase.execSQL("CREATE TABLE group_participant_user (_id INTEGER PRIMARY KEY AUTOINCREMENT, group_jid_row_id INTEGER NOT NULL, user_jid_row_id INTEGER NOT NULL, rank INTEGER, pending INTEGER)");
        } else {
            A0G(c0ce, A077, "group_participant_user", "rank", "INTEGER");
            A0G(c0ce, A077, "group_participant_user", "pending", "INTEGER");
        }
        if (A0E(sQLiteDatabase, "CREATE UNIQUE INDEX IF NOT EXISTS group_participant_user_index ON group_participant_user (group_jid_row_id, user_jid_row_id)", c0ce, "group_participant_device")) {
            sQLiteDatabase.execSQL("CREATE TABLE group_participant_device (_id INTEGER PRIMARY KEY AUTOINCREMENT, group_participant_row_id INTEGER NOT NULL, device_jid_row_id INTEGER NOT NULL, sent_sender_key INTEGER)");
        }
        if (A0E(sQLiteDatabase, "CREATE UNIQUE INDEX IF NOT EXISTS group_participant_device_index ON group_participant_device (group_participant_row_id, device_jid_row_id)", c0ce, "message_external_ad_content")) {
            sQLiteDatabase.execSQL("CREATE TABLE message_external_ad_content (message_row_id INTEGER PRIMARY KEY, title TEXT, body TEXT, media_type INTEGER, thumbnail_url TEXT, full_thumbnail BLOB, micro_thumbnail BLOB, media_url TEXT, source_type TEXT, source_id TEXT, source_url TEXT)");
        }
        c0hc.A00();
        String A078 = A07(c0ce, "group_participants");
        if (TextUtils.isEmpty(A078)) {
            sQLiteDatabase.execSQL("CREATE TABLE group_participants (_id INTEGER PRIMARY KEY AUTOINCREMENT, gjid TEXT NOT NULL, jid TEXT NOT NULL, admin INTEGER, pending INTEGER, sent_sender_key INTEGER)");
        } else {
            A0G(c0ce, A078, "group_participants", "sent_sender_key", "INTEGER");
        }
        if (A0E(sQLiteDatabase, "CREATE UNIQUE INDEX IF NOT EXISTS group_participants_index ON group_participants (gjid, jid)", c0ce, "group_participants_history")) {
            sQLiteDatabase.execSQL("CREATE TABLE group_participants_history (_id INTEGER PRIMARY KEY AUTOINCREMENT, timestamp DATETIME NOT NULL, gjid TEXT NOT NULL, jid TEXT NOT NULL, action INTEGER NOT NULL, old_phash TEXT NOT NULL, new_phash TEXT NOT NULL)");
        }
        if (A0E(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS group_participants_history_index ON group_participants_history (gjid)", c0ce, "group_notification_version")) {
            sQLiteDatabase.execSQL("CREATE TABLE group_notification_version (group_jid_row_id INTEGER PRIMARY KEY, subject_timestamp INTEGER NOT NULL, announcement_version INTEGER NOT NULL, participant_version INTEGER NOT NULL)");
        }
        if (A0E(sQLiteDatabase, "CREATE UNIQUE INDEX IF NOT EXISTS group_notification_version_index ON group_notification_version (group_jid_row_id)", c0ce, "media_refs")) {
            sQLiteDatabase.execSQL("CREATE TABLE media_refs (_id INTEGER PRIMARY KEY AUTOINCREMENT, path TEXT UNIQUE, ref_count INTEGER)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "message_thumbnails"))) {
            sQLiteDatabase.execSQL("CREATE TABLE message_thumbnails (thumbnail BLOB, timestamp DATETIME, key_remote_jid TEXT NOT NULL, key_from_me INTEGER, key_id TEXT NOT NULL)");
        }
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS messages_thumbnail_key_index ON message_thumbnails (key_remote_jid, key_from_me, key_id)");
        c0hc.A00();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS media_streaming_sidecar");
        if (TextUtils.isEmpty(A07(c0ce, "message_streaming_sidecar"))) {
            sQLiteDatabase.execSQL("CREATE TABLE message_streaming_sidecar (message_row_id INTEGER PRIMARY KEY, sidecar BLOB, chunk_lengths BLOB, timestamp INTEGER)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "mms_thumbnail_metadata"))) {
            sQLiteDatabase.execSQL("CREATE TABLE mms_thumbnail_metadata (message_row_id INTEGER PRIMARY KEY, direct_path TEXT, media_key BLOB, media_key_timestamp INTEGER, enc_thumb_hash TEXT, thumb_hash TEXT, thumb_width INTEGER, thumb_height INTEGER, transferred INTEGER, micro_thumbnail BLOB, insert_timestamp INTEGER)");
        }
        sQLiteDatabase.execSQL(" CREATE INDEX IF NOT EXISTS mms_thumbnail_metadata_transferred_index ON mms_thumbnail_metadata(transferred);");
        String A079 = A07(c0ce, "status_list");
        if (TextUtils.isEmpty(A079)) {
            sQLiteDatabase.execSQL("CREATE TABLE status_list (_id INTEGER PRIMARY KEY AUTOINCREMENT, key_remote_jid TEXT UNIQUE, message_table_id INTEGER, last_read_message_table_id INTEGER, last_read_receipt_sent_message_table_id INTEGER, first_unread_message_table_id INTEGER, autodownload_limit_message_table_id INTEGER, timestamp INTEGER, unseen_count INTEGER, total_count INTEGER)");
        } else {
            A0G(c0ce, A079, "status_list", "first_unread_message_table_id", "INTEGER");
            A0G(c0ce, A079, "status_list", "autodownload_limit_message_table_id", "INTEGER");
            C011405q c011405q = C011405q.A00;
            Cursor query = sQLiteDatabase.query("status_list", new String[]{"_id"}, "key_remote_jid = ?", new String[]{c011405q.getRawString()}, null, null, null);
            try {
                if (query.moveToLast()) {
                    sQLiteDatabase.delete("status_list", "key_remote_jid = ?", new String[]{""});
                } else {
                    sQLiteDatabase.execSQL("UPDATE status_list SET key_remote_jid = ? WHERE key_remote_jid = ?", new String[]{c011405q.getRawString(), ""});
                }
                query.close();
            } finally {
            }
        }
        if (TextUtils.isEmpty(A07(c0ce, "status"))) {
            sQLiteDatabase.execSQL("CREATE TABLE status (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid_row_id INTEGER UNIQUE, message_table_id INTEGER, last_read_message_table_id INTEGER, last_read_receipt_sent_message_table_id INTEGER, first_unread_message_table_id INTEGER, autodownload_limit_message_table_id INTEGER, timestamp INTEGER, unseen_count INTEGER, total_count INTEGER)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "deleted_chat_job"))) {
            C000200d.A0Z(sQLiteDatabase, "DROP TABLE IF EXISTS deleted_chat_list", "CREATE TABLE deleted_chat_job\n(        _id INTEGER PRIMARY KEY AUTOINCREMENT,\n        chat_row_id INTEGER NOT NULL,\n        block_size INTEGER,\n        deleted_message_row_id INTEGER,\n        deleted_starred_message_row_id INTEGER,\n        deleted_messages_remove_files BOOLEAN,\n        deleted_categories_message_row_id INTEGER,\n        deleted_categories_starred_message_row_id INTEGER,\n        deleted_categories_remove_files BOOLEAN,\n        deleted_message_categories TEXT)", "CREATE INDEX IF NOT EXISTS deleted_chat_job_index ON deleted_chat_job (chat_row_id, _id)");
        }
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS messages_dehydrated_hsm");
        c0hc.A00();
        String A0710 = A07(c0ce, "pay_transactions");
        if (TextUtils.isEmpty(A0710)) {
            sQLiteDatabase.execSQL("CREATE TABLE pay_transactions (key_remote_jid TEXT, key_from_me INTEGER, key_id TEXT, id TEXT, timestamp INTEGER, status INTEGER, error_code TEXT, sender TEXT, receiver TEXT, type INTEGER, currency TEXT, amount_1000, credential_id TEXT, methods TEXT, bank_transaction_id TEXT, metadata TEXT, init_timestamp INTEGER, request_key_id TEXT, country TEXT, version INTEGER, future_data BLOB,service_id INTEGER)");
        } else {
            A0G(c0ce, A0710, "pay_transactions", "init_timestamp", "INTEGER");
            A0G(c0ce, A0710, "pay_transactions", "request_key_id", "TEXT");
            A0G(c0ce, A0710, "pay_transactions", "country", "TEXT");
            A0G(c0ce, A0710, "pay_transactions", "version", "INTEGER");
            A0G(c0ce, A0710, "pay_transactions", "future_data", "BLOB");
            A0G(c0ce, A0710, "pay_transactions", "service_id", "INTEGER");
        }
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS message_payment_transactions_index ON pay_transactions (key_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS message_payment_transactions_id_index ON pay_transactions (id)");
        String A0711 = A07(c0ce, "pay_transaction");
        if (TextUtils.isEmpty(A0711)) {
            sQLiteDatabase.execSQL("CREATE TABLE pay_transaction (_id INTEGER PRIMARY KEY AUTOINCREMENT, message_row_id INTEGER, remote_jid_row_id INTEGER, key_id TEXT, interop_id TEXT, id TEXT, timestamp INTEGER, status INTEGER, error_code TEXT, sender_jid_row_id INTEGER, receiver_jid_row_id INTEGER, type INTEGER, currency_code TEXT, amount_1000, credential_id TEXT, methods TEXT, bank_transaction_id TEXT, metadata TEXT, init_timestamp INTEGER, request_key_id TEXT, country TEXT, version INTEGER, future_data BLOB,service_id INTEGER)");
        } else {
            A0G(c0ce, A0711, "pay_transaction", "service_id", "INTEGER");
        }
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS message_payment_transaction_id_index ON pay_transaction (id)");
        c0hc.A00();
        if (TextUtils.isEmpty(A07(c0ce, "call_log"))) {
            sQLiteDatabase.execSQL("CREATE TABLE call_log (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid_row_id INTEGER, from_me INTEGER, call_id TEXT, transaction_id INTEGER, timestamp INTEGER, video_call INTEGER, duration INTEGER, call_result INTEGER, bytes_transferred INTEGER, group_jid_row_id INTEGER NOT NULL DEFAULT 0, is_joinable_group_call INTEGER, call_creator_device_jid_row_id INTEGER NOT NULL DEFAULT 0, call_random_id TEXT)");
            sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS call_log_key_index ON call_log (jid_row_id, from_me, call_id, transaction_id)");
            if (TextUtils.isEmpty(A07(c0ce, "call_logs"))) {
                A0B(c0ce, "call_log_ready", 1L);
            } else {
                if (TextUtils.isEmpty(A07(c0ce, "call_log_participant"))) {
                    sQLiteDatabase.execSQL("CREATE TABLE call_log_participant (_id INTEGER PRIMARY KEY AUTOINCREMENT, call_logs_row_id INTEGER, jid TEXT, call_result INTEGER)");
                }
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS call_log_participants_key_index on call_log_participant (call_logs_row_id, jid)");
            }
        } else {
            String A0712 = A07(c0ce, "call_log");
            A0G(c0ce, A0712, "call_log", "group_jid_row_id", "INTEGER NOT NULL DEFAULT 0");
            A0G(c0ce, A0712, "call_log", "is_joinable_group_call", "INTEGER");
            A0G(c0ce, A0712, "call_log", "call_creator_device_jid_row_id", "INTEGER NOT NULL DEFAULT 0");
            A0G(c0ce, A0712, "call_log", "call_random_id", "TEXT");
        }
        if (TextUtils.isEmpty(A07(c0ce, "call_log_participant_v2"))) {
            sQLiteDatabase.execSQL("CREATE TABLE call_log_participant_v2 (    _id             INTEGER PRIMARY KEY AUTOINCREMENT,    call_log_row_id INTEGER,    jid_row_id      INTEGER,    call_result     INTEGER)");
        }
        if (A0E(sQLiteDatabase, "CREATE UNIQUE INDEX IF NOT EXISTS call_log_participant_key_index on call_log_participant_v2 (call_log_row_id, jid_row_id)", c0ce, "missed_call_logs")) {
            sQLiteDatabase.execSQL("CREATE TABLE missed_call_logs (_id INTEGER PRIMARY KEY AUTOINCREMENT, message_row_id INTEGER, timestamp INTEGER, video_call INTEGER, group_jid_row_id INTEGER NOT NULL DEFAULT 0, is_joinable_group_call INTEGER)");
        } else {
            String A0713 = A07(c0ce, "missed_call_logs");
            A0G(c0ce, A0713, "missed_call_logs", "group_jid_row_id", "INTEGER NOT NULL DEFAULT 0");
            A0G(c0ce, A0713, "missed_call_logs", "is_joinable_group_call", "INTEGER");
        }
        if (A0E(sQLiteDatabase, "CREATE UNIQUE INDEX IF NOT EXISTS missed_call_logs_key_index ON missed_call_logs (message_row_id)", c0ce, "missed_call_log_participant")) {
            sQLiteDatabase.execSQL("CREATE TABLE missed_call_log_participant (_id INTEGER PRIMARY KEY AUTOINCREMENT, call_logs_row_id INTEGER, jid TEXT, call_result INTEGER)");
        }
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS missed_call_log_participants_key_index on missed_call_log_participant (call_logs_row_id, jid)");
        c0hc.A00();
        String A0714 = A07(c0ce, "jid");
        if (TextUtils.isEmpty(A0714)) {
            sQLiteDatabase.execSQL("CREATE TABLE jid (_id INTEGER PRIMARY KEY AUTOINCREMENT, user TEXT NOT NULL, server TEXT NOT NULL, agent INTEGER, device INTEGER, type INTEGER, raw_string TEXT)");
        } else {
            A0G(c0ce, A0714, "jid", "device", "INTEGER");
            sQLiteDatabase.execSQL("DROP INDEX IF EXISTS jid_key_index");
        }
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS jid_key_new_index ON jid (    user,    server,    agent,    device,    type)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS jid_raw_string_index ON jid (    raw_string)");
        A0B(c0ce, "jid_ready", 1L);
        c0hc.A00();
        String A0715 = A07(c0ce, "chat");
        if (TextUtils.isEmpty(A0715)) {
            c0ce.A0C("CREATE TABLE chat (_id INTEGER PRIMARY KEY AUTOINCREMENT,jid_row_id INTEGER UNIQUE,hidden INTEGER,subject TEXT,created_timestamp INTEGER,display_message_row_id INTEGER,last_message_row_id INTEGER,last_read_message_row_id INTEGER,last_read_receipt_sent_message_row_id INTEGER,last_important_message_row_id INTEGER,archived INTEGER,sort_timestamp INTEGER,mod_tag INTEGER,gen REAL,spam_detection INTEGER,unseen_earliest_message_received_time INTEGER,unseen_message_count INTEGER,unseen_missed_calls_count INTEGER,unseen_row_count INTEGER,plaintext_disabled INTEGER,vcard_ui_dismissed INTEGER,change_number_notified_message_row_id INTEGER,show_group_description INTEGER,ephemeral_expiration INTEGER,last_read_ephemeral_message_row_id INTEGER,ephemeral_setting_timestamp INTEGER,unseen_important_message_count INTEGER NOT NULL DEFAULT 0 )");
        } else {
            C002501g.A0N(c0ce, A0715, "chat", "hidden", "INTEGER", "createChatTable");
            C002501g.A0N(c0ce, A0715, "chat", "subject", "TEXT", "createChatTable");
            C002501g.A0N(c0ce, A0715, "chat", "created_timestamp", "INTEGER", "createChatTable");
            C002501g.A0N(c0ce, A0715, "chat", "display_message_row_id", "INTEGER", "createChatTable");
            C002501g.A0N(c0ce, A0715, "chat", "last_message_row_id", "INTEGER", "createChatTable");
            C002501g.A0N(c0ce, A0715, "chat", "last_read_message_row_id", "INTEGER", "createChatTable");
            C002501g.A0N(c0ce, A0715, "chat", "last_read_receipt_sent_message_row_id", "INTEGER", "createChatTable");
            C002501g.A0N(c0ce, A0715, "chat", "last_important_message_row_id", "INTEGER", "createChatTable");
            C002501g.A0N(c0ce, A0715, "chat", "archived", "INTEGER", "createChatTable");
            C002501g.A0N(c0ce, A0715, "chat", "sort_timestamp", "INTEGER", "createChatTable");
            C002501g.A0N(c0ce, A0715, "chat", "mod_tag", "INTEGER", "createChatTable");
            C002501g.A0N(c0ce, A0715, "chat", "gen", "REAL", "createChatTable");
            C002501g.A0N(c0ce, A0715, "chat", "spam_detection", "INTEGER", "createChatTable");
            C002501g.A0N(c0ce, A0715, "chat", "unseen_earliest_message_received_time", "INTEGER", "createChatTable");
            C002501g.A0N(c0ce, A0715, "chat", "unseen_message_count", "INTEGER", "createChatTable");
            C002501g.A0N(c0ce, A0715, "chat", "unseen_missed_calls_count", "INTEGER", "createChatTable");
            C002501g.A0N(c0ce, A0715, "chat", "unseen_row_count", "INTEGER", "createChatTable");
            C002501g.A0N(c0ce, A0715, "chat", "plaintext_disabled", "INTEGER", "createChatTable");
            C002501g.A0N(c0ce, A0715, "chat", "vcard_ui_dismissed", "INTEGER", "createChatTable");
            C002501g.A0N(c0ce, A0715, "chat", "change_number_notified_message_row_id", "INTEGER", "createChatTable");
            C002501g.A0N(c0ce, A0715, "chat", "show_group_description", "INTEGER", "createChatTable");
            C002501g.A0N(c0ce, A0715, "chat", "last_read_ephemeral_message_row_id", "INTEGER", "createChatTable");
            C002501g.A0N(c0ce, A0715, "chat", "ephemeral_expiration", "INTEGER", "createChatTable");
            C002501g.A0N(c0ce, A0715, "chat", "ephemeral_setting_timestamp", "INTEGER", "createChatTable");
            C002501g.A0N(c0ce, A0715, "chat", "unseen_important_message_count", "INTEGER NOT NULL DEFAULT 0", "createChatTable");
        }
        c0hc.A00();
        if (TextUtils.isEmpty(A07(c0ce, "message_link"))) {
            sQLiteDatabase.execSQL("CREATE TABLE message_link (_id INTEGER PRIMARY KEY AUTOINCREMENT, chat_row_id INTEGER, message_row_id INTEGER, link_index INTEGER)");
        }
        if (A0E(sQLiteDatabase, "CREATE UNIQUE INDEX IF NOT EXISTS message_link_index ON message_link (message_row_id, link_index)", c0ce, "message_thumbnail")) {
            sQLiteDatabase.execSQL("CREATE TABLE message_thumbnail (message_row_id INTEGER PRIMARY KEY, thumbnail BLOB)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "media_hash_thumbnail"))) {
            sQLiteDatabase.execSQL("CREATE TABLE media_hash_thumbnail (media_hash TEXT PRIMARY KEY, thumbnail BLOB)");
        }
        c0hc.A00();
        if (TextUtils.isEmpty(A07(c0ce, "message_forwarded"))) {
            sQLiteDatabase.execSQL("CREATE TABLE message_forwarded(message_row_id INTEGER PRIMARY KEY, forward_score INTEGER)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "message_text"))) {
            sQLiteDatabase.execSQL("CREATE TABLE message_text (message_row_id INTEGER PRIMARY KEY, description TEXT, page_title TEXT, url TEXT, font_style INTEGER, text_color INTEGER, background_color INTEGER, preview_type INTEGER)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "message_quoted_text"))) {
            sQLiteDatabase.execSQL("CREATE TABLE message_quoted_text (message_row_id INTEGER PRIMARY KEY, thumbnail BLOB)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "message_future"))) {
            sQLiteDatabase.execSQL("CREATE TABLE message_future (message_row_id INTEGER PRIMARY KEY, version INTEGER, data BLOB)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "message_revoked"))) {
            sQLiteDatabase.execSQL("CREATE TABLE message_revoked (message_row_id INTEGER PRIMARY KEY, revoked_key_id TEXT NOT NULL)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "message_payment"))) {
            sQLiteDatabase.execSQL("CREATE TABLE message_payment (    message_row_id                         INTEGER PRIMARY KEY,    sender_jid_row_id                      INTEGER,    receiver_jid_row_id                    INTEGER,    amount_with_symbol                     TEXT,    remote_resource                        TEXT,    remote_message_sender_jid_row_id       INTEGER,    remote_message_from_me                 INTEGER,    remote_message_key                     TEXT)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "message_payment_transaction_reminder"))) {
            sQLiteDatabase.execSQL("CREATE TABLE message_payment_transaction_reminder (    message_row_id            INTEGER PRIMARY KEY,    web_stub                  TEXT,    amount                    TEXT,    transfer_date             TEXT,    payment_sender_name       TEXT,    expiration                INTEGER,    remote_message_key        TEXT)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "message_payment_status_update"))) {
            sQLiteDatabase.execSQL("CREATE TABLE message_payment_status_update (    message_row_id         INTEGER PRIMARY KEY,    transaction_info       TEXT,    transaction_data       TEXT,    init_timestamp         TEXT,    update_timestamp       TEXT,    amount_data            TEXT)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "message_send_count"))) {
            sQLiteDatabase.execSQL("CREATE TABLE message_send_count (message_row_id INTEGER PRIMARY KEY, send_count INTEGER)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "message_system"))) {
            sQLiteDatabase.execSQL("CREATE TABLE message_system (message_row_id INTEGER PRIMARY KEY, action_type INTEGER NOT NULL)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "message_system_group"))) {
            sQLiteDatabase.execSQL("CREATE TABLE message_system_group (message_row_id INTEGER PRIMARY KEY, is_me_joined INTEGER)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "message_system_value_change"))) {
            sQLiteDatabase.execSQL("CREATE TABLE message_system_value_change (message_row_id INTEGER PRIMARY KEY, old_data TEXT)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "message_system_number_change"))) {
            sQLiteDatabase.execSQL("CREATE TABLE message_system_number_change (message_row_id INTEGER PRIMARY KEY, old_jid_row_id INTEGER, new_jid_row_id INTEGER)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "message_system_device_change"))) {
            sQLiteDatabase.execSQL("CREATE TABLE message_system_device_change (message_row_id INTEGER PRIMARY KEY, device_added_count INTEGER, device_removed_count INTEGER)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "message_system_initial_privacy_provider"))) {
            sQLiteDatabase.execSQL("CREATE TABLE message_system_initial_privacy_provider(message_row_id INTEGER PRIMARY KEY, privacy_provider INTEGER NOT NULL DEFAULT 0, verified_biz_name TEXT)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "message_system_photo_change"))) {
            sQLiteDatabase.execSQL("CREATE TABLE message_system_photo_change (message_row_id INTEGER PRIMARY KEY, new_photo_id TEXT, old_photo BLOB, new_photo BLOB)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "message_system_chat_participant"))) {
            sQLiteDatabase.execSQL("CREATE TABLE message_system_chat_participant (message_row_id INTEGER, user_jid_row_id INTEGER)");
        }
        if (A0E(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS message_system_chat_participant_index ON message_system_chat_participant (message_row_id)", c0ce, "message_system_business_state")) {
            sQLiteDatabase.execSQL("CREATE TABLE message_system_business_state (message_row_id INTEGER PRIMARY KEY, privacy_message_type INTEGER NOT NULL, business_name TEXT)");
        }
        if (!TextUtils.isEmpty(A07(c0ce, "message_system_ephemeral_setting_change"))) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS message_system_ephemeral_setting_change");
        }
        if (TextUtils.isEmpty(A07(c0ce, "message_system_block_contact"))) {
            sQLiteDatabase.execSQL("CREATE TABLE message_system_block_contact (message_row_id INTEGER PRIMARY KEY, is_blocked INTEGER)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "message_ui_elements"))) {
            sQLiteDatabase.execSQL("CREATE TABLE message_ui_elements(_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, message_row_id INTEGER NOT NULL, element_type INTEGER, element_content TEXT)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "message_quoted_ui_elements"))) {
            sQLiteDatabase.execSQL("CREATE TABLE message_quoted_ui_elements(message_row_id INTEGER NOT NULL PRIMARY KEY, element_type INTEGER, element_content TEXT)");
        }
        String A0716 = A07(c0ce, "message_ui_elements_reply");
        if (TextUtils.isEmpty(A0716)) {
            sQLiteDatabase.execSQL("CREATE TABLE message_ui_elements_reply (message_row_id INTEGER PRIMARY KEY, element_type INTEGER,reply_values TEXT,reply_description TEXT )");
        } else {
            A0G(c0ce, A0716, "message_ui_elements_reply", "reply_description", "TEXT");
        }
        String A0717 = A07(c0ce, "message_quoted_ui_elements_reply");
        if (TextUtils.isEmpty(A0717)) {
            sQLiteDatabase.execSQL("CREATE TABLE message_quoted_ui_elements_reply (message_row_id INTEGER PRIMARY KEY, element_type INTEGER,reply_values TEXT,reply_description TEXT )");
        } else {
            A0G(c0ce, A0717, "message_quoted_ui_elements_reply", "reply_description", "TEXT");
        }
        if (TextUtils.isEmpty(A06(sQLiteDatabase, "table", "message_quoted_ui_elements_reply_legacy"))) {
            sQLiteDatabase.execSQL("CREATE TABLE message_quoted_ui_elements_reply_legacy (message_row_id INTEGER PRIMARY KEY, element_type INTEGER,reply_values TEXT,reply_description TEXT )");
        }
        if (this.A01.booleanValue() && TextUtils.isEmpty(A07(c0ce, "messages_links"))) {
            sQLiteDatabase.execSQL("CREATE TABLE messages_links (_id INTEGER PRIMARY KEY AUTOINCREMENT, key_remote_jid TEXT, message_row_id INTEGER, link_index INTEGER)");
        }
        if (A00(sQLiteDatabase, "links_ready") == 0) {
            A0B(c0ce, "links_ready", 1L);
        }
        if (TextUtils.isEmpty(A07(c0ce, "user_device_info"))) {
            sQLiteDatabase.execSQL("CREATE TABLE user_device_info (user_jid_row_id INTEGER PRIMARY KEY, raw_id INTEGER NOT NULL, timestamp INTEGER NOT NULL)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "message_privacy_state"))) {
            sQLiteDatabase.execSQL("CREATE TABLE message_privacy_state (message_row_id INTEGER NOT NULL PRIMARY KEY, host_storage INTEGER, actual_actors INTEGER, privacy_mode_ts INTEGER NOT NULL, business_name TEXT)");
        }
        if (A0E(sQLiteDatabase, "CREATE UNIQUE INDEX IF NOT EXISTS user_device_info_index ON user_device_info (user_jid_row_id)", c0ce, "played_self_receipt")) {
            sQLiteDatabase.execSQL("CREATE TABLE played_self_receipt(message_row_id INTEGER PRIMARY KEY,to_jid_row_id INTEGER NOT NULL,participant_jid_row_id INTEGER,message_id TEXT NOT NULL)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "message_payment_invite"))) {
            c0ce.A0C("CREATE TABLE message_payment_invite (message_row_id INTEGER PRIMARY KEY, service INTEGER, expiration_timestamp INTEGER)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "message_quoted_payment_invite"))) {
            c0ce.A0C("CREATE TABLE message_quoted_payment_invite (message_row_id INTEGER PRIMARY KEY, service INTEGER, expiration_timestamp INTEGER)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "messages_quotes_payment_invite_legacy"))) {
            c0ce.A0C("CREATE TABLE messages_quotes_payment_invite_legacy (message_row_id INTEGER PRIMARY KEY, service INTEGER, expiration_timestamp INTEGER)");
        }
        if (TextUtils.isEmpty(A07(c0ce, "message_system_payment_invite_setup"))) {
            c0ce.A0C("CREATE TABLE message_system_payment_invite_setup(message_row_id INTEGER PRIMARY KEY, service INTEGER, invite_used INTEGER)");
        }
        c0hc.A00();
        String A0612 = A06(sQLiteDatabase, "table", "conversion_tuples");
        if (TextUtils.isEmpty(A0612)) {
            c0ce.A0C("CREATE TABLE conversion_tuples (jid_row_id INTEGER PRIMARY KEY, data TEXT, source TEXT, biz_count INTEGER, has_user_sent_last_message BOOLEAN, last_interaction INTEGER)");
        } else if (!C002501g.A0P(A0612, "biz_count", "INTEGER")) {
            C000200d.A0H("DROP_", "conversion_tuples");
            c0ce.A0C("DROP TABLE IF EXISTS conversion_tuples");
            c0ce.A0C("CREATE TABLE conversion_tuples (jid_row_id INTEGER PRIMARY KEY, data TEXT, source TEXT, biz_count INTEGER, has_user_sent_last_message BOOLEAN, last_interaction INTEGER)");
        }
        String A0613 = A06(sQLiteDatabase, "table", "labels");
        if (TextUtils.isEmpty(A0613)) {
            c0ce.A0C("CREATE TABLE labels (_id INTEGER PRIMARY KEY AUTOINCREMENT, label_name TEXT, predefined_id INTEGER, color_id INTEGER)");
        } else {
            A0G(c0ce, A0613, "labels", "predefined_id", "INTEGER");
            if (A0G(c0ce, A0613, "labels", "color_id", "INTEGER")) {
                c0ce.A0C("update labels set color_id = (_id % 20);");
            }
        }
        c0ce.A0C("CREATE UNIQUE INDEX IF NOT EXISTS labels_index ON labels (label_name)");
        if (TextUtils.isEmpty(A06(sQLiteDatabase, "table", "labeled_jid"))) {
            c0ce.A0C("CREATE TABLE labeled_jid (_id INTEGER PRIMARY KEY AUTOINCREMENT, label_id INTEGER NOT NULL, jid_row_id INTEGER NOT NULL)");
        }
        c0ce.A0C("CREATE UNIQUE INDEX IF NOT EXISTS labeled_jid_index ON labeled_jid (label_id, jid_row_id)");
        if (TextUtils.isEmpty(A06(sQLiteDatabase, "table", "labeled_jids"))) {
            c0ce.A0C("CREATE TABLE labeled_jids (_id INTEGER PRIMARY KEY AUTOINCREMENT, label_id INTEGER NOT NULL, jid TEXT)");
        }
        c0ce.A0C("CREATE UNIQUE INDEX IF NOT EXISTS labeled_jids_index ON labeled_jids (label_id, jid)");
        if (TextUtils.isEmpty(A06(sQLiteDatabase, "table", "labeled_messages_fts"))) {
            c0ce.A0C("CREATE VIRTUAL TABLE labeled_messages_fts USING FTS3()");
        }
        if (TextUtils.isEmpty(A06(sQLiteDatabase, "table", "labeled_messages"))) {
            c0ce.A0C("CREATE TABLE labeled_messages (_id INTEGER PRIMARY KEY AUTOINCREMENT, label_id INTEGER NOT NULL, message_row_id INTEGER NOT NULL)");
        }
        c0ce.A0C("CREATE UNIQUE INDEX IF NOT EXISTS labeled_messages_index ON labeled_messages (label_id, message_row_id)");
        if (TextUtils.isEmpty(A06(sQLiteDatabase, "table", "away_messages"))) {
            sQLiteDatabase.execSQL("CREATE TABLE away_messages (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT UNIQUE NOT NULL)");
        }
        if (TextUtils.isEmpty(A06(sQLiteDatabase, "table", "quick_replies"))) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS quick_replies (_id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT UNIQUE NOT NULL, content TEXT NOT NULL)");
        }
        if (TextUtils.isEmpty(A06(sQLiteDatabase, "table", "quick_reply_usage"))) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS quick_reply_usage (_id INTEGER PRIMARY KEY AUTOINCREMENT, quick_reply_id TEXT NOT NULL, usage_date DATE, usage_count INTEGER)");
        }
        if (TextUtils.isEmpty(A06(sQLiteDatabase, "table", "quick_reply_keywords"))) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS quick_reply_keywords (_id INTEGER PRIMARY KEY AUTOINCREMENT, quick_reply_id TEXT NOT NULL, keyword_id TEXT NOT NULL)");
        }
        if (TextUtils.isEmpty(A06(sQLiteDatabase, "table", "keywords"))) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS keywords (_id INTEGER PRIMARY KEY AUTOINCREMENT, keyword TEXT UNIQUE NOT NULL)");
        }
        if (TextUtils.isEmpty(A06(sQLiteDatabase, "table", "quick_reply_attachments"))) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS quick_reply_attachments(_id INTEGER PRIMARY KEY AUTOINCREMENT, quick_reply_id TEXT NOT NULL, uri TEXT NOT NULL, caption TEXT, media_type INTEGER)");
        }
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS attachments_quick_reply_id_index on quick_reply_attachments (quick_reply_id)");
        if (TextUtils.isEmpty(A06(sQLiteDatabase, "table", "message_invoice"))) {
            sQLiteDatabase.execSQL("CREATE TABLE message_invoice (message_row_id INTEGER PRIMARY KEY,wa_invoice_id TEXT NOT NULL,amount TEXT NOT NULL,note TEXT NOT NULL,token TEXT,sender_jid_row_id INTEGER,receiver_jid_row_id INTEGER,status INTEGER,status_ts INTEGER,creation_ts INTEGER,attachment_type INTEGER,attachment_mimetype TEXT,attachment_media_key BLOB,attachment_media_key_ts INTEGER,attachment_file_sha256 BLOB,attachment_file_enc_sha256 BLOB,attachment_direct_path TEXT,attachment_jpeg_thumbnail BLOB,metadata TEXT);");
        }
        if (TextUtils.isEmpty(A06(sQLiteDatabase, "table", "message_quote_invoice"))) {
            sQLiteDatabase.execSQL("CREATE TABLE message_quote_invoice (message_row_id INTEGER PRIMARY KEY,amount TEXT NOT NULL,note TEXT NOT NULL,status INTEGER,attachment_jpeg_thumbnail BLOB);");
        }
        if (TextUtils.isEmpty(A06(sQLiteDatabase, "table", "invoice_transactions"))) {
            sQLiteDatabase.execSQL("CREATE TABLE invoice_transactions (message_row_id INTEGER PRIMARY KEY,pay_transaction_id INTEGER);");
        }
        A08(sQLiteDatabase, "message_view_once_media", "CREATE TABLE message_view_once_media (message_row_id INTEGER PRIMARY KEY, state INTEGER NOT NULL )");
        C000200d.A0Z(sQLiteDatabase, "DROP INDEX IF EXISTS message_view_once_index", "DROP TABLE IF EXISTS message_view_once", "CREATE INDEX IF NOT EXISTS message_view_once_media_state_index ON message_view_once_media (state)");
        String A0614 = A06(sQLiteDatabase, "table", "message_quoted_view_once_media");
        boolean z3 = !TextUtils.isEmpty(A06(sQLiteDatabase, "table", "message_quoted_view_once_media_legacy"));
        boolean z4 = !TextUtils.isEmpty(A0614);
        if (!z3) {
            if (!TextUtils.isEmpty(A0614)) {
                sQLiteDatabase.execSQL("ALTER TABLE message_quoted_view_once_media RENAME TO message_quoted_view_once_media_legacy");
            } else {
                sQLiteDatabase.execSQL("CREATE TABLE message_quoted_view_once_media_legacy (message_row_id INTEGER PRIMARY KEY, state INTEGER NOT NULL )");
            }
        }
        if (!z4 || !z3) {
            sQLiteDatabase.execSQL("CREATE TABLE message_quoted_view_once_media (message_row_id INTEGER PRIMARY KEY, state INTEGER NOT NULL )");
        }
        A08(sQLiteDatabase, "message_ephemeral", C1P2.A03);
        sQLiteDatabase.execSQL(C1P2.A01);
        A08(sQLiteDatabase, "message_ephemeral_setting", C1P1.A01);
        A08(sQLiteDatabase, "message_system_ephemeral_setting_not_applied", "CREATE TABLE message_system_ephemeral_setting_not_applied(message_row_id INTEGER PRIMARY KEY, setting_duration INTEGER)");
        A08(sQLiteDatabase, "message_broadcast_ephemeral", "CREATE TABLE message_broadcast_ephemeral (message_row_id INTEGER PRIMARY KEY, shared_secret BLOB NOT NULL )");
        c0hc.A00();
        C000700j.A00 = bool;
    }

    public void A0M(C0CE c0ce, C01B c01b, boolean z) {
        C27601Oa c27601Oa = new Comparator() { // from class: X.1Oa
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((String) obj).compareToIgnoreCase((String) obj2);
            }
        };
        TreeMap treeMap = new TreeMap(c27601Oa);
        try {
            Cursor A07 = c0ce.A07("select name, sql from sqlite_master where type='trigger';", null);
            int columnIndexOrThrow = A07.getColumnIndexOrThrow("name");
            int columnIndexOrThrow2 = A07.getColumnIndexOrThrow("sql");
            while (A07.moveToNext()) {
                treeMap.put(A07.getString(columnIndexOrThrow), A07.getString(columnIndexOrThrow2));
            }
            A07.close();
        } catch (Exception e) {
            Log.e("databasehelper/onCreate/dropTriggers", e);
        }
        boolean A0Q = A0Q(c0ce, c01b);
        ArrayList arrayList = new ArrayList();
        if (A0Q) {
            String str = "message";
            String str2 = "messages";
            if (z) {
                str2 = "message";
                str = "messages";
            }
            arrayList.add(A02(str2, str, "_id=old._id"));
        }
        arrayList.add(A04("messages_hydrated_four_row_template", "message_row_id=old._id", z));
        arrayList.add(A04("message_ftsv2", "docid=old._id", z));
        arrayList.add(A04("messages_vcards", "message_row_id=old._id", z));
        if (A0Q) {
            arrayList.add(A04("messages_links", "message_row_id=old._id", z));
        }
        arrayList.add(A04("message_product", "message_row_id=old._id", z));
        arrayList.add(A04("message_group_invite", "message_row_id=old._id", z));
        arrayList.add(A04("message_order", "message_row_id=old._id", z));
        arrayList.add(A04("message_template", "message_row_id=old._id", z));
        arrayList.add(A04("message_location", "message_row_id=old._id", z));
        arrayList.add(A04("message_media", "message_row_id=old._id", z));
        arrayList.add(A04("receipt_user", "message_row_id=old._id", z));
        arrayList.add(A04("receipt_device", "message_row_id=old._id", z));
        arrayList.add(A04("played_self_receipt", "message_row_id=old._id", z));
        arrayList.add(A04("message_mentions", "message_row_id=old._id", z));
        arrayList.add(A04("message_vcard", "message_row_id=old._id", z));
        arrayList.add(A02("message_vcard", "messages_vcards_jids", "message_row_id = old.message_row_id"));
        arrayList.add(A04("message_streaming_sidecar", "message_row_id=old._id", z));
        arrayList.add(A04("mms_thumbnail_metadata", "message_row_id=old._id", z));
        arrayList.add(A04("message_ephemeral", "message_row_id=old._id", z));
        arrayList.add(A04("message_broadcast_ephemeral", "message_row_id=old._id", z));
        arrayList.add(A04("message_privacy_state", "message_row_id=old._id", z));
        arrayList.add(A04("missed_call_logs", "message_row_id=old._id", z));
        arrayList.add(A04("message_link", "message_row_id=old._id", z));
        arrayList.add(A04("message_forwarded", "message_row_id=old._id", z));
        arrayList.add(A04("message_thumbnail", "message_row_id=old._id", z));
        arrayList.add(A04("message_text", "message_row_id=old._id", z));
        arrayList.add(A04("message_revoked", "message_row_id=old._id", z));
        arrayList.add(A04("message_future", "message_row_id=old._id", z));
        arrayList.add(A04("message_send_count", "message_row_id=old._id", z));
        arrayList.add(A04("message_system", "message_row_id=old._id", z));
        arrayList.add(A02("message_system", "message_system_block_contact", "message_row_id=old.message_row_id"));
        arrayList.add(A02("message_system", "message_system_ephemeral_setting_not_applied", "message_row_id=old.message_row_id"));
        arrayList.add(A02("message_system", "message_system_chat_participant", "message_row_id=old.message_row_id"));
        arrayList.add(A02("message_system", "message_system_device_change", "message_row_id=old.message_row_id"));
        arrayList.add(A02("message_system", "message_system_initial_privacy_provider", "message_row_id=old.message_row_id"));
        arrayList.add(A02("message_system", "message_system_group", "message_row_id=old.message_row_id"));
        arrayList.add(A02("message_system", "message_system_number_change", "message_row_id=old.message_row_id"));
        arrayList.add(A02("message_system", "message_system_photo_change", "message_row_id=old.message_row_id"));
        arrayList.add(A02("message_system", "message_system_value_change", "message_row_id=old.message_row_id"));
        arrayList.add(A02("message_system", "message_payment", "message_row_id=old.message_row_id"));
        arrayList.add(A02("message_system", "message_payment_transaction_reminder", "message_row_id=old.message_row_id"));
        arrayList.add(A02("message_system", "message_payment_status_update", "message_row_id=old.message_row_id"));
        arrayList.add(A02("message_system", "message_system_business_state", "message_row_id=old.message_row_id"));
        arrayList.add(A02("message_system", "message_system_payment_invite_setup", "message_row_id=old.message_row_id"));
        arrayList.add(A04("message_external_ad_content", "message_row_id=old._id", z));
        arrayList.add(A04("message_ui_elements", "message_row_id=old._id", z));
        arrayList.add(A04("message_ui_elements_reply", "message_row_id=old._id", z));
        arrayList.add(A04("message_view_once_media", "message_row_id=old._id", z));
        arrayList.add(A02("message_quoted", "message_quoted_view_once_media", "message_row_id=old.message_row_id"));
        if (A0Q) {
            arrayList.add(A02("messages_quotes", "message_quoted_view_once_media_legacy", "message_row_id=old._id"));
        }
        arrayList.add(A04("labeled_messages", "message_row_id=old._id", z));
        arrayList.add(A04("message_ephemeral", "message_row_id=old._id", z));
        arrayList.add(A04("message_ephemeral_setting", "message_row_id=old._id", z));
        arrayList.add(A04("labeled_messages_fts", "docid=old._id", z));
        if (A0Q) {
            arrayList.add(A02("messages", "receipts", "key_remote_jid=old.key_remote_jid AND key_id=old.key_id"));
        }
        arrayList.add(A02("message_template", "message_template_button", "message_row_id=old.message_row_id"));
        arrayList.add(A02("quick_replies", "quick_reply_usage", "quick_reply_id=old._id"));
        arrayList.add(A02("quick_replies", "quick_reply_keywords", "quick_reply_id=old._id"));
        arrayList.add(A02("quick_replies", "quick_reply_attachments", "quick_reply_id=old._id"));
        arrayList.add(A04("message_quoted", "message_row_id=old._id", z));
        if (A0Q) {
            arrayList.add(A02("messages", "messages_quotes", "_id=old.quoted_row_id"));
        }
        arrayList.add(A02("message_quoted", "message_quoted_group_invite", "message_row_id=old.message_row_id"));
        if (A0Q) {
            arrayList.add(A02("messages_quotes", "message_quoted_group_invite_legacy", "message_row_id=old._id"));
        }
        arrayList.add(A02("message_quoted", "message_quoted_location", "message_row_id=old.message_row_id"));
        arrayList.add(A02("message_quoted", "message_quoted_media", "message_row_id=old.message_row_id"));
        arrayList.add(A02("message_quoted", "message_quoted_mentions", "message_row_id = old.message_row_id"));
        if (z) {
            arrayList.add(A02("message_quoted", "message_quoted_product", "message_row_id=old.message_row_id"));
        } else {
            arrayList.add(A02("messages_quotes", "message_quoted_product", "message_row_id=old._id"));
        }
        if (z) {
            arrayList.add(A02("message_quoted", "message_quoted_order", "message_row_id=old.message_row_id"));
        } else {
            arrayList.add(A02("messages_quotes", "message_quoted_order", "message_row_id=old._id"));
        }
        arrayList.add(A02("message_quoted", "message_quoted_text", "message_row_id=old.message_row_id"));
        arrayList.add(A02("message_quoted", "message_quoted_vcard", "message_row_id=old.message_row_id"));
        arrayList.add(A02("messages_quotes", "message_quoted_ui_elements_reply_legacy", "message_row_id=old._id"));
        if (z) {
            arrayList.add(A02("message_quoted", "message_quoted_ui_elements", "message_row_id=old.message_row_id"));
            arrayList.add(A02("message_quoted", "message_quoted_ui_elements_reply", "message_row_id=old.message_row_id"));
        } else {
            arrayList.add(A02("messages_quotes", "message_quoted_ui_elements", "message_row_id=old._id"));
        }
        if (z) {
            arrayList.add(A02("message_quoted", "message_template_quoted", "message_row_id=old.message_row_id"));
        } else {
            arrayList.add(A02("messages_quotes", "message_template_quoted", "message_row_id=old._id"));
        }
        arrayList.add(A02("messages_quotes", "quoted_message_product", "message_row_id=old._id"));
        arrayList.add(A02("messages_quotes", "quoted_message_order", "message_row_id=old._id"));
        arrayList.add(A02("message_media", "message_media_interactive_annotation", "message_row_id=old.message_row_id"));
        arrayList.add(A02("message_vcard", "message_vcard_jid", "vcard_row_id=old._id"));
        arrayList.add(A02("message_media", "message_media_vcard_count", "message_row_id=old.message_row_id"));
        arrayList.add(A04("message_vcard_jid", "message_row_id=old._id", z));
        arrayList.add(A02("group_participant_user", "group_participant_device", "group_participant_row_id=old._id"));
        arrayList.add(A02("call_log", "call_log_participant_v2", "call_log_row_id=old._id"));
        arrayList.add(A02("missed_call_logs", "missed_call_log_participant", "call_logs_row_id=old._id"));
        arrayList.add(A02("chat", "message_link", "chat_row_id=old._id"));
        arrayList.add(A02("labels", "labeled_jid", "label_id=old._id"));
        arrayList.add(A02("labels", "labeled_messages", "label_id=old._id"));
        arrayList.add(A02("labels", "labeled_jids", "label_id=old._id"));
        arrayList.add(A04("message_payment_invite", "message_row_id=old._id", z));
        arrayList.add(A02("message_quoted", "message_quoted_payment_invite", "message_row_id=old.message_row_id"));
        arrayList.add(A02("messages_quotes", "messages_quotes_payment_invite_legacy", "message_row_id=old._id"));
        arrayList.add(A02("message_media_interactive_annotation", "message_media_interactive_annotation_vertex", "message_media_interactive_annotation_row_id=old._id"));
        TreeMap treeMap2 = new TreeMap(c27601Oa);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            treeMap2.put(pair.first, pair.second);
        }
        SQLiteDatabase sQLiteDatabase = c0ce.A00;
        if (!TextUtils.isEmpty(A06(sQLiteDatabase, "table", "call_logs"))) {
            Pair A02 = A02("call_logs", "call_log_participant", "call_logs_row_id=old._id");
            treeMap2.put(A02.first, A02.second);
        }
        if (!TextUtils.isEmpty(A06(sQLiteDatabase, "table", "messages_fts"))) {
            Pair A04 = A04("messages_fts", "docid=old._id", z);
            treeMap2.put(A04.first, A04.second);
        }
        if (!TextUtils.isEmpty(A06(sQLiteDatabase, "table", "message_ephemeral_setting_remove_column"))) {
            Pair A022 = A02("message_ephemeral_setting", "message_ephemeral_setting_remove_column", "message_row_id=old.message_row_id");
            treeMap2.put(A022.first, A022.second);
            Pair A03 = A03("message_ephemeral_setting", "message_ephemeral_setting_remove_column", "INSERT or REPLACE INTO message_ephemeral_setting_remove_column (message_row_id, setting_duration) VALUES (new.message_row_id, new.setting_duration)");
            treeMap2.put(A03.first, A03.second);
        }
        if (!TextUtils.isEmpty(A06(sQLiteDatabase, "table", "message_ephemeral_remove_column"))) {
            Pair A023 = A02("message_ephemeral", "message_ephemeral_remove_column", "message_row_id=old.message_row_id");
            treeMap2.put(A023.first, A023.second);
            Pair A01 = A01();
            treeMap2.put(A01.first, A01.second);
            Pair A032 = A03("message_ephemeral", "message_ephemeral_remove_column", "INSERT INTO message_ephemeral_remove_column(message_row_id, duration, expire_timestamp) VALUES (new.message_row_id, new.duration, new.expire_timestamp)");
            treeMap2.put(A032.first, A032.second);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry entry : treeMap.entrySet()) {
            Object key = entry.getKey();
            String str3 = (String) treeMap2.get(key);
            if (str3 == null) {
                arrayList2.add(String.format("DROP TRIGGER %s;", key));
            } else {
                String str4 = (String) entry.getValue();
                if (!str3.toLowerCase(Locale.getDefault()).replaceAll("\\s*", "").equalsIgnoreCase(str4 == null ? null : str4.toLowerCase(Locale.getDefault()).replaceAll("\\s*", ""))) {
                    arrayList2.add(String.format("DROP TRIGGER %s;", key));
                } else {
                    arrayList3.add(key);
                }
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            treeMap2.remove(it2.next());
        }
        for (Map.Entry entry2 : treeMap2.entrySet()) {
            arrayList2.add(entry2.getValue());
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            String str5 = (String) it3.next();
            StringBuilder sb = new StringBuilder("DatabaseHelper/createDatabaseTriggers/");
            sb.append(str5);
            sb.toString();
            c0ce.A0C(str5);
        }
    }

    public boolean A0N() {
        Boolean bool = this.A01;
        if (bool != null) {
            return bool.booleanValue();
        }
        C0CE c0ce = this.A00;
        if (c0ce == null || c0ce.A00 == null) {
            return true;
        }
        return A0Q(c0ce, this.A04);
    }

    public synchronized boolean A0O() {
        C000700j.A08(this.A00 == null, "database nust be null");
        try {
            AE6();
            close();
        } catch (SQLiteException unused) {
            return false;
        }
        return true;
    }

    public boolean A0P(C0CD c0cd) {
        return A0I(c0cd.A02).booleanValue();
    }

    public final boolean A0Q(C0CE c0ce, C01B c01b) {
        SQLiteDatabase sQLiteDatabase = c0ce.A00;
        Boolean bool = this.A01;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (A00(sQLiteDatabase, "migration_completed") == 1) {
            if (A00(sQLiteDatabase, "write_to_old_schema_disabled") == 0) {
                if (c01b.A0E(C01C.A0d)) {
                    this.A01 = Boolean.FALSE;
                    ContentValues contentValues = new ContentValues(2);
                    contentValues.put("key", "write_to_old_schema_disabled");
                    contentValues.put("value", (Long) 1L);
                    sQLiteDatabase.replaceOrThrow("props", null, contentValues);
                } else {
                    this.A01 = Boolean.TRUE;
                }
            } else {
                this.A01 = Boolean.FALSE;
            }
            return this.A01.booleanValue();
        }
        this.A01 = Boolean.TRUE;
        return true;
    }

    public boolean A0R(String str) {
        C0CE c0ce = this.A00;
        if (c0ce != null) {
            return !TextUtils.isEmpty(A06(c0ce.A00, "table", str));
        }
        throw null;
    }

    @Override // X.C04k
    public C04l ABg() {
        return this.A07;
    }

    @Override // X.C04k
    public synchronized C0CE ACk() {
        return AE6();
    }

    /* JADX WARN: Code restructure failed: missing block: B:249:0x00f7, code lost:
        if (r8 != false) goto L45;
     */
    @Override // X.C04k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized X.C0CE AE6() {
        /*
            Method dump skipped, instructions count: 866
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05J.AE6():X.0CE");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public synchronized void close() {
        C0CE c0ce = this.A00;
        if (c0ce != null && c0ce.A00.isOpen()) {
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore/close, ");
            sb.append(this.A00.A00);
            Log.i(sb.toString());
            this.A00.A00.close();
        }
        this.A00 = null;
        this.A02 = null;
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
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        synchronized (this) {
            C0CE A05 = C002501g.A05(sQLiteDatabase, this.A08);
            SQLiteTransactionListener sQLiteTransactionListener = new SQLiteTransactionListener() { // from class: X.1Oi
                {
                    C05J.this = this;
                }

                @Override // android.database.sqlite.SQLiteTransactionListener
                public void onBegin() {
                    atomicBoolean.set(false);
                }

                @Override // android.database.sqlite.SQLiteTransactionListener
                public void onCommit() {
                    atomicBoolean.set(true);
                }

                @Override // android.database.sqlite.SQLiteTransactionListener
                public void onRollback() {
                    atomicBoolean.set(false);
                }
            };
            SQLiteDatabase sQLiteDatabase2 = A05.A00;
            sQLiteDatabase2.beginTransactionWithListener(sQLiteTransactionListener);
            Log.i("msgstore/create");
            A09(A05, "messages");
            A09(A05, "message");
            A09(A05, "chat_list");
            A0C(A05, "props", "DROP TABLE IF EXISTS props");
            A09(A05, "messages_fts");
            A09(A05, "message_ftsv2");
            A0C(A05, "messages_quotes", "DROP TABLE IF EXISTS messages_quotes");
            A0C(A05, "message_quoted", "DROP TABLE IF EXISTS message_quoted");
            A0C(A05, "message_quoted_vcard", "DROP TABLE IF EXISTS message_quoted_vcard");
            A09(A05, "messages_dehydrated_hsm");
            A09(A05, "messages_hydrated_four_row_template");
            A0C(A05, "messages_vcards", "DROP TABLE IF EXISTS messages_vcards");
            A0C(A05, "messages_vcards_jids", "DROP TABLE IF EXISTS messages_vcards_jids");
            A0C(A05, "message_orphaned_edit", "DROP TABLE IF EXISTS message_orphaned_edit");
            A0C(A05, "message_quoted_mentions", "DROP TABLE IF EXISTS message_quoted_mentions");
            A09(A05, "messages_links");
            A0C(A05, "message_product", "DROP TABLE IF EXISTS message_product");
            A0C(A05, "quoted_message_product", "DROP TABLE IF EXISTS quoted_message_product");
            A0C(A05, "message_quoted_product", "DROP TABLE IF EXISTS message_quoted_product");
            A0C(A05, "message_order", "DROP TABLE IF EXISTS message_order");
            A0C(A05, "quoted_message_order", "DROP TABLE IF EXISTS quoted_message_order");
            A0C(A05, "message_quoted_order", "DROP TABLE IF EXISTS message_quoted_order");
            A09(A05, "message_group_invite");
            A0C(A05, "message_quoted_group_invite_legacy", "DROP TABLE IF EXISTS message_quoted_group_invite_legacy");
            A0C(A05, "message_quoted_group_invite", "DROP TABLE IF EXISTS message_quoted_group_invite");
            A0C(A05, "message_template", "DROP TABLE IF EXISTS message_template");
            A0C(A05, "message_template_button", "DROP TABLE IF EXISTS message_template_button");
            A0C(A05, "message_template_quoted", "DROP TABLE IF EXISTS message_template_quoted");
            A09(A05, "message_location");
            A09(A05, "message_quoted_location");
            A09(A05, "message_media");
            A09(A05, "message_media_interactive_annotation");
            A09(A05, "message_media_interactive_annotation_vertex");
            A09(A05, "message_quoted_media");
            A0C(A05, "frequents", "DROP TABLE IF EXISTS frequents");
            A0C(A05, "frequent", "DROP TABLE IF EXISTS frequent");
            A0C(A05, "receipt_user", "DROP TABLE IF EXISTS receipt_user");
            A0C(A05, "receipt_device", "DROP TABLE IF EXISTS receipt_device");
            A09(A05, "receipt_orphaned");
            A09(A05, "receipts");
            A0C(A05, "message_mentions", "DROP TABLE IF EXISTS message_mentions");
            A0C(A05, "message_vcard", "DROP TABLE IF EXISTS message_vcard");
            A0C(A05, "message_media_vcard_count", "DROP TABLE IF EXISTS message_media_vcard_count");
            A0C(A05, "message_vcard_jid", "DROP TABLE IF EXISTS message_vcard_jid");
            A09(A05, "user_device");
            A09(A05, "group_participant_user");
            A09(A05, "group_participant_device");
            A0C(A05, "group_participants", "DROP TABLE IF EXISTS group_participants");
            A0C(A05, "group_participants_history", "DROP TABLE IF EXISTS group_participants_history");
            A0C(A05, "group_notification_version", "DROP TABLE IF EXISTS group_notification_version");
            A09(A05, "media_refs");
            A09(A05, "media_streaming_sidecar");
            A0C(A05, "message_thumbnails", "DROP TABLE IF EXISTS message_thumbnails");
            A0C(A05, "message_streaming_sidecar", "DROP TABLE IF EXISTS message_streaming_sidecar");
            A0C(A05, "mms_thumbnail_metadata", "DROP TABLE IF EXISTS mms_thumbnail_metadata");
            A09(A05, "status_list");
            A09(A05, "status");
            A0C(A05, "conversion_tuples", "DROP TABLE IF EXISTS conversion_tuples");
            A09(A05, "deleted_chat_jobs");
            A09(A05, "deleted_chat_job");
            A09(A05, "pay_transactions");
            A09(A05, "pay_transaction");
            A0C(A05, "message_ephemeral", "DROP TABLE IF EXISTS message_ephemeral");
            A0C(A05, "call_log", "DROP TABLE IF EXISTS call_log");
            A0C(A05, "missed_call_logs", "DROP TABLE IF EXISTS missed_call_logs");
            A0C(A05, "missed_call_log_participant", "DROP TABLE IF EXISTS missed_call_log_participant");
            A09(A05, "jid");
            A0C(A05, "chat", "DROP TABLE IF EXISTS chat");
            A09(A05, "chat_view");
            A09(A05, "message_link");
            A0C(A05, "message_forwarded", "DROP TABLE IF EXISTS message_forwarded");
            A0C(A05, "message_thumbnail", "DROP TABLE IF EXISTS message_thumbnail");
            A09(A05, "message_text");
            A09(A05, "message_quoted_text");
            A09(A05, "message_revoked");
            A09(A05, "message_future");
            A09(A05, "message_payment");
            A09(A05, "message_payment_transaction_reminder");
            A09(A05, "message_payment_status_update");
            A09(A05, "message_send_count");
            A09(A05, "message_system");
            A09(A05, "message_system_group");
            A09(A05, "message_system_value_change");
            A09(A05, "message_system_number_change");
            A09(A05, "message_system_device_change");
            A0C(A05, "message_system_initial_privacy_provider", "DROP TABLE IF EXISTS message_system_initial_privacy_provider");
            A09(A05, "message_system_photo_change");
            A09(A05, "message_system_chat_participant");
            A09(A05, "message_system_block_contact");
            A0C(A05, "message_system_business_state", "DROP TABLE IF EXISTS message_system_business_state");
            A0C(A05, "media_hash_thumbnail", "DROP TABLE IF EXISTS media_hash_thumbnail");
            A0C(A05, "user_device_info", "DROP TABLE IF EXISTS user_device_info");
            A0C(A05, "played_self_receipt", "DROP TABLE IF EXISTS played_self_receipt");
            A0C(A05, "message_external_ad_content", "DROP TABLE IF EXISTS message_external_ad_content");
            A0C(A05, "message_ui_elements", "DROP TABLE IF EXISTS message_ui_elements");
            A0C(A05, "message_quoted_ui_elements", "DROP TABLE IF EXISTS message_quoted_ui_elements");
            A0C(A05, "message_ui_elements_reply", "DROP TABLE IF EXISTS message_ui_elements_reply");
            A0C(A05, "message_quoted_ui_elements_reply", "DROP TABLE IF EXISTS message_quoted_ui_elements_reply");
            A0C(A05, "message_quoted_ui_elements_reply_legacy", "DROP TABLE IF EXISTS message_quoted_ui_elements_reply_legacy");
            A0C(A05, "message_privacy_state", "DROP TABLE IF EXISTS message_privacy_state");
            A0C(A05, "message_view_once_media", "DROP TABLE IF EXISTS message_view_once_media");
            A0C(A05, "message_quoted_view_once_media", "DROP TABLE IF EXISTS message_quoted_view_once_media");
            A0C(A05, "message_quoted_view_once_media_legacy", "DROP TABLE IF EXISTS message_quoted_view_once_media_legacy");
            A0C(A05, "message_broadcast_ephemeral", "DROP TABLE IF EXISTS message_broadcast_ephemeral");
            A0C(A05, "message_ephemeral_setting", "DROP TABLE IF EXISTS message_ephemeral_setting");
            A0C(A05, "message_system_ephemeral_setting_not_applied", "DROP TABLE IF EXISTS message_system_ephemeral_setting_not_applied");
            A09(A05, "labeled_jids");
            A09(A05, "labeled_messages");
            A09(A05, "labels");
            A09(A05, "labeled_jid");
            A09(A05, "away_messages");
            A09(A05, "away_messages_exemptions");
            A09(A05, "quick_replies");
            A09(A05, "quick_reply_usage");
            A09(A05, "quick_reply_keywords");
            A09(A05, "keywords");
            A09(A05, "quick_reply_attachments");
            A0C(A05, "message_payment_invite", "DROP TABLE IF EXISTS message_payment_invite");
            A0C(A05, "message_quoted_payment_invite", "DROP TABLE IF EXISTS message_quoted_payment_invite");
            A0C(A05, "messages_quotes_payment_invite_legacy", "DROP TABLE IF EXISTS messages_quotes_payment_invite_legacy");
            A0C(A05, "message_system_payment_invite_setup", "DROP TABLE IF EXISTS message_system_payment_invite_setup");
            if (TextUtils.isEmpty(A06(sQLiteDatabase2, "table", "props"))) {
                A05.A0C("CREATE TABLE props (_id INTEGER PRIMARY KEY AUTOINCREMENT, key TEXT UNIQUE, value TEXT)");
            }
            A0B(A05, "fts_ready", 5L);
            A0B(A05, "call_log_ready", 1L);
            A0B(A05, "chat_ready", 2L);
            A0B(A05, "blank_me_jid_ready", 1L);
            A0B(A05, "participant_user_ready", 2L);
            C000500h c000500h = this.A05;
            c000500h.A0D().putBoolean("md_messaging_enabled", true).apply();
            A0B(A05, "broadcast_me_jid_ready", 2L);
            A0B(A05, "receipt_user_ready", 2L);
            A0B(A05, "receipt_device_migration_complete", 1L);
            A0B(A05, "status_list_ready", 1L);
            A05.A0D("DELETE FROM props WHERE key = ?", new String[]{"message_streaming_sidecar_timestamp"});
            A0B(A05, "media_message_ready", 2L);
            A0B(A05, "media_message_fixer_ready", 3L);
            Log.i("DatabaseHelper/using NOT migrated DB");
            C01B c01b = this.A04;
            A0L(A05, c01b);
            if (A0Q(A05, c01b)) {
                A05.A0C("INSERT INTO messages(_id, key_remote_jid, key_from_me, key_id, status, needs_push, data, timestamp, media_url, media_mime_type, media_wa_type, media_size, media_name, media_hash, media_duration, origin, latitude, longitude, thumb_image, received_timestamp, send_timestamp, receipt_server_timestamp, receipt_device_timestamp, read_device_timestamp, played_device_timestamp, mentioned_jids) VALUES (1, '-1', 0, '-1', -1, 0, NULL, 0, NULL, NULL, -1, -1, NULL, NULL, 0, 0, 0, 0, NULL, -1, -1, -1, -1, -1, -1, NULL)");
            }
            A0D(A05, A0F(A05));
            A0M(A05, c01b, A0F(A05));
            A0A(A05, A0F(A05) ? "f9e17a3ee9a9d1fc98c619f904db568b" : "571fe48aa194430baacd88a4ba171e89");
            C000200d.A0j(c000500h, "force_db_check", false);
            sQLiteDatabase2.setTransactionSuccessful();
            sQLiteDatabase2.endTransaction();
            this.A00 = A05;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getVersion();
        sQLiteDatabase.execSQL("PRAGMA synchronous=NORMAL;");
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA secure_delete=1", null);
            if (rawQuery != null) {
                while (rawQuery.moveToNext()) {
                    rawQuery.getInt(0);
                }
                rawQuery.close();
            }
        } catch (SQLiteDiskIOException e) {
            Log.e("msgstore/enable_secure_delete", e);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C000200d.A0t("msgstore/upgrade version ", i, " to ", i2);
        onCreate(sQLiteDatabase);
    }
}
