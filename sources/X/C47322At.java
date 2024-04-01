package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;

/* renamed from: X.2At  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47322At extends AbstractC05360Ok {
    public static volatile C47322At A04;
    public final C01B A00;
    public final C000500h A01;
    public final C05E A02;
    public final C0ES A03;

    public C47322At(C01B c01b, C0ES c0es, C05E c05e, C000500h c000500h) {
        this.A00 = c01b;
        this.A03 = c0es;
        this.A02 = c05e;
        this.A01 = c000500h;
    }

    public static C47322At A00() {
        if (A04 == null) {
            synchronized (C47322At.class) {
                if (A04 == null) {
                    A04 = new C47322At(C01B.A00(), C0ES.A00(), C05E.A00(), C000500h.A00());
                }
            }
        }
        return A04;
    }

    @Override // X.AbstractC05360Ok
    public void A01() {
        C01B c01b = this.A00;
        if (!c01b.A0E(C01C.A0n)) {
            C000200d.A0j(this.A01, "ephemeral_group_query_done", false);
            return;
        }
        C000500h c000500h = this.A01;
        SharedPreferences sharedPreferences = c000500h.A00;
        if (sharedPreferences.getLong("client_version_upgrade_ephemeral_timestamp", -1L) == -1) {
            C000200d.A0h(c000500h, "client_version_upgrade_ephemeral_timestamp", sharedPreferences.getLong("client_version_upgrade_timestamp", -1L));
        }
        if (sharedPreferences.getBoolean("ephemeral_group_query_done", false)) {
            return;
        }
        long A07 = c01b.A07(C01C.A2y) * 1000;
        if (A07 > 0 && sharedPreferences.getLong("client_version_upgrade_ephemeral_timestamp", -1L) > A07) {
            Log.i("EphemeralServerPropertiesListener/onServerProperties");
            C0ES c0es = this.A03;
            if (!c0es.A0n && this.A02.A00) {
                c0es.A0N(false, false, 0);
                C000200d.A0j(c000500h, "ephemeral_group_query_done", true);
                return;
            }
            Log.i("EphemeralServerPropertiesListener/onServerProperties/skip");
        }
    }
}
