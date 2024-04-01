package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2CA  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2CA {
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();

    public synchronized String A00(String str) {
        return (String) this.A00.get(str);
    }

    public synchronized void A01(String str, String str2) {
        if (str2 != null) {
            this.A01.put(str2, str);
        }
        this.A00.put(str, str2);
    }

    public synchronized void A02(String str, String str2) {
        if (str2 != null) {
            this.A01.remove(str2);
        }
        this.A00.remove(str);
    }
}
