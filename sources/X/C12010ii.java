package X;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.0ii  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12010ii implements Iterator, Map.Entry {
    public int A00;
    public final /* synthetic */ C0TZ A03;
    public boolean A02 = false;
    public int A01 = -1;

    public C12010ii(C0TZ c0tz) {
        this.A03 = c0tz;
        this.A00 = c0tz.A01() - 1;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (this.A02) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C0TZ c0tz = this.A03;
                Object A04 = c0tz.A04(this.A01, 0);
                if (key == A04 || (key != null && key.equals(A04))) {
                    Object value = entry.getValue();
                    Object A042 = c0tz.A04(this.A01, 1);
                    return value == A042 || (value != null && value.equals(A042));
                }
                return false;
            }
            return false;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        if (this.A02) {
            return this.A03.A04(this.A01, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        if (this.A02) {
            return this.A03.A04(this.A01, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.A01 < this.A00;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        if (this.A02) {
            C0TZ c0tz = this.A03;
            int i = this.A01;
            Object A04 = c0tz.A04(i, 0);
            Object A042 = c0tz.A04(i, 1);
            return (A04 == null ? 0 : A04.hashCode()) ^ (A042 != null ? A042.hashCode() : 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            this.A01++;
            this.A02 = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.A02) {
            this.A03.A08(this.A01);
            this.A01--;
            this.A00--;
            this.A02 = false;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        if (this.A02) {
            return this.A03.A05(this.A01, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append("=");
        sb.append(getValue());
        return sb.toString();
    }
}
