package X;

/* renamed from: X.1wy  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43171wy {
    public static volatile C43171wy A02;
    public final C03720Gu A00;
    public final C003701t A01;

    public C43171wy(C003701t c003701t, C03720Gu c03720Gu) {
        this.A01 = c003701t;
        this.A00 = c03720Gu;
    }

    public static C43171wy A00() {
        if (A02 == null) {
            synchronized (C43171wy.class) {
                if (A02 == null) {
                    A02 = new C43171wy(C003701t.A00(), C03720Gu.A00());
                }
            }
        }
        return A02;
    }

    public synchronized void A01(C04030Id c04030Id) {
        AnonymousClass097 anonymousClass097 = c04030Id.A04;
        if (!c04030Id.A05()) {
            C0JN A01 = this.A00.A01(anonymousClass097.A0n);
            if (A01 == null) {
                return;
            }
            byte[] bArr = A01.A00;
            int[] iArr = A01.A01;
            synchronized (c04030Id) {
                if (!c04030Id.A00) {
                    c04030Id.A02(bArr, iArr);
                }
            }
            c04030Id.A05 = C0DB.A0O(this.A01, anonymousClass097);
        }
    }

    public synchronized boolean A02(AnonymousClass092 anonymousClass092) {
        C04030Id A18;
        if (anonymousClass092 == null) {
            return false;
        }
        if (!(anonymousClass092 instanceof AnonymousClass097) || (A18 = ((AnonymousClass097) anonymousClass092).A18()) == null || A18.A05()) {
            return A02(anonymousClass092.A0C());
        }
        return true;
    }
}
