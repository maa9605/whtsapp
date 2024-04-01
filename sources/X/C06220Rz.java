package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientUtil;

/* renamed from: X.0Rz */
/* loaded from: classes.dex */
public class C06220Rz {
    public static final C06220Rz A00 = new C06220Rz();

    public int A00(Context context) {
        int A002 = C0CL.A00(context, 12451000);
        if (C0CL.A04(context, A002)) {
            return 18;
        }
        return A002;
    }

    public Intent A01(Context context, int i, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        } else if (context != null && AnonymousClass088.A1w(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage(SearchActionVerificationClientUtil.ANDROID_WEAR_PACKAGE);
            return intent2;
        } else {
            StringBuilder A0P = C000200d.A0P("gcore_");
            A0P.append(12451000);
            A0P.append("-");
            if (!TextUtils.isEmpty(str)) {
                A0P.append(str);
            }
            A0P.append("-");
            if (context != null) {
                A0P.append(context.getPackageName());
            }
            A0P.append("-");
            if (context != null) {
                try {
                    C06090Rm A002 = C06080Rl.A00(context);
                    A0P.append(A002.A00.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            String obj = A0P.toString();
            Intent intent3 = new Intent("android.intent.action.VIEW");
            Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
            if (!TextUtils.isEmpty(obj)) {
                appendQueryParameter.appendQueryParameter("pcampaignid", obj);
            }
            intent3.setData(appendQueryParameter.build());
            intent3.setPackage("com.android.vending");
            intent3.addFlags(524288);
            return intent3;
        }
    }

    public PendingIntent A03(Context context, int i, int i2) {
        Intent A01 = A01(context, i, null);
        if (A01 != null) {
            return PendingIntent.getActivity(context, i2, A01, 134217728);
        }
        return null;
    }
}
