package X;

/* renamed from: X.420  reason: invalid class name */
/* loaded from: classes3.dex */
public class AnonymousClass420 {
    public final int A01 = 1920;
    public final int A00 = 1080;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass420.class != obj.getClass()) {
            return false;
        }
        AnonymousClass420 anonymousClass420 = (AnonymousClass420) obj;
        return this.A01 == anonymousClass420.A01 && this.A00 == anonymousClass420.A00;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }
}
