package X;

import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.SparseIntArray;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1Ki */
/* loaded from: classes.dex */
public class C26711Ki {
    public static volatile C26711Ki A0D;
    public final C03020Dv A00;
    public final AbstractC000600i A01;
    public final C012005w A02;
    public final C01B A03;
    public final AnonymousClass034 A04;
    public final C000400f A05;
    public final AnonymousClass012 A06;
    public final C001200o A07;
    public final C02F A08;
    public final C000500h A09;
    public final AnonymousClass011 A0A;
    public final C05G A0B;
    public final AtomicBoolean A0C = new AtomicBoolean(false);

    public C26711Ki(C001200o c001200o, AnonymousClass012 anonymousClass012, AbstractC000600i abstractC000600i, C012005w c012005w, AnonymousClass011 anonymousClass011, AnonymousClass034 anonymousClass034, C01B c01b, C000400f c000400f, C02F c02f, C000500h c000500h, C05G c05g, C03020Dv c03020Dv) {
        this.A07 = c001200o;
        this.A06 = anonymousClass012;
        this.A01 = abstractC000600i;
        this.A02 = c012005w;
        this.A0A = anonymousClass011;
        this.A04 = anonymousClass034;
        this.A03 = c01b;
        this.A05 = c000400f;
        this.A08 = c02f;
        this.A09 = c000500h;
        this.A0B = c05g;
        this.A00 = c03020Dv;
    }

    public final int A00() {
        int i = this.A09.A00.getInt("external_dir_migration_stage", 0);
        if (i < 0 || i > 5) {
            StringBuilder sb = new StringBuilder("externaldirmigration/unexpected stage (");
            sb.append(i);
            sb.append(") resetting to not started");
            Log.e(sb.toString());
            return 0;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x0057, code lost:
        if ((!new java.io.File(r26, ".nomedia").exists()) == false) goto L123;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A01(java.io.File r25, java.io.File r26, boolean r27, android.util.SparseIntArray r28, X.C34351hN r29) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26711Ki.A01(java.io.File, java.io.File, boolean, android.util.SparseIntArray, X.1hN):int");
    }

    public final void A02(int i, SparseIntArray sparseIntArray) {
        if (sparseIntArray != null) {
            int i2 = sparseIntArray.get(i, 0);
            sparseIntArray.put(i, i2 + 1);
            if (i2 != 0) {
                return;
            }
        }
        if (i == 2 || i == 3 || i == 4 || i == 6) {
            AbstractC000600i abstractC000600i = this.A01;
            StringBuilder A0P = C000200d.A0P("externaldirmigration/failed: ");
            Integer valueOf = Integer.valueOf(i);
            A0P.append(valueOf == null ? null : valueOf.toString());
            abstractC000600i.A08(A0P.toString(), -1);
        }
        C36851lT c36851lT = new C36851lT();
        c36851lT.A00 = Integer.valueOf(i);
        SharedPreferences sharedPreferences = this.A09.A00;
        c36851lT.A01 = Long.valueOf(sharedPreferences.getLong("external_dir_migration_attempt_n", -1L));
        c36851lT.A04 = Long.valueOf(sharedPreferences.getLong("ext_dir_migration_rescan_time", -1L));
        c36851lT.A03 = Long.valueOf(sharedPreferences.getLong("ext_dir_migration_move_time", -1L));
        c36851lT.A02 = Long.valueOf(this.A06.A01() - sharedPreferences.getLong("ext_dir_migration_start_time", 0L));
        this.A0A.A0B(c36851lT, null, false);
    }

    public final void A03(Uri uri, File file) {
        ContentResolver contentResolver = this.A07.A00.getContentResolver();
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsolutePath());
        sb.append('%');
        contentResolver.delete(uri, "_data LIKE ?", new String[]{sb.toString()});
    }

    public final void A04(File file, List list, Set set) {
        File[] listFiles;
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            boolean z = !new File(file, ".nomedia").exists();
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    if (set.add(file2)) {
                        A04(file2, list, set);
                    }
                } else if (z) {
                    list.add(file2);
                }
            }
        }
    }

    public boolean A05() {
        return this.A0B.A02() && this.A03.A0E(C01C.A2O) && this.A04.A04() != null && A00() != 5;
    }
}
