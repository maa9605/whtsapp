package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2A6  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2A6 {
    public static volatile C2A6 A03;
    public SharedPreferences A00;
    public final C02O A01;
    public final TreeMap A02 = new TreeMap();

    public C2A6(C02O c02o) {
        this.A01 = c02o;
    }

    public static C2A6 A00() {
        if (A03 == null) {
            synchronized (C2A6.class) {
                if (A03 == null) {
                    A03 = new C2A6(C02O.A00());
                }
            }
        }
        return A03;
    }

    public final SharedPreferences.Editor A01() {
        return A02().edit();
    }

    public final synchronized SharedPreferences A02() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A01("user_notice_prefs");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public C2A7 A03() {
        SharedPreferences A02 = A02();
        int i = A02.getInt("current_user_notice_id", -1);
        if (i == -1) {
            return null;
        }
        return new C2A7(i, A02.getInt("current_user_notice_stage", 0), A02.getLong("current_user_notice_stage_timestamp", 0L), A02.getInt("current_user_notice_version", 0));
    }

    public TreeMap A04() {
        C2A7 c2a7;
        TreeMap treeMap = this.A02;
        if (!treeMap.isEmpty()) {
            return treeMap;
        }
        String string = A02().getString("user_notices", null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject2 = new JSONObject(jSONObject.get(next).toString());
                    try {
                        c2a7 = new C2A7(jSONObject2.getInt("id"), jSONObject2.getInt("stage"), jSONObject2.getLong("t"), jSONObject2.getInt("version"));
                    } catch (JSONException e) {
                        Log.e("UserNoticeMetadata/fromJSON exception: ", e);
                        c2a7 = null;
                    }
                    treeMap.put(Integer.valueOf(next), c2a7);
                }
            } catch (JSONException e2) {
                Log.e("UserNoticeSharedPreferences/getUserNoticeMap/parsing failed", e2);
            }
        }
        return treeMap;
    }

    public void A05(C2A7 c2a7) {
        SharedPreferences.Editor A01 = A01();
        int i = c2a7.A00;
        A01.putInt("current_user_notice_id", i).putInt("current_user_notice_stage", c2a7.A01).putLong("current_user_notice_stage_timestamp", c2a7.A03).putInt("current_user_notice_version", c2a7.A02).apply();
        TreeMap A04 = A04();
        A04.put(Integer.valueOf(i), c2a7);
        A06(new ArrayList(A04.values()));
    }

    public void A06(List list) {
        HashMap hashMap = new HashMap();
        TreeMap treeMap = this.A02;
        treeMap.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2A7 c2a7 = (C2A7) it.next();
            JSONObject jSONObject = new JSONObject();
            try {
                int i = c2a7.A00;
                jSONObject.put("id", i);
                jSONObject.put("stage", c2a7.A01);
                jSONObject.put("t", c2a7.A03);
                jSONObject.put("version", c2a7.A02);
                hashMap.put(String.valueOf(i), jSONObject.toString());
                treeMap.put(Integer.valueOf(i), c2a7);
            } catch (JSONException e) {
                Log.e("UserNoticeMetadata/toJSON exception: ", e);
            }
        }
        A01().putString("user_notices", new JSONObject(hashMap).toString()).apply();
    }
}
