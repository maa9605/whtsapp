package X;

import android.os.Build;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.regex.Pattern;

/* renamed from: X.02f */
/* loaded from: classes.dex */
public class C004902f {
    public static volatile C004902f A03;
    public String A00;
    public String A01;
    public final C001200o A02;

    public C004902f(C001200o c001200o) {
        this.A02 = c001200o;
    }

    public static C004902f A00() {
        if (A03 == null) {
            synchronized (C004902f.class) {
                if (A03 == null) {
                    A03 = new C004902f(C001200o.A01);
                }
            }
        }
        return A03;
    }

    public static final String A01(C001200o c001200o, String str) {
        String str2;
        String str3;
        String str4 = "unknown";
        Pattern compile = Pattern.compile("[^,\\.\\w\\-\\(\\)]");
        StringBuilder sb = new StringBuilder();
        sb.append(str.replace(' ', '_'));
        String obj = sb.toString();
        String replace = "Android".replace(' ', '_');
        String replace2 = c001200o.A00.getString(R.string.app_name).replace(' ', '_');
        try {
            str2 = compile.matcher(Build.VERSION.RELEASE).replaceAll("_");
        } catch (NoSuchFieldError e) {
            Log.e("app/user-agent/release", e);
            str2 = "unknown";
        }
        try {
            str3 = compile.matcher(Build.MANUFACTURER).replaceAll("_");
        } catch (NoSuchFieldError e2) {
            Log.e("app/user-agent/manufacturer", e2);
            str3 = "unknown";
        }
        try {
            str4 = compile.matcher(Build.MODEL).replaceAll("_");
        } catch (NoSuchFieldError e3) {
            Log.e("app/user-agent/model", e3);
        }
        StringBuilder A0X = C000200d.A0X(replace2, "/", obj, " ", replace);
        C000200d.A1U(A0X, "/", str2, " Device/", str3);
        return C000200d.A0M(A0X, "-", str4, "");
    }

    public synchronized String A02() {
        if (this.A00 == null) {
            this.A00 = A01(this.A02, "2.21.9.15");
        }
        return this.A00;
    }
}
