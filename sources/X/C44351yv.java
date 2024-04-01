package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1yv */
/* loaded from: classes2.dex */
public class C44351yv {
    public static final String[] A02 = new String[0];
    public static volatile C44351yv A03;
    public AnonymousClass202 A00;
    public final C44291yp A01;

    public C44351yv(C44291yp c44291yp, AnonymousClass202 anonymousClass202) {
        this.A01 = c44291yp;
        this.A00 = anonymousClass202;
    }

    public static C44351yv A00() {
        if (A03 == null) {
            synchronized (C44351yv.class) {
                if (A03 == null) {
                    A03 = new C44351yv(C44291yp.A00(), AnonymousClass202.A00());
                }
            }
        }
        return A03;
    }

    public static final C44651zQ A01(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("device_id");
        int columnIndex2 = cursor.getColumnIndex("epoch");
        if (cursor.isNull(columnIndex) || cursor.isNull(columnIndex2)) {
            return null;
        }
        return new C44651zQ(cursor.getInt(columnIndex), cursor.getInt(columnIndex2));
    }

    public static final void A02(C0CE c0ce, String str, byte[] bArr, int i, String str2, boolean z, C44651zQ c44651zQ, byte[] bArr2, AbstractC005302j abstractC005302j) {
        C0CF A0B = c0ce.A0B("INSERT OR REPLACE INTO syncd_mutations (mutation_index, mutation_value, mutation_version, collection_name, are_dependencies_missing, device_id, epoch, mutation_mac, chat_jid) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
        SQLiteStatement sQLiteStatement = A0B.A00;
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindString(1, str);
        if (bArr == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindBlob(2, bArr);
        }
        sQLiteStatement.bindLong(3, i);
        sQLiteStatement.bindString(4, str2);
        sQLiteStatement.bindLong(5, z ? 1L : 0L);
        sQLiteStatement.bindLong(6, c44651zQ.A01());
        sQLiteStatement.bindLong(7, c44651zQ.A02());
        if (bArr2 == null) {
            sQLiteStatement.bindNull(8);
        } else {
            sQLiteStatement.bindBlob(8, bArr2);
        }
        if (abstractC005302j == null) {
            sQLiteStatement.bindNull(9);
        } else {
            sQLiteStatement.bindString(9, abstractC005302j.getRawString());
        }
        if (A0B.A01() == -1) {
            Log.e("SyncdMutationsStore/insertOrReplaceMutation was unsuccessful");
        }
    }

    public static final void A03(C0CE c0ce, String[] strArr) {
        C000700j.A06(c0ce.A00.inTransaction());
        C0Jf c0Jf = new C0Jf(strArr, 999);
        while (c0Jf.hasNext()) {
            String[] strArr2 = (String[]) c0Jf.next();
            int length = strArr2.length;
            StringBuilder A0P = C000200d.A0P("DELETE FROM pending_mutations WHERE _id IN ( ");
            A0P.append(TextUtils.join(",", Collections.nCopies(length, "?")));
            A0P.append(" )");
            c0ce.A0D(A0P.toString(), strArr2);
        }
    }

    public static final void A04(C0CE c0ce, String[] strArr) {
        C000700j.A06(c0ce.A00.inTransaction());
        C0Jf c0Jf = new C0Jf(strArr, 999);
        while (c0Jf.hasNext()) {
            String[] strArr2 = (String[]) c0Jf.next();
            int length = strArr2.length;
            StringBuilder A0P = C000200d.A0P("DELETE FROM syncd_mutations WHERE mutation_index IN ");
            A0P.append(C05P.A01(length));
            c0ce.A0D(A0P.toString(), strArr2);
        }
    }

    public final AbstractC44611zM A05(Cursor cursor) {
        return this.A00.A02(cursor.getLong(cursor.getColumnIndex("are_dependencies_missing")) == 1, cursor.getString(cursor.getColumnIndex("_id")), A01(cursor), cursor.getString(cursor.getColumnIndex("mutation_index")), cursor.getBlob(cursor.getColumnIndex("mutation_value")), cursor.getInt(cursor.getColumnIndex("mutation_version")), cursor.getBlob(cursor.getColumnIndex("operation")));
    }

    public final AbstractC44611zM A06(Cursor cursor) {
        AnonymousClass202 anonymousClass202 = this.A00;
        boolean z = cursor.getLong(cursor.getColumnIndex("are_dependencies_missing")) == 1;
        C44651zQ A01 = A01(cursor);
        if (A01 != null) {
            return anonymousClass202.A02(z, null, A01, cursor.getString(cursor.getColumnIndex("mutation_index")), cursor.getBlob(cursor.getColumnIndex("mutation_value")), cursor.getInt(cursor.getColumnIndex("mutation_version")), C44841zk.A03.A01);
        }
        throw null;
    }

    public AbstractC44611zM A07(String str) {
        C0CD A01 = this.A01.A01();
        try {
            Cursor A07 = A01.A02.A07("SELECT _id, mutation_index, mutation_value, mutation_version, operation, device_id, epoch, are_dependencies_missing FROM pending_mutations WHERE mutation_index = ?", new String[]{str});
            if (A07 == null || !A07.moveToNext()) {
                if (A07 != null) {
                    A07.close();
                }
                A01.close();
                return null;
            }
            AbstractC44611zM A05 = A05(A07);
            A07.close();
            A01.close();
            return A05;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A01.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public AbstractC44611zM A08(String str) {
        C0CD A01 = this.A01.A01();
        try {
            Cursor A07 = A01.A02.A07("SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch FROM syncd_mutations WHERE mutation_index = ? ", new String[]{str});
            if (A07 == null || !A07.moveToNext()) {
                if (A07 != null) {
                    A07.close();
                }
                A01.close();
                return null;
            }
            AbstractC44611zM A06 = A06(A07);
            A07.close();
            A01.close();
            return A06;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A01.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public List A09() {
        ArrayList arrayList = new ArrayList();
        C0CD A01 = this.A01.A01();
        try {
            Cursor A07 = A01.A02.A07("SELECT _id, mutation_index, mutation_value, mutation_version, operation, device_id, epoch, are_dependencies_missing FROM pending_mutations WHERE is_ready_to_sync = 1  ORDER BY _id ASC  LIMIT ?", new String[]{String.valueOf(Integer.MAX_VALUE)});
            while (A07.moveToNext()) {
                arrayList.add(A05(A07));
            }
            A07.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A01.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final List A0A(String str, String[] strArr, AnonymousClass203 anonymousClass203) {
        AbstractC44611zM A06;
        ArrayList arrayList = new ArrayList();
        C0CD A01 = this.A01.A01();
        try {
            Cursor A07 = A01.A02.A07(str, strArr);
            while (A07.moveToNext()) {
                if (anonymousClass203.A7O(A07.getString(A07.getColumnIndex("mutation_index"))) && (A06 = A06(A07)) != null) {
                    arrayList.add(A06);
                }
            }
            A07.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A01.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public List A0B(Set set, int i) {
        ArrayList arrayList = new ArrayList(set);
        arrayList.add(String.valueOf(i));
        ArrayList arrayList2 = new ArrayList();
        C0CD A01 = this.A01.A01();
        try {
            C0CE c0ce = A01.A02;
            int size = set.size();
            StringBuilder A0P = C000200d.A0P("SELECT _id, mutation_index, mutation_value, mutation_version, operation, device_id, epoch, are_dependencies_missing FROM pending_mutations WHERE collection_name IN ");
            A0P.append(C05P.A01(size));
            A0P.append(" OR ");
            A0P.append("collection_name");
            A0P.append(" IS NULL ");
            A0P.append(" ORDER BY ");
            Cursor A07 = c0ce.A07(C000200d.A0M(A0P, "_id", " ASC ", " LIMIT ?"), (String[]) arrayList.toArray(A02));
            while (A07.moveToNext()) {
                arrayList2.add(A05(A07));
            }
            A07.close();
            return arrayList2;
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A01.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public Set A0C(Collection collection) {
        byte[] A0B;
        HashSet hashSet = new HashSet();
        C0CD A022 = this.A01.A02();
        try {
            C03790Hb A00 = A022.A00();
            C0CF A0B2 = A022.A02.A0B("INSERT OR REPLACE INTO pending_mutations (mutation_index, mutation_value, mutation_version, operation, device_id, epoch, is_ready_to_sync, collection_name, are_dependencies_missing) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AbstractC44611zM abstractC44611zM = (AbstractC44611zM) it.next();
                SQLiteStatement sQLiteStatement = A0B2.A00;
                sQLiteStatement.clearBindings();
                sQLiteStatement.bindString(1, AbstractC44611zM.A00(abstractC44611zM.A06()));
                AnonymousClass204 A023 = abstractC44611zM.A02();
                if (A023 != null) {
                    A0B = A023.A0B();
                } else {
                    A0B = null;
                }
                if (A0B != null) {
                    AnonymousClass204 A024 = abstractC44611zM.A02();
                    sQLiteStatement.bindBlob(2, A024 == null ? null : A024.A0B());
                } else {
                    sQLiteStatement.bindNull(2);
                }
                sQLiteStatement.bindLong(3, abstractC44611zM.A03);
                sQLiteStatement.bindBlob(4, abstractC44611zM.A05.A01);
                C44651zQ c44651zQ = abstractC44611zM.A00;
                if (c44651zQ == null) {
                    sQLiteStatement.bindNull(5);
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindLong(5, c44651zQ.A01());
                    sQLiteStatement.bindLong(6, abstractC44611zM.A00.A02());
                }
                long j = 0;
                sQLiteStatement.bindLong(7, 0L);
                sQLiteStatement.bindString(8, abstractC44611zM.A06);
                if (abstractC44611zM.A05()) {
                    j = 1;
                }
                sQLiteStatement.bindLong(9, j);
                hashSet.add(String.valueOf(A0B2.A01()));
            }
            A00.A00();
            A00.close();
            return hashSet;
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A022.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void A0D(int i, C44841zk c44841zk, String str, C44651zQ c44651zQ, String str2, AnonymousClass204 anonymousClass204) {
        C0CD A022 = this.A01.A02();
        try {
            C03790Hb A00 = A022.A00();
            if (c44841zk == C44841zk.A02) {
                C0CE c0ce = A022.A02;
                StringBuilder sb = new StringBuilder();
                sb.append("DELETE FROM syncd_mutations WHERE mutation_index IN ");
                sb.append(C05P.A01(1));
                c0ce.A0D(sb.toString(), new String[]{str});
            } else if (c44841zk == C44841zk.A03) {
                C0CE c0ce2 = A022.A02;
                if (anonymousClass204 != null) {
                    A02(c0ce2, str, anonymousClass204.A0B(), i, str2, true, c44651zQ, null, null);
                } else {
                    throw null;
                }
            }
            A00.A00();
            A00.close();
            A022.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A022.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public final void A0E(C0CE c0ce, Collection collection) {
        AbstractC005302j abstractC005302j;
        C000700j.A06(c0ce.A00.inTransaction());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC44611zM abstractC44611zM = (AbstractC44611zM) it.next();
            C44841zk c44841zk = abstractC44611zM.A05;
            if (c44841zk == C44841zk.A03) {
                arrayList.add(abstractC44611zM);
            } else if (c44841zk == C44841zk.A02) {
                arrayList2.add(abstractC44611zM);
            } else {
                StringBuilder A0P = C000200d.A0P("Incorrect operation: ");
                A0P.append(c44841zk);
                throw new IllegalStateException(A0P.toString());
            }
        }
        A04(c0ce, AnonymousClass205.A01(arrayList2));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC44611zM abstractC44611zM2 = (AbstractC44611zM) it2.next();
            String A00 = AbstractC44611zM.A00(abstractC44611zM2.A06());
            AnonymousClass204 A022 = abstractC44611zM2.A02();
            byte[] A0B = A022 == null ? null : A022.A0B();
            int i = abstractC44611zM2.A03;
            String str = abstractC44611zM2.A06;
            boolean A05 = abstractC44611zM2.A05();
            C44651zQ c44651zQ = abstractC44611zM2.A00;
            if (c44651zQ != null) {
                byte[] bArr = abstractC44611zM2.A02;
                if (abstractC44611zM2 instanceof InterfaceC44621zN) {
                    abstractC005302j = ((InterfaceC44621zN) abstractC44611zM2).A8o();
                } else {
                    abstractC005302j = null;
                }
                A02(c0ce, A00, A0B, i, str, A05, c44651zQ, bArr, abstractC005302j);
            } else {
                throw null;
            }
        }
    }

    public void A0F(AbstractC44611zM abstractC44611zM) {
        C0CD A022 = this.A01.A02();
        try {
            C03790Hb A00 = A022.A00();
            A03(A022.A02, new String[]{abstractC44611zM.A07});
            A00.A00();
            A00.close();
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A022.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void A0G(Collection collection) {
        C0CD A022 = this.A01.A02();
        try {
            C03790Hb A00 = A022.A00();
            A0I(A0C(collection));
            A00.A00();
            A00.close();
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A022.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void A0H(Collection collection) {
        C0CD A022 = this.A01.A02();
        try {
            C03790Hb A00 = A022.A00();
            A0E(A022.A02, collection);
            A00.A00();
            A00.close();
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A022.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void A0I(Set set) {
        if (set.isEmpty()) {
            return;
        }
        C0CD A022 = this.A01.A02();
        try {
            C03790Hb A00 = A022.A00();
            C0Jf c0Jf = new C0Jf(set.toArray(A02), 999);
            while (c0Jf.hasNext()) {
                String[] strArr = (String[]) c0Jf.next();
                C0CE c0ce = A022.A02;
                int length = strArr.length;
                StringBuilder sb = new StringBuilder();
                sb.append("UPDATE pending_mutations SET is_ready_to_sync = 1 WHERE _id IN ( ");
                sb.append(TextUtils.join(",", Collections.nCopies(length, "?")));
                sb.append(" )");
                c0ce.A0D(sb.toString(), strArr);
            }
            A00.A00();
            A00.close();
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A022.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public boolean A0J() {
        C0CD A01 = this.A01.A01();
        try {
            Cursor A07 = A01.A02.A07("SELECT _id FROM syncd_mutations LIMIT 1", null);
            if (A07 != null) {
                if (!A07.moveToNext()) {
                    A07.close();
                } else {
                    boolean z = A07.getString(0) != null;
                    A07.close();
                    A01.close();
                    return z;
                }
            }
            A01.close();
            return false;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A01.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public boolean A0K(Set set) {
        C0CE ACk = this.A01.ACk();
        int size = set.size();
        StringBuilder A0P = C000200d.A0P("SELECT _id FROM syncd_mutations WHERE collection_name IN ");
        A0P.append(C05P.A01(size));
        A0P.append(" LIMIT 1");
        Cursor A07 = ACk.A07(A0P.toString(), (String[]) set.toArray(A02));
        if (A07 != null) {
            try {
                if (A07.moveToNext()) {
                    boolean z = A07.getString(0) != null;
                    A07.close();
                    return z;
                }
                A07.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        A07.close();
                    } catch (Throwable unused) {
                    }
                    throw th2;
                }
            }
        }
        return false;
    }
}
