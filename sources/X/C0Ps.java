package X;

import android.database.Cursor;
import android.util.Pair;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0Ps  reason: invalid class name */
/* loaded from: classes.dex */
public class C0Ps extends AbstractC05100Nh implements InterfaceC05660Pp {
    public final C05B A00;
    public final C0GU A01;
    public final C05C A02;
    public final C05L A03;

    @Override // X.AbstractC05100Nh
    public String A0B() {
        return "labeled_jids_ready";
    }

    @Override // X.AbstractC05100Nh
    public int A0R() {
        return 1024;
    }

    @Override // X.AbstractC05100Nh
    public String A0U() {
        return "SELECT _id, label_id, jid  FROM labeled_jids WHERE _id>?  ORDER BY _id ASC LIMIT ?";
    }

    @Override // X.AbstractC05100Nh
    public String A0V() {
        return "migration_labeled_jid_retry";
    }

    @Override // X.AbstractC05100Nh
    public String A0W() {
        return "migration_labeled_jid_index";
    }

    public C0Ps(C05B c05b, C0GU c0gu, C05C c05c, C05L c05l, C05670Pr c05670Pr) {
        super("labeled_jid", 1, c05670Pr);
        this.A00 = c05b;
        this.A01 = c0gu;
        this.A02 = c05c;
        this.A03 = c05l;
    }

    @Override // X.AbstractC05100Nh
    public long A05() {
        return this.A09.A03();
    }

    @Override // X.AbstractC05100Nh
    public Pair A0T(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("label_id");
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("jid");
        long j = -1;
        int i = 0;
        while (cursor.moveToNext()) {
            C0CF A01 = this.A03.A01("INSERT or REPLACE INTO labeled_jid(    label_id,    jid_row_id) VALUES (?, ?)");
            j = cursor.getLong(columnIndexOrThrow);
            long j2 = cursor.getLong(columnIndexOrThrow2);
            String string = cursor.getString(columnIndexOrThrow3);
            AbstractC005302j A02 = AbstractC005302j.A02(string);
            if (A02 != null) {
                A01.A04(1, j2);
                A01.A04(2, this.A00.A02(A02));
                A01.A01();
                i++;
            } else {
                C000200d.A13("LabelJidStore/processBatch/invalid jid in original table, jid=", string);
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
        String A02;
        C0GU c0gu = this.A01;
        return c0gu.A01.A0C() && (A02 = c0gu.A04.A02("labeled_jids_ready")) != null && Long.parseLong(A02) == 1;
    }

    @Override // X.InterfaceC05660Pp
    public void onRollback() {
        C0CD A04 = this.A05.A04();
        try {
            C03790Hb A00 = A04.A00();
            A04.A02.A01("labeled_jid", null, null);
            C05C c05c = this.A02;
            c05c.A03("labeled_jids_ready");
            c05c.A03("migration_labeled_jid_index");
            c05c.A03("migration_labeled_jid_retry");
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
