package X;

/* renamed from: X.2ts  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC60072ts {
    public static final String A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;

    static {
        StringBuilder A0P = C000200d.A0P("   SELECT ");
        String str = C0HD.A10;
        C000200d.A1U(A0P, str, " FROM ", "available_message_view", " WHERE ");
        A00 = C000200d.A0N(A0P, "_id > ? ", " ORDER BY ", "_id ASC", " LIMIT ?");
        StringBuilder A0P2 = C000200d.A0P("   SELECT ");
        C000200d.A1U(A0P2, str, " FROM ", "message_view", " WHERE ");
        A01 = C000200d.A0N(A0P2, "_id > ? ", " ORDER BY ", "_id ASC", " LIMIT ?");
        StringBuilder A0P3 = C000200d.A0P("SELECT ");
        C000200d.A1U(A0P3, C1P4.A00, ", ", "messages.key_remote_jid AS parent_key_remote_jid, ", "messages._id AS parent_row_id");
        C000200d.A1U(A0P3, " FROM ", "messages AS messages,", "messages_quotes", " JOIN ");
        C000200d.A1U(A0P3, "jid AS chat_jid ON messages_quotes.key_remote_jid = chat_jid.raw_string", " JOIN ", "chat AS chat ON chat.jid_row_id = chat_jid._id", " WHERE ");
        C000200d.A1U(A0P3, "messages._id > ?", " AND ", "messages.quoted_row_id = messages_quotes._id", " ORDER BY ");
        A03 = C000200d.A0L(A0P3, "messages._id ASC", " LIMIT ?");
        StringBuilder A0P4 = C000200d.A0P("SELECT ");
        String str2 = C0HD.A01;
        A0P4.append(C0HD.A00("messages", str2));
        A0P4.append(", ");
        A0P4.append("messages.");
        A0P4.append("key_remote_jid");
        A0P4.append(" FROM ");
        C000200d.A1U(A0P4, "messages", " AS messages", " LEFT JOIN ", "missed_call_logs AS missed_call_logs");
        C000200d.A1U(A0P4, " ON messages.", "_id", " = missed_call_logs.message_row_id", " WHERE ");
        C000200d.A1U(A0P4, "messages._id > ? ", " AND ", "media_wa_type = 10", " AND ");
        A02 = C000200d.A0M(A0P4, "missed_call_logs._id IS NULL", " ORDER BY _id ASC", " LIMIT ?");
        StringBuilder A0P5 = C000200d.A0P("SELECT ");
        C000200d.A1U(A0P5, str2, ", ", "key_remote_jid", " FROM ");
        C000200d.A1U(A0P5, "messages", " WHERE ", "_id > ?", " AND ");
        C000200d.A1U(A0P5, "status = 6", " AND ", "media_wa_type = 0", " ORDER BY ");
        A04 = C000200d.A0L(A0P5, "_id", " ASC LIMIT ?");
    }
}
