package X;

import android.os.Build;
import com.facebook.profilo.logger.Logger;
import java.util.Random;

/* renamed from: X.055  reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass055 {
    public static volatile AnonymousClass055 A03;
    public final C02E A00;
    public final C02O A01;
    public final Random A02 = new Random();

    public AnonymousClass055(C02E c02e, C02O c02o) {
        this.A00 = c02e;
        this.A01 = c02o;
    }

    public static final void A00(String str, String str2, int i) {
        Logger.writeBytesEntry(0, 1, 57, Logger.writeBytesEntry(0, 1, 56, Logger.writeStandardEntry(0, 7, 52, 0L, 0, i, 0, 0L), str), str2);
    }

    public final void A01() {
        A00("os_type", "Android", 8126483);
        A00("os_sdk", Integer.toString(Build.VERSION.SDK_INT), 8126483);
        A00("device_type", Build.MODEL, 8126478);
        A00("brand", Build.BRAND, 8126479);
        A00("manufacturer", Build.MANUFACTURER, 8126480);
        A00("year_class", Integer.toString(AnonymousClass029.A07(this.A01, this.A00)), 8126481);
    }
}
