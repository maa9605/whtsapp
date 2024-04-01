package X;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2Er  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C48292Er {
    public static volatile C48292Er A07;
    public final C02L A00;
    public final C0F2 A01;
    public final C003701t A02;
    public final C43371xI A03;
    public final C0GT A04;
    public final C41961un A05;
    public final C42471vn A06;

    public C48292Er(C003701t c003701t, C02L c02l, C41961un c41961un, C43371xI c43371xI, C42471vn c42471vn, C0GT c0gt, C0F2 c0f2) {
        this.A02 = c003701t;
        this.A00 = c02l;
        this.A05 = c41961un;
        this.A03 = c43371xI;
        this.A06 = c42471vn;
        this.A04 = c0gt;
        this.A01 = c0f2;
    }

    public static boolean A00(AnonymousClass097 anonymousClass097, boolean z) {
        synchronized (anonymousClass097) {
            C09H c09h = anonymousClass097.A02;
            if (c09h != null) {
                if (((AnonymousClass092) anonymousClass097).A08 == 1) {
                    ((AnonymousClass092) anonymousClass097).A08 = 0;
                    c09h.A0a = false;
                    c09h.A0P = false;
                    c09h.A0L = z;
                    c09h.A0C = 0L;
                    return true;
                }
                return false;
            }
            throw null;
        }
    }

    public static final boolean A01(Object obj, C04130Ir c04130Ir, InterfaceC48332Ev interfaceC48332Ev) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (AnonymousClass097 anonymousClass097 : Collections.unmodifiableList(c04130Ir.A01)) {
            synchronized (anonymousClass097) {
                C09H c09h = anonymousClass097.A02;
                if (c09h != null) {
                    if (interfaceC48332Ev.A5T(obj, anonymousClass097, c09h)) {
                        atomicBoolean.set(true);
                    }
                } else {
                    throw null;
                }
            }
        }
        return atomicBoolean.get();
    }
}
