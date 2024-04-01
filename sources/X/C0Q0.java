package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0Q0  reason: invalid class name */
/* loaded from: classes.dex */
public class C0Q0 extends AbstractC05100Nh implements InterfaceC05660Pp {
    public final C02L A00;
    public final C05Q A01;
    public final C0FE A02;
    public final C05C A03;
    public final C0E9 A04;
    public final C42791wK A05;

    @Override // X.AbstractC05100Nh
    public int A0R() {
        return 10;
    }

    @Override // X.AbstractC05100Nh
    public String A0U() {
        return "SELECT _id, key_remote_jid, key_id, remote_resource, status, receipt_device_timestamp, read_device_timestamp, played_device_timestamp, participant_hash FROM messages WHERE key_from_me = 1 AND _id > ? ORDER BY _id ASC LIMIT ?";
    }

    @Override // X.AbstractC05100Nh
    public String A0V() {
        return "migration_receipt_device_retry";
    }

    @Override // X.AbstractC05100Nh
    public String A0W() {
        return "migration_receipt_device_index";
    }

    public C0Q0(C05670Pr c05670Pr) {
        super("receipt_device", EditorInfoCompat.IME_FLAG_FORCE_ASCII, c05670Pr);
        this.A00 = c05670Pr.A01;
        this.A03 = c05670Pr.A0Y;
        this.A01 = c05670Pr.A06;
        this.A04 = c05670Pr.A0a;
        this.A05 = c05670Pr.A0c;
        this.A02 = c05670Pr.A0T;
    }

    @Override // X.AbstractC05100Nh
    public boolean A0L() {
        C02L c02l = this.A00;
        c02l.A05();
        return c02l.A03 != null;
    }

    @Override // X.AbstractC05100Nh
    public int A0Q() {
        return super.A02.A07(C01C.A2u) >= 2 ? 3 : 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0186, code lost:
        if (X.C003101m.A0Z(r0) != false) goto L52;
     */
    @Override // X.AbstractC05100Nh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair A0T(android.database.Cursor r32) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Q0.A0T(android.database.Cursor):android.util.Pair");
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
        this.A03.A04("receipt_device_migration_complete", 1);
    }

    @Override // X.AbstractC05100Nh
    public boolean A0b() {
        String A02 = this.A04.A08.A02("receipt_device_migration_complete");
        return A02 != null && Integer.parseInt(A02) == 1;
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.InterfaceC05660Pp
    public void onRollback() {
        C0CD A04 = super.A05.A04();
        try {
            C03790Hb A00 = A04.A00();
            A04.A02.A01("receipt_device", null, null);
            C05C c05c = this.A03;
            c05c.A03("receipt_device_migration_complete");
            c05c.A03("migration_receipt_device_index");
            c05c.A03("migration_receipt_device_retry");
            A00.A00();
            A00.close();
            A04.close();
            Log.i("ReceiptDeviceStore/ReceiptDeviceDatabaseMigration/resetMigration/done");
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
