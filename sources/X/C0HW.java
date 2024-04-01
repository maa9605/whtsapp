package X;

/* renamed from: X.0HW  reason: invalid class name */
/* loaded from: classes.dex */
public class C0HW {
    public static volatile C0HW A01;
    public final AbstractC000600i A00;

    public C0HW(AbstractC000600i abstractC000600i) {
        this.A00 = abstractC000600i;
    }

    public static C0HW A00() {
        if (A01 == null) {
            synchronized (C0HW.class) {
                if (A01 == null) {
                    A01 = new C0HW(AbstractC000600i.A00());
                }
            }
        }
        return A01;
    }

    public static boolean A01(C0DC c0dc) {
        return c0dc == C0DC.A07 || c0dc == C0DC.A0J;
    }

    public static boolean A02(C0DC c0dc) {
        return c0dc == C0DC.A0A || c0dc == C0DC.A0P || c0dc == C0DC.A0L || c0dc == C0DC.A0H || c0dc == C0DC.A06 || c0dc == C0DC.A0C;
    }

    public static boolean A03(C0DC c0dc) {
        return c0dc == C0DC.A04 || c0dc == C0DC.A0N || c0dc == C0DC.A0Q || c0dc == C0DC.A0M || c0dc == C0DC.A0K;
    }

    public static boolean A04(C0DC c0dc) {
        return A01(c0dc) || c0dc == C0DC.A0I;
    }

    public static boolean A05(Throwable th) {
        return th.getMessage() != null && th.getMessage().contains("WATLS Exception");
    }
}
