package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;

/* renamed from: X.1vw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42561vw {
    public final C42551vv A00;

    public C42561vw(C42551vv c42551vv) {
        this.A00 = c42551vv;
    }

    public synchronized int A00(String str) {
        C0CD A03 = this.A00.A03();
        C03790Hb A00 = A03.A00();
        C0CE c0ce = A03.A02;
        Cursor A09 = c0ce.A09("sticker_pack_order", new String[]{"pack_order"}, "sticker_pack_id = ?", new String[]{str}, null, "getOrAddStickerPackOrder/QUERY_STICKER_PACK_ORDER");
        if (A09.getCount() > 0 && A09.moveToFirst()) {
            int i = A09.getInt(A09.getColumnIndexOrThrow("pack_order"));
            A09.close();
            A00.close();
            A03.close();
            return i;
        }
        A09.close();
        int i2 = SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
        Cursor A07 = c0ce.A07("SELECT MAX(pack_order) FROM sticker_pack_order", null);
        if (A07.getCount() > 0 && A07.moveToFirst()) {
            i2 = A07.getInt(0);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("StickerPackOderDBTableHelper/getOrAddStickerPackOrder/max order is not available for sticker pack: ");
            sb.append(str);
            Log.e(sb.toString());
        }
        A07.close();
        int i3 = i2 + 1;
        ContentValues contentValues = new ContentValues();
        contentValues.put("sticker_pack_id", str);
        contentValues.put("pack_order", Integer.valueOf(i3));
        c0ce.A03("sticker_pack_order", contentValues);
        A00.A00();
        A00.close();
        A03.close();
        return i3;
    }
}
