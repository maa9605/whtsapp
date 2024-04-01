package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0BF  reason: invalid class name */
/* loaded from: classes.dex */
public class C0BF {
    public final C0BX A00;
    public final String A01;

    public C0BF(Set set, C0BX c0bx) {
        this.A01 = A00(set);
        this.A00 = c0bx;
    }

    public static String A00(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C019709d c019709d = (C019709d) ((AbstractC019809e) it.next());
            sb.append(c019709d.A00);
            sb.append('/');
            sb.append(c019709d.A01);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
