package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1vu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42541vu {
    public final C42551vv A00;

    public C42541vu(C42551vv c42551vv) {
        this.A00 = c42551vv;
    }

    public List A00(String str) {
        String[] strArr = {str};
        C0CD A02 = this.A00.A02();
        try {
            Cursor A09 = A02.A02.A09("stickers", null, "sticker_pack_id = ?", strArr, null, "getByPackId/QUERY_STICKER");
            ArrayList arrayList = new ArrayList();
            int columnIndexOrThrow = A09.getColumnIndexOrThrow("plain_file_hash");
            int columnIndexOrThrow2 = A09.getColumnIndexOrThrow("encrypted_file_hash");
            int columnIndexOrThrow3 = A09.getColumnIndexOrThrow("media_key");
            int columnIndexOrThrow4 = A09.getColumnIndexOrThrow("mime_type");
            int columnIndexOrThrow5 = A09.getColumnIndexOrThrow("height");
            int columnIndexOrThrow6 = A09.getColumnIndexOrThrow("width");
            int columnIndexOrThrow7 = A09.getColumnIndexOrThrow("sticker_pack_id");
            int columnIndexOrThrow8 = A09.getColumnIndexOrThrow("file_path");
            int columnIndexOrThrow9 = A09.getColumnIndexOrThrow("file_size");
            int columnIndexOrThrow10 = A09.getColumnIndexOrThrow("url");
            int columnIndexOrThrow11 = A09.getColumnIndexOrThrow("direct_path");
            int columnIndexOrThrow12 = A09.getColumnIndexOrThrow("emojis");
            while (A09.moveToNext()) {
                C0JM c0jm = new C0JM();
                c0jm.A0B = A09.getString(columnIndexOrThrow);
                c0jm.A07 = A09.getString(columnIndexOrThrow2);
                c0jm.A09 = A09.getString(columnIndexOrThrow3);
                c0jm.A0A = A09.getString(columnIndexOrThrow4);
                c0jm.A02 = A09.getInt(columnIndexOrThrow5);
                c0jm.A03 = A09.getInt(columnIndexOrThrow6);
                c0jm.A0D = A09.getString(columnIndexOrThrow7);
                c0jm.A08 = A09.getString(columnIndexOrThrow8);
                c0jm.A01 = 1;
                c0jm.A00 = A09.getInt(columnIndexOrThrow9);
                c0jm.A0E = A09.getString(columnIndexOrThrow10);
                c0jm.A05 = A09.getString(columnIndexOrThrow11);
                c0jm.A06 = A09.getString(columnIndexOrThrow12);
                arrayList.add(c0jm);
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
}
