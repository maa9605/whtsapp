package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import com.whatsapp.util.Log;

/* renamed from: X.07B */
/* loaded from: classes.dex */
public class C07B {
    public static volatile C07B A04;
    public final AnonymousClass012 A00;
    public final C05E A01;
    public final C05L A02;
    public final C003701t A03;

    public C07B(AnonymousClass012 anonymousClass012, C003701t c003701t, C05L c05l, C05E c05e) {
        this.A00 = anonymousClass012;
        this.A03 = c003701t;
        this.A02 = c05l;
        this.A01 = c05e;
    }

    public static C07B A00() {
        if (A04 == null) {
            synchronized (C07B.class) {
                if (A04 == null) {
                    A04 = new C07B(AnonymousClass012.A00(), C003701t.A00(), C05L.A00(), C05E.A00());
                }
            }
        }
        return A04;
    }

    public void A01(AnonymousClass092 anonymousClass092) {
        C05610Pk c05610Pk;
        long j = anonymousClass092.A0p;
        C0CD A03 = this.A01.A03();
        try {
            Cursor A07 = A03.A02.A07("SELECT message_row_id, direct_path, media_key, media_key_timestamp, enc_thumb_hash, thumb_hash, thumb_width, thumb_height, transferred, micro_thumbnail, insert_timestamp FROM mms_thumbnail_metadata WHERE message_row_id=?", new String[]{Long.toString(j)});
            if (A07.moveToLast()) {
                c05610Pk = new C05610Pk();
                c05610Pk.A03 = A07.getString(A07.getColumnIndexOrThrow("direct_path"));
                c05610Pk.A07 = A07.getBlob(A07.getColumnIndexOrThrow("media_key"));
                c05610Pk.A02 = A07.getLong(A07.getColumnIndexOrThrow("media_key_timestamp"));
                c05610Pk.A04 = A07.getString(A07.getColumnIndexOrThrow("enc_thumb_hash"));
                c05610Pk.A05 = A07.getString(A07.getColumnIndexOrThrow("thumb_hash"));
                c05610Pk.A01 = A07.getInt(A07.getColumnIndexOrThrow("thumb_width"));
                c05610Pk.A00 = A07.getInt(A07.getColumnIndexOrThrow("thumb_height"));
                c05610Pk.A06 = C05T.A04(A07, A07.getColumnIndexOrThrow("transferred"));
                c05610Pk.A08 = A07.getBlob(A07.getColumnIndexOrThrow("micro_thumbnail"));
                A07.close();
                A03.close();
            } else {
                A07.close();
                A03.close();
                c05610Pk = null;
            }
            anonymousClass092.A0i(c05610Pk);
            if (c05610Pk == null || !C0DB.A0P(this.A03, anonymousClass092)) {
                return;
            }
            c05610Pk.A09 = true;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A03.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public void A02(C05610Pk c05610Pk, long j) {
        try {
            C0CD A042 = this.A01.A04();
            C0CF A01 = this.A02.A01("INSERT OR REPLACE INTO mms_thumbnail_metadata(message_row_id, direct_path, media_key, media_key_timestamp, enc_thumb_hash, thumb_hash, thumb_width, thumb_height, transferred, micro_thumbnail, insert_timestamp) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            A01.A04(1, j);
            String str = c05610Pk.A03;
            if (str == null) {
                A01.A02(2);
            } else {
                A01.A05(2, str);
            }
            byte[] bArr = c05610Pk.A07;
            if (bArr != null) {
                A01.A00.bindBlob(3, bArr);
            } else {
                A01.A02(3);
            }
            A01.A04(4, c05610Pk.A02);
            String str2 = c05610Pk.A04;
            if (str2 == null) {
                A01.A02(5);
            } else {
                A01.A05(5, str2);
            }
            String str3 = c05610Pk.A05;
            if (str3 == null) {
                A01.A02(6);
            } else {
                A01.A05(6, str3);
            }
            A01.A04(7, c05610Pk.A01);
            A01.A04(8, c05610Pk.A00);
            A01.A04(9, c05610Pk.A06 ? 1L : 0L);
            byte[] bArr2 = c05610Pk.A08;
            if (bArr2 == null) {
                A01.A02(10);
            } else {
                A01.A00.bindBlob(10, bArr2);
            }
            A01.A04(11, this.A00.A05());
            A01.A01();
            A042.close();
        } catch (SQLiteConstraintException e) {
            Log.e("MmsThumbnailMetadataMessageStore/insertMmsThumbnailMetadata/", e);
            throw e;
        }
    }
}
