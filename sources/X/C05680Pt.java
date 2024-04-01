package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteBindOrColumnIndexOutOfRangeException;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatatypeMismatchException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOutOfMemoryException;
import android.util.Pair;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0Pt  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C05680Pt extends AbstractC05100Nh implements InterfaceC05660Pp {
    public final C0D5 A00;
    public final C05C A01;
    public final Map A02;

    @Override // X.AbstractC05100Nh
    public int A0Q() {
        return 3;
    }

    @Override // X.AbstractC05100Nh
    public int A0R() {
        return 256;
    }

    @Override // X.AbstractC05100Nh
    public String A0V() {
        return "migration_fts_retry";
    }

    @Override // X.AbstractC05100Nh
    public String A0W() {
        return "migration_fts_index";
    }

    public C05680Pt(C05C c05c, C0D5 c0d5, C05670Pr c05670Pr) {
        super("message_fts", EditorInfoCompat.IME_FLAG_FORCE_ASCII, c05670Pr);
        this.A02 = new HashMap();
        this.A01 = c05c;
        this.A00 = c0d5;
    }

    @Override // X.AbstractC05100Nh
    public void A0D(C0CD c0cd, long j, int i) {
        Map map = this.A02;
        map.clear();
        try {
            Cursor A07 = c0cd.A02.A07(AbstractC60072ts.A00, new String[]{String.valueOf(j), String.valueOf(i)});
            int columnIndexOrThrow = A07.getColumnIndexOrThrow("chat_row_id");
            int columnIndexOrThrow2 = A07.getColumnIndexOrThrow("_id");
            while (A07.moveToNext()) {
                try {
                    C0D5 c0d5 = this.A00;
                    AnonymousClass092 A0A = c0d5.A0A(columnIndexOrThrow, columnIndexOrThrow2, A07);
                    if (A0A != null && !C0D5.A03(A0A)) {
                        String A0E = c0d5.A0E(A0A);
                        if (A0E.length() < 4096 && (!C28171Qm.A00.matcher(A0E).find())) {
                            map.put(Long.valueOf(A0A.A0p), C09940f2.A01(5L, A0E, c0d5.A03));
                        }
                    }
                } catch (Exception e) {
                    Log.e("FtsDatabaseMigration/preProcessBatch/single fail to preTokenize", e);
                }
            }
            A07.close();
        } catch (Exception e2) {
            try {
                Log.e("FtsDatabaseMigration/preProcessBatch/inner fail to preTokenize", e2);
            } catch (Exception e3) {
                Log.e("FtsDatabaseMigration/preProcessBatch/failed to preTokenize", e3);
            }
        }
    }

    @Override // X.AbstractC05100Nh
    public boolean A0O(SQLException sQLException, int i) {
        if (i == 1 && (sQLException instanceof SQLiteBlobTooBigException)) {
            Log.e("FtsDatabaseMigration/skipping BlobTooBigException single row");
            return true;
        }
        return super.A0O(sQLException, i);
    }

    @Override // X.AbstractC05100Nh
    public Pair A0T(Cursor cursor) {
        boolean z;
        try {
            z = cursor.getCount() == 1;
            try {
                C0D5 c0d5 = this.A00;
                Map map = this.A02;
                if (c0d5 != null) {
                    int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
                    int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("chat_row_id");
                    long j = -1;
                    int i = 0;
                    while (cursor.moveToNext()) {
                        AnonymousClass092 A0A = c0d5.A0A(columnIndexOrThrow2, columnIndexOrThrow, cursor);
                        if (A0A == null) {
                            i++;
                            j = cursor.getLong(columnIndexOrThrow);
                        } else {
                            j = c0d5.A06(A0A, true, 5L, map);
                            map.get(Long.valueOf(j));
                            if (j == -2) {
                                j = A0A.A0p;
                            }
                            i++;
                        }
                    }
                    return Pair.create(Long.valueOf(j), Integer.valueOf(i));
                }
                throw null;
            } catch (SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException unused) {
                if (z) {
                    Log.e("FtsDatabaseMigration/skipping single row");
                }
                return new Pair(-1L, 0);
            }
        } catch (SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException unused2) {
            z = false;
        }
    }

    @Override // X.AbstractC05100Nh
    public String A0U() {
        return AbstractC60072ts.A00;
    }

    @Override // X.AbstractC05100Nh
    public void A0Y() {
        super.A0Y();
        this.A01.A05("fts_ready", 5L);
    }

    @Override // X.AbstractC05100Nh
    public void A0Z() {
        C0D5 c0d5 = this.A00;
        if (c0d5 != null) {
            C0HC c0hc = new C0HC("FtsMessageStore/optimize");
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("messages_fts", "optimize");
            C05E c05e = c0d5.A0B;
            c05e.A05();
            c05e.A06.AE6().A02("messages_fts", contentValues);
            c0hc.A01();
            return;
        }
        throw null;
    }

    @Override // X.AbstractC05100Nh
    public boolean A0b() {
        C0D5 c0d5 = this.A00;
        return c0d5.A0O() && c0d5.A04() == 5;
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.InterfaceC05660Pp
    public void onRollback() {
        C000700j.A07(false);
        C0HC c0hc = new C0HC("FtsMessageStore/reset");
        C0D5 c0d5 = this.A00;
        c0d5.A0J();
        C05E c05e = c0d5.A0B;
        C0CD A04 = c05e.A04();
        try {
            c05e.A05();
            C05J c05j = c05e.A06;
            C0HC c0hc2 = new C0HC("databasehelper/createFtsTable");
            C03790Hb A00 = A04.A00();
            C0CE AE6 = c05j.AE6();
            AE6.A0C("CREATE VIRTUAL TABLE message_ftsv2 USING FTS4(content, fts_jid, fts_namespace)");
            C01B c01b = c05j.A04;
            c05j.A0M(AE6, c01b, c05j.A0P(A04));
            A00.A00();
            A00.close();
            C000200d.A0m(c0hc2, new StringBuilder("databasehelper/createFtsDeprecatedTable time spent:"));
            A04.close();
            C0CD A042 = c05e.A04();
            try {
                c05e.A05();
                C0HC c0hc3 = new C0HC("databasehelper/createFtsDeprecatedTable");
                C03790Hb A002 = A042.A00();
                C0CE c0ce = A042.A02;
                c0ce.A0C("CREATE VIRTUAL TABLE messages_fts USING FTS3()");
                c05j.A0M(c0ce, c01b, c05j.A0P(A042));
                A002.A00();
                A002.close();
                C000200d.A0m(c0hc3, new StringBuilder("databasehelper/createFtsDeprecatedTable time spent:"));
                A042.close();
                c0hc.A01();
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A04.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }
}
