package X;

import android.app.Activity;
import android.os.Build;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;

/* renamed from: X.2EV  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2EV implements InterfaceC05880Qp {
    public final Activity A00;
    public final C000400f A01;

    public C2EV(C000400f c000400f, Activity activity) {
        this.A00 = activity;
        this.A01 = c000400f;
    }

    @Override // X.InterfaceC05880Qp
    public void ANZ(String str) {
        Activity activity = this.A00;
        if (activity.isFinishing()) {
            return;
        }
        C0B5 c0b5 = (C0B5) activity;
        if (c0b5 != null) {
            boolean A01 = C000400f.A01();
            int i = R.string.conversation_cannot_download_media_read_only_media_card_shared_storage;
            if (A01) {
                i = R.string.conversation_cannot_download_media_read_only_media_card;
            }
            c0b5.AUl(R.string.download_failed, i, new Object[0]);
            return;
        }
        throw null;
    }

    @Override // X.InterfaceC05880Qp
    public void ANa() {
        Activity activity = this.A00;
        if (activity != null) {
            int i = Build.VERSION.SDK_INT;
            int i2 = R.string.permission_storage_need_write_access_on_msg_download_v30;
            if (i < 30) {
                i2 = R.string.permission_storage_need_write_access_on_msg_download;
            }
            RequestPermissionActivity.A05(activity, R.string.permission_storage_need_write_access_on_msg_download_request, i2);
            return;
        }
        throw null;
    }

    @Override // X.InterfaceC05880Qp
    public void AQ0(String str) {
        Activity activity = this.A00;
        if (activity.isFinishing()) {
            return;
        }
        C0B5 c0b5 = (C0B5) activity;
        if (c0b5 != null) {
            boolean A01 = C000400f.A01();
            int i = R.string.conversation_cannot_download_media_no_media_card_shared_storage;
            if (A01) {
                i = R.string.conversation_cannot_download_media_no_media_card;
            }
            c0b5.AUl(R.string.download_failed, i, new Object[0]);
            return;
        }
        throw null;
    }

    @Override // X.InterfaceC05880Qp
    public void AQ1() {
        Activity activity = this.A00;
        if (activity != null) {
            int i = Build.VERSION.SDK_INT;
            int i2 = R.string.permission_storage_need_write_access_on_msg_download_v30;
            if (i < 30) {
                i2 = R.string.permission_storage_need_write_access_on_msg_download;
            }
            RequestPermissionActivity.A05(activity, R.string.permission_storage_need_write_access_on_msg_download_request, i2);
            return;
        }
        throw null;
    }
}
