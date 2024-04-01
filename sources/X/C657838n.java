package X;

/* renamed from: X.38n  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C657838n {
    public final /* synthetic */ C58932rw A00;
    public final /* synthetic */ AnonymousClass092 A01;

    public C657838n(C58932rw c58932rw, AnonymousClass092 anonymousClass092) {
        this.A00 = c58932rw;
        this.A01 = anonymousClass092;
    }

    public final void A00(float f, float f2, float f3) {
        C58932rw c58932rw = this.A00;
        c58932rw.A06.animate().setDuration(150L).alpha(f);
        c58932rw.A01.animate().setDuration(150L).alpha(f2);
        c58932rw.A05.animate().setDuration(150L).alpha(f2);
        c58932rw.A02.animate().setDuration(150L).alpha(f3);
    }

    public void A01(AnonymousClass094 anonymousClass094, int i) {
        if (anonymousClass094.equals(this.A01.A0n)) {
            if (i == 0) {
                A00(1.0f, 0.0f, 0.0f);
            } else if (i == 1) {
                A00(0.0f, 0.0f, 1.0f);
            } else if (i == 2) {
                A00(0.0f, 1.0f, 0.0f);
            }
        }
    }
}
