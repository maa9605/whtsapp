package X;

/* renamed from: X.0Pe  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC05550Pe extends C04300Jq {
    public int A00;
    public boolean A01;

    public AbstractC05550Pe(AnonymousClass094 anonymousClass094, long j, int i) {
        super(anonymousClass094, j, i);
    }

    @Override // X.AnonymousClass092
    public int A04() {
        return this.A01 ? 1 : 0;
    }

    @Override // X.AnonymousClass092
    public int A05() {
        return this.A00;
    }

    @Override // X.AnonymousClass092
    public void A0W(int i) {
        this.A01 = i == 1;
    }

    @Override // X.AnonymousClass092
    public void A0X(int i) {
        this.A00 = i;
    }
}
