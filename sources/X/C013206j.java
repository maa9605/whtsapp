package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.06j  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C013206j {
    public static volatile C013206j A03;
    public final C05A A00;
    public final C05B A01;
    public final C05E A02;

    public C013206j(C05B c05b, C05A c05a, C05E c05e) {
        this.A01 = c05b;
        this.A00 = c05a;
        this.A02 = c05e;
    }

    public static C013206j A00() {
        if (A03 == null) {
            synchronized (C013206j.class) {
                if (A03 == null) {
                    A03 = new C013206j(C05B.A00(), C05A.A00(), C05E.A00());
                }
            }
        }
        return A03;
    }

    public long A01(C011005l c011005l, UserJid userJid) {
        if (c011005l == null || userJid == null) {
            return -1L;
        }
        C05B c05b = this.A01;
        String[] strArr = {Long.toString(c05b.A02(c011005l)), Long.toString(c05b.A02(userJid))};
        C0CD A032 = this.A02.A03();
        try {
            Cursor A07 = A032.A02.A07("SELECT message_row_id FROM message_group_invite WHERE group_jid_row_id = ? AND admin_jid_row_id = ? AND expired = 0 ORDER BY invite_time DESC", strArr);
            if (!A07.moveToNext()) {
                A07.close();
                A032.close();
                return -1L;
            }
            long j = A07.getLong(A07.getColumnIndexOrThrow("message_row_id"));
            A07.close();
            A032.close();
            return j;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A032.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public long A02(C011005l c011005l, UserJid userJid) {
        if (c011005l == null || userJid == null) {
            return -1L;
        }
        String[] strArr = {Long.toString(this.A01.A02(c011005l)), Long.toString(this.A00.A05(userJid))};
        C0CD A032 = this.A02.A03();
        try {
            Cursor A07 = A032.A02.A07("SELECT invite.message_row_id AS message_row_id FROM message_group_invite invite INNER JOIN message_view message ON invite.message_row_id = message._id WHERE invite.group_jid_row_id = ? AND message.chat_row_id = ? AND invite.expired = 0 ORDER BY invite.invite_time DESC", strArr);
            if (!A07.moveToNext()) {
                A07.close();
                A032.close();
                return -1L;
            }
            long j = A07.getLong(A07.getColumnIndexOrThrow("message_row_id"));
            A07.close();
            A032.close();
            return j;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A032.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public final ContentValues A03(C04570Ky c04570Ky, long j) {
        String l;
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_row_id", Long.toString(j));
        C011005l c011005l = c04570Ky.A01;
        String str = null;
        if (c011005l == null) {
            l = null;
        } else {
            l = Long.toString(this.A01.A02(c011005l));
        }
        contentValues.put("group_jid_row_id", l);
        UserJid userJid = c04570Ky.A02;
        if (userJid != null) {
            str = Long.toString(this.A01.A02(userJid));
        }
        contentValues.put("admin_jid_row_id", str);
        contentValues.put("group_name", c04570Ky.A04);
        contentValues.put("invite_code", c04570Ky.A05);
        contentValues.put("expiration", Long.valueOf(c04570Ky.A00));
        contentValues.put("invite_time", Long.valueOf(c04570Ky.A0E));
        contentValues.put("expired", Integer.valueOf(c04570Ky.A06 ? 1 : 0));
        return contentValues;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0071, code lost:
        if (r1 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A04(X.C04570Ky r14) {
        /*
            r13 = this;
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]
            long r0 = r14.A0p
            java.lang.String r1 = java.lang.Long.toString(r0)
            r0 = 0
            r2[r0] = r1
            X.05E r0 = r13.A02
            X.0CD r6 = r0.A03()
            X.0CE r1 = r6.A02     // Catch: java.lang.Throwable -> L97
            java.lang.String r0 = "SELECT group_jid_row_id, admin_jid_row_id, group_name, invite_code, expiration , expired FROM message_group_invite WHERE message_row_id = ?"
            android.database.Cursor r7 = r1.A07(r0, r2)     // Catch: java.lang.Throwable -> L97
            boolean r0 = r7.moveToNext()     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L87
            java.lang.String r0 = "expiration"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L8e
            long r2 = r7.getLong(r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = "group_jid_row_id"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L8e
            long r4 = r7.getLong(r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = "admin_jid_row_id"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L8e
            long r0 = r7.getLong(r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r8 = "group_name"
            int r8 = r7.getColumnIndexOrThrow(r8)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r9 = r7.getString(r8)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r8 = "invite_code"
            int r8 = r7.getColumnIndexOrThrow(r8)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r8 = r7.getString(r8)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r10 = "expired"
            int r10 = r7.getColumnIndexOrThrow(r10)     // Catch: java.lang.Throwable -> L8e
            int r12 = r7.getInt(r10)     // Catch: java.lang.Throwable -> L8e
            X.05B r11 = r13.A01     // Catch: java.lang.Throwable -> L8e
            java.lang.Class<X.05l> r10 = X.C011005l.class
            com.whatsapp.jid.Jid r5 = r11.A07(r10, r4)     // Catch: java.lang.Throwable -> L8e
            X.05l r5 = (X.C011005l) r5     // Catch: java.lang.Throwable -> L8e
            java.lang.Class<com.whatsapp.jid.UserJid> r4 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r11.A07(r4, r0)     // Catch: java.lang.Throwable -> L8e
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch: java.lang.Throwable -> L8e
            if (r5 == 0) goto L73
            r0 = 1
            if (r1 != 0) goto L74
        L73:
            r0 = 0
        L74:
            X.C000700j.A07(r0)     // Catch: java.lang.Throwable -> L8e
            r0 = 0
            if (r12 == 0) goto L7b
            r0 = 1
        L7b:
            r14.A01 = r5     // Catch: java.lang.Throwable -> L8e
            r14.A02 = r1     // Catch: java.lang.Throwable -> L8e
            r14.A04 = r9     // Catch: java.lang.Throwable -> L8e
            r14.A05 = r8     // Catch: java.lang.Throwable -> L8e
            r14.A00 = r2     // Catch: java.lang.Throwable -> L8e
            r14.A06 = r0     // Catch: java.lang.Throwable -> L8e
        L87:
            r7.close()     // Catch: java.lang.Throwable -> L97
            r6.close()
            return
        L8e:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L90
        L90:
            r0 = move-exception
            if (r7 == 0) goto L96
            r7.close()     // Catch: java.lang.Throwable -> L96
        L96:
            throw r0     // Catch: java.lang.Throwable -> L97
        L97:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L99
        L99:
            r0 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L9d
        L9d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C013206j.A04(X.0Ky):void");
    }

    public void A05(C04570Ky c04570Ky) {
        C0CD A04 = this.A02.A04();
        try {
            A04.A02.A06("message_group_invite", A03(c04570Ky, c04570Ky.A0p), 5);
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

    public void A06(C04570Ky c04570Ky, long j) {
        C0CD A04 = this.A02.A04();
        try {
            A04.A02.A06("message_quoted_group_invite", A03(c04570Ky, j), 5);
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
}
