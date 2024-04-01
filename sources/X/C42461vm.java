package X;

import android.os.Build;
import android.os.Environment;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;

/* renamed from: X.1vm  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42461vm {
    public static volatile C42461vm A05;
    public final C018508q A00;
    public final C01B A01;
    public final C000400f A02;
    public final C02F A03;
    public final C002301c A04;

    public C42461vm(C018508q c018508q, C01B c01b, C002301c c002301c, C000400f c000400f, C02F c02f) {
        this.A00 = c018508q;
        this.A01 = c01b;
        this.A04 = c002301c;
        this.A02 = c000400f;
        this.A03 = c02f;
    }

    public static C42461vm A00() {
        if (A05 == null) {
            synchronized (C42461vm.class) {
                if (A05 == null) {
                    A05 = new C42461vm(C018508q.A00(), C01B.A00(), C002301c.A00(), C000400f.A00(), C02F.A00());
                }
            }
        }
        return A05;
    }

    public int A01() {
        return C000400f.A01() ? R.string.gallery_media_not_exist : R.string.gallery_media_not_exist_shared_storage;
    }

    public void A02() {
        int A07 = this.A01.A07(C01C.A3w);
        this.A00.A0E(this.A04.A0A(R.plurals.video_status_truncation_info, A07, Integer.valueOf(A07)), 1);
    }

    public void A03(ActivityC02290Ap activityC02290Ap) {
        String externalStorageState = Environment.getExternalStorageState();
        if (!"mounted".equals(externalStorageState) && !"mounted_ro".equals(externalStorageState)) {
            boolean A01 = C000400f.A01();
            int i = R.string.need_sd_card_shared_storage;
            if (A01) {
                i = R.string.need_sd_card;
            }
            activityC02290Ap.AUj(i);
        }
        if (Build.VERSION.SDK_INT >= 23 && this.A03.A02("android.permission.READ_EXTERNAL_STORAGE") == -1) {
            int i2 = Build.VERSION.SDK_INT;
            int i3 = R.string.permission_storage_need_write_access_v30;
            if (i2 < 30) {
                i3 = R.string.permission_storage_need_write_access;
            }
            RequestPermissionActivity.A05(activityC02290Ap, R.string.permission_storage_need_write_access_request, i3);
            return;
        }
        activityC02290Ap.AUj(A01());
    }
}
