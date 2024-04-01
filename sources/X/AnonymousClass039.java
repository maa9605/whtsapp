package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.039  reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass039 extends C03A {
    public final int A00;
    public final Integer A01;
    public final Integer A02;

    public AnonymousClass039(String str, String str2, int i, Integer num, Integer num2) {
        super(str, str2);
        this.A00 = i;
        this.A02 = num;
        this.A01 = num2;
    }

    @Override // X.C03A
    public void A00(Map map, SharedPreferences.Editor editor) {
        String str = super.A00;
        String str2 = (String) map.get(super.A01);
        Integer num = this.A02;
        Integer num2 = this.A01;
        if (TextUtils.isEmpty(str2)) {
            editor.remove(str);
            return;
        }
        try {
            int parseInt = Integer.parseInt(str2);
            if (num != null) {
                parseInt = Math.max(num.intValue(), parseInt);
            }
            if (num2 != null) {
                parseInt = Math.min(num2.intValue(), parseInt);
            }
            editor.putInt(str, parseInt);
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder("PropsCommon/invalid number format for property; prefKey=");
            sb.append(str);
            sb.append("; value=");
            sb.append(str2);
            Log.w(sb.toString(), e);
            editor.remove(str);
        }
    }
}
