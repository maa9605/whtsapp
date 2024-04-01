package X;

/* renamed from: X.0IP  reason: invalid class name */
/* loaded from: classes.dex */
public class C0IP {
    public final C0IR A00;

    public C0IP(C0IR c0ir) {
        this.A00 = c0ir;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C0IP)) {
            return this.A00.equals(((C0IP) obj).A00);
        }
        return false;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
