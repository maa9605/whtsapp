package X;

/* renamed from: X.06y  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C014706y {
    public static volatile C014706y A03;
    public final C05E A00;
    public final C05C A01;
    public final C05L A02;

    public C014706y(C05C c05c, C05L c05l, C05E c05e) {
        this.A01 = c05c;
        this.A02 = c05l;
        this.A00 = c05e;
    }

    public static C014706y A00() {
        if (A03 == null) {
            synchronized (C014706y.class) {
                if (A03 == null) {
                    A03 = new C014706y(C05C.A00(), C05L.A00(), C05E.A00());
                }
            }
        }
        return A03;
    }

    public void A01(C03890Hn c03890Hn) {
        C05C c05c = this.A01;
        boolean z = false;
        if (!(c05c.A01("revoked_ready", 0L) == 1)) {
            if (c03890Hn.A0p > 0) {
                long j = c03890Hn.A0p;
                String A02 = c05c.A02("migration_message_revoked_index");
                if (j > (A02 == null ? 0L : Long.parseLong(A02))) {
                    return;
                }
            } else {
                return;
            }
        }
        boolean z2 = c03890Hn.A0p > 0;
        StringBuilder A0P = C000200d.A0P("RevokedMessageStore/insertOrUpdateRevokedMessage/message must have row_id set; key=");
        AnonymousClass094 anonymousClass094 = c03890Hn.A0n;
        C000200d.A1L(A0P, anonymousClass094, z2);
        C000200d.A1L(C000200d.A0P("RevokedMessageStore/insertOrUpdateRevokedMessage/message in main storage; key="), anonymousClass094, c03890Hn.A09 == 1);
        C0CD A04 = this.A00.A04();
        try {
            C0CF A01 = this.A02.A01("INSERT OR REPLACE INTO message_revoked (    message_row_id,    revoked_key_id) VALUES (?, ?)");
            A01.A04(1, c03890Hn.A0p);
            String str = c03890Hn.A00;
            if (str == null) {
                A01.A02(2);
            } else {
                A01.A05(2, str);
            }
            if (A01.A01() == c03890Hn.A0p) {
                z = true;
            }
            C000700j.A0A(z, "RevokedMessageStore/insertOrUpdateRevokedMessage/inserted row should have same row_id");
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A04.close();
                } catch (Throwable unused) {
                }
            }
        }
    }
}
