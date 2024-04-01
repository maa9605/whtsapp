package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Bw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47602Bw {
    public final C42551vv A00;

    public C47602Bw(C42551vv c42551vv) {
        this.A00 = c42551vv;
    }

    public List A00() {
        ArrayList arrayList = new ArrayList();
        C0CD A02 = this.A00.A02();
        try {
            Cursor A09 = A02.A02.A09("starred_stickers", C2CE.A00, null, null, "timestamp DESC", "getStarredStickersData/QUERY_STARRED_STICKER");
            int columnIndexOrThrow = A09.getColumnIndexOrThrow("plaintext_hash");
            int columnIndexOrThrow2 = A09.getColumnIndexOrThrow("hash_of_image_part");
            int columnIndexOrThrow3 = A09.getColumnIndexOrThrow("timestamp");
            int columnIndexOrThrow4 = A09.getColumnIndexOrThrow("url");
            int columnIndexOrThrow5 = A09.getColumnIndexOrThrow("enc_hash");
            int columnIndexOrThrow6 = A09.getColumnIndexOrThrow("direct_path");
            int columnIndexOrThrow7 = A09.getColumnIndexOrThrow("mimetype");
            int columnIndexOrThrow8 = A09.getColumnIndexOrThrow("media_key");
            int columnIndexOrThrow9 = A09.getColumnIndexOrThrow("file_size");
            int columnIndexOrThrow10 = A09.getColumnIndexOrThrow("width");
            int columnIndexOrThrow11 = A09.getColumnIndexOrThrow("height");
            int columnIndexOrThrow12 = A09.getColumnIndexOrThrow("emojis");
            int columnIndexOrThrow13 = A09.getColumnIndexOrThrow("is_first_party");
            while (A09.moveToNext()) {
                String string = A09.getString(columnIndexOrThrow);
                String string2 = A09.getString(columnIndexOrThrow6);
                if (string != null) {
                    arrayList.add(new C47612Bx(string, A09.getString(columnIndexOrThrow2), A09.getLong(columnIndexOrThrow3), A09.getString(columnIndexOrThrow4), A09.getString(columnIndexOrThrow5), string2, A09.getString(columnIndexOrThrow7), A09.getString(columnIndexOrThrow8), A09.getInt(columnIndexOrThrow9), A09.getInt(columnIndexOrThrow10), A09.getInt(columnIndexOrThrow11), A09.getString(columnIndexOrThrow12), A09.getInt(columnIndexOrThrow13) == 1));
                }
            }
            A09.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A02.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void A01(C47612Bx c47612Bx) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("plaintext_hash", c47612Bx.A09);
        contentValues.put("hash_of_image_part", c47612Bx.A01);
        contentValues.put("timestamp", Long.valueOf(c47612Bx.A06));
        contentValues.put("url", c47612Bx.A0C);
        contentValues.put("enc_hash", c47612Bx.A08);
        contentValues.put("direct_path", c47612Bx.A07);
        contentValues.put("mimetype", c47612Bx.A0B);
        contentValues.put("media_key", c47612Bx.A0A);
        contentValues.put("file_size", Integer.valueOf(c47612Bx.A03));
        contentValues.put("width", Integer.valueOf(c47612Bx.A05));
        contentValues.put("height", Integer.valueOf(c47612Bx.A04));
        contentValues.put("emojis", c47612Bx.A00);
        contentValues.put("is_first_party", Boolean.valueOf(c47612Bx.A02));
        C0CD A03 = this.A00.A03();
        try {
            A03.A02.A06("starred_stickers", contentValues, 5);
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

    public void A02(String str) {
        C0CD A03 = this.A00.A03();
        try {
            A03.A02.A01("starred_stickers", "plaintext_hash = ?", new String[]{str});
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
