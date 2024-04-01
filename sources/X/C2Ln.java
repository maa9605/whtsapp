package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2Ln  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2Ln {
    public static volatile C2Ln A02;
    public final C003701t A00;
    public final C2Lo A01;

    public C2Ln(C003701t c003701t, C2Lo c2Lo) {
        this.A00 = c003701t;
        this.A01 = c2Lo;
    }

    public boolean A00(C05210Nt c05210Nt) {
        if (this.A01.A00.A0E(C01C.A0U)) {
            C003701t c003701t = this.A00;
            if (c003701t.A0C(355) && !TextUtils.isEmpty(c05210Nt.A05)) {
                try {
                    Pattern compile = Pattern.compile(new JSONObject(c003701t.A05(265)).getJSONArray("url").getJSONObject(0).getString("regex"));
                    String str = c05210Nt.A05;
                    if (str != null) {
                        return compile.matcher(str).matches();
                    }
                    throw null;
                } catch (JSONException e) {
                    Log.e(e);
                }
            }
            return false;
        }
        return false;
    }
}
