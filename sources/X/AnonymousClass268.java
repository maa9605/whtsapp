package X;

import android.app.Application;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.268  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass268 {
    public static volatile AnonymousClass268 A03;
    public final C0EL A00;
    public final C001200o A01;
    public final C02C A02;

    public AnonymousClass268(C001200o c001200o, C0EL c0el, C02C c02c) {
        this.A01 = c001200o;
        this.A00 = c0el;
        this.A02 = c02c;
    }

    public AnonymousClass269 A00() {
        File A02 = A02(false);
        if (A02.exists() && new File(A02, "thumbnails").exists()) {
            return new AnonymousClass269(A03("dark"), A03("light"));
        }
        return null;
    }

    public File A01(String str) {
        File A02 = A02(false);
        if (A02.exists()) {
            File file = new File(A02, C000200d.A0H(str, ".jpg"));
            if (file.exists()) {
                return file;
            }
            return null;
        }
        return null;
    }

    public File A02(boolean z) {
        Application application = this.A01.A00;
        if (!z) {
            return new File(application.getFilesDir(), "downloadable/wallpaper");
        }
        return new File(application.getCacheDir(), "downloadable/wallpaper_tmp");
    }

    public final List A03(String str) {
        File A02 = A02(false);
        if (!A02.exists()) {
            return new ArrayList();
        }
        File file = new File(A02, "thumbnails");
        if (!file.exists()) {
            return new ArrayList();
        }
        File file2 = new File(file, str);
        if (!file2.exists()) {
            return new ArrayList();
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null) {
            return new ArrayList();
        }
        Arrays.sort(listFiles, new Comparator() { // from class: X.3We
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((File) obj).getName().compareTo(((File) obj2).getName());
            }
        });
        return Arrays.asList(listFiles);
    }
}
