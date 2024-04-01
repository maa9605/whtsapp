package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1wJ */
/* loaded from: classes2.dex */
public class C42781wJ {
    public static volatile C42781wJ A04;
    public final C06F A00 = new C06F(250);
    public final C05B A01;
    public final C05E A02;
    public final C05C A03;

    public C42781wJ(C05B c05b, C05C c05c, C05E c05e) {
        this.A01 = c05b;
        this.A03 = c05c;
        this.A02 = c05e;
    }

    public static C42781wJ A00() {
        if (A04 == null) {
            synchronized (C42781wJ.class) {
                if (A04 == null) {
                    A04 = new C42781wJ(C05B.A00(), C05C.A00(), C05E.A00());
                }
            }
        }
        return A04;
    }

    public C42801wL A01(long j) {
        Long valueOf;
        C42801wL c42801wL;
        C42801wL c42801wL2;
        C06F c06f = this.A00;
        synchronized (c06f) {
            valueOf = Long.valueOf(j);
            c42801wL = (C42801wL) c06f.A04(valueOf);
        }
        if (c42801wL != null) {
            return c42801wL;
        }
        C05E c05e = this.A02;
        C0CD A03 = c05e.A03();
        try {
            synchronized (c06f) {
                c42801wL2 = new C42801wL();
                C0CD A032 = c05e.A03();
                Cursor A07 = A032.A02.A07("SELECT receipt_user_jid_row_id,receipt_timestamp,read_timestamp,played_timestamp FROM receipt_user WHERE message_row_id=?", new String[]{String.valueOf(j)});
                int columnIndexOrThrow = A07.getColumnIndexOrThrow("receipt_user_jid_row_id");
                int columnIndexOrThrow2 = A07.getColumnIndexOrThrow("receipt_timestamp");
                int columnIndexOrThrow3 = A07.getColumnIndexOrThrow("read_timestamp");
                int columnIndexOrThrow4 = A07.getColumnIndexOrThrow("played_timestamp");
                while (A07.moveToNext()) {
                    UserJid userJid = (UserJid) this.A01.A07(UserJid.class, A07.getLong(columnIndexOrThrow));
                    if (userJid != null) {
                        c42801wL2.A00.put(userJid, new C42811wM(A07.getLong(columnIndexOrThrow2), A07.getLong(columnIndexOrThrow3), A07.getLong(columnIndexOrThrow4)));
                    }
                }
                A07.close();
                A032.close();
                c06f.A08(valueOf, c42801wL2);
            }
            return c42801wL2;
        } finally {
        }
    }

    public void A02(long j, UserJid userJid, int i, long j2) {
        String str;
        if (!A03()) {
            if (j > 0) {
                String A02 = this.A03.A02("migration_receipt_index");
                if (j >= (A02 == null ? 0L : Long.parseLong(A02))) {
                    return;
                }
            } else {
                return;
            }
        }
        if (!A01(j).A02(userJid, i, j2)) {
            return;
        }
        StringBuilder sb = new StringBuilder("receiptuserstore/insertOrUpdateUserReceiptForMessage/rowId=");
        sb.append(j);
        sb.append("; status=");
        sb.append(i);
        sb.append(" timestamp=");
        sb.append(j2);
        Log.i(sb.toString());
        ContentValues contentValues = new ContentValues(1);
        if (i == 5) {
            str = "receipt_timestamp";
        } else if (i == 8) {
            str = "played_timestamp";
        } else if (i != 13) {
            throw new IllegalArgumentException(C000200d.A0E("Unexpected message status ", i, " for user receipt"));
        } else {
            str = "read_timestamp";
        }
        contentValues.put(str, Long.valueOf(j2));
        C0CD A042 = this.A02.A04();
        try {
            C03790Hb A00 = A042.A00();
            long A022 = this.A01.A02(userJid);
            C000700j.A0A(A022 != -1, "invalid jid");
            C0CE c0ce = A042.A02;
            if (c0ce.A00("receipt_user", contentValues, "message_row_id=? AND receipt_user_jid_row_id=?", new String[]{String.valueOf(j), String.valueOf(A022)}) == 0) {
                contentValues.put("message_row_id", Long.valueOf(j));
                contentValues.put("receipt_user_jid_row_id", Long.valueOf(A022));
                if (c0ce.A02("receipt_user", contentValues) == -1) {
                    Log.e("ReceiptUserStore/insertOrUpdateUserReceiptForMessage/insert failed");
                }
            }
            A00.A00();
            A00.close();
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A042.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public boolean A03() {
        String A02 = this.A03.A02("receipt_user_ready");
        return A02 != null && Integer.parseInt(A02) == 2;
    }
}
