package X;

import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.0FC  reason: invalid class name */
/* loaded from: classes.dex */
public class C0FC {
    public static volatile C0FC A05;
    public final AbstractC000600i A00;
    public final C02L A01;
    public final C05B A02;
    public final C05E A03;
    public final InterfaceC002901k A04;

    public C0FC(C05B c05b, AbstractC000600i abstractC000600i, C02L c02l, InterfaceC002901k interfaceC002901k, C05E c05e) {
        this.A02 = c05b;
        this.A00 = abstractC000600i;
        this.A01 = c02l;
        this.A04 = interfaceC002901k;
        this.A03 = c05e;
    }

    public static C0FC A00() {
        if (A05 == null) {
            synchronized (C0FC.class) {
                if (A05 == null) {
                    A05 = new C0FC(C05B.A00(), AbstractC000600i.A00(), C02L.A00(), C002801j.A00(), C05E.A00());
                }
            }
        }
        return A05;
    }

    public final long A01(UserJid userJid) {
        C000700j.A09(!TextUtils.isEmpty(userJid.getRawString()), "participant-user-store/invalid-jid");
        C05B c05b = this.A02;
        C02L c02l = this.A01;
        c02l.A05();
        UserJid userJid2 = c02l.A03;
        if (userJid2 != null) {
            if (userJid.equals(userJid2)) {
                userJid = C011405q.A00;
            }
            return c05b.A02(userJid);
        }
        throw null;
    }

    public void A02(AbstractC011205o abstractC011205o) {
        StringBuilder sb = new StringBuilder("participant-device-store/resetSentSenderKeyForAllParticipants/");
        sb.append(abstractC011205o);
        Log.i(sb.toString());
        long A02 = this.A02.A02(abstractC011205o);
        C0CD A04 = this.A03.A04();
        try {
            C0CF A0B = A04.A02.A0B("UPDATE group_participant_device SET sent_sender_key = ? WHERE group_participant_row_id IN (SELECT _id FROM group_participant_user WHERE group_jid_row_id = ?)");
            A0B.A00.bindAllArgsAsStrings(new String[]{"0", String.valueOf(A02)});
            A0B.A00();
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

    public void A03(AbstractC011205o abstractC011205o, UserJid userJid, long j, C07D c07d) {
        StringBuilder sb = new StringBuilder("participant-device-store/addParticipantDevices/");
        sb.append(abstractC011205o);
        sb.append(" ");
        sb.append(userJid);
        sb.append(" ");
        sb.append(j);
        sb.append(" ");
        sb.append(c07d);
        Log.i(sb.toString());
        C000700j.A09(!c07d.A00.isEmpty(), "participant-device-store/addParticipantDevices/empty devices");
        C05B c05b = this.A02;
        long A02 = c05b.A02(abstractC011205o);
        C0CD A04 = this.A03.A04();
        try {
            C03790Hb A01 = A04.A01();
            C0CF A0B = A04.A02.A0B("INSERT INTO group_participant_device (group_participant_row_id, device_jid_row_id, sent_sender_key) SELECT _id, ?, ? FROM group_participant_user WHERE group_jid_row_id = ? AND user_jid_row_id = ?");
            SQLiteStatement sQLiteStatement = A0B.A00;
            sQLiteStatement.bindLong(3, A02);
            sQLiteStatement.bindLong(4, j);
            Iterator it = c07d.iterator();
            while (true) {
                C04250Jl c04250Jl = (C04250Jl) it;
                if (c04250Jl.hasNext()) {
                    C04430Kd c04430Kd = (C04430Kd) c04250Jl.next();
                    DeviceJid deviceJid = c04430Kd.A01;
                    if (deviceJid.userJid.equals(userJid)) {
                        sQLiteStatement.bindLong(1, c05b.A02(deviceJid));
                        sQLiteStatement.bindLong(2, c04430Kd.A00 ? 1L : 0L);
                        A0B.A01();
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("participant-device-store/incorrect device jid ");
                        sb2.append(deviceJid);
                        sb2.append(" for user ");
                        sb2.append(userJid);
                        throw new RuntimeException(sb2.toString());
                    }
                } else {
                    A01.A00();
                    A01.close();
                    A04.close();
                    return;
                }
            }
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

    public void A04(AbstractC011205o abstractC011205o, UserJid userJid, long j, C07D c07d) {
        StringBuilder sb = new StringBuilder("participant-device-store/updateParticipantDevices/");
        sb.append(abstractC011205o);
        sb.append(" ");
        sb.append(userJid);
        sb.append(" ");
        sb.append(j);
        sb.append(" ");
        sb.append(c07d);
        Log.i(sb.toString());
        C05E c05e = this.A03;
        C0CD A04 = c05e.A04();
        try {
            C03790Hb A01 = A04.A01();
            StringBuilder sb2 = new StringBuilder("participant-device-store/deleteParticipantDevices/");
            sb2.append(abstractC011205o);
            sb2.append(" ");
            sb2.append(j);
            Log.i(sb2.toString());
            long A02 = this.A02.A02(abstractC011205o);
            C0CD A042 = c05e.A04();
            C0CF A0B = A042.A02.A0B("DELETE FROM group_participant_device WHERE group_participant_row_id IN (SELECT _id FROM group_participant_user WHERE group_jid_row_id = ? AND user_jid_row_id = ?)");
            A0B.A00.bindAllArgsAsStrings(new String[]{String.valueOf(A02), String.valueOf(j)});
            A0B.A00();
            A042.close();
            A03(abstractC011205o, userJid, j, c07d);
            A01.A00();
            A01.close();
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
}
