package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.search.verification.client.R;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.voipcalling.GlVideoRenderer;

/* renamed from: X.14x  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C230214x {
    public static final C006802z A00 = new C006802z();

    public static String A00(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = C06080Rl.A00(context).A00;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String A01(Context context, int i) {
        Resources resources = context.getResources();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return resources.getString(17039370);
                }
                return resources.getString(R.string.common_google_play_services_enable_button);
            }
            return resources.getString(R.string.common_google_play_services_update_button);
        }
        return resources.getString(R.string.common_google_play_services_install_button);
    }

    public static String A02(Context context, int i) {
        Resources resources = context.getResources();
        String A002 = A00(context);
        if (i != 1) {
            if (i == 2) {
                if (AnonymousClass088.A1w(context)) {
                    return resources.getString(R.string.common_google_play_services_wear_update_text);
                }
                return resources.getString(R.string.common_google_play_services_update_text, A002);
            } else if (i != 3) {
                if (i != 5) {
                    if (i != 7) {
                        if (i != 9) {
                            if (i != 20) {
                                switch (i) {
                                    case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                                        return A05(context, "common_google_play_services_api_unavailable_text", A002);
                                    case 17:
                                        return A05(context, "common_google_play_services_sign_in_failed_text", A002);
                                    case 18:
                                        return resources.getString(R.string.common_google_play_services_updating_text, A002);
                                    default:
                                        return resources.getString(R.string.common_google_play_services_unknown_issue, A002);
                                }
                            }
                            return A05(context, "common_google_play_services_restricted_profile_text", A002);
                        }
                        return resources.getString(R.string.common_google_play_services_unsupported_text, A002);
                    }
                    return A05(context, "common_google_play_services_network_error_text", A002);
                }
                return A05(context, "common_google_play_services_invalid_account_text", A002);
            } else {
                return resources.getString(R.string.common_google_play_services_enable_text, A002);
            }
        }
        return resources.getString(R.string.common_google_play_services_install_text, A002);
    }

    public static String A03(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return A04(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return A04(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return A04(context, "common_google_play_services_sign_in_failed_title");
            case C0M6.A01 /* 20 */:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return A04(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String A04(Context context, String str) {
        Resources resources;
        C006802z c006802z = A00;
        synchronized (c006802z) {
            String str2 = (String) c006802z.getOrDefault(str, null);
            if (str2 != null) {
                return str2;
            }
            try {
                resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            } catch (PackageManager.NameNotFoundException unused) {
                resources = null;
            }
            if (resources == null) {
                return null;
            }
            int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String valueOf = String.valueOf(str);
                Log.w("GoogleApiAvailability", valueOf.length() != 0 ? "Missing resource: ".concat(valueOf) : new String("Missing resource: "));
                return null;
            }
            String string = resources.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                String valueOf2 = String.valueOf(str);
                Log.w("GoogleApiAvailability", valueOf2.length() != 0 ? "Got empty resource: ".concat(valueOf2) : new String("Got empty resource: "));
                return null;
            }
            c006802z.put(str, string);
            return string;
        }
    }

    public static String A05(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String A04 = A04(context, str);
        if (A04 == null) {
            A04 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, A04, str2);
    }
}
