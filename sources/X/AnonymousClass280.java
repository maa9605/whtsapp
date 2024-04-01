package X;

import java.util.Collections;
import java.util.Set;

/* renamed from: X.280  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass280 {
    public final Long A00;
    public final String A01;
    public final Set A02;

    public AnonymousClass280(String str, Set set) {
        this.A01 = str;
        this.A02 = Collections.unmodifiableSet(set);
        this.A00 = null;
    }

    public AnonymousClass280(String str, Set set, Long l) {
        this.A01 = str;
        this.A02 = Collections.unmodifiableSet(set);
        this.A00 = l;
    }
}
