package X;

import android.text.TextUtils;
import com.whatsapp.TextData;

/* renamed from: X.06Q  reason: invalid class name */
/* loaded from: classes.dex */
public class C06Q {
    public static volatile C06Q A05;
    public final C05A A00;
    public final C05E A01;
    public final C05C A02;
    public final C05L A03;
    public final C06I A04;

    public C06Q(C05A c05a, C05C c05c, C05L c05l, C05E c05e, C06I c06i) {
        this.A00 = c05a;
        this.A02 = c05c;
        this.A03 = c05l;
        this.A04 = c06i;
        this.A01 = c05e;
    }

    public static C06Q A00() {
        if (A05 == null) {
            synchronized (C06Q.class) {
                if (A05 == null) {
                    C05A A00 = C05A.A00();
                    C01B.A00();
                    A05 = new C06Q(A00, C05C.A00(), C05L.A00(), C05E.A00(), C06I.A00());
                }
            }
        }
        return A05;
    }

    public static void A01(C0JJ c0jj, C0CF c0cf) {
        c0cf.A04(1, c0jj.A0p);
        if (!TextUtils.isEmpty(c0jj.A02)) {
            c0cf.A05(2, c0jj.A02);
        } else {
            c0cf.A02(2);
        }
        if (!TextUtils.isEmpty(c0jj.A04)) {
            c0cf.A05(3, c0jj.A04);
        } else {
            c0cf.A02(3);
        }
        if (!TextUtils.isEmpty(c0jj.A05)) {
            c0cf.A05(4, c0jj.A05);
        } else {
            c0cf.A02(4);
        }
        TextData textData = c0jj.A01;
        if (textData != null) {
            c0cf.A04(5, textData.fontStyle);
            c0cf.A04(6, c0jj.A01.textColor);
            c0cf.A04(7, c0jj.A01.backgroundColor);
        } else {
            c0cf.A02(5);
            c0cf.A02(6);
            c0cf.A02(7);
        }
        c0cf.A04(8, c0jj.A00);
    }

    public void A02(AnonymousClass092 anonymousClass092, long j, boolean z) {
        StringBuilder A0P = C000200d.A0P("TextMessageStore/insertOrUpdateQuotedTextMessage/message must be a text message; key=");
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        C000200d.A1L(A0P, anonymousClass094, anonymousClass092 instanceof C0JJ);
        boolean z2 = j > 0;
        StringBuilder A0P2 = C000200d.A0P("TextMessageStore/insertOrUpdateQuotedTextMessage/message must have row_id set; key=");
        A0P2.append(anonymousClass094);
        C000700j.A09(z2, A0P2.toString());
        C000200d.A1L(C000200d.A0P("TextMessageStore/insertOrUpdateQuotedTextMessage/message in main storage; key="), anonymousClass094, anonymousClass092.A09 == 2);
        C0JJ c0jj = (C0JJ) anonymousClass092;
        if (z) {
            A03(c0jj, j, true);
        } else {
            A03(c0jj, j, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0008, code lost:
        if (r1 == 0) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A03(X.C0JJ r8, long r9, boolean r11) {
        /*
            r7 = this;
            byte[] r0 = r8.A1D()
            if (r0 == 0) goto La
            int r1 = r0.length
            r0 = 1
            if (r1 != 0) goto Lb
        La:
            r0 = 0
        Lb:
            r3 = 1
            if (r0 == 0) goto L74
            X.05E r0 = r7.A01
            X.0CD r6 = r0.A04()
            X.05L r5 = r7.A03     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = "UPDATE message_quoted_text   SET message_row_id = ?,       thumbnail = ? WHERE message_row_id = ?"
            X.0CF r2 = r5.A01(r0)     // Catch: java.lang.Throwable -> L6d
            r2.A04(r3, r9)     // Catch: java.lang.Throwable -> L6d
            byte[] r1 = r8.A1D()     // Catch: java.lang.Throwable -> L6d
            r4 = 2
            if (r1 != 0) goto L38
            r2.A02(r4)     // Catch: java.lang.Throwable -> L6d
        L29:
            r1 = 3
            java.lang.String r0 = java.lang.Long.toString(r9)     // Catch: java.lang.Throwable -> L6d
            r2.A05(r1, r0)     // Catch: java.lang.Throwable -> L6d
            int r0 = r2.A00()     // Catch: java.lang.Throwable -> L6d
            if (r0 != r3) goto L42
            goto L3e
        L38:
            android.database.sqlite.SQLiteStatement r0 = r2.A00     // Catch: java.lang.Throwable -> L6d
            r0.bindBlob(r4, r1)     // Catch: java.lang.Throwable -> L6d
            goto L29
        L3e:
            r6.close()
            return
        L42:
            java.lang.String r0 = "INSERT INTO message_quoted_text(    message_row_id,    thumbnail) VALUES (?, ?)"
            X.0CF r2 = r5.A01(r0)     // Catch: java.lang.Throwable -> L6d
            r2.A04(r3, r9)     // Catch: java.lang.Throwable -> L6d
            byte[] r1 = r8.A1D()     // Catch: java.lang.Throwable -> L6d
            if (r1 != 0) goto L5d
            r2.A02(r4)     // Catch: java.lang.Throwable -> L6d
        L54:
            long r1 = r2.A01()     // Catch: java.lang.Throwable -> L6d
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 == 0) goto L64
            goto L63
        L5d:
            android.database.sqlite.SQLiteStatement r0 = r2.A00     // Catch: java.lang.Throwable -> L6d
            r0.bindBlob(r4, r1)     // Catch: java.lang.Throwable -> L6d
            goto L54
        L63:
            r3 = 0
        L64:
            java.lang.String r0 = "TextMessageStore/insertOrUpdateQuotedTextMessage/inserted row should have same row_id"
            X.C000700j.A0A(r3, r0)     // Catch: java.lang.Throwable -> L6d
            r6.close()
            return
        L6d:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L6f
        L6f:
            r0 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L73
        L73:
            throw r0
        L74:
            if (r11 == 0) goto L95
            X.05E r0 = r7.A01
            X.0CD r2 = r0.A04()
            X.05L r1 = r7.A03     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = "DELETE FROM message_quoted_text WHERE message_row_id=?"
            X.0CF r0 = r1.A01(r0)     // Catch: java.lang.Throwable -> L8b
            r0.A04(r3, r9)     // Catch: java.lang.Throwable -> L8b
            r0.A00()     // Catch: java.lang.Throwable -> L8b
            goto L92
        L8b:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L8d
        L8d:
            r0 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L91
        L91:
            throw r0
        L92:
            r2.close()
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06Q.A03(X.0JJ, long, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r8.A00 != 0) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A04(X.C0JJ r8, boolean r9) {
        /*
            r7 = this;
            java.lang.String r0 = r8.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L21
            java.lang.String r0 = r8.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L21
            java.lang.String r0 = r8.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L21
            com.whatsapp.TextData r0 = r8.A01
            if (r0 != 0) goto L21
            int r1 = r8.A00
            r0 = 0
            if (r1 == 0) goto L22
        L21:
            r0 = 1
        L22:
            r4 = 1
            if (r0 == 0) goto L70
            X.05E r0 = r7.A01     // Catch: android.database.sqlite.SQLiteConstraintException -> L52
            X.0CD r3 = r0.A04()     // Catch: android.database.sqlite.SQLiteConstraintException -> L52
            X.05L r1 = r7.A03     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = "INSERT INTO message_text(    message_row_id,    description,    page_title,    url,    font_style,    text_color,    background_color,    preview_type) VALUES (?, ?, ?, ?, ?, ?, ?, ?)"
            X.0CF r0 = r1.A01(r0)     // Catch: java.lang.Throwable -> L4b
            A01(r8, r0)     // Catch: java.lang.Throwable -> L4b
            long r5 = r0.A01()     // Catch: java.lang.Throwable -> L4b
            long r1 = r8.A0p     // Catch: java.lang.Throwable -> L4b
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto L42
            r1 = 1
        L42:
            java.lang.String r0 = "TextMessageStore/insertOrUpdateTextMessage/inserted row should has same row_id"
            X.C000700j.A0A(r1, r0)     // Catch: java.lang.Throwable -> L4b
            r3.close()     // Catch: android.database.sqlite.SQLiteConstraintException -> L52
            goto L93
        L4b:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L4d
        L4d:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L51
        L51:
            throw r0     // Catch: android.database.sqlite.SQLiteConstraintException -> L52
        L52:
            r5 = move-exception
            X.05L r1 = r7.A03
            java.lang.String r0 = "UPDATE message_text   SET message_row_id = ?,       description = ?,       page_title = ?,       url = ?,       font_style = ?,       text_color = ?,       background_color = ?,       preview_type = ? WHERE message_row_id = ?"
            X.0CF r3 = r1.A01(r0)
            A01(r8, r3)
            r2 = 9
            long r0 = r8.A0p
            java.lang.String r0 = java.lang.Long.toString(r0)
            r3.A05(r2, r0)
            int r0 = r3.A00()
            if (r0 == r4) goto L93
            throw r5
        L70:
            if (r9 == 0) goto L93
            X.05E r0 = r7.A01
            X.0CD r3 = r0.A04()
            X.05L r1 = r7.A03     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = "DELETE FROM message_text WHERE message_row_id=?"
            X.0CF r2 = r1.A01(r0)     // Catch: java.lang.Throwable -> L89
            long r0 = r8.A0p     // Catch: java.lang.Throwable -> L89
            r2.A04(r4, r0)     // Catch: java.lang.Throwable -> L89
            r2.A00()     // Catch: java.lang.Throwable -> L89
            goto L90
        L89:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L8b
        L8b:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L8f
        L8f:
            throw r0
        L90:
            r3.close()
        L93:
            byte[] r1 = r8.A1D()
            if (r1 == 0) goto La2
            int r0 = r1.length
            if (r0 == 0) goto La2
            X.06I r0 = r7.A04
            r0.A0A(r1, r8)
        La1:
            return
        La2:
            if (r9 == 0) goto La1
            X.06I r0 = r7.A04
            r0.A07(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06Q.A04(X.0JJ, boolean):void");
    }

    public boolean A05() {
        return this.A00.A0G() && this.A02.A01("text_ready", 0L) == 1;
    }

    public final boolean A06(C0JJ c0jj) {
        if (A05()) {
            boolean z = c0jj.A0p > 0;
            StringBuilder A0P = C000200d.A0P("TextMessageStore/isValidMessage/message must have row_id set; key=");
            AnonymousClass094 anonymousClass094 = c0jj.A0n;
            C000200d.A1L(A0P, anonymousClass094, z);
            C000200d.A1L(C000200d.A0P("TextMessageStore/isValidMessage/message in main storage; key="), anonymousClass094, c0jj.A09 == 1);
            return true;
        }
        return false;
    }
}
