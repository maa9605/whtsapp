package X;

import android.text.TextUtils;
import android.text.format.Time;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1rh */
/* loaded from: classes2.dex */
public final class C40171rh {
    public String A00;
    public String A01;
    public JSONObject A02;
    public boolean A03;
    public final long A04;
    public final long A05;
    public final AbstractC000600i A06;
    public final C03310Fe A07;
    public final C40101ra A08;
    public final String A09;
    public final JSONObject A0A;

    public C40171rh(AbstractC000600i abstractC000600i, C03310Fe c03310Fe, C40101ra c40101ra, String str, String str2, long j, long j2, String str3, JSONObject jSONObject) {
        this.A06 = abstractC000600i;
        this.A07 = c03310Fe;
        this.A08 = c40101ra;
        this.A09 = str;
        this.A01 = str2;
        this.A05 = j;
        this.A04 = j2;
        this.A00 = str3;
        this.A0A = jSONObject;
    }

    public static C40171rh A00(AbstractC000600i abstractC000600i, C03310Fe c03310Fe, C40101ra c40101ra, String str, InputStream inputStream) {
        String A0D;
        try {
            A0D = AnonymousClass024.A0D(inputStream);
        } catch (IOException e) {
            Log.e("gdrive-api-v2/backup/unable to read stream", e);
        } catch (JSONException e2) {
            Log.e("gdrive-api-v2/backup/unable to read stream", e2);
            return null;
        }
        if (TextUtils.isEmpty(A0D)) {
            Log.e("gdrive-api-v2/backup/empty input");
            return null;
        }
        JSONObject jSONObject = new JSONObject(A0D);
        String A01 = A01(jSONObject, "name");
        String A012 = A01(jSONObject, "updateTime");
        if (TextUtils.isEmpty(A012)) {
            Log.e("gdrive-api-v2/backup/no updateTime provided. malformed stream?");
            return null;
        }
        Time time = new Time();
        time.parse3339(A012);
        long millis = time.toMillis(true);
        long optLong = jSONObject.optLong("sizeBytes", -1L);
        String A013 = A01(jSONObject, "activeTransactionId");
        String A014 = A01(jSONObject, "metadata");
        JSONObject jSONObject2 = !TextUtils.isEmpty(A014) ? new JSONObject(A014) : null;
        if (A01 != null && millis > 0) {
            return new C40171rh(abstractC000600i, c03310Fe, c40101ra, str, A01, millis, optLong, A013, jSONObject2);
        }
        return null;
    }

    public static String A01(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        try {
            return jSONObject.getString(str);
        } catch (JSONException e) {
            Log.e("gdrive-api-v2/backup/get-string unexpected exception", e);
            return null;
        }
    }

    public long A02() {
        JSONObject jSONObject = this.A0A;
        if (jSONObject == null) {
            return -1L;
        }
        return jSONObject.optLong("chatdbSize", -1L);
    }

    public synchronized String A03() {
        return this.A00;
    }

    public final synchronized JSONObject A04() {
        if (this.A03) {
            return this.A02;
        }
        JSONObject jSONObject = this.A0A;
        if (jSONObject == null) {
            return null;
        }
        this.A03 = true;
        String optString = jSONObject.optString("encryptedData");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        if (this.A07 != null) {
            TextUtils.isEmpty(optString);
            if (TextUtils.isEmpty(null)) {
                return null;
            }
            try {
                this.A02 = new JSONObject((String) null);
            } catch (JSONException e) {
                Log.e("gdrive-api-v2/backup/failed to parse decrypted metadata", e);
            }
            return this.A02;
        }
        throw null;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("Backup{jidUser='");
        C000200d.A1P(A0P, this.A09, '\'', ", name='");
        C000200d.A1P(A0P, this.A01, '\'', ", updateTime=");
        A0P.append(this.A05);
        A0P.append(", sizeBytes=");
        A0P.append(this.A04);
        A0P.append(", activeTransactionId='");
        A0P.append(A03());
        A0P.append('\'');
        A0P.append(", clientMetadata=");
        A0P.append(this.A0A);
        A0P.append('}');
        return A0P.toString();
    }
}
