package X;

/* renamed from: X.0IO  reason: invalid class name */
/* loaded from: classes.dex */
public class C0IO {
    public final int A00;
    public final String A01;

    public C0IO(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C0IO)) {
            C0IO c0io = (C0IO) obj;
            return this.A01.equals(c0io.A01) && this.A00 == c0io.A00;
        }
        return false;
    }

    public int hashCode() {
        return this.A01.hashCode() ^ this.A00;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass024.A0J(this.A01, 4));
        sb.append(":");
        sb.append(this.A00);
        return sb.toString();
    }
}
