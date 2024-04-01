package X;

import android.app.Application;
import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.02O */
/* loaded from: classes.dex */
public class C02O {
    public static volatile C02O A04;
    public final Application A00;
    public final C004402a A01;
    public final Map A02;
    public final AtomicInteger A03;

    public C02O(C001200o c001200o, InterfaceC002901k interfaceC002901k) {
        Application application = c001200o.A00;
        this.A02 = new HashMap();
        this.A03 = new AtomicInteger();
        this.A00 = application;
        this.A01 = new C004402a(interfaceC002901k);
    }

    public static C02O A00() {
        if (A04 == null) {
            synchronized (C02O.class) {
                if (A04 == null) {
                    A04 = new C02O(C001200o.A01, C002801j.A00());
                }
            }
        }
        return A04;
    }

    public synchronized SharedPreferences A01(String str) {
        return A03(str, false);
    }

    public synchronized SharedPreferences A02(String str) {
        return A03(str, true);
    }

    public final SharedPreferences A03(String str, boolean z) {
        SharedPreferences sharedPreferencesC004602c;
        Map map = this.A02;
        SharedPreferences sharedPreferences = (SharedPreferences) map.get(str);
        if (sharedPreferences == null) {
            String str2 = C02M.A02;
            if (str2.equals(str)) {
                return this.A00.getSharedPreferences(str2, 0);
            }
            Application application = this.A00;
            File file = new File(application.getFilesDir().getParent(), "shared_prefs");
            if (!file.exists()) {
                try {
                    file.mkdir();
                    if (!file.exists()) {
                        C000200d.A0o(file, C000200d.A0P("SharedPreferencesFactory/Failed to create preference dir "));
                        sharedPreferencesC004602c = application.getSharedPreferences(str, 0);
                    } else if (!file.isDirectory() || !file.canRead() || !file.canWrite()) {
                        StringBuilder A0P = C000200d.A0P("SharedPreferencesFactory/Invalid preference dir ");
                        A0P.append(file.getAbsolutePath());
                        A0P.append(", isDirectory=");
                        A0P.append(file.isDirectory());
                        A0P.append(", canRead=");
                        A0P.append(file.canRead());
                        A0P.append(", canWrite=");
                        A0P.append(file.canWrite());
                        Log.e(A0P.toString());
                        sharedPreferencesC004602c = application.getSharedPreferences(str, 0);
                    }
                } catch (SecurityException e) {
                    StringBuilder A0P2 = C000200d.A0P("SharedPreferencesFactory/Unable to create LightSharedPreferences: ");
                    A0P2.append(file.getAbsolutePath());
                    Log.e(A0P2.toString(), e);
                    sharedPreferencesC004602c = application.getSharedPreferences(str, 0);
                }
                map.put(str, sharedPreferencesC004602c);
                return sharedPreferencesC004602c;
            }
            sharedPreferencesC004602c = new SharedPreferencesC004602c(new C004502b(new File(file, C000200d.A0H(str, ".xml"))), z, this.A01, this.A03.getAndIncrement());
            map.put(str, sharedPreferencesC004602c);
            return sharedPreferencesC004602c;
        }
        return sharedPreferences;
    }
}
