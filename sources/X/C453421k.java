package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.21k  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C453421k {
    public static final String[] A01 = {"jid", "latitude", "longitude", "accuracy", "speed", "bearing", "location_ts"};
    public final C0K0 A00;

    public C453421k(Cursor cursor, UserJid userJid) {
        C0K0 c0k0 = new C0K0(userJid);
        this.A00 = c0k0;
        c0k0.A00 = cursor.getDouble(1);
        this.A00.A01 = cursor.getDouble(2);
        this.A00.A03 = cursor.getInt(3);
        this.A00.A02 = cursor.getFloat(4);
        this.A00.A04 = cursor.getInt(5);
        this.A00.A05 = cursor.getLong(6);
    }
}
