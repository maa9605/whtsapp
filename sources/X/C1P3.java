package X;

/* renamed from: X.1P3  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1P3 {
    public static final String A00;

    static {
        StringBuilder A0P = C000200d.A0P("SELECT ");
        C000200d.A1U(A0P, C1P4.A00, " FROM ", "messages_quotes", " JOIN ");
        C000200d.A1U(A0P, "jid AS chat_jid ON messages_quotes.key_remote_jid = chat_jid.raw_string", " JOIN ", "chat AS chat ON chat.jid_row_id = chat_jid._id", " WHERE ");
        A0P.append("messages_quotes._id = ?");
        A00 = A0P.toString();
    }
}
