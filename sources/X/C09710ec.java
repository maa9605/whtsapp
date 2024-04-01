package X;

import java.lang.reflect.Method;

/* renamed from: X.0ec  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C09710ec {
    public final int A00;
    public final Method A01;

    public C09710ec(int i, Method method) {
        this.A00 = i;
        this.A01 = method;
        method.setAccessible(true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C09710ec.class != obj.getClass()) {
            return false;
        }
        C09710ec c09710ec = (C09710ec) obj;
        return this.A00 == c09710ec.A00 && this.A01.getName().equals(c09710ec.A01.getName());
    }

    public int hashCode() {
        return this.A01.getName().hashCode() + (this.A00 * 31);
    }
}
