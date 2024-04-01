package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;

/* renamed from: X.1pU */
/* loaded from: classes.dex */
public class C39051pU implements C1XV {
    public int A00;
    public int A01;
    public Rect A03;
    public final InterfaceC19190v0 A05;
    public final C0v1 A06;
    public final C29501Xa A07;
    public final C29511Xb A08;
    public final C1Xe A09;
    public final AbstractC19380vL A0A;
    public Bitmap.Config A02 = Bitmap.Config.ARGB_8888;
    public final Paint A04 = new Paint(6);

    public C39051pU(AbstractC19380vL abstractC19380vL, C0v1 c0v1, InterfaceC19190v0 interfaceC19190v0, C1Xe c1Xe, C29511Xb c29511Xb, C29501Xa c29501Xa) {
        this.A0A = abstractC19380vL;
        this.A06 = c0v1;
        this.A05 = interfaceC19190v0;
        this.A09 = c1Xe;
        this.A08 = c29511Xb;
        this.A07 = c29501Xa;
        A00();
    }

    public final void A00() {
        C1Xe c1Xe = this.A09;
        int width = c1Xe.A00.A04.getWidth();
        this.A01 = width;
        if (width == -1) {
            Rect rect = this.A03;
            this.A01 = rect == null ? -1 : rect.width();
        }
        int height = c1Xe.A00.A04.getHeight();
        this.A00 = height;
        if (height == -1) {
            Rect rect2 = this.A03;
            this.A00 = rect2 != null ? rect2.height() : -1;
        }
    }

    public final boolean A01(int i, AbstractC19030uj abstractC19030uj, Canvas canvas, int i2) {
        if (AbstractC19030uj.A02(abstractC19030uj)) {
            if (this.A03 == null) {
                canvas.drawBitmap((Bitmap) abstractC19030uj.A04(), 0.0f, 0.0f, this.A04);
            } else {
                canvas.drawBitmap((Bitmap) abstractC19030uj.A04(), (Rect) null, this.A03, this.A04);
            }
            if (i2 != 3) {
                this.A06.AKf(i, abstractC19030uj, i2);
                return true;
            }
            return true;
        }
        return false;
    }

    public final boolean A02(Canvas canvas, int i, int i2) {
        AbstractC19030uj A8g;
        int i3 = 2;
        boolean z = true;
        AutoCloseable autoCloseable = null;
        try {
            if (i2 == 0) {
                A8g = this.A06.A8g(i);
                z = A01(i, A8g, canvas, 0);
                i3 = 1;
            } else if (i2 == 1) {
                A8g = this.A06.A8W(i, this.A01, this.A00);
                if (AbstractC19030uj.A02(A8g)) {
                    if (!this.A09.A00(i, (Bitmap) A8g.A04())) {
                        A8g.close();
                    } else if (A01(i, A8g, canvas, 1)) {
                    }
                }
                z = false;
            } else if (i2 == 2) {
                try {
                    A8g = this.A0A.A00(this.A01, this.A00, this.A02);
                    if (AbstractC19030uj.A02(A8g)) {
                        if (!this.A09.A00(i, (Bitmap) A8g.A04())) {
                            A8g.close();
                        } else if (A01(i, A8g, canvas, 2)) {
                            i3 = 3;
                        }
                    }
                    z = false;
                    i3 = 3;
                } catch (RuntimeException e) {
                    C18960uc.A00.A01(5, C39051pU.class.getSimpleName(), "Failed to create frame bitmap", e);
                    if (0 != 0) {
                        autoCloseable.close();
                    }
                    return false;
                }
            } else if (i2 != 3) {
                if (0 != 0) {
                    autoCloseable.close();
                }
                return false;
            } else {
                A8g = this.A06.AA6(i);
                z = A01(i, A8g, canvas, 3);
                i3 = -1;
            }
            if (A8g != null) {
                A8g.close();
            }
            return (z || i3 == -1) ? z : A02(canvas, i, i3);
        } catch (Throwable th) {
            if (0 != 0) {
                autoCloseable.close();
            }
            throw th;
        }
    }

    @Override // X.C1XV
    public boolean A7T(Drawable drawable, Canvas canvas, int i) {
        C29501Xa c29501Xa;
        boolean A02 = A02(canvas, i, 0);
        C29511Xb c29511Xb = this.A08;
        if (c29511Xb != null && (c29501Xa = this.A07) != null) {
            C0v1 c0v1 = this.A06;
            for (int i2 = 1; i2 <= c29511Xb.A00; i2++) {
                int frameCount = (i + i2) % getFrameCount();
                int hashCode = (hashCode() * 31) + frameCount;
                SparseArray sparseArray = c29501Xa.A01;
                synchronized (sparseArray) {
                    if (sparseArray.get(hashCode) == null) {
                        if (!c0v1.A6T(frameCount)) {
                            Runnable runnable = new Runnable(this, c0v1, frameCount, hashCode) { // from class: X.0v2
                                public final int A00;
                                public final int A01;
                                public final C1XV A02;
                                public final C0v1 A03;

                                {
                                    this.A02 = this;
                                    this.A03 = c0v1;
                                    this.A00 = frameCount;
                                    this.A01 = hashCode;
                                }

                                public final boolean A00(int i3, int i4) {
                                    boolean z;
                                    int i5 = 2;
                                    AbstractC19030uj abstractC19030uj = null;
                                    try {
                                        if (i4 == 1) {
                                            C0v1 c0v12 = this.A03;
                                            C1XV c1xv = this.A02;
                                            abstractC19030uj = c0v12.A8W(i3, c1xv.AAg(), c1xv.AAf());
                                        } else if (i4 != 2) {
                                            if (0 != 0) {
                                                abstractC19030uj.close();
                                            }
                                            return false;
                                        } else {
                                            try {
                                                C29501Xa c29501Xa2 = C29501Xa.this;
                                                AbstractC19380vL abstractC19380vL = c29501Xa2.A03;
                                                C1XV c1xv2 = this.A02;
                                                abstractC19030uj = abstractC19380vL.A00(c1xv2.AAg(), c1xv2.AAf(), c29501Xa2.A00);
                                                i5 = -1;
                                            } catch (RuntimeException e) {
                                                C18960uc.A00.A01(5, C29501Xa.class.getSimpleName(), "Failed to create frame bitmap", e);
                                                if (abstractC19030uj != null) {
                                                    abstractC19030uj.close();
                                                }
                                                return false;
                                            }
                                        }
                                        if (AbstractC19030uj.A02(abstractC19030uj)) {
                                            C29501Xa c29501Xa3 = C29501Xa.this;
                                            if (c29501Xa3.A02.A00(i3, (Bitmap) abstractC19030uj.A04())) {
                                                int i6 = this.A00;
                                                synchronized (c29501Xa3.A01) {
                                                    this.A03.AKe(i6, abstractC19030uj, i4);
                                                }
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                        } else {
                                            z = false;
                                        }
                                        if (abstractC19030uj != null) {
                                            abstractC19030uj.close();
                                        }
                                        return (z || i5 == -1) ? z : A00(i3, i5);
                                    } catch (Throwable th) {
                                        if (abstractC19030uj != null) {
                                            abstractC19030uj.close();
                                        }
                                        throw th;
                                    }
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    try {
                                        C0v1 c0v12 = this.A03;
                                        int i3 = this.A00;
                                        if (c0v12.A6T(i3)) {
                                            SparseArray sparseArray2 = C29501Xa.this.A01;
                                            synchronized (sparseArray2) {
                                                sparseArray2.remove(this.A01);
                                            }
                                            return;
                                        }
                                        if (!A00(i3, 1)) {
                                            C18960uc.A00.A00(6, C29501Xa.class.getSimpleName(), String.format(null, "Could not prepare frame %d.", Integer.valueOf(i3)));
                                        }
                                        SparseArray sparseArray3 = C29501Xa.this.A01;
                                        synchronized (sparseArray3) {
                                            sparseArray3.remove(this.A01);
                                        }
                                    } catch (Throwable th) {
                                        SparseArray sparseArray4 = C29501Xa.this.A01;
                                        synchronized (sparseArray4) {
                                            sparseArray4.remove(this.A01);
                                            throw th;
                                        }
                                    }
                                }
                            };
                            sparseArray.put(hashCode, runnable);
                            c29501Xa.A04.execute(runnable);
                        }
                    }
                }
            }
        }
        return A02;
    }

    @Override // X.InterfaceC19190v0
    public int AAI(int i) {
        return this.A05.AAI(i);
    }

    @Override // X.C1XV
    public int AAf() {
        return this.A00;
    }

    @Override // X.C1XV
    public int AAg() {
        return this.A01;
    }

    @Override // X.C1XV
    public void ASh(int i) {
        this.A04.setAlpha(i);
    }

    @Override // X.C1XV
    public void ASn(Rect rect) {
        this.A03 = rect;
        C1Xe c1Xe = this.A09;
        C29571Xk c29571Xk = c1Xe.A00;
        if (!C29571Xk.A00(c29571Xk.A04, rect).equals(c29571Xk.A03)) {
            c29571Xk = new C29571Xk(c29571Xk.A06, c29571Xk.A05, rect, c29571Xk.A07);
        }
        if (c29571Xk != c1Xe.A00) {
            c1Xe.A00 = c29571Xk;
            c1Xe.A01 = new C19350vI(c29571Xk, c1Xe.A03);
        }
        A00();
    }

    @Override // X.C1XV
    public void ASq(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
    }

    @Override // X.InterfaceC19190v0
    public int getFrameCount() {
        return this.A05.getFrameCount();
    }

    @Override // X.InterfaceC19190v0
    public int getLoopCount() {
        return this.A05.getLoopCount();
    }
}
