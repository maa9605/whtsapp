package X;

import android.content.ContentValues;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.24v  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C460724v extends AnonymousClass061 {
    public C460724v(AnonymousClass062 anonymousClass062) {
        super(anonymousClass062);
    }

    /* JADX WARN: Finally extract failed */
    public void A0D(Set set) {
        C0HC A06 = AnonymousClass061.A06();
        C0CD A0B = A0B();
        try {
            C03790Hb A00 = A0B.A00();
            AnonymousClass061.A09(A0B, "wa_block_list", null, null);
            ContentValues contentValues = new ContentValues(1);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                contentValues.put("jid", ((UserJid) it.next()).getRawString());
                AnonymousClass061.A03(A0B, "wa_block_list", contentValues);
            }
            A00.A00();
            A00.close();
            A0B.close();
            A06.A00();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A0B.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }
}
