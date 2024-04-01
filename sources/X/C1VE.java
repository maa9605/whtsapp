package X;

/* renamed from: X.1VE  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1VE extends AbstractC09650eU {
    public final C0OF A00 = C0OF.A01;

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || C1VE.class != o.getClass()) {
            return false;
        }
        return this.A00.equals(((C1VE) o).A00);
    }

    public int hashCode() {
        return this.A00.hashCode() + 846803280;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("Failure {mOutputData=");
        A0P.append(this.A00);
        A0P.append('}');
        return A0P.toString();
    }
}
