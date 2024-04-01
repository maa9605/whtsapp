package X;

/* renamed from: X.2BX  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2BX implements C2BY {
    public float A00;
    public final C2BW A01;

    public C2BX(float f, C2BW c2bw) {
        this.A00 = f;
        this.A01 = c2bw;
    }

    @Override // X.C2BY
    public boolean A6K(Object obj) {
        String str = ((C2BW) obj).A00;
        if (str != null) {
            return str.equals(this.A01.A00);
        }
        throw null;
    }

    @Override // X.C2BY
    public Object AAN() {
        return this.A01;
    }

    @Override // X.C2BY
    public float AE0() {
        return this.A00;
    }

    @Override // X.C2BY
    public void AUB(float f) {
        this.A00 = f;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("WeightedRecentGifIdentifier{");
        stringBuffer.append("gifIdentifier=");
        stringBuffer.append(this.A01);
        stringBuffer.append(", weight=");
        stringBuffer.append(this.A00);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
