package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.08L  reason: invalid class name */
/* loaded from: classes.dex */
public final class C08L {
    public final Object A00;
    public final List A01;

    public C08L(Object obj) {
        C07K.A1P(obj);
        this.A00 = obj;
        this.A01 = new ArrayList();
    }

    public final void A00(String str, Object obj) {
        List list = this.A01;
        C07K.A1P(str);
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(valueOf.length() + str.length() + 1);
        sb.append(str);
        sb.append("=");
        sb.append(valueOf);
        list.add(sb.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(this.A00.getClass().getSimpleName());
        sb.append('{');
        List list = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) list.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
