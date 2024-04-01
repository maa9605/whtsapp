package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.1yM  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44001yM {
    public final String A00;
    public final String A01;
    public final String A02;
    public final Map A03;

    public C44001yM(String str, String str2, String str3, String str4, Map map) {
        this.A01 = str;
        this.A00 = str3;
        this.A02 = str4;
        if (map == null) {
            map = new HashMap();
            this.A03 = map;
        } else {
            this.A03 = map;
        }
        map.put("0", str2);
    }

    public C44001yM(String str, String str2, String str3, Map map) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
        if (map == null) {
            this.A03 = new HashMap();
        } else {
            this.A03 = map;
        }
    }

    public static C44001yM A00(String str) {
        HashMap hashMap;
        JSONObject jSONObject = new JSONObject(str);
        JSONObject optJSONObject = jSONObject.optJSONObject("bundles");
        if (optJSONObject != null) {
            hashMap = new HashMap();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String obj = keys.next().toString();
                hashMap.put(obj, optJSONObject.getString(obj));
            }
        } else {
            hashMap = null;
        }
        return new C44001yM(jSONObject.getString("name"), jSONObject.optString("locale_lang", null), jSONObject.optString("url", null), hashMap);
    }

    public String A01(int i) {
        String str = (String) this.A03.get(Integer.toString(i));
        return str == null ? "" : str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C44001yM) {
            C44001yM c44001yM = (C44001yM) obj;
            if (this.A01.equals(c44001yM.A01)) {
                String str = this.A00;
                if (!(str == null && c44001yM.A00 == null) && (str == null || !str.equals(c44001yM.A00))) {
                    return false;
                }
                String str2 = this.A02;
                return (str2 == null && c44001yM.A02 == null) || (str2 != null && str2.equals(c44001yM.A02));
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.A01.hashCode() + 159) * 53;
        String str = this.A00;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 53;
        String str2 = this.A02;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
