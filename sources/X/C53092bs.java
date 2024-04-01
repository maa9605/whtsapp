package X;

/* renamed from: X.2bs  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C53092bs {
    public static volatile C53092bs A03;
    public final C003701t A00;
    public final C42451vl A01;
    public final C23L A02;

    public C53092bs(C003701t c003701t, C42451vl c42451vl, C23L c23l) {
        this.A00 = c003701t;
        this.A01 = c42451vl;
        this.A02 = c23l;
    }

    public void A00(AnonymousClass092 anonymousClass092) {
        if ((anonymousClass092 instanceof AnonymousClass097) && this.A00.A0C(249) && anonymousClass092.A0E() != null && !anonymousClass092.A0E().A05()) {
            AnonymousClass097 anonymousClass097 = (AnonymousClass097) anonymousClass092;
            if (anonymousClass092.A0N != null) {
                this.A02.A07(anonymousClass097, 0);
            } else if (!(anonymousClass097 instanceof AnonymousClass095)) {
            } else {
                C04030Id A18 = anonymousClass097.A18();
                if (A18 == null) {
                    throw null;
                }
                if (!A18.A04()) {
                    return;
                }
                this.A01.A06(anonymousClass097, 2, null, 0L, true, false);
            }
        }
    }
}
