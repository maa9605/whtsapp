package X;

/* renamed from: X.2UN  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2UN extends C451920u {
    public final AbstractC005302j A00;
    public final AbstractC005302j A01;
    public final String A02;
    public final boolean A03;

    public C2UN(AbstractC000600i abstractC000600i, C01B c01b, String str, AbstractC005302j abstractC005302j, AbstractC005302j abstractC005302j2, String str2, boolean z, boolean z2, int i, String str3) {
        super(abstractC000600i, c01b);
        this.A01 = abstractC005302j;
        this.A00 = abstractC005302j2;
        this.A0E = str2;
        this.A0L = z;
        this.A03 = z2;
        super.A01 = i;
        this.A02 = str3;
        int hashCode = str.hashCode();
        if (hashCode == -440536404) {
            if (str.equals("media_message")) {
                this.A04 = 23;
            }
        } else if (hashCode == 3540562) {
            if (str.equals("star")) {
                this.A04 = 20;
            }
        } else if (hashCode == 954925063 && str.equals("message")) {
            this.A04 = 4;
        }
    }
}
