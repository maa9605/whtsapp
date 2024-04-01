package X;

/* renamed from: X.0p4  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C15630p4 implements Comparable {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public C15630p4(int i, int i2, String str, String str2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
        this.A03 = str2;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        C15630p4 c15630p4 = (C15630p4) obj;
        int i = this.A00 - c15630p4.A00;
        return i == 0 ? this.A01 - c15630p4.A01 : i;
    }
}
