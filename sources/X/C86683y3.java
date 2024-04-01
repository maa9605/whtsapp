package X;

/* renamed from: X.3y3  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C86683y3 extends C1YU {
    public int A00;
    public final /* synthetic */ C73453bf A01;

    public C86683y3(C73453bf c73453bf, int i) {
        this.A01 = c73453bf;
        this.A00 = i;
    }

    @Override // X.C1YU
    public void A01(C20350xO c20350xO) {
        C20340xN c20340xN = c20350xO.A08;
        float f = (float) ((((c20340xN.A00 - 0.0d) / 1.0d) * 0.5d) + 0.5d);
        C73453bf c73453bf = this.A01;
        c73453bf.A0K.setScaleX(f);
        c73453bf.A0K.setScaleY(f);
        int i = this.A00;
        if (i != 0) {
            float f2 = (float) ((((c20340xN.A00 - 0.0d) / 1.0d) * (i - 0.0d)) + 0.0d);
            int width = c73453bf.A0K.getWidth() >> 2;
            if (c73453bf.A11.A0N()) {
                width = -width;
            }
            c73453bf.A0K.setTranslationX(f2 + width);
        }
    }
}
