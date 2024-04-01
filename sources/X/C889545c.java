package X;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.45c  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C889545c {
    public final Stack A02 = new Stack();
    public final HashMap A01 = new HashMap();
    public final C45U A00 = new C45U();

    public static final void A00(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            ((C45T) entry.getValue()).A00 = false;
        }
        hashMap.clear();
    }

    public void A01(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            ((AbstractMap) this.A02.peek()).put(entry.getKey(), entry.getValue());
        }
    }
}
