package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Ot  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C27781Ot {
    public int A00;
    public final C05E A01;
    public final Map A02 = new HashMap();

    public C27781Ot(int i, C05E c05e) {
        this.A00 = i;
        this.A01 = c05e;
    }

    public void A00() {
        Map map = this.A02;
        for (C0CF c0cf : map.values()) {
            if (c0cf != null) {
                c0cf.A00.close();
            }
        }
        map.clear();
    }
}
