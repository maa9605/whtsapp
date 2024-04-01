package X;

import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.4Ca  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C90684Ca implements C3NT {
    public C001200o A00;
    public C0EU A01;
    public C014406v A02 = C014406v.A00("PaymentCommonDeviceIdManager", "infra", "COMMON");

    public C90684Ca(C001200o c001200o, C0EU c0eu) {
        this.A00 = c001200o;
        this.A01 = c0eu;
    }

    public String A00() {
        Pair pair;
        String str;
        this.A02.A03("PaymentDeviceId: getid_v2()");
        Application application = this.A00.A00;
        if (Build.VERSION.SDK_INT >= 26) {
            this.A02.A03("PaymentDeviceId: still fallback to v1");
            return Settings.Secure.getString(application.getContentResolver(), "android_id");
        }
        this.A02.A03("PaymentDeviceId: generate id for v2");
        String string = Settings.Secure.getString(application.getContentResolver(), "android_id");
        Application application2 = this.A00.A00;
        if (string == null) {
            string = "";
        }
        try {
            String charsString = application2.getPackageManager().getPackageInfo(application2.getPackageName(), 64).signatures[0].toCharsString();
            if (!TextUtils.isEmpty(charsString)) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append("-");
                sb.append(charsString);
                string = sb.toString();
            }
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                try {
                    if (Build.VERSION.SDK_INT >= 19) {
                        str = StandardCharsets.UTF_8.name();
                    } else {
                        str = "UTF-8";
                    }
                    pair = new Pair(string, messageDigest.digest(string.getBytes(str)));
                } catch (UnsupportedEncodingException unused) {
                    pair = new Pair(string, null);
                }
            } catch (NoSuchAlgorithmException unused2) {
                pair = new Pair(string, null);
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            pair = new Pair(string, null);
        } catch (NullPointerException unused4) {
            pair = new Pair(string, null);
        }
        String str2 = (String) pair.first;
        byte[] bArr = (byte[]) pair.second;
        if (bArr != null) {
            StringBuilder sb2 = new StringBuilder();
            int length = bArr.length;
            for (int i = 0; i < length; i++) {
                sb2.append(String.format("%02X", Byte.valueOf(bArr[i])));
            }
            return sb2.toString();
        }
        return str2;
    }
}
