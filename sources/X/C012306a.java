package X;

import android.content.ContentValues;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.06a  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C012306a {
    public static volatile C012306a A05;
    public final C02L A00;
    public final C05A A01;
    public final C05B A02;
    public final C05E A03;
    public final C05C A04;

    public C012306a(C05B c05b, C05A c05a, C02L c02l, C05C c05c, C05E c05e) {
        this.A02 = c05b;
        this.A01 = c05a;
        this.A00 = c02l;
        this.A04 = c05c;
        this.A03 = c05e;
    }

    public static C012306a A00() {
        if (A05 == null) {
            synchronized (C012306a.class) {
                if (A05 == null) {
                    A05 = new C012306a(C05B.A00(), C05A.A00(), C02L.A00(), C05C.A00(), C05E.A00());
                }
            }
        }
        return A05;
    }

    public void A01(AnonymousClass092 anonymousClass092) {
        List<UserJid> list = anonymousClass092.A0c;
        if (list == null || list.isEmpty() || !A03()) {
            return;
        }
        C0CD A04 = this.A03.A04();
        try {
            C03790Hb A00 = A04.A00();
            for (UserJid userJid : list) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("message_row_id", Long.valueOf(anonymousClass092.A0p));
                contentValues.put("jid_row_id", Long.valueOf(this.A02.A02(userJid)));
                A04.A02.A06("message_mentions", contentValues, 4);
            }
            A00.A00();
            A00.close();
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A04.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void A02(AnonymousClass092 anonymousClass092, long j) {
        List<UserJid> list = anonymousClass092.A0c;
        if (list == null || list.isEmpty()) {
            return;
        }
        C0CD A04 = this.A03.A04();
        try {
            C03790Hb A00 = A04.A00();
            for (UserJid userJid : list) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("message_row_id", Long.valueOf(j));
                contentValues.put("jid_row_id", Long.valueOf(this.A02.A02(userJid)));
                A04.A02.A06("message_quoted_mentions", contentValues, 4);
            }
            A00.A00();
            A00.close();
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A04.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public boolean A03() {
        String A02;
        return this.A02.A0C() && (A02 = this.A04.A02("mention_message_ready")) != null && Integer.parseInt(A02) == 1;
    }
}
