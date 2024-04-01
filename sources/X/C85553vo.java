package X;

/* renamed from: X.3vo */
/* loaded from: classes2.dex */
public final class C85553vo extends AbstractC75873fg {
    public static final long serialVersionUID = 0;
    public final Object reference;

    public C85553vo(Object obj) {
        this.reference = obj;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C85553vo) {
            return this.reference.equals(((C85553vo) obj).reference);
        }
        return false;
    }

    public int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("Optional.of(");
        A0P.append(this.reference);
        A0P.append(")");
        return A0P.toString();
    }
}
