package X;

/* renamed from: X.1P1  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1P1 {
    public static final String A01 = C000200d.A0M(C000200d.A0X("CREATE TABLE ", "message_ephemeral_setting", " (", "message_row_id", " INTEGER PRIMARY KEY, "), "setting_duration", " INTEGER", ")");
    public static final String A00 = C000200d.A0M(C000200d.A0X("CREATE TABLE ", "message_ephemeral_setting_remove_column", " (", "message_row_id", " INTEGER PRIMARY KEY, "), "setting_duration", " INTEGER", ")");
    public static final String A02 = C000200d.A0L(C000200d.A0X("INSERT or REPLACE INTO ", "message_ephemeral_setting", " (", "message_row_id", ", "), "setting_duration", ") VALUES (?, ?)");
    public static final String A03 = C000200d.A0L(C000200d.A0X("INSERT or REPLACE INTO ", "message_ephemeral_setting_remove_column", " (", "message_row_id", ", "), "setting_duration", ") VALUES (?, ?)");
}
