package X;

import java.io.File;

/* renamed from: X.4Cw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C90904Cw {
    public static volatile C90904Cw A04;
    public final C018508q A00;
    public final C001200o A01;
    public final C41451tw A02;
    public final AnonymousClass241 A03;

    public C90904Cw(C018508q c018508q, C001200o c001200o, C41451tw c41451tw) {
        this.A00 = c018508q;
        this.A01 = c001200o;
        this.A02 = c41451tw;
        AnonymousClass242 anonymousClass242 = new AnonymousClass242(c018508q, c41451tw, new File(c001200o.A00.getCacheDir(), "brazilpay_image_cache"));
        anonymousClass242.A02 = 16777216L;
        anonymousClass242.A05 = true;
        this.A03 = anonymousClass242.A00();
    }

    public static C90904Cw A00() {
        if (A04 == null) {
            synchronized (C90904Cw.class) {
                if (A04 == null) {
                    A04 = new C90904Cw(C018508q.A00(), C001200o.A01, C41451tw.A00());
                }
            }
        }
        return A04;
    }
}
