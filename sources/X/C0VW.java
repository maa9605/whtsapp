package X;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0VW */
/* loaded from: classes.dex */
public class C0VW {
    public final HashMap A00 = new HashMap();

    public final void A00() {
        HashMap hashMap = this.A00;
        for (C0MU c0mu : hashMap.values()) {
            c0mu.A01 = true;
            Map map = c0mu.A00;
            if (map != null) {
                synchronized (map) {
                    for (Object obj : map.values()) {
                        if (obj instanceof Closeable) {
                            try {
                                ((Closeable) obj).close();
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            }
            c0mu.A01();
        }
        hashMap.clear();
    }
}
