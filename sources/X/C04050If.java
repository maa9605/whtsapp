package X;

import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0If  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C04050If {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final C2CI[] A06;

    public C04050If(C2CI[] c2ciArr, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.A06 = c2ciArr;
        this.A01 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A03 = str4;
        this.A00 = str5;
        this.A05 = z;
    }

    public static C04050If A00(byte[] bArr) {
        String str;
        C2CI[] c2ciArr;
        Object opt;
        if (bArr == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr, "UTF-8"));
            ArrayList arrayList = new ArrayList();
            if (jSONObject.has("emojis") && (opt = jSONObject.opt("emojis")) != null) {
                if (opt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) opt;
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String optString = jSONArray.optString(i, null);
                        if (optString != null) {
                            arrayList.add(C43981yK.A04(optString));
                        }
                    }
                } else if (opt instanceof String) {
                    String str2 = (String) opt;
                    int length = str2.length();
                    if (length > 2) {
                        String[] split = str2.substring(1, length - 1).split(",");
                        for (String str3 : split) {
                            if (str3 != null) {
                                arrayList.add(C43981yK.A04(str3));
                            }
                        }
                    }
                } else {
                    StringBuilder A0P = C000200d.A0P("StickerMetadata/createFromWebpMetadata unrecognizable type of emoji metadata:");
                    A0P.append(opt.getClass());
                    Log.w(A0P.toString());
                }
            }
            if (jSONObject.has("sticker-pack-id")) {
                str = jSONObject.optString("sticker-pack-id", null);
            } else {
                str = null;
            }
            if (!arrayList.isEmpty()) {
                c2ciArr = (C2CI[]) arrayList.toArray(new C2CI[0]);
            } else {
                c2ciArr = null;
            }
            return new C04050If(c2ciArr, str, jSONObject.optString("sticker-pack-name", null), jSONObject.optString("sticker-pack-publisher", null), jSONObject.optString("android-app-store-link", null), jSONObject.optString("ios-app-store-link", null), jSONObject.optInt("is-first-party-sticker", 0) == 1);
        } catch (UnsupportedEncodingException unused) {
            Log.e("WebpUtils/extractWebpMetadata invalid metadata encoding");
            return null;
        } catch (JSONException unused2) {
            Log.e("WebpUtils/extractWebpMetadata invalid metadata");
            return null;
        }
    }

    public byte[] A01() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sticker-pack-id", this.A01);
            jSONObject.put("sticker-pack-name", this.A02);
            jSONObject.put("sticker-pack-publisher", this.A04);
            String str = this.A03;
            if (str != null) {
                jSONObject.put("android-app-store-link", str);
            }
            String str2 = this.A00;
            if (str2 != null) {
                jSONObject.put("ios-app-store-link", str2);
            }
            C2CI[] c2ciArr = this.A06;
            if (c2ciArr != null) {
                ArrayList arrayList = new ArrayList(c2ciArr.length);
                for (C2CI c2ci : c2ciArr) {
                    arrayList.add(c2ci.toString());
                }
                jSONObject.put("emojis", new JSONArray((Collection) arrayList));
            }
            if (this.A05) {
                jSONObject.put("is-first-party-sticker", 1);
            }
            return jSONObject.toString().getBytes();
        } catch (JSONException e) {
            Log.e("StickerMetadata/convertToBytes error during JSON conversion", e);
            return null;
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("StickerMetadata{");
        stringBuffer.append("emojis=");
        C2CI[] c2ciArr = this.A06;
        stringBuffer.append(c2ciArr == null ? "null" : Arrays.asList(c2ciArr).toString());
        stringBuffer.append(", isFirstPartySticker=");
        stringBuffer.append(this.A05);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
