package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.1sA */
/* loaded from: classes2.dex */
public class C40401sA {
    public static volatile C40401sA A01;
    public final C40431sF A00;

    public C40401sA(C40431sF c40431sF) {
        this.A00 = c40431sF;
    }

    public static C40401sA A00() {
        if (A01 == null) {
            synchronized (C40401sA.class) {
                if (A01 == null) {
                    A01 = new C40401sA(C40431sF.A00());
                }
            }
        }
        return A01;
    }

    public final List A01(String str, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        String[] strArr2 = {"authority", "sticker_pack_id", "sticker_pack_name", "sticker_pack_publisher", "sticker_pack_image_data_hash", "avoid_cache", "is_animated_pack"};
        C0CD A02 = this.A00.A06().A02();
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            Cursor A09 = A02.A02.A09("third_party_whitelist_packs", strArr2, str, strArr, null, "getCachedPacks/QUERY_THIRD_PARTY_WHITELIST_PACKS");
            int columnIndexOrThrow = A09.getColumnIndexOrThrow("authority");
            int columnIndexOrThrow2 = A09.getColumnIndexOrThrow("sticker_pack_id");
            int columnIndexOrThrow3 = A09.getColumnIndexOrThrow("sticker_pack_name");
            int columnIndexOrThrow4 = A09.getColumnIndexOrThrow("sticker_pack_publisher");
            int columnIndex = A09.getColumnIndex("sticker_pack_image_data_hash");
            int columnIndex2 = A09.getColumnIndex("avoid_cache");
            int columnIndex3 = A09.getColumnIndex("is_animated_pack");
            while (A09.moveToNext()) {
                String string = A09.getString(columnIndexOrThrow3);
                String string2 = A09.getString(columnIndexOrThrow4);
                if (string == null) {
                    string = "";
                }
                if (string2 == null) {
                    string2 = "";
                }
                C2CJ c2cj = new C2CJ();
                c2cj.A0B = C47582Bu.A01(A09.getString(columnIndexOrThrow), A09.getString(columnIndexOrThrow2));
                c2cj.A0D = string;
                c2cj.A0F = string2;
                c2cj.A0J = new LinkedList();
                c2cj.A0I = new LinkedList();
                c2cj.A0O = true;
                if (columnIndex > 0) {
                    c2cj.A05 = A09.getString(columnIndex);
                }
                if (columnIndex2 > 0) {
                    c2cj.A0L = A09.getInt(columnIndex2) == 1;
                }
                if (columnIndex3 > 0) {
                    boolean z = A09.getInt(columnIndex3) == 1;
                    c2cj.A0M = z;
                    c2cj.A0K = z;
                }
                arrayList.add(new C42531vt(c2cj));
            }
            A09.close();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
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

    public void A02(String str, String str2, C42531vt c42531vt) {
        C0CD A03 = this.A00.A06().A03();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("authority", str);
            contentValues.put("sticker_pack_id", str2);
            contentValues.put("sticker_pack_name", c42531vt.A0F);
            contentValues.put("sticker_pack_publisher", c42531vt.A0H);
            String str3 = c42531vt.A0E;
            contentValues.put("sticker_pack_image_data_hash", str3);
            contentValues.put("avoid_cache", Integer.valueOf(c42531vt.A0L ? 1 : 0));
            contentValues.put("is_animated_pack", Integer.valueOf(c42531vt.A0M ? 1 : 0));
            A03.A02.A06("third_party_whitelist_packs", contentValues, 5);
            c42531vt.A01 = c42531vt.A08;
            c42531vt.A02 = str3;
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

    public boolean A03(String str, String str2) {
        String[] strArr = {str, str2};
        C0CD A02 = this.A00.A06().A02();
        try {
            Cursor A09 = A02.A02.A09("third_party_whitelist_packs", null, "authority = ? AND sticker_pack_id = ?", strArr, null, "checkExistence/QUERY_THIRD_PARTY_WHITELIST_PACKS");
            boolean z = A09.getCount() > 0;
            A09.close();
            return z;
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
