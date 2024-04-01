package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2Bq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47542Bq {
    public static volatile C47542Bq A01;
    public final C40431sF A00;

    public C47542Bq(C40431sF c40431sF) {
        this.A00 = c40431sF;
    }

    public Set A00() {
        HashSet hashSet = new HashSet();
        String[] strArr = {"pack_id"};
        C0CD A02 = this.A00.A06().A02();
        try {
            Cursor A09 = A02.A02.A09("unseen_sticker_packs", strArr, null, null, null, "getUnseenStickerPackIds/QUERY_UNSEEN_STICKER_PACK");
            int columnIndexOrThrow = A09.getColumnIndexOrThrow("pack_id");
            while (A09.moveToNext()) {
                hashSet.add(A09.getString(columnIndexOrThrow));
            }
            A09.close();
            return hashSet;
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

    public void A01(String str) {
        C0CD A03 = this.A00.A06().A03();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("pack_id", str);
            A03.A02.A06("unseen_sticker_packs", contentValues, 5);
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
