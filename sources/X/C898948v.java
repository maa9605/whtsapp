package X;

import android.content.SharedPreferences;

/* renamed from: X.48v  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C898948v {
    public static volatile C898948v A03;
    public SharedPreferences A00;
    public final C014406v A01 = C014406v.A00("PaymentProviderKeySharedPrefs", "infra", "COMMON");
    public final C02O A02;

    public C898948v(C02O c02o) {
        this.A02 = c02o;
    }

    public final synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A02.A01("com.whatsapp_payment_provider_key_preferences");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }
}
