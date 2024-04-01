package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1yY */
/* loaded from: classes2.dex */
public class C44121yY extends Drawable implements Animatable, InterfaceC44131yZ {
    public static int A0B = 4000;
    public int A00;
    public int A01;
    public long A02;
    public Paint A03;
    public C01B A04;
    public C3YE A05;
    public boolean A06;
    public boolean A07;
    public final C44111yX A09;
    public final List A0A = new ArrayList();
    public boolean A08 = false;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public C44121yY(C44111yX c44111yX, C01B c01b) {
        this.A09 = c44111yX;
        this.A04 = c01b;
        if (c01b.A0E(C01C.A1g)) {
            A0B = SearchActionVerificationClientService.NOTIFICATION_ID;
        }
    }

    @Override // X.InterfaceC44131yZ
    public void AHA() {
        if (!this.A06) {
            int i = this.A00 + 1;
            this.A00 = i;
            if (i >= (this.A08 ? this.A01 + 1 : this.A01)) {
                stop();
            } else if (SystemClock.uptimeMillis() - this.A02 <= A0B) {
            } else {
                stop();
            }
        }
    }

    @Override // X.InterfaceC44131yZ
    public void AKg(int i) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C44111yX c44111yX;
        Bitmap bitmap;
        if (!this.A07) {
            c44111yX = this.A09;
            bitmap = c44111yX.A09;
        } else {
            c44111yX = this.A09;
            bitmap = c44111yX.A04;
        }
        if (bitmap == null) {
            bitmap = c44111yX.A09;
        }
        canvas.drawBitmap(bitmap, (Rect) null, getBounds(), this.A03);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.A07;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.A02 = SystemClock.uptimeMillis();
        if (!this.A07 || this.A04.A0E(C01C.A1g)) {
            this.A00 = 0;
            this.A07 = true;
            C44111yX c44111yX = this.A09;
            int i = c44111yX.A00;
            int i2 = c44111yX.A0D.A00;
            this.A08 = i > Math.max(i2 / 5, 1);
            c44111yX.A0F.add(this);
            if (!c44111yX.A0G && i2 > 1) {
                c44111yX.A0G = true;
                c44111yX.A00();
            }
            Iterator it = this.A0A.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.A07) {
            this.A07 = false;
            C44111yX c44111yX = this.A09;
            Set set = c44111yX.A0F;
            set.remove(this);
            if (set.isEmpty()) {
                c44111yX.A0G = false;
                c44111yX.A00 = 0;
                C3YB c3yb = c44111yX.A0B;
                synchronized (c3yb) {
                    c3yb.A00 = 0;
                    c3yb.A02 = null;
                    Bitmap bitmap = c3yb.A01;
                    if (bitmap != null) {
                        c3yb.A03 = null;
                        bitmap.recycle();
                        c3yb.A01 = null;
                    }
                }
                c44111yX.A06 = false;
                Bitmap bitmap2 = c44111yX.A04;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    c44111yX.A04 = null;
                }
                c44111yX.A03 = null;
                C018508q c018508q = c44111yX.A0A;
                c018508q.A02.removeCallbacks(c44111yX.A0E);
                C44161yc c44161yc = c44111yX.A0C.A04;
                synchronized (c44161yc) {
                    Iterator it = c44161yc.A01.iterator();
                    while (it.hasNext()) {
                        if (((C3YD) it.next()).A02 == c3yb) {
                            it.remove();
                        }
                    }
                }
            }
            for (AbstractC09660eW abstractC09660eW : this.A0A) {
                abstractC09660eW.A00(this);
            }
            invalidateSelf();
        }
    }
}
