package X;

import android.graphics.Bitmap;

/* renamed from: X.1Xe */
/* loaded from: classes.dex */
public class C1Xe {
    public C29571Xk A00;
    public C19350vI A01;
    public final C0v1 A02;
    public final C0vG A03;

    public C1Xe(C0v1 c0v1, C29571Xk c29571Xk) {
        C0vG c0vG = new C0vG() { // from class: X.1Xd
            {
                C1Xe.this = this;
            }

            @Override // X.C0vG
            public AbstractC19030uj A8f(int i) {
                return C1Xe.this.A02.A8g(i);
            }
        };
        this.A03 = c0vG;
        this.A02 = c0v1;
        this.A00 = c29571Xk;
        this.A01 = new C19350vI(c29571Xk, c0vG);
    }

    public boolean A00(int i, Bitmap bitmap) {
        try {
            this.A01.A00(i, bitmap);
            return true;
        } catch (IllegalStateException e) {
            C18960uc.A00.A01(6, C1Xe.class.getSimpleName(), String.format(null, "Rendering of frame unsuccessful. Frame number: %d", Integer.valueOf(i)), e);
            return false;
        }
    }
}
