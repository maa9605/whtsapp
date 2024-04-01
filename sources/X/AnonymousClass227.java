package X;

import android.content.ContentValues;

/* renamed from: X.227 */
/* loaded from: classes2.dex */
public class AnonymousClass227 {
    public static volatile AnonymousClass227 A03;
    public final C018508q A00;
    public final AnonymousClass228 A01;
    public final C2BZ A02;

    public AnonymousClass227(C018508q c018508q, C2BQ c2bq, AnonymousClass228 anonymousClass228) {
        C2BZ c2bz;
        synchronized (c2bq) {
            c2bz = c2bq.A03;
            if (c2bz == null) {
                c2bz = new C2BZ(c2bq.A01());
                c2bq.A03 = c2bz;
            }
        }
        this.A00 = c018508q;
        this.A01 = anonymousClass228;
        this.A02 = c2bz;
    }

    public static AnonymousClass227 A00() {
        if (A03 == null) {
            synchronized (AnonymousClass227.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass227(C018508q.A00(), C2BQ.A00(), AnonymousClass228.A00);
                }
            }
        }
        return A03;
    }

    public void A01(C2BR c2br, long j) {
        C018508q c018508q = this.A00;
        c018508q.A02.post(new RunnableEBaseShape3S0100000_I0_3(this, 2));
        C2BZ c2bz = this.A02;
        String str = c2br.A04;
        if (c2bz != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("plaintext_hash", str);
            contentValues.put("timestamp", Long.valueOf(j));
            C0CD c0cd = new C0CD(null, c2bz.A00, true);
            try {
                c0cd.A02.A06("starred_gifs", contentValues, 5);
                return;
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
