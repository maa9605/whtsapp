package X;

import android.content.SharedPreferences;
import java.util.Collections;

/* renamed from: X.28W  reason: invalid class name */
/* loaded from: classes2.dex */
public class C28W {
    public static volatile C28W A02;
    public SharedPreferences A00;
    public final C02O A01;

    public C28W(C02O c02o) {
        this.A01 = c02o;
    }

    public void A00(C28Y c28y, String str) {
        SharedPreferences sharedPreferences;
        synchronized (this) {
            sharedPreferences = this.A00;
            if (sharedPreferences == null) {
                sharedPreferences = this.A01.A01("com.whatsapp_payment_sync_preferences");
                this.A00 = sharedPreferences;
            }
        }
        sharedPreferences.edit().putString(c28y.A01.A00(), str).apply();
        for (C28Y c28y2 : Collections.unmodifiableList(c28y.A00)) {
            A00(c28y2, str);
        }
    }
}
