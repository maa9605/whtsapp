package X;

import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.0x3  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C20230x3 {
    public static final FilenameFilter A06 = new FilenameFilter() { // from class: X.0wz
        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            if (str.startsWith("override-")) {
                return false;
            }
            return str.endsWith(".log") || str.endsWith(".zip") || str.endsWith(".tmp");
        }
    };
    public static final FilenameFilter A07 = new FilenameFilter() { // from class: X.0x0
        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith("override-") && str.endsWith(".log");
        }
    };
    public int A00 = 0;
    public long A01 = 0;
    public C20220x2 A02 = new C20220x2();
    public File A03;
    public File A04;
    public final File A05;

    public C20230x3(Context context, File file) {
        if (!file.exists() && !file.mkdirs()) {
            this.A05 = new File(context.getFilesDir(), "profilo");
            File file2 = new File(context.getCacheDir(), "profilo");
            if (file2.exists()) {
                file2.renameTo(this.A05);
            }
            if (!this.A05.exists() && !this.A05.mkdirs()) {
                throw new IllegalStateException("Unable to initialize Profilo folder");
            }
        } else {
            this.A05 = file;
        }
        this.A04 = new File(this.A05, "upload");
        new File(this.A05, "crash_dumps");
        this.A03 = new File(this.A05, "mmap_buffer");
    }
}
