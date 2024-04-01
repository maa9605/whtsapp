package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2Dn  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C48032Dn extends AbstractC05100Nh implements InterfaceC05660Pp {
    public C0CF A00;
    public final AbstractC000600i A01;
    public final C02L A02;
    public final C05Q A03;
    public final C05B A04;
    public final C05E A05;
    public final C05C A06;
    public final C42781wJ A07;
    public final C42791wK A08;

    @Override // X.AbstractC05100Nh
    public int A0R() {
        return 25;
    }

    @Override // X.AbstractC05100Nh
    public String A0U() {
        return "SELECT _id, key_id, key_remote_jid, remote_resource, receipt_device_timestamp, read_device_timestamp, played_device_timestamp FROM messages WHERE _id > ?  AND key_from_me = 1  AND (status IS NULL OR status!=6) ORDER BY _id ASC LIMIT ?";
    }

    @Override // X.AbstractC05100Nh
    public String A0V() {
        return "migration_receipt_retry";
    }

    @Override // X.AbstractC05100Nh
    public String A0W() {
        return "migration_receipt_index";
    }

    public C48032Dn(C05B c05b, AbstractC000600i abstractC000600i, C02L c02l, C42781wJ c42781wJ, C05C c05c, C05Q c05q, C05E c05e, C42791wK c42791wK, C05670Pr c05670Pr) {
        super("receipt_user", EditorInfoCompat.IME_FLAG_FORCE_ASCII, c05670Pr);
        this.A04 = c05b;
        this.A01 = abstractC000600i;
        this.A02 = c02l;
        this.A07 = c42781wJ;
        this.A06 = c05c;
        this.A03 = c05q;
        this.A05 = c05e;
        this.A08 = c42791wK;
    }

    @Override // X.AbstractC05100Nh
    public boolean A0L() {
        C02L c02l = this.A02;
        c02l.A05();
        return c02l.A03 != null;
    }

    @Override // X.AbstractC05100Nh
    public int A0Q() {
        return super.A02.A07(C01C.A2u) >= 3 ? 3 : 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
        if (X.C003101m.A0Z(r5) != false) goto L40;
     */
    /* JADX WARN: Finally extract failed */
    @Override // X.AbstractC05100Nh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair A0T(android.database.Cursor r27) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48032Dn.A0T(android.database.Cursor):android.util.Pair");
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
        this.A06.A04("receipt_user_ready", 2);
    }

    @Override // X.AbstractC05100Nh
    public boolean A0b() {
        return this.A07.A03();
    }

    public final void A0c(long j, UserJid userJid, C42811wM c42811wM) {
        long A02 = this.A04.A02(userJid);
        if (A02 == -1) {
            this.A01.A09("ReceiptUserStoreDatabaseMigration: invalid jid", userJid.getObfuscatedString(), false);
            return;
        }
        this.A00.A04(1, j);
        this.A00.A04(2, A02);
        this.A00.A04(3, c42811wM.A00);
        this.A00.A04(4, c42811wM.A02);
        this.A00.A04(5, c42811wM.A01);
        this.A00.A01();
        this.A00.A00.clearBindings();
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.InterfaceC05660Pp
    public void onRollback() {
        C0CD A04 = this.A05.A04();
        try {
            C03790Hb A00 = A04.A00();
            A04.A02.A01("receipt_user", null, null);
            C05C c05c = this.A06;
            c05c.A03("receipt_user_ready");
            c05c.A03("migration_receipt_index");
            c05c.A03("migration_receipt_retry");
            A00.A00();
            A00.close();
            A04.close();
            Log.i("ReceiptUserStore/ReceiptUserStoreDatabaseMigration/resetMigration/done");
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
