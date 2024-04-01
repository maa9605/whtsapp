package X;

/* renamed from: X.0sl  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17840sl {
    public EnumC17820sj A00;
    public EnumC17830sk A01;
    public static final C17840sl A03 = new C17840sl(EnumC17820sj.none, null);
    public static final C17840sl A02 = new C17840sl(EnumC17820sj.xMidYMid, EnumC17830sk.meet);

    public C17840sl(EnumC17820sj enumC17820sj, EnumC17830sk enumC17830sk) {
        this.A00 = enumC17820sj;
        this.A01 = enumC17830sk;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17840sl.class == obj.getClass()) {
            C17840sl c17840sl = (C17840sl) obj;
            return this.A00 == c17840sl.A00 && this.A01 == c17840sl.A01;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        sb.append(" ");
        sb.append(this.A01);
        return sb.toString();
    }
}
