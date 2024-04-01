package X;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.2MU  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2MU {
    public static final Map A00 = new WeakHashMap();
    public static volatile C2MU A01;

    public synchronized C2Qg A00(Context context) {
        C2Qg c2Qg;
        while (context instanceof ContextWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            context = contextWrapper.getBaseContext();
        }
        Map map = A00;
        c2Qg = (C2Qg) map.get(context);
        if (c2Qg == null) {
            c2Qg = new C2Qg();
            map.put(context, c2Qg);
        }
        return c2Qg;
    }
}
