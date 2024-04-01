package X;

/* renamed from: X.1Wi  reason: invalid class name */
/* loaded from: classes.dex */
public class C1Wi extends AbstractC18120tD {
    public float A00 = 0.0f;
    public final /* synthetic */ C18130tE A01;

    public C1Wi(C18130tE c18130tE) {
        this.A01 = c18130tE;
    }

    @Override // X.AbstractC18120tD
    public void A00(String str) {
        this.A00 = this.A01.A03.A00.measureText(str) + this.A00;
    }
}
