package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1z0  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44401z0 {
    public static volatile C44401z0 A01;
    public final C44291yp A00;

    public C44401z0(C44291yp c44291yp) {
        this.A00 = c44291yp;
    }

    public static C44401z0 A00() {
        if (A01 == null) {
            synchronized (C44401z0.class) {
                if (A01 == null) {
                    A01 = new C44401z0(C44291yp.A00());
                }
            }
        }
        return A01;
    }

    public Long A01(String str) {
        C0CD A012 = this.A00.A01();
        try {
            Cursor A07 = A012.A02.A07("SELECT version FROM collection_versions WHERE collection_name = ?", new String[]{str});
            Long valueOf = (A07 == null || !A07.moveToFirst()) ? null : Long.valueOf(A07.getLong(0));
            if (A07 != null) {
                A07.close();
            }
            return valueOf;
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A012.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public Map A02() {
        HashMap hashMap = new HashMap();
        C0CD A012 = this.A00.A01();
        try {
            Cursor A07 = A012.A02.A07("SELECT collection_name, version FROM collection_versions", null);
            while (A07.moveToNext()) {
                hashMap.put(A07.getString(A07.getColumnIndex("collection_name")), Long.valueOf(A07.getLong(A07.getColumnIndex("version"))));
            }
            A07.close();
            return hashMap;
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A012.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void A03(String str) {
        C0CD A02 = this.A00.A02();
        try {
            C03790Hb A00 = A02.A00();
            A02.A02.A0D("UPDATE collection_versions SET dirty_version = -1 WHERE collection_name = ? AND dirty_version = 0", new String[]{str});
            A00.A00();
            A00.close();
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A02.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void A04(String str) {
        C0CD A02 = this.A00.A02();
        try {
            C03790Hb A00 = A02.A00();
            C0CF A0B = A02.A02.A0B("INSERT OR IGNORE INTO collection_versions (collection_name, version, lt_hash, dirty_version) VALUES (?, ?, ?, ?)");
            SQLiteStatement sQLiteStatement = A0B.A00;
            sQLiteStatement.bindString(1, str);
            sQLiteStatement.bindLong(2, 0L);
            sQLiteStatement.bindNull(3);
            sQLiteStatement.bindLong(4, -1L);
            A0B.A01();
            A00.A00();
            A00.close();
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A02.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void A05(String str, long j) {
        C000700j.A07(j >= 0);
        C0CD A02 = this.A00.A02();
        try {
            C03790Hb A00 = A02.A00();
            A04(str);
            C0CF A0B = A02.A02.A0B("UPDATE collection_versions SET dirty_version = ?  WHERE collection_name = ? ");
            SQLiteStatement sQLiteStatement = A0B.A00;
            sQLiteStatement.bindLong(1, j);
            sQLiteStatement.bindString(2, str);
            if (A0B.A00() <= 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("SyncDbStore/updateCollectionDirtyVersion failed for collection: ");
                sb.append(str);
                sb.append(", dirtyVersion: ");
                sb.append(j);
                Log.e(sb.toString());
            }
            A00.A00();
            A00.close();
        } finally {
        }
    }

    public void A06(String str, long j, byte[] bArr) {
        C0CD A02 = this.A00.A02();
        try {
            C03790Hb A00 = A02.A00();
            A04(str);
            C0CF A0B = A02.A02.A0B("UPDATE collection_versions SET version = ?  , lt_hash = ?  WHERE collection_name = ? ");
            SQLiteStatement sQLiteStatement = A0B.A00;
            sQLiteStatement.bindLong(1, j);
            if (bArr != null) {
                sQLiteStatement.bindBlob(2, bArr);
            }
            sQLiteStatement.bindString(3, str);
            if (A0B.A00() <= 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("SyncDbStore/updateCollectionVersion failed for collection: ");
                sb.append(str);
                sb.append(", version: ");
                sb.append(j);
                sb.append(", ltHash: ");
                sb.append(Arrays.toString(bArr));
                Log.e(sb.toString());
            }
            A00.A00();
            A00.close();
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A02.close();
                } catch (Throwable unused) {
                }
            }
        }
    }
}
