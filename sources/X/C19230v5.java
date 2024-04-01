package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.drawee.drawable.DrawableProperties;

/* renamed from: X.0v5 */
/* loaded from: classes.dex */
public class C19230v5 extends Drawable implements Animatable {
    public static final C19240v6 A0G = new Object() { // from class: X.0v6
    };
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public DrawableProperties A09;
    public C1XV A0A;
    public C19250v7 A0B;
    public final Runnable A0C;
    public volatile InterfaceC19220v4 A0D;
    public volatile C19240v6 A0E;
    public volatile boolean A0F;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public C19230v5() {
        this(null);
    }

    public C19230v5(C1XV c1xv) {
        this.A04 = 8L;
        this.A0E = A0G;
        this.A0D = null;
        this.A0C = new Runnable() { // from class: X.0v3
            {
                C19230v5.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                C19230v5 c19230v5 = C19230v5.this;
                c19230v5.unscheduleSelf(c19230v5.A0C);
                c19230v5.invalidateSelf();
            }
        };
        this.A0A = c1xv;
        this.A0B = new C19250v7(c1xv);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        long max;
        InterfaceC19190v0 interfaceC19190v0;
        int i;
        if (this.A0A != null && this.A0B != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (this.A0F) {
                max = (uptimeMillis - this.A08) + 0;
            } else {
                max = Math.max(this.A05, 0L);
            }
            C19250v7 c19250v7 = this.A0B;
            long A00 = c19250v7.A00();
            if (A00 == 0) {
                int i2 = 0;
                long j = 0;
                do {
                    j += c19250v7.A01.AAI(i2);
                    i2++;
                } while (0 >= j);
                i = i2 - 1;
            } else {
                if (c19250v7.A01.getLoopCount() == 0 || max / A00 < interfaceC19190v0.getLoopCount()) {
                    int i3 = 0;
                    long j2 = 0;
                    do {
                        j2 += interfaceC19190v0.AAI(i3);
                        i3++;
                    } while (max % A00 >= j2);
                    i = i3 - 1;
                } else {
                    i = -1;
                }
            }
            if (i == -1) {
                i = this.A0A.getFrameCount() - 1;
                if (this.A0E != null) {
                    this.A0F = false;
                } else {
                    throw null;
                }
            } else if (i == 0 && this.A01 != -1 && uptimeMillis >= this.A03 && this.A0E == null) {
                throw null;
            }
            if (!this.A0A.A7T(this, canvas, i)) {
                this.A00++;
            } else if (this.A0E != null) {
                this.A01 = i;
            } else {
                throw null;
            }
            long uptimeMillis2 = SystemClock.uptimeMillis();
            if (this.A0F) {
                C19250v7 c19250v72 = this.A0B;
                long j3 = uptimeMillis2 - this.A08;
                long A002 = c19250v72.A00();
                if (A002 != 0) {
                    InterfaceC19190v0 interfaceC19190v02 = c19250v72.A01;
                    if (interfaceC19190v02.getLoopCount() == 0 || j3 / c19250v72.A00() < interfaceC19190v02.getLoopCount()) {
                        long j4 = j3 % A002;
                        int frameCount = interfaceC19190v02.getFrameCount();
                        long j5 = 0;
                        for (int i4 = 0; i4 < frameCount && j5 <= j4; i4++) {
                            j5 += interfaceC19190v02.AAI(i4);
                        }
                        long j6 = (j5 - j4) + j3;
                        if (j6 != -1) {
                            long j7 = this.A08 + j6 + this.A04;
                            this.A03 = j7;
                            scheduleSelf(this.A0C, j7);
                        }
                    }
                }
                if (this.A0E != null) {
                    this.A0F = false;
                } else {
                    throw null;
                }
            }
            this.A05 = max;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        C1XV c1xv = this.A0A;
        if (c1xv == null) {
            return super.getIntrinsicHeight();
        }
        return c1xv.AAf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        C1XV c1xv = this.A0A;
        if (c1xv == null) {
            return super.getIntrinsicWidth();
        }
        return c1xv.AAg();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.A0F;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        C1XV c1xv = this.A0A;
        if (c1xv != null) {
            c1xv.ASn(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        if (this.A0F) {
            return false;
        }
        long j = i;
        if (this.A05 != j) {
            this.A05 = j;
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        DrawableProperties drawableProperties = this.A09;
        if (drawableProperties == null) {
            drawableProperties = new DrawableProperties();
            this.A09 = drawableProperties;
        }
        drawableProperties.setAlpha(i);
        C1XV c1xv = this.A0A;
        if (c1xv != null) {
            c1xv.ASh(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        DrawableProperties drawableProperties = this.A09;
        if (drawableProperties == null) {
            drawableProperties = new DrawableProperties();
            this.A09 = drawableProperties;
        }
        drawableProperties.setColorFilter(colorFilter);
        C1XV c1xv = this.A0A;
        if (c1xv != null) {
            c1xv.ASq(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        C1XV c1xv;
        if (this.A0F || (c1xv = this.A0A) == null || c1xv.getFrameCount() <= 1) {
            return;
        }
        this.A0F = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = uptimeMillis - this.A07;
        this.A08 = j;
        this.A03 = j;
        this.A05 = uptimeMillis - this.A06;
        this.A01 = this.A02;
        invalidateSelf();
        if (this.A0E == null) {
            throw null;
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.A0F) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.A07 = uptimeMillis - this.A08;
            this.A06 = uptimeMillis - this.A05;
            this.A02 = this.A01;
            this.A0F = false;
            this.A08 = 0L;
            this.A03 = 0L;
            this.A05 = -1L;
            this.A01 = -1;
            unscheduleSelf(this.A0C);
            if (this.A0E == null) {
                throw null;
            }
        }
    }
}
