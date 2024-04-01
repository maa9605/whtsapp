package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1y0 */
/* loaded from: classes2.dex */
public class C43801y0 {
    public C44221yi A00;
    public final C012005w A02;
    public final C001200o A03;
    public final C002301c A04;
    public final C40081rY A05;
    public final C41491u0 A06;
    public final C43171wy A07;
    public final C43791xz A08;
    public final C43101wr A09;
    public final AtomicInteger A0B = new AtomicInteger();
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final C44201yg A0A = new C44201yg();

    public C43801y0(C001200o c001200o, C012005w c012005w, C40081rY c40081rY, C41491u0 c41491u0, C002301c c002301c, C43101wr c43101wr, C43791xz c43791xz, C43171wy c43171wy) {
        this.A03 = c001200o;
        this.A02 = c012005w;
        this.A05 = c40081rY;
        this.A06 = c41491u0;
        this.A04 = c002301c;
        this.A09 = c43101wr;
        this.A08 = c43791xz;
        this.A07 = c43171wy;
    }

    public static Bitmap A00(C43801y0 c43801y0, C09H c09h, File file, C44211yh c44211yh, int[] iArr) {
        int i;
        InputStream A02;
        int ADA = c44211yh.A02.ADA();
        float f = c44211yh.A00.getContext().getResources().getDisplayMetrics().density;
        double sqrt = f < 1.0f ? 1.0d : Math.sqrt(f - 0.75f) + 0.5d;
        if (ADA == 0) {
            i = Integer.MAX_VALUE;
            Log.e("MessageThumbsThread/ getting thumb for 0 size");
        } else {
            i = (int) (ADA / sqrt);
        }
        long j = 0;
        boolean z = false;
        if (iArr != null) {
            C04140Is A05 = c43801y0.A06.A05(c09h.A0I, false, false);
            if (A05 != null) {
                long j2 = A05.A09;
                for (int i2 = 0; i2 < iArr.length && iArr[i2] + j < j2; i2++) {
                    j += iArr[i2];
                }
                if (j <= iArr[0]) {
                    r11 = c44211yh.A05 ? 16 : 4;
                    z = true;
                }
            }
            return null;
        }
        try {
            if (iArr == null) {
                A02 = new FileInputStream(file);
            } else {
                A02 = C43141wv.A02(file, j);
            }
            try {
                C0DI A0M = C002701i.A0M(A02, new C0DH(i, 2));
                Bitmap bitmap = A0M.A02;
                if (c09h.A06 == 0 && c09h.A08 == 0 && A0M.A00 != 0 && A0M.A01 != 0) {
                    C0DD.A0P(file, c09h);
                }
                if (bitmap != null) {
                    Matrix A09 = C0DD.A09(C0DD.A04(file.getAbsolutePath()));
                    if (A09 != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), A09, true);
                        if (bitmap != createBitmap) {
                            bitmap.recycle();
                        }
                        bitmap = createBitmap;
                    }
                    if (z && bitmap != null) {
                        FilterUtils.blurNative(bitmap, r11, 2);
                    }
                }
                return bitmap;
            } finally {
            }
        } catch (IOException unused) {
        } catch (OutOfMemoryError e) {
            if (!C0JO.A00()) {
                Log.e("MessageThumbsThread/bitmap-decode/OutOfMemory avoided");
            } else {
                throw e;
            }
        }
    }

    public synchronized void A01(AnonymousClass092 anonymousClass092, View view, InterfaceC43821y3 interfaceC43821y3, InterfaceC43851y6 interfaceC43851y6, Object obj, boolean z) {
        LinkedBlockingDeque linkedBlockingDeque = this.A0A.A00;
        Iterator it = linkedBlockingDeque.iterator();
        while (it.hasNext()) {
            C44211yh c44211yh = (C44211yh) it.next();
            if (c44211yh.A00 == view) {
                linkedBlockingDeque.remove(c44211yh);
            }
        }
        Iterator it2 = linkedBlockingDeque.iterator();
        while (it2.hasNext()) {
            C44211yh c44211yh2 = (C44211yh) it2.next();
            if (c44211yh2.A01.A0n.equals(anonymousClass092.A0n) && c44211yh2.A04.equals(obj) && c44211yh2.A00 == view) {
                return;
            }
        }
        if (anonymousClass092 instanceof AnonymousClass097) {
            AnonymousClass097 anonymousClass097 = (AnonymousClass097) anonymousClass092;
            C09H c09h = anonymousClass097.A02;
            if (c09h == null) {
                return;
            }
            if (c09h.A0P && c09h.A0F != null && !c09h.A03()) {
                if (!c09h.A0X) {
                    c09h.A0X = true;
                    this.A01.post(new RunnableEBaseShape7S0100000_I0_7(interfaceC43851y6, 27));
                }
            } else {
                c09h.A0X = false;
            }
            if (c09h.A0F != null || (anonymousClass097 instanceof C04040Ie) || (anonymousClass097 instanceof AnonymousClass095) || (anonymousClass097 instanceof C0JP)) {
                if (anonymousClass097 instanceof C09C) {
                    return;
                }
                linkedBlockingDeque.offer(new C44211yh(anonymousClass097, view, interfaceC43821y3, interfaceC43851y6, obj, z));
                if (this.A00 == null) {
                    C44221yi c44221yi = new C44221yi(this, this.A02, this.A05, this.A04, this.A09);
                    this.A00 = c44221yi;
                    c44221yi.start();
                }
            }
        }
    }
}
