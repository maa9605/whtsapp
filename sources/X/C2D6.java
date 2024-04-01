package X;

/* renamed from: X.2D6  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2D6 implements C2BY {
    public float A00;
    public final C2D5 A01;

    public C2D6(float f, C2D5 c2d5) {
        this.A00 = f;
        this.A01 = c2d5;
    }

    @Override // X.C2BY
    public boolean A6K(Object obj) {
        String str = ((C2D5) obj).A01;
        if (str != null) {
            return str.equals(this.A01.A01);
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
        StringBuffer stringBuffer = new StringBuffer("WeightedRecentStickerIdentifier{");
        stringBuffer.append("stickerIdentifier=");
        stringBuffer.append(this.A01);
        stringBuffer.append(", weight=");
        stringBuffer.append(this.A00);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
