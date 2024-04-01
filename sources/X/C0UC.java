package X;

import java.util.Map;

/* renamed from: X.0UC  reason: invalid class name */
/* loaded from: classes.dex */
public class C0UC implements Map.Entry {
    public C0UC A00;
    public C0UC A01;
    public final Object A02;
    public final Object A03;

    public C0UC(Object obj, Object obj2) {
        this.A02 = obj;
        this.A03 = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0UC) {
            C0UC c0uc = (C0UC) obj;
            return this.A02.equals(c0uc.A02) && this.A03.equals(c0uc.A03);
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.A02;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.A03;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return this.A02.hashCode() ^ this.A03.hashCode();
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A02);
        sb.append("=");
        sb.append(this.A03);
        return sb.toString();
    }
}
