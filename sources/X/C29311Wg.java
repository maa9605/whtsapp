package X;

import android.graphics.Path;
import android.util.Log;

/* renamed from: X.1Wg  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C29311Wg extends AbstractC18120tD {
    public float A00;
    public float A01;
    public Path A02;
    public final /* synthetic */ C18130tE A03;

    public C29311Wg(C18130tE c18130tE, float f, float f2, Path path) {
        this.A03 = c18130tE;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = path;
    }

    @Override // X.AbstractC18120tD
    public void A00(String str) {
        C18130tE c18130tE = this.A03;
        if (c18130tE.A0k()) {
            Path path = new Path();
            c18130tE.A03.A00.getTextPath(str, 0, str.length(), this.A00, this.A01, path);
            this.A02.addPath(path);
        }
        this.A00 = c18130tE.A03.A00.measureText(str) + this.A00;
    }

    @Override // X.AbstractC18120tD
    public boolean A01(AbstractC20280xA abstractC20280xA) {
        if (abstractC20280xA instanceof C11860iS) {
            Log.w("SVGAndroidRenderer", String.format("Using <textPath> elements in a clip path is not supported.", new Object[0]));
            return false;
        }
        return true;
    }
}
