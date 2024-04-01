package X;

import android.database.Cursor;

/* renamed from: X.078 */
/* loaded from: classes.dex */
public class AnonymousClass078 {
    public static volatile AnonymousClass078 A01;
    public final C05E A00;

    public AnonymousClass078(C05E c05e) {
        this.A00 = c05e;
    }

    public static AnonymousClass078 A00() {
        if (A01 == null) {
            synchronized (AnonymousClass078.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass078(C05E.A00());
                }
            }
        }
        return A01;
    }

    public void A01(AnonymousClass092 anonymousClass092) {
        C0CD A03 = this.A00.A03();
        try {
            Cursor A07 = A03.A02.A07("SELECT title, body, media_type, thumbnail_url, full_thumbnail, micro_thumbnail, media_url, source_type, source_id, source_url FROM message_external_ad_content WHERE message_row_id = ?", new String[]{String.valueOf(anonymousClass092.A0p)});
            if (A07.moveToLast()) {
                anonymousClass092.A0e(new C0CZ(A07.getString(A07.getColumnIndex("title")), A07.getString(A07.getColumnIndex("body")), A07.getInt(A07.getColumnIndex("media_type")), A07.getString(A07.getColumnIndex("thumbnail_url")), A07.getString(A07.getColumnIndex("media_url")), A07.getBlob(A07.getColumnIndex("micro_thumbnail")), A07.getBlob(A07.getColumnIndex("full_thumbnail")), A07.getString(A07.getColumnIndex("source_type")), A07.getString(A07.getColumnIndex("source_id")), A07.getString(A07.getColumnIndex("source_url"))));
            }
            A07.close();
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A03.close();
                } catch (Throwable unused) {
                }
            }
        }
    }
}
