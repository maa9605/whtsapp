package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0F3 */
/* loaded from: classes.dex */
public class C0F3 {
    public static volatile C0F3 A0E;
    public final AbstractC000600i A00;
    public final C02L A01;
    public final C04h A02;
    public final AnonymousClass012 A03;
    public final C05D A04;
    public final C0FD A05 = new C0FD() { // from class: X.1km
        {
            C0F3.this = this;
        }

        @Override // X.C0FD
        public final C02630Ce A6h(AbstractC011205o abstractC011205o) {
            final boolean z;
            final C0F3 c0f3 = C0F3.this;
            C02630Ce c02630Ce = new C02630Ce(abstractC011205o);
            StringBuilder sb = new StringBuilder();
            sb.append("participant-user-store/migrated=");
            sb.append(c0f3.A0D());
            Log.i(sb.toString());
            final AbstractC011205o abstractC011205o2 = c02630Ce.A02;
            AnonymousClass012 anonymousClass012 = c0f3.A03;
            long A04 = anonymousClass012.A04();
            StringBuilder sb2 = new StringBuilder("participant-user-store/getGroupParticipants/");
            sb2.append(abstractC011205o2);
            Log.i(sb2.toString());
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            C05B c05b = c0f3.A07;
            String valueOf = String.valueOf(c05b.A02(abstractC011205o2));
            C05E c05e = c0f3.A08;
            C0CD A03 = c05e.A03();
            Cursor A07 = A03.A02.A07("SELECT user, server, agent, device, type, raw_string, user_jid_row_id, rank, pending FROM group_participant_user JOIN jid ON user_jid_row_id = jid._id WHERE group_jid_row_id = ?", new String[]{valueOf});
            C0D7 c0d7 = null;
            try {
                int columnIndexOrThrow = A07.getColumnIndexOrThrow("user");
                int columnIndexOrThrow2 = A07.getColumnIndexOrThrow("server");
                int columnIndexOrThrow3 = A07.getColumnIndexOrThrow("agent");
                int columnIndexOrThrow4 = A07.getColumnIndexOrThrow("device");
                int columnIndexOrThrow5 = A07.getColumnIndexOrThrow("type");
                int columnIndexOrThrow6 = A07.getColumnIndexOrThrow("raw_string");
                int columnIndexOrThrow7 = A07.getColumnIndexOrThrow("user_jid_row_id");
                while (A07.moveToNext()) {
                    final long j = A07.getLong(columnIndexOrThrow7);
                    try {
                        UserJid userJid = (UserJid) c05b.A08(UserJid.class, A07.getLong(columnIndexOrThrow7), A07, A03, columnIndexOrThrow, columnIndexOrThrow2, columnIndexOrThrow3, columnIndexOrThrow4, columnIndexOrThrow5, columnIndexOrThrow6);
                        int i = A07.getInt(A07.getColumnIndexOrThrow("rank"));
                        boolean z2 = A07.getInt(A07.getColumnIndexOrThrow("pending")) == 1;
                        if (userJid == null) {
                            Log.e("participant-user-store/getGroupParticipants invalid jid from db");
                        } else {
                            final UserJid A02 = c0f3.A02(userJid);
                            final C0FC c0fc = c0f3.A09;
                            final HashSet hashSet = new HashSet();
                            C05B c05b2 = c0fc.A02;
                            long A022 = c05b2.A02(abstractC011205o2);
                            C0CD A032 = c0fc.A03.A03();
                            try {
                                Cursor A072 = A032.A02.A07("SELECT user, server, agent, device, type, raw_string, device_jid_row_id, sent_sender_key FROM group_participant_device JOIN jid ON device_jid_row_id = jid._id JOIN group_participant_user ON group_participant_row_id = group_participant_user._id WHERE group_jid_row_id = ? AND user_jid_row_id = ?", new String[]{String.valueOf(A022), String.valueOf(j)});
                                try {
                                    int columnIndexOrThrow8 = A072.getColumnIndexOrThrow("user");
                                    int columnIndexOrThrow9 = A072.getColumnIndexOrThrow("server");
                                    int columnIndexOrThrow10 = A072.getColumnIndexOrThrow("agent");
                                    int columnIndexOrThrow11 = A072.getColumnIndexOrThrow("device");
                                    int columnIndexOrThrow12 = A072.getColumnIndexOrThrow("type");
                                    int columnIndexOrThrow13 = A072.getColumnIndexOrThrow("raw_string");
                                    int columnIndexOrThrow14 = A072.getColumnIndexOrThrow("device_jid_row_id");
                                    boolean z3 = false;
                                    while (A072.moveToNext()) {
                                        DeviceJid deviceJid = (DeviceJid) c05b2.A08(DeviceJid.class, A072.getLong(columnIndexOrThrow14), A072, A032, columnIndexOrThrow8, columnIndexOrThrow9, columnIndexOrThrow10, columnIndexOrThrow11, columnIndexOrThrow12, columnIndexOrThrow13);
                                        if (deviceJid != null) {
                                            C02L c02l = c0fc.A01;
                                            if (c02l.A0A(A02) && !c02l.A0A(deviceJid.userJid)) {
                                                StringBuilder sb3 = new StringBuilder();
                                                sb3.append("participant-device-store/getParticipantDevices/invalid self device: ");
                                                sb3.append(deviceJid);
                                                Log.w(sb3.toString());
                                                c0fc.A00.A09("participant-devices-invalid-self-devices", String.valueOf(deviceJid.isPrimary()), false);
                                                if (deviceJid.isPrimary()) {
                                                    c02l.A05();
                                                    deviceJid = c02l.A02;
                                                } else {
                                                    deviceJid = null;
                                                }
                                                z3 = true;
                                                if (deviceJid != null) {
                                                }
                                            }
                                            hashSet.add(new C04430Kd(deviceJid, A072.getInt(A072.getColumnIndexOrThrow("sent_sender_key")) == 1));
                                        }
                                    }
                                    if (c0fc.A01.A0A(A02) && hashSet.isEmpty()) {
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append("participant-device-store/getParticipantDevices/empty self devices for: ");
                                        sb4.append(abstractC011205o2);
                                        sb4.append(" userRowId=");
                                        sb4.append(j);
                                        throw new RuntimeException(sb4.toString());
                                    }
                                    if (z3) {
                                        try {
                                            c0fc.A04.AS1(new Runnable() { // from class: X.1ON
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    c0fc.A04(abstractC011205o2, A02, j, C07D.A01(hashSet));
                                                }
                                            });
                                        } catch (Throwable th) {
                                            th = th;
                                            throw th;
                                        }
                                    }
                                    try {
                                        A072.close();
                                        A032.close();
                                        C0D7 c0d72 = new C0D7(A02, hashSet, i, z2);
                                        if (c0f3.A01.A0A(userJid)) {
                                            Log.e("participant-user-store/getGroupParticipants/found orphaned me participant");
                                            c0f3.A00.A09("participant-user-orphaned-me", abstractC011205o2.getClass().toString(), false);
                                            c0d7 = c0d72;
                                        } else {
                                            concurrentHashMap.put(c0d72.A03, c0d72);
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        throw th;
                    }
                }
                if (c0d7 != null) {
                    C02L c02l2 = c0f3.A01;
                    c02l2.A05();
                    UserJid userJid2 = c02l2.A03;
                    if (userJid2 != null) {
                        if (((C0D7) concurrentHashMap.get(userJid2)) == null) {
                            concurrentHashMap.put(c0d7.A03, c0d7);
                            z = true;
                        } else {
                            z = false;
                        }
                        final C0D7 c0d73 = c0d7;
                        c0f3.A0D.AS1(new Runnable() { // from class: X.1OO
                            @Override // java.lang.Runnable
                            public final void run() {
                                C0F3 c0f32 = c0f3;
                                AbstractC011205o abstractC011205o3 = abstractC011205o2;
                                C0D7 c0d74 = c0d73;
                                boolean z4 = z;
                                C0CD A042 = c0f32.A08.A04();
                                try {
                                    C03790Hb A00 = A042.A00();
                                    c0f32.A0F(abstractC011205o3, c0f32.A07.A02(c0d74.A03));
                                    if (z4) {
                                        c0f32.A08(abstractC011205o3, c0d74);
                                    }
                                    A00.A00();
                                    A00.close();
                                } catch (Throwable th6) {
                                    try {
                                        throw th6;
                                    } finally {
                                        try {
                                            A042.close();
                                        } catch (Throwable unused) {
                                        }
                                    }
                                }
                            }
                        });
                    } else {
                        throw null;
                    }
                }
                A07.close();
                A03.close();
                C000200d.A0e(anonymousClass012, A04, c0f3.A04, "ParticipantUserStore/getGroupParticipants");
                c02630Ce.A01 = concurrentHashMap;
                c02630Ce.A07();
                int i2 = 0;
                Iterator it = c02630Ce.A05().iterator();
                while (true) {
                    C04250Jl c04250Jl = (C04250Jl) it;
                    if (!c04250Jl.hasNext()) {
                        break;
                    }
                    ((C0D7) c04250Jl.next()).A00 = i2;
                    i2++;
                }
                StringBuilder A0P = C000200d.A0P("participant-user-store/syncParticipantDevicesWithDeviceStore/migrated=");
                A0P.append(c0f3.A0D());
                Log.i(A0P.toString());
                if (c0f3.A0C.A04()) {
                    StringBuilder A0P2 = C000200d.A0P("participant-user-store/syncParticipantDevicesWithDeviceStore/");
                    A0P2.append(abstractC011205o2);
                    Log.i(A0P2.toString());
                    HashMap hashMap = new HashMap();
                    Iterator it2 = c02630Ce.A05().iterator();
                    while (true) {
                        C04250Jl c04250Jl2 = (C04250Jl) it2;
                        if (!c04250Jl2.hasNext()) {
                            break;
                        }
                        UserJid userJid3 = ((C0D7) c04250Jl2.next()).A03;
                        Pair A023 = c02630Ce.A02(userJid3, C07D.A01(c0f3.A0B.A06(userJid3)));
                        if (((Boolean) A023.first).booleanValue() || ((Boolean) A023.second).booleanValue()) {
                            hashMap.put(userJid3, A023.second);
                        }
                    }
                    if (!hashMap.isEmpty()) {
                        C0CD A042 = c05e.A04();
                        C03790Hb A01 = A042.A01();
                        try {
                            for (Map.Entry entry : hashMap.entrySet()) {
                                c0f3.A0B((UserJid) entry.getKey(), c02630Ce, ((Boolean) entry.getValue()).booleanValue());
                            }
                            A01.A00();
                            A042.close();
                            return c02630Ce;
                        } finally {
                        }
                    }
                }
                return c02630Ce;
            } catch (Throwable th6) {
                th = th6;
            }
        }
    };
    public final C02960Do A06;
    public final C05B A07;
    public final C05E A08;
    public final C0FC A09;
    public final C05C A0A;
    public final C0EC A0B;
    public final C0EE A0C;
    public final InterfaceC002901k A0D;

    public C0F3(AnonymousClass012 anonymousClass012, C05B c05b, AbstractC000600i abstractC000600i, C02L c02l, InterfaceC002901k interfaceC002901k, C0EE c0ee, C05C c05c, C0EC c0ec, C04h c04h, C05D c05d, C05E c05e, C02960Do c02960Do, C0FC c0fc) {
        this.A03 = anonymousClass012;
        this.A07 = c05b;
        this.A00 = abstractC000600i;
        this.A01 = c02l;
        this.A0D = interfaceC002901k;
        this.A0C = c0ee;
        this.A0A = c05c;
        this.A0B = c0ec;
        this.A02 = c04h;
        this.A04 = c05d;
        this.A08 = c05e;
        this.A06 = c02960Do;
        this.A09 = c0fc;
    }

    public static C0F3 A00() {
        if (A0E == null) {
            synchronized (C0F3.class) {
                if (A0E == null) {
                    A0E = new C0F3(AnonymousClass012.A00(), C05B.A00(), AbstractC000600i.A00(), C02L.A00(), C002801j.A00(), C0EE.A00(), C05C.A00(), C0EC.A00(), C04h.A00(), C05D.A00(), C05E.A00(), C02960Do.A02, C0FC.A00());
                }
            }
        }
        return A0E;
    }

    public final long A01(UserJid userJid) {
        C000700j.A09(!TextUtils.isEmpty(userJid.getRawString()), "participant-user-store/invalid-jid");
        C05B c05b = this.A07;
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

    public final UserJid A02(UserJid userJid) {
        if (userJid.equals(C011405q.A00)) {
            StringBuilder A0P = C000200d.A0P("participant-user-store/sanitizeParticipantJid/my jid = ");
            C02L c02l = this.A01;
            c02l.A05();
            C000200d.A1J(A0P, c02l.A03);
            c02l.A05();
            userJid = c02l.A03;
            if (userJid == null) {
                throw null;
            }
        }
        return userJid;
    }

    public Set A03(AbstractC011205o abstractC011205o) {
        UserJid A02;
        HashSet hashSet = new HashSet();
        C05B c05b = this.A07;
        String valueOf = String.valueOf(c05b.A02(abstractC011205o));
        C0CD A03 = this.A08.A03();
        try {
            Cursor A07 = A03.A02.A07("SELECT user, server, agent, device, type, raw_string, user_jid_row_id FROM group_participant_user JOIN jid ON user_jid_row_id = jid._id WHERE group_jid_row_id = ?", new String[]{valueOf});
            int columnIndexOrThrow = A07.getColumnIndexOrThrow("user");
            int columnIndexOrThrow2 = A07.getColumnIndexOrThrow("server");
            int columnIndexOrThrow3 = A07.getColumnIndexOrThrow("agent");
            int columnIndexOrThrow4 = A07.getColumnIndexOrThrow("device");
            int columnIndexOrThrow5 = A07.getColumnIndexOrThrow("type");
            int columnIndexOrThrow6 = A07.getColumnIndexOrThrow("raw_string");
            int columnIndexOrThrow7 = A07.getColumnIndexOrThrow("user_jid_row_id");
            while (A07.moveToNext()) {
                UserJid userJid = (UserJid) c05b.A08(UserJid.class, A07.getLong(columnIndexOrThrow7), A07, A03, columnIndexOrThrow, columnIndexOrThrow2, columnIndexOrThrow3, columnIndexOrThrow4, columnIndexOrThrow5, columnIndexOrThrow6);
                if (userJid != null) {
                    A02 = A02(userJid);
                } else {
                    A02 = null;
                }
                if (A02 != null) {
                    hashSet.add(A02);
                }
            }
            A07.close();
            return hashSet;
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

    public Set A04(UserJid userJid) {
        HashSet hashSet = new HashSet();
        C0CD A03 = this.A08.A03();
        try {
            Cursor A07 = A03.A02.A07("SELECT group_jid_row_id FROM group_participant_user WHERE user_jid_row_id = ?", new String[]{String.valueOf(A01(userJid))});
            while (A07.moveToNext()) {
                AbstractC011205o abstractC011205o = (AbstractC011205o) this.A07.A07(AbstractC011205o.class, A07.getLong(A07.getColumnIndexOrThrow("group_jid_row_id")));
                if (abstractC011205o != null) {
                    hashSet.add(abstractC011205o);
                }
            }
            A07.close();
            return hashSet;
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

    public void A05() {
        C0CD A04 = this.A08.A04();
        try {
            C03790Hb A00 = A04.A00();
            C0CE c0ce = A04.A02;
            c0ce.A01("group_participant_user", null, null);
            c0ce.A01("group_participant_device", null, null);
            C05C c05c = this.A0A;
            c05c.A03("participant_user_ready");
            c05c.A03("migration_participant_user_index");
            c05c.A03("migration_participant_user_retry");
            c05c.A03("broadcast_me_jid_ready");
            c05c.A03("migration_broadcast_me_jid_index");
            c05c.A03("migration_broadcast_me_jid_retry");
            this.A0C.A01(false);
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

    /* JADX WARN: Finally extract failed */
    public void A06(C02630Ce c02630Ce) {
        StringBuilder sb = new StringBuilder("participant-user-store/resetSentSenderKeyForAllParticipants/");
        sb.append(c02630Ce);
        Log.i(sb.toString());
        AbstractC011205o abstractC011205o = c02630Ce.A02;
        C0CD A04 = this.A08.A04();
        try {
            C03790Hb A00 = A04.A00();
            this.A09.A02(abstractC011205o);
            A07(c02630Ce);
            A00.A00();
            A00.close();
            A04.close();
            C04h c04h = this.A02;
            c04h.A01.A01(new C27281Mt(abstractC011205o));
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

    public final void A07(C02630Ce c02630Ce) {
        Iterator it = c02630Ce.A05().iterator();
        while (true) {
            C04250Jl c04250Jl = (C04250Jl) it;
            if (c04250Jl.hasNext()) {
                Iterator it2 = ((C0D7) c04250Jl.next()).A00().iterator();
                while (true) {
                    C04250Jl c04250Jl2 = (C04250Jl) it2;
                    if (c04250Jl2.hasNext()) {
                        ((C04430Kd) c04250Jl2.next()).A00 = false;
                    }
                }
            } else {
                return;
            }
        }
    }

    public void A08(AbstractC011205o abstractC011205o, C0D7 c0d7) {
        StringBuilder sb = new StringBuilder("participant-user-store/updateGroupParticipant/");
        sb.append(abstractC011205o);
        sb.append(" ");
        sb.append(c0d7);
        Log.i(sb.toString());
        UserJid userJid = c0d7.A03;
        long A01 = A01(userJid);
        String valueOf = String.valueOf(this.A07.A02(abstractC011205o));
        String valueOf2 = String.valueOf(A01);
        ContentValues contentValues = new ContentValues(4);
        contentValues.put("group_jid_row_id", valueOf);
        contentValues.put("user_jid_row_id", valueOf2);
        contentValues.put("rank", Integer.valueOf(c0d7.A01));
        contentValues.put("pending", Integer.valueOf(c0d7.A02 ? 1 : 0));
        String[] strArr = {valueOf, valueOf2};
        C0CD A04 = this.A08.A04();
        try {
            C03790Hb A00 = A04.A00();
            C0CE c0ce = A04.A02;
            if (c0ce.A00("group_participant_user", contentValues, "group_jid_row_id = ? AND user_jid_row_id = ?", strArr) != 0) {
                this.A09.A04(abstractC011205o, userJid, A01, c0d7.A00());
            } else {
                c0ce.A02("group_participant_user", contentValues);
                this.A09.A03(abstractC011205o, userJid, A01, c0d7.A00());
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

    public void A09(AbstractC011205o abstractC011205o, Collection collection) {
        C02630Ce A00 = this.A06.A00(abstractC011205o, this.A05);
        C0CD A04 = this.A08.A04();
        try {
            C03790Hb A002 = A04.A00();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C0D7 c0d7 = (C0D7) A00.A01.get((UserJid) it.next());
                if (c0d7 != null) {
                    A08(abstractC011205o, c0d7);
                }
            }
            A002.A00();
            A002.close();
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

    public void A0A(AbstractC011205o abstractC011205o, List list) {
        C0CD A04 = this.A08.A04();
        try {
            C03790Hb A00 = A04.A00();
            boolean z = false;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (A0G(abstractC011205o, (UserJid) it.next())) {
                    z = true;
                }
            }
            if (z) {
                this.A09.A02(abstractC011205o);
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

    public final void A0B(UserJid userJid, C02630Ce c02630Ce, boolean z) {
        C0D7 c0d7 = (C0D7) c02630Ce.A01.get(userJid);
        AbstractC011205o abstractC011205o = c02630Ce.A02;
        if (c0d7 != null) {
            this.A09.A04(abstractC011205o, userJid, A01(userJid), c0d7.A00());
        }
        if (z) {
            this.A09.A02(abstractC011205o);
        }
    }

    public final void A0C(UserJid userJid, Set set, boolean z) {
        C0CD A04 = this.A08.A04();
        try {
            C03790Hb A00 = A04.A00();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                A0B(userJid, (C02630Ce) it.next(), z);
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

    public boolean A0D() {
        String A02 = this.A0A.A02("participant_user_ready");
        return A02 != null && Integer.parseInt(A02) == 2;
    }

    public boolean A0E() {
        if (A0D()) {
            return true;
        }
        String A02 = this.A0A.A02("migration_participant_user_index");
        return A02 != null && Long.parseLong(A02) > 0;
    }

    public final boolean A0F(AbstractC011205o abstractC011205o, long j) {
        StringBuilder sb = new StringBuilder("participant-user-store/removeGroupParticipant/");
        sb.append(abstractC011205o);
        sb.append(" ");
        sb.append(j);
        Log.i(sb.toString());
        String valueOf = String.valueOf(this.A07.A02(abstractC011205o));
        C0CD A04 = this.A08.A04();
        try {
            boolean z = A04.A02.A01("group_participant_user", "group_jid_row_id = ? AND user_jid_row_id = ?", new String[]{valueOf, String.valueOf(j)}) != 0;
            A04.close();
            return z;
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

    public boolean A0G(AbstractC011205o abstractC011205o, UserJid userJid) {
        StringBuilder sb = new StringBuilder("participant-user-store/removeGroupParticipant/");
        sb.append(abstractC011205o);
        sb.append(" ");
        sb.append(userJid);
        Log.i(sb.toString());
        return A0F(abstractC011205o, A01(userJid));
    }
}
