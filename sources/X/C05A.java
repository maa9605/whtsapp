package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.05A */
/* loaded from: classes.dex */
public class C05A {
    public static volatile C05A A08;
    public final AbstractC000600i A00;
    public final C05M A01;
    public final C05B A02;
    public final C05N A03;
    public final C05E A04;
    public final C05C A05;
    public final Map A06 = new HashMap();
    public final Map A07 = new HashMap();

    public C05A(C05B c05b, AbstractC000600i abstractC000600i, C05M c05m, C05C c05c, C05E c05e, C05N c05n) {
        this.A02 = c05b;
        this.A00 = abstractC000600i;
        this.A01 = c05m;
        this.A05 = c05c;
        this.A04 = c05e;
        this.A03 = c05n;
    }

    public static C05A A00() {
        if (A08 == null) {
            synchronized (C05A.class) {
                if (A08 == null) {
                    A08 = new C05A(C05B.A00(), AbstractC000600i.A00(), C05M.A00(), C05C.A00(), C05E.A00(), C05N.A00());
                }
            }
        }
        return A08;
    }

    public int A01(ContentValues contentValues, AbstractC005302j abstractC005302j) {
        C0CD A04 = this.A04.A04();
        try {
            contentValues.put("hidden", (Integer) 0);
            return A04.A02.A00("chat", contentValues, "jid_row_id=?", new String[]{String.valueOf(this.A02.A02(abstractC005302j))});
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

    public final int A02(ContentValues contentValues, AbstractC005302j abstractC005302j) {
        C0CD A04 = this.A04.A04();
        try {
            contentValues.remove("hidden");
            return A04.A02.A00("chat_list", contentValues, "key_remote_jid=?", new String[]{abstractC005302j.getRawString()});
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

    public long A03(ContentValues contentValues) {
        C0CD A04 = this.A04.A04();
        try {
            contentValues.put("hidden", (Integer) 0);
            return A04.A02.A02("chat", contentValues);
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

    public final long A04(ContentValues contentValues) {
        C0CD A04 = this.A04.A04();
        try {
            contentValues.remove("hidden");
            return A04.A02.A02("chat_list", contentValues);
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

    public long A05(AbstractC005302j abstractC005302j) {
        synchronized (this) {
            Map map = this.A06;
            Long l = (Long) map.get(abstractC005302j);
            if (l != null) {
                return l.longValue();
            }
            long A06 = A06(abstractC005302j);
            if (A06 != -1) {
                synchronized (this) {
                    Long valueOf = Long.valueOf(A06);
                    map.put(abstractC005302j, valueOf);
                    this.A07.put(valueOf, abstractC005302j);
                }
                return A06;
            }
            return A06;
        }
    }

    /* JADX WARN: Finally extract failed */
    public final long A06(AbstractC005302j abstractC005302j) {
        C0IT A07 = this.A01.A07(abstractC005302j);
        if (A07 != null) {
            long j = A07.A0K;
            if (j > 0) {
                return j;
            }
        }
        long A02 = this.A02.A02(abstractC005302j);
        if (A02 < 0) {
            StringBuilder sb = new StringBuilder("ChatStore/getRowIdForChat/invalid jidRowId=");
            sb.append(A02);
            Log.e(sb.toString());
            return -1L;
        }
        C0CD A03 = this.A04.A03();
        try {
            Cursor A072 = A03.A02.A07("SELECT _id FROM chat WHERE jid_row_id=?", new String[]{Long.toString(A02)});
            long j2 = A072.moveToNext() ? A072.getLong(0) : -1L;
            A072.close();
            A03.close();
            if (j2 == -1) {
                j2 = A07(abstractC005302j);
                if (j2 <= 0) {
                    StringBuilder sb2 = new StringBuilder("ChatStore/getRowIdForChat/error inserting a hidden chat; jid=");
                    sb2.append(abstractC005302j);
                    sb2.append("; rowId=");
                    sb2.append(j2);
                    Log.e(sb2.toString());
                }
            }
            return j2;
        } finally {
        }
    }

    public final long A07(AbstractC005302j abstractC005302j) {
        long A02 = this.A02.A02(abstractC005302j);
        if (A02 == -1) {
            StringBuilder sb = new StringBuilder("ChatStore/insertHiddenChat/jid row id not found; jid=");
            sb.append(abstractC005302j);
            Log.e(sb.toString());
            return -1L;
        }
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("jid_row_id", Long.valueOf(A02));
        contentValues.put("hidden", (Integer) 1);
        try {
            C0CD A04 = this.A04.A04();
            long A03 = A04.A02.A03("chat", contentValues);
            A04.close();
            return A03;
        } catch (SQLiteConstraintException e) {
            StringBuilder sb2 = new StringBuilder("ChatStore/insertHiddenChat/row already exists but can't be read; jid=");
            sb2.append(abstractC005302j);
            Log.e(sb2.toString(), e);
            return -1L;
        }
    }

    public AbstractC005302j A08(long j) {
        if (j <= 0) {
            return null;
        }
        synchronized (this) {
            Map map = this.A07;
            Long valueOf = Long.valueOf(j);
            if (map.containsKey(valueOf)) {
                return (AbstractC005302j) map.get(valueOf);
            }
            C0CD A03 = this.A04.A03();
            try {
                Cursor A07 = A03.A02.A07("SELECT jid_row_id FROM chat WHERE _id=?", new String[]{Long.toString(j)});
                if (!A07.moveToLast()) {
                    A07.close();
                    A03.close();
                    return null;
                }
                AbstractC005302j A00 = AbstractC005302j.A00(this.A02.A04(A07.getLong(0)));
                if (A00 != null) {
                    synchronized (this) {
                        map.put(valueOf, A00);
                        this.A06.put(A00, valueOf);
                    }
                }
                A07.close();
                A03.close();
                return A00;
            } finally {
            }
        }
    }

    public AbstractC005302j A09(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("chat_row_id");
        if (columnIndex >= 0) {
            return A08(cursor.getLong(columnIndex));
        }
        int columnIndex2 = cursor.getColumnIndex("key_remote_jid");
        if (columnIndex2 >= 0) {
            return AbstractC005302j.A02(cursor.getString(columnIndex2));
        }
        return null;
    }

    public Map A0A() {
        int columnIndexOrThrow;
        C0HC c0hc = new C0HC("ChatsStore/getChats");
        HashMap hashMap = new HashMap();
        try {
            try {
                C0CD A03 = this.A04.A03();
                try {
                    Cursor A07 = A03.A02.A07("SELECT _id, raw_string_jid, display_message_row_id, last_read_message_row_id, last_read_receipt_sent_message_row_id, archived, sort_timestamp, mod_tag, gen, spam_detection, plaintext_disabled, vcard_ui_dismissed, change_number_notified_message_row_id, subject, last_message_row_id, unseen_message_count, unseen_missed_calls_count, unseen_row_count, unseen_earliest_message_received_time, last_important_message_row_id, show_group_description, ephemeral_expiration, last_read_ephemeral_message_row_id, ephemeral_setting_timestamp, unseen_important_message_count, hidden, deleted_chat_job.* FROM chat_view AS chat_view  LEFT JOIN  ( SELECT        chat._id AS chat_row_id,        jid.raw_string AS key_remote_jid\n   FROM jid AS jid\n   LEFT JOIN chat AS chat\n   ON jid._id = chat.jid_row_id ) AS chat_to_jid\n ON chat_to_jid.key_remote_jid=chat_view.raw_string_jid  LEFT JOIN  ( SELECT      chat_row_id,     deleted_message_row_id,     deleted_starred_message_row_id,     deleted_categories_message_row_id,     deleted_categories_starred_message_row_id,     deleted_message_categories   FROM deleted_chat_job ) AS deleted_chat_job \n ON chat_to_jid.chat_row_id=deleted_chat_job.chat_row_id  WHERE (hidden <> 1)", null);
                    try {
                        if (A07 != null) {
                            try {
                                int columnIndexOrThrow2 = A07.getColumnIndexOrThrow("_id");
                                int columnIndexOrThrow3 = A07.getColumnIndexOrThrow("raw_string_jid");
                                int columnIndexOrThrow4 = A07.getColumnIndexOrThrow("display_message_row_id");
                                int columnIndexOrThrow5 = A07.getColumnIndexOrThrow("last_read_message_row_id");
                                int columnIndexOrThrow6 = A07.getColumnIndexOrThrow("last_read_receipt_sent_message_row_id");
                                int columnIndexOrThrow7 = A07.getColumnIndexOrThrow("archived");
                                int columnIndexOrThrow8 = A07.getColumnIndexOrThrow("sort_timestamp");
                                int columnIndexOrThrow9 = A07.getColumnIndexOrThrow("mod_tag");
                                int columnIndexOrThrow10 = A07.getColumnIndexOrThrow("gen");
                                int columnIndexOrThrow11 = A07.getColumnIndexOrThrow("spam_detection");
                                int columnIndexOrThrow12 = A07.getColumnIndexOrThrow("plaintext_disabled");
                                int columnIndexOrThrow13 = A07.getColumnIndexOrThrow("vcard_ui_dismissed");
                                try {
                                    columnIndexOrThrow = A07.getColumnIndexOrThrow("change_number_notified_message_row_id");
                                } catch (Throwable th) {
                                    th = th;
                                }
                                try {
                                    int columnIndexOrThrow14 = A07.getColumnIndexOrThrow("subject");
                                    int columnIndexOrThrow15 = A07.getColumnIndexOrThrow("last_message_row_id");
                                    int columnIndexOrThrow16 = A07.getColumnIndexOrThrow("last_important_message_row_id");
                                    int columnIndexOrThrow17 = A07.getColumnIndexOrThrow("unseen_earliest_message_received_time");
                                    int columnIndexOrThrow18 = A07.getColumnIndexOrThrow("unseen_message_count");
                                    int columnIndexOrThrow19 = A07.getColumnIndexOrThrow("unseen_missed_calls_count");
                                    int columnIndexOrThrow20 = A07.getColumnIndexOrThrow("unseen_row_count");
                                    int columnIndexOrThrow21 = A07.getColumnIndexOrThrow("deleted_message_row_id");
                                    int columnIndexOrThrow22 = A07.getColumnIndexOrThrow("deleted_starred_message_row_id");
                                    int columnIndexOrThrow23 = A07.getColumnIndexOrThrow("deleted_categories_message_row_id");
                                    int columnIndexOrThrow24 = A07.getColumnIndexOrThrow("deleted_categories_starred_message_row_id");
                                    int columnIndexOrThrow25 = A07.getColumnIndexOrThrow("deleted_message_categories");
                                    int columnIndexOrThrow26 = A07.getColumnIndexOrThrow("show_group_description");
                                    int columnIndexOrThrow27 = A07.getColumnIndexOrThrow("ephemeral_expiration");
                                    int columnIndexOrThrow28 = A07.getColumnIndexOrThrow("ephemeral_setting_timestamp");
                                    int columnIndexOrThrow29 = A07.getColumnIndexOrThrow("unseen_important_message_count");
                                    int columnIndexOrThrow30 = A07.getColumnIndexOrThrow("hidden");
                                    while (A07.moveToNext()) {
                                        AbstractC005302j A02 = AbstractC005302j.A02(A07.getString(columnIndexOrThrow3));
                                        if (A02 == null) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("msgstore-manager/initialize/chats/could not parse raw chat jid: ");
                                            sb.append(A07.getString(columnIndexOrThrow3));
                                            Log.w(sb.toString());
                                        } else if (!C003101m.A0Z(A02) && A07.getInt(columnIndexOrThrow30) != 1) {
                                            C0IT c0it = new C0IT(A02);
                                            c0it.A0K = A0G() ? A07.getLong(columnIndexOrThrow2) : -1L;
                                            c0it.A0J = A07.getLong(columnIndexOrThrow4);
                                            c0it.A0H = A07.getLong(columnIndexOrThrow5);
                                            c0it.A0I = A07.getLong(columnIndexOrThrow6);
                                            c0it.A0S = A07.getInt(columnIndexOrThrow7) == 1;
                                            c0it.A0L = A07.getLong(columnIndexOrThrow8);
                                            c0it.A08 = A07.getInt(columnIndexOrThrow9);
                                            c0it.A00 = A07.getDouble(columnIndexOrThrow10);
                                            c0it.A02 = A07.getInt(columnIndexOrThrow11);
                                            c0it.A01 = A07.getInt(columnIndexOrThrow12);
                                            c0it.A07 = A07.getInt(columnIndexOrThrow13);
                                            c0it.A09 = A07.getLong(columnIndexOrThrow);
                                            c0it.A0R = A07.getString(columnIndexOrThrow14);
                                            c0it.A0G = A07.getLong(columnIndexOrThrow15);
                                            long j = A07.getLong(columnIndexOrThrow16);
                                            c0it.A0F = j;
                                            if (j == 0) {
                                                c0it.A0F = 1L;
                                            }
                                            c0it.A0M = A07.getLong(columnIndexOrThrow17);
                                            c0it.A04 = A07.getInt(columnIndexOrThrow18);
                                            c0it.A05 = A07.getInt(columnIndexOrThrow19);
                                            c0it.A06 = A07.getInt(columnIndexOrThrow20);
                                            c0it.A0C = A07.getLong(columnIndexOrThrow21);
                                            c0it.A0D = A07.getLong(columnIndexOrThrow22);
                                            c0it.A0Q = A07.getString(columnIndexOrThrow25);
                                            c0it.A0A = A07.getLong(columnIndexOrThrow23);
                                            c0it.A0B = A07.getLong(columnIndexOrThrow24);
                                            c0it.A0T = A07.getInt(columnIndexOrThrow26) == 1;
                                            c0it.A0N = new C0CM(A07.getInt(columnIndexOrThrow27), A07.getLong(columnIndexOrThrow28));
                                            c0it.A03 = A07.getInt(columnIndexOrThrow29);
                                            hashMap.put(A02, c0it);
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        if (A07 != null) {
                            A07.close();
                        }
                        A03.close();
                        c0hc.A01();
                        return hashMap;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            } catch (Throwable th5) {
                th = th5;
                c0hc.A01();
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            c0hc.A01();
            throw th;
        }
    }

    public void A0B(C0IT c0it) {
        ContentValues contentValues;
        if (!A0G()) {
            A02(c0it.A01(), c0it.A0U);
            return;
        }
        synchronized (c0it) {
            contentValues = new ContentValues(2);
            contentValues.put("change_number_notified_message_row_id", Long.valueOf(c0it.A09));
        }
        AbstractC005302j abstractC005302j = c0it.A0U;
        if (A01(contentValues, abstractC005302j) > 0) {
            A02(c0it.A01(), abstractC005302j);
        }
    }

    public void A0C(C0IT c0it) {
        try {
            C0CD A04 = this.A04.A04();
            try {
                C03790Hb A00 = A04.A00();
                if (!A0G()) {
                    ContentValues A002 = c0it.A00();
                    AbstractC005302j abstractC005302j = c0it.A0U;
                    if (A02(A002, abstractC005302j) == 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("msgstore/archive/did not update ");
                        sb.append(abstractC005302j);
                        Log.e(sb.toString());
                    }
                } else {
                    ContentValues A003 = c0it.A00();
                    AbstractC005302j abstractC005302j2 = c0it.A0U;
                    if (A01(A003, abstractC005302j2) == 0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("msgstore/archive/did not update ");
                        sb2.append(abstractC005302j2);
                        Log.e(sb2.toString());
                    } else {
                        A02(c0it.A00(), abstractC005302j2);
                    }
                }
                A00.A00();
                A00.close();
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
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e(e);
            this.A03.A03();
        } catch (Error e2) {
            e = e2;
            Log.e(e);
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            Log.e(e);
            throw e;
        }
    }

    public void A0D(C0IT c0it) {
        ContentValues A0B;
        try {
            C0CD A04 = this.A04.A04();
            try {
                C03790Hb A00 = A04.A00();
                if (!A0G()) {
                    ContentValues A03 = c0it.A03();
                    AbstractC005302j abstractC005302j = c0it.A0U;
                    int A02 = A02(A03, abstractC005302j);
                    StringBuilder sb = new StringBuilder();
                    sb.append("msgstore/setchatseen/");
                    sb.append(abstractC005302j);
                    sb.append("/");
                    sb.append(c0it.A0H());
                    sb.append("/");
                    sb.append(A02);
                    Log.i(sb.toString());
                } else {
                    synchronized (c0it) {
                        A0B = c0it.A0B();
                        A0B.put("last_read_message_row_id", Long.valueOf(c0it.A0H));
                        A0B.put("last_message_row_id", Long.valueOf(c0it.A0G));
                        A0B.put("last_important_message_row_id", Long.valueOf(c0it.A0F));
                        A0B.put("unseen_important_message_count", Integer.valueOf(c0it.A03));
                    }
                    AbstractC005302j abstractC005302j2 = c0it.A0U;
                    int A01 = A01(A0B, abstractC005302j2);
                    if (A01 > 0) {
                        A02(c0it.A03(), abstractC005302j2);
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("msgstore/setchatseen/");
                    sb2.append(abstractC005302j2);
                    sb2.append("/");
                    sb2.append(c0it.A0H());
                    sb2.append("/");
                    sb2.append(A01);
                    Log.i(sb2.toString());
                }
                A00.A00();
                A00.close();
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
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e(e);
            this.A03.A03();
        } catch (Error e2) {
            e = e2;
            Log.e(e);
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            Log.e(e);
            throw e;
        }
    }

    public void A0E(C0IT c0it) {
        if (!A0G()) {
            A02(c0it.A06(), c0it.A0U);
            return;
        }
        ContentValues A06 = c0it.A06();
        AbstractC005302j abstractC005302j = c0it.A0U;
        if (A01(A06, abstractC005302j) > 0) {
            A02(c0it.A06(), abstractC005302j);
        }
    }

    public void A0F(AbstractC005302j abstractC005302j) {
        C0CD A04 = this.A04.A04();
        try {
            C03790Hb A00 = A04.A00();
            long A02 = this.A02.A02(abstractC005302j);
            C0CE c0ce = A04.A02;
            c0ce.A0D("DELETE FROM chat WHERE jid_row_id=?", new String[]{String.valueOf(A02)});
            c0ce.A0D("DELETE FROM chat_list WHERE key_remote_jid=?", new String[]{abstractC005302j.getRawString()});
            C05M c05m = this.A01;
            synchronized (c05m) {
                if (abstractC005302j != null) {
                    c05m.A0C().remove(abstractC005302j);
                }
            }
            synchronized (this) {
                Long l = (Long) this.A06.remove(abstractC005302j);
                if (l != null) {
                    this.A07.remove(l);
                }
            }
            A00.A00();
            A00.close();
            A04.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A04.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public boolean A0G() {
        return this.A05.A01("chat_ready", 0L) == 2;
    }

    public boolean A0H(C0IT c0it) {
        if (!A0G()) {
            return A0J(c0it, c0it.A0D());
        }
        if (A0I(c0it, c0it.A0D())) {
            return A0J(c0it, c0it.A0D());
        }
        return false;
    }

    public boolean A0I(C0IT c0it, ContentValues contentValues) {
        AbstractC005302j abstractC005302j = c0it.A0U;
        if (A01(contentValues, abstractC005302j) == 0) {
            contentValues.put("jid_row_id", Long.valueOf(this.A02.A02(abstractC005302j)));
            long A03 = A03(contentValues);
            c0it.A0K = A03;
            if (A03 == -1) {
                return false;
            }
        }
        return true;
    }

    public final boolean A0J(C0IT c0it, ContentValues contentValues) {
        AbstractC005302j abstractC005302j = c0it.A0U;
        if (A02(contentValues, abstractC005302j) == 0) {
            contentValues.put("key_remote_jid", abstractC005302j.getRawString());
            if (A04(contentValues) == -1) {
                return false;
            }
        }
        return true;
    }
}
