package X;

/* renamed from: X.09d  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C019709d extends AbstractC019809e {
    public final String A00;
    public final String A01;

    public C019709d(String str, String str2) {
        if (str != null) {
            this.A00 = str;
            if (str2 != null) {
                this.A01 = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC019809e) {
            C019709d c019709d = (C019709d) ((AbstractC019809e) obj);
            return this.A00.equals(c019709d.A00) && this.A01.equals(c019709d.A01);
        }
        return false;
    }

    public int hashCode() {
        return ((this.A00.hashCode() ^ 1000003) * 1000003) ^ this.A01.hashCode();
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("LibraryVersion{libraryName=");
        A0P.append(this.A00);
        A0P.append(", version=");
        return C000200d.A0L(A0P, this.A01, "}");
    }
}
