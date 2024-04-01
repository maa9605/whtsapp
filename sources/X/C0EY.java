package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.0EY  reason: invalid class name */
/* loaded from: classes.dex */
public class C0EY {
    public static volatile C0EY A03;
    public SharedPreferences A00;
    public SharedPreferences A01;
    public final C02O A02;

    public C0EY(C02O c02o) {
        this.A02 = c02o;
    }

    public static C0EY A00() {
        if (A03 == null) {
            synchronized (C0EY.class) {
                if (A03 == null) {
                    A03 = new C0EY(C02O.A00());
                }
            }
        }
        return A03;
    }

    public final synchronized SharedPreferences A01() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A02.A01("triggered_block_prefs");
            this.A00 = sharedPreferences;
        }
        if (sharedPreferences == null) {
            throw null;
        }
        return sharedPreferences;
    }

    public final JSONObject A02(AbstractC005302j abstractC005302j) {
        String string = A01().getString(abstractC005302j.getRawString(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new JSONObject(string);
    }

    public final void A03(AbstractC005302j abstractC005302j, JSONObject jSONObject) {
        A01().edit().putString(abstractC005302j.getRawString(), jSONObject.toString()).apply();
    }
}
