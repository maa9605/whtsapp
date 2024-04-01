package X;

/* renamed from: X.2zJ  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2zJ {
    public C48162Eb A00;
    public final int A01;
    public final AbstractC000600i A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C2zJ(AbstractC000600i abstractC000600i, String str, String str2, String str3, String str4, int i) {
        this.A02 = abstractC000600i;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A03 = str4;
        this.A01 = i;
    }

    public synchronized void A00(int i, int i2) {
        C48162Eb c48162Eb = new C48162Eb();
        c48162Eb.A03 = C0Qt.FAILURE;
        c48162Eb.A05 = "iq error";
        this.A00 = c48162Eb;
        c48162Eb.A01 = i;
        c48162Eb.A00 = i2;
    }
}
