package X;

/* renamed from: X.0A7  reason: invalid class name */
/* loaded from: classes.dex */
public class C0A7 extends AbstractC021009q {
    public final long value;

    public C0A7(long j) {
        this.value = j;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0A7) {
            return ((C0A7) obj).value == this.value;
        }
        return super.equals(obj);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) this.value;
    }

    public int hashCode() {
        long j = this.value;
        return (int) (j ^ (j >>> 32));
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.value;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.value;
    }

    public String toString() {
        return String.valueOf(this.value);
    }
}
