package X;

import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.File;

/* renamed from: X.0Ic  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04020Ic {
    public C37221m4 A00;
    public final int A01;
    public final File A02;
    public final String A03;
    public final boolean A04;

    public static String A00(int i) {
        switch (i) {
            case 0:
                return "success";
            case 1:
                return "failed_generic";
            case 2:
                return "dns_failure";
            case 3:
                return "timeout";
            case 4:
                return "disk_full";
            case 5:
                return "too_old";
            case 6:
                return "resume_failed";
            case 7:
                return "hash_mismatch";
            case 8:
                return "invalid_url";
            case 9:
                return "output_stream_fail";
            case 10:
            default:
                return "invalid";
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                return "no_route";
            case 12:
                return "throttle";
            case 13:
                return "user_cancel";
            case 14:
                return "prefetch_end";
            case 15:
                return "watls_error";
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                return "server_error";
            case 17:
                return "wamsys_failed";
            case 18:
                return "failed_network";
            case 19:
                return "failed_connect";
        }
    }

    public static boolean A01(int i) {
        return i == 1 || i == 2 || i == 3 || i == 11 || i == 15 || i == 16 || i == 18 || i == 19;
    }

    public C04020Ic(int i) {
        this.A01 = i;
        this.A03 = null;
        this.A04 = false;
        this.A02 = null;
    }

    public C04020Ic(int i, String str, boolean z) {
        this.A01 = i;
        this.A03 = str;
        this.A04 = z;
        this.A02 = null;
    }

    public C04020Ic(int i, String str, boolean z, File file) {
        this.A01 = i;
        this.A03 = str;
        this.A04 = z;
        this.A02 = file;
    }

    public boolean A02() {
        return this.A01 == 0;
    }

    public String toString() {
        return A00(this.A01);
    }
}
