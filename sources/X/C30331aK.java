package X;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import java.io.IOException;

/* renamed from: X.1aK  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30331aK extends C226313g {
    public static String A04(Context context, String str) {
        final Account account = new Account(str, "com.google");
        C226313g.A01(account);
        C07K.A1U("Calling this from your main thread can lead to deadlock");
        C07K.A1V("oauth2:https://www.googleapis.com/auth/drive.appdata https://www.googleapis.com/auth/drive.file", "Scope cannot be empty or null.");
        C226313g.A01(account);
        C226313g.A02(context);
        final Bundle bundle = new Bundle();
        String str2 = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str2);
        if (TextUtils.isEmpty(bundle.getString("androidPackageName"))) {
            bundle.putString("androidPackageName", str2);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        return ((TokenData) C226313g.A00(context, C226313g.A00, new InterfaceC226413h() { // from class: X.1aZ
            public final /* synthetic */ String A02 = "oauth2:https://www.googleapis.com/auth/drive.appdata https://www.googleapis.com/auth/drive.file";

            @Override // X.InterfaceC226413h
            public final Object AX6(IBinder iBinder) {
                InterfaceC233816k c31461cJ;
                EnumC233516h[] values;
                if (iBinder == null) {
                    c31461cJ = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
                    if (queryLocalInterface instanceof InterfaceC233816k) {
                        c31461cJ = (InterfaceC233816k) queryLocalInterface;
                    } else {
                        c31461cJ = new C31461cJ(iBinder);
                    }
                }
                Bundle AWd = c31461cJ.AWd(account, this.A02, bundle);
                C226313g.A03(AWd);
                AWd.setClassLoader(TokenData.class.getClassLoader());
                Bundle bundle2 = AWd.getBundle("tokenDetails");
                EnumC233516h enumC233516h = null;
                if (bundle2 != null) {
                    bundle2.setClassLoader(TokenData.class.getClassLoader());
                    Parcelable parcelable = bundle2.getParcelable("TokenData");
                    if (parcelable != null) {
                        return parcelable;
                    }
                }
                String string = AWd.getString("Error");
                Intent intent = (Intent) AWd.getParcelable("userRecoveryIntent");
                for (EnumC233516h enumC233516h2 : EnumC233516h.values()) {
                    if (enumC233516h2.zzek.equals(string)) {
                        enumC233516h = enumC233516h2;
                    }
                }
                if (!EnumC233516h.BAD_AUTHENTICATION.equals(enumC233516h) && !EnumC233516h.CAPTCHA.equals(enumC233516h) && !EnumC233516h.NEED_PERMISSION.equals(enumC233516h) && !EnumC233516h.NEED_REMOTE_CONSENT.equals(enumC233516h) && !EnumC233516h.NEEDS_BROWSER.equals(enumC233516h) && !EnumC233516h.USER_CANCEL.equals(enumC233516h) && !EnumC233516h.DEVICE_MANAGEMENT_REQUIRED.equals(enumC233516h) && !EnumC233516h.DM_INTERNAL_ERROR.equals(enumC233516h) && !EnumC233516h.DM_SYNC_DISABLED.equals(enumC233516h) && !EnumC233516h.DM_ADMIN_BLOCKED.equals(enumC233516h) && !EnumC233516h.DM_ADMIN_PENDING_APPROVAL.equals(enumC233516h) && !EnumC233516h.DM_STALE_SYNC_REQUIRED.equals(enumC233516h) && !EnumC233516h.DM_DEACTIVATED.equals(enumC233516h) && !EnumC233516h.DM_REQUIRED.equals(enumC233516h) && !EnumC233516h.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(enumC233516h) && !EnumC233516h.DM_SCREENLOCK_REQUIRED.equals(enumC233516h)) {
                    if (!EnumC233516h.NETWORK_ERROR.equals(enumC233516h) && !EnumC233516h.SERVICE_UNAVAILABLE.equals(enumC233516h) && !EnumC233516h.INTNERNAL_ERROR.equals(enumC233516h)) {
                        throw new C0TP(string);
                    }
                    throw new IOException(string);
                }
                C230615b c230615b = C226313g.A01;
                String valueOf = String.valueOf(enumC233516h);
                StringBuilder sb = new StringBuilder(valueOf.length() + 31);
                sb.append("isUserRecoverableError status: ");
                sb.append(valueOf);
                Log.w("Auth", c230615b.A00("GoogleAuthUtil", sb.toString()));
                throw new C0TO(string, intent);
            }
        })).A03;
    }
}
