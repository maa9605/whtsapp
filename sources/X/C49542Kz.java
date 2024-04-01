package X;

import android.os.Build;
import android.text.TextUtils;
import android.text.format.Time;
import android.util.Base64;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2Kz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C49542Kz {
    public static final Pair A0D;
    public static final Pattern A0E;
    public static final boolean A0F;
    public final AbstractC000600i A00;
    public final C49792Mk A01;
    public final AbstractC40111rb A02;
    public final C640631x A03;
    public final C40171rh A04;
    public final C40101ra A05;
    public final C000800k A06;
    public final AnonymousClass034 A07;
    public final C02F A08;
    public final InterfaceC002901k A09;
    public final File A0A;
    public final String A0B;
    public final String A0C;

    static {
        A0F = Build.VERSION.SDK_INT <= 20;
        A0D = Pair.create(null, null);
        A0E = Pattern.compile("bytes=0-(\\d*)");
    }

    public C49542Kz(AbstractC000600i abstractC000600i, AnonymousClass034 anonymousClass034, C49792Mk c49792Mk, C02F c02f, C40171rh c40171rh, File file, String str, C640631x c640631x, AbstractC40111rb abstractC40111rb, C40101ra c40101ra, C000800k c000800k, InterfaceC002901k interfaceC002901k) {
        this.A00 = abstractC000600i;
        this.A07 = anonymousClass034;
        this.A01 = c49792Mk;
        this.A08 = c02f;
        this.A04 = c40171rh;
        this.A0A = file;
        this.A0C = str;
        this.A03 = c640631x;
        this.A02 = abstractC40111rb;
        this.A05 = c40101ra;
        this.A0B = c40101ra.A0B;
        this.A06 = c000800k;
        this.A09 = interfaceC002901k;
    }

    public static C40051rV A00(String str, long j, String str2) {
        if (TextUtils.isEmpty(str)) {
            Log.e("gdrive-api-v2/upload-file/unexpected-response/file-uploaded-but-no-entity-in-response");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("name");
            String optString2 = jSONObject.optString("mimeType", "application/binary");
            String optString3 = jSONObject.optString("md5Hash");
            String optString4 = jSONObject.optString("sizeBytes");
            String optString5 = jSONObject.optString("updateTime");
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3) && !TextUtils.isEmpty(optString5)) {
                String A04 = C02A.A04(Base64.decode(optString3, 2));
                long A03 = AnonymousClass024.A03(optString4, j);
                Time time = new Time();
                time.parse3339(optString5);
                return new C40051rV(str2, optString, optString2, A04, A03, time.toMillis(true));
            }
            Log.e("gdrive-api-v2/upload-file/some attributes are missing");
            return null;
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("gdrive-api-v2/upload-file/malformed-json-response/");
            sb.append(str);
            Log.e(sb.toString(), e);
            return null;
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0772 A[Catch: FileNotFoundException -> 0x07a0, TRY_ENTER, TryCatch #33 {FileNotFoundException -> 0x07a0, blocks: (B:62:0x02d3, B:64:0x02ef, B:142:0x04df, B:144:0x04e3, B:162:0x057e, B:276:0x0772, B:278:0x0781, B:292:0x0795, B:293:0x079f, B:187:0x062d, B:216:0x06e5, B:277:0x077a, B:65:0x02f7, B:95:0x0454, B:134:0x04d3), top: B:370:0x02d3, inners: #59 }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0785 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:414:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.concurrent.atomic.AtomicLong] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.util.concurrent.atomic.AtomicLong] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r8v22, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.lang.Object, X.31z] */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C40051rV A01() {
        /*
            Method dump skipped, instructions count: 2324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49542Kz.A01():X.1rV");
    }
}
