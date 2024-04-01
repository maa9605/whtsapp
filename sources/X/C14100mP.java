package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.0mP  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14100mP {
    public Rect A03;
    public final Bitmap A04;
    public final List A06 = new ArrayList();
    public int A00 = 16;
    public int A01 = 12544;
    public int A02 = -1;
    public final List A05 = new ArrayList();

    public C14100mP(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            this.A05.add(C14140mT.A05);
            this.A04 = bitmap;
            this.A06.add(C14150mU.A07);
            this.A06.add(C14150mU.A09);
            this.A06.add(C14150mU.A05);
            this.A06.add(C14150mU.A06);
            this.A06.add(C14150mU.A08);
            this.A06.add(C14150mU.A04);
            return;
        }
        throw new IllegalArgumentException("Bitmap is not valid");
    }

    public C14140mT A00() {
        int i;
        char c;
        float f;
        float f2;
        Bitmap bitmap = this.A04;
        char c2 = 0;
        if (bitmap != null) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            if (height > 12544) {
                double sqrt = Math.sqrt(12544 / height);
                if (sqrt > 0.0d) {
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * sqrt), (int) Math.ceil(bitmap.getHeight() * sqrt), false);
                }
            }
            Rect rect = this.A03;
            if (bitmap != bitmap && rect != null) {
                double width = bitmap.getWidth() / bitmap.getWidth();
                rect.left = (int) Math.floor(rect.left * width);
                rect.top = (int) Math.floor(rect.top * width);
                rect.right = Math.min((int) Math.ceil(rect.right * width), bitmap.getWidth());
                rect.bottom = Math.min((int) Math.ceil(rect.bottom * width), bitmap.getHeight());
            }
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            int[] iArr = new int[width2 * height2];
            bitmap.getPixels(iArr, 0, width2, 0, 0, width2, height2);
            Rect rect2 = this.A03;
            if (rect2 != null) {
                int width3 = rect2.width();
                int height3 = this.A03.height();
                int[] iArr2 = new int[width3 * height3];
                for (int i2 = 0; i2 < height3; i2++) {
                    Rect rect3 = this.A03;
                    System.arraycopy(iArr, ((rect3.top + i2) * width2) + rect3.left, iArr2, i2 * width3, width3);
                }
                iArr = iArr2;
            }
            List list = this.A05;
            C14080mN c14080mN = new C14080mN(iArr, list.isEmpty() ? null : (InterfaceC14110mQ[]) list.toArray(new InterfaceC14110mQ[list.size()]));
            if (bitmap != bitmap) {
                bitmap.recycle();
            }
            C14140mT c14140mT = new C14140mT(c14080mN.A00, this.A06);
            List list2 = c14140mT.A03;
            int size = list2.size();
            for (int i3 = 0; i3 < size; i3++) {
                C14150mU c14150mU = (C14150mU) list2.get(i3);
                int length = c14150mU.A03.length;
                float f3 = 0.0f;
                for (int i4 = 0; i4 < length; i4++) {
                    float f4 = c14150mU.A03[i4];
                    if (f4 > 0.0f) {
                        f3 += f4;
                    }
                }
                if (f3 != 0.0f) {
                    int length2 = c14150mU.A03.length;
                    for (int i5 = 0; i5 < length2; i5++) {
                        float[] fArr = c14150mU.A03;
                        if (fArr[i5] > 0.0f) {
                            fArr[i5] = fArr[i5] / f3;
                        }
                    }
                }
                Map map = c14140mT.A04;
                List list3 = c14140mT.A02;
                int size2 = list3.size();
                int i6 = 0;
                C14130mS c14130mS = null;
                float f5 = 0.0f;
                while (i6 < size2) {
                    C14130mS c14130mS2 = (C14130mS) list3.get(i6);
                    float[] A01 = c14130mS2.A01();
                    float f6 = A01[1];
                    float[] fArr2 = c14150mU.A02;
                    if (f6 >= fArr2[c2] && A01[1] <= fArr2[2]) {
                        float f7 = A01[2];
                        float[] fArr3 = c14150mU.A01;
                        if (f7 >= fArr3[c2] && A01[2] <= fArr3[2] && !c14140mT.A00.get(c14130mS2.A08)) {
                            float[] A012 = c14130mS2.A01();
                            C14130mS c14130mS3 = c14140mT.A01;
                            if (c14130mS3 != null) {
                                i = c14130mS3.A06;
                            } else {
                                i = 1;
                            }
                            float[] fArr4 = c14150mU.A03;
                            if (fArr4[c2] > 0.0f) {
                                c = 1;
                                f = (1.0f - Math.abs(A012[1] - c14150mU.A02[1])) * fArr4[c2];
                            } else {
                                c = 1;
                                f = 0.0f;
                            }
                            float[] fArr5 = c14150mU.A03;
                            if (fArr5[c] > 0.0f) {
                                f2 = (1.0f - Math.abs(A012[2] - c14150mU.A01[c])) * fArr5[c];
                            } else {
                                f2 = 0.0f;
                            }
                            float[] fArr6 = c14150mU.A03;
                            float f8 = f + f2 + (fArr6[2] > 0.0f ? (c14130mS2.A06 / i) * fArr6[2] : 0.0f);
                            if (c14130mS == null || f8 > f5) {
                                f5 = f8;
                                c14130mS = c14130mS2;
                            }
                        }
                    }
                    i6++;
                    c2 = 0;
                }
                if (c14130mS != null) {
                    c14140mT.A00.append(c14130mS.A08, true);
                }
                map.put(c14150mU, c14130mS);
            }
            c14140mT.A00.clear();
            return c14140mT;
        }
        throw new AssertionError();
    }

    public void A01(int i, int i2, int i3, int i4) {
        Bitmap bitmap = this.A04;
        if (bitmap != null) {
            Rect rect = this.A03;
            if (rect == null) {
                rect = new Rect();
                this.A03 = rect;
            }
            rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
            if (!this.A03.intersect(i, i2, i3, i4)) {
                throw new IllegalArgumentException("The given region must intersect with the Bitmap's dimensions.");
            }
        }
    }
}
