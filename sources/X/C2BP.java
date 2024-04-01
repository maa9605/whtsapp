package X;

import android.database.Cursor;
import java.util.AbstractMap;

/* renamed from: X.2BP  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2BP extends C2AN {
    public static volatile C2BP A03;
    public final C018508q A00;
    public final AnonymousClass228 A01;
    public final C2BU A02;

    public C2BP(C018508q c018508q, AnonymousClass228 anonymousClass228, C2BU c2bu) {
        super(c2bu, 12);
        this.A00 = c018508q;
        this.A01 = anonymousClass228;
        this.A02 = c2bu;
    }

    public static C2BP A00() {
        if (A03 == null) {
            synchronized (C2BP.class) {
                if (A03 == null) {
                    C018508q A00 = C018508q.A00();
                    C002801j.A00();
                    AnonymousClass228 anonymousClass228 = AnonymousClass228.A00;
                    if (C2BU.A02 == null) {
                        synchronized (C2BU.class) {
                            if (C2BU.A02 == null) {
                                C2BU.A02 = new C2BU(C2BQ.A00());
                            }
                        }
                    }
                    A03 = new C2BP(A00, anonymousClass228, C2BU.A02);
                }
            }
        }
        return A03;
    }

    public void A0B(C2BR c2br) {
        super.A0A(new C2BW(c2br.A04));
    }

    public boolean A0C(String str) {
        C000700j.A00();
        if (((AbstractMap) super.A03()).containsKey(new C2BW(str))) {
            return true;
        }
        C2BU c2bu = this.A02;
        if (c2bu != null) {
            String[] strArr = {str};
            C0CD c0cd = new C0CD(null, c2bu.A00.A01(), false);
            try {
                Cursor A09 = c0cd.A02.A09("recent_gifs", null, "plaintext_hash = ?", strArr, null, "isGifInRecentsDB/QUERY_RECENT_GIFS");
                boolean z = A09.getCount() > 0;
                A09.close();
                return z;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                    try {
                        c0cd.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        throw null;
    }
}
