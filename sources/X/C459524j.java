package X;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.24j  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C459524j {
    public final C07D A00;
    public final C02590Ca A01;
    public final String A02;
    public final Map A03;
    public final Map A04;

    public C459524j(String str, Set set, C02590Ca c02590Ca, Map map, Map map2) {
        this.A02 = str;
        this.A01 = c02590Ca;
        HashSet hashSet = new HashSet();
        hashSet.addAll(set);
        this.A00 = new C07D(hashSet, null);
        this.A04 = map;
        this.A03 = map2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C459524j) {
            C459524j c459524j = (C459524j) obj;
            return this.A02.equals(c459524j.A02) && this.A00.equals(c459524j.A00) && this.A01.equals(c459524j.A01);
        }
        return false;
    }

    public int hashCode() {
        return (this.A02.hashCode() ^ this.A00.hashCode()) ^ this.A01.hashCode();
    }
}
