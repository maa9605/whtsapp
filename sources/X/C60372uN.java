package X;

/* renamed from: X.2uN  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C60372uN {
    public static final String A00;
    public static final String A01;

    static {
        StringBuilder A0P = C000200d.A0P("SELECT ");
        String str = C0HD.A10;
        C000200d.A1U(A0P, str, " FROM ", "message_view_old_schema", " WHERE ");
        A00 = C000200d.A0N(A0P, "_id > ?", " ORDER BY ", "_id", " LIMIT ?");
        StringBuilder A0P2 = C000200d.A0P("SELECT ");
        C000200d.A1U(A0P2, str, " FROM ", "message_view_old_schema", " WHERE ");
        A01 = C000200d.A0L(A0P2, "_id", " = ?");
    }
}
