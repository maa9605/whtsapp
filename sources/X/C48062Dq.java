package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2Dq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C48062Dq extends AbstractC05100Nh implements InterfaceC05660Pp {
    public final C02L A00;
    public final C01B A01;
    public final C05B A02;
    public final C05C A03;
    public final C0EB A04;

    @Override // X.AbstractC05100Nh
    public int A0R() {
        return 10;
    }

    @Override // X.AbstractC05100Nh
    public String A0U() {
        return "SELECT _id FROM jid WHERE raw_string = '' AND type = 11 AND _id > ?  ORDER BY _id ASC LIMIT ? ";
    }

    @Override // X.AbstractC05100Nh
    public String A0V() {
        return "migration_blank_me_jid_retry";
    }

    @Override // X.AbstractC05100Nh
    public String A0W() {
        return "migration_blank_me_jid_index";
    }

    public C48062Dq(C05B c05b, C02L c02l, C01B c01b, C0EB c0eb, C05C c05c, C05670Pr c05670Pr) {
        super("blank_me_jid", EditorInfoCompat.IME_FLAG_FORCE_ASCII, c05670Pr);
        this.A02 = c05b;
        this.A00 = c02l;
        this.A01 = c01b;
        this.A04 = c0eb;
        this.A03 = c05c;
    }

    @Override // X.AbstractC05100Nh
    public boolean A0L() {
        C02L c02l = this.A00;
        c02l.A05();
        return c02l.A03 != null;
    }

    @Override // X.AbstractC05100Nh
    public int A0Q() {
        return this.A01.A07(C01C.A2r) >= 1 ? 3 : 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e3  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [int] */
    @Override // X.AbstractC05100Nh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair A0T(android.database.Cursor r19) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48062Dq.A0T(android.database.Cursor):android.util.Pair");
    }

    @Override // X.AbstractC05100Nh
    public Set A0X() {
        HashSet hashSet = new HashSet();
        hashSet.add("migration_jid_store");
        hashSet.add("migration_chat_store");
        return hashSet;
    }

    @Override // X.AbstractC05100Nh
    public void A0Y() {
        super.A0Y();
        this.A03.A04("blank_me_jid_ready", 1);
    }

    @Override // X.AbstractC05100Nh
    public void A0Z() {
        Long l;
        C05B c05b = this.A02;
        C0CD A04 = c05b.A01.A04();
        try {
            if (A04.A02.A01("jid", "raw_string = ? AND type = ?", new String[]{"", String.valueOf(11)}) > 0 && (l = (Long) c05b.A04.remove(C011405q.A00)) != null) {
                c05b.A05.remove(l);
            }
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

    @Override // X.AbstractC05100Nh
    public boolean A0b() {
        String A02 = this.A03.A02("blank_me_jid_ready");
        return A02 != null && Integer.parseInt(A02) == 1;
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.InterfaceC05660Pp
    public void onRollback() {
        C0CD A04 = this.A05.A04();
        try {
            C03790Hb A00 = A04.A00();
            C05C c05c = this.A03;
            c05c.A03("blank_me_jid_ready");
            c05c.A03("migration_blank_me_jid_index");
            c05c.A03("migration_blank_me_jid_retry");
            A00.A00();
            A00.close();
            A04.close();
            Log.i("BlankMeJidDatabaseMigration/resetDatabaseMigration/done");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A04.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }
}
