package X;

import android.util.Log;
import java.util.Locale;

/* renamed from: X.15b */
/* loaded from: classes.dex */
public class C230615b {
    public final int A00;
    public final String A01;
    public final String A02;

    public C230615b(String str, String... strArr) {
        String obj;
        if (strArr.length == 0) {
            obj = "";
        } else {
            StringBuilder sb = new StringBuilder("[");
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append(']');
            sb.append(' ');
            obj = sb.toString();
        }
        this.A02 = obj;
        this.A01 = str;
        new Object(str) { // from class: X.153
            {
                C07K.A1Q(str, "log tag cannot be null");
                C07K.A1d(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
            }
        };
        int i = 2;
        while (!Log.isLoggable(this.A01, i) && 7 >= (i = i + 1)) {
        }
        this.A00 = i;
    }

    public final String A00(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.A02.concat(str);
    }
}
