package X;

import android.os.SystemClock;
import java.util.HashMap;

/* renamed from: X.0G0  reason: invalid class name */
/* loaded from: classes.dex */
public class C0G0 {
    public final HashMap A01 = new HashMap();
    public final long A00 = 60000;

    public synchronized void A00() {
        this.A01.clear();
    }

    public synchronized void A01(Object obj) {
        this.A01.remove(obj);
    }

    public synchronized boolean A02(Object obj) {
        HashMap hashMap = this.A01;
        Long l = (Long) hashMap.get(obj);
        if (l == null || l.longValue() + this.A00 <= SystemClock.elapsedRealtime()) {
            hashMap.put(obj, Long.valueOf(SystemClock.elapsedRealtime()));
            return true;
        }
        return false;
    }
}
