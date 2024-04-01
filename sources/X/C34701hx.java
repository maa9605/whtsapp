package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import com.google.android.search.verification.client.R;
import com.whatsapp.SystemStatusActivity;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.1hx */
/* loaded from: classes.dex */
public class C34701hx extends C0HS {
    public WeakReference A00;
    public HashMap A01;
    public final Bundle A02;
    public final C0E7 A03;
    public final C02E A04;
    public final C02F A05;
    public final C018808t A06;
    public final C2DT A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public C34701hx(ActivityC02290Ap activityC02290Ap, C02E c02e, C018808t c018808t, C0E7 c0e7, C02F c02f, C2DT c2dt, boolean z, boolean z2, boolean z3, String str, Bundle bundle) {
        this.A00 = new WeakReference(activityC02290Ap);
        this.A04 = c02e;
        this.A06 = c018808t;
        this.A07 = c2dt;
        this.A03 = c0e7;
        this.A05 = c02f;
        this.A0A = z;
        this.A09 = z2;
        this.A0B = z3;
        this.A08 = str;
        this.A02 = bundle;
    }

    @Override // X.C0HS
    public void A06() {
        Activity activity = (Activity) this.A00.get();
        if (activity != null) {
            C002701i.A19(activity, 122);
        }
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        Context context = (Context) this.A00.get();
        if (context != null) {
            try {
                this.A01 = this.A07.A03();
                if (!this.A0A) {
                    try {
                        int i = Settings.System.getInt(context.getContentResolver(), "wifi_sleep_policy");
                        String str = i != 0 ? i != 1 ? i != 2 ? "unknown" : "never" : "never-while-plugged" : "default";
                        StringBuilder sb = new StringBuilder();
                        sb.append("about/wifisleep/");
                        sb.append(str);
                        Log.i(sb.toString());
                    } catch (Settings.SettingNotFoundException e) {
                        Log.i("about/wifisleep/not-found", e);
                    } catch (Exception e2) {
                        Log.i("about/wifisleep/error ", e2);
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("about/contacts/count ");
                    sb2.append(C23X.A0B(this.A04, this.A05));
                    Log.i(sb2.toString());
                }
            } catch (IOException e3) {
                Log.w("checksystemstatus/ioerror ", e3);
                this.A01 = null;
                return -1;
            } catch (Exception e4) {
                Log.w("checksystemstatus/error ", e4);
                this.A01 = null;
                return -1;
            }
        }
        return 0;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        Integer num;
        ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) this.A00.get();
        if (activityC02290Ap != null && !activityC02290Ap.AFE()) {
            C002701i.A18(activityC02290Ap, 122);
            if (!this.A03.A05()) {
                Log.i("checksystemstatus/no-connectivity");
                activityC02290Ap.AUm(activityC02290Ap.getString(R.string.register_check_connectivity, activityC02290Ap.getString(R.string.connectivity_self_help_instructions)));
                return;
            }
            HashMap hashMap = this.A01;
            if (hashMap != null && hashMap.size() != 0) {
                ArrayList<String> arrayList = new ArrayList<>();
                boolean z = true;
                boolean z2 = true;
                for (Object obj2 : hashMap.keySet()) {
                    if ("version".equals(obj2)) {
                        Object obj3 = this.A01.get(obj2);
                        if (obj3 == null) {
                            throw null;
                        }
                        z2 = ((Boolean) obj3).booleanValue();
                    } else if ("email".equals(obj2)) {
                        Object obj4 = this.A01.get(obj2);
                        if (obj4 == null) {
                            throw null;
                        }
                        z = ((Boolean) obj4).booleanValue();
                    } else {
                        Object obj5 = this.A01.get(obj2);
                        if (obj5 == null) {
                            throw null;
                        }
                        if (!((Boolean) obj5).booleanValue()) {
                            arrayList.add(obj2);
                        }
                    }
                }
                if (arrayList.size() == 0 && z2 && !this.A0A) {
                    num = this.A09 ? 1 : null;
                    C018808t c018808t = this.A06;
                    Intent A09 = C002701i.A09(activityC02290Ap, c018808t, this.A08, null, num, null, null, this.A02);
                    if (c018808t.A01()) {
                        activityC02290Ap.A15(A09, 17);
                        return;
                    } else {
                        activityC02290Ap.A16(A09, this.A0B);
                        return;
                    }
                }
                String str = this.A08;
                num = this.A09 ? 1 : null;
                boolean z3 = this.A0A;
                Bundle bundle = this.A02;
                Intent intent = new Intent(activityC02290Ap, SystemStatusActivity.class);
                intent.putExtra("com.whatsapp.SystemStatusActivity.from", str);
                intent.putExtra("com.whatsapp.SystemStatusActivity.email", z);
                intent.putExtra("com.whatsapp.SystemStatusActivity.version", z2);
                intent.putStringArrayListExtra("com.whatsapp.SystemStatusActivity.serverfeaturesunavailable", arrayList);
                intent.putExtra("com.whatsapp.SystemStatusActivity.statusonly", z3);
                if (num != null) {
                    intent.putExtra("com.whatsapp.SystemStatusActivity.type", num);
                }
                if (bundle != null) {
                    intent.putExtra("com.whatsapp.SystemStatusActivity.describeProblemBundle", bundle);
                }
                activityC02290Ap.A14(intent);
                return;
            }
            Log.i("checksystemstatus/no-server-status");
            if (this.A0A) {
                C002701i.A19(activityC02290Ap, 123);
                return;
            }
            StringBuilder sb = new StringBuilder();
            boolean z4 = this.A09;
            String A0L = C000200d.A0L(sb, z4 ? "chat" : "reg", "-unknown");
            num = z4 ? 1 : null;
            C018808t c018808t2 = this.A06;
            Intent A092 = C002701i.A09(activityC02290Ap, c018808t2, this.A08, A0L, num, null, null, this.A02);
            if (c018808t2.A01()) {
                activityC02290Ap.A15(A092, 17);
            } else {
                activityC02290Ap.A16(A092, this.A0B);
            }
        }
    }
}
