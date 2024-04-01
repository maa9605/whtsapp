package X;

import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.44P  reason: invalid class name */
/* loaded from: classes3.dex */
public class C44P {
    public static volatile C44P A00;

    public static boolean A00(String str, String str2, C91674Fv c91674Fv) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            JSONArray jSONArray = jSONObject.getJSONArray("url");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string = jSONObject2.getString("regex");
                HashMap hashMap = new HashMap();
                Matcher matcher = Pattern.compile(string, 2).matcher(str);
                if (matcher.find()) {
                    int groupCount = matcher.groupCount();
                    if (groupCount >= 1) {
                        JSONArray jSONArray2 = jSONObject2.getJSONArray("param");
                        int i2 = 0;
                        while (i2 < groupCount) {
                            i2++;
                            hashMap.put(jSONArray2.getJSONObject(i2).getString("name"), matcher.group(i2));
                        }
                    }
                    JSONObject jSONObject3 = jSONObject.has("opts") ? jSONObject.getJSONObject("opts") : new JSONObject();
                    if (jSONObject2.has("opts")) {
                        JSONObject jSONObject4 = jSONObject2.getJSONObject("opts");
                        Iterator<String> keys = jSONObject4.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            jSONObject3.put(next, jSONObject4.get(next));
                        }
                    }
                    c91674Fv.A00 = new JSONObject(hashMap);
                    return true;
                }
            }
        } catch (JSONException e) {
            Log.e(e);
        }
        return false;
    }
}
