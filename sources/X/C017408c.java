package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.08c */
/* loaded from: classes.dex */
public final class C017408c {
    public final int A00;
    public final int A01;
    public final C08f A02;
    public final Set A03;
    public final Set A04;
    public final Set A05;

    public C017408c(Set set, Set set2, int i, int i2, C08f c08f, Set set3) {
        this.A04 = Collections.unmodifiableSet(set);
        this.A03 = Collections.unmodifiableSet(set2);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = c08f;
        this.A05 = Collections.unmodifiableSet(set3);
    }

    public static C017408c A00(Object obj, Class cls, Class... clsArr) {
        C017508d c017508d = new C017508d(cls, clsArr);
        C08f c08f = new C08f(obj) { // from class: X.08e
            public final Object A00;

            {
                this.A00 = obj;
            }

            @Override // X.C08f
            public Object A6i(AbstractC02210Ah abstractC02210Ah) {
                return this.A00;
            }
        };
        C07K.A1Q(c08f, "Null factory");
        c017508d.A01 = c08f;
        return c017508d.A00();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Component<");
        sb.append(Arrays.toString(this.A04.toArray()));
        sb.append(">{");
        sb.append(this.A00);
        sb.append(", type=");
        sb.append(this.A01);
        sb.append(", deps=");
        sb.append(Arrays.toString(this.A03.toArray()));
        sb.append("}");
        return sb.toString();
    }
}
