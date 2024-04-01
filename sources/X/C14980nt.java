package X;

/* renamed from: X.0nt  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C14980nt {
    public int A00;
    public int A01;
    public int A03;
    public int A04;
    public boolean A06;
    public boolean A08;
    public boolean A07 = true;
    public int A05 = 0;
    public int A02 = 0;

    public String toString() {
        StringBuilder A0P = C000200d.A0P("LayoutState{mAvailable=");
        A0P.append(this.A00);
        A0P.append(", mCurrentPosition=");
        A0P.append(this.A01);
        A0P.append(", mItemDirection=");
        A0P.append(this.A03);
        A0P.append(", mLayoutDirection=");
        A0P.append(this.A04);
        A0P.append(", mStartLine=");
        A0P.append(this.A05);
        A0P.append(", mEndLine=");
        A0P.append(this.A02);
        A0P.append('}');
        return A0P.toString();
    }
}
