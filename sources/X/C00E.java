package X;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.00E */
/* loaded from: classes.dex */
public class C00E {
    public static volatile C00E A03;
    public SharedPreferences A00;
    public final AnonymousClass012 A01;
    public final C02O A02;

    public C00E(AnonymousClass012 anonymousClass012, C02O c02o) {
        this.A01 = anonymousClass012;
        this.A02 = c02o;
    }

    public static C00E A00() {
        if (A03 == null) {
            synchronized (C00E.class) {
                if (A03 == null) {
                    A03 = new C00E(AnonymousClass012.A00(), C02O.A00());
                }
            }
        }
        return A03;
    }

    public static String A01(String str, String str2) {
        return C000200d.A0J("/package/", str, "/", str2);
    }

    public final synchronized SharedPreferences A02() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A02.A01("instrumentation");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public String A03(String str) {
        return A02().getString(A01(str, "auth/token"), null);
    }

    public Set A04() {
        String substring;
        int indexOf;
        String substring2;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (String str : A02().getAll().keySet()) {
            if (str.startsWith("/package/") && (indexOf = (substring = str.substring(9)).indexOf("/")) >= 0 && (substring2 = substring.substring(0, indexOf)) != null) {
                hashSet2.add(substring2);
            }
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (A03(str2) != null) {
                hashSet.add(str2);
            }
        }
        return hashSet;
    }

    public void A05(String str) {
        String A01 = A01(str, "auth/token");
        String A012 = A01(str, "auth/token_ts");
        String A013 = A01(str, "auth/encryption_key");
        A02().edit().remove(A01).remove(A012).remove(A013).remove(A01(str, "metadata/last_active_time")).apply();
    }
}
