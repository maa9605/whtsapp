package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0ok  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C15490ok {
    public static final String[] A0A = {"UPDATE", "DELETE", "INSERT"};
    public C15460oh A00;
    public Map A02;
    public final AbstractC15540ov A05;
    public final HashMap A06;
    public final String[] A07;
    public volatile C38621oi A08;
    public AtomicBoolean A03 = new AtomicBoolean(false);
    public volatile boolean A09 = false;
    public final C02550Bw A04 = new C02550Bw();
    public Runnable A01 = new Runnable() { // from class: X.0og
        public final Set A00() {
            HashSet hashSet = new HashSet();
            C15490ok c15490ok = C15490ok.this;
            AbstractC15540ov abstractC15540ov = c15490ok.A05;
            C28921Ul c28921Ul = new C28921Ul("SELECT * FROM room_table_modification_log WHERE invalidated = 1;");
            abstractC15540ov.A01();
            abstractC15540ov.A02();
            Cursor A00 = ((C28931Um) abstractC15540ov.A00.AE5()).A00(c28921Ul);
            while (A00.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(A00.getInt(0)));
                } catch (Throwable th) {
                    A00.close();
                    throw th;
                }
            }
            A00.close();
            if (!hashSet.isEmpty()) {
                c15490ok.A08.A00.executeUpdateDelete();
            }
            return hashSet;
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0115 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 283
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: X.RunnableC15450og.run():void");
        }
    };

    public C15490ok(AbstractC15540ov abstractC15540ov, Map map, Map map2, String... strArr) {
        this.A05 = abstractC15540ov;
        int length = strArr.length;
        this.A00 = new C15460oh(length);
        this.A06 = new HashMap();
        this.A02 = map2;
        Collections.newSetFromMap(new IdentityHashMap());
        this.A07 = new String[length];
        for (int i = 0; i < length; i++) {
            String lowerCase = strArr[i].toLowerCase(Locale.US);
            this.A06.put(lowerCase, Integer.valueOf(i));
            String str = (String) map.get(strArr[i]);
            if (str != null) {
                this.A07[i] = str.toLowerCase(Locale.US);
            } else {
                this.A07[i] = lowerCase;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(Locale.US);
            if (this.A06.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(Locale.US);
                HashMap hashMap = this.A06;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    public void A00(InterfaceC15820pO interfaceC15820pO) {
        ReentrantReadWriteLock.ReadLock readLock;
        String[] strArr;
        String[] strArr2;
        SQLiteDatabase sQLiteDatabase = ((C28931Um) interfaceC15820pO).A00;
        if (sQLiteDatabase.inTransaction()) {
            return;
        }
        while (true) {
            try {
                readLock = this.A05.A07.readLock();
                readLock.lock();
                C15460oh c15460oh = this.A00;
                synchronized (c15460oh) {
                    if (!c15460oh.A00 || c15460oh.A01) {
                        break;
                    }
                    long[] jArr = c15460oh.A03;
                    int length = jArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        boolean z = jArr[i] > 0;
                        boolean[] zArr = c15460oh.A04;
                        if (z != zArr[i]) {
                            c15460oh.A02[i] = z ? 1 : 2;
                        } else {
                            c15460oh.A02[i] = 0;
                        }
                        zArr[i] = z;
                        i++;
                    }
                    c15460oh.A01 = true;
                    c15460oh.A00 = false;
                    int[] iArr = c15460oh.A02;
                    if (iArr == null) {
                        break;
                    }
                    int length2 = iArr.length;
                    sQLiteDatabase.beginTransaction();
                    for (int i2 = 0; i2 < length2; i2++) {
                        int i3 = iArr[i2];
                        if (i3 == 1) {
                            sQLiteDatabase.execSQL(C000200d.A0E("INSERT OR IGNORE INTO room_table_modification_log VALUES(", i2, ", 0)"));
                            String str = this.A07[i2];
                            StringBuilder sb = new StringBuilder();
                            for (String str2 : A0A) {
                                sb.setLength(0);
                                sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
                                sb.append("`");
                                sb.append("room_table_modification_trigger_");
                                C000200d.A1U(sb, str, "_", str2, "`");
                                C000200d.A1U(sb, " AFTER ", str2, " ON `", str);
                                C000200d.A1U(sb, "` BEGIN UPDATE ", "room_table_modification_log", " SET ", "invalidated");
                                C000200d.A1U(sb, " = 1", " WHERE ", "table_id", " = ");
                                sb.append(i2);
                                sb.append(" AND ");
                                sb.append("invalidated");
                                sb.append(" = 0");
                                sb.append("; END");
                                sQLiteDatabase.execSQL(sb.toString());
                            }
                        } else if (i3 == 2) {
                            String str3 = this.A07[i2];
                            StringBuilder sb2 = new StringBuilder();
                            for (String str4 : A0A) {
                                sb2.setLength(0);
                                sb2.append("DROP TRIGGER IF EXISTS ");
                                sb2.append("`");
                                sb2.append("room_table_modification_trigger_");
                                sQLiteDatabase.execSQL(C000200d.A0N(sb2, str3, "_", str4, "`"));
                            }
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    C15460oh c15460oh2 = this.A00;
                    synchronized (c15460oh2) {
                        c15460oh2.A01 = false;
                    }
                    readLock.unlock();
                }
            } catch (SQLiteException | IllegalStateException e) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                return;
            }
        }
        readLock.unlock();
    }
}
