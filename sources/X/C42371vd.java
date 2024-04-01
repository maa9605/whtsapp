package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.1vd */
/* loaded from: classes2.dex */
public class C42371vd {
    public static volatile C42371vd A01;
    public final AnonymousClass256 A00;

    public C42371vd(AnonymousClass062 anonymousClass062) {
        this.A00 = new AnonymousClass256(anonymousClass062);
    }

    public static C42371vd A00() {
        if (A01 == null) {
            synchronized (C42371vd.class) {
                if (A01 == null) {
                    A01 = new C42371vd(AnonymousClass062.A00());
                }
            }
        }
        return A01;
    }

    public C0MA A01(AbstractC005302j abstractC005302j) {
        AnonymousClass256 anonymousClass256 = this.A00;
        if (anonymousClass256 == null) {
            throw null;
        }
        if (abstractC005302j == null) {
            C000700j.A08(false, "getLastEntryPointForJid/jid is null");
            return null;
        }
        C0HC A06 = AnonymousClass061.A06();
        C0CD A0A = anonymousClass256.A0A();
        try {
            Cursor A05 = AnonymousClass061.A05(A0A, "wa_last_entry_point", AnonymousClass256.A00, "wa_last_entry_point.jid = ?", new String[]{abstractC005302j.getRawString()}, null, "CONTACT_ENTRY_POINT");
            if (A05 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("contact-mgr-db/unable to get contact by jid ");
                sb.append(abstractC005302j);
                C000700j.A08(false, sb.toString());
                A0A.close();
                return null;
            }
            C0MA c0ma = A05.moveToNext() ? new C0MA(A05) : null;
            A05.close();
            A0A.close();
            A06.A00();
            return c0ma;
        } finally {
        }
    }

    public void A02(C0MA c0ma) {
        AnonymousClass256 anonymousClass256 = this.A00;
        if (anonymousClass256 != null) {
            Jid jid = c0ma.A01;
            if (jid == null) {
                C000700j.A08(false, "setOrUpdateLastEntryPoint/jid is null");
                return;
            }
            C0HC A06 = AnonymousClass061.A06();
            ContentValues contentValues = new ContentValues(4);
            contentValues.put("jid", jid.getRawString());
            contentValues.put("entry_point_type", c0ma.A03);
            contentValues.put("entry_point_id", c0ma.A02);
            contentValues.put("entry_point_time", Long.valueOf(c0ma.A00));
            try {
                C0CD A0B = anonymousClass256.A0B();
                AnonymousClass061.A08(A0B, "wa_last_entry_point", contentValues);
                A0B.close();
            } catch (IllegalArgumentException e) {
                StringBuilder A0P = C000200d.A0P("setOrUpdateLastEntryPoint/unable to update entry point for jid ");
                A0P.append(jid);
                String obj = A0P.toString();
                if (obj != null) {
                    Log.e(obj, e);
                } else {
                    throw null;
                }
            }
            A06.A00();
            return;
        }
        throw null;
    }
}
