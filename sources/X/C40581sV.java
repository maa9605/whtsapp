package X;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1sV */
/* loaded from: classes2.dex */
public class C40581sV {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public final AbstractC000600i A04;
    public final C02L A05;
    public final C01B A06;
    public final AnonymousClass012 A07;
    public final C001200o A08;
    public final C003701t A09;
    public final AnonymousClass011 A0A;
    public final C0ES A0B;
    public final C41481tz A0C;
    public final C41461tx A0D;
    public final C26X A0E;
    public final C0EE A0F;
    public final C467628d A0G;
    public final C26W A0H;
    public final C42321vY A0I;
    public final C0EJ A0J;
    public final C462926f A0K;
    public final C03740Gw A0L;
    public final C463026g A0M;
    public final C0DV A0N;
    public final C451620q A0O;
    public final C466027m A0P;
    public final C466027m A0Q;
    public final C466127n A0R;
    public final C466127n A0S;
    public final C0KR A0T;
    public final C05U A0U;
    public final C462526a A0V;
    public final C0EZ A0W;
    public final C03070Ea A0X;
    public final C006602x A0Y;
    public final C42891wV A0Z;
    public static final C04P[] A0f = new C04P[0];
    public static final Set A0e = new HashSet(Arrays.asList("offer", "accept", "reject", "enc_rekey"));
    public final Map A0c = new ConcurrentHashMap();
    public final LinkedHashMap A0a = new LinkedHashMap();
    public final LinkedHashMap A0b = new LinkedHashMap();
    public final Map A0d = new HashMap();

    public C40581sV(AnonymousClass012 anonymousClass012, C003701t c003701t, AbstractC000600i abstractC000600i, C02L c02l, C03070Ea c03070Ea, C001200o c001200o, AnonymousClass011 anonymousClass011, C01B c01b, C006602x c006602x, C26W c26w, C26X c26x, C05U c05u, C0DV c0dv, C451620q c451620q, C42321vY c42321vY, C0ES c0es, C41481tz c41481tz, C0EE c0ee, C462526a c462526a, C0EJ c0ej, C0KR c0kr, C462726d c462726d, C0EZ c0ez, C462926f c462926f, C03740Gw c03740Gw, C463026g c463026g, C41461tx c41461tx, C467628d c467628d, C466027m c466027m, C466127n c466127n, C42891wV c42891wV, C466027m c466027m2, C466127n c466127n2) {
        this.A07 = anonymousClass012;
        this.A09 = c003701t;
        this.A04 = abstractC000600i;
        this.A05 = c02l;
        this.A0X = c03070Ea;
        this.A08 = c001200o;
        this.A0A = anonymousClass011;
        this.A06 = c01b;
        this.A0Y = c006602x;
        this.A0H = c26w;
        this.A0E = c26x;
        this.A0U = c05u;
        this.A0N = c0dv;
        this.A0O = c451620q;
        this.A0I = c42321vY;
        this.A0B = c0es;
        this.A0C = c41481tz;
        this.A0F = c0ee;
        this.A0V = c462526a;
        this.A0J = c0ej;
        this.A0T = c0kr;
        this.A0W = c0ez;
        this.A0K = c462926f;
        this.A0L = c03740Gw;
        this.A0M = c463026g;
        this.A0D = c41461tx;
        this.A0G = c467628d;
        this.A0Q = c466027m;
        this.A0S = c466127n;
        this.A0Z = c42891wV;
        if (c462726d != null) {
            this.A0P = c466027m2;
            this.A0R = c466127n2;
            return;
        }
        throw null;
    }

    public static final int A00(String str) {
        switch (str.hashCode()) {
            case -1073880421:
                if (str.equals("missed")) {
                    return 2;
                }
                break;
            case -934710369:
                if (str.equals("reject")) {
                    return 4;
                }
                break;
            case -665462704:
                if (str.equals("unavailable")) {
                    return 3;
                }
                break;
            case -579210487:
                if (str.equals("connected")) {
                    return 5;
                }
                break;
            case -123173735:
                if (str.equals("canceled")) {
                    return 1;
                }
                break;
        }
        return 0;
    }

    public static C02590Ca A01(C010805j c010805j, int i, String str, Integer num) {
        String str2;
        int i2 = c010805j.A01;
        int i3 = c010805j.A00;
        if (i3 == 0) {
            str2 = "msg";
        } else if (i3 == 1) {
            str2 = "pkmsg";
        } else if (i3 == 2) {
            str2 = "skmsg";
        } else if (i3 != 3) {
            throw new IllegalArgumentException(C000200d.A0D("Unsupported ciphertext type ", i3));
        } else {
            str2 = "frskmsg";
        }
        return new C02590Ca("enc", (C04P[]) ((AbstractCollection) A05(i2, str2, i, str, num)).toArray(A0f), null, c010805j.A02);
    }

    public static final C02590Ca A02(C03950Hv c03950Hv) {
        int i;
        int i2 = c03950Hv.A01;
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case GoogleMigrateImporterActivity.A0E /* 11 */:
            case 12:
            case 13:
            case 14:
                ArrayList arrayList = new ArrayList();
                Jid jid = c03950Hv.A06;
                if (jid == null) {
                    jid = C04260Jm.A00;
                }
                arrayList.add(new C04P("jid", jid));
                switch (i2) {
                    case 1:
                        C000200d.A1A("type", "clear", arrayList);
                        if (c03950Hv instanceof C48152Ea) {
                            String str = ((C48152Ea) c03950Hv).A00;
                            if (!TextUtils.isEmpty(str)) {
                                C000200d.A1A("kind", str, arrayList);
                                break;
                            }
                        }
                        break;
                    case 2:
                        C000200d.A1A("type", "delete", arrayList);
                        break;
                    case 3:
                        C000200d.A1A("type", "archive", arrayList);
                        break;
                    case 4:
                        C000200d.A1A("type", "unarchive", arrayList);
                        break;
                    case 5:
                        C000200d.A1A("type", "mute", arrayList);
                        long j = c03950Hv.A02;
                        if (j == -1) {
                            C000200d.A1A("mute", "-1", arrayList);
                            break;
                        } else {
                            arrayList.add(new C04P("mute", Long.toString(j / 1000), null, (byte) 0));
                            break;
                        }
                    case 6:
                        C000200d.A1A("type", "mute", arrayList);
                        break;
                    case 7:
                    default:
                        C000700j.A07(false);
                        break;
                    case 8:
                        C000200d.A1A("type", "unstar", arrayList);
                        break;
                    case 9:
                        arrayList.add(new C04P("type", "spam", null, (byte) 0));
                        C000200d.A1A("spam", "false", arrayList);
                        break;
                    case 10:
                        C000200d.A1A("type", "modify_tag", arrayList);
                        break;
                    case GoogleMigrateImporterActivity.A0E /* 11 */:
                        arrayList.add(new C04P("type", "pin", null, (byte) 0));
                        arrayList.add(new C04P("pin", String.valueOf(c03950Hv.A03 / 1000), null, (byte) 0));
                        break;
                    case 12:
                        C000200d.A1A("type", "pin", arrayList);
                        break;
                    case 13:
                        C000200d.A1A("type", "modify", arrayList);
                        UserJid userJid = c03950Hv.A07;
                        if (userJid != null) {
                            C000200d.A0y("new_jid", userJid, arrayList);
                        }
                        UserJid userJid2 = c03950Hv.A08;
                        if (userJid2 != null) {
                            C000200d.A0y("old_jid", userJid2, arrayList);
                            break;
                        }
                        break;
                    case 14:
                        C000200d.A1A("type", "ephemeral", arrayList);
                        break;
                }
                long j2 = c03950Hv.A05;
                if (j2 != 0) {
                    arrayList.add(new C04P("t", Long.toString(j2 / 1000), null, (byte) 0));
                }
                long j3 = c03950Hv.A02;
                if (j3 != 0 && c03950Hv.A01 == 1) {
                    arrayList.add(new C04P("before", Long.toString(j3 / 1000), null, (byte) 0));
                }
                int i3 = c03950Hv.A01;
                if ((i3 == 1 || i3 == 2 || i3 == 10 || i3 == 14) && (i = c03950Hv.A00) > 0 && i < 1000000) {
                    arrayList.add(new C04P("modify_tag", Integer.toString(i), null, (byte) 0));
                }
                if (c03950Hv.A0A) {
                    C000200d.A1A("star", "true", arrayList);
                }
                return new C02590Ca("chat", (C04P[]) arrayList.toArray(A0f), null, null);
            case 7:
            default:
                return null;
        }
    }

    public static final C02590Ca A03(String str, List list) {
        int size = list.size();
        C02590Ca[] c02590CaArr = new C02590Ca[size];
        for (int i = 0; i < size; i++) {
            c02590CaArr[i] = new C02590Ca("participant", new C04P[]{new C04P("jid", (Jid) list.get(i))}, null, null);
        }
        return new C02590Ca(str, null, c02590CaArr, null);
    }

    public static C02590Ca A04(byte[] bArr) {
        C40541sR A09 = C40531sQ.A09();
        C0CT AVX = C2G2.A02.AVX();
        C0AN A01 = C0AN.A01(bArr, 0, bArr.length);
        AVX.A02();
        C2G2 c2g2 = (C2G2) AVX.A00;
        c2g2.A00 |= 1;
        c2g2.A01 = A01;
        A09.A02();
        C40531sQ c40531sQ = (C40531sQ) A09.A00;
        if (c40531sQ != null) {
            c40531sQ.A05 = (C2G2) AVX.A01();
            c40531sQ.A00 |= 512;
            return new C02590Ca("call", null, null, A09.A01().A0B());
        }
        throw null;
    }

    public static List A05(int i, String str, int i2, String str2, Integer num) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C04P("v", Integer.toString(i), null, (byte) 0));
        arrayList.add(new C04P("type", str, null, (byte) 0));
        if (i2 != 0) {
            arrayList.add(new C04P("count", String.valueOf(i2), null, (byte) 0));
        }
        if (str2 != null) {
            arrayList.add(new C04P("mediatype", str2, null, (byte) 0));
        }
        if (num != null && num.intValue() > 0) {
            arrayList.add(new C04P("duration", String.valueOf(num), null, (byte) 0));
        }
        return arrayList;
    }

    public static List A06(Map map, Map map2, List list, Map map3, int i, String str, Integer num, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                DeviceJid deviceJid = (DeviceJid) entry.getKey();
                String str2 = (String) map.get(DeviceJid.of(deviceJid.userJid));
                if (str2 == null || str2.trim().length() == 0) {
                    StringBuilder A0P = C000200d.A0P("Connection/createParticipantsListWithEnc:empty ephemeral setting ephemeralSetting=");
                    A0P.append(str2 == null);
                    Log.w(A0P.toString());
                }
                C010805j c010805j = (C010805j) entry.getValue();
                String str3 = null;
                Integer num2 = null;
                if (z) {
                    str3 = str;
                    num2 = num;
                }
                arrayList.add(new C02590Ca("to", A0A(deviceJid, str2), A01(c010805j, i, str3, num2)));
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DeviceJid deviceJid2 = (DeviceJid) it.next();
                arrayList.add(new C02590Ca("to", A0A(deviceJid2, (String) map.get(DeviceJid.of(deviceJid2.userJid))), null, null));
            }
        }
        if (map3 != null) {
            for (Map.Entry entry2 : map3.entrySet()) {
                arrayList.add(new C02590Ca("to", A0A((DeviceJid) entry2.getKey(), null), A01((C010805j) entry2.getValue(), i, str, num)));
            }
        }
        return arrayList;
    }

    public static final void A07(C05190Nr c05190Nr, C02590Ca c02590Ca) {
        C010805j c010805j;
        String str;
        C010805j A0H = C40731sm.A0H(c02590Ca);
        if (A0H.A00 == 2) {
            c05190Nr.A08 = A0H;
        } else {
            c05190Nr.A07 = A0H;
        }
        int A05 = c02590Ca.A05("count", 0);
        if (c05190Nr.A0H != null && c05190Nr.A01() != A05) {
            throw new C0L4("retry count may not mismatch between two enc nodes in the same message");
        }
        c05190Nr.A0H = Integer.valueOf(A05);
        C04P A0A = c02590Ca.A0A("mediareason");
        if (A0A != null && (str = A0A.A03) != null) {
            if (str.equals("retry")) {
                Boolean bool = c05190Nr.A0C;
                if (bool != null && !bool.booleanValue()) {
                    throw new C0L4("mediareason retry may not mismatch between two enc nodes in the same message");
                }
                c05190Nr.A0C = Boolean.TRUE;
            } else {
                throw new C0L4(C000200d.A0H("unknown mediareason ", str));
            }
        }
        int A052 = c02590Ca.A05("duration", -1);
        if (A052 >= 0) {
            c05190Nr.A0D = Integer.valueOf(A052);
        }
        C010805j c010805j2 = c05190Nr.A08;
        if (c010805j2 != null && (c010805j = c05190Nr.A07) != null && c010805j2.A01 != c010805j.A01) {
            throw new C0L4("ciphertext version may not mismatch between two enc nodes in the same message");
        }
        C04P A0A2 = c02590Ca.A0A("decrypt-fail");
        if (!"hide".equals(A0A2 != null ? A0A2.A03 : null) && !"peer".equals(c05190Nr.A0N)) {
            c05190Nr.A00 = 0;
        } else {
            c05190Nr.A00 = 1;
        }
    }

    public static final boolean A08(Jid jid) {
        return (jid == null || !"broadcast".equals(jid.getServer()) || C003101m.A0Z(jid)) ? false : true;
    }

    public static final C04P[] A09(AbstractC005302j abstractC005302j, AbstractC005302j abstractC005302j2, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C04P("to", abstractC005302j));
        arrayList.add(new C04P("id", str, null, (byte) 0));
        arrayList.add(new C04P("type", str2, null, (byte) 0));
        if (abstractC005302j2 != null) {
            arrayList.add(new C04P("participant", abstractC005302j2));
        }
        return (C04P[]) arrayList.toArray(A0f);
    }

    public static C04P[] A0A(DeviceJid deviceJid, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C04P("jid", deviceJid));
        if (str != null) {
            arrayList.add(new C04P("eph_setting", str, null, (byte) 0));
        }
        return (C04P[]) arrayList.toArray(A0f);
    }

    public static final C04P[] A0B(String str, String str2, Jid jid, Jid jid2, UserJid userJid, String str3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C04P("to", jid));
        C000200d.A1A("id", str, arrayList);
        if (str2 != null) {
            C000200d.A1A("type", str2, arrayList);
        }
        if (jid2 != null) {
            arrayList.add(new C04P("participant", jid2));
        }
        if (userJid != null) {
            C000200d.A0y("recipient", userJid, arrayList);
        }
        if (str3 != null) {
            C000200d.A1A("category", str3, arrayList);
        }
        return (C04P[]) arrayList.toArray(A0f);
    }

    public static final C02590Ca[] A0C(String[] strArr) {
        if (strArr != null) {
            int length = strArr.length;
            C02590Ca[] c02590CaArr = new C02590Ca[length];
            for (int i = 0; i < length; i++) {
                c02590CaArr[i] = new C02590Ca("item", new C04P[]{new C04P("id", strArr[i], null, (byte) 0)}, null, null);
            }
            return new C02590Ca[]{new C02590Ca("list", null, c02590CaArr, null)};
        }
        return null;
    }

    public final C04420Kc A0D(C02590Ca c02590Ca, long j) {
        String str;
        String str2;
        AbstractC000600i abstractC000600i = this.A04;
        Jid A08 = c02590Ca.A08(Jid.class, "participant", abstractC000600i);
        HashMap hashMap = new HashMap();
        Jid A082 = c02590Ca.A08(Jid.class, "from", abstractC000600i);
        C04P A0A = c02590Ca.A0A("id");
        if (A0A != null) {
            str = A0A.A03;
        } else {
            str = null;
        }
        C04P A0A2 = c02590Ca.A0A("type");
        if (A0A2 != null) {
            str2 = A0A2.A03;
        } else {
            str2 = null;
        }
        return new C04420Kc(A082, "notification", str, str2, null, A08, null, null, j, hashMap.isEmpty() ? null : new ArrayList(hashMap.values()));
    }

    public void A0E() {
        this.A0R.A06(new C02590Ca("presence", new C04P[]{new C04P("type", "available", null, (byte) 0)}, null, null));
    }

    public final void A0F(long j, C02590Ca c02590Ca) {
        AbstractC05150Nn A02 = this.A0J.A02(j);
        if (A02 != null) {
            synchronized (A02) {
                int i = A02.A00;
                if (i == 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Processing is already done for ");
                    sb.append(A02.A0B);
                    String obj = sb.toString();
                    AbstractC000600i abstractC000600i = A02.A05;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(A02.A03());
                    sb2.append("/failed processing done check");
                    abstractC000600i.A09(sb2.toString(), obj, true);
                } else {
                    AnonymousClass012 anonymousClass012 = A02.A06;
                    A02.A01(i, anonymousClass012.A04() - A02.A01);
                    A02.A00 = 0;
                    A02.A01(0, anonymousClass012.A04() - A02.A04);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(A02.A03());
                    sb3.append("/onProcessingDone/stanzaId = ");
                    sb3.append(A02.A0B);
                    Log.i(sb3.toString());
                    C0EJ c0ej = A02.A08;
                    synchronized (c0ej) {
                        c0ej.A05(A02.A02).remove(Long.valueOf(A02.A03));
                    }
                }
            }
        }
        this.A0R.A06(c02590Ca);
    }

    public final void A0G(AbstractC005302j abstractC005302j, String str, AbstractC005302j abstractC005302j2, Integer num, String str2, String str3) {
        AbstractC005302j abstractC005302j3 = abstractC005302j2;
        AbstractC005302j abstractC005302j4 = abstractC005302j;
        if (A08(abstractC005302j2)) {
            abstractC005302j4 = abstractC005302j2;
            abstractC005302j3 = abstractC005302j;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C04P("type", str3, null, (byte) 0));
        if (num != null) {
            arrayList.add(new C04P("reason", String.valueOf(num), null, (byte) 0));
        }
        if (str2 != null) {
            arrayList.add(new C04P("sub-type", str2, null, (byte) 0));
        }
        this.A0R.A06(new C02590Ca("receipt", A0B(str, "error", abstractC005302j4, abstractC005302j3, null, null), new C02590Ca("error", (C04P[]) arrayList.toArray(A0f), null, null)));
    }

    public void A0H(C011005l c011005l, final String str, C04P[] c04pArr, final Runnable runnable, final C0I3 c0i3, C04500Kk c04500Kk) {
        String hexString;
        if (c04500Kk != null) {
            hexString = c04500Kk.A01;
        } else {
            int i = this.A00 + 1;
            this.A00 = i;
            hexString = Integer.toHexString(i);
        }
        this.A0c.put(hexString, new C0SF() { // from class: X.3lY
            @Override // X.C0SF
            public void A00(int i2) {
                C0I3 c0i32 = c0i3;
                if (c0i32 != null) {
                    c0i32.ARv(i2);
                }
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                Runnable runnable2;
                if (c02590Ca.A0D(str) == null || (runnable2 = runnable) == null) {
                    return;
                }
                runnable2.run();
            }
        });
        C02590Ca c02590Ca = new C02590Ca(str, c04pArr, null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C04P("id", hexString, null, (byte) 0));
        arrayList.add(new C04P("xmlns", "w:g2", null, (byte) 0));
        arrayList.add(new C04P("type", "set", null, (byte) 0));
        arrayList.add(new C04P("to", c011005l));
        if (c04500Kk != null) {
            arrayList.add(new C04P("web", c04500Kk.A00, null, (byte) 0));
        }
        this.A0R.A06(new C02590Ca("iq", (C04P[]) arrayList.toArray(A0f), c02590Ca));
    }

    public final void A0I(C011005l c011005l, List list, String str, String str2, C04500Kk c04500Kk) {
        int size = list.size();
        C02590Ca[] c02590CaArr = new C02590Ca[size];
        for (int i = 0; i < size; i++) {
            c02590CaArr[i] = new C02590Ca("participant", new C04P[]{new C04P("jid", (Jid) list.get(i))}, null, null);
        }
        C02590Ca c02590Ca = new C02590Ca(str2, null, c02590CaArr, null);
        C04P[] c04pArr = new C04P[c04500Kk == null ? 4 : 5];
        c04pArr[0] = new C04P("id", str, null, (byte) 0);
        c04pArr[1] = new C04P("xmlns", "w:g2", null, (byte) 0);
        c04pArr[2] = new C04P("type", "set", null, (byte) 0);
        c04pArr[3] = new C04P("to", c011005l);
        if (c04500Kk != null) {
            c04pArr[4] = new C04P("web", c04500Kk.A00, null, (byte) 0);
        }
        this.A0R.A06(new C02590Ca("iq", c04pArr, c02590Ca));
    }

    public final void A0J(UserJid userJid, C02590Ca c02590Ca) {
        String str;
        if (c02590Ca != null) {
            C02590Ca A0C = c02590Ca.A0C(0);
            if (A0C != null && "enc".equals(A0C.A00)) {
                C010805j A0H = C40731sm.A0H(A0C);
                C04P A0A = c02590Ca.A0A("elapsed");
                if (A0A != null) {
                    str = A0A.A03;
                } else {
                    str = null;
                }
                long parseInt = str != null ? Integer.parseInt(str) : 0L;
                C467628d c467628d = this.A0G;
                if (c467628d != null) {
                    C000200d.A0x("xmpp/reader/on-location-update jid: ", userJid);
                    InterfaceC467728e interfaceC467728e = c467628d.A00;
                    Message obtain = Message.obtain(null, 0, 117, 0, A0H);
                    Bundle data = obtain.getData();
                    data.putParcelable("jid", userJid);
                    data.putLong("elapsed", parseInt);
                    ((HandlerC467828f) interfaceC467728e).A00(obtain);
                    return;
                }
                throw null;
            }
            throw new C0L4("invalid location node");
        }
        throw new C0L4("Missing location node");
    }

    public final void A0K(AnonymousClass094 anonymousClass094, String str, AbstractC005302j abstractC005302j, DeviceJid deviceJid, UserJid userJid, String[] strArr, long j) {
        Pair A02 = C0Ho.A02(anonymousClass094.A00, abstractC005302j, deviceJid);
        A0F(j, new C02590Ca("receipt", A0B(anonymousClass094.A01, str, (Jid) A02.first, (Jid) A02.second, userJid, null), A0C(strArr), null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:2043:0x0627, code lost:
        if (r3.equals("FBPAY") == false) goto L1673;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2053:0x0675, code lost:
        if (r3.equals("NOVI") != false) goto L1660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2056:0x067f, code lost:
        if (r3.equals("UPI") == false) goto L1673;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1770:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:1773:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:1776:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:1782:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:2067:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:2068:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:2673:0x13ac A[Catch: 22W -> 0x2001, TryCatch #7 {22W -> 0x2001, blocks: (B:2207:0x0a73, B:2209:0x0a7c, B:2210:0x0a7e, B:2212:0x0a86, B:2214:0x0a8b, B:2216:0x0a8f, B:3253:0x2000, B:2217:0x0aa6, B:2219:0x0aac, B:2221:0x0ab8, B:2222:0x0ac7, B:2224:0x0ad3, B:2226:0x0adf, B:2673:0x13ac, B:2675:0x13b0, B:2677:0x13d4, B:2228:0x0aec, B:2230:0x0af2, B:2231:0x0af4, B:2233:0x0afc, B:2235:0x0b04, B:2237:0x0b0a, B:2238:0x0b0c, B:2241:0x0b15, B:2243:0x0b25, B:2245:0x0b2d, B:2247:0x0b35, B:2249:0x0b3b, B:2251:0x0b47, B:2253:0x0b59, B:2254:0x0b5b, B:2256:0x0b65, B:2257:0x0b67, B:2258:0x0b78, B:2261:0x0b80, B:2263:0x0b88, B:2264:0x0b8a, B:2266:0x0b92, B:2267:0x0b94, B:2270:0x0b9e, B:2272:0x0baa, B:2273:0x0bba, B:2275:0x0bc0, B:2277:0x0bf8, B:2278:0x0bfc, B:2280:0x0c04, B:2281:0x0c06, B:2283:0x0c0e, B:2284:0x0c10, B:2286:0x0c18, B:2287:0x0c1c, B:2289:0x0c24, B:2293:0x0c2c, B:2295:0x0c34, B:2296:0x0c36, B:2300:0x0c45, B:2301:0x0c47, B:2303:0x0c4f, B:2304:0x0c52, B:2306:0x0c60, B:2307:0x0c62, B:2309:0x0c6e, B:2310:0x0c70, B:2312:0x0c82, B:2313:0x0c84, B:2315:0x0c92, B:2316:0x0c94, B:2318:0x0ca1, B:2319:0x0ca3, B:2329:0x0cbd, B:2331:0x0cdc, B:2333:0x0d07, B:2339:0x0d1e, B:2332:0x0cec, B:2334:0x0d0c, B:2340:0x0d1f, B:2341:0x0d2c, B:2343:0x0d34, B:2344:0x0d42, B:2346:0x0d48, B:2348:0x0d66, B:2349:0x0d68, B:2351:0x0d70, B:2352:0x0d72, B:2354:0x0d7a, B:2355:0x0d7c, B:2357:0x0d84, B:2358:0x0d86, B:2364:0x0d9c, B:2366:0x0da6, B:2371:0x0db8, B:2372:0x0dc1, B:2378:0x0de1, B:2379:0x0dec, B:2381:0x0df4, B:2383:0x0dfc, B:2384:0x0dfe, B:2387:0x0e16, B:2389:0x0e1e, B:2391:0x0e32, B:2392:0x0e34, B:2394:0x0e3f, B:2396:0x0e47, B:2397:0x0e55, B:2399:0x0e5b, B:2401:0x0e69, B:2403:0x0e6d, B:2404:0x0e70, B:2405:0x0e73, B:2406:0x0e7e, B:2408:0x0e86, B:2409:0x0e94, B:2411:0x0e9a, B:2413:0x0ea8, B:2414:0x0eaa, B:2416:0x0eb8, B:2420:0x0ec0, B:2422:0x0ed3, B:2425:0x0edb, B:2426:0x0ee6, B:2428:0x0eee, B:2430:0x0f00, B:2431:0x0f02, B:2433:0x0f0d, B:2435:0x0f1b, B:2437:0x0f21, B:2438:0x0f23, B:2440:0x0f29, B:2441:0x0f2b, B:2443:0x0f33, B:2444:0x0f35, B:2446:0x0f42, B:2448:0x0f46, B:2449:0x0f4d, B:2472:0x0fbb, B:2450:0x0f52, B:2452:0x0f58, B:2454:0x0f5c, B:2455:0x0f63, B:2471:0x0fb7, B:2456:0x0f68, B:2458:0x0f6e, B:2460:0x0f76, B:2461:0x0f78, B:2463:0x0f82, B:2464:0x0f84, B:2466:0x0f91, B:2467:0x0f93, B:2477:0x0fcc, B:2478:0x0fd3, B:2480:0x0fdb, B:2481:0x0ff0, B:2483:0x0ff8, B:2485:0x1000, B:2486:0x1002, B:2488:0x100d, B:2490:0x1015, B:2491:0x101e, B:2493:0x1028, B:2495:0x1032, B:2496:0x1036, B:2498:0x1044, B:2499:0x1047, B:2501:0x1053, B:2502:0x1055, B:2505:0x1072, B:2507:0x107a, B:2509:0x108a, B:2512:0x1090, B:2514:0x1096, B:2516:0x10a0, B:2517:0x10a4, B:2518:0x10ba, B:2519:0x10c1, B:2521:0x10cb, B:2523:0x10d1, B:2524:0x10d3, B:2526:0x10d9, B:2531:0x10e3, B:2532:0x10ee, B:2533:0x10f5, B:2535:0x10fd, B:2537:0x1103, B:2539:0x1107, B:2540:0x1112, B:2541:0x1119, B:2543:0x1121, B:2545:0x1127, B:2546:0x1129, B:2551:0x1138, B:2552:0x1145, B:2554:0x114b, B:2556:0x1159, B:2557:0x115b, B:2559:0x116c, B:2560:0x1175, B:2562:0x117b, B:2564:0x1181, B:2565:0x1183, B:2567:0x118b, B:2569:0x1193, B:2570:0x1195, B:2577:0x11aa, B:2579:0x11b4, B:2583:0x11c6, B:2584:0x11d1, B:2585:0x11ea, B:2587:0x11f2, B:2591:0x1204, B:2592:0x120f, B:2593:0x1228, B:2595:0x1230, B:2597:0x1238, B:2598:0x123a, B:2600:0x1240, B:2602:0x1249, B:2603:0x1254, B:2605:0x125c, B:2607:0x1262, B:2608:0x1264, B:2610:0x126a, B:2612:0x1273, B:2613:0x127e, B:2615:0x1286, B:2617:0x1292, B:2618:0x1299, B:2619:0x12a4, B:2621:0x12ac, B:2622:0x12b7, B:2624:0x12bf, B:2626:0x12c5, B:2627:0x12c7, B:2629:0x12ce, B:2631:0x12d6, B:2632:0x12d8, B:2636:0x12e2, B:2638:0x12eb, B:2639:0x12f2, B:2640:0x12fd, B:2642:0x130b, B:2644:0x1313, B:2645:0x131e, B:2647:0x1326, B:2641:0x1304, B:2648:0x1330, B:2650:0x134e, B:2651:0x1350, B:2653:0x1358, B:2654:0x135a, B:2656:0x1364, B:2657:0x1366, B:2659:0x1374, B:2660:0x1376, B:2662:0x1382, B:2663:0x1384, B:2679:0x13d9, B:2681:0x13df, B:2683:0x13fb, B:2685:0x1401, B:2686:0x141b, B:2688:0x1423, B:2691:0x142b, B:2692:0x1431, B:2694:0x143f, B:2696:0x1466, B:2698:0x1486, B:2700:0x148b, B:2701:0x148c, B:2703:0x1496, B:2705:0x14aa, B:2707:0x14c0, B:2709:0x14c4, B:2711:0x14cc, B:2712:0x14ce, B:2714:0x14d6, B:2715:0x14dd, B:2716:0x14de, B:2720:0x14ef, B:2721:0x14f6, B:2718:0x14e4, B:2719:0x14ee, B:2722:0x14f7, B:2724:0x1509, B:2726:0x150d, B:2728:0x1515, B:2729:0x151c, B:2731:0x1521, B:2732:0x1539, B:2734:0x1541, B:2736:0x1550, B:2737:0x1551, B:2738:0x1552, B:2740:0x155a, B:2742:0x156a, B:2744:0x1578, B:2745:0x1579, B:2747:0x1581, B:2749:0x15ca, B:2750:0x15d3, B:2752:0x15d9, B:2754:0x15fa, B:2756:0x160d, B:2758:0x162d, B:2759:0x162e, B:2761:0x1636, B:2763:0x163c, B:2764:0x1656, B:2766:0x165e, B:2768:0x166b, B:2769:0x166d, B:2771:0x1683, B:2772:0x1685, B:2774:0x169b, B:2775:0x169d, B:2776:0x16b0, B:2778:0x16b6, B:2782:0x16d2, B:2784:0x16da, B:2786:0x16e2, B:2787:0x16e4, B:2788:0x16f0, B:2790:0x16f8, B:2792:0x1700, B:2793:0x1702, B:2794:0x170e, B:2796:0x1716, B:2798:0x171e, B:2799:0x1720, B:2800:0x172c, B:2802:0x1734, B:2803:0x1741, B:2805:0x1749, B:2807:0x1751, B:2808:0x1753, B:2810:0x175d, B:2811:0x175f, B:2813:0x1767, B:2814:0x1769, B:2816:0x1771, B:2817:0x1773, B:2819:0x177b, B:2821:0x177f, B:2822:0x1789, B:2823:0x1791, B:2825:0x1799, B:2827:0x179d, B:2829:0x17a5, B:2831:0x17af, B:2833:0x17b3, B:2846:0x17fe, B:2847:0x17ff, B:2848:0x1800, B:2834:0x17c0, B:2844:0x17da, B:2849:0x1801, B:2851:0x180f, B:2853:0x181f, B:2854:0x1821, B:2856:0x1827, B:2857:0x1829, B:2859:0x1835, B:2860:0x1837, B:2862:0x183e, B:2863:0x1843, B:2865:0x1847, B:2871:0x186e, B:2872:0x186f, B:2874:0x1877, B:2876:0x1884, B:2877:0x1886, B:2879:0x189c, B:2880:0x189e, B:2882:0x18a6, B:2888:0x18bb, B:2890:0x18c9, B:2892:0x18d1, B:2894:0x18d7, B:2896:0x18df, B:2898:0x18ec, B:2899:0x18ee, B:2901:0x18fb, B:2903:0x1903, B:2905:0x190b, B:2907:0x1915, B:2908:0x1917, B:2911:0x1920, B:2913:0x1928, B:2915:0x1930, B:2917:0x1938, B:2919:0x1942, B:2920:0x1944, B:2922:0x194a, B:2924:0x1950, B:2926:0x195a, B:2928:0x1960, B:2930:0x1981, B:2932:0x1991, B:2933:0x1993, B:2935:0x199b, B:2936:0x19bb, B:2937:0x19bc, B:2939:0x19c4, B:2941:0x19cc, B:2942:0x19ce, B:2944:0x19de, B:2945:0x19e0, B:2947:0x19ea, B:2951:0x1a0f, B:2952:0x1a10, B:2954:0x1a1c, B:2956:0x1a24, B:2957:0x1a26, B:2959:0x1a3c, B:2960:0x1a3e, B:2962:0x1a44, B:2963:0x1a46, B:2965:0x1a4c, B:2966:0x1a51, B:2974:0x1a68, B:2976:0x1a72, B:2977:0x1a75, B:2979:0x1a81, B:2980:0x1a83, B:2982:0x1a8d, B:2983:0x1a8f, B:2988:0x1a9f, B:2990:0x1aa7, B:2991:0x1aa9, B:2997:0x1abd, B:2993:0x1ab0, B:2995:0x1ab6, B:2996:0x1ab8, B:3000:0x1add, B:3002:0x1ae5, B:3025:0x1b47, B:3028:0x1b4f, B:3030:0x1b5c, B:3033:0x1b66, B:3035:0x1b73, B:3038:0x1b7d, B:3040:0x1b89, B:3043:0x1b93, B:3045:0x1b9f, B:3048:0x1ba7, B:3050:0x1bad, B:3051:0x1baf, B:3053:0x1bb7, B:3058:0x1bc1, B:3060:0x1bcb, B:3063:0x1bd0, B:3065:0x1bdf, B:3067:0x1be9, B:3071:0x1bf0, B:3073:0x1bff, B:3076:0x1c07, B:3078:0x1c0d, B:3079:0x1c0f, B:3081:0x1c15, B:3084:0x1c25, B:3087:0x1c2f, B:3089:0x1c35, B:3090:0x1c37, B:3092:0x1c3f, B:3093:0x1c41, B:3099:0x1c50, B:3101:0x1c5b, B:3103:0x1c63, B:3105:0x1c6b, B:3107:0x1c73, B:3109:0x1c7b, B:3112:0x1c85, B:3005:0x1aed, B:3007:0x1af7, B:3008:0x1afa, B:3010:0x1b06, B:3011:0x1b08, B:3013:0x1b12, B:3014:0x1b14, B:3023:0x1b2b, B:3114:0x1c92, B:3116:0x1c9e, B:3118:0x1ca6, B:3119:0x1ca8, B:3121:0x1cb2, B:3123:0x1cbe, B:3126:0x1ce8, B:3128:0x1cee, B:3130:0x1cfa, B:3132:0x1d1c, B:3134:0x1d26, B:3136:0x1d2c, B:3137:0x1d2e, B:3139:0x1d34, B:3142:0x1d59, B:3144:0x1d61, B:3146:0x1d69, B:3147:0x1d6b, B:3152:0x1d7c, B:3154:0x1d9d, B:3156:0x1da5, B:3158:0x1dad, B:3159:0x1daf, B:3160:0x1dbc, B:3162:0x1dc2, B:3164:0x1dd2, B:3166:0x1dd8, B:3168:0x1dfa, B:3170:0x1e02, B:3172:0x1e0a, B:3173:0x1e0c, B:3175:0x1e1e, B:3178:0x1e47, B:3180:0x1e4f, B:3182:0x1e75, B:3184:0x1e7f, B:3186:0x1e87, B:3187:0x1e89, B:3189:0x1e96, B:3191:0x1ea2, B:3194:0x1eab, B:3196:0x1eb7, B:3198:0x1ec2, B:3200:0x1ec8, B:3202:0x1ed0, B:3204:0x1ee0, B:3206:0x1eed, B:3208:0x1ef3, B:3210:0x1ef7, B:3213:0x1f13, B:3215:0x1f1d, B:3217:0x1f25, B:3219:0x1f2d, B:3221:0x1f33, B:3222:0x1f35, B:3224:0x1f3b, B:3225:0x1f3d, B:3240:0x1fab, B:3228:0x1f66, B:3230:0x1f6e, B:3232:0x1f7e, B:3234:0x1f8e, B:3235:0x1f90, B:3237:0x1f96, B:3239:0x1fa6, B:3241:0x1faf, B:3243:0x1fc5, B:3245:0x1fcd, B:3247:0x1fd5, B:3248:0x1fd7), top: B:3423:0x0a73, inners: #3, #5, #6 }] */
    /* JADX WARN: Type inference failed for: r10v24, types: [X.2h1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0L(X.C02590Ca r55) {
        /*
            Method dump skipped, instructions count: 9338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40581sV.A0L(X.0Ca):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0032, code lost:
        if (r5.equals("sender") != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x005a, code lost:
        if (r5.equals("delivery") != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x005c, code lost:
        r3 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0066, code lost:
        if ("sender".equals(r5) != false) goto L113;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x006f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0085 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x02b3  */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.whatsapp.jid.Jid, X.02j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0M(X.C02590Ca r29, java.lang.String r30, X.C04420Kc r31, boolean r32, X.C07870aE r33) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40581sV.A0M(X.0Ca, java.lang.String, X.0Kc, boolean, X.0aE):void");
    }

    public void A0N(C04420Kc c04420Kc) {
        A0O(c04420Kc, c04420Kc.A01());
    }

    public final void A0O(C04420Kc c04420Kc, C02590Ca c02590Ca) {
        Jid jid = c04420Kc.A01;
        String str = c04420Kc.A05;
        String str2 = ("receipt".equals(str) && "delivery".equals(c04420Kc.A08)) ? null : c04420Kc.A08;
        ArrayList arrayList = new ArrayList();
        String str3 = c04420Kc.A07;
        if (str3 != null) {
            C000200d.A1A("id", str3, arrayList);
        } else {
            C000700j.A08(false, "received stanza with null id");
        }
        if (jid != null) {
            arrayList.add(new C04P("to", jid));
        } else {
            C000700j.A08(false, "received stanza with null to");
        }
        if (str != null) {
            C000200d.A1A("class", str, arrayList);
        } else {
            C000700j.A08(false, "received stanza with null class");
        }
        if (str2 != null) {
            C000200d.A1A("type", str2, arrayList);
        }
        String str4 = c04420Kc.A04;
        if (str4 != null) {
            C000200d.A1A("category", str4, arrayList);
        }
        Jid jid2 = c04420Kc.A02;
        if (jid2 != null) {
            arrayList.add(new C04P("participant", jid2));
        }
        UserJid userJid = c04420Kc.A03;
        if (userJid != null) {
            C000200d.A0y("recipient", userJid, arrayList);
        }
        String str5 = c04420Kc.A06;
        if (!TextUtils.isEmpty(str5) && !"0".equals(str5)) {
            arrayList.add(new C04P("edit", str5, null, (byte) 0));
        }
        List list = c04420Kc.A09;
        if (list != null) {
            arrayList.addAll(list);
        }
        C04P[] c04pArr = (C04P[]) arrayList.toArray(new C04P[0]);
        C02590Ca[] c02590CaArr = null;
        if (c02590Ca != null) {
            c02590CaArr = new C02590Ca[]{c02590Ca};
        }
        A0F(c04420Kc.A00, new C02590Ca("ack", c04pArr, c02590CaArr, null));
    }

    public final void A0P(Integer num, Integer num2, String str, String str2, Integer num3, String str3, String str4, Integer num4) {
        if (num != null) {
            if (num.intValue() == 11) {
                AbstractC000600i abstractC000600i = this.A04;
                if (str2 != null) {
                    str = C000200d.A0I(str, "-", str2);
                }
                abstractC000600i.A09("offline-count-11", str, false);
            }
            if (num.intValue() > 10) {
                C37301mC c37301mC = new C37301mC();
                c37301mC.A03 = Long.valueOf(num.longValue());
                c37301mC.A02 = num2;
                c37301mC.A00 = num3;
                c37301mC.A04 = str3;
                c37301mC.A05 = str4;
                c37301mC.A01 = num4;
                this.A0A.A0B(c37301mC, null, false);
            }
        }
    }

    public final void A0Q(String str, DeviceJid deviceJid, DeviceJid deviceJid2, String str2, String str3, long j) {
        A0F(j, new C02590Ca("receipt", new C04P[]{new C04P("to", deviceJid), new C04P("id", str, null, (byte) 0)}, new C02590Ca[]{new C02590Ca(str3, new C04P[]{new C04P("call-id", str2, null, (byte) 0), new C04P("call-creator", deviceJid2)}, null, null)}, null));
    }

    public void A0R(String str, AnonymousClass094 anonymousClass094, UserJid userJid, String str2, final C0I3 c0i3, final C0I4 c0i4) {
        if (str == null) {
            int i = this.A00 + 1;
            this.A00 = i;
            str = Integer.toHexString(i);
        }
        this.A0c.put(str, new C0SF() { // from class: X.3lZ
            @Override // X.C0SF
            public void A00(int i2) {
                C0I3 c0i32 = c0i3;
                if (c0i32 != null) {
                    c0i32.ARv(i2);
                }
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
            }

            @Override // X.C0SF
            public void A04(Exception exc) {
                C0I4 c0i42 = c0i4;
                if (c0i42 != null) {
                    c0i42.ARz(exc);
                }
            }
        });
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C04P("kind", "status", null, (byte) 0));
        AbstractC005302j abstractC005302j = anonymousClass094.A00;
        if (abstractC005302j != null) {
            arrayList.add(new C04P("jid", abstractC005302j));
            arrayList.add(new C04P("index", anonymousClass094.A01, null, (byte) 0));
            arrayList.add(new C04P("owner", String.valueOf(anonymousClass094.A02), null, (byte) 0));
            arrayList.add(new C04P("chat", userJid));
            arrayList.add(new C04P("checksum", str2, null, (byte) 0));
            A0T(str, "d", new C02590Ca("read", (C04P[]) arrayList.toArray(A0f), null, null));
            return;
        }
        throw null;
    }

    public final void A0S(String str, String str2, Jid jid, Integer num, List list, List list2, final C0I3 c0i3, final C0I4 c0i4) {
        C02590Ca[] c02590CaArr;
        int intValue;
        if (str2 == null) {
            int i = this.A00 + 1;
            this.A00 = i;
            str2 = Integer.toHexString(i);
        }
        this.A0c.put(str2, new C0SF() { // from class: X.3la
            @Override // X.C0SF
            public void A00(int i2) {
                C0I3 c0i32 = c0i3;
                if (c0i32 != null) {
                    c0i32.ARv(i2);
                }
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
            }

            @Override // X.C0SF
            public void A04(Exception exc) {
                C0I4 c0i42 = c0i4;
                if (c0i42 != null) {
                    c0i42.ARz(exc);
                }
            }
        });
        if (list != null) {
            int size = list.size();
            c02590CaArr = new C02590Ca[size];
            for (int i2 = 0; i2 < size; i2++) {
                AnonymousClass094 anonymousClass094 = (AnonymousClass094) list.get(i2);
                C04P[] c04pArr = new C04P[2];
                c04pArr[0] = new C04P("index", anonymousClass094.A01, null, (byte) 0);
                c04pArr[1] = new C04P("owner", anonymousClass094.A02 ? "true" : "false", null, (byte) 0);
                c02590CaArr[i2] = new C02590Ca("item", c04pArr, null, null);
            }
        } else {
            c02590CaArr = null;
        }
        if (list2 != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(C26W.A00((C20v) it.next()));
            }
            c02590CaArr = (C02590Ca[]) arrayList.toArray(new C02590Ca[0]);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C04P("type", str, null, (byte) 0));
        arrayList2.add(new C04P("jid", jid));
        if (num != null && (intValue = num.intValue()) > 0 && intValue < 1000000) {
            arrayList2.add(new C04P("modify_tag", num.toString(), null, (byte) 0));
        }
        A0T(str2, "clear".equals(str) ? "f" : "m", new C02590Ca("action", (C04P[]) null, new C02590Ca("chat", (C04P[]) arrayList2.toArray(A0f), c02590CaArr, null)));
    }

    public final void A0T(String str, String str2, C02590Ca c02590Ca) {
        A0V(str, str2, this.A0S.A0B(c02590Ca));
    }

    public void A0U(String str, String str2, boolean z, AbstractC005302j abstractC005302j, AbstractC005302j abstractC005302j2) {
        C0KA A09 = C452821e.A09();
        C452521b A092 = C452421a.A09();
        A092.A06(abstractC005302j.getRawString());
        A092.A07(z);
        A092.A02();
        C452421a.A0A((C452421a) A092.A00, str);
        A09.A02();
        C452821e.A0B((C452821e) A09.A00, (C452421a) A092.A01());
        if (abstractC005302j2 != null) {
            String rawString = abstractC005302j2.getRawString();
            A09.A02();
            C452821e c452821e = (C452821e) A09.A00;
            if (rawString != null) {
                c452821e.A01 |= 16;
                c452821e.A0J = rawString;
            } else {
                throw null;
            }
        }
        C03890Hn c03890Hn = new C03890Hn(new AnonymousClass094(abstractC005302j, z, str), str2);
        C40541sR A093 = C40531sQ.A09();
        AnonymousClass029.A1G(c03890Hn, new C40551sS(this.A05, A093, true, false, null, null));
        C40531sQ c40531sQ = (C40531sQ) A093.A01();
        A09.A02();
        C452821e c452821e2 = (C452821e) A09.A00;
        if (c40531sQ != null) {
            c452821e2.A0D = c40531sQ;
            c452821e2.A01 |= 2;
            A0V(str, "v", this.A0S.A0B(new C02590Ca("action", new C04P[]{new C04P("add", "relay", null, (byte) 0)}, new C02590Ca("message", null, null, A09.A01().A0B()))));
            return;
        }
        throw null;
    }

    public final void A0V(String str, String str2, byte[] bArr) {
        C42891wV c42891wV = this.A0Z;
        C42851wQ c42851wQ = c42891wV.A00;
        byte[] bArr2 = c42851wQ.A05;
        byte[] bArr3 = c42851wQ.A06;
        if (bArr2 != null && bArr3 != null && bArr != null) {
            try {
                byte[] bArr4 = new byte[16];
                c42891wV.A01.nextBytes(bArr4);
                byte[] A02 = C42891wV.A02(bArr2, bArr4, bArr);
                if (A02 == null) {
                    Log.e("qr encrypt aes fail");
                    return;
                }
                byte[] A00 = C42891wV.A00(bArr4, A02);
                byte[] A01 = C42891wV.A01(bArr3, A00);
                if (A01 == null) {
                    Log.e("qr encrypt mac fail");
                    return;
                }
                byte[] A002 = C42891wV.A00(A01, A00);
                if (A002 != null) {
                    C02590Ca c02590Ca = new C02590Ca("iq", new C04P[]{new C04P("type", "set", null, (byte) 0), new C04P("xmlns", "w:web", null, (byte) 0), new C04P("id", str, null, (byte) 0)}, new C02590Ca("enc", str2 != null ? new C04P[]{new C04P("type", str2, null, (byte) 0)} : null, null, A002));
                    C000200d.A14("connection/sendWebEncrypted id=", str);
                    this.A0R.A06(c02590Ca);
                }
            } catch (Exception e) {
                Log.e("qr encrypt fail ", e);
            }
        }
    }

    public void A0W(boolean z) {
        SharedPreferences sharedPreferences;
        String string;
        String str;
        int i = this.A00 + 1;
        this.A00 = i;
        String hexString = Integer.toHexString(i);
        this.A0c.put(hexString, new C0SF() { // from class: X.3lX
            {
                C40581sV.this = this;
            }

            @Override // X.C0SF
            public void A00(int i2) {
                SharedPreferences sharedPreferences2;
                int i3;
                C40581sV c40581sV = C40581sV.this;
                C003701t c003701t = c40581sV.A09;
                c003701t.A09(i2);
                if (i2 == 207 || i2 == 304 || (i2 >= 400 && i2 <= 503)) {
                    synchronized (c003701t) {
                        sharedPreferences2 = c003701t.A0N;
                        i3 = sharedPreferences2.getInt("ab_props:sys:fetch_attemp_count", 0);
                    }
                    int i4 = i3 + 1;
                    c003701t.A08(i4);
                    if (i4 >= 3) {
                        long A05 = c40581sV.A07.A05();
                        synchronized (c003701t) {
                            SharedPreferences.Editor edit = sharedPreferences2.edit();
                            edit.putLong("ab_props:sys:last_refresh_time", A05);
                            edit.apply();
                        }
                        c003701t.A08(0);
                        return;
                    }
                    return;
                }
                C000200d.A0p("Connection/sendGetABPropertiesFromServer/Got unknown error response: ", i2);
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                C02590Ca A0D = c02590Ca.A0D("props");
                if (A0D != null) {
                    C467628d c467628d = C40581sV.this.A0G;
                    if (c467628d != null) {
                        Log.i("xmpp/reader/read/ab-props");
                        ((HandlerC467828f) c467628d.A00).A00(Message.obtain(null, 0, 208, 0, A0D));
                        return;
                    }
                    throw null;
                }
            }
        });
        C003701t c003701t = this.A09;
        synchronized (c003701t) {
            sharedPreferences = c003701t.A0N;
            string = sharedPreferences.getString("ab_props:sys:config_hash", null);
        }
        if (string != null && !z) {
            synchronized (c003701t) {
                str = sharedPreferences.getString("ab_props:sys:config_hash", null);
            }
        } else {
            str = "";
        }
        this.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("to", C04260Jm.A00), new C04P("type", "get", null, (byte) 0), new C04P("id", hexString, null, (byte) 0), new C04P("xmlns", "abt", null, (byte) 0)}, new C02590Ca("props", new C04P[]{new C04P("protocol", 1), new C04P("hash", str, null, (byte) 0)}, null, null)));
    }

    public void A0X(boolean z) {
        int i = this.A00 + 1;
        this.A00 = i;
        String hexString = Integer.toHexString(i);
        this.A0c.put(hexString, new C0SF() { // from class: X.3lW
            {
                C40581sV.this = this;
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                C02590Ca A0D = c02590Ca.A0D("props");
                if (A0D != null) {
                    C467628d c467628d = C40581sV.this.A0G;
                    if (c467628d != null) {
                        Log.i("xmpp/reader/read/server-props");
                        ((HandlerC467828f) c467628d.A00).A00(Message.obtain(null, 0, 174, 0, A0D));
                        return;
                    }
                    throw null;
                }
            }
        });
        this.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("id", hexString, null, (byte) 0), new C04P("xmlns", "w", null, (byte) 0), new C04P("type", "get", null, (byte) 0), new C04P("to", C04260Jm.A00)}, new C02590Ca("props", new C04P[]{new C04P("protocol", "2", null, (byte) 0), new C04P("hash", (C01C.A0H == null || z) ? "" : "", null, (byte) 0)}, null, null)));
    }
}
