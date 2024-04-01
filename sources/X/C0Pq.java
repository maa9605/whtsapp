package X;

import android.database.Cursor;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0Pq  reason: invalid class name */
/* loaded from: classes.dex */
public class C0Pq extends AbstractC05100Nh implements InterfaceC05660Pp {
    public final C05R A00;
    public final C05S A01;
    public final C05C A02;
    public final C05L A03;

    @Override // X.AbstractC05100Nh
    public String A0B() {
        return "main_message_ready";
    }

    @Override // X.AbstractC05100Nh
    public int A0R() {
        return 2048;
    }

    @Override // X.AbstractC05100Nh
    public String A0V() {
        return "migration_message_main_retry";
    }

    @Override // X.AbstractC05100Nh
    public String A0W() {
        return "migration_message_main_index";
    }

    public C0Pq(C05R c05r, C05S c05s, C05C c05c, C05L c05l, C05670Pr c05670Pr) {
        super("message_main", 1, c05670Pr);
        this.A00 = c05r;
        this.A01 = c05s;
        this.A02 = c05c;
        this.A03 = c05l;
    }

    @Override // X.AbstractC05100Nh
    public long A05() {
        return this.A09.A03();
    }

    @Override // X.AbstractC05100Nh
    public boolean A0L() {
        return this.A00.A08();
    }

    @Override // X.AbstractC05100Nh
    public Pair A0T(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        long j = -1;
        int i = 0;
        while (cursor.moveToNext()) {
            j = cursor.getLong(columnIndexOrThrow);
            C05S c05s = this.A01;
            AnonymousClass092 A02 = c05s.A02(cursor);
            if (A02 == null) {
                StringBuilder sb = new StringBuilder("MainMessageStore/MainMessageDatabaseMigration/processBatch/missing message; rowId=");
                sb.append(j);
                Log.e(sb.toString());
            } else {
                C0CF A01 = this.A03.A01(C05L.A04);
                c05s.A06(A02, A01);
                A01.A01();
                i++;
            }
        }
        return Pair.create(Long.valueOf(j), Integer.valueOf(i));
    }

    @Override // X.AbstractC05100Nh
    public String A0U() {
        return AbstractC60072ts.A01;
    }

    @Override // X.AbstractC05100Nh
    public Set A0X() {
        HashSet hashSet = new HashSet();
        hashSet.add("migration_jid_store");
        hashSet.add("migration_chat_store");
        hashSet.add("message_frequent");
        hashSet.add("message_future");
        hashSet.add("labeled_jid");
        hashSet.add("message_link");
        hashSet.add("message_location");
        hashSet.add("message_media");
        hashSet.add("media_migration_fixer");
        hashSet.add("message_mention");
        hashSet.add("missed_calls");
        hashSet.add("payment_transaction");
        hashSet.add("message_quoted");
        hashSet.add("message_revoked");
        hashSet.add("message_send_count");
        hashSet.add("message_system");
        hashSet.add("message_text");
        hashSet.add("message_thumbnail");
        hashSet.add("message_vcard");
        return hashSet;
    }

    @Override // X.AbstractC05100Nh
    public void A0Z() {
        C05E c05e = this.A05;
        C000700j.A07(c05e.A09.getReadHoldCount() == 0);
        c05e.A05();
        ReentrantReadWriteLock.WriteLock writeLock = c05e.A08;
        try {
            writeLock.lock();
            C0CD A04 = c05e.A04();
            c05e.A05();
            final C05J c05j = c05e.A06;
            C0HC c0hc = new C0HC("databasehelper/finalizeMigration");
            C03790Hb A00 = A04.A00();
            C0CE c0ce = A04.A02;
            C05J.A0D(c0ce, true);
            C05J.A0B(c0ce, "migration_completed", 1L);
            c05j.A0M(c0ce, c05j.A04, C05J.A0F(c0ce));
            A00.A00();
            A04.A02(new Runnable() { // from class: X.1OC
                @Override // java.lang.Runnable
                public final void run() {
                    C05J.this.A0C = null;
                }
            });
            A00.close();
            C000200d.A0m(c0hc, new StringBuilder("databasehelper/finalizeMigration time spent:"));
            A04.close();
        } finally {
            writeLock.unlock();
        }
    }

    @Override // X.AbstractC05100Nh
    public boolean A0b() {
        return this.A01.A0A();
    }

    public C48012Dl A0c() {
        String str;
        boolean z = true;
        if (A0b()) {
            return new C48012Dl(true, null);
        }
        C05E c05e = this.A05;
        c05e.A05();
        if (!c05e.A06.A0J("message_view").contains(" messages ")) {
            z = false;
            str = "+inconsistent_views";
        } else {
            str = "";
        }
        return new C48012Dl(z, str);
    }

    @Override // X.InterfaceC05660Pp
    public void onRollback() {
        Log.i("MainMessageStore/resetDatabaseMigration/starting");
        C05E c05e = this.A05;
        C0CD A04 = c05e.A04();
        try {
            C03790Hb A00 = A04.A00();
            c05e.A05();
            final C05J c05j = c05e.A06;
            C0HC c0hc = new C0HC("databasehelper/rollbackMigration");
            C03790Hb A002 = A04.A00();
            C0CE c0ce = A04.A02;
            if (c0ce.A00 != null) {
                C05J.A0D(c0ce, false);
                C05J.A0B(c0ce, "migration_completed", 0L);
                c05j.A0M(c0ce, c05j.A04, C05J.A0F(c0ce));
                A002.A00();
                A04.A02(new Runnable() { // from class: X.1OD
                    @Override // java.lang.Runnable
                    public final void run() {
                        C05J.this.A0C = null;
                    }
                });
                A002.close();
                C000200d.A0m(c0hc, new StringBuilder("databasehelper/finalizeMigration time spent:"));
                c0ce.A01("message", null, null);
                C05C c05c = this.A02;
                c05c.A03("main_message_ready");
                c05c.A03("migration_message_main_index");
                c05c.A03("migration_message_main_retry");
                c05e.A05();
                C05J.A0D(c0ce, false);
                A00.A00();
                A00.close();
                A04.close();
                Log.i("MainMessageStore/resetDatabaseMigration/done");
                return;
            }
            throw null;
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
