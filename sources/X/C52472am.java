package X;

/* renamed from: X.2am  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C52472am extends AbstractC52452ak {
    public C52472am(Object obj, int i) {
        super(obj, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C52472am.class != obj.getClass()) {
            return false;
        }
        AbstractC52452ak abstractC52452ak = (AbstractC52452ak) obj;
        return this.A00 == abstractC52452ak.A00 && this.A01.equals(abstractC52452ak.A01);
    }

    public int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("[type: ");
        A0P.append(this.A00);
        A0P.append(", data: ");
        A0P.append(this.A01);
        A0P.append("]");
        return A0P.toString();
    }
}
