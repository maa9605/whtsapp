package X;

/* renamed from: X.0yx  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21200yx {
    public static final C21200yx A02;
    public static final C21200yx A03;
    public final long A00;
    public final long A01;

    static {
        C21200yx c21200yx = new C21200yx(0L, 0L);
        A03 = c21200yx;
        A02 = c21200yx;
    }

    public C21200yx(long j, long j2) {
        C002701i.A1J(j >= 0);
        C002701i.A1J(j2 >= 0);
        this.A01 = j;
        this.A00 = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C21200yx.class != obj.getClass()) {
            return false;
        }
        C21200yx c21200yx = (C21200yx) obj;
        return this.A01 == c21200yx.A01 && this.A00 == c21200yx.A00;
    }

    public int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
