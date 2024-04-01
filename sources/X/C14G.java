package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.14G  reason: invalid class name */
/* loaded from: classes.dex */
public final class C14G {
    public final Map A00 = Collections.synchronizedMap(new WeakHashMap());
    public final Map A01 = Collections.synchronizedMap(new WeakHashMap());

    public final void A00(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        Map map = this.A00;
        synchronized (map) {
            hashMap = new HashMap(map);
        }
        Map map2 = this.A01;
        synchronized (map2) {
            hashMap2 = new HashMap(map2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).A09(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C0NR) entry2.getKey()).A00(new C08K(status));
            }
        }
    }
}
