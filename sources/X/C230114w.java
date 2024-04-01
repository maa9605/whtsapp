package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.14w  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C230114w {
    public Integer A00;
    public final C31971dF A01;
    public final String A02;
    public final String A03;
    public final Map A04;
    public final Set A05;
    public final Set A06;

    public C230114w(Set set, Map map, String str, String str2, C31971dF c31971dF) {
        Set unmodifiableSet;
        if (set == null) {
            unmodifiableSet = Collections.EMPTY_SET;
        } else {
            unmodifiableSet = Collections.unmodifiableSet(set);
        }
        this.A05 = unmodifiableSet;
        this.A04 = map == null ? Collections.EMPTY_MAP : map;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = c31971dF;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = this.A04.values().iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        } else {
            this.A06 = Collections.unmodifiableSet(hashSet);
        }
    }
}
