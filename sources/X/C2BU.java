package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2BU  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2BU implements C2BV {
    public static volatile C2BU A02;
    public final C2BQ A00;
    public volatile List A01;

    public C2BU(C2BQ c2bq) {
        this.A00 = c2bq;
    }

    @Override // X.C2BV
    public C2BY A6l(Object obj, float f) {
        return new C2BX(f, (C2BW) obj);
    }

    @Override // X.C2BV
    public Object AAO(String str) {
        for (C2BX c2bx : this.A01) {
            C2BW c2bw = c2bx.A01;
            if (str.equals(c2bw.A00)) {
                return c2bw;
            }
        }
        return new C2BW(str);
    }

    @Override // X.C2BV
    public String AAn(Object obj) {
        return ((C2BW) obj).A00;
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.C2BV
    public List AEi() {
        C000700j.A00();
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"plaintext_hash", "entry_weight"};
        C0CD c0cd = new C0CD(null, this.A00.A01(), false);
        try {
            Cursor A09 = c0cd.A02.A09("recent_gifs", strArr, null, null, "entry_weight DESC", "loadWeightedGifIdentifiersFromDB/QUERY_RECENT_GIFS");
            int columnIndexOrThrow = A09.getColumnIndexOrThrow("plaintext_hash");
            int columnIndexOrThrow2 = A09.getColumnIndexOrThrow("entry_weight");
            while (A09.moveToNext()) {
                arrayList.add(new C2BX(A09.getFloat(columnIndexOrThrow2), new C2BW(A09.getString(columnIndexOrThrow))));
            }
            A09.close();
            c0cd.close();
            this.A01 = arrayList;
            return this.A01;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    c0cd.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    @Override // X.C2BV
    public void AQl(List list) {
        C000700j.A00();
        this.A01 = new ArrayList(list);
        List<C2BX> list2 = this.A01;
        C2BQ c2bq = this.A00;
        C0CD c0cd = new C0CD(null, c2bq.A01(), true);
        try {
            C0CD c0cd2 = new C0CD(null, c2bq.A01(), true);
            c0cd2.A02.A01("recent_gifs", null, null);
            c0cd2.close();
            for (C2BX c2bx : list2) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("plaintext_hash", c2bx.A01.A00);
                contentValues.put("entry_weight", Float.valueOf(c2bx.A00));
                c0cd.A02.A04("recent_gifs", contentValues);
            }
            c0cd.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    c0cd.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }
}
