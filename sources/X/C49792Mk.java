package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;

/* renamed from: X.2Mk  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C49792Mk {
    public static volatile C49792Mk A02;
    public SharedPreferences A00;
    public final C02O A01;

    public C49792Mk(C02O c02o) {
        this.A01 = c02o;
    }

    public final SharedPreferences A00() {
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            SharedPreferences A01 = this.A01.A01(C02M.A02);
            this.A00 = A01;
            return A01;
        }
        return sharedPreferences;
    }

    public void A01(String str, String str2) {
        SharedPreferences.Editor edit = A00().edit();
        edit.remove(C000200d.A0J("gbackup-ResumableUrl-", str, "-", str2));
        if (edit.commit()) {
            return;
        }
        Log.w("gdrive-api/remove-resumable-uri unable to commit resumable uri to shared prefs.");
    }
}
