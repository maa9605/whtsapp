package X;

/* renamed from: X.0LW  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0LW extends C04300Jq {
    public boolean A00;

    public C0LW(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, 58);
    }

    @Override // X.AnonymousClass092
    public synchronized String A0G() {
        return String.valueOf(this.A00);
    }

    @Override // X.AnonymousClass092
    public synchronized void A0l(String str) {
        this.A00 = Boolean.valueOf(str).booleanValue();
    }
}
