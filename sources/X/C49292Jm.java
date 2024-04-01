package X;

import android.database.Cursor;

/* renamed from: X.2Jm */
/* loaded from: classes2.dex */
public class C49292Jm {
    public static volatile C49292Jm A03;
    public final C018508q A00;
    public final C61352w0 A01;
    public final AnonymousClass228 A02;

    public C49292Jm(C018508q c018508q, C2BQ c2bq, AnonymousClass228 anonymousClass228) {
        C61352w0 c61352w0;
        this.A00 = c018508q;
        this.A02 = anonymousClass228;
        synchronized (c2bq) {
            c61352w0 = c2bq.A00;
            if (c61352w0 == null) {
                c61352w0 = new C61352w0(c2bq.A01());
                c2bq.A00 = c61352w0;
            }
        }
        this.A01 = c61352w0;
    }

    public long A00(String str) {
        C000700j.A00();
        C61352w0 c61352w0 = this.A01;
        if (c61352w0 != null) {
            String[] strArr = {str};
            C0CD c0cd = new C0CD(null, c61352w0.A00, false);
            try {
                Cursor A09 = c0cd.A02.A09("downloadable_gifs", null, "content_url = ?", strArr, null, "getByUrl/QUERY_DOWNLOADABLE_GIFS");
                long j = A09.moveToFirst() ? A09.getLong(A09.getColumnIndexOrThrow("timestamp")) : -1L;
                A09.close();
                return j;
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

    public void A01(String str) {
        this.A01.A00(str);
    }

    public boolean A02(String str) {
        C000700j.A00();
        C61352w0 c61352w0 = this.A01;
        if (c61352w0 != null) {
            String[] strArr = {str};
            C0CD c0cd = new C0CD(null, c61352w0.A00, false);
            try {
                Cursor A09 = c0cd.A02.A09("downloadable_gifs", null, "content_url = ?", strArr, null, "isGifInDB/QUERY_DOWNLOADABLE_GIFS");
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
