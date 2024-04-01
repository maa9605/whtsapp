package X;

import android.graphics.Point;

/* renamed from: X.43B  reason: invalid class name */
/* loaded from: classes3.dex */
public class C43B implements Runnable {
    public final /* synthetic */ AnonymousClass428 A00;
    public final /* synthetic */ C43C A01;
    public final /* synthetic */ float[] A02;

    public C43B(C43C c43c, float[] fArr, AnonymousClass428 anonymousClass428) {
        this.A01 = c43c;
        this.A02 = fArr;
        this.A00 = anonymousClass428;
    }

    @Override // java.lang.Runnable
    public void run() {
        AnonymousClass429 anonymousClass429 = this.A01.A02;
        if (anonymousClass429 == null) {
            return;
        }
        float[] fArr = this.A02;
        if (fArr != null) {
            anonymousClass429.AKY(this.A00, new Point((int) fArr[0], (int) fArr[1]));
        } else {
            anonymousClass429.AKY(this.A00, null);
        }
    }
}
