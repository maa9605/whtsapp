package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.08d  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C017508d {
    public C08f A01;
    public final Set A04 = new HashSet();
    public final Set A03 = new HashSet();
    public int A00 = 0;
    public Set A02 = new HashSet();

    public C017508d(Class cls, Class[] clsArr) {
        C07K.A1Q(cls, "Null interface");
        this.A04.add(cls);
        for (Class cls2 : clsArr) {
            C07K.A1Q(cls2, "Null interface");
        }
        Collections.addAll(this.A04, clsArr);
    }

    public C017408c A00() {
        C07K.A1c(this.A01 != null, "Missing required property: factory.");
        return new C017408c(new HashSet(this.A04), new HashSet(this.A03), this.A00, 0, this.A01, this.A02);
    }

    public void A01(C0BG c0bg) {
        C07K.A1Q(c0bg, "Null dependency");
        C07K.A1b(!this.A04.contains(c0bg.A01), "Components are not allowed to depend on interfaces they themselves provide.");
        this.A03.add(c0bg);
    }
}
