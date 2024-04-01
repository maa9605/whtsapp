package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.07E */
/* loaded from: classes.dex */
public final class C07E {
    public static final C07E A01 = new C07E(Collections.emptyMap());
    public final Map A00;

    public C07E(Map map) {
        this.A00 = map;
    }

    public C07E(Map map, C0L0 c0l0) {
        this.A00 = map;
    }

    public static C07E A00(Map map) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        return new C07E(hashMap, null);
    }

    public C07D A01() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.A00.entrySet());
        return new C07D(hashSet, null);
    }

    public C07D A02() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.A00.keySet());
        return new C07D(hashSet, null);
    }

    public Collection A03() {
        return new ArrayList(this.A00.values());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C07E.class != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C07E) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
