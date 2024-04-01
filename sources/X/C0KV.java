package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.0KV  reason: invalid class name */
/* loaded from: classes.dex */
public class C0KV {
    public static volatile C0KV A01;
    public final C001200o A00;

    public C0KV(C001200o c001200o) {
        this.A00 = c001200o;
    }

    public static C0KV A00() {
        if (A01 == null) {
            synchronized (C0KV.class) {
                if (A01 == null) {
                    A01 = new C0KV(C001200o.A01);
                }
            }
        }
        return A01;
    }

    public File A01() {
        File file = new File(this.A00.A00.getFilesDir(), "crash_in_video_sentinel");
        if (!file.createNewFile()) {
            StringBuilder A0P = C000200d.A0P("mediatranscodequeue/failed-to-create/");
            A0P.append(file.getAbsolutePath());
            Log.w(A0P.toString());
        }
        return file;
    }

    public void A02() {
        File file = new File(this.A00.A00.getFilesDir(), "crash_in_video_sentinel");
        if (!file.exists() || file.delete()) {
            return;
        }
        Log.w("crashlogs/failed-delete-crash-sentinel-file");
    }
}
