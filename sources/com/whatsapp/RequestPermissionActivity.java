package com.whatsapp;

import X.AbstractView$OnClickListenerC49532Ky;
import X.AnonymousClass029;
import X.C000200d;
import X.C000500h;
import X.C018508q;
import X.C02F;
import X.C05350Oj;
import X.C0BA;
import X.C0ME;
import X.C0VJ;
import X.C2F8;
import X.C41321tj;
import X.C41471ty;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class RequestPermissionActivity extends C0ME {
    public static final Map A07;
    public C05350Oj A00;
    public C41321tj A01;
    public C02F A02;
    public C000500h A03;
    public C2F8 A04;
    public boolean A05;
    public boolean A06;

    static {
        HashMap hashMap = new HashMap(4);
        int[] iArr = new int[6];
        iArr[0] = R.string.permission_storage_cam_on_camera_access_request;
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.permission_storage_cam_on_camera_access_v30;
        if (i < 30) {
            i2 = R.string.permission_storage_cam_on_camera_access;
        }
        iArr[1] = i2;
        iArr[2] = R.string.permission_storage_need_write_access_on_camera_access_request;
        int i3 = R.string.permission_storage_need_write_access_on_camera_access_v30;
        if (i < 30) {
            i3 = R.string.permission_storage_need_write_access_on_camera_access;
        }
        iArr[3] = i3;
        iArr[4] = R.string.permission_cam_access_request;
        iArr[5] = R.string.permission_cam_access;
        hashMap.put(30, iArr);
        int[] iArr2 = new int[6];
        iArr2[0] = R.string.permission_storage_cam_on_attaching_photo_request;
        int i4 = R.string.permission_storage_cam_on_attaching_photo_v30;
        if (i < 30) {
            i4 = R.string.permission_storage_cam_on_attaching_photo;
        }
        iArr2[1] = i4;
        iArr2[2] = R.string.permission_storage_need_write_access_on_attaching_photo_request;
        int i5 = R.string.permission_storage_need_write_access_on_attaching_photo_v30;
        if (i < 30) {
            i5 = R.string.permission_storage_need_write_access_on_attaching_photo;
        }
        iArr2[3] = i5;
        iArr2[4] = R.string.permission_cam_access_on_attaching_photo_request;
        iArr2[5] = R.string.permission_cam_access_on_attaching_photo;
        hashMap.put(31, iArr2);
        int[] iArr3 = new int[6];
        iArr3[0] = R.string.permission_storage_cam_on_attaching_video_request;
        int i6 = R.string.permission_storage_cam_on_attaching_video_v30;
        if (i < 30) {
            i6 = R.string.permission_storage_cam_on_attaching_video;
        }
        iArr3[1] = i6;
        iArr3[2] = R.string.permission_storage_need_write_access_on_attaching_video_request;
        int i7 = R.string.permission_storage_need_write_access_on_attaching_video_v30;
        if (i < 30) {
            i7 = R.string.permission_storage_need_write_access_on_attaching_video;
        }
        iArr3[3] = i7;
        iArr3[4] = R.string.permission_cam_access_on_attaching_video_request;
        iArr3[5] = R.string.permission_cam_access_on_attaching_video;
        hashMap.put(32, iArr3);
        int[] iArr4 = new int[6];
        iArr4[0] = R.string.permission_storage_cam_on_post_status_request;
        int i8 = R.string.permission_storage_cam_on_post_status_v30;
        if (i < 30) {
            i8 = R.string.permission_storage_cam_on_post_status;
        }
        iArr4[1] = i8;
        iArr4[2] = R.string.permission_storage_need_write_access_on_post_status_request;
        int i9 = R.string.permission_storage_need_write_access_on_post_status_v30;
        if (i < 30) {
            i9 = R.string.permission_storage_need_write_access_on_post_status;
        }
        iArr4[3] = i9;
        iArr4[4] = R.string.permission_cam_on_post_status_request;
        iArr4[5] = R.string.permission_cam_on_post_status;
        hashMap.put(33, iArr4);
        A07 = Collections.unmodifiableMap(hashMap);
    }

    public static Intent A00(Context context, int i, int i2, boolean z) {
        return new Intent(context, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_contacts_small).putExtra("permissions", new String[]{"android.permission.GET_ACCOUNTS", "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"}).putExtra("message_id", i).putExtra("perm_denial_message_id", i2).putExtra("force_ui", z);
    }

    public static Intent A01(Context context, int i, int i2, boolean z) {
        return new Intent(context, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_storage).putExtra("permissions", new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}).putExtra("message_id", i).putExtra("perm_denial_message_id", i2).putExtra("force_ui", z);
    }

    public static Intent A02(Context context, C02F c02f, int i) {
        boolean z = !c02f.A06();
        boolean z2 = c02f.A02("android.permission.CAMERA") != 0;
        int[] iArr = (int[]) A07.get(Integer.valueOf(i));
        if (iArr == null) {
            C000200d.A0p("conversation/check/camera/storage/permissions/unexpected request code ", i);
            return null;
        } else if (z2) {
            if (z) {
                return new Intent(context, RequestPermissionActivity.class).putExtra("drawable_ids", new int[]{R.drawable.permission_storage, R.drawable.permission_plus, R.drawable.permission_cam}).putExtra("permissions", new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}).putExtra("message_id", iArr[0]).putExtra("perm_denial_message_id", iArr[1]);
            }
            return new Intent(context, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_cam).putExtra("message_id", iArr[4]).putExtra("perm_denial_message_id", iArr[5]).putExtra("permissions", new String[]{"android.permission.CAMERA"});
        } else if (z) {
            return A01(context, iArr[2], iArr[3], false);
        } else {
            return null;
        }
    }

    public static void A03(Activity activity) {
        if (activity.isFinishing()) {
            return;
        }
        activity.startActivityForResult(new Intent(activity, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_call).putExtra("permissions", (String[]) ((AbstractCollection) C02F.A01()).toArray(new String[0])).putExtra("message_id", R.string.permission_read_phone_number_request).putExtra("perm_denial_message_id", R.string.permission_read_phone_number_permission_needed).putExtra("force_ui", true), 155);
    }

    public static void A04(Activity activity, int i, int i2) {
        if (!activity.isFinishing()) {
            activity.startActivityForResult(A00(activity, i, i2, false), 150);
        }
    }

    public static void A05(Activity activity, int i, int i2) {
        A06(activity, i, i2, false, 151);
    }

    public static void A06(Activity activity, int i, int i2, boolean z, int i3) {
        if (activity.isFinishing()) {
            return;
        }
        activity.startActivityForResult(A01(activity, i, i2, z), i3);
    }

    public static void A07(Activity activity, C018508q c018508q, C02F c02f, boolean z) {
        boolean z2 = (Build.VERSION.SDK_INT < 23 && !c02f.A09()) || (Build.VERSION.SDK_INT >= 23 && c02f.A02("android.permission.RECORD_AUDIO") != 0);
        boolean z3 = z && ((Build.VERSION.SDK_INT < 23 && !c02f.A07()) || (Build.VERSION.SDK_INT >= 23 && c02f.A02("android.permission.CAMERA") != 0));
        StringBuilder sb = new StringBuilder("request/permission/checkCameraAndMicPermissionsForVoipCall needMicPerm = ");
        sb.append(z2);
        sb.append(", needCameraPerm = ");
        sb.append(z3);
        Log.i(sb.toString());
        if (Build.VERSION.SDK_INT < 23) {
            if (!z3) {
                if (!z2) {
                    return;
                }
                c018508q.A05(R.string.can_not_start_voip_call_without_record_permission, 1);
            } else if (z2) {
                c018508q.A05(R.string.can_not_start_video_call_without_mic_and_camera_permission, 1);
            } else {
                c018508q.A05(R.string.can_not_start_video_call_without_camera_permission, 1);
            }
        } else if (z3 && z2) {
            activity.startActivityForResult(new Intent(activity, RequestPermissionActivity.class).putExtra("drawable_ids", new int[]{R.drawable.permission_mic, R.drawable.permission_plus, R.drawable.permission_cam}).putExtra("permissions", new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}).putExtra("message_id", R.string.permission_mic_and_cam_on_video_call_request).putExtra("perm_denial_message_id", R.string.permission_mic_and_cam_on_video_call).putExtra("force_ui", true), 152);
        } else if (z2) {
            activity.startActivityForResult(new Intent(activity, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_mic).putExtra("message_id", R.string.permission_mic_access_request).putExtra("perm_denial_message_id", R.string.permission_mic_access).putExtra("permissions", new String[]{"android.permission.RECORD_AUDIO"}).putExtra("force_ui", true), 152);
        } else if (!z3) {
        } else {
            activity.startActivityForResult(new Intent(activity, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_cam).putExtra("message_id", R.string.permission_cam_access_on_video_call_request).putExtra("perm_denial_message_id", R.string.permission_cam_access_on_video_call).putExtra("permissions", new String[]{"android.permission.CAMERA"}).putExtra("force_ui", true), 152);
        }
    }

    public static void A08(Activity activity, C02F c02f) {
        if (!activity.isFinishing() && (!c02f.A05())) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(C02F.A01());
            Intent intent = new Intent(activity, RequestPermissionActivity.class);
            if (Build.VERSION.SDK_INT >= 28) {
                arrayList.add("android.permission.READ_CALL_LOG");
                arrayList.add("android.permission.ANSWER_PHONE_CALLS");
                intent.putExtra("permissions", (String[]) arrayList.toArray(new String[0])).putExtra("message_id", R.string.permission_flash_call_read_call_log_telephone_request).putExtra("perm_denial_message_id", R.string.permission_flash_call_read_call_log_telephone_permission_needed);
            } else {
                arrayList.add("android.permission.CALL_PHONE");
                intent.putExtra("permissions", (String[]) arrayList.toArray(new String[0])).putExtra("message_id", R.string.permission_flash_call_telephone_request).putExtra("perm_denial_message_id", R.string.permission_flash_call_telephone_permission_needed);
            }
            intent.putExtra("title_id", R.string.permission_flash_call_permission_title).putExtra("force_ui", true);
            activity.startActivityForResult(intent, 700);
        }
    }

    public static void A0E(Activity activity, C02F c02f, int i) {
        Intent putExtra;
        if (activity.isFinishing()) {
            return;
        }
        boolean z = !(c02f.A02("android.permission.SEND_SMS") == 0);
        boolean z2 = !c02f.A08();
        if (z && z2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("android.permission.SEND_SMS");
            arrayList.addAll(C02F.A01());
            putExtra = new Intent(activity, RequestPermissionActivity.class).putExtra("drawable_ids", new int[]{R.drawable.permission_sms, R.drawable.permission_plus, R.drawable.permission_call}).putExtra("permissions", (String[]) arrayList.toArray(new String[0])).putExtra("message_id", R.string.permission_send_sms_telephone_request).putExtra("perm_denial_message_id", R.string.permission_send_sms_telephone_permission_needed).putExtra("force_ui", false);
        } else if (z) {
            putExtra = new Intent(activity, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_sms).putExtra("permissions", new String[]{"android.permission.SEND_SMS"}).putExtra("message_id", R.string.permission_send_sms_request).putExtra("perm_denial_message_id", R.string.permission_send_sms_permission_needed).putExtra("force_ui", false);
        } else {
            putExtra = new Intent(activity, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_call).putExtra("permissions", (String[]) ((AbstractCollection) C02F.A01()).toArray(new String[0])).putExtra("message_id", R.string.permission_telephone_request).putExtra("perm_denial_message_id", R.string.permission_telephone_permission_needed).putExtra("force_ui", false);
        }
        activity.startActivityForResult(putExtra, i);
    }

    public static void A0F(C0BA c0ba, int i, int i2) {
        Context A0a = c0ba.A0a();
        if (A0a != null) {
            c0ba.A0O(A00(A0a, i, i2, false), 150, null);
        }
    }

    public static void A0G(C000500h c000500h, String[] strArr) {
        for (String str : strArr) {
            C000200d.A0j(c000500h, str, true);
            if (AnonymousClass029.A1b(C41471ty.A02, str)) {
                C000200d.A0j(c000500h, "live_location_is_new_user", true);
                C000200d.A0j(c000500h, "nearby_location_new_user", true);
            }
        }
    }

    public static boolean A0L(Activity activity, C02F c02f) {
        if (!c02f.A06()) {
            int i = Build.VERSION.SDK_INT;
            int i2 = R.string.permission_storage_need_read_on_viewing_media_v30;
            if (i < 30) {
                i2 = R.string.permission_storage_need_read_on_viewing_media;
            }
            activity.startActivityForResult(A01(activity, R.string.permission_storage_need_read_on_viewing_media_request, i2, false), 34);
            return false;
        }
        return true;
    }

    public static boolean A0M(Activity activity, C02F c02f) {
        if (c02f.A06()) {
            return true;
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.permission_storage_cam_on_share_status_v30;
        if (i < 30) {
            i2 = R.string.permission_storage_cam_on_share_status;
        }
        activity.startActivityForResult(A01(activity, R.string.permission_storage_cam_on_share_status_request, i2, false), 151);
        return false;
    }

    public static boolean A0N(Activity activity, C02F c02f, int i) {
        Intent A02 = A02(activity, c02f, i);
        if (A02 == null) {
            return true;
        }
        activity.startActivityForResult(A02, i);
        return false;
    }

    public static boolean A0O(Activity activity, C02F c02f, int i, int i2, int i3) {
        String[] strArr = C41471ty.A02;
        if (c02f.A04()) {
            return true;
        }
        activity.startActivityForResult(new Intent(activity, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_location).putExtra("permissions", strArr).putExtra("perm_denial_message_id", i2).putExtra("message_id", i), i3);
        return false;
    }

    public static boolean A0P(Activity activity, String[] strArr) {
        for (String str : strArr) {
            if (!C0VJ.A0I(activity, str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0Q(Context context, C02F c02f) {
        if (!c02f.A06()) {
            int i = Build.VERSION.SDK_INT;
            int i2 = R.string.permission_storage_need_read_on_viewing_media_v30;
            if (i < 30) {
                i2 = R.string.permission_storage_need_read_on_viewing_media;
            }
            context.startActivity(A01(context, R.string.permission_storage_need_read_on_viewing_media_request, i2, false));
            return false;
        }
        return true;
    }

    public static boolean A0R(C0BA c0ba, C02F c02f) {
        if (c02f.A06()) {
            return true;
        }
        Context A0a = c0ba.A0a();
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.permission_storage_cam_on_share_status_v30;
        if (i < 30) {
            i2 = R.string.permission_storage_cam_on_share_status;
        }
        c0ba.A0O(A01(A0a, R.string.permission_storage_cam_on_share_status_request, i2, false), 151, null);
        return false;
    }

    public static boolean A0S(C000500h c000500h, String[] strArr) {
        for (String str : strArr) {
            if (c000500h.A00.getBoolean(str, false)) {
                return false;
            }
        }
        return true;
    }

    public final String A0p(Bundle bundle, boolean z) {
        int i;
        int[] intArray;
        if (z) {
            i = bundle.getInt("perm_denial_message_id");
        } else {
            i = bundle.getInt("message_id");
        }
        if (i == 0) {
            return null;
        }
        if (z) {
            intArray = bundle.getIntArray("perm_denial_message_params_id");
        } else {
            intArray = bundle.getIntArray("message_params_id");
        }
        if (intArray != null) {
            int length = intArray.length;
            String[] strArr = new String[length];
            for (int i2 = 0; i2 < length; i2++) {
                strArr[i2] = getString(intArray[i2]);
            }
            return getString(i, strArr);
        }
        return getString(i);
    }

    public void A0q(int i) {
        setResult(i);
    }

    public void A0r(Bundle bundle, String str) {
        if (str != null) {
            View findViewById = findViewById(R.id.permission_message);
            if (findViewById != null) {
                ((TextView) findViewById).setText(str);
                return;
            }
            throw null;
        }
        StringBuilder A0P = C000200d.A0P("request/permission/activity/there is no message id for ");
        A0P.append(Arrays.toString(bundle.getStringArray("permissions")));
        Log.e(A0P.toString());
        finish();
    }

    public void A0s(String[] strArr) {
        this.A06 = true;
        A0G(this.A03, strArr);
        C0VJ.A0H(this, strArr, 0);
        View findViewById = findViewById(R.id.permission_request_dialog);
        if (findViewById != null) {
            findViewById.setVisibility(8);
            return;
        }
        throw null;
    }

    public void A0t(final String[] strArr, boolean z) {
        View findViewById = findViewById(R.id.submit);
        if (findViewById == null) {
            throw null;
        }
        TextView textView = (TextView) findViewById;
        if (!z) {
            textView.setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.1j8
                {
                    RequestPermissionActivity.this = this;
                }

                @Override // X.AbstractView$OnClickListenerC49532Ky
                public void A00(View view) {
                    RequestPermissionActivity.this.A0s(strArr);
                }
            });
            return;
        }
        textView.setText(R.string.permission_settings_open);
        textView.setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.1j7
            {
                RequestPermissionActivity.this = this;
            }

            @Override // X.AbstractView$OnClickListenerC49532Ky
            public void A00(View view) {
                C0LD.A05(RequestPermissionActivity.this, "com.whatsapp");
            }
        });
    }

    public boolean A0u(String[] strArr) {
        for (String str : strArr) {
            if (this.A02.A02(str) != 0) {
                return false;
            }
            C000200d.A0f(this.A03, str);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x00ba, code lost:
        if (r7 != false) goto L49;
     */
    @Override // X.C0ME, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RequestPermissionActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC02330At, android.app.Activity, X.C0B2
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 0) {
            return;
        }
        A0q(-1);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (iArr[i2] == 0) {
                C000200d.A0f(this.A03, strArr[i2]);
                if ("android.permission.WRITE_CONTACTS".equals(strArr[i2])) {
                    this.A00.A01(getApplicationContext());
                    this.A01.A04();
                }
            } else {
                StringBuilder A0P = C000200d.A0P("request/permission/activity/");
                A0P.append(strArr[i2]);
                A0P.append(" denied");
                Log.i(A0P.toString());
                A0q(0);
            }
        }
        finish();
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String[] stringArray = extras.getStringArray("permissions");
            if ((stringArray == null || A0u(stringArray)) && !this.A05) {
                Log.i("request/permission/activity/permissions has been granted while we were paused");
                A0q(-1);
                finish();
                return;
            }
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("permissions_requested", this.A06);
    }
}
