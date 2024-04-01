package X;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.05E */
/* loaded from: classes.dex */
public class C05E {
    public static volatile C05E A0A;
    public boolean A00;
    public boolean A01;
    public final AbstractC000600i A02;
    public final C02L A03;
    public final C004802e A04;
    public final C05H A05;
    public final C05J A06;
    public final File A07;
    public final ReentrantReadWriteLock.WriteLock A08;
    public final ReentrantReadWriteLock A09;

    public C05E(AnonymousClass012 anonymousClass012, AbstractC000600i abstractC000600i, C02L c02l, C001200o c001200o, C01B c01b, C04Z c04z, C05F c05f, C000500h c000500h, C05G c05g, C05H c05h) {
        Application application = c001200o.A00;
        this.A07 = application.getDatabasePath("msgstore.db");
        this.A06 = new C05J(application, c01b, c04z, c05f, c000500h, new C04l(), c05g, this.A07);
        this.A02 = abstractC000600i;
        this.A03 = c02l;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.A09 = reentrantReadWriteLock;
        this.A08 = reentrantReadWriteLock.writeLock();
        this.A05 = c05h;
        this.A04 = new C004802e();
    }

    public static C05E A00() {
        if (A0A == null) {
            synchronized (C05E.class) {
                if (A0A == null) {
                    A0A = new C05E(AnonymousClass012.A00(), AbstractC000600i.A00(), C02L.A00(), C001200o.A01, C01B.A00(), C04Z.A00(), C05F.A01, C000500h.A00(), C05G.A00(), C05H.A00);
                }
            }
        }
        return A0A;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x008d, code lost:
        if (r8 != null) goto L38;
     */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0094: MOVE  (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r7 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:135:0x0094 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A01() {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05E.A01():int");
    }

    public long A02() {
        A05();
        return this.A07.length();
    }

    public C0CD A03() {
        A05();
        ReentrantReadWriteLock.ReadLock readLock = this.A09.readLock();
        A05();
        return new C0CD(readLock, this.A06, false);
    }

    public C0CD A04() {
        A05();
        ReentrantReadWriteLock.ReadLock readLock = this.A09.readLock();
        A05();
        return new C0CD(readLock, this.A06, true);
    }

    public void A05() {
        C004802e c004802e = this.A04;
        if (c004802e.A06()) {
            c004802e.A04(new Callable() { // from class: X.1OM
                {
                    C05E.this = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C05E c05e = C05E.this;
                    C02L c02l = c05e.A03;
                    c02l.A05();
                    if (c02l.A00 == null) {
                        c05e.A04.A01();
                        return null;
                    }
                    return null;
                }
            });
            if (c004802e.A05()) {
                A08(true);
            }
            c004802e.A00();
        }
    }

    public final void A06() {
        C05J c05j = this.A06;
        c05j.close();
        File file = c05j.A0A;
        C000200d.A1C("msgstore-manager/deletedb/result/", file.delete() & C002501g.A0O(file, "databasehelper"));
    }

    public final void A07() {
        Log.i("msgstore-manager/setup");
        C000700j.A07(this.A08.isHeldByCurrentThread());
        synchronized (this) {
            C05J c05j = this.A06;
            File file = c05j.A0A;
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            file.delete();
            C002501g.A0O(file, "databasehelper");
            AnonymousClass024.A0U(file, "msgstore/create-db/list ");
            SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(file.getAbsolutePath(), null, 805306384);
            if (openDatabase != null) {
                c05j.onCreate(openDatabase);
                AnonymousClass024.A0U(file, "msgstore/create-db/done/list ");
                c05j.AE6();
                this.A01 = true;
            } else {
                throw null;
            }
        }
    }

    public final boolean A08(boolean z) {
        boolean z2;
        Log.i("msgstore-manager/checkhealth");
        ReentrantReadWriteLock.WriteLock writeLock = this.A08;
        writeLock.lock();
        synchronized (this) {
            if (z) {
                C004802e c004802e = this.A04;
                synchronized (c004802e) {
                    z2 = c004802e.A00 > 3;
                }
                if (z2) {
                    boolean z3 = this.A01;
                    writeLock.unlock();
                    c004802e.A01();
                    return z3;
                }
            }
            if (!this.A01) {
                this.A04.A03();
                File file = this.A07;
                String parent = file.getParent();
                StringBuilder sb = new StringBuilder();
                sb.append(file.getName());
                sb.append("-journal");
                boolean delete = new File(parent, sb.toString()).delete();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("msgstore-manager/checkhealth/journal/delete ");
                sb2.append(delete);
                Log.i(sb2.toString());
                String parent2 = file.getParent();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(file.getName());
                sb3.append(".back");
                boolean delete2 = new File(parent2, sb3.toString()).delete();
                StringBuilder sb4 = new StringBuilder();
                sb4.append("msgstore-manager/checkhealth/back/delete ");
                sb4.append(delete2);
                Log.i(sb4.toString());
                try {
                    this.A06.AE6();
                    this.A01 = true;
                    this.A00 = true;
                } catch (SQLiteDatabaseCorruptException e) {
                    Log.e("msgstore-manager/checkhealth ", e);
                    A06();
                } catch (SQLiteException e2) {
                    Log.w("msgstore-manager/checkhealth no db", e2);
                }
            }
            writeLock.unlock();
            this.A04.A01();
            A05();
            return this.A01;
        }
    }
}
