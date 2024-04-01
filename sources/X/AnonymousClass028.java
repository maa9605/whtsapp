package X;

import android.os.Environment;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/* renamed from: X.028 */
/* loaded from: classes.dex */
public class AnonymousClass028 {
    public File A00;
    public final C000400f A01;
    public final C02F A02;
    public final File A03;

    public AnonymousClass028(C000400f c000400f, File file, C02F c02f) {
        this.A03 = file;
        this.A01 = c000400f;
        this.A02 = c02f;
    }

    public synchronized File A00() {
        return this.A00;
    }

    public File A01(String str) {
        int i;
        int i2;
        int i3;
        synchronized (this) {
            A02();
            File file = this.A00;
            i = 0;
            if (file == null || !file.exists()) {
                File file2 = this.A03;
                File file3 = new File(file2, UUID.randomUUID().toString());
                this.A00 = file3;
                int i4 = 0;
                while (true) {
                    i2 = i4 + 1;
                    if (i4 >= 10 || file3.mkdir()) {
                        break;
                    }
                    file3 = new File(file2, UUID.randomUUID().toString());
                    this.A00 = file3;
                    i4 = i2;
                }
                if (i2 > 10) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("trash/createtempdir/failed ");
                    sb.append(this.A00.toString());
                    Log.w(sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("trash/createtempdir/failed total-storage:");
                    C000400f c000400f = this.A01;
                    sb2.append(c000400f.A04());
                    sb2.append(" free-storage:");
                    sb2.append(c000400f.A02());
                    Log.w(sb2.toString());
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("trash/createtempdir/failed external-storage-state:");
                    sb3.append(Environment.getExternalStorageState());
                    Log.w(sb3.toString());
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("trash/createtempdir/failed base-dir:");
                    sb4.append(file2);
                    sb4.append(" exists:");
                    sb4.append(file2.exists());
                    sb4.append(" writable:");
                    sb4.append(file2.canWrite());
                    sb4.append(" directory:");
                    sb4.append(file2.isDirectory());
                    Log.w(sb4.toString());
                    try {
                        File canonicalFile = file2.getCanonicalFile();
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("trash/createtempdir/failed canonical-base-dir:");
                        sb5.append(canonicalFile);
                        sb5.append(" exists:");
                        sb5.append(canonicalFile.exists());
                        sb5.append(" writable:");
                        sb5.append(canonicalFile.canWrite());
                        Log.w(sb5.toString());
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("trash/createtempdir/failed StoragePermission?:");
                        sb6.append(this.A02.A0A(Environment.getExternalStorageState()));
                        Log.w(sb6.toString());
                    } catch (IOException e) {
                        Log.w("trash/createtempdir/failed unable to resolve trashDir", e);
                    }
                    throw new IOException("max retries reached while creating temp dir");
                }
            }
        }
        File A00 = A00();
        StringBuilder sb7 = new StringBuilder();
        sb7.append(UUID.randomUUID().toString());
        sb7.append(TextUtils.isEmpty(str) ? "" : C000200d.A0H(".", str));
        File file4 = new File(A00, sb7.toString());
        while (true) {
            i3 = i + 1;
            if (i >= 10 || file4.createNewFile()) {
                break;
            }
            File A002 = A00();
            StringBuilder sb8 = new StringBuilder();
            sb8.append(UUID.randomUUID().toString());
            sb8.append(TextUtils.isEmpty(str) ? "" : C000200d.A0H(".", str));
            file4 = new File(A002, sb8.toString());
            i = i3;
        }
        if (i3 <= 10) {
            return file4;
        }
        throw new IOException("max retries reached while creating temp file");
    }

    public final void A02() {
        File file = this.A03;
        if (file.exists() && !file.isDirectory()) {
            StringBuilder A0P = C000200d.A0P("trash/create-trash-dir/removing ");
            A0P.append(file);
            Log.w(A0P.toString());
            if (!file.delete() && file.exists()) {
                StringBuilder A0P2 = C000200d.A0P("trash/create-trash-dir/failed ");
                A0P2.append(file);
                A0P2.append(" is not a directory");
                Log.e(A0P2.toString());
            }
        }
        if (file.exists()) {
            return;
        }
        file.mkdirs();
        if (file.exists() || file.mkdir()) {
            return;
        }
        Log.w("trash/create-trash-dir/failed");
    }
}
