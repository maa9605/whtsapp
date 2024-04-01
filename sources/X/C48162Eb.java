package X;

/* renamed from: X.2Eb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C48162Eb {
    public int A00;
    public int A01;
    public int A02;
    public C0Qt A03;
    public String A04;
    public String A05;
    public String A06;

    public boolean equals(Object obj) {
        if (obj instanceof C48162Eb) {
            C48162Eb c48162Eb = (C48162Eb) obj;
            return this.A03 == c48162Eb.A03 && c48162Eb.A02 == this.A02 && c48162Eb.A01 == this.A01 && c48162Eb.A00 == this.A00;
        }
        return false;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("[ResumeCheck.Result type=");
        A0P.append(this.A03);
        A0P.append(", resume=");
        A0P.append(this.A02);
        A0P.append(", error=");
        A0P.append(this.A01);
        A0P.append(", message=");
        A0P.append(this.A05);
        A0P.append(", backoff=");
        return C000200d.A0K(A0P, this.A00, "]");
    }
}
