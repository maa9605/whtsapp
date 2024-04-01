package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.PrintWriter;

/* renamed from: X.1rG  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C40001rG {
    public static volatile C40001rG A01;
    public final C001200o A00;

    public C40001rG(C001200o c001200o) {
        this.A00 = c001200o;
    }

    public static C40001rG A00() {
        if (A01 == null) {
            synchronized (C40001rG.class) {
                A01 = new C40001rG(C001200o.A01);
            }
        }
        return A01;
    }

    public static File[] A01(C001200o c001200o) {
        File[] fileArr;
        File file = new File(c001200o.A00.getCacheDir(), "traces");
        if (!file.exists() || (fileArr = file.listFiles(new FilenameFilter() { // from class: X.3aP
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str) {
                return str.endsWith(".stacktrace");
            }
        })) == null) {
            fileArr = new File[0];
        }
        return fileArr.length > 0 ? fileArr : new File[0];
    }

    /* JADX WARN: Finally extract failed */
    public File A02(String str) {
        File file = new File(this.A00.A00.getCacheDir(), "traces");
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuilder A0V = C000200d.A0V("2.21.9.15", "_");
        A0V.append(C002601h.A08);
        File file2 = new File(file, C000200d.A0H(A0V.toString(), ".stacktrace"));
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            PrintWriter printWriter = new PrintWriter(fileOutputStream);
            printWriter.write(str);
            printWriter.flush();
            fileOutputStream.close();
            StringBuilder sb = new StringBuilder("anr-helper/stored anr report: ");
            sb.append(file2.getName());
            Log.i(sb.toString());
            return file2;
        } finally {
        }
    }
}
