package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2HF */
/* loaded from: classes2.dex */
public class C2HF {
    public C30R A00;
    public C2HG A01;
    public C2HG A02;
    public final C30Y A03;
    public final List A04;
    public final List A05;

    public C2HF() {
        ArrayList arrayList = new ArrayList();
        this.A04 = arrayList;
        this.A05 = Collections.unmodifiableList(arrayList);
        this.A03 = new C30Y();
    }

    public C2HG A00(PointF pointF) {
        boolean z;
        float f;
        float f2;
        float f3;
        List list = this.A04;
        for (int size = list.size() - 1; size >= 0; size--) {
            C2HG c2hg = (C2HG) list.get(size);
            if (!(c2hg instanceof C67833Ha)) {
                float f4 = pointF.x;
                float f5 = pointF.y;
                if (c2hg instanceof C67853Hc) {
                    RectF rectF = c2hg.A03;
                    z = false;
                    if (rectF.contains(f4, f5)) {
                        float centerX = f4 - rectF.centerX();
                        float centerY = f5 - rectF.centerY();
                        float width = rectF.width() / 2.0f;
                        float height = rectF.height() / 2.0f;
                        if (((centerY * centerY) / (height * height)) + ((centerX * centerX) / (width * width)) <= 1.0f) {
                            z = true;
                        }
                    }
                } else if (!(c2hg instanceof C3HV)) {
                    RectF rectF2 = c2hg.A03;
                    float centerX2 = rectF2.centerX();
                    float centerY2 = rectF2.centerY();
                    Matrix matrix = new Matrix();
                    float[] fArr = {f4, f5};
                    matrix.setRotate(-c2hg.A00, centerX2, centerY2);
                    matrix.mapPoints(fArr);
                    z = rectF2.contains(fArr[0], fArr[1]);
                } else {
                    RectF rectF3 = c2hg.A03;
                    float centerX3 = rectF3.centerX();
                    float centerY3 = rectF3.centerY();
                    Matrix matrix2 = new Matrix();
                    float[] fArr2 = {f4, f5};
                    matrix2.setRotate(-c2hg.A00, centerX3, centerY3);
                    matrix2.mapPoints(fArr2);
                    z = false;
                    if (rectF3.contains(fArr2[0], fArr2[1])) {
                        float f6 = rectF3.left;
                        float f7 = rectF3.bottom;
                        float f8 = rectF3.right;
                        float f9 = rectF3.top - f7;
                        float f10 = f8 - f6;
                        if (Math.abs(((f8 * f7) + ((f * f9) - (f2 * f10))) - (f3 * f6)) / Math.sqrt((f10 * f10) + (f9 * f9)) < C2HG.A07) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    return c2hg;
                }
            }
        }
        return null;
    }

    public void A01() {
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        this.A04.clear();
        this.A03.A00.clear();
    }

    public void A02(C2HG c2hg) {
        List<C2HG> list = this.A04;
        list.add(c2hg);
        this.A01 = c2hg;
        for (C2HG c2hg2 : list) {
            c2hg2.A04();
        }
        this.A03.A00.add(new C67903Hh(c2hg));
        this.A02 = null;
        this.A00 = null;
    }

    public void A03(C2HG c2hg) {
        List list = this.A04;
        int indexOf = list.indexOf(c2hg);
        if (indexOf == -1) {
            return;
        }
        this.A03.A00.add(new C67923Hj(c2hg, indexOf));
        list.remove(c2hg);
        if (c2hg == this.A01) {
            this.A01 = null;
        }
    }

    public boolean A04() {
        boolean z;
        for (C2HG c2hg : this.A04) {
            if (c2hg instanceof C2HH) {
                z = true;
                continue;
            } else if (c2hg instanceof C2HJ) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
