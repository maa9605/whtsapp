package X;

/* renamed from: X.1P2  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1P2 {
    public static final String A04;
    public static final String A05;
    public static final String A06;
    public static final String A03 = C000200d.A0N(C000200d.A0X("CREATE TABLE ", "message_ephemeral", "(", "message_row_id INTEGER PRIMARY KEY", ", "), "duration INTEGER NOT NULL", ", ", "expire_timestamp INTEGER NOT NULL", ")");
    public static final String A02 = C000200d.A0N(C000200d.A0X("CREATE TABLE ", "message_ephemeral_remove_column", "(", "message_row_id INTEGER PRIMARY KEY", ", "), "duration INTEGER NOT NULL", ", ", "expire_timestamp INTEGER NOT NULL", ")");
    public static final String A01 = A00("message_ephemeral");
    public static final String A00 = A00("message_ephemeral_remove_column");

    static {
        StringBuilder A0P = C000200d.A0P("DROP INDEX ");
        StringBuilder sb = new StringBuilder();
        sb.append("message_ephemeral_remove_column");
        sb.append("_expire_timestamp_index");
        A0P.append(sb.toString());
        A04 = A0P.toString();
        StringBuilder A0P2 = C000200d.A0P("INSERT");
        C000200d.A1U(A0P2, " ", "INTO ", "message_ephemeral", "(message_row_id, duration, expire_timestamp)");
        A0P2.append(" VALUES (?, ?, ?)");
        A05 = A0P2.toString();
        StringBuilder A0P3 = C000200d.A0P("INSERT");
        C000200d.A1U(A0P3, " OR REPLACE ", "INTO ", "message_ephemeral_remove_column", "(message_row_id, duration, expire_timestamp)");
        A0P3.append(" VALUES (?, ?, ?)");
        A06 = A0P3.toString();
    }

    public static String A00(String str) {
        StringBuilder A0P = C000200d.A0P("CREATE INDEX IF NOT EXISTS ");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_expire_timestamp_index");
        A0P.append(sb.toString());
        A0P.append(" on ");
        A0P.append(str);
        A0P.append("(expire_timestamp)");
        return A0P.toString();
    }
}
