package X;

import android.graphics.ImageFormat;
import android.hardware.Camera;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.44i  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C887544i {
    public boolean A02;
    public int A00 = 0;
    public C42C A01 = new C42C(0, 0);
    public final AnonymousClass427 A05 = new AnonymousClass427();
    public final ArrayList A06 = new ArrayList();
    public final HashMap A07 = new HashMap();
    public final Camera.PreviewCallback A03 = new Camera.PreviewCallback() { // from class: X.42m
        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            if (bArr == null) {
                return;
            }
            AnonymousClass449.A00().A01();
            AnonymousClass442 anonymousClass442 = new AnonymousClass442();
            C887544i c887544i = C887544i.this;
            int i = c887544i.A00;
            C42C c42c = c887544i.A01;
            anonymousClass442.A02(bArr, i, c42c.A01, c42c.A00);
            List list = c887544i.A05.A00;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((C42A) list.get(i2)).ANJ(anonymousClass442);
            }
        }
    };
    public final Camera.PreviewCallback A04 = new Camera.PreviewCallback() { // from class: X.42n
        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            if (bArr == null) {
                return;
            }
            AnonymousClass449.A00().A01();
            AnonymousClass442 anonymousClass442 = new AnonymousClass442();
            C887544i c887544i = C887544i.this;
            int i = c887544i.A00;
            C42C c42c = c887544i.A01;
            anonymousClass442.A02(bArr, i, c42c.A01, c42c.A00);
            List list = c887544i.A05.A00;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((C42A) list.get(i2)).ANJ(anonymousClass442);
            }
            camera.addCallbackBuffer(bArr);
        }
    };

    public synchronized void A00() {
        this.A05.A00();
        this.A07.clear();
        this.A06.clear();
    }

    public synchronized void A01(Camera camera) {
        if (!C44J.A01()) {
            camera.setPreviewCallbackWithBuffer(null);
            camera.setPreviewCallback(null);
            this.A02 = false;
        } else {
            throw new RuntimeException("Cannot disable listeners on the UI thread");
        }
    }

    public synchronized void A02(Camera camera, C42C c42c, int i) {
        int ceil;
        if (!C44J.A01()) {
            if (this.A02) {
                return;
            }
            this.A00 = i;
            this.A01 = c42c;
            HashMap hashMap = this.A07;
            if (!hashMap.isEmpty()) {
                camera.setPreviewCallback(null);
                int i2 = 0;
                int i3 = 0;
                for (Integer num : hashMap.values()) {
                    int intValue = num.intValue();
                    if (intValue > i3) {
                        i3 = intValue;
                    }
                }
                if (i != 842094169) {
                    ceil = ImageFormat.getBitsPerPixel(i) * c42c.A01 * c42c.A00;
                    if (ceil % 8 != 0) {
                        throw new IllegalStateException("Total bits for Frame should be a multiple of 8");
                    }
                } else {
                    int ceil2 = ((int) Math.ceil(c42c.A01 / 16.0d)) << 4;
                    int i4 = c42c.A00;
                    ceil = (ceil2 * i4) + ((((((int) Math.ceil((ceil2 >> 1) / 16.0d)) << 4) * i4) >> 1) << 1);
                }
                int i5 = ceil >> 3;
                ArrayList arrayList = this.A06;
                if (!arrayList.isEmpty()) {
                    if (((byte[]) arrayList.get(0)).length != i5) {
                        arrayList.clear();
                    }
                    int size = arrayList.size();
                    if (i3 > size) {
                        int i6 = i3 - size;
                        while (i2 < i6) {
                            arrayList.add(new byte[i5]);
                            i2++;
                        }
                    } else if (i3 < size) {
                        ArrayList arrayList2 = new ArrayList(i3);
                        while (i2 < i3) {
                            arrayList2.add(arrayList.get(i2));
                            i2++;
                        }
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                    }
                } else {
                    while (i2 < i3) {
                        arrayList.add(new byte[i5]);
                        i2++;
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    camera.addCallbackBuffer((byte[]) it.next());
                }
                camera.setPreviewCallbackWithBuffer(this.A04);
            } else {
                camera.setPreviewCallbackWithBuffer(null);
                camera.setPreviewCallback(this.A03);
            }
            this.A02 = true;
            return;
        }
        throw new RuntimeException("Cannot enable listeners on the UI thread");
    }
}
