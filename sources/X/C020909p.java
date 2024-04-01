package X;

/* renamed from: X.09p  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C020909p extends AbstractC021009q {
    public final double value;

    public C020909p(double d) {
        this.value = d;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C020909p) {
            return Double.doubleToLongBits(((C020909p) obj).value) == Double.doubleToLongBits(this.value);
        }
        return super.equals(obj);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) this.value;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.value);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.value;
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) this.value;
    }

    public String toString() {
        double d = this.value;
        long j = (long) d;
        if (d == j) {
            return String.valueOf(j);
        }
        return String.valueOf(d);
    }
}
