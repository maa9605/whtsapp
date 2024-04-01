package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.21l  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C453521l {
    public static final String[] A04 = {"remote_jid", "from_me", "remote_resource", "expires", "message_id"};
    public final long A00;
    public final AbstractC005302j A01;
    public final UserJid A02;
    public final AnonymousClass094 A03;

    public C453521l(AbstractC005302j abstractC005302j, UserJid userJid, long j, AnonymousClass094 anonymousClass094) {
        this.A01 = abstractC005302j;
        this.A02 = userJid;
        this.A00 = j;
        this.A03 = anonymousClass094;
    }

    public C453521l(AbstractC005302j abstractC005302j, UserJid userJid, Cursor cursor) {
        this.A01 = abstractC005302j;
        this.A02 = userJid;
        this.A00 = cursor.getLong(3);
        this.A03 = new AnonymousClass094(this.A01, cursor.getInt(1) == 1, cursor.getString(4));
    }
}
