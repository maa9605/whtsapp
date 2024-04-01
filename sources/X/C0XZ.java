package X;

import java.io.File;
import java.io.FilenameFilter;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0XZ */
/* loaded from: classes.dex */
public class C0XZ {
    public static final long A07 = TimeUnit.DAYS.toMillis(5);
    public static volatile C0XZ A08;
    public final AnonymousClass012 A00;
    public final C001200o A01;
    public final C007303e A02;
    public final C03Y A03;
    public final C03X A04;
    public final Semaphore A05 = new Semaphore(1);
    public volatile File A06 = null;

    public C0XZ(C001200o c001200o, AnonymousClass012 anonymousClass012, C03X c03x, C007303e c007303e, C03Y c03y) {
        this.A01 = c001200o;
        this.A00 = anonymousClass012;
        this.A04 = c03x;
        this.A02 = c007303e;
        this.A03 = c03y;
    }

    public static C0XZ A00() {
        if (A08 == null) {
            synchronized (C0XZ.class) {
                if (A08 == null) {
                    A08 = new C0XZ(C001200o.A01, AnonymousClass012.A00(), C03W.A00(), C007303e.A00(), C03Y.A00());
                }
            }
        }
        return A08;
    }

    public void A01(File file) {
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception e) {
                this.A04.A01(11, "errorString:%s", e.getMessage());
            }
        }
    }

    public final File[] A02(final String str) {
        File file = new File(this.A01.A00.getCacheDir(), "qpl");
        return !file.exists() ? new File[0] : file.listFiles(new FilenameFilter() { // from class: X.1Q7
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str2) {
                return str2.endsWith(str);
            }
        });
    }
}
