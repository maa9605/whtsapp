package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import com.facebook.animated.webp.WebPImage;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.1yX */
/* loaded from: classes2.dex */
public class C44111yX {
    public int A00;
    public int A01;
    public long A02;
    public Bitmap A03;
    public Bitmap A04;
    public Canvas A05;
    public boolean A06;
    public final int A07;
    public final int A08;
    public final Bitmap A09;
    public final C018508q A0A;
    public final C3YB A0B;
    public final C44091yV A0C;
    public final C3YF A0D;
    public volatile boolean A0G;
    public final Set A0F = Collections.newSetFromMap(new WeakHashMap());
    public final Runnable A0E = new RunnableEBaseShape7S0100000_I0_7(this);

    public C44111yX(String str, Bitmap bitmap, WebPImage webPImage, C018508q c018508q, C44091yV c44091yV, int i, int i2) {
        this.A0A = c018508q;
        this.A0C = c44091yV;
        this.A09 = bitmap;
        this.A0D = new C3YF(webPImage.getFrameCount(), webPImage.getFrameDurations());
        this.A08 = i;
        this.A07 = i2;
        this.A0B = new C3YB(str, bitmap, webPImage, i, i2);
    }

    public void A00() {
        C3YF c3yf;
        int i;
        if (this.A0G && (i = (c3yf = this.A0D).A00) > 1) {
            Set set = this.A0F;
            if (set.size() != 0) {
                long uptimeMillis = SystemClock.uptimeMillis();
                long j = this.A02 + this.A01;
                if (uptimeMillis >= j) {
                    Bitmap bitmap = this.A03;
                    if (bitmap != null) {
                        Bitmap bitmap2 = this.A04;
                        if (bitmap2 != null) {
                            bitmap2.eraseColor(0);
                        }
                        if (bitmap.isRecycled()) {
                            Log.e("AnimatedSticker/StickerAnimationController/updateFrame/was trying to use a recycled bitmap");
                        } else {
                            if (this.A04 == null) {
                                Bitmap createBitmap = Bitmap.createBitmap(this.A08, this.A07, Bitmap.Config.ARGB_8888);
                                this.A04 = createBitmap;
                                this.A05 = new Canvas(createBitmap);
                            }
                            Canvas canvas = this.A05;
                            if (canvas == null) {
                                canvas = new Canvas(this.A04);
                                this.A05 = canvas;
                            }
                            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                        }
                        this.A03 = null;
                    }
                    ArrayList arrayList = new ArrayList(set);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC44131yZ) it.next()).AKg(this.A00);
                    }
                    if (this.A06) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC44131yZ) it2.next()).AHA();
                        }
                        this.A06 = false;
                    }
                    int i2 = (this.A00 + 1) % i;
                    this.A00 = i2;
                    if (i2 == 0) {
                        this.A06 = true;
                    }
                    this.A02 = uptimeMillis;
                    int i3 = c3yf.A01[i2];
                    this.A01 = i3;
                    long j2 = uptimeMillis + i3;
                    C44091yV c44091yV = this.A0C;
                    C3YB c3yb = this.A0B;
                    if (c44091yV != null) {
                        C3YD c3yd = new C3YD(c3yb, i2, j2, this);
                        C44161yc c44161yc = c44091yV.A04;
                        synchronized (c44161yc) {
                            PriorityQueue priorityQueue = c44161yc.A01;
                            Iterator it3 = priorityQueue.iterator();
                            while (it3.hasNext()) {
                                C3YD c3yd2 = (C3YD) it3.next();
                                if (c3yd2.A00 >= c3yd.A00 && c3yd2.A02 == c3yd.A02 && c3yd.A01 > c3yd2.A01) {
                                    it3.remove();
                                }
                            }
                            priorityQueue.add(c3yd);
                            c44161yc.notifyAll();
                        }
                        if (c44091yV.A00 == null) {
                            C44151yb c44151yb = new C44151yb(c44091yV.A02, c44091yV.A01, c44161yc, c44091yV.A03, new C82853rB(c44091yV));
                            c44091yV.A00 = c44151yb;
                            synchronized (c44161yc) {
                                c44161yc.A00 = c44151yb;
                            }
                            c44091yV.A00.start();
                            return;
                        }
                        return;
                    }
                    throw null;
                }
                this.A0A.A02.postDelayed(this.A0E, j - uptimeMillis);
                return;
            }
        }
        this.A0G = false;
        Bitmap bitmap3 = this.A04;
        if (bitmap3 != null) {
            bitmap3.recycle();
            this.A04 = null;
        }
        this.A03 = null;
    }

    public void finalize() {
        this.A0B.finalize();
        Bitmap bitmap = this.A04;
        if (bitmap != null) {
            bitmap.recycle();
            this.A04 = null;
        }
        super.finalize();
    }
}
