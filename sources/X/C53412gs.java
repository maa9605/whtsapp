package X;

/* renamed from: X.2gs  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C53412gs {
    public static final String A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;

    static {
        StringBuilder A0P = C000200d.A0P("SELECT ");
        C000200d.A1U(A0P, C0HD.A10, " , ", "message_forwarded.forward_score", " FROM ");
        C000200d.A1U(A0P, "available_message_view AS message", " JOIN ", "message_forwarded AS message_forwarded", " ON message_forwarded.message_row_id = message._id");
        String A0N = C000200d.A0N(A0P, " WHERE ", "message_forwarded.forward_score >= ?", " AND ", "message_type IN ('2', '1', '25', '3', '28', '13', '29', '9', '26')");
        A04 = A0N;
        A02 = C000200d.A0L(new StringBuilder(), A0N, " ORDER BY _id DESC");
        A01 = C000200d.A0L(new StringBuilder(), A0N, " ORDER BY _id ASC");
        A03 = C000200d.A0L(new StringBuilder(), A0N, " ORDER BY media_size DESC");
        A00 = C000200d.A0L(new StringBuilder(), A0N, " ORDER BY message_forwarded.forward_score DESC");
    }
}
