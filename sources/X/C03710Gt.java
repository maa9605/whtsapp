package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0Gt  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C03710Gt {
    public static volatile C03710Gt A06;
    public boolean A00 = false;
    public boolean A01 = false;
    public final C05A A02;
    public final C05M A03;
    public final C05E A04;
    public final C05O A05;

    public C03710Gt(C05A c05a, C05M c05m, C05O c05o, C05E c05e) {
        this.A02 = c05a;
        this.A03 = c05m;
        this.A05 = c05o;
        this.A04 = c05e;
    }

    public static C03710Gt A00() {
        if (A06 == null) {
            synchronized (C03710Gt.class) {
                if (A06 == null) {
                    A06 = new C03710Gt(C05A.A00(), C05M.A00(), C05O.A00(), C05E.A00());
                }
            }
        }
        return A06;
    }

    public int A01(AbstractC005302j abstractC005302j) {
        int i = 0;
        String[] strArr = {String.valueOf(this.A02.A05(abstractC005302j))};
        C0CD A03 = this.A04.A03();
        try {
            Cursor A07 = A03.A02.A07("SELECT COUNT(*)  FROM deleted_messages_ids_view WHERE chat_row_id = ? AND message_type != 8", strArr);
            if (A07 != null) {
                if (A07.moveToNext()) {
                    i = A07.getInt(0);
                    StringBuilder sb = new StringBuilder();
                    sb.append("msgstore/countmessagestodelete/count: ");
                    sb.append(i);
                    Log.i(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("msgstore/countmessagestodelete/db no message for ");
                    sb2.append(abstractC005302j);
                    Log.i(sb2.toString());
                }
                A07.close();
            } else {
                Log.e("msgstore/getmessagesatid/cursor is null");
            }
            A03.close();
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A03.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public final C03870Hl A02(long j) {
        C0CD A03 = this.A04.A03();
        try {
            Cursor A07 = A03.A02.A07("SELECT _id, chat_row_id, block_size, deleted_message_row_id, deleted_starred_message_row_id, deleted_messages_remove_files, deleted_categories_message_row_id, deleted_categories_starred_message_row_id, deleted_categories_remove_files, deleted_message_categories  FROM deleted_chat_job WHERE chat_row_id=? ORDER BY _id DESC LIMIT 1", new String[]{Long.toString(j)});
            if (A07 != null) {
                if (A07.moveToFirst()) {
                    C03870Hl A032 = A03(A07);
                    A07.close();
                    A03.close();
                    return A032;
                }
                A07.close();
            }
            A03.close();
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A03.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public final C03870Hl A03(Cursor cursor) {
        long j = cursor.getLong(1);
        AbstractC005302j A08 = this.A02.A08(j);
        if (A08 == null) {
            return null;
        }
        return new C03870Hl(cursor.getLong(cursor.getColumnIndexOrThrow("_id")), j, A08, cursor.getInt(cursor.getColumnIndexOrThrow("block_size")), Math.max(cursor.getLong(cursor.getColumnIndexOrThrow("deleted_message_row_id")), 1L), Math.max(cursor.getLong(cursor.getColumnIndexOrThrow("deleted_starred_message_row_id")), 1L), cursor.getInt(cursor.getColumnIndexOrThrow("deleted_messages_remove_files")) != 0, Math.max(cursor.getLong(cursor.getColumnIndexOrThrow("deleted_categories_message_row_id")), 1L), Math.max(cursor.getLong(cursor.getColumnIndexOrThrow("deleted_categories_starred_message_row_id")), 1L), cursor.getInt(cursor.getColumnIndexOrThrow("deleted_categories_remove_files")) != 0, cursor.getString(cursor.getColumnIndexOrThrow("deleted_message_categories")), false);
    }

    public final C03870Hl A04(C03870Hl c03870Hl) {
        long A02;
        C0CD A04 = this.A04.A04();
        try {
            try {
                C03790Hb A00 = A04.A00();
                try {
                    long j = c03870Hl.A01;
                    AbstractC005302j A08 = this.A02.A08(j);
                    if (A08 == null) {
                        A00.close();
                        A04.close();
                        return null;
                    }
                    int i = c03870Hl.A00;
                    C0IT A07 = this.A03.A07(A08);
                    C03870Hl A022 = A02(j);
                    if (A022 != null && !TextUtils.isEmpty(c03870Hl.A08) && !TextUtils.isEmpty(A022.A08)) {
                        A00.close();
                        A04.close();
                        return null;
                    }
                    long j2 = c03870Hl.A04;
                    long j3 = c03870Hl.A05;
                    boolean z = c03870Hl.A0A;
                    long j4 = c03870Hl.A02;
                    long j5 = c03870Hl.A03;
                    boolean z2 = c03870Hl.A09;
                    String str = c03870Hl.A08;
                    String str2 = str;
                    if (A022 != null) {
                        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(A022.A08)) {
                            A00.close();
                            A04.close();
                            return null;
                        }
                        String str3 = A022.A08;
                        if (!TextUtils.isEmpty(str3)) {
                            str2 = str3;
                            z2 = A022.A09;
                        }
                        try {
                            j2 = Math.max(j2, A022.A04);
                            j3 = Math.max(j3, A022.A05);
                            j4 = Math.max(j4, A022.A02);
                            j5 = Math.max(j5, A022.A03);
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                    ContentValues contentValues = new ContentValues(9);
                    contentValues.put("chat_row_id", Long.valueOf(j));
                    contentValues.put("block_size", Integer.valueOf(i));
                    contentValues.put("deleted_message_row_id", Long.valueOf(j2));
                    contentValues.put("deleted_starred_message_row_id", Long.valueOf(j3));
                    contentValues.put("deleted_messages_remove_files", Boolean.valueOf(z));
                    contentValues.put("deleted_categories_message_row_id", Long.valueOf(j4));
                    contentValues.put("deleted_categories_starred_message_row_id", Long.valueOf(j5));
                    contentValues.put("deleted_message_categories", str2);
                    contentValues.put("deleted_categories_remove_files", Boolean.valueOf(z2));
                    try {
                        C0CE c0ce = A04.A02;
                        A02 = c0ce.A02("deleted_chat_job", contentValues);
                        if (A022 != null) {
                            c0ce.A01("deleted_chat_job", "_id = ?", new String[]{Long.toString(A022.A06)});
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("msgstore/deletemsgs/mark jid:");
                        sb.append(A08);
                        sb.append(" lastDeletedMessageId:");
                        sb.append(j2);
                        sb.append(" lastDeletedStarredMessageId:");
                        sb.append(j3);
                        Log.i(sb.toString());
                        if (A02 > 0 && A07 != null) {
                            synchronized (A07) {
                                A07.A0C = j2;
                                A07.A0D = j3;
                                A07.A0A = j4;
                                A07.A0B = j5;
                                A07.A0Q = str2;
                            }
                        }
                        A00.A00();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        C03870Hl c03870Hl2 = new C03870Hl(A02, j, A08, i, j2, j3, z, j4, j5, z2, str2, false);
                        A00.close();
                        A04.close();
                        return c03870Hl2;
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                try {
                    throw th;
                } catch (Throwable th6) {
                    try {
                        A04.close();
                    } catch (Throwable unused) {
                    }
                    throw th6;
                }
            }
        } catch (Throwable th7) {
            th = th7;
            throw th;
        }
    }

    public C03870Hl A05(AbstractC005302j abstractC005302j, boolean z, Long l, boolean z2) {
        long max;
        long j;
        boolean z3;
        long j2;
        long j3;
        boolean z4 = z2;
        C0CD A04 = this.A04.A04();
        try {
            C03790Hb A00 = A04.A00();
            long A05 = this.A02.A05(abstractC005302j);
            if (l != null) {
                max = l.longValue();
            } else {
                C0IT A07 = this.A03.A07(abstractC005302j);
                max = Math.max(this.A05.A07(abstractC005302j), A07 != null ? A07.A0G : 1L);
            }
            if (TextUtils.isEmpty(null)) {
                j3 = z ? max : 1L;
                j2 = 1;
                j = 1;
                z3 = false;
            } else {
                j = z ? max : 1L;
                z3 = z4;
                j2 = max;
                z4 = false;
                max = 1;
                j3 = 1;
            }
            C03870Hl A042 = A04(new C03870Hl(-1L, A05, abstractC005302j, 100, max, j3, z4, j2, j, z3, null, false));
            if (A042 != null) {
                A00.A00();
            }
            A00.close();
            return A042;
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

    public Set A06() {
        HashSet hashSet = new HashSet();
        C0CD A03 = this.A04.A03();
        try {
            Cursor A07 = A03.A02.A07("SELECT DISTINCT chat_row_id FROM deleted_chat_job", null);
            if (A07 != null) {
                while (A07.moveToNext()) {
                    AbstractC005302j A08 = this.A02.A08(A07.getLong(0));
                    if (A08 != null) {
                        hashSet.add(A08);
                    }
                }
            }
            if (A07 != null) {
                A07.close();
            }
            return hashSet;
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

    public void A07(C03870Hl c03870Hl) {
        C05M c05m = this.A03;
        AbstractC005302j abstractC005302j = c03870Hl.A07;
        C0IT A07 = c05m.A07(abstractC005302j);
        C0CD A04 = this.A04.A04();
        try {
            A04.A02.A01("deleted_chat_job", "_id=?", new String[]{String.valueOf(c03870Hl.A06)});
            if (A07 != null && A02(c03870Hl.A01) == null) {
                synchronized (A07) {
                    A07.A0C = 1L;
                    A07.A0D = 1L;
                    A07.A0A = 1L;
                    A07.A0B = 1L;
                    A07.A0Q = null;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore/deletemsgs/unmark jid:");
            sb.append(abstractC005302j);
            Log.i(sb.toString());
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
