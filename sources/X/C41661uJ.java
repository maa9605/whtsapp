package X;

import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1uJ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41661uJ {
    public static volatile C41661uJ A04;
    public final AnonymousClass012 A00;
    public final C05A A01;
    public final C05B A02;
    public final C05E A03;

    public C41661uJ(AnonymousClass012 anonymousClass012, C05B c05b, C05A c05a, C05E c05e) {
        this.A00 = anonymousClass012;
        this.A02 = c05b;
        this.A01 = c05a;
        this.A03 = c05e;
    }

    public static C41661uJ A00() {
        if (A04 == null) {
            synchronized (C41661uJ.class) {
                if (A04 == null) {
                    A04 = new C41661uJ(AnonymousClass012.A00(), C05B.A00(), C05A.A00(), C05E.A00());
                }
            }
        }
        return A04;
    }

    public List A01(AnonymousClass094 anonymousClass094) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = new String[3];
        C05A c05a = this.A01;
        AbstractC005302j abstractC005302j = anonymousClass094.A00;
        if (abstractC005302j != null) {
            strArr[0] = String.valueOf(c05a.A05(abstractC005302j));
            strArr[1] = String.valueOf(anonymousClass094.A02 ? 1 : 0);
            strArr[2] = anonymousClass094.A01;
            C0CD A03 = this.A03.A03();
            try {
                Cursor A07 = A03.A02.A07("SELECT receipt_device_jid_row_id, receipt_recipient_jid_row_id, status, timestamp FROM receipt_orphaned WHERE chat_row_id = ? AND from_me = ? AND key_id = ? ORDER BY _id ASC", strArr);
                int columnIndexOrThrow = A07.getColumnIndexOrThrow("receipt_device_jid_row_id");
                int columnIndexOrThrow2 = A07.getColumnIndexOrThrow("receipt_recipient_jid_row_id");
                int columnIndexOrThrow3 = A07.getColumnIndexOrThrow("status");
                int columnIndexOrThrow4 = A07.getColumnIndexOrThrow("timestamp");
                while (A07.moveToNext()) {
                    C05B c05b = this.A02;
                    DeviceJid deviceJid = (DeviceJid) c05b.A07(DeviceJid.class, A07.getLong(columnIndexOrThrow));
                    if (deviceJid != null) {
                        arrayList.add(new C44261ym(deviceJid, (UserJid) c05b.A07(UserJid.class, A07.getLong(columnIndexOrThrow2)), A07.getInt(columnIndexOrThrow3), A07.getLong(columnIndexOrThrow4)));
                    }
                }
                A07.close();
                return arrayList;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                    try {
                        A03.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        throw null;
    }

    public void A02() {
        C0CD A042 = this.A03.A04();
        try {
            A042.A02.A01("receipt_orphaned", "timestamp < ?", new String[]{String.valueOf((this.A00.A05() - 5184000000L) / 1000)});
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A042.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void A03(AnonymousClass094 anonymousClass094) {
        String[] strArr = new String[3];
        C05A c05a = this.A01;
        AbstractC005302j abstractC005302j = anonymousClass094.A00;
        if (abstractC005302j != null) {
            strArr[0] = String.valueOf(c05a.A05(abstractC005302j));
            strArr[1] = String.valueOf(anonymousClass094.A02 ? 1 : 0);
            strArr[2] = anonymousClass094.A01;
            C0CD A042 = this.A03.A04();
            try {
                A042.A02.A0D("DELETE FROM receipt_orphaned WHERE chat_row_id = ? AND from_me = ? AND key_id = ?", strArr);
                return;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                    try {
                        A042.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        throw null;
    }
}
