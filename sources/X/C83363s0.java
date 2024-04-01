package X;

import android.content.ClipData;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.settings.SettingsPrivacy;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3s0  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C83363s0 extends C0HS {
    public long A00;
    public long A01;
    public String A02;
    public String A03;
    public String A04;
    public final C04940Mo A05;
    public final InterfaceC05880Qp A06 = new InterfaceC05880Qp() { // from class: X.3rz
        @Override // X.InterfaceC05880Qp
        public void ANZ(String str) {
            throw new IllegalStateException("must not be called");
        }

        @Override // X.InterfaceC05880Qp
        public void ANa() {
            throw new IllegalStateException("must not be called");
        }

        @Override // X.InterfaceC05880Qp
        public void AQ0(String str) {
            C83363s0 c83363s0 = C83363s0.this;
            c83363s0.A00 = -2L;
            C000200d.A1N(C000200d.A0P("contactsupporttask/externalstorage/avail external storage not calculated, state="), c83363s0.A02);
        }

        @Override // X.InterfaceC05880Qp
        public void AQ1() {
            C83363s0.this.A00 = -2L;
            Log.i("contactsupporttask/externalstorage/avail external storage not calculated, permission denied");
        }
    };
    public final C000400f A07;
    public final C83343ry A08;
    public final List A09;
    public final boolean A0A;

    public C83363s0(C04940Mo c04940Mo, C000400f c000400f, C83343ry c83343ry, String str, String str2, List list, boolean z) {
        this.A05 = c04940Mo;
        this.A07 = c000400f;
        this.A08 = c83343ry;
        this.A03 = str;
        this.A04 = str2;
        this.A09 = list;
        this.A0A = z;
    }

    @Override // X.C0HS
    public void A06() {
        C83343ry c83343ry = this.A08;
        if (c83343ry != null) {
            ActivityC02290Ap activityC02290Ap = c83343ry.A00;
            if (!activityC02290Ap.isFinishing()) {
                activityC02290Ap.A12(R.string.register_preparing);
            }
        }
        AnonymousClass289 anonymousClass289 = (AnonymousClass289) this.A05.A00;
        if (anonymousClass289 != null) {
            StringBuilder A0P = C000200d.A0P("contactsupporttask/priv/last=");
            A0P.append(SettingsPrivacy.A01(anonymousClass289.A0H.A00.getInt("privacy_last_seen", 0)));
            Log.i(A0P.toString());
            StringBuilder sb = new StringBuilder("contactsupporttask/priv/pic=");
            C000500h c000500h = anonymousClass289.A0H;
            SharedPreferences sharedPreferences = c000500h.A00;
            sb.append(SettingsPrivacy.A01(sharedPreferences.getInt("privacy_profile_photo", 0)));
            Log.i(sb.toString());
            StringBuilder sb2 = new StringBuilder("contactsupporttask/priv/status=");
            sb2.append(SettingsPrivacy.A01(sharedPreferences.getInt("privacy_status", 0)));
            Log.i(sb2.toString());
            StringBuilder sb3 = new StringBuilder("contactsupporttask/priv/readreceipts=");
            sb3.append(c000500h.A0m());
            Log.i(sb3.toString());
            C0CB c0cb = anonymousClass289.A0R;
            if (c0cb != null) {
                try {
                    C0CD A01 = c0cb.A09().A01();
                    Cursor A09 = A01.A02.A09("settings", C03440Fs.A00, null, null, null, "log/QUERY_CHAT_SETTINGS");
                    if (A09 != null) {
                        while (A09.moveToNext()) {
                            try {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("contactsupporttask");
                                sb4.append("/settings/");
                                sb4.append(A09.getString(0));
                                sb4.append(" muteEndTime:");
                                sb4.append(A09.getLong(1));
                                sb4.append(" showNotificationsWhenMuted:");
                                sb4.append(A09.getInt(2));
                                sb4.append(" useCustomNotifications:");
                                sb4.append(A09.getInt(3));
                                sb4.append(" messageTone:");
                                sb4.append(A09.getString(4));
                                sb4.append(" messageVibrate:");
                                sb4.append(A09.getString(5));
                                sb4.append(" messagePopup:");
                                sb4.append(A09.getString(6));
                                sb4.append(" messageLight:");
                                sb4.append(A09.getString(7));
                                sb4.append(" callTone:");
                                sb4.append(A09.getString(8));
                                sb4.append(" callVibrate:");
                                sb4.append(A09.getString(9));
                                sb4.append(" statusMuted:");
                                sb4.append(A09.getString(10));
                                sb4.append(" pinned:");
                                sb4.append(A09.getString(11));
                                sb4.append(" pinned_time:");
                                sb4.append(A09.getLong(12));
                                sb4.append(" lowPriorityNotifications:");
                                sb4.append(A09.getInt(13));
                                sb4.append(" mediaVisibility:");
                                sb4.append(A09.getInt(14));
                                Log.i(sb4.toString());
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    try {
                                        A09.close();
                                    } catch (Throwable unused) {
                                    }
                                    throw th2;
                                }
                            }
                        }
                        A09.close();
                    }
                    A01.close();
                } catch (Exception e) {
                    Log.e("contactsupporttask/settings/exception", e);
                }
                if (C03480Fw.A00) {
                    for (Object obj : C03500Fy.A01(c0cb.A01.A05())) {
                        StringBuilder A0V = C000200d.A0V("contactsupporttask", "/setting/channel:");
                        A0V.append(obj.toString());
                        Log.i(A0V.toString());
                    }
                    return;
                }
                return;
            }
            throw null;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b6  */
    @Override // X.C0HS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A07(java.lang.Object[] r28) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83363s0.A07(java.lang.Object[]):java.lang.Object");
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        boolean z;
        String str;
        C72093Yq c72093Yq = (C72093Yq) obj;
        C83343ry c83343ry = this.A08;
        if (c83343ry != null && c72093Yq != null) {
            File file = c72093Yq.A00;
            String str2 = c72093Yq.A01;
            ActivityC02290Ap activityC02290Ap = c83343ry.A00;
            C49082Ij c49082Ij = c83343ry.A01;
            C06810Vc c06810Vc = c49082Ij.A02;
            String str3 = c83343ry.A02;
            ArrayList<? extends Parcelable> arrayList = c83343ry.A04;
            String str4 = c83343ry.A03;
            if (c06810Vc != null) {
                String string = activityC02290Ap.getString(R.string.email_subject);
                StringBuilder sb = new StringBuilder();
                if (str3 != null) {
                    sb.append(str3);
                }
                if (!TextUtils.isEmpty(str2)) {
                    sb.append(str2);
                } else {
                    sb.append("\n");
                }
                StringBuilder sb2 = new StringBuilder(sb.toString());
                if (arrayList != null && !arrayList.isEmpty()) {
                    z = true;
                    str = "android.intent.action.SEND_MULTIPLE";
                } else {
                    z = false;
                    str = "android.intent.action.SEND";
                }
                Intent intent = new Intent(str);
                if (file == null) {
                    intent.setType("plain/text");
                    sb2.append("No log file to attach.\n");
                } else {
                    intent.setType(z ? "*/*" : "application/zip");
                    intent.setFlags(1);
                    Uri A04 = AnonymousClass024.A04(activityC02290Ap, file);
                    if (z) {
                        arrayList.add(A04);
                    } else {
                        intent.putExtra("android.intent.extra.STREAM", A04);
                    }
                }
                String[] strArr = new String[1];
                if (str4 == null) {
                    str4 = "android@support.whatsapp.com";
                }
                strArr[0] = str4;
                intent.putExtra("android.intent.extra.EMAIL", strArr);
                intent.putExtra("android.intent.extra.SUBJECT", string);
                intent.putExtra("android.intent.extra.TEXT", sb2.toString());
                if (z) {
                    intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    ClipData clipData = new ClipData(string, new String[]{"application/zip", "image/*"}, new ClipData.Item((Uri) arrayList2.get(0)));
                    arrayList2.remove(0);
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        clipData.addItem(new ClipData.Item((Uri) it.next()));
                    }
                    intent.setClipData(clipData);
                    intent.setFlags(1);
                }
                boolean A01 = c06810Vc.A01(intent, activityC02290Ap, activityC02290Ap, activityC02290Ap.getString(R.string.contact_support_via), true);
                activityC02290Ap.ARS();
                if (activityC02290Ap instanceof C28D) {
                    ((C28D) activityC02290Ap).ANt(A01);
                }
                c49082Ij.A00 = null;
                return;
            }
            throw null;
        }
    }
}
