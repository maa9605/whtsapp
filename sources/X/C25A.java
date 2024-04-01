package X;

import android.content.SharedPreferences;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.25A  reason: invalid class name */
/* loaded from: classes2.dex */
public class C25A {
    public static volatile C25A A02;
    public SharedPreferences A00;
    public final C02O A01;

    public C25A(C02O c02o) {
        this.A01 = c02o;
    }

    public static String A00(long j, int i, int i2, int i3, boolean z) {
        if (i != 2 && i != 3 && i != 5) {
            i = 1;
        }
        return String.format(Locale.US, "%d_%d_%d_%d_%b", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z));
    }

    public final SharedPreferences A01() {
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            SharedPreferences A01 = this.A01.A01("media_daily_usage_preferences_v1");
            this.A00 = A01;
            return A01;
        }
        return sharedPreferences;
    }

    public C25B A02(long j, int i, int i2, int i3, boolean z) {
        int i4 = i;
        String string = A01().getString(A00(j, i4, i2, i3, z), null);
        if (string != null && !string.isEmpty()) {
            C25B A00 = C25B.A00(string);
            if (A00 == null) {
                if (i != 2 && i != 3 && i != 5) {
                    i4 = 1;
                }
                return new C25B(j, i4, i2, i3, z);
            }
            return A00;
        }
        if (i != 2 && i != 3 && i != 5) {
            i4 = 1;
        }
        return new C25B(j, i4, i2, i3, z);
    }

    public void A03(long j, int i, int i2, int i3, boolean z, C25B c25b) {
        String A00 = A00(j, i, i2, i3, z);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bytesSent", c25b.A01);
            jSONObject.put("bytesReceived", c25b.A00);
            jSONObject.put("countMessageSent", c25b.A05);
            jSONObject.put("countMessageReceived", c25b.A04);
            jSONObject.put("countUploaded", c25b.A07);
            jSONObject.put("countDownloaded", c25b.A02);
            jSONObject.put("countForward", c25b.A03);
            jSONObject.put("countShared", c25b.A06);
            jSONObject.put("countViewed", c25b.A08);
            jSONObject.put("transferDate", c25b.A0C);
            jSONObject.put("mediaType", c25b.A0A);
            jSONObject.put("transferRadio", c25b.A0B);
            jSONObject.put("mediaTransferOrigin", c25b.A09);
            jSONObject.put("isAutoDownload", c25b.A0D);
            A01().edit().putString(A00, jSONObject.toString()).apply();
        } catch (JSONException e) {
            e.getMessage();
        }
    }
}
