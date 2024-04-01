package X;

import android.database.Cursor;

/* renamed from: X.2FG  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2FG {
    public final int A00;
    public final long A01;
    public final long A02;
    public final AnonymousClass094 A03;
    public final boolean A04;

    public C2FG(Cursor cursor, AbstractC005302j abstractC005302j) {
        long j;
        String string = cursor.getString(cursor.getColumnIndexOrThrow("key_id"));
        boolean z = cursor.getInt(cursor.getColumnIndexOrThrow("from_me")) == 1;
        this.A03 = new AnonymousClass094(abstractC005302j, z, string);
        this.A01 = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
        this.A04 = cursor.getInt(cursor.getColumnIndexOrThrow("starred")) == 1;
        this.A00 = cursor.getInt(cursor.getColumnIndexOrThrow("media_size"));
        if (z) {
            j = cursor.getLong(cursor.getColumnIndexOrThrow("receipt_server_timestamp"));
        } else {
            j = cursor.getLong(cursor.getColumnIndexOrThrow("timestamp"));
        }
        this.A02 = j;
    }
}
