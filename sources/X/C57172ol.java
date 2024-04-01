package X;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2ol  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C57172ol {
    public boolean A00;
    public boolean A01;
    public volatile C57162ok A04;
    public final TreeMap A03 = new TreeMap();
    public final int A02 = 9;

    public final synchronized C57162ok A00(long j) {
        C57162ok c57162ok;
        TreeMap treeMap = this.A03;
        Long valueOf = Long.valueOf(j);
        c57162ok = (C57162ok) treeMap.get(valueOf);
        if (c57162ok == null) {
            c57162ok = new C57162ok(true);
            treeMap.put(valueOf, c57162ok);
        }
        return c57162ok;
    }

    public synchronized void A01() {
        if (this.A04 != null) {
            this.A04.A00();
        }
        this.A04 = null;
    }

    public synchronized void A02() {
        if (this.A01) {
            TreeMap treeMap = this.A03;
            if (treeMap.size() > 9) {
                Long l = (Long) treeMap.firstKey();
                Object obj = treeMap.get(l);
                if (obj != null) {
                    ((C57162ok) obj).A00();
                    treeMap.remove(l);
                } else {
                    throw null;
                }
            }
        }
    }

    public synchronized void A03(C648434x c648434x) {
        int intValue;
        int intValue2;
        if (this.A01) {
            TreeMap treeMap = this.A03;
            ArrayList arrayList = new ArrayList(treeMap.values());
            Collections.reverse(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C57162ok c57162ok = (C57162ok) it.next();
                if (c648434x != null) {
                    AtomicInteger atomicInteger = c57162ok.A01;
                    if (atomicInteger.getAndIncrement() > 0 && c57162ok.A02 != null) {
                        C2L5 c2l5 = c648434x.A01;
                        AtomicBoolean atomicBoolean = c648434x.A02;
                        C471729x c471729x = c648434x.A00;
                        if (!atomicBoolean.get()) {
                            TotalCaptureResult totalCaptureResult = c57162ok.A00;
                            if (totalCaptureResult != null) {
                                Integer num = (Integer) totalCaptureResult.get(CaptureResult.LENS_STATE);
                                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
                                Integer num3 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                                Integer num4 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AWB_STATE);
                                if (num == null) {
                                    num = r11;
                                }
                                if (num2 == null) {
                                    num2 = r11;
                                }
                                if (num3 == null) {
                                    num3 = r11;
                                }
                                r11 = num4 != null ? num4 : 0;
                                if (num.intValue() != 1 && (intValue = num2.intValue()) != 1 && intValue != 5 && (intValue2 = num3.intValue()) != 3 && intValue2 != 1 && r11.intValue() != 1) {
                                    StringBuilder A0P = C000200d.A0P("cameraview/found-zsl-capture: ");
                                    A0P.append(atomicInteger);
                                    Log.i(A0P.toString());
                                    Image image = c57162ok.A02;
                                    if (image != null) {
                                        c471729x.A00(c2l5.A0X(image), c2l5.A0Y);
                                        atomicBoolean.set(true);
                                    } else {
                                        throw null;
                                    }
                                }
                            }
                        }
                    }
                    c57162ok.A00();
                }
                c57162ok.A00();
            }
            treeMap.clear();
        }
    }
}
