package X;

/* renamed from: X.0sa */
/* loaded from: classes.dex */
public class C17730sa {
    public C17760sd A00;
    public EnumC17780sf A01;
    public C18020t3 A02;

    public C17730sa(C17760sd c17760sd, C18020t3 c18020t3, EnumC17780sf enumC17780sf) {
        this.A00 = c17760sd;
        this.A02 = c18020t3;
        this.A01 = enumC17780sf;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.A00));
        sb.append(" {...} (src=");
        sb.append(this.A01);
        sb.append(")");
        return sb.toString();
    }
}
