package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.1Wh  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C29321Wh extends AbstractC18120tD {
    public float A00;
    public float A01;
    public RectF A02 = new RectF();
    public final /* synthetic */ C18130tE A03;

    public C29321Wh(C18130tE c18130tE, float f, float f2) {
        this.A03 = c18130tE;
        this.A00 = f;
        this.A01 = f2;
    }

    @Override // X.AbstractC18120tD
    public void A00(String str) {
        C18130tE c18130tE = this.A03;
        if (c18130tE.A0k()) {
            Rect rect = new Rect();
            c18130tE.A03.A00.getTextBounds(str, 0, str.length(), rect);
            RectF rectF = new RectF(rect);
            rectF.offset(this.A00, this.A01);
            this.A02.union(rectF);
        }
        this.A00 = c18130tE.A03.A00.measureText(str) + this.A00;
    }

    @Override // X.AbstractC18120tD
    public boolean A01(AbstractC20280xA abstractC20280xA) {
        if (abstractC20280xA instanceof C11860iS) {
            C11860iS c11860iS = (C11860iS) abstractC20280xA;
            C18050t6 A04 = ((C18050t6) abstractC20280xA).A01.A04(c11860iS.A02);
            if (A04 == null) {
                C18130tE.A06("TextPath path reference '%s' not found", c11860iS.A02);
                return false;
            }
            C11920iY c11920iY = (C11920iY) A04;
            Path path = new C29291We(c11920iY.A00).A02;
            Matrix matrix = ((AbstractC20600xn) c11920iY).A00;
            if (matrix != null) {
                path.transform(matrix);
            }
            RectF rectF = new RectF();
            path.computeBounds(rectF, true);
            this.A02.union(rectF);
            return false;
        }
        return true;
    }
}
