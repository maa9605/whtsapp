package X;

import android.app.Application;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.00f */
/* loaded from: classes.dex */
public class C000400f {
    public static volatile C000400f A08;
    public boolean A00;
    public boolean A01;
    public final AnonymousClass034 A02;
    public final C02F A03;
    public final AnonymousClass028 A04;
    public final AnonymousClass028 A05;
    public final InterfaceC002901k A06;
    public final List A07 = new CopyOnWriteArrayList();

    public C000400f(C001200o c001200o, InterfaceC002901k interfaceC002901k, AnonymousClass034 anonymousClass034, C02F c02f) {
        this.A06 = interfaceC002901k;
        this.A02 = anonymousClass034;
        this.A03 = c02f;
        Application application = c001200o.A00;
        this.A05 = new AnonymousClass028(this, new File(anonymousClass034.A03, ".trash"), c02f);
        this.A04 = new AnonymousClass028(this, new File(application.getFilesDir(), ".trash"), c02f);
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted".equals(externalStorageState)) {
            this.A00 = false;
            this.A01 = false;
        } else if ("mounted_ro".equals(externalStorageState)) {
            this.A00 = false;
            this.A01 = true;
            Log.i("media-state-manager/main/media/read-only");
        } else {
            this.A00 = true;
            this.A01 = false;
            C000200d.A14("media-state-manager/main/media/unavailable ", externalStorageState);
        }
    }

    public static C000400f A00() {
        if (A08 == null) {
            synchronized (C000400f.class) {
                if (A08 == null) {
                    A08 = new C000400f(C001200o.A01, C002801j.A00(), AnonymousClass034.A00(), C02F.A00());
                }
            }
        }
        return A08;
    }

    public static boolean A01() {
        try {
            return Environment.isExternalStorageRemovable();
        } catch (Exception e) {
            Log.w("media-state-manager/checkifremovable/error ", e);
            return true;
        }
    }

    public long A02() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            if (Build.VERSION.SDK_INT >= 18) {
                return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
            }
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (ArithmeticException | IllegalArgumentException e) {
            Log.w("media-state-manager/avail-external-storage/error/", e);
            return 0L;
        }
    }

    public long A03() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        if (Build.VERSION.SDK_INT >= 18) {
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return statFs.getAvailableBlocks() * statFs.getBlockSize();
    }

    public long A04() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            if (Build.VERSION.SDK_INT >= 18) {
                return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
            }
            return statFs.getBlockCount() * statFs.getBlockSize();
        } catch (IllegalArgumentException e) {
            Log.w("media-state-manager/total-external-storage/error/illegal-arg", e);
            return 0L;
        }
    }

    public long A05() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        if (Build.VERSION.SDK_INT >= 18) {
            return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
        }
        return statFs.getBlockCount() * statFs.getBlockSize();
    }

    public File A06() {
        return this.A04.A01("");
    }

    public File A07(File file) {
        if (this.A02.A08(file)) {
            return this.A05.A01("");
        }
        return A06();
    }

    public boolean A08() {
        return this.A00 || this.A01;
    }

    public boolean A09(InterfaceC05880Qp interfaceC05880Qp) {
        String externalStorageState = Environment.getExternalStorageState();
        if (!"mounted".equals(externalStorageState) && !"mounted_ro".equals(externalStorageState)) {
            interfaceC05880Qp.AQ0(externalStorageState);
            return false;
        } else if (Build.VERSION.SDK_INT < 23 || this.A03.A02("android.permission.READ_EXTERNAL_STORAGE") != -1) {
            return true;
        } else {
            interfaceC05880Qp.AQ1();
            return false;
        }
    }

    public boolean A0A(InterfaceC05880Qp interfaceC05880Qp) {
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted_ro".equals(externalStorageState)) {
            interfaceC05880Qp.ANZ(externalStorageState);
            return false;
        } else if (!"mounted".equals(externalStorageState)) {
            interfaceC05880Qp.AQ0(externalStorageState);
            return false;
        } else if (this.A03.A02("android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
            interfaceC05880Qp.ANa();
            return false;
        } else {
            return true;
        }
    }
}
