package X;

import android.app.PendingIntent;

/* renamed from: X.3mo  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C80153mo implements C3VZ {
    public final C71153Va A00;

    @Override // X.C3VZ
    public void A6S() {
    }

    @Override // X.C3VZ
    public int ABO() {
        return 15;
    }

    public C80153mo(C71153Va c71153Va) {
        this.A00 = c71153Va;
    }

    @Override // X.C3VZ
    public boolean AFj() {
        C71153Va c71153Va = this.A00;
        return PendingIntent.getBroadcast(c71153Va.A01.A00, 0, c71153Va.A01(), 536870912) != null;
    }

    @Override // X.C3VZ
    public void ASC() {
        this.A00.A02();
    }

    @Override // X.C3VZ
    public void cancel() {
        C71153Va c71153Va = this.A00;
        c71153Va.A04(c71153Va.A01());
    }
}
