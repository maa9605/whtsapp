package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.04W  reason: invalid class name */
/* loaded from: classes.dex */
public class C04W<K, V> extends LinkedHashMap<K, V> {
    public int cacheLimit;

    public C04W(int i) {
        super(((int) Math.ceil(i / 0.75f)) + 1, 0.75f, true);
        this.cacheLimit = i;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.cacheLimit;
    }
}
