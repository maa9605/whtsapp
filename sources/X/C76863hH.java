package X;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.notification.RequestPermissionsDialogFragment;

/* renamed from: X.3hH  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C76863hH extends C73453bf {
    public final /* synthetic */ PopupNotification A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76863hH(PopupNotification popupNotification, ActivityC02330At activityC02330At, C0B5 c0b5, View view, AnonymousClass012 anonymousClass012, C003701t c003701t, C018508q c018508q, InterfaceC002901k interfaceC002901k, C012005w c012005w, AnonymousClass011 anonymousClass011, C42391vf c42391vf, C01B c01b, C018608r c018608r, C41491u0 c41491u0, C05480Ox c05480Ox, C0L6 c0l6, C02E c02e, C002301c c002301c, C05U c05u, C40261rr c40261rr, C0HA c0ha, C000400f c000400f, C42471vn c42471vn, C0L9 c0l9, C42401vg c42401vg, C000500h c000500h, C0G2 c0g2, C2MV c2mv, C41771uU c41771uU, C02O c02o, C008103m c008103m, C03120Eg c03120Eg, boolean z) {
        super(activityC02330At, c0b5, view, anonymousClass012, c003701t, c018508q, interfaceC002901k, c012005w, anonymousClass011, c42391vf, c01b, c018608r, c41491u0, c05480Ox, c0l6, c02e, c002301c, c05u, c40261rr, c0ha, c000400f, c0l9, c42401vg, c000500h, c0g2, c2mv, c41771uU, c02o, c008103m, c03120Eg, false, z);
        this.A00 = popupNotification;
    }

    @Override // X.C73453bf
    public void A06() {
        PopupNotification popupNotification = this.A00;
        popupNotification.A1I.A02(true);
        popupNotification.A0h.A05();
        super.A06();
    }

    @Override // X.C73453bf
    public boolean A0Q() {
        PopupNotification popupNotification = this.A00;
        boolean z = !popupNotification.A0n.A06();
        boolean z2 = true;
        if (popupNotification.A0n.A02("android.permission.RECORD_AUDIO") == 0) {
            z2 = false;
            if (!z) {
                return true;
            }
        }
        RequestPermissionsDialogFragment requestPermissionsDialogFragment = new RequestPermissionsDialogFragment();
        Bundle bundle = new Bundle();
        if (!z2) {
            if (z) {
                bundle.putIntArray("drawables", new int[]{R.drawable.permission_storage});
                bundle.putStringArray("permissions", new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"});
                bundle.putInt("msg_id", R.string.permission_storage_need_write_access_on_record_audio_request);
                int i = Build.VERSION.SDK_INT;
                int i2 = R.string.permission_storage_need_write_access_on_record_audio_v30;
                if (i < 30) {
                    i2 = R.string.permission_storage_need_write_access_on_record_audio;
                }
                bundle.putInt("perm_denial_msg_id", i2);
                bundle.putInt("locked_msg_id", R.string.permission_storage_need_write_access_on_record_audio_locked_screen_request);
                int i3 = R.string.permission_storage_need_write_access_on_record_audio_locked_screen_v30;
                if (i < 30) {
                    i3 = R.string.permission_storage_need_write_access_on_record_audio_locked_screen;
                }
                bundle.putInt("locked_perm_denial_msg_id", i3);
            }
            bundle.putIntArray("drawables", new int[]{R.drawable.permission_mic});
            bundle.putStringArray("permissions", new String[]{"android.permission.RECORD_AUDIO"});
            bundle.putInt("msg_id", R.string.permission_mic_access_on_audio_msg_request);
            bundle.putInt("perm_denial_msg_id", R.string.permission_mic_access_on_audio_msg);
            bundle.putInt("locked_msg_id", R.string.permission_unable_to_start_ptt_in_popup);
            bundle.putInt("locked_perm_denial_msg_id", R.string.permission_unable_to_start_ptt_in_popup_screen_locked);
        } else {
            if (z) {
                bundle.putIntArray("drawables", new int[]{R.drawable.permission_mic, R.drawable.permission_plus, R.drawable.permission_storage});
                bundle.putStringArray("permissions", new String[]{"android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"});
                bundle.putInt("msg_id", R.string.permission_storage_mic_on_audio_msg_request);
                int i4 = Build.VERSION.SDK_INT;
                int i5 = R.string.permission_storage_mic_on_audio_msg_v30;
                if (i4 < 30) {
                    i5 = R.string.permission_storage_mic_on_audio_msg;
                }
                bundle.putInt("perm_denial_msg_id", i5);
                bundle.putInt("locked_msg_id", R.string.permission_storage_mic_on_audio_msg_locked_screen_request);
                int i6 = R.string.permission_storage_mic_on_audio_msg_locked_screen_v30;
                if (i4 < 30) {
                    i6 = R.string.permission_storage_mic_on_audio_msg_locked_screen;
                }
                bundle.putInt("locked_perm_denial_msg_id", i6);
            }
            bundle.putIntArray("drawables", new int[]{R.drawable.permission_mic});
            bundle.putStringArray("permissions", new String[]{"android.permission.RECORD_AUDIO"});
            bundle.putInt("msg_id", R.string.permission_mic_access_on_audio_msg_request);
            bundle.putInt("perm_denial_msg_id", R.string.permission_mic_access_on_audio_msg);
            bundle.putInt("locked_msg_id", R.string.permission_unable_to_start_ptt_in_popup);
            bundle.putInt("locked_perm_denial_msg_id", R.string.permission_unable_to_start_ptt_in_popup_screen_locked);
        }
        requestPermissionsDialogFragment.A0P(bundle);
        requestPermissionsDialogFragment.A14(popupNotification.A0N(), "permission_fragment");
        return false;
    }
}
