package X;

/* renamed from: X.1VF  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1VF extends AbstractC09650eU {
    public final C0OF A00;

    public C1VF() {
        this.A00 = C0OF.A01;
    }

    public C1VF(C0OF outputData) {
        this.A00 = outputData;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || C1VF.class != o.getClass()) {
            return false;
        }
        return this.A00.equals(((C1VF) o).A00);
    }

    public int hashCode() {
        return this.A00.hashCode() - 1876823561;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("Success {mOutputData=");
        A0P.append(this.A00);
        A0P.append('}');
        return A0P.toString();
    }
}
