package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.1yq */
/* loaded from: classes2.dex */
public class C44301yq extends AnonymousClass061 {
    public static volatile C44301yq A00;

    public C44301yq(AnonymousClass062 anonymousClass062) {
        super(anonymousClass062);
    }

    public static C44301yq A00() {
        if (A00 == null) {
            synchronized (C44301yq.class) {
                if (A00 == null) {
                    A00 = new C44301yq(AnonymousClass062.A00());
                }
            }
        }
        return A00;
    }

    public Integer A0D(String str) {
        String A0F = A0F(str);
        Integer num = null;
        if (A0F != null) {
            try {
                num = Integer.valueOf(Integer.parseInt(A0F));
                return num;
            } catch (NumberFormatException e) {
                StringBuilder sb = new StringBuilder("key-value-store/getIntProp/Invalid int value: ");
                sb.append(A0F);
                Log.e(sb.toString(), e);
                return num;
            }
        }
        return null;
    }

    public Long A0E(String str) {
        String A0F = A0F(str);
        Long l = null;
        if (A0F != null) {
            try {
                l = Long.valueOf(Long.parseLong(A0F));
                return l;
            } catch (NumberFormatException e) {
                StringBuilder sb = new StringBuilder("key-value-store/getLongProp/Invalid long value: ");
                sb.append(A0F);
                Log.e(sb.toString(), e);
                return l;
            }
        }
        return null;
    }

    public String A0F(String str) {
        C0CD A0A = A0A();
        try {
            Cursor A05 = AnonymousClass061.A05(A0A, "wa_props", new String[]{"prop_value"}, "prop_name=?", new String[]{str}, null, "CONTACT_PROPS");
            if (A05 == null || !A05.moveToFirst()) {
                if (A05 != null) {
                    A05.close();
                }
                A0A.close();
                return null;
            }
            String string = A05.getString(0);
            A05.close();
            A0A.close();
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A0A.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public List A0G(String str) {
        String A0F = A0F(str);
        if (A0F == null) {
            return null;
        }
        String[] split = A0F.split(",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            try {
                arrayList.add(Long.valueOf(Long.parseLong(str2)));
            } catch (NumberFormatException e) {
                StringBuilder sb = new StringBuilder("key-value-store/getLongListProp/Invalid long value: ");
                sb.append(str2);
                Log.e(sb.toString(), e);
                return null;
            }
        }
        return arrayList;
    }

    public synchronized Set A0H(String str) {
        String A0F = A0F(str);
        HashSet hashSet = new HashSet();
        if (A0F == null) {
            return hashSet;
        }
        try {
            JSONArray jSONArray = new JSONArray(A0F);
            for (int i = 0; i < jSONArray.length(); i++) {
                hashSet.add(jSONArray.getString(i));
            }
            return hashSet;
        } catch (JSONException e) {
            throw new IllegalStateException("key-value-store/getStringSetProp:", e);
        }
    }

    public final void A0I(String str, String str2) {
        try {
            C0CD A0B = A0B();
            if (TextUtils.isEmpty(str2)) {
                AnonymousClass061.A09(A0B, "wa_props", "prop_name=?", new String[]{str});
            } else {
                ContentValues contentValues = new ContentValues(2);
                contentValues.put("prop_name", str);
                contentValues.put("prop_value", str2);
                AnonymousClass061.A08(A0B, "wa_props", contentValues);
            }
            A0B.close();
        } catch (IllegalArgumentException e) {
            String A0H = C000200d.A0H("key-value-store/unable to set prop:", str);
            if (A0H != null) {
                Log.e(A0H, e);
                return;
            }
            throw null;
        }
    }

    public synchronized void A0J(String str, Set set) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        A0I(str, jSONArray.toString());
    }
}
