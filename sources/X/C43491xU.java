package X;

import android.content.SharedPreferences;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

/* renamed from: X.1xU  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43491xU {
    public static volatile C43491xU A02;
    public SharedPreferences A00;
    public final C02O A01;

    public C43491xU(C02O c02o) {
        this.A01 = c02o;
    }

    public static final String A00(int i, int i2, int i3) {
        return String.format(Locale.US, "%d_%d_%d_%d_%s", Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(i2), 0, "bandwidths");
    }

    public List A01(int i, int i2, int i3) {
        SharedPreferences sharedPreferences;
        synchronized (this) {
            sharedPreferences = this.A00;
            if (sharedPreferences == null) {
                sharedPreferences = this.A01.A01("media_bandwidth_shared_preferences_v2");
                this.A00 = sharedPreferences;
            }
        }
        StringTokenizer stringTokenizer = new StringTokenizer(sharedPreferences.getString(A00(i, i2, i3), ""), ",");
        LinkedList linkedList = new LinkedList();
        while (stringTokenizer.hasMoreTokens()) {
            linkedList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
        }
        return linkedList;
    }
}
