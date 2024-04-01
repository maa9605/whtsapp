package X;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0MU  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0MU {
    public final Map A00 = new HashMap();
    public volatile boolean A01 = false;

    public void A01() {
    }

    public void A00(Object obj) {
        Object obj2;
        Map map = this.A00;
        synchronized (map) {
            obj2 = map.get("androidx.lifecycle.savedstate.vm.tag");
            if (obj2 == null) {
                map.put("androidx.lifecycle.savedstate.vm.tag", obj);
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.A01 && (obj instanceof Closeable)) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
