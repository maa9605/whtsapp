package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.3XN  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3XN {
    public List A00 = new ArrayList();
    public final HashMap A01 = new HashMap();

    public int A00(String str) {
        int i = 0;
        for (C82003po c82003po : this.A00) {
            if (c82003po.A00.A0A.getRawString().equals(str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void A01(C82003po c82003po) {
        this.A00.add(c82003po);
        String rawString = c82003po.A00.A0A.getRawString();
        HashMap hashMap = this.A01;
        if (hashMap.containsKey(rawString)) {
            return;
        }
        hashMap.put(rawString, Long.valueOf(hashMap.size()));
    }
}
