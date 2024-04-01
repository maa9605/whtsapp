package X;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.service.MDSyncService;
import com.whatsapp.util.Log;

/* renamed from: X.1yu */
/* loaded from: classes2.dex */
public class C44341yu {
    public static volatile C44341yu A0H;
    public final C01B A00;
    public final C44331yt A01;
    public final AnonymousClass012 A02;
    public final C001200o A03;
    public final C000500h A04;
    public final C0CA A05;
    public final C03180Eq A06;
    public final C05O A07;
    public final C03880Hm A08;
    public final C41741uR A09;
    public final C41421tt A0A;
    public final C0EG A0B;
    public final C451520p A0C;
    public final C41721uP A0D;
    public final C0ER A0E;
    public final C0CB A0F;
    public final InterfaceC002901k A0G;

    public C44341yu(C001200o c001200o, AnonymousClass012 anonymousClass012, InterfaceC002901k interfaceC002901k, C05O c05o, C0EG c0eg, C01B c01b, C03880Hm c03880Hm, C451520p c451520p, C0ER c0er, C03180Eq c03180Eq, C44331yt c44331yt, C0CB c0cb, C41421tt c41421tt, C000500h c000500h, C0CA c0ca, C41721uP c41721uP, C41741uR c41741uR) {
        this.A02 = anonymousClass012;
        this.A03 = c001200o;
        this.A0G = interfaceC002901k;
        this.A07 = c05o;
        this.A0B = c0eg;
        this.A00 = c01b;
        this.A08 = c03880Hm;
        this.A0C = c451520p;
        this.A0E = c0er;
        this.A06 = c03180Eq;
        this.A01 = c44331yt;
        this.A0F = c0cb;
        this.A0A = c41421tt;
        this.A04 = c000500h;
        this.A05 = c0ca;
        this.A0D = c41721uP;
        this.A09 = c41741uR;
    }

    public static C44341yu A00() {
        if (A0H == null) {
            synchronized (C44341yu.class) {
                if (A0H == null) {
                    A0H = new C44341yu(C001200o.A01, AnonymousClass012.A00(), C002801j.A00(), C05O.A00(), C0EG.A00(), C01B.A00(), C03880Hm.A00(), C451520p.A00(), C0ER.A00(), C03180Eq.A00(), C44331yt.A00(), C0CB.A00(), C41421tt.A00(), C000500h.A00(), C0CA.A00(), C41721uP.A00(), C41741uR.A00());
                }
            }
        }
        return A0H;
    }

    /* JADX WARN: Finally extract failed */
    public long A01(int i) {
        int A07;
        if (i == 2) {
            A07 = this.A00.A07(C01C.A3L);
        } else if (i == 3) {
            A07 = this.A00.A07(C01C.A3I);
        } else {
            throw new IllegalArgumentException(C000200d.A0D("Unexpected sync type ", i));
        }
        long j = A07;
        long j2 = 0;
        if (j >= 0) {
            C05O c05o = this.A07;
            long A05 = this.A02.A05() - (j * 86400000);
            if (c05o != null) {
                C0HC c0hc = new C0HC();
                c0hc.A02 = "rowidstore/getRowIdByTimestampExcludeSystemMessages";
                c0hc.A03 = true;
                c0hc.A03();
                C0CD A03 = c05o.A03.A03();
                try {
                    Cursor A072 = A03.A02.A07("SELECT _id FROM available_message_view WHERE (message_type != '7') AND timestamp <= ? ORDER BY _id DESC LIMIT 1", new String[]{Long.toString(A05)});
                    if (A072 != null) {
                        if (A072.moveToNext()) {
                            j2 = A072.getLong(0);
                        }
                        A072.close();
                    }
                    A03.close();
                    StringBuilder sb = new StringBuilder("rowidstore/getRowIdByTimestampExcludeSystemMessages ");
                    sb.append(j2);
                    sb.append(" | time spent:");
                    C000200d.A0m(c0hc, sb);
                } finally {
                }
            } else {
                throw null;
            }
        }
        return j2;
    }

    public final void A02(DeviceJid deviceJid, int i) {
        StringBuilder sb = new StringBuilder("history-sync-manager/activate sync phase ");
        sb.append(i);
        sb.append(" for ");
        sb.append(deviceJid);
        Log.i(sb.toString());
        C41741uR c41741uR = this.A09;
        if (c41741uR != null) {
            C000700j.A00();
            ContentValues contentValues = new ContentValues();
            contentValues.put("status", "1");
            C0CD A02 = c41741uR.A01.A02();
            try {
                int A00 = A02.A02.A00("msg_history_sync", contentValues, "device_id=?  AND sync_type=?", new String[]{deviceJid.getRawString(), String.valueOf(i)});
                c41741uR.A02.execute(new RunnableEBaseShape2S0200000_I0_2(c41741uR, deviceJid, 4));
                if (A00 > 0) {
                    this.A0E.A03(this.A03.A00, MDSyncService.class, new Intent("com.whatsapp.service.MDSyncService.START_HISTORY_SYNC"));
                    return;
                }
                return;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                    try {
                        A02.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        throw null;
    }
}
