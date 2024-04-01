package X;

/* renamed from: X.1P0  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1P0 {
    public static final String A00;

    static {
        StringBuilder A0V = C000200d.A0V("SELECT _id FROM jid WHERE ", "raw_string = '");
        A0V.append(C011405q.A00.getRawString());
        A0V.append("' AND ");
        A0V.append("type = 11");
        A00 = A0V.toString();
    }
}
