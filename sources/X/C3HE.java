package X;

/* renamed from: X.3HE  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3HE implements C2BY {
    public float A00;
    public C2K1 A01;

    public C3HE(C2K1 c2k1, Float f) {
        this.A01 = c2k1;
        this.A00 = f.floatValue();
    }

    @Override // X.C2BY
    public boolean A6K(Object obj) {
        return this.A01.ADR().equals(((C2K1) obj).ADR());
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
}
