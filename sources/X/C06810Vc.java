package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Vc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C06810Vc {
    public static volatile C06810Vc A02;
    public final C018508q A00;
    public final C2MG A01;

    public C06810Vc(C018508q c018508q, C2MG c2mg) {
        this.A00 = c018508q;
        this.A01 = c2mg;
    }

    public static C06810Vc A00() {
        if (A02 == null) {
            synchronized (C06810Vc.class) {
                if (A02 == null) {
                    A02 = new C06810Vc(C018508q.A00(), C2MG.A00());
                }
            }
        }
        return A02;
    }

    public boolean A01(Intent intent, Context context, C0B5 c0b5, String str, boolean z) {
        if (z) {
            ArrayList arrayList = new ArrayList();
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            if (queryIntentActivities != null) {
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    String str2 = activityInfo.name;
                    String str3 = activityInfo.applicationInfo.packageName;
                    Intent intent2 = new Intent(intent);
                    intent2.setClassName(str3, str2);
                    intent2.setPackage(str3);
                    if (str3.contains("gm") || str3.contains("email") || str3.contains("fsck.k9") || str3.contains("maildroid") || str3.contains("hotmail") || str3.contains("android.mail") || str3.contains("com.baydin.boomerang") || str3.contains("yandex.mail") || str3.contains("com.google.android.apps.inbox") || str3.contains("com.microsoft.office.outlook") || str3.contains("com.asus.email") || str3.equals("org.kman.AquaMail")) {
                        arrayList.add(intent2);
                    }
                }
            }
            int size = arrayList.size();
            if (size == 0) {
                if (c0b5 != null) {
                    c0b5.AUj(R.string.error_no_email_client);
                    return false;
                }
                this.A00.A07(R.string.error_no_email_client, 0);
                return false;
            } else if (size == 1) {
                context.startActivity((Intent) arrayList.get(0));
                return true;
            } else {
                int i = size - 1;
                Object obj = arrayList.get(i);
                arrayList.remove(i);
                arrayList.add(0, obj);
                context.startActivity(C02180Ae.A0H(arrayList, str, null));
                return true;
            }
        }
        try {
            context.startActivity(Intent.createChooser(intent, str));
            return true;
        } catch (ActivityNotFoundException e) {
            Log.e("email-sender/start-activity ", e);
            this.A00.A07(R.string.error_no_email_client, 0);
            return false;
        }
    }
}
