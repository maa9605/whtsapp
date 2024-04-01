package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;

/* renamed from: X.1u9  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41561u9 {
    public static volatile C41561u9 A0Y;
    public final C02L A00;
    public final AnonymousClass012 A01;
    public final C06T A02;
    public final C05Q A03;
    public final C05A A04;
    public final C05M A05;
    public final C0C9 A06;
    public final AnonymousClass078 A07;
    public final AnonymousClass073 A08;
    public final C013206j A09;
    public final C0EO A0A;
    public final C05B A0B;
    public final C0H3 A0C;
    public final C05S A0D;
    public final C012406b A0E;
    public final C0E8 A0F;
    public final C00A A0G;
    public final C05E A0H;
    public final C013106i A0I;
    public final C06R A0J;
    public final AnonymousClass074 A0K;
    public final C42761wH A0L;
    public final C014706y A0M;
    public final C0EB A0N;
    public final C012906g A0O;
    public final C06I A0P;
    public final C06S A0Q;
    public final C03880Hm A0R;
    public final AnonymousClass011 A0S;
    public final C42451vl A0T;
    public final C0EN A0U;
    public final C41521u3 A0V;
    public final C05U A0W;
    public final Object A0X = new Object();

    public C41561u9(AnonymousClass012 anonymousClass012, C05B c05b, C05A c05a, C02L c02l, C05M c05m, AnonymousClass011 anonymousClass011, C0EB c0eb, C0EN c0en, C0EO c0eo, C42761wH c42761wH, C41521u3 c41521u3, C05U c05u, C03880Hm c03880Hm, C0C9 c0c9, C05S c05s, C00A c00a, C06R c06r, C06S c06s, C06T c06t, C05Q c05q, C012406b c012406b, C05E c05e, C014706y c014706y, C42451vl c42451vl, C012906g c012906g, AnonymousClass073 anonymousClass073, C06I c06i, C013106i c013106i, C013206j c013206j, AnonymousClass074 anonymousClass074, AnonymousClass078 anonymousClass078, C0E8 c0e8, C0H3 c0h3) {
        this.A01 = anonymousClass012;
        this.A0B = c05b;
        this.A04 = c05a;
        this.A00 = c02l;
        this.A05 = c05m;
        this.A0S = anonymousClass011;
        this.A0N = c0eb;
        this.A0U = c0en;
        this.A0A = c0eo;
        this.A0L = c42761wH;
        this.A0V = c41521u3;
        this.A0W = c05u;
        this.A0R = c03880Hm;
        this.A06 = c0c9;
        this.A0D = c05s;
        this.A0G = c00a;
        this.A0J = c06r;
        this.A0Q = c06s;
        this.A02 = c06t;
        this.A03 = c05q;
        this.A0E = c012406b;
        this.A0H = c05e;
        this.A0M = c014706y;
        this.A0T = c42451vl;
        this.A0O = c012906g;
        this.A08 = anonymousClass073;
        this.A0P = c06i;
        this.A0I = c013106i;
        this.A09 = c013206j;
        this.A0K = anonymousClass074;
        this.A07 = anonymousClass078;
        this.A0F = c0e8;
        this.A0C = c0h3;
    }

    public static C41561u9 A00() {
        if (A0Y == null) {
            synchronized (C41561u9.class) {
                if (A0Y == null) {
                    A0Y = new C41561u9(AnonymousClass012.A00(), C05B.A00(), C05A.A00(), C02L.A00(), C05M.A00(), AnonymousClass011.A00(), C0EB.A00(), C0EN.A00(), C0EO.A00(), C42761wH.A00(), C41521u3.A00(), C05U.A01(), C03880Hm.A00(), C0C9.A00(), C05S.A00(), C00A.A00, C06R.A00(), C06S.A00(), C06T.A02, C05Q.A00(), C012406b.A00(), C05E.A00(), C014706y.A00(), C42451vl.A00(), C012906g.A01(), AnonymousClass073.A00(), C06I.A00(), C013106i.A01(), C013206j.A00(), AnonymousClass074.A00(), AnonymousClass078.A00(), C0E8.A00(), C0H3.A00());
                }
            }
        }
        return A0Y;
    }

    public C42771wI A01(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndexOrThrow("key_id"));
        boolean z = cursor.getLong(cursor.getColumnIndexOrThrow("from_me")) > 0;
        AbstractC005302j A08 = this.A04.A08(cursor.getLong(cursor.getColumnIndexOrThrow("chat_row_id")));
        if (A08 == null) {
            return null;
        }
        cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
        return new C42771wI(new AnonymousClass094(A08, z, string), (AbstractC005302j) this.A0B.A07(AbstractC005302j.class, cursor.getLong(cursor.getColumnIndexOrThrow("sender_jid_row_id"))), cursor.getLong(cursor.getColumnIndexOrThrow("timestamp")), cursor.getInt(cursor.getColumnIndexOrThrow("message_type")), cursor.getString(cursor.getColumnIndexOrThrow("revoked_key_id")), cursor.getInt(cursor.getColumnIndexOrThrow("retry_count")));
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x013a, code lost:
        if (r6.A09 != 1) goto L342;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A02(int r33, X.C03890Hn r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 2146
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41561u9.A02(int, X.0Hn, boolean, boolean):void");
    }

    public final void A03(C42771wI c42771wI) {
        C42771wI A01;
        AnonymousClass094 anonymousClass094 = c42771wI.A04;
        C05A c05a = this.A04;
        AbstractC005302j abstractC005302j = anonymousClass094.A00;
        if (abstractC005302j != null) {
            String l = Long.toString(c05a.A05(abstractC005302j));
            AbstractC005302j abstractC005302j2 = c42771wI.A03;
            String l2 = abstractC005302j2 == null ? "" : Long.toString(this.A0B.A02(abstractC005302j2));
            C0CD A03 = this.A0H.A03();
            try {
                C03790Hb A00 = A03.A00();
                C0CE c0ce = A03.A02;
                String[] strArr = new String[4];
                String str = anonymousClass094.A01;
                strArr[0] = str;
                boolean z = anonymousClass094.A02;
                strArr[1] = String.valueOf(z ? 1 : 0);
                strArr[2] = l;
                strArr[3] = l2;
                Cursor A07 = c0ce.A07("SELECT _id, key_id, from_me, chat_row_id, sender_jid_row_id, timestamp, message_type, revoked_key_id, retry_count  FROM message_orphaned_edit WHERE key_id = ? AND from_me = ? AND chat_row_id = ? AND sender_jid_row_id = ?", strArr);
                if (!A07.moveToLast() || (A01 = A01(A07)) == null || (A01.A01 == 1 && c42771wI.A01 == 0)) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("key_id", str);
                    contentValues.put("from_me", Integer.valueOf(z ? 1 : 0));
                    if (abstractC005302j != null) {
                        contentValues.put("chat_row_id", Long.valueOf(c05a.A05(abstractC005302j)));
                        contentValues.put("sender_jid_row_id", Long.valueOf(abstractC005302j2 == null ? 0L : this.A0B.A02(abstractC005302j2)));
                        contentValues.put("timestamp", Long.valueOf(c42771wI.A02));
                        contentValues.put("message_type", Integer.valueOf(c42771wI.A01));
                        contentValues.put("revoked_key_id", c42771wI.A05);
                        contentValues.put("retry_count", Integer.valueOf(c42771wI.A00));
                        c0ce.A04("message_orphaned_edit", contentValues);
                    } else {
                        throw null;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("msgstore/skipping-edit-store old message exists; msg.key=");
                    sb.append(anonymousClass094);
                    Log.i(sb.toString());
                }
                A00.A00();
                A07.close();
                A00.close();
                A03.close();
            } finally {
            }
        } else {
            throw null;
        }
    }

    public void A04(C03890Hn c03890Hn, boolean z) {
        String str;
        StringBuilder A0P = C000200d.A0P("msgstore/edit/revoke ");
        AnonymousClass094 anonymousClass094 = c03890Hn.A0n;
        if (anonymousClass094.A02) {
            StringBuilder sb = new StringBuilder("send deleteMedia=");
            sb.append(z);
            str = sb.toString();
        } else {
            str = "recv";
        }
        A0P.append(str);
        A0P.append(" key=");
        A0P.append(anonymousClass094);
        Log.i(A0P.toString());
        A02(-1, c03890Hn, true, z);
    }
}
