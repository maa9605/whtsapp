package X;

import com.whatsapp.util.Log;

/* renamed from: X.247  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass247 {
    public static volatile AnonymousClass247 A04;
    public final C018508q A00;
    public final C43171wy A01;
    public final C0GT A02;
    public final InterfaceC002901k A03;

    public AnonymousClass247(C018508q c018508q, InterfaceC002901k interfaceC002901k, C0GT c0gt, C43171wy c43171wy) {
        this.A00 = c018508q;
        this.A03 = interfaceC002901k;
        this.A02 = c0gt;
        this.A01 = c43171wy;
    }

    public static AnonymousClass247 A00() {
        if (A04 == null) {
            synchronized (AnonymousClass247.class) {
                if (A04 == null) {
                    A04 = new AnonymousClass247(C018508q.A00(), C002801j.A00(), C0GT.A00(), C43171wy.A00());
                }
            }
        }
        return A04;
    }

    public void A01(AnonymousClass092 anonymousClass092) {
        C04030Id A18;
        C04030Id A182;
        if (anonymousClass092 == null) {
            return;
        }
        if (AnonymousClass024.A0c()) {
            Log.w("message is lazy loaded on ui thread", new Throwable());
        }
        this.A02.A01(anonymousClass092);
        C43171wy c43171wy = this.A01;
        synchronized (c43171wy) {
            if ((anonymousClass092 instanceof AnonymousClass097) && (A182 = ((AnonymousClass097) anonymousClass092).A18()) != null) {
                c43171wy.A01(A182);
                A182.A00 = true;
            }
            AnonymousClass092 A0C = anonymousClass092.A0C();
            if ((A0C instanceof AnonymousClass097) && (A18 = ((AnonymousClass097) A0C).A18()) != null) {
                A18.A00 = true;
            }
        }
        if (!C002701i.A1R(anonymousClass092)) {
            throw new IllegalStateException("ensureCompletelyLoaded failed");
        }
    }
}
