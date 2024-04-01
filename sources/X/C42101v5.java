package X;

import android.content.SharedPreferences;
import java.util.UUID;

/* renamed from: X.1v5  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42101v5 implements InterfaceC03210Eu {
    public static volatile C42101v5 A02;
    public final AnonymousClass012 A00;
    public final C000500h A01;

    public C42101v5(AnonymousClass012 anonymousClass012, C000500h c000500h) {
        this.A00 = anonymousClass012;
        this.A01 = c000500h;
    }

    public static C42101v5 A00() {
        if (A02 == null) {
            synchronized (C42101v5.class) {
                if (A02 == null) {
                    A02 = new C42101v5(AnonymousClass012.A00(), C000500h.A00());
                }
            }
        }
        return A02;
    }

    @Override // X.InterfaceC03210Eu
    public synchronized C04970Mr ACN() {
        SharedPreferences sharedPreferences = this.A01.A00;
        String string = sharedPreferences.getString("phoneid_id", null);
        long j = sharedPreferences.getLong("phoneid_timestamp", -1L);
        if (string != null && j != -1) {
            return new C04970Mr(string, j);
        }
        C04970Mr c04970Mr = new C04970Mr(UUID.randomUUID().toString(), this.A00.A05());
        ATa(c04970Mr);
        return c04970Mr;
    }

    @Override // X.InterfaceC03210Eu
    public synchronized void ATa(C04970Mr c04970Mr) {
        C000500h c000500h = this.A01;
        String str = c04970Mr.A01;
        long j = c04970Mr.A00;
        c000500h.A0D().putString("phoneid_id", str).apply();
        c000500h.A0D().putLong("phoneid_timestamp", j).apply();
    }
}
