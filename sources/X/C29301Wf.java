package X;

/* renamed from: X.1Wf  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C29301Wf extends AbstractC18120tD {
    public float A00;
    public float A01;
    public final /* synthetic */ C18130tE A02;

    public C29301Wf(C18130tE c18130tE, float f, float f2) {
        this.A02 = c18130tE;
        this.A00 = f;
        this.A01 = f2;
    }

    @Override // X.AbstractC18120tD
    public void A00(String str) {
        C18130tE c18130tE = this.A02;
        if (c18130tE.A0k()) {
            C18110tC c18110tC = c18130tE.A03;
            if (c18110tC.A05) {
                c18130tE.A01.drawText(str, this.A00, this.A01, c18110tC.A00);
            }
            C18110tC c18110tC2 = c18130tE.A03;
            if (c18110tC2.A06) {
                c18130tE.A01.drawText(str, this.A00, this.A01, c18110tC2.A01);
            }
        }
        this.A00 = c18130tE.A03.A00.measureText(str) + this.A00;
    }
}
