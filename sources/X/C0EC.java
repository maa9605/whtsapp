package X;

import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0EC */
/* loaded from: classes.dex */
public class C0EC {
    public static volatile C0EC A06;
    public final AbstractC000600i A00;
    public final C02L A01;
    public final C000500h A02;
    public final C0FA A03;
    public final C0F4 A04;
    public final C0EE A05;

    public C0EC(AbstractC000600i abstractC000600i, C02L c02l, C0F4 c0f4, C0EE c0ee, C000500h c000500h, C0FA c0fa) {
        this.A00 = abstractC000600i;
        this.A01 = c02l;
        this.A04 = c0f4;
        this.A05 = c0ee;
        this.A02 = c000500h;
        this.A03 = c0fa;
    }

    public static C0EC A00() {
        if (A06 == null) {
            synchronized (C0EC.class) {
                if (A06 == null) {
                    A06 = new C0EC(AbstractC000600i.A00(), C02L.A00(), C0F4.A00(), C0EE.A00(), C000500h.A00(), C0FA.A00);
                }
            }
        }
        return A06;
    }

    public long A01(UserJid userJid) {
        C05250Nx A03 = A03(userJid);
        if (A03 == null) {
            return 0L;
        }
        return A03.A01;
    }

    public C07D A02() {
        C02L c02l = this.A01;
        c02l.A05();
        if (c02l.A03 == null) {
            return C07D.A01;
        }
        return this.A04.A01().A02();
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0098 A[Catch: all -> 0x00af, TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:63:0x0043, B:65:0x0049, B:66:0x004f, B:68:0x0051, B:79:0x009b, B:69:0x0067, B:78:0x0098, B:86:0x00ae), top: B:99:0x0043 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C05250Nx A03(com.whatsapp.jid.UserJid r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L4
            r0 = 0
            return r0
        L4:
            X.02L r0 = r7.A01
            r0.A05()
            com.whatsapp.jid.UserJid r0 = r0.A03
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L2a
            X.00h r0 = r7.A02
            android.content.SharedPreferences r4 = r0.A00
            java.lang.String r1 = "adv_raw_id"
            r0 = -1
            int r3 = r4.getInt(r1, r0)
            java.lang.String r2 = "adv_timestamp_sec"
            r0 = -1
            long r1 = r4.getLong(r2, r0)
            X.0Nx r0 = new X.0Nx
            r0.<init>(r3, r1)
            return r0
        L2a:
            X.0F4 r2 = r7.A04
            X.02L r0 = r2.A01
            r0.A05()
            com.whatsapp.jid.UserJid r0 = r0.A03
            boolean r0 = r8.equals(r0)
            r1 = r0 ^ 1
            java.lang.String r0 = "only query info for others"
            X.C000700j.A0A(r1, r0)
            X.0F7 r4 = r2.A03
            java.util.Map r3 = r4.A03
            monitor-enter(r3)
            boolean r0 = r3.containsKey(r8)     // Catch: java.lang.Throwable -> Lb6
            if (r0 == 0) goto L51
            java.lang.Object r0 = r3.get(r8)     // Catch: java.lang.Throwable -> Lb6
            X.0Nx r0 = (X.C05250Nx) r0     // Catch: java.lang.Throwable -> Lb6
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb6
            goto La5
        L51:
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> Lb6
            X.05B r0 = r4.A00     // Catch: java.lang.Throwable -> Lb6
            long r0 = r0.A02(r8)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r1 = java.lang.Long.toString(r0)     // Catch: java.lang.Throwable -> Lb6
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> Lb6
            X.05E r0 = r4.A01     // Catch: java.lang.Throwable -> Lb6
            X.0CD r4 = r0.A03()     // Catch: java.lang.Throwable -> Lb6
            X.0CE r1 = r4.A02     // Catch: java.lang.Throwable -> Laf
            java.lang.String r0 = "SELECT raw_id, timestamp FROM user_device_info WHERE user_jid_row_id = ?"
            android.database.Cursor r6 = r1.A07(r0, r2)     // Catch: java.lang.Throwable -> Laf
            if (r6 == 0) goto L72
            goto L74
        L72:
            r5 = 0
            goto L93
        L74:
            boolean r0 = r6.moveToNext()     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto L72
            java.lang.String r0 = "raw_id"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> La6
            int r2 = r6.getInt(r0)     // Catch: java.lang.Throwable -> La6
            java.lang.String r0 = "timestamp"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> La6
            long r0 = r6.getLong(r0)     // Catch: java.lang.Throwable -> La6
            X.0Nx r5 = new X.0Nx     // Catch: java.lang.Throwable -> La6
            r5.<init>(r2, r0)     // Catch: java.lang.Throwable -> La6
        L93:
            r3.put(r8, r5)     // Catch: java.lang.Throwable -> La6
            if (r6 == 0) goto L9b
            r6.close()     // Catch: java.lang.Throwable -> Laf
        L9b:
            r4.close()     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object r0 = r3.get(r8)     // Catch: java.lang.Throwable -> Lb6
            X.0Nx r0 = (X.C05250Nx) r0     // Catch: java.lang.Throwable -> Lb6
            goto L4f
        La5:
            return r0
        La6:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> La8
        La8:
            r0 = move-exception
            if (r6 == 0) goto Lae
            r6.close()     // Catch: java.lang.Throwable -> Lae
        Lae:
            throw r0     // Catch: java.lang.Throwable -> Laf
        Laf:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> Lb1
        Lb1:
            r0 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> Lb5
        Lb5:
            throw r0     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EC.A03(com.whatsapp.jid.UserJid):X.0Nx");
    }

    public String A04(UserJid userJid) {
        if (userJid == null) {
            return "";
        }
        HashSet hashSet = new HashSet(A07(userJid));
        return !hashSet.isEmpty() ? C002501g.A0F(hashSet) : "";
    }

    public Map A05(UserJid userJid) {
        C000700j.A07(!this.A01.A0A(userJid));
        HashMap hashMap = new HashMap(this.A04.A02(userJid).A00);
        DeviceJid of = DeviceJid.of(userJid);
        if (of != null) {
            hashMap.put(of, 0L);
            return hashMap;
        }
        throw null;
    }

    public Set A06(UserJid userJid) {
        if (this.A05.A04()) {
            return A07(userJid);
        }
        HashSet hashSet = new HashSet();
        hashSet.add(userJid.getPrimaryDevice());
        return hashSet;
    }

    public Set A07(UserJid userJid) {
        C02L c02l = this.A01;
        c02l.A05();
        if (userJid.equals(c02l.A03)) {
            HashSet A02 = A02().A02();
            c02l.A05();
            DeviceJid deviceJid = c02l.A02;
            if (deviceJid != null) {
                A02.add(deviceJid);
                return A02;
            }
            throw null;
        }
        HashSet A022 = this.A04.A02(userJid).A02().A02();
        DeviceJid of = DeviceJid.of(userJid);
        if (of != null) {
            A022.add(of);
            return A022;
        }
        throw null;
    }

    public void A08(UserJid userJid) {
        C000700j.A07(!this.A01.A0A(userJid));
        HashSet A02 = this.A04.A02(userJid).A02().A02();
        A02.remove(userJid.getPrimaryDevice());
        A0A(userJid, C07D.A01(A02));
    }

    public void A09(UserJid userJid, C07E c07e) {
        HashMap hashMap = new HashMap(c07e.A00);
        C0F4 c0f4 = this.A04;
        HashMap hashMap2 = new HashMap(c0f4.A02(userJid).A00);
        for (Object obj : hashMap2.keySet()) {
            hashMap.remove(obj);
        }
        A0B(userJid, hashMap);
        if (!hashMap2.containsKey(userJid.getPrimaryDevice())) {
            StringBuilder sb = new StringBuilder("UserDeviceManager/addDevicesForUser/no primary device for this user, jid=");
            sb.append(userJid);
            Log.w(sb.toString());
            hashMap.put(userJid.getPrimaryDevice(), 0L);
        }
        if (hashMap.isEmpty()) {
            return;
        }
        C07E A00 = C07E.A00(hashMap);
        C02L c02l = c0f4.A01;
        c02l.A05();
        C000700j.A0A(!userJid.equals(c02l.A03), "only add new device for others");
        if (!A00.A00.isEmpty()) {
            C0CD A04 = c0f4.A02.A04();
            try {
                C03790Hb A002 = A04.A00();
                C07D A02 = c0f4.A02(userJid).A02();
                C0F5 c0f5 = c0f4.A05;
                C0CD A042 = c0f5.A01.A04();
                C03790Hb A003 = A042.A00();
                try {
                    Iterator it = A00.A01().iterator();
                    while (true) {
                        C04250Jl c04250Jl = (C04250Jl) it;
                        if (!c04250Jl.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) c04250Jl.next();
                        c0f5.A01(userJid, (DeviceJid) entry.getKey(), ((Long) entry.getValue()).longValue());
                    }
                    A003.A00();
                    c0f5.A00(A042, userJid);
                    A042.close();
                    C07D A022 = A00.A02();
                    C07D c07d = C07D.A01;
                    C05320Of c05320Of = c0f4.A00;
                    if (c05320Of != null) {
                        c05320Of.A03(userJid, A02, A022, c07d);
                    }
                    A002.A00();
                    A002.close();
                    A04.close();
                    C07D A023 = A00.A02();
                    C05320Of c05320Of2 = c0f4.A00;
                    if (c05320Of2 != null) {
                        c05320Of2.A02(userJid, A02, A023, c07d);
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        try {
                            A003.close();
                        } catch (Throwable unused) {
                        }
                    }
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        A04.close();
                    } catch (Throwable unused2) {
                    }
                    throw th3;
                }
            }
        }
        this.A03.A02(userJid, hashMap.keySet(), Collections.emptySet());
    }

    public void A0A(UserJid userJid, C07D c07d) {
        HashSet A02 = c07d.A02();
        C0F4 c0f4 = this.A04;
        A02.retainAll(c0f4.A02(userJid).A02().A02());
        if (A02.isEmpty()) {
            return;
        }
        C07D A01 = C07D.A01(A02);
        C02L c02l = c0f4.A01;
        c02l.A05();
        C000700j.A0A(!userJid.equals(c02l.A03), "only remove device for others");
        DeviceJid primaryDevice = userJid.getPrimaryDevice();
        Set set = A01.A00;
        C000700j.A0A(!set.contains(primaryDevice), "never remove primary device.");
        if (!set.isEmpty()) {
            C0CD A04 = c0f4.A02.A04();
            try {
                C03790Hb A00 = A04.A00();
                C07D A022 = c0f4.A02(userJid).A02();
                C0F5 c0f5 = c0f4.A05;
                C0CD A042 = c0f5.A01.A04();
                C03790Hb A002 = A042.A00();
                try {
                    Iterator it = A01.iterator();
                    while (true) {
                        C04250Jl c04250Jl = (C04250Jl) it;
                        if (!c04250Jl.hasNext()) {
                            break;
                        }
                        C05B c05b = c0f5.A00;
                        long A023 = c05b.A02(userJid);
                        long A024 = c05b.A02((DeviceJid) c04250Jl.next());
                        C0CF A012 = c0f5.A02.A01("DELETE FROM user_device WHERE user_jid_row_id=? AND device_jid_row_id=?");
                        A012.A04(1, A023);
                        A012.A04(2, A024);
                        A012.A00();
                    }
                    A002.A00();
                    c0f5.A00(A042, userJid);
                    A042.close();
                    C07D c07d2 = C07D.A01;
                    C05320Of c05320Of = c0f4.A00;
                    if (c05320Of != null) {
                        c05320Of.A03(userJid, A022, c07d2, A01);
                    }
                    A00.A00();
                    A00.close();
                    A04.close();
                    C05320Of c05320Of2 = c0f4.A00;
                    if (c05320Of2 != null) {
                        c05320Of2.A02(userJid, A022, c07d2, A01);
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        try {
                            A002.close();
                        } catch (Throwable unused) {
                        }
                    }
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        A04.close();
                    } catch (Throwable unused2) {
                    }
                    throw th3;
                }
            }
        }
        this.A03.A02(userJid, Collections.emptySet(), A02);
    }

    public void A0B(UserJid userJid, HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!((DeviceJid) entry.getKey()).userJid.equals(userJid)) {
                hashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        if (hashMap2.size() > 0) {
            AbstractC000600i abstractC000600i = this.A00;
            StringBuilder A0U = C000200d.A0U("userJid=", userJid, "; deviceJids=");
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry2 : hashMap2.entrySet()) {
                sb.append(",");
                sb.append(entry2.getKey());
                sb.append(":");
                sb.append(entry2.getValue());
            }
            A0U.append(sb.length() > 0 ? sb.substring(1) : "no-data-found");
            abstractC000600i.A09("userdevicemanager/invalid_devices", A0U.toString(), false);
            for (Object obj : hashMap2.keySet()) {
                hashMap.remove(obj);
            }
        }
    }

    public boolean A0C(final UserJid userJid, C07E c07e, C05250Nx c05250Nx) {
        C02L c02l;
        C02L c02l2;
        this.A01.A05();
        C000700j.A0A(!userJid.equals(c02l.A03), "cannot refresh yourself device");
        HashMap hashMap = new HashMap(c07e.A00);
        A0B(userJid, hashMap);
        C07E A00 = C07E.A00(hashMap);
        C0F4 c0f4 = this.A04;
        C07E A02 = c0f4.A02(userJid);
        c0f4.A01.A05();
        C000700j.A0A(!userJid.equals(c02l2.A03), "only refresh devices for others");
        C000700j.A0A(A00.A02().A00.contains(userJid.getPrimaryDevice()), "device list should always include primary.");
        C07E A022 = c0f4.A02(userJid);
        C07D A023 = C002501g.A02(A00, A022);
        C07D A03 = C002501g.A03(A00, A022);
        if (!A023.A00.isEmpty() || !A03.A00.isEmpty()) {
            C0CD A04 = c0f4.A02.A04();
            try {
                C03790Hb A002 = A04.A00();
                C0F5 c0f5 = c0f4.A05;
                long A024 = c0f5.A00.A02(userJid);
                C0CD A042 = c0f5.A01.A04();
                C03790Hb A003 = A042.A00();
                C0CF A01 = c0f5.A02.A01("DELETE FROM user_device WHERE user_jid_row_id=?");
                A01.A04(1, A024);
                A01.A00();
                if (!A00.A00.isEmpty()) {
                    Iterator it = A00.A01().iterator();
                    while (true) {
                        C04250Jl c04250Jl = (C04250Jl) it;
                        if (!c04250Jl.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) c04250Jl.next();
                        c0f5.A01(userJid, (DeviceJid) entry.getKey(), ((Long) entry.getValue()).longValue());
                    }
                }
                A003.A00();
                c0f5.A00(A042, userJid);
                A003.close();
                A042.close();
                if (c05250Nx != null) {
                    final C0F7 c0f7 = c0f4.A03;
                    int i = c05250Nx.A00;
                    long j = c05250Nx.A01;
                    long A025 = c0f7.A00.A02(userJid);
                    C0CD A043 = c0f7.A01.A04();
                    C03790Hb A004 = A043.A00();
                    C05L c05l = c0f7.A02;
                    C0CF A012 = c05l.A01("UPDATE user_device_info SET raw_id = ?, timestamp = ? WHERE user_jid_row_id = ?");
                    long j2 = i;
                    A012.A04(1, j2);
                    A012.A04(2, j);
                    A012.A04(3, A025);
                    if (A012.A00() != 1) {
                        C0CF A013 = c05l.A01("INSERT INTO user_device_info(user_jid_row_id, raw_id, timestamp) VALUES (?, ?, ?)");
                        A013.A04(1, A025);
                        A013.A04(2, j2);
                        A013.A04(3, j);
                        A013.A01();
                    }
                    A004.A00();
                    A043.A02(new Runnable() { // from class: X.1OY
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0F7 c0f72 = c0f7;
                            UserJid userJid2 = userJid;
                            Map map = c0f72.A03;
                            synchronized (map) {
                                map.remove(userJid2);
                            }
                        }
                    });
                    A004.close();
                    A043.close();
                }
                C07D A026 = A022.A02();
                C05320Of c05320Of = c0f4.A00;
                if (c05320Of != null) {
                    c05320Of.A03(userJid, A026, A023, A03);
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
        C07D A027 = A022.A02();
        C05320Of c05320Of2 = c0f4.A00;
        if (c05320Of2 != null) {
            c05320Of2.A02(userJid, A027, A023, A03);
        }
        HashSet A028 = C002501g.A02(A00, A02).A02();
        HashSet A029 = C002501g.A03(A00, A02).A02();
        this.A03.A02(userJid, A028, A029);
        return (A028.isEmpty() && A029.isEmpty()) ? false : true;
    }

    public boolean A0D(UserJid[] userJidArr, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (UserJid userJid : userJidArr) {
            hashSet.addAll(A07(userJid));
        }
        return C002501g.A0F(hashSet).equals(str);
    }
}
