package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.HashSet;

/* renamed from: X.1yn */
/* loaded from: classes2.dex */
public class C44271yn {
    public static volatile C44271yn A02;
    public final C012306a A00;
    public final C06Y A01;

    public C44271yn(C06Y c06y, C012306a c012306a) {
        this.A01 = c06y;
        this.A00 = c012306a;
    }

    public static C44271yn A00() {
        if (A02 == null) {
            synchronized (C44271yn.class) {
                if (A02 == null) {
                    A02 = new C44271yn(C06Y.A00(), C012306a.A00());
                }
            }
        }
        return A02;
    }

    public int A01(AbstractC005302j abstractC005302j, long j) {
        HashSet hashSet;
        String[] strArr;
        String obj;
        Cursor A07;
        C06Y c06y = this.A01;
        String str = c06y.A07() ? "SELECT message._id FROM message_quoted JOIN message_view AS message ON message_quoted.message_row_id = message._id WHERE message_quoted.message_row_id > ? AND message.chat_row_id = ? AND message.message_type <> 15 AND message_quoted.from_me = 1 LIMIT 100" : "SELECT message._id FROM message_view AS message LEFT JOIN messages_quotes ON message.quoted_row_id = messages_quotes._id WHERE message._id > ? AND message.chat_row_id = ? AND message.quoted_row_id IS NOT NULL AND message.message_type <> 15 AND messages_quotes.key_from_me = 1 LIMIT 100";
        HashSet hashSet2 = new HashSet();
        try {
            C0CD A03 = c06y.A0B.A03();
            A07 = A03.A02.A07(str, new String[]{String.valueOf(j), String.valueOf(c06y.A03.A05(abstractC005302j))});
            while (A07.moveToNext()) {
                try {
                    hashSet2.add(Long.valueOf(A07.getLong(0)));
                } finally {
                }
            }
            A07.close();
            A03.close();
        } catch (Exception e) {
            Log.e("QuotedMessageStore/getQuotedImportantMessagesNewerThanCount", e);
        }
        C012306a c012306a = this.A00;
        C02L c02l = c012306a.A00;
        c02l.A05();
        UserJid userJid = c02l.A03;
        if (userJid == null) {
            hashSet = new HashSet();
        } else {
            hashSet = new HashSet();
            if (c012306a.A03()) {
                strArr = new String[]{String.valueOf(j), String.valueOf(c012306a.A01.A05(abstractC005302j)), String.valueOf(c012306a.A02.A02(userJid))};
                obj = "SELECT message._id FROM message_mentions JOIN message_view AS message ON message_mentions.message_row_id == message._id WHERE message_mentions.message_row_id > ? AND message.chat_row_id = ? AND message_mentions.jid_row_id = ? AND message.message_type <> 15 LIMIT 100";
            } else {
                strArr = new String[]{String.valueOf(j), String.valueOf(c012306a.A01.A05(abstractC005302j))};
                String rawString = userJid.getRawString();
                StringBuilder sb = new StringBuilder("SELECT _id FROM message_view WHERE _id > ? AND chat_row_id = ? AND ");
                sb.append("mentioned_jids LIKE '%");
                sb.append(rawString);
                sb.append("%'");
                sb.append(" LIMIT 100");
                obj = sb.toString();
            }
            try {
                C0CD A032 = c012306a.A03.A03();
                A07 = A032.A02.A07(obj, strArr);
                while (A07.moveToNext()) {
                    try {
                        hashSet.add(Long.valueOf(A07.getLong(0)));
                    } finally {
                        try {
                            throw th;
                        } catch (Throwable th) {
                            if (A07 != null) {
                                try {
                                    A07.close();
                                } catch (Throwable unused) {
                                }
                            }
                        }
                    }
                }
                A07.close();
                A032.close();
            } catch (Exception e2) {
                Log.e("MentionMessageStore/getMentionImportantMessagesNewerThanCount", e2);
            }
        }
        hashSet2.addAll(hashSet);
        return hashSet2.size();
    }
}
