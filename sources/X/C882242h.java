package X;

import android.graphics.Matrix;
import android.graphics.Point;
import android.hardware.Camera;

/* renamed from: X.42h */
/* loaded from: classes3.dex */
public class C882242h {
    public Camera A00;
    public AnonymousClass429 A01;
    public C881842d A02;
    public C44B A03;
    public final C885343m A04;
    public final C44I A05;
    public volatile boolean A06;
    public volatile boolean A07;
    public volatile boolean A08;

    public C882242h(C44I c44i, C885343m c885343m) {
        this.A05 = c44i;
        this.A04 = c885343m;
    }

    public void A00(final AnonymousClass429 anonymousClass429, final AnonymousClass428 anonymousClass428, final Point point) {
        if (anonymousClass429 == null) {
            return;
        }
        C881842d c881842d = this.A02;
        if (point != null && c881842d != null) {
            float[] fArr = {point.x, point.y};
            if (c881842d.A00 != null) {
                Matrix matrix = new Matrix();
                c881842d.A00.invert(matrix);
                matrix.mapPoints(fArr);
            }
            point.set((int) fArr[0], (int) fArr[1]);
        }
        C44J.A00(new Runnable() { // from class: X.42f
            @Override // java.lang.Runnable
            public void run() {
                anonymousClass429.AKY(anonymousClass428, point);
            }
        });
    }
}
