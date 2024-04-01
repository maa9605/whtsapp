package X;

/* renamed from: X.0Y0  reason: invalid class name */
/* loaded from: classes.dex */
public class C0Y0 {
    public int A01;
    public int A02;
    public int A06;
    public long A08;
    public int A07 = -1;
    public int A05 = 0;
    public int A00 = 0;
    public int A04 = 1;
    public int A03 = 0;
    public boolean A0D = false;
    public boolean A09 = false;
    public boolean A0E = false;
    public boolean A0A = false;
    public boolean A0C = false;
    public boolean A0B = false;

    public int A00() {
        return this.A09 ? this.A05 - this.A00 : this.A03;
    }

    public void A01(int i) {
        int i2 = this.A04;
        if ((i2 & i) != 0) {
            return;
        }
        StringBuilder A0P = C000200d.A0P("Layout state should be one of ");
        A0P.append(Integer.toBinaryString(i));
        A0P.append(" but it is ");
        A0P.append(Integer.toBinaryString(i2));
        throw new IllegalStateException(A0P.toString());
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("State{mTargetPosition=");
        A0P.append(this.A07);
        A0P.append(", mData=");
        A0P.append((Object) null);
        A0P.append(", mItemCount=");
        A0P.append(this.A03);
        A0P.append(", mIsMeasuring=");
        A0P.append(this.A0A);
        A0P.append(", mPreviousLayoutItemCount=");
        A0P.append(this.A05);
        A0P.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        A0P.append(this.A00);
        A0P.append(", mStructureChanged=");
        A0P.append(this.A0D);
        A0P.append(", mInPreLayout=");
        A0P.append(this.A09);
        A0P.append(", mRunSimpleAnimations=");
        A0P.append(this.A0C);
        A0P.append(", mRunPredictiveAnimations=");
        A0P.append(this.A0B);
        A0P.append('}');
        return A0P.toString();
    }
}
