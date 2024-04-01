package X;

import android.os.Build;
import android.os.Environment;
import android.os.UserManager;
import java.io.File;

/* renamed from: X.034  reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass034 {
    public static volatile AnonymousClass034 A04;
    public final C001200o A00;
    public final C02F A01;
    public final C000500h A02;
    public final File A03;

    public AnonymousClass034(C001200o c001200o, C02F c02f, C000500h c000500h) {
        File A042;
        this.A00 = c001200o;
        this.A02 = c000500h;
        this.A01 = c02f;
        if (!A01()) {
            A042 = new File(Environment.getExternalStorageDirectory(), "WhatsApp");
        } else {
            String string = this.A02.A00.getString("external_storage_type", null);
            if ("legacy".equals(string)) {
                A042 = new File(Environment.getExternalStorageDirectory(), "WhatsApp");
            } else {
                A042 = A04();
                if (A042 == null) {
                    A042 = new File(Environment.getExternalStorageDirectory(), "WhatsApp");
                } else if (!"scoped".equals(string)) {
                    A042 = new File(Environment.getExternalStorageDirectory(), "WhatsApp");
                    this.A02.A0D().putString("external_storage_type", "legacy").commit();
                }
            }
        }
        this.A03 = A042;
    }

    public static AnonymousClass034 A00() {
        if (A04 == null) {
            synchronized (AnonymousClass034.class) {
                if (A04 == null) {
                    A04 = new AnonymousClass034(C001200o.A01, C02F.A00(), C000500h.A00());
                }
            }
        }
        return A04;
    }

    public static boolean A01() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            return !UserManager.supportsMultipleUsers() || Build.VERSION.PREVIEW_SDK_INT > 0 || i >= 30;
        }
        return false;
    }

    public File A02() {
        return new File(this.A03, "Backups");
    }

    public File A03() {
        return new File(this.A03, "Media");
    }

    public File A04() {
        File[] externalMediaDirs;
        File file;
        if (!A01() || (externalMediaDirs = this.A00.A00.getExternalMediaDirs()) == null || externalMediaDirs.length <= 0 || (file = externalMediaDirs[0]) == null) {
            return null;
        }
        return new File(file, "WhatsApp");
    }

    public File A05(File file) {
        if (file == null) {
            return null;
        }
        if (!file.isAbsolute()) {
            return A06(file.getPath());
        }
        int indexOf = file.getAbsolutePath().indexOf("Media/WhatsApp ");
        return (A08(file) || indexOf <= 0) ? file : A06(file.getAbsolutePath().substring(indexOf));
    }

    public File A06(String str) {
        return new File(this.A03, str);
    }

    public String A07(File file) {
        if (file.isAbsolute()) {
            String absolutePath = file.getAbsolutePath();
            StringBuilder sb = new StringBuilder();
            sb.append(this.A03.getAbsolutePath());
            sb.append("/");
            return absolutePath.replace(sb.toString(), "");
        }
        return file.getPath();
    }

    public boolean A08(File file) {
        return file.getAbsolutePath().startsWith(this.A03.getAbsolutePath());
    }
}
