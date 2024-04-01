package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.06Z  reason: invalid class name */
/* loaded from: classes.dex */
public class C06Z {
    public static volatile C06Z A03;
    public final C05B A00;
    public final C05E A01;
    public final C05L A02;

    public C06Z(C05B c05b, C05L c05l, C05E c05e) {
        this.A00 = c05b;
        this.A02 = c05l;
        this.A01 = c05e;
    }

    public static C06Z A00() {
        if (A03 == null) {
            synchronized (C06Z.class) {
                if (A03 == null) {
                    A03 = new C06Z(C05B.A00(), C05L.A00(), C05E.A00());
                }
            }
        }
        return A03;
    }

    public void A01(C10040fC c10040fC, long j) {
        C000200d.A1L(C000200d.A0P("CatalogMessageStore/insertOrUpdateQuotedCatalogMessage/message in main storage; key="), c10040fC.A0n, ((AnonymousClass092) c10040fC).A09 == 2);
        try {
            C0CD A04 = this.A01.A04();
            C0CF A01 = this.A02.A01("INSERT OR REPLACE INTO message_quoted_product(message_row_id, business_owner_jid, title, description) VALUES (?, ?, ?, ?)");
            A02(c10040fC, A01, j);
            C000700j.A0A(A01.A01() == j, "CatalogMessageStore/insertOrUpdateQuotedCatalogMessage/inserted row should have same row_id");
            A04.close();
        } catch (SQLiteConstraintException e) {
            StringBuilder sb = new StringBuilder("CatalogMessageStore/insertOrUpdateQuotedCatalogMessage/fail to insert. Error message is: ");
            sb.append(e);
            Log.e(sb.toString());
        }
    }

    public final void A02(C10040fC c10040fC, C0CF c0cf, long j) {
        c0cf.A04(1, j);
        UserJid userJid = c10040fC.A00;
        if (userJid != null) {
            c0cf.A04(2, this.A00.A02(userJid));
        }
        String str = c10040fC.A02;
        if (str == null) {
            c0cf.A02(3);
        } else {
            c0cf.A05(3, str);
        }
        String str2 = c10040fC.A01;
        if (str2 == null) {
            c0cf.A02(4);
        } else {
            c0cf.A05(4, str2);
        }
    }

    public final void A03(String str, C10040fC c10040fC) {
        C000200d.A1L(C000200d.A0P("CatalogMessageStore/fillCatalogDataIfAvailable/message must have row_id set; key="), c10040fC.A0n, c10040fC.A0p > 0);
        try {
            Cursor A07 = this.A01.A03().A02.A07(str, new String[]{String.valueOf(c10040fC.A0p)});
            if (A07 != null) {
                if (A07.moveToLast()) {
                    c10040fC.A00 = (UserJid) this.A00.A07(UserJid.class, A07.getLong(A07.getColumnIndexOrThrow("business_owner_jid")));
                    c10040fC.A02 = A07.getString(A07.getColumnIndexOrThrow("title"));
                    c10040fC.A01 = A07.getString(A07.getColumnIndexOrThrow("description"));
                }
                A07.close();
            }
        } finally {
        }
    }
}
