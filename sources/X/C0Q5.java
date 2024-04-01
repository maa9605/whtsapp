package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.util.Pair;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0Q5  reason: invalid class name */
/* loaded from: classes.dex */
public class C0Q5 extends AbstractC05100Nh implements InterfaceC05660Pp {
    public final C03730Gv A00;
    public final C05B A01;
    public final C05C A02;
    public final C05L A03;

    @Override // X.AbstractC05100Nh
    public String A0B() {
        return "frequent_ready";
    }

    @Override // X.AbstractC05100Nh
    public int A0R() {
        return 1024;
    }

    @Override // X.AbstractC05100Nh
    public String A0U() {
        return "SELECT _id, jid, type, message_count FROM frequents WHERE _id > ? ORDER BY _id ASC LIMIT ?";
    }

    @Override // X.AbstractC05100Nh
    public String A0V() {
        return "migration_frequent_retry";
    }

    @Override // X.AbstractC05100Nh
    public String A0W() {
        return "migration_frequent_index";
    }

    public C0Q5(C05B c05b, C05C c05c, C05L c05l, C03730Gv c03730Gv, C05670Pr c05670Pr) {
        super("message_frequent", 1, c05670Pr);
        this.A01 = c05b;
        this.A02 = c05c;
        this.A03 = c05l;
        this.A00 = c03730Gv;
    }

    @Override // X.AbstractC05100Nh
    public long A05() {
        return this.A09.A03();
    }

    @Override // X.AbstractC05100Nh
    public Pair A0T(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("jid");
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("type");
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("message_count");
        long j = -1;
        int i = 0;
        while (cursor.moveToNext()) {
            C05L c05l = this.A03;
            C0CF A01 = c05l.A01("INSERT INTO frequent(jid_row_id, type, message_count) VALUES (?, ?, ?)");
            j = cursor.getLong(columnIndexOrThrow);
            String string = cursor.getString(columnIndexOrThrow2);
            long j2 = cursor.getLong(columnIndexOrThrow3);
            long j3 = cursor.getLong(columnIndexOrThrow4);
            AbstractC005302j A02 = AbstractC005302j.A02(string);
            if (A02 != null) {
                long A022 = this.A01.A02(A02);
                A01.A04(1, A022);
                A01.A04(2, j2);
                A01.A04(3, j3);
                try {
                    A01.A01();
                } catch (SQLiteConstraintException unused) {
                    C0CF A012 = c05l.A01("UPDATE frequent   SET message_count = ? WHERE jid_row_id = ? AND type = ?");
                    A012.A04(2, A022);
                    A012.A04(3, j2);
                    A012.A04(1, j3);
                    A012.A00();
                }
                i++;
            } else {
                C000200d.A13("FrequentMessageStore/processBatch/invalid jid in original table, jid=", string);
            }
        }
        return Pair.create(Long.valueOf(j), Integer.valueOf(i));
    }

    @Override // X.AbstractC05100Nh
    public Set A0X() {
        HashSet hashSet = new HashSet();
        hashSet.add("migration_jid_store");
        hashSet.add("migration_chat_store");
        return hashSet;
    }

    @Override // X.AbstractC05100Nh
    public boolean A0b() {
        return this.A00.A08();
    }

    @Override // X.InterfaceC05660Pp
    public void onRollback() {
        C0CD A04 = this.A05.A04();
        try {
            C03790Hb A00 = A04.A00();
            A04.A02.A01("frequent", null, null);
            C05C c05c = this.A02;
            c05c.A03("frequent_ready");
            c05c.A03("migration_frequent_index");
            c05c.A03("migration_frequent_retry");
            A00.A00();
            A00.close();
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A04.close();
                } catch (Throwable unused) {
                }
            }
        }
    }
}
