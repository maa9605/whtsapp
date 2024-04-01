package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.06R  reason: invalid class name */
/* loaded from: classes.dex */
public class C06R {
    public static volatile C06R A03;
    public final C05B A00;
    public final C05E A01;
    public final C05L A02;

    public C06R(C05B c05b, C05L c05l, C05E c05e) {
        this.A00 = c05b;
        this.A02 = c05l;
        this.A01 = c05e;
    }

    public static C06R A00() {
        if (A03 == null) {
            synchronized (C06R.class) {
                if (A03 == null) {
                    A03 = new C06R(C05B.A00(), C05L.A00(), C05E.A00());
                }
            }
        }
        return A03;
    }

    public final void A01(long j, C0LN c0ln, C0CF c0cf) {
        c0cf.A04(1, j);
        String str = c0ln.A06;
        if (str == null) {
            c0cf.A02(2);
        } else {
            c0cf.A05(2, str);
        }
        String str2 = c0ln.A07;
        if (str2 == null) {
            c0cf.A02(4);
        } else {
            c0cf.A05(4, str2);
        }
        c0cf.A04(5, c0ln.A00);
        c0cf.A04(6, c0ln.A01);
        c0cf.A04(7, c0ln.A02);
        String str3 = c0ln.A05;
        if (str3 == null) {
            c0cf.A02(8);
        } else {
            c0cf.A05(8, str3);
        }
        UserJid userJid = c0ln.A03;
        if (userJid != null) {
            c0cf.A04(9, this.A00.A02(userJid));
        }
        String str4 = c0ln.A08;
        if (str4 == null) {
            c0cf.A02(10);
        } else {
            c0cf.A05(10, str4);
        }
        if (c0ln.A0E() != null) {
            byte[] A08 = c0ln.A0E().A08();
            if (A08 == null) {
                c0cf.A02(3);
            } else {
                c0cf.A00.bindBlob(3, A08);
            }
        }
        String str5 = c0ln.A04;
        if (str5 == null || c0ln.A09 == null) {
            return;
        }
        if (str5 == null) {
            c0cf.A02(11);
        } else {
            c0cf.A05(11, str5);
        }
        c0cf.A04(12, c0ln.A09.multiply(C06960Vv.A0B).longValue());
    }

    public void A02(C0LN c0ln) {
        try {
            C0CD A04 = this.A01.A04();
            C0CF A01 = this.A02.A01("INSERT INTO message_order(message_row_id, order_id, thumbnail, order_title, item_count, status, surface, message, seller_jid, token, currency_code,total_amount_1000) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            A01.A04(1, c0ln.A0p);
            String str = c0ln.A06;
            if (str == null) {
                A01.A02(2);
            } else {
                A01.A05(2, str);
            }
            String str2 = c0ln.A07;
            if (str2 == null) {
                A01.A02(4);
            } else {
                A01.A05(4, str2);
            }
            A01.A04(5, c0ln.A00);
            A01.A04(6, c0ln.A01);
            A01.A04(7, c0ln.A02);
            String str3 = c0ln.A05;
            if (str3 == null) {
                A01.A02(8);
            } else {
                A01.A05(8, str3);
            }
            UserJid userJid = c0ln.A03;
            if (userJid != null) {
                A01.A04(9, this.A00.A02(userJid));
            }
            String str4 = c0ln.A08;
            if (str4 == null) {
                A01.A02(10);
            } else {
                A01.A05(10, str4);
            }
            if (c0ln.A0E() != null) {
                byte[] A08 = c0ln.A0E().A08();
                if (A08 == null) {
                    A01.A02(3);
                } else {
                    A01.A00.bindBlob(3, A08);
                }
            }
            String str5 = c0ln.A04;
            if (str5 != null && c0ln.A09 != null) {
                if (str5 != null) {
                    A01.A05(11, str5);
                } else {
                    A01.A02(11);
                }
                A01.A04(12, c0ln.A09.multiply(C06960Vv.A0B).longValue());
            }
            C000700j.A0A(A01.A01() == c0ln.A0p, "OrderMessageStore/insertOrUpdateOrderMessage/inserted row should have same row_id");
            A04.close();
        } catch (SQLiteConstraintException e) {
            StringBuilder sb = new StringBuilder("OrderMessageStore/insertOrUpdateOrderMessage/fail to insert. Error message is: ");
            sb.append(e);
            Log.e(sb.toString());
        }
    }

    public void A03(C0LN c0ln, long j) {
        C000200d.A1L(C000200d.A0P("OrderMessageStore/insertOrUpdateQuotedOrderMessage/message in main storage; key="), c0ln.A0n, ((AnonymousClass092) c0ln).A09 == 2);
        try {
            C0CD A04 = this.A01.A04();
            C0CF A01 = this.A02.A01("INSERT INTO message_quoted_order(message_row_id, order_id, thumbnail, order_title, item_count, status, surface, message, seller_jid, token, currency_code,total_amount_1000) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            A01(j, c0ln, A01);
            C000700j.A0A(A01.A01() == j, "OrderMessageStore/insertOrUpdateQuotedOrderMessage/inserted row should have same row_id");
            A04.close();
        } catch (SQLiteConstraintException e) {
            StringBuilder sb = new StringBuilder("OrderMessageStore/insertOrUpdateQuotedOrderMessage/fail to insert. Error message is: ");
            sb.append(e);
            Log.e(sb.toString());
        }
    }

    public final void A04(String str, C0LN c0ln, boolean z) {
        C000200d.A1L(C000200d.A0P("OrderMessageStore/fillOrderDataIfAvailable/message must have row_id set; key="), c0ln.A0n, c0ln.A0p > 0);
        try {
            Cursor A07 = this.A01.A03().A02.A07(str, new String[]{String.valueOf(c0ln.A0p)});
            if (A07 != null) {
                if (A07.moveToLast()) {
                    C05B c05b = this.A00;
                    c0ln.A06 = A07.getString(A07.getColumnIndexOrThrow("order_id"));
                    c0ln.A07 = A07.getString(A07.getColumnIndexOrThrow("order_title"));
                    c0ln.A00 = A07.getInt(A07.getColumnIndexOrThrow("item_count"));
                    c0ln.A05 = A07.getString(A07.getColumnIndexOrThrow("message"));
                    c0ln.A01 = A07.getInt(A07.getColumnIndexOrThrow("status"));
                    c0ln.A02 = A07.getInt(A07.getColumnIndexOrThrow("surface"));
                    c0ln.A03 = (UserJid) c05b.A07(UserJid.class, A07.getLong(A07.getColumnIndexOrThrow("seller_jid")));
                    c0ln.A08 = A07.getString(A07.getColumnIndexOrThrow("token"));
                    String string = A07.getString(A07.getColumnIndexOrThrow("currency_code"));
                    c0ln.A04 = string;
                    if (!TextUtils.isEmpty(string)) {
                        try {
                            c0ln.A09 = C06960Vv.A02(new C09R(c0ln.A04), A07.getLong(A07.getColumnIndexOrThrow("total_amount_1000")));
                        } catch (IllegalArgumentException unused) {
                            c0ln.A04 = null;
                        }
                    }
                    byte[] blob = A07.getBlob(A07.getColumnIndexOrThrow("thumbnail"));
                    if (blob.length > 0) {
                        ((AnonymousClass092) c0ln).A01 = 1;
                        C03900Hp A0E = c0ln.A0E();
                        if (A0E != null) {
                            A0E.A04(blob, z);
                        }
                    }
                }
                A07.close();
            }
        } finally {
        }
    }
}
