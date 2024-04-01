package X;

import android.media.Image;
import android.media.ImageReader;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.43W */
/* loaded from: classes3.dex */
public class C43W {
    public Image A00;
    public ImageReader A01;
    public C889044x A02;
    public AnonymousClass456 A03;
    public boolean A04;
    public final C44I A09;
    public final AnonymousClass427 A06 = new AnonymousClass427();
    public final ImageReader.OnImageAvailableListener A05 = new ImageReader.OnImageAvailableListener() { // from class: X.43U
        {
            C43W.this = this;
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            C43W c43w = C43W.this;
            Image image = c43w.A00;
            if (image != null) {
                image.close();
            }
            c43w.A00 = imageReader.acquireNextImage();
            C43W.A00(c43w);
        }
    };
    public final Callable A0A = new Callable() { // from class: X.43V
        {
            C43W.this = this;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            C43W.A00(C43W.this);
            return null;
        }
    };
    public final C888844v A07 = new C888844v(this);
    public final AnonymousClass442 A08 = new AnonymousClass442();

    public C43W(C44I c44i) {
        this.A09 = c44i;
    }

    public static void A00(C43W c43w) {
        AnonymousClass456 anonymousClass456;
        Long l;
        if (c43w.A09.A08()) {
            if (c43w.A00 == null || c43w.A03 == null) {
                return;
            }
            AnonymousClass427 anonymousClass427 = c43w.A06;
            if (!anonymousClass427.A00.isEmpty()) {
                C889044x c889044x = c43w.A02;
                if (c889044x != null && (anonymousClass456 = c43w.A03) != null && ((Boolean) anonymousClass456.A00(AbstractC886243v.A0O)).booleanValue()) {
                    long timestamp = c43w.A00.getTimestamp();
                    AnonymousClass440 anonymousClass440 = c889044x.A06;
                    if (anonymousClass440 != null) {
                        int i = 0;
                        do {
                            C886643z c886643z = anonymousClass440.A01[i];
                            if (c886643z != null && (l = c886643z.A07) != null && l.longValue() == timestamp) {
                                try {
                                    AnonymousClass442 anonymousClass442 = c43w.A08;
                                    anonymousClass442.A01(c43w.A00, c43w.A04, c886643z.A09, c886643z.A00, c886643z.A06, c886643z.A02, c886643z.A05);
                                    List list = anonymousClass427.A00;
                                    int size = list.size();
                                    for (int i2 = 0; i2 < size; i2++) {
                                        ((C42A) list.get(i2)).ANJ(anonymousClass442);
                                    }
                                } catch (RuntimeException unused) {
                                }
                                c43w.A08.A00();
                                c43w.A00.close();
                                c43w.A00 = null;
                                return;
                            }
                            i++;
                        } while (i < 3);
                        return;
                    }
                    return;
                }
                try {
                    AnonymousClass442 anonymousClass4422 = c43w.A08;
                    anonymousClass4422.A01(c43w.A00, c43w.A04, null, null, null, null, null);
                    List list2 = anonymousClass427.A00;
                    int size2 = list2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((C42A) list2.get(i3)).ANJ(anonymousClass4422);
                    }
                } catch (RuntimeException unused2) {
                }
                c43w.A08.A00();
                c43w.A00.close();
                c43w.A00 = null;
                return;
            }
            return;
        }
        throw new AnonymousClass435("Method tryToNotifyCpuFrame() must run on the Optic Background Thread.");
    }
}
