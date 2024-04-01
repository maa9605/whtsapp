package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.whatsapp.util.Log;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1vv */
/* loaded from: classes2.dex */
public class C42551vv extends SQLiteOpenHelper implements C04k {
    public C0CE A00;
    public C0CE A01;
    public final AbstractC000600i A02;
    public final C04l A03;
    public final C04Z A04;
    public final ReentrantReadWriteLock A05;

    public C42551vv(Context context, AbstractC000600i abstractC000600i, C04Z c04z) {
        super(context, "stickers.db", (SQLiteDatabase.CursorFactory) null, 25);
        this.A02 = abstractC000600i;
        this.A04 = c04z;
        this.A03 = new C04l();
        this.A05 = new ReentrantReadWriteLock();
    }

    public static final void A00(SQLiteDatabase sQLiteDatabase) {
        C000200d.A0a(sQLiteDatabase, "DROP TABLE IF EXISTS downloadable_sticker_packs", "DROP TABLE IF EXISTS stickers", "DROP TABLE IF EXISTS installed_sticker_packs", "DROP TABLE IF EXISTS starred_stickers");
        C000200d.A0a(sQLiteDatabase, "DROP TABLE IF EXISTS sticker_pack_order", "DROP TABLE IF EXISTS recent_stickers", "DROP TABLE IF EXISTS unseen_sticker_packs", "DROP TABLE IF EXISTS third_party_whitelist_packs");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS new_sticker_packs");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS third_party_sticker_emoji_mapping");
    }

    public static final void A01(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("ALTER TABLE ");
            sb.append(str);
            sb.append(" ADD ");
            sb.append(str2);
            sb.append(" ");
            sb.append(str3);
            sQLiteDatabase.execSQL(sb.toString());
        } catch (SQLiteException e) {
            StringBuilder sb2 = new StringBuilder("StickerDBHelper/addColumnIfNotExists/alter_table ");
            sb2.append(str2);
            Log.w(sb2.toString(), e);
        }
    }

    public C0CD A02() {
        return new C0CD(this.A05.readLock(), this, false);
    }

    public C0CD A03() {
        return new C0CD(this.A05.readLock(), this, true);
    }

    @Override // X.C04k
    public C04l ABg() {
        return this.A03;
    }

    @Override // X.C04k
    public synchronized C0CE ACk() {
        C0CE c0ce = this.A00;
        if (c0ce == null || !c0ce.A00.isOpen()) {
            this.A00 = C002501g.A05(super.getReadableDatabase(), this.A04);
        }
        return this.A00;
    }

    @Override // X.C04k
    public synchronized C0CE AE6() {
        C0CE c0ce = this.A01;
        if (c0ce == null || !c0ce.A00.isOpen()) {
            this.A01 = C002501g.A05(super.getWritableDatabase(), this.A04);
        }
        return this.A01;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized SQLiteDatabase getReadableDatabase() {
        C000700j.A08(false, "Use getReadableDatabase instead");
        return ACk().A00;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized SQLiteDatabase getWritableDatabase() {
        C000700j.A08(false, "Use getWritableLoggableDatabase instead");
        return AE6().A00;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE stickers (plain_file_hash TEXT NOT NULL, encrypted_file_hash TEXT, media_key TEXT, mime_type TEXT, height INTEGER NOT NULL, width INTEGER NOT NULL, sticker_pack_id TEXT, file_path TEXT, url TEXT, file_size INTEGER, direct_path TEXT, emojis TEXT, PRIMARY KEY(plain_file_hash))");
        sQLiteDatabase.execSQL("CREATE TABLE downloadable_sticker_packs (id TEXT NOT NULL, name TEXT, publisher TEXT, description TEXT, size INTEGER NOT NULL, tray_image_id TEXT, tray_image_preview_id TEXT, preview_image_id_array TEXT, image_data_hash TEXT NOT NULL, animated_pack INTEGER NOT NULL, PRIMARY KEY(id))");
        sQLiteDatabase.execSQL("CREATE TABLE installed_sticker_packs (installed_id TEXT NOT NULL, installed_name TEXT, installed_publisher TEXT, installed_description TEXT, installed_size INTEGER NOT NULL, installed_image_data_hash TEXT NOT NULL, installed_tray_image_id TEXT NOT NULL, installed_tray_image_preview_id TEXT, installed_animated_pack INTEGER NOT NULL, PRIMARY KEY(installed_id))");
        sQLiteDatabase.execSQL("CREATE TABLE starred_stickers (plaintext_hash TEXT  NOT NULL , timestamp LONG , hash_of_image_part TEXT , url TEXT , enc_hash TEXT , direct_path TEXT , mimetype TEXT , media_key TEXT , file_size INTEGER , width INTEGER , height INTEGER , emojis TEXT , is_first_party INTEGER , PRIMARY KEY(plaintext_hash))");
        sQLiteDatabase.execSQL("CREATE TABLE sticker_pack_order (sticker_pack_id TEXT PRIMARY KEY NOT NULL, pack_order INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE recent_stickers (plaintext_hash TEXT  NOT NULL , entry_weight FLOAT  NOT NULL , hash_of_image_part TEXT , url TEXT , enc_hash TEXT , direct_path TEXT , mimetype TEXT , media_key TEXT , file_size INTEGER , width INTEGER , height INTEGER , emojis TEXT , is_first_party INTEGER , PRIMARY KEY(plaintext_hash))");
        sQLiteDatabase.execSQL("CREATE TABLE unseen_sticker_packs (pack_id TEXT PRIMARY KEY NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE third_party_whitelist_packs (authority TEXT NOT NULL, sticker_pack_id TEXT NOT NULL, sticker_pack_name TEXT, sticker_pack_publisher TEXT, sticker_pack_image_data_hash TEXT, avoid_cache INTEGER, is_animated_pack INTEGER, PRIMARY KEY (authority,sticker_pack_id))");
        sQLiteDatabase.execSQL("CREATE TABLE new_sticker_packs (pack_id TEXT PRIMARY KEY NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE third_party_sticker_emoji_mapping (plaintext_hash TEXT  NOT NULL , authority TEXT  NOT NULL , sticker_pack_id TEXT  NOT NULL , emojis TEXT , PRIMARY KEY(plaintext_hash))");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C000200d.A0t("StickerDBHelper/onDowngrade/oldVersion:", i, ", newVersion:", i2);
        A00(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x018d A[EDGE_INSN: B:102:0x018d->B:147:0x018f ?: BREAK  ] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0185  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42551vv.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
