package X;

/* renamed from: X.1vp  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42491vp {
    public static final String A00;
    public static final String A01;

    static {
        StringBuilder A0P = C000200d.A0P("SELECT ");
        String str = C0HD.A01;
        C000200d.A1U(A0P, str, ", ", "key_remote_jid", " FROM ");
        C000200d.A1U(A0P, "legacy_available_messages_view", " WHERE media_hash=? AND ", " +media_wa_type=? ", " ORDER BY _id DESC");
        A0P.append(" LIMIT 1000");
        A00 = A0P.toString();
        StringBuilder A0P2 = C000200d.A0P("SELECT ");
        C000200d.A1U(A0P2, str, ", ", "key_remote_jid", " FROM ");
        C000200d.A1U(A0P2, "legacy_available_messages_view", " WHERE media_hash=? AND ", "media_wa_type in ('2' , '1' , '25' , '3' , '28' , '13' , '29' , '20' , '9' , '26' , '23' , '37' ) ", " ORDER BY _id DESC");
        A0P2.append(" LIMIT 1000");
        A01 = A0P2.toString();
    }
}
