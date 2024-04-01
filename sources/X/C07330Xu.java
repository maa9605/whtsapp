package X;

import android.graphics.Matrix;
import java.util.ArrayList;

/* renamed from: X.0Xu */
/* loaded from: classes.dex */
public class C07330Xu extends AbstractC07340Xv {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public int A07;
    public String A08;
    public int[] A09;
    public final Matrix A0A;
    public final Matrix A0B;
    public final ArrayList A0C;

    public C07330Xu() {
        super(null);
        this.A0B = new Matrix();
        this.A0C = new ArrayList();
        this.A02 = 0.0f;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A03 = 1.0f;
        this.A04 = 1.0f;
        this.A05 = 0.0f;
        this.A06 = 0.0f;
        this.A0A = new Matrix();
        this.A08 = null;
    }

    public C07330Xu(C07330Xu c07330Xu, C006702y c006702y) {
        super(null);
        AbstractC07360Xx c07380Xz;
        this.A0B = new Matrix();
        this.A0C = new ArrayList();
        this.A02 = 0.0f;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A03 = 1.0f;
        this.A04 = 1.0f;
        this.A05 = 0.0f;
        this.A06 = 0.0f;
        this.A0A = new Matrix();
        this.A08 = null;
        this.A02 = c07330Xu.A02;
        this.A00 = c07330Xu.A00;
        this.A01 = c07330Xu.A01;
        this.A03 = c07330Xu.A03;
        this.A04 = c07330Xu.A04;
        this.A05 = c07330Xu.A05;
        this.A06 = c07330Xu.A06;
        this.A09 = c07330Xu.A09;
        String str = c07330Xu.A08;
        this.A08 = str;
        this.A07 = c07330Xu.A07;
        if (str != null) {
            c006702y.put(str, this);
        }
        this.A0A.set(c07330Xu.A0A);
        ArrayList arrayList = c07330Xu.A0C;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C07330Xu) {
                this.A0C.add(new C07330Xu((C07330Xu) obj, c006702y));
            } else {
                if (obj instanceof C07350Xw) {
                    c07380Xz = new C07350Xw((C07350Xw) obj);
                } else if (obj instanceof C07380Xz) {
                    c07380Xz = new C07380Xz((C07380Xz) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.A0C.add(c07380Xz);
                Object obj2 = c07380Xz.A02;
                if (obj2 != null) {
                    c006702y.put(obj2, c07380Xz);
                }
            }
        }
    }

    @Override // X.AbstractC07340Xv
    public boolean A00() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A0C;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC07340Xv) arrayList.get(i)).A00()) {
                return true;
            }
            i++;
        }
    }

    @Override // X.AbstractC07340Xv
    public boolean A01(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.A0C;
            if (i >= arrayList.size()) {
                return z;
            }
            z |= ((AbstractC07340Xv) arrayList.get(i)).A01(iArr);
            i++;
        }
    }

    public final void A02() {
        Matrix matrix = this.A0A;
        matrix.reset();
        matrix.postTranslate(-this.A00, -this.A01);
        matrix.postScale(this.A03, this.A04);
        matrix.postRotate(this.A02, 0.0f, 0.0f);
        matrix.postTranslate(this.A05 + this.A00, this.A06 + this.A01);
    }

    public String getGroupName() {
        return this.A08;
    }

    public Matrix getLocalMatrix() {
        return this.A0A;
    }

    public float getPivotX() {
        return this.A00;
    }

    public float getPivotY() {
        return this.A01;
    }

    public float getRotation() {
        return this.A02;
    }

    public float getScaleX() {
        return this.A03;
    }

    public float getScaleY() {
        return this.A04;
    }

    public float getTranslateX() {
        return this.A05;
    }

    public float getTranslateY() {
        return this.A06;
    }

    public void setPivotX(float f) {
        if (f != this.A00) {
            this.A00 = f;
            A02();
        }
    }

    public void setPivotY(float f) {
        if (f != this.A01) {
            this.A01 = f;
            A02();
        }
    }

    public void setRotation(float f) {
        if (f != this.A02) {
            this.A02 = f;
            A02();
        }
    }

    public void setScaleX(float f) {
        if (f != this.A03) {
            this.A03 = f;
            A02();
        }
    }

    public void setScaleY(float f) {
        if (f != this.A04) {
            this.A04 = f;
            A02();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.A05) {
            this.A05 = f;
            A02();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.A06) {
            this.A06 = f;
            A02();
        }
    }
}
