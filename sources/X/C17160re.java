package X;

import android.content.Context;
import android.os.PowerManager;
import java.util.WeakHashMap;

/* renamed from: X.0re  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17160re {
    public static final String A00 = AbstractC16430qO.A01("WakeLocks");
    public static final WeakHashMap A01 = new WeakHashMap();

    public static PowerManager.WakeLock A00(Context context, String tag) {
        String A0H = C000200d.A0H("WorkManager: ", tag);
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, A0H);
        WeakHashMap weakHashMap = A01;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, A0H);
        }
        return newWakeLock;
    }
}
