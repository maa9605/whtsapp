package X;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.3ph  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C81933ph extends C73453bf {
    public final /* synthetic */ MessageReplyActivity A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81933ph(MessageReplyActivity messageReplyActivity, ActivityC02330At activityC02330At, C0B5 c0b5, View view, AnonymousClass012 anonymousClass012, C003701t c003701t, C018508q c018508q, InterfaceC002901k interfaceC002901k, C012005w c012005w, AnonymousClass011 anonymousClass011, C42391vf c42391vf, C01B c01b, C018608r c018608r, C41491u0 c41491u0, C05480Ox c05480Ox, C0L6 c0l6, C02E c02e, C002301c c002301c, C05U c05u, C40261rr c40261rr, C0HA c0ha, C000400f c000400f, C42471vn c42471vn, C0L9 c0l9, C42401vg c42401vg, C000500h c000500h, C0G2 c0g2, C2MV c2mv, C41771uU c41771uU, C02O c02o, C008103m c008103m, C03120Eg c03120Eg, boolean z) {
        super(activityC02330At, c0b5, view, anonymousClass012, c003701t, c018508q, interfaceC002901k, c012005w, anonymousClass011, c42391vf, c01b, c018608r, c41491u0, c05480Ox, c0l6, c02e, c002301c, c05u, c40261rr, c0ha, c000400f, c0l9, c42401vg, c000500h, c0g2, c2mv, c41771uU, c02o, c008103m, c03120Eg, true, z);
        this.A00 = messageReplyActivity;
    }

    @Override // X.C73453bf
    public boolean A0Q() {
        MessageReplyActivity messageReplyActivity = this.A00;
        boolean z = !messageReplyActivity.A0Q.A06();
        if (messageReplyActivity.A0Q.A02("android.permission.RECORD_AUDIO") != 0) {
            if (z) {
                Intent putExtra = new Intent(messageReplyActivity, RequestPermissionActivity.class).putExtra("drawable_ids", new int[]{R.drawable.permission_storage, R.drawable.permission_plus, R.drawable.permission_mic}).putExtra("message_id", R.string.permission_storage_mic_on_audio_msg_request);
                int i = Build.VERSION.SDK_INT;
                int i2 = R.string.permission_storage_mic_on_audio_msg_v30;
                if (i < 30) {
                    i2 = R.string.permission_storage_mic_on_audio_msg;
                }
                messageReplyActivity.startActivity(putExtra.putExtra("perm_denial_message_id", i2).putExtra("permissions", new String[]{"android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}));
            } else {
                messageReplyActivity.startActivity(new Intent(messageReplyActivity, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_mic).putExtra("message_id", R.string.permission_mic_access_on_audio_msg_request).putExtra("perm_denial_message_id", R.string.permission_mic_access_on_audio_msg).putExtra("permissions", new String[]{"android.permission.RECORD_AUDIO"}));
            }
        } else if (!z) {
            return true;
        } else {
            int i3 = Build.VERSION.SDK_INT;
            int i4 = R.string.permission_storage_need_write_access_on_record_audio_v30;
            if (i3 < 30) {
                i4 = R.string.permission_storage_need_write_access_on_record_audio;
            }
            RequestPermissionActivity.A05(messageReplyActivity, R.string.permission_storage_need_write_access_on_record_audio_request, i4);
        }
        return false;
    }
}
