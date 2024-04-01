package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.016  reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass016 {
    public static volatile AnonymousClass016 A01;
    public final C001200o A00;

    public AnonymousClass016(C001200o c001200o) {
        this.A00 = c001200o;
    }

    public static AnonymousClass016 A00() {
        if (A01 == null) {
            synchronized (AnonymousClass016.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass016(C001200o.A01);
                }
            }
        }
        return A01;
    }

    public List A01() {
        ArrayList arrayList = new ArrayList();
        if (!A04("breakpad")) {
            arrayList.add("breakpad");
        }
        if (!A04("anr_detector")) {
            arrayList.add("anr_detector");
        }
        if (!A04("abort_hook")) {
            arrayList.add("abort_hook");
        }
        return arrayList;
    }

    public void A02(String str) {
        boolean delete = new File(this.A00.A00.getCacheDir(), C000200d.A0H(str, ".health")).delete();
        StringBuilder sb = new StringBuilder();
        sb.append("Module ");
        sb.append(str);
        sb.append(" health file deleted: ");
        sb.append(delete);
        Log.i(sb.toString());
    }

    public void A03(String str, Runnable runnable) {
        if (!A04(str)) {
            C000200d.A19("Skipping module ", str, " since its unhealthy");
            return;
        }
        C000200d.A14("Loading module: ", str);
        try {
            new File(this.A00.A00.getCacheDir(), C000200d.A0H(str, ".health")).createNewFile();
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error creating health file for ");
            sb.append(str);
            Log.e(sb.toString(), e);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        runnable.run();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        A02(str);
        StringBuilder A0W = C000200d.A0W("Module loaded: ", str, " load time: ");
        A0W.append(elapsedRealtime2 - elapsedRealtime);
        Log.i(A0W.toString());
    }

    public boolean A04(String str) {
        return !new File(this.A00.A00.getCacheDir(), C000200d.A0H(str, ".health")).exists();
    }
}
