package X;

/* renamed from: X.2rf  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58762rf {
    public final C38D A00;
    public final AnonymousClass092 A01;

    public C58762rf(AnonymousClass092 anonymousClass092, C38D c38d) {
        this.A01 = anonymousClass092;
        this.A00 = c38d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C58762rf.class != obj.getClass()) {
            return false;
        }
        return this.A01.A0n.A01.equals(((C58762rf) obj).A01.A0n.A01);
    }

    public int hashCode() {
        return this.A01.A0n.A01.hashCode();
    }
}
