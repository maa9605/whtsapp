package X;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.MathContext;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.03a  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C006903a {
    public final C03Y A00;
    public final C03X A01;

    public C006903a(C03X c03x, C03Y c03y) {
        this.A01 = c03x;
        this.A00 = c03y;
    }

    public static JSONArray A00(Class cls, Object obj) {
        JSONArray jSONArray = new JSONArray();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (obj2 != null && (cls == double[].class || cls == Double.class)) {
                jSONArray.put(new BigDecimal(((Number) obj2).doubleValue(), MathContext.DECIMAL32).doubleValue());
            } else {
                jSONArray.put(obj2);
            }
        }
        return jSONArray;
    }

    public static void A01(JSONObject jSONObject, String str, Object obj, Class cls) {
        if (obj == null || !(cls == double[].class || cls == Double.class)) {
            jSONObject.put(str, obj);
        } else {
            jSONObject.put(str, new BigDecimal(((Number) obj).doubleValue(), MathContext.DECIMAL32).doubleValue());
        }
    }
}
