package X;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1wc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42961wc {
    public static final Set A02;
    public static volatile C42961wc A03;
    public SharedPreferences A00;
    public final C02O A01;

    static {
        HashSet hashSet = new HashSet();
        A02 = hashSet;
        hashSet.add("first_transient_server_failure_timestamp");
        Set set = A02;
        set.add("syncd_dirty");
        set.add("syncd_last_companion_dereg_time");
        set.add("syncd_soft_fatal_on_device");
        set.add("syncd_soft_fatal_time");
        set.add("syncd_last_companion_dereg_logging_time");
        set.add("syncd_first_companion_reg_logging_time");
        set.add("syncd_bootstrap_state");
    }

    public C42961wc(C02O c02o) {
        this.A01 = c02o;
    }

    public static C42961wc A00() {
        if (A03 == null) {
            synchronized (C42961wc.class) {
                if (A03 == null) {
                    A03 = new C42961wc(C02O.A00());
                }
            }
        }
        return A03;
    }

    public synchronized long A01(String str) {
        long j;
        j = A03().getLong(str, 0L);
        A02().remove(str).apply();
        return j;
    }

    public final SharedPreferences.Editor A02() {
        return A03().edit();
    }

    public final synchronized SharedPreferences A03() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A01("syncd_prefs");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public void A04(int i) {
        A02().putInt("syncd_bootstrap_state", i).apply();
    }

    public void A05(int i) {
        A02().putInt("syncd_dirty", i).apply();
    }

    public synchronized void A06(String str, long j) {
        A02().putLong(str, A03().getLong(str, 0L) + j).apply();
    }
}
