package X;

import android.os.Bundle;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.2m3  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C55702m3 {
    public long A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final long A04;
    public final String A05;

    public String A01() {
        return null;
    }

    public C55702m3(String str, long j, long j2, boolean z, boolean z2, boolean z3) {
        this.A05 = str;
        this.A04 = j;
        this.A00 = j2;
        this.A03 = z;
        this.A01 = z2;
        this.A02 = z3;
    }

    public static C55702m3 A00(Bundle bundle) {
        if (bundle.containsKey("account_name")) {
            String string = bundle.getString("account_name");
            if (string != null) {
                C55702m3 c55702m3 = new C55702m3(string, bundle.getLong("last_modified", -1L), bundle.getLong("total_backup_size", -1L), bundle.getBoolean("overwrite_local_files"), bundle.getBoolean("is_download_size_zero"), bundle.getBoolean("is_password_protected", false));
                StringBuilder sb = new StringBuilder("gdrive-activity/create-restore-data-from-bundle/ ");
                sb.append(c55702m3);
                Log.i(sb.toString());
                return c55702m3;
            }
            throw null;
        }
        throw new IllegalStateException("account_name cannot be null.");
    }

    public synchronized String toString() {
        return String.format(Locale.ENGLISH, "Account:%s overwriteLocalFile:%b isDownloadSizeZero:%b lastModified:%s totalBackupSize: %d isPasswordProtected: %b", C40061rW.A0B(this.A05), Boolean.valueOf(this.A03), Boolean.valueOf(this.A01), Long.valueOf(this.A04), Long.valueOf(this.A00), Boolean.valueOf(this.A02));
    }
}
