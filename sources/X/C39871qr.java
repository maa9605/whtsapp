package X;

import android.content.SharedPreferences;

/* renamed from: X.1qr */
/* loaded from: classes.dex */
public final class C39871qr extends AbstractC31511cO {
    public long A00;
    public long A01;
    public SharedPreferences A02;
    public final C17T A03;

    public C39871qr(AnonymousClass176 anonymousClass176) {
        super(anonymousClass176);
        this.A01 = -1L;
        this.A03 = new C17T(this, ((Number) C17L.A08.A00).longValue());
    }

    @Override // X.AbstractC31511cO
    public final void A0D() {
        this.A02 = ((AnonymousClass174) this).A00.A00.getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public final void A0E() {
        C13H.A00();
        A0C();
        if (((AnonymousClass174) this).A00.A03 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences.Editor edit = this.A02.edit();
            edit.putLong("last_dispatch", currentTimeMillis);
            edit.apply();
            this.A01 = currentTimeMillis;
            return;
        }
        throw null;
    }
}
