package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;

/* renamed from: X.06e  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C012706e {
    public static volatile C012706e A04;
    public final C05A A00;
    public final C05B A01;
    public final C05E A02;
    public final C05L A03;

    public C012706e(C05B c05b, C05A c05a, C05L c05l, C05E c05e) {
        this.A01 = c05b;
        this.A00 = c05a;
        this.A03 = c05l;
        this.A02 = c05e;
    }

    public static C012706e A00() {
        if (A04 == null) {
            synchronized (C012706e.class) {
                if (A04 == null) {
                    A04 = new C012706e(C05B.A00(), C05A.A00(), C05L.A00(), C05E.A00());
                }
            }
        }
        return A04;
    }

    public void A01(C04160Iu c04160Iu, long j) {
        C000200d.A1L(C000200d.A0P("ProductMessageStore/insertOrUpdateQuotedProductMessage/message in main storage; key="), c04160Iu.A0n, ((AnonymousClass092) c04160Iu).A09 == 2);
        try {
            C0CD A042 = this.A02.A04();
            C0CF A01 = this.A03.A01("INSERT OR REPLACE INTO message_quoted_product(message_row_id, business_owner_jid, product_id, title, description, currency_code, amount_1000, retailer_id, url, product_image_count, sale_amount_1000) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            A02(c04160Iu, A01, j);
            C000700j.A0A(A01.A01() == j, "ProductMessageStore/insertOrUpdateQuotedProductMessage/inserted row should have same row_id");
            A042.close();
        } catch (SQLiteConstraintException e) {
            StringBuilder sb = new StringBuilder("ProductMessageStore/insertOrUpdateQuotedProductMessage/fail to insert. Error message is: ");
            sb.append(e);
            Log.e(sb.toString());
        }
    }

    public final void A02(C04160Iu c04160Iu, C0CF c0cf, long j) {
        c0cf.A04(1, j);
        UserJid userJid = c04160Iu.A01;
        if (userJid != null) {
            c0cf.A04(2, this.A01.A02(userJid));
        }
        String str = c04160Iu.A04;
        if (str == null) {
            c0cf.A02(3);
        } else {
            c0cf.A05(3, str);
        }
        String str2 = c04160Iu.A07;
        if (str2 == null) {
            c0cf.A02(4);
        } else {
            c0cf.A05(4, str2);
        }
        String str3 = c04160Iu.A03;
        if (str3 == null) {
            c0cf.A02(5);
        } else {
            c0cf.A05(5, str3);
        }
        String str4 = c04160Iu.A02;
        if (str4 != null && c04160Iu.A08 != null) {
            if (str4 == null) {
                c0cf.A02(6);
            } else {
                c0cf.A05(6, str4);
            }
            BigDecimal bigDecimal = c04160Iu.A08;
            BigDecimal bigDecimal2 = C06960Vv.A0B;
            c0cf.A04(7, bigDecimal.multiply(bigDecimal2).longValue());
            BigDecimal bigDecimal3 = c04160Iu.A09;
            if (bigDecimal3 != null) {
                c0cf.A04(11, bigDecimal3.multiply(bigDecimal2).longValue());
            }
        }
        String str5 = c04160Iu.A06;
        if (str5 == null) {
            c0cf.A02(8);
        } else {
            c0cf.A05(8, str5);
        }
        String str6 = c04160Iu.A05;
        if (str6 == null) {
            c0cf.A02(9);
        } else {
            c0cf.A05(9, str6);
        }
        c0cf.A04(10, c04160Iu.A00);
    }

    public final void A03(String str, C04160Iu c04160Iu) {
        C000200d.A1L(C000200d.A0P("ProductMessageStore/fillProductDataIfAvailable/message must have row_id set; key="), c04160Iu.A0n, c04160Iu.A0p > 0);
        try {
            Cursor A07 = this.A02.A03().A02.A07(str, new String[]{String.valueOf(c04160Iu.A0p)});
            if (A07 != null) {
                if (A07.moveToLast()) {
                    c04160Iu.A01 = (UserJid) this.A01.A07(UserJid.class, A07.getLong(A07.getColumnIndexOrThrow("business_owner_jid")));
                    c04160Iu.A04 = A07.getString(A07.getColumnIndexOrThrow("product_id"));
                    c04160Iu.A07 = A07.getString(A07.getColumnIndexOrThrow("title"));
                    c04160Iu.A03 = A07.getString(A07.getColumnIndexOrThrow("description"));
                    String string = A07.getString(A07.getColumnIndexOrThrow("currency_code"));
                    c04160Iu.A02 = string;
                    if (!TextUtils.isEmpty(string)) {
                        try {
                            c04160Iu.A08 = C06960Vv.A02(new C09R(c04160Iu.A02), A07.getLong(A07.getColumnIndexOrThrow("amount_1000")));
                            c04160Iu.A09 = C06960Vv.A02(new C09R(c04160Iu.A02), A07.getLong(A07.getColumnIndexOrThrow("sale_amount_1000")));
                        } catch (IllegalArgumentException unused) {
                            c04160Iu.A02 = null;
                        }
                    }
                    c04160Iu.A06 = A07.getString(A07.getColumnIndexOrThrow("retailer_id"));
                    c04160Iu.A05 = A07.getString(A07.getColumnIndexOrThrow("url"));
                    c04160Iu.A00 = A07.getInt(A07.getColumnIndexOrThrow("product_image_count"));
                }
                A07.close();
            }
        } finally {
        }
    }
}
