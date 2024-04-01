package X;

import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0Of  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C05320Of {
    public static volatile C05320Of A0B;
    public final C02L A00;
    public final AnonymousClass012 A01;
    public final C000500h A02;
    public final C01J A03;
    public final C01R A04;
    public final C0CA A05;
    public final C0C9 A06;
    public final C0C8 A07;
    public final C0EC A08;
    public final C0EE A09;
    public final C07A A0A;

    public C05320Of(AnonymousClass012 anonymousClass012, C02L c02l, C01R c01r, C0C9 c0c9, C0EE c0ee, C01J c01j, C0EC c0ec, C000500h c000500h, C0CA c0ca, C07A c07a, C0C8 c0c8) {
        this.A01 = anonymousClass012;
        this.A00 = c02l;
        this.A04 = c01r;
        this.A06 = c0c9;
        this.A09 = c0ee;
        this.A03 = c01j;
        this.A08 = c0ec;
        this.A02 = c000500h;
        this.A05 = c0ca;
        this.A0A = c07a;
        this.A07 = c0c8;
    }

    public static C05320Of A00() {
        if (A0B == null) {
            synchronized (C05320Of.class) {
                if (A0B == null) {
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C02L A002 = C02L.A00();
                    C01B.A00();
                    A0B = new C05320Of(A00, A002, C01R.A02, C0C9.A00(), C0EE.A00(), C01J.A00(), C0EC.A00(), C000500h.A00(), C0CA.A00(), C07A.A01(), C0C8.A00());
                }
            }
        }
        return A0B;
    }

    public final Set A01(UserJid userJid) {
        if (this.A00.A0A(userJid)) {
            return new HashSet(this.A05.A07());
        }
        return this.A07.A03(userJid);
    }

    public void A02(UserJid userJid, C07D c07d, C07D c07d2, C07D c07d3) {
        Set set = c07d3.A00;
        if (!set.isEmpty()) {
            C01R c01r = this.A04;
            c01r.A00.execute(new RunnableEBaseShape2S0200000_I0_2(this, c07d3, 3));
        }
        if (this.A09.A04()) {
            Set set2 = c07d2.A00;
            if (!set2.isEmpty() && !set.isEmpty()) {
                C0C8 c0c8 = this.A07;
                HashSet hashSet = new HashSet();
                Iterator it = c07d.iterator();
                while (true) {
                    C04250Jl c04250Jl = (C04250Jl) it;
                    if (!c04250Jl.hasNext()) {
                        break;
                    }
                    hashSet.add(c04250Jl.next());
                }
                Iterator it2 = c07d3.iterator();
                while (true) {
                    C04250Jl c04250Jl2 = (C04250Jl) it2;
                    if (!c04250Jl2.hasNext()) {
                        break;
                    }
                    hashSet.remove(c04250Jl2.next());
                }
                Iterator it3 = c07d2.iterator();
                while (true) {
                    C04250Jl c04250Jl3 = (C04250Jl) it3;
                    if (!c04250Jl3.hasNext()) {
                        break;
                    }
                    hashSet.add(c04250Jl3.next());
                }
                C07D c07d4 = new C07D(hashSet, null);
                C0F3 c0f3 = c0c8.A08;
                if (c0f3.A0E()) {
                    if (c0f3 != null) {
                        if (!c07d4.A00.isEmpty()) {
                            StringBuilder sb = new StringBuilder("participant-user-store/onDevicesRefreshed/");
                            sb.append(userJid);
                            sb.append("/");
                            sb.append(c07d4);
                            Log.i(sb.toString());
                            Set A04 = c0f3.A04(userJid);
                            HashMap hashMap = new HashMap();
                            Iterator it4 = ((AbstractCollection) A04).iterator();
                            while (it4.hasNext()) {
                                C02630Ce A00 = c0f3.A06.A00((AbstractC011205o) it4.next(), c0f3.A05);
                                Pair A02 = A00.A02(userJid, c07d4);
                                if (((Boolean) A02.first).booleanValue() || ((Boolean) A02.second).booleanValue()) {
                                    hashMap.put(A00, A02.second);
                                }
                            }
                            if (!hashMap.isEmpty()) {
                                C0CD A042 = c0f3.A08.A04();
                                try {
                                    C03790Hb A002 = A042.A00();
                                    for (Map.Entry entry : hashMap.entrySet()) {
                                        c0f3.A0B(userJid, (C02630Ce) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
                                    }
                                    A002.A00();
                                    A002.close();
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
                            return;
                        }
                        return;
                    }
                    throw null;
                }
            } else if (!set2.isEmpty()) {
                C0F3 c0f32 = this.A07.A08;
                if (c0f32.A0E()) {
                    if (c0f32 != null) {
                        if (!set2.isEmpty()) {
                            StringBuilder sb2 = new StringBuilder("participant-user-store/onDevicesAdded/");
                            sb2.append(userJid);
                            sb2.append("/");
                            sb2.append(c07d2);
                            Log.i(sb2.toString());
                            Set A043 = c0f32.A04(userJid);
                            HashSet hashSet2 = new HashSet();
                            Iterator it5 = ((AbstractCollection) A043).iterator();
                            while (it5.hasNext()) {
                                C02630Ce A003 = c0f32.A06.A00((AbstractC011205o) it5.next(), c0f32.A05);
                                C0D7 c0d7 = (C0D7) A003.A01.get(userJid);
                                if (c0d7 == null) {
                                    StringBuilder sb3 = new StringBuilder("GroupParticipants/addDevices/participant ");
                                    sb3.append(userJid);
                                    sb3.append(" doesn't exist");
                                    Log.w(sb3.toString());
                                } else {
                                    Iterator it6 = c07d2.iterator();
                                    while (true) {
                                        C04250Jl c04250Jl4 = (C04250Jl) it6;
                                        if (!c04250Jl4.hasNext()) {
                                            break;
                                        }
                                        C04430Kd c04430Kd = new C04430Kd((DeviceJid) c04250Jl4.next(), false);
                                        ConcurrentHashMap concurrentHashMap = c0d7.A04;
                                        DeviceJid deviceJid = c04430Kd.A01;
                                        if (!concurrentHashMap.containsKey(deviceJid)) {
                                            concurrentHashMap.put(deviceJid, c04430Kd);
                                        }
                                    }
                                    if (!set2.isEmpty()) {
                                        A003.A07();
                                    }
                                }
                                hashSet2.add(A003);
                            }
                            c0f32.A0C(userJid, hashSet2, false);
                            return;
                        }
                        return;
                    }
                    throw null;
                }
            } else if (!set.isEmpty()) {
                C0F3 c0f33 = this.A07.A08;
                if (c0f33.A0E()) {
                    if (c0f33 != null) {
                        if (!set.isEmpty()) {
                            StringBuilder sb4 = new StringBuilder("participant-user-store/onDevicesRemoved/");
                            sb4.append(userJid);
                            sb4.append("/");
                            sb4.append(c07d3);
                            Log.i(sb4.toString());
                            Set A044 = c0f33.A04(userJid);
                            HashSet hashSet3 = new HashSet();
                            Iterator it7 = ((AbstractCollection) A044).iterator();
                            while (it7.hasNext()) {
                                C02630Ce A004 = c0f33.A06.A00((AbstractC011205o) it7.next(), c0f33.A05);
                                C0D7 c0d72 = (C0D7) A004.A01.get(userJid);
                                if (c0d72 == null) {
                                    StringBuilder sb5 = new StringBuilder("GroupParticipants/removeDevices/participant ");
                                    sb5.append(userJid);
                                    sb5.append(" doesn't exist");
                                    Log.w(sb5.toString());
                                } else {
                                    Iterator it8 = c07d3.iterator();
                                    while (true) {
                                        C04250Jl c04250Jl5 = (C04250Jl) it8;
                                        if (!c04250Jl5.hasNext()) {
                                            break;
                                        }
                                        c0d72.A04.remove(c04250Jl5.next());
                                    }
                                    if (!set.isEmpty()) {
                                        A004.A08();
                                        A004.A07();
                                    }
                                }
                                hashSet3.add(A004);
                            }
                            c0f33.A0C(userJid, hashSet3, true);
                            return;
                        }
                        return;
                    }
                    throw null;
                }
            }
        }
    }

    public void A03(UserJid userJid, C07D c07d, C07D c07d2, C07D c07d3) {
        if (!c07d3.A00.isEmpty() && this.A09.A04()) {
            Set A01 = A01(userJid);
            C01R c01r = this.A04;
            c01r.A00.execute(new RunnableEBaseShape0S0300000_I0_0(this, A01, c07d3, 18));
        }
        A04(userJid, c07d, c07d2, c07d3);
    }

    public void A04(UserJid userJid, C07D c07d, C07D c07d2, C07D c07d3) {
        boolean z = this.A02.A00.getBoolean("security_notifications", false);
        if (this.A08.A05.A04() && z) {
            c07d2.toString();
            c07d3.toString();
            C02L c02l = this.A00;
            if (c02l.A0A(userJid)) {
                Iterator it = ((AbstractCollection) this.A05.A0B()).iterator();
                while (it.hasNext()) {
                    AbstractC005302j abstractC005302j = (AbstractC005302j) it.next();
                    if (!c02l.A0A(abstractC005302j)) {
                        this.A06.A0j(this.A0A.A02(abstractC005302j, this.A01.A05(), userJid, c07d2.A00.size(), c07d3.A00.size()));
                    }
                }
            } else if (c07d.A00.isEmpty()) {
            } else {
                if (this.A05.A0F(userJid)) {
                    this.A06.A0j(this.A0A.A02(userJid, this.A01.A05(), userJid, c07d2.A00.size(), c07d3.A00.size()));
                }
                c02l.A05();
                UserJid userJid2 = c02l.A03;
                if (userJid2 != null) {
                    Set A01 = A01(userJid2);
                    Iterator it2 = ((AbstractCollection) A01(userJid)).iterator();
                    while (it2.hasNext()) {
                        AbstractC011205o abstractC011205o = (AbstractC011205o) it2.next();
                        if (((AbstractCollection) A01).contains(abstractC011205o)) {
                            Set set = this.A07.A01(abstractC011205o).A04().A00;
                            if (set.contains(userJid)) {
                                c02l.A05();
                                if (set.contains(c02l.A03) || C003101m.A0P(abstractC011205o)) {
                                    this.A06.A0j(this.A0A.A02(abstractC011205o, this.A01.A05(), userJid, c07d2.A00.size(), c07d3.A00.size()));
                                }
                            }
                        }
                    }
                    return;
                }
                throw null;
            }
        }
    }
}
