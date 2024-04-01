package X;

import android.graphics.Bitmap;
import android.os.Process;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.PriorityQueue;

/* renamed from: X.1yb */
/* loaded from: classes2.dex */
public final class C44151yb extends Thread {
    public final C018508q A00;
    public final C003701t A01;
    public final C44071yT A02;
    public final C44161yc A03;
    public final C3YC A04 = new C3YC();
    public volatile C82853rB A05;
    public volatile boolean A06;

    public C44151yb(C003701t c003701t, C018508q c018508q, C44161yc c44161yc, C44071yT c44071yT, C82853rB c82853rB) {
        this.A01 = c003701t;
        this.A00 = c018508q;
        this.A03 = c44161yc;
        this.A02 = c44071yT;
        this.A05 = c82853rB;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        C3YD c3yd;
        Process.setThreadPriority(1);
        Bitmap bitmap = null;
        while (!this.A06) {
            try {
                C44161yc c44161yc = this.A03;
                synchronized (c44161yc) {
                    PriorityQueue priorityQueue = c44161yc.A01;
                    if (priorityQueue.isEmpty()) {
                        c44161yc.wait(5000L);
                    }
                    if (!priorityQueue.isEmpty()) {
                        c3yd = (C3YD) priorityQueue.remove();
                    } else {
                        C44151yb c44151yb = c44161yc.A00;
                        if (c44151yb != null) {
                            c44151yb.A06 = true;
                            C44091yV c44091yV = c44151yb.A05.A00;
                            c44091yV.A00 = null;
                            C44161yc c44161yc2 = c44091yV.A04;
                            synchronized (c44161yc2) {
                                c44161yc2.A00 = null;
                            }
                            c44151yb.interrupt();
                        }
                        c3yd = null;
                    }
                }
                if (this.A01.A0C(276)) {
                    if (c3yd != null) {
                        C3YC c3yc = this.A04;
                        int i = c3yd.A02.A06;
                        synchronized (c3yc) {
                            HashMap hashMap = c3yc.A00;
                            Integer valueOf = Integer.valueOf(i);
                            if (hashMap.containsKey(valueOf)) {
                                bitmap = (Bitmap) c3yc.A00.get(valueOf);
                            } else {
                                Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
                                c3yc.A00.put(valueOf, createBitmap);
                                bitmap = createBitmap;
                            }
                        }
                    }
                } else if (bitmap == null && c3yd != null) {
                    C3YB c3yb = c3yd.A02;
                    bitmap = Bitmap.createBitmap(c3yb.A06, c3yb.A05, Bitmap.Config.ARGB_8888);
                }
            } catch (InterruptedException unused) {
            } catch (Exception e) {
                Log.e("StickerFramePreloader/FrameLoaderThread failed to load frame ", e);
            }
            if (this.A06) {
                break;
            } else if (c3yd != null) {
                Bitmap A00 = c3yd.A02.A00(this.A02, bitmap);
                C018508q c018508q = this.A00;
                c018508q.A02.post(new RunnableEBaseShape4S0200000_I0_4(c3yd, A00, 29));
            }
        }
        if (!this.A01.A0C(276)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        C3YC c3yc2 = this.A04;
        synchronized (c3yc2) {
            Collection<Bitmap> values = c3yc2.A00.values();
            values.size();
            for (Bitmap bitmap2 : values) {
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    bitmap2.recycle();
                }
            }
            c3yc2.A00.clear();
        }
    }
}
