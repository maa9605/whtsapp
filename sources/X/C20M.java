package X;

import java.util.Arrays;

/* renamed from: X.20M */
/* loaded from: classes2.dex */
public class C20M {
    public final C0IP A00;
    public final C0JV A01;

    public C20M(C0JV c0jv, C0IP c0ip) {
        this.A01 = c0jv;
        this.A00 = c0ip;
    }

    public boolean equals(Object obj) {
        if (obj == null || C20M.class != obj.getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C20M c20m = (C20M) obj;
        return c20m.A01.equals(this.A01) && c20m.A00.equals(this.A00);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }
}
