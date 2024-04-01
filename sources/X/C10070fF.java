package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.0fF */
/* loaded from: classes.dex */
public class C10070fF {
    public int A00;
    public LinkedHashMap A01;

    public C10070fF(int i) {
        this.A00 = i;
        this.A01 = new LinkedHashMap<K, V>(((i << 2) / 3) + 1) { // from class: X.0fG
            {
                C10070fF.this = this;
            }

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry entry) {
                return size() > C10070fF.this.A00;
            }
        };
    }
}
