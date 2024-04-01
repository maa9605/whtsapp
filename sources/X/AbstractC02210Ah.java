package X;

import java.util.Set;

/* renamed from: X.0Ah */
/* loaded from: classes.dex */
public abstract class AbstractC02210Ah {
    public abstract C0BJ A00(Class cls);

    public abstract C0BJ A01(Class cls);

    public Object A02(Class cls) {
        C0BJ A00 = A00(cls);
        if (A00 == null) {
            return null;
        }
        return A00.get();
    }

    public Set A03(Class cls) {
        return (Set) A01(cls).get();
    }
}
