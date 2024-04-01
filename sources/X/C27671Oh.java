package X;

/* renamed from: X.1Oh  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C27671Oh {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C27671Oh(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A04 = z;
        this.A00 = z2;
        this.A01 = z3;
        this.A02 = z4;
        this.A03 = z5;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("WriteResult{wasSuccess=");
        A0P.append(this.A04);
        A0P.append(", chatAdded=");
        A0P.append(this.A00);
        A0P.append(", chatUnarchived=");
        A0P.append(this.A01);
        A0P.append(", isDuplicate=");
        A0P.append(this.A02);
        A0P.append(", isExpired=");
        A0P.append(this.A03);
        A0P.append('}');
        return A0P.toString();
    }
}
