package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.06i  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C013106i {
    public static volatile C013106i A01;
    public final C05E A00;

    public C013106i(C05E c05e) {
        this.A00 = c05e;
    }

    public static final int A00(C0LU c0lu) {
        C0XT c0xt = c0lu.A00;
        if (c0xt != null) {
            int i = c0xt.A00;
            if (i == 1) {
                return 1;
            }
            if (i == 2) {
                return 3;
            }
        }
        return 0;
    }

    public static C013106i A01() {
        if (A01 == null) {
            synchronized (C013106i.class) {
                if (A01 == null) {
                    A01 = new C013106i(C05E.A00());
                }
            }
        }
        return A01;
    }

    public final ContentValues A02(C0LV c0lv) {
        ContentValues contentValues = new ContentValues();
        C1Q4 c1q4 = c0lv.A00;
        if (c1q4 == null) {
            return contentValues;
        }
        int i = 0;
        if (c1q4 != null && c1q4.A00 == 1) {
            i = 1;
        }
        contentValues.put("element_type", Integer.valueOf(i));
        contentValues.put("reply_values", c0lv.A00.A03);
        contentValues.put("reply_description", c0lv.A00.A01);
        return contentValues;
    }

    public final void A03(C05530Pc c05530Pc, long j, String str) {
        if (c05530Pc == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_row_id", Long.valueOf(j));
        contentValues.put("element_type", (Integer) 2);
        String A0n = C002701i.A0n(c05530Pc);
        if (!TextUtils.isEmpty(A0n)) {
            contentValues.put("element_content", A0n);
        }
        A0B(str, contentValues, j, 2);
    }

    public void A04(C05510Pa c05510Pa) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("element_type", (Integer) 2);
        contentValues.put("reply_values", c05510Pa.A0G());
        contentValues.put("reply_description", c05510Pa.A00);
        contentValues.put("message_row_id", Long.valueOf(c05510Pa.A0p));
        A0B("message_ui_elements_reply", contentValues, c05510Pa.A0p, 2);
    }

    public final void A05(C05510Pa c05510Pa, long j, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("element_type", (Integer) 2);
        contentValues.put("reply_values", c05510Pa.A0G());
        contentValues.put("reply_description", c05510Pa.A00);
        contentValues.put("message_row_id", Long.valueOf(j));
        A0B(str, contentValues, j, 2);
    }

    public void A06(C0LU c0lu) {
        if (c0lu.A00 == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_row_id", Long.valueOf(c0lu.A0p));
        contentValues.put("element_type", Integer.valueOf(A00(c0lu)));
        String A0o = C002701i.A0o(c0lu.A00);
        if (!TextUtils.isEmpty(A0o)) {
            contentValues.put("element_content", A0o);
        }
        A0B("message_ui_elements", contentValues, c0lu.A0p, A00(c0lu));
    }

    public void A07(C0LU c0lu, long j) {
        boolean z = c0lu.A09 == 2;
        StringBuilder A0P = C000200d.A0P("MessageUIElementsStore/insertOrUpdateQuotedMultiElementMessage/message in main storage; key=");
        A0P.append(c0lu.A0n);
        C000700j.A09(z, A0P.toString());
        if (c0lu.A00 == null) {
            return;
        }
        try {
            C0CD A04 = this.A00.A04();
            ContentValues contentValues = new ContentValues();
            contentValues.put("message_row_id", Long.valueOf(j));
            contentValues.put("element_type", Integer.valueOf(A00(c0lu)));
            String A0o = C002701i.A0o(c0lu.A00);
            if (!TextUtils.isEmpty(A0o)) {
                contentValues.put("element_content", A0o);
            }
            A0B("message_quoted_ui_elements", contentValues, j, A00(c0lu));
            A04.close();
        } catch (SQLiteConstraintException e) {
            StringBuilder sb = new StringBuilder("MessageUIElementsStore/insertOrUpdateQuotedMultiElementMessage/fail to insert. Error message is: ");
            sb.append(e);
            Log.e(sb.toString());
        }
    }

    public void A08(C0LV c0lv) {
        ContentValues A02 = A02(c0lv);
        A02.put("message_row_id", Long.valueOf(c0lv.A0p));
        long j = c0lv.A0p;
        C1Q4 c1q4 = c0lv.A00;
        int i = 0;
        if (c1q4 != null && c1q4.A00 == 1) {
            i = 1;
        }
        A0B("message_ui_elements_reply", A02, j, i);
    }

    public final void A09(C0LV c0lv, long j, String str) {
        ContentValues A02 = A02(c0lv);
        A02.put("message_row_id", Long.valueOf(j));
        C1Q4 c1q4 = c0lv.A00;
        int i = 0;
        if (c1q4 != null && c1q4.A00 == 1) {
            i = 1;
        }
        A0B(str, A02, j, i);
    }

    public final void A0A(String str, long j, AnonymousClass092 anonymousClass092) {
        C05530Pc A0Y;
        C0CD A03 = this.A00.A03();
        try {
            Cursor A07 = A03.A02.A07(str, new String[]{String.valueOf(j)});
            if (A07 != null) {
                if (A07.moveToFirst()) {
                    int i = A07.getInt(A07.getColumnIndex("element_type"));
                    String string = A07.getString(A07.getColumnIndex("element_content"));
                    if (i == 2 && (A0Y = C002701i.A0Y(string)) != null) {
                        anonymousClass092.A0h(A0Y);
                    }
                }
                A07.close();
            }
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

    public final void A0B(String str, ContentValues contentValues, long j, int i) {
        C0CD A04 = this.A00.A04();
        try {
            C0CE c0ce = A04.A02;
            if (c0ce.A00(str, contentValues, "element_type = ? AND message_row_id = ?", new String[]{String.valueOf(i), String.valueOf(j)}) == 0) {
                c0ce.A02(str, contentValues);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A04.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void A0C(String str, C05510Pa c05510Pa) {
        C000200d.A1L(C000200d.A0P("MessageUIElementsStore/fillReplyDataIfAvailable/message must have row_id set; key="), c05510Pa.A0n, c05510Pa.A0p > 0);
        try {
            Cursor A07 = this.A00.A03().A02.A07(str, new String[]{String.valueOf(c05510Pa.A0p)});
            if (A07 != null) {
                if (A07.moveToLast()) {
                    String string = A07.getString(A07.getColumnIndex("reply_values"));
                    String string2 = A07.getString(A07.getColumnIndex("reply_description"));
                    c05510Pa.A0l(string);
                    c05510Pa.A00 = string2;
                }
                A07.close();
            }
        } finally {
        }
    }

    public final void A0D(String str, C0LU c0lu) {
        C0XT A0a;
        C0CD A03 = this.A00.A03();
        try {
            Cursor A07 = A03.A02.A07(str, new String[]{String.valueOf(c0lu.A0p)});
            if (A07 != null) {
                if (A07.moveToFirst()) {
                    int i = A07.getInt(A07.getColumnIndex("element_type"));
                    String string = A07.getString(A07.getColumnIndex("element_content"));
                    if ((i == 1 || i == 3) && (A0a = C002701i.A0a(string)) != null) {
                        c0lu.A00 = A0a;
                        c0lu.A1B();
                    }
                }
                A07.close();
            }
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

    public final void A0E(String str, C0LV c0lv) {
        C000200d.A1L(C000200d.A0P("MessageUIElementsStore/fillReplyDataIfAvailable/message must have row_id set; key="), c0lv.A0n, c0lv.A0p > 0);
        try {
            Cursor A07 = this.A00.A03().A02.A07(str, new String[]{String.valueOf(c0lv.A0p)});
            if (A07 != null) {
                if (A07.moveToLast()) {
                    c0lv.A00 = new C1Q4(A07.getString(A07.getColumnIndex("reply_values")), A07.getString(A07.getColumnIndex("reply_description")), A07.getInt(A07.getColumnIndex("element_type")) != 1 ? 0 : 1);
                }
                A07.close();
            }
        } finally {
        }
    }
}
