package X;

/* renamed from: X.3TA  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3TA {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3TA.class == obj.getClass()) {
            String str = this.A05;
            String str2 = ((C3TA) obj).A05;
            if (str == null) {
                return str2 == null;
            }
            return str.equals(str2);
        }
        return false;
    }
}
