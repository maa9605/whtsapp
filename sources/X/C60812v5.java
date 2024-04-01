package X;

import java.util.Arrays;

/* renamed from: X.2v5  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C60812v5 implements Comparable {
    public final Class A00;
    public final Object A01;

    public C60812v5(Object obj, Class cls) {
        if (cls != Boolean.class && cls != String.class && cls != Integer.class && cls != Float.class) {
            throw new IllegalArgumentException("Invalid type: must be one of {Boolean, Integer, Float, String}");
        }
        if (cls.isInstance(obj)) {
            this.A01 = obj;
            this.A00 = cls;
            return;
        }
        throw new IllegalArgumentException("Mismatched args: value is not an instance of type");
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof C60812v5) {
            C60812v5 c60812v5 = (C60812v5) obj;
            Object obj2 = c60812v5.A01;
            Class cls = c60812v5.A00;
            Class cls2 = this.A00;
            if (cls2.equals(cls)) {
                if (cls2 != Boolean.class) {
                    if (cls2 == String.class) {
                        return ((String) this.A01).compareTo((String) obj2);
                    }
                    if (cls2 == Integer.class) {
                        int intValue = ((Number) this.A01).intValue();
                        int intValue2 = ((Number) obj2).intValue();
                        if (intValue == intValue2) {
                            return 0;
                        }
                        return intValue < intValue2 ? -1 : 1;
                    } else if (cls2 == Float.class) {
                        return Float.compare(((Number) this.A01).floatValue(), ((Number) obj2).floatValue());
                    } else {
                        throw new IllegalStateException("Invalid type: must be one of {Boolean, Integer, Float, String}");
                    }
                }
                throw new IllegalArgumentException("compareTo should not be called on boolean types");
            }
            throw new IllegalArgumentException("compareTo objects have mismatched types");
        }
        throw new IllegalArgumentException("compareTo o should be an instance of ConfigPrimitive");
    }

    public boolean equals(Object obj) {
        if (obj instanceof C60812v5) {
            C60812v5 c60812v5 = (C60812v5) obj;
            Object obj2 = c60812v5.A01;
            if (this.A00.equals(c60812v5.A00) && this.A01.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    public String toString() {
        return this.A01.toString();
    }
}
