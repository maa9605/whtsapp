package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.06X  reason: invalid class name */
/* loaded from: classes.dex */
public class C06X {
    public static volatile C06X A02;
    public final C05B A00;
    public final C05E A01;

    public C06X(C05B c05b, C05E c05e) {
        this.A00 = c05b;
        this.A01 = c05e;
    }

    public static C06X A00() {
        if (A02 == null) {
            synchronized (C06X.class) {
                if (A02 == null) {
                    A02 = new C06X(C05B.A00(), C05E.A00());
                }
            }
        }
        return A02;
    }

    public C0D3 A01(C04280Jo c04280Jo) {
        if (((AbstractC04290Jp) c04280Jo).A00) {
            return c04280Jo.A18();
        }
        C0CD A03 = this.A01.A03();
        try {
            C0CE c0ce = A03.A02;
            Cursor A07 = c0ce.A07("SELECT _id, timestamp, video_call, group_jid_row_id, is_joinable_group_call FROM missed_call_logs WHERE message_row_id = ? ORDER BY timestamp ASC", new String[]{Long.toString(c04280Jo.A0p)});
            if (A07.moveToNext()) {
                Cursor A072 = c0ce.A07("SELECT _id, jid, call_result FROM missed_call_log_participant WHERE call_logs_row_id = ? ORDER BY _id ASC", new String[]{Long.toString(A07.getLong(A07.getColumnIndexOrThrow("_id")))});
                try {
                    long j = A07.getLong(A07.getColumnIndexOrThrow("_id"));
                    long j2 = A07.getLong(A07.getColumnIndexOrThrow("timestamp"));
                    boolean z = A07.getInt(A07.getColumnIndexOrThrow("video_call")) > 0;
                    int i = A07.getInt(A07.getColumnIndexOrThrow("group_jid_row_id"));
                    boolean z2 = A07.getInt(A07.getColumnIndexOrThrow("is_joinable_group_call")) > 0;
                    ArrayList arrayList = new ArrayList();
                    while (A072.moveToNext()) {
                        long j3 = A072.getLong(A072.getColumnIndexOrThrow("_id"));
                        UserJid nullable = UserJid.getNullable(A072.getString(A072.getColumnIndexOrThrow("jid")));
                        if (C003101m.A0b(nullable)) {
                            arrayList.add(new C0D4(j3, nullable, A072.getInt(A072.getColumnIndexOrThrow("call_result"))));
                        }
                    }
                    C0D3 A00 = C0D3.A00(c04280Jo, j, 0, j2, z, 0, 2, 0L, true, GroupJid.of(this.A00.A04(i)), z2, arrayList);
                    A072.close();
                    A07.close();
                    A03.close();
                    return A00;
                } finally {
                }
            } else {
                A07.close();
                A03.close();
                return null;
            }
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

    public void A02(C04280Jo c04280Jo) {
        long j;
        if (c04280Jo.A0p != -1) {
            try {
                C05E c05e = this.A01;
                C0CD A04 = c05e.A04();
                try {
                    Iterator it = ((AbstractCollection) c04280Jo.A19()).iterator();
                    while (it.hasNext()) {
                        C0D3 c0d3 = (C0D3) it.next();
                        if (c0d3.A0G()) {
                            ContentValues contentValues = new ContentValues();
                            if (c0d3.A02() != -1) {
                                contentValues.put("_id", Long.valueOf(c0d3.A02()));
                            }
                            contentValues.put("message_row_id", Long.valueOf(c04280Jo.A0p));
                            contentValues.put("timestamp", Long.valueOf(c0d3.A08));
                            contentValues.put("video_call", Boolean.valueOf(c0d3.A0E));
                            GroupJid groupJid = c0d3.A05;
                            if (groupJid != null) {
                                j = this.A00.A02(groupJid);
                            } else {
                                j = 0;
                            }
                            contentValues.put("group_jid_row_id", Long.valueOf(j));
                            contentValues.put("is_joinable_group_call", Boolean.valueOf(c0d3.A0D));
                            c0d3.A09(A04.A02.A04("missed_call_logs", contentValues));
                            c0d3.A05();
                            if (c0d3.A02() != -1) {
                                try {
                                    A04 = c05e.A04();
                                    try {
                                        Iterator it2 = ((ArrayList) c0d3.A04()).iterator();
                                        while (it2.hasNext()) {
                                            Object next = it2.next();
                                            C0D4 c0d4 = (C0D4) next;
                                            if (c0d4.A01()) {
                                                ContentValues contentValues2 = new ContentValues();
                                                contentValues2.put("call_logs_row_id", Long.valueOf(c0d3.A02()));
                                                if (c0d4.A00() != -1) {
                                                    contentValues2.put("_id", Long.valueOf(c0d4.A00()));
                                                }
                                                contentValues2.put("jid", c0d4.A02.getRawString());
                                                contentValues2.put("call_result", Integer.valueOf(c0d4.A00));
                                                long A042 = A04.A02.A04("missed_call_log_participant", contentValues2);
                                                synchronized (next) {
                                                    c0d4.A01 = A042;
                                                }
                                                synchronized (next) {
                                                    c0d4.A03 = false;
                                                }
                                            }
                                        }
                                        c0d3.A02();
                                        A04.close();
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                            break;
                                        } catch (Throwable th2) {
                                            throw th2;
                                            break;
                                        }
                                    }
                                } catch (SQLiteDatabaseCorruptException e) {
                                    Log.e("MissedCallLogStore/insertOfUpdateCallLogParticipants", e);
                                } catch (Error e2) {
                                    e = e2;
                                    Log.e(e);
                                    throw e;
                                } catch (RuntimeException e3) {
                                    e = e3;
                                    Log.e(e);
                                    throw e;
                                }
                            } else {
                                throw new IllegalArgumentException("CallLog row_id is not set");
                            }
                        }
                    }
                    A04.close();
                } finally {
                }
            } catch (SQLiteDatabaseCorruptException e4) {
                Log.e("MissedCallLogStore/insertOfUpdateCallLogs", e4);
            } catch (Error e5) {
                e = e5;
                Log.e(e);
                throw e;
            } catch (RuntimeException e6) {
                e = e6;
                Log.e(e);
                throw e;
            }
        } else {
            throw new IllegalArgumentException("message.row_id is not set");
        }
    }
}
