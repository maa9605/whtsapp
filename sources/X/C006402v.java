package X;

/* renamed from: X.02v  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C006402v {
    public final Object A00;

    public C006402v(Object obj) {
        if (obj != null) {
            if (obj instanceof Boolean) {
                obj = Double.valueOf(((Boolean) obj).booleanValue() ? 1.0d : 0.0d);
            } else if (obj instanceof Number) {
                obj = Double.valueOf(((Number) obj).doubleValue());
            } else if (!(obj instanceof String)) {
                throw new IllegalArgumentException("Attribute type must be Boolean, Number, or String");
            }
            this.A00 = obj;
        }
    }

    public boolean equals(Object obj) {
        Object obj2;
        if (this == obj) {
            return true;
        }
        if (obj != null && C006402v.class == obj.getClass()) {
            C006402v c006402v = (C006402v) obj;
            Object obj3 = this.A00;
            return (obj3 == null || (obj2 = c006402v.A00) == null) ? obj3 == c006402v.A00 : obj3 == obj2 || obj3.equals(obj2);
        }
        return false;
    }
}
