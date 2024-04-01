package X;

import android.os.Bundle;
import android.os.Message;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jobqueue.job.SendMediaErrorReceiptJob;
import com.whatsapp.jobqueue.job.SendPlayedReceiptJobV2;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;

/* renamed from: X.0EG */
/* loaded from: classes.dex */
public class C0EG {
    public static volatile C0EG A0C;
    public final AbstractC000600i A00;
    public final C0E6 A01;
    public final C010005b A02;
    public final C0G2 A03;
    public final C0G4 A04;
    public final C001200o A05;
    public final C03300Fd A06;
    public final C05Y A07;
    public final C0G1 A08;
    public final C0EF A09;
    public final C0EJ A0A;
    public final C03510Fz A0B;

    public C0EG(C001200o c001200o, AbstractC000600i abstractC000600i, C0E6 c0e6, C05Y c05y, C03300Fd c03300Fd, C03510Fz c03510Fz, C0EF c0ef, C010005b c010005b, C0G1 c0g1, C0EJ c0ej, C0G2 c0g2, C0G4 c0g4) {
        this.A05 = c001200o;
        this.A00 = abstractC000600i;
        this.A01 = c0e6;
        this.A07 = c05y;
        this.A06 = c03300Fd;
        this.A0B = c03510Fz;
        this.A09 = c0ef;
        this.A02 = c010005b;
        this.A08 = c0g1;
        this.A0A = c0ej;
        this.A03 = c0g2;
        this.A04 = c0g4;
    }

    public static C0EG A00() {
        if (A0C == null) {
            synchronized (C0EG.class) {
                if (A0C == null) {
                    A0C = new C0EG(C001200o.A01, AbstractC000600i.A00(), C0E6.A00(), C05Y.A01(), C03300Fd.A00(), C03510Fz.A03, C0EF.A00(), C010005b.A07, C0G1.A00(), C0EJ.A00(), C0G2.A00(), C0G4.A00());
                }
            }
        }
        return A0C;
    }

    public Future A01(C011005l c011005l, List list, InterfaceC05940Qx interfaceC05940Qx, C04500Kk c04500Kk) {
        C010005b c010005b = this.A02;
        if (c010005b.A06 && c010005b.A02) {
            String A02 = c04500Kk == null ? this.A07.A02() : c04500Kk.A01;
            try {
                return this.A07.A05(A02, Message.obtain(null, 0, 210, 0, new C07470Yi(A02, c011005l, list, interfaceC05940Qx, c04500Kk)), false);
            } catch (C0S4 unused) {
                return null;
            }
        }
        return null;
    }

    public Future A02(C07700Zi c07700Zi, C0T9 c0t9, C0I3 c0i3, C04500Kk c04500Kk) {
        C010005b c010005b = this.A02;
        if (c010005b.A06 && c010005b.A02) {
            String A02 = c04500Kk == null ? this.A07.A02() : c04500Kk.A01;
            try {
                return this.A07.A05(A02, Message.obtain(null, 0, 209, 0, new C07480Yj(A02, c07700Zi, c0t9, c0i3, c04500Kk)), false);
            } catch (C0S4 unused) {
                return null;
            }
        }
        return null;
    }

    public void A03() {
        if (this.A02.A06) {
            Log.i("sendmethods/sendGetABProps");
            this.A07.A09(Message.obtain(null, 0, 220, 1));
        }
    }

    public void A04() {
        if (this.A02.A06) {
            Log.i("sendmethods/sendGetBroadcastLists");
            this.A07.A09(Message.obtain(null, 0, 59, 0));
        }
    }

    public void A05() {
        if (this.A02.A06) {
            this.A07.A09(Message.obtain(null, 0, 13, 0));
        }
    }

    public void A06(C0TC c0tc) {
        if (this.A02.A06) {
            Log.i("sendmethods/sendAddParticipants");
            this.A07.A09(Message.obtain(null, 0, 15, 0, c0tc));
        }
    }

    public void A07(C0TD c0td) {
        if (this.A02.A06) {
            Log.i("sendmethods/sendAddAdmins");
            this.A07.A09(Message.obtain(null, 0, 91, 0, c0td));
        }
    }

    public void A08(C0TD c0td) {
        if (this.A02.A06) {
            Log.i("sendmethods/sendLeaveGroup");
            this.A06.A01(5, c0td.A01);
            this.A07.A09(Message.obtain(null, 0, 16, 0, c0td));
        }
    }

    public void A09(C0TD c0td) {
        if (this.A02.A06) {
            Log.i("sendmethods/sendRemoveAdmins");
            this.A07.A09(Message.obtain(null, 0, 92, 0, c0td));
        }
    }

    public void A0A(C0TD c0td) {
        if (this.A02.A06) {
            Log.i("sendmethods/sendRemoveParticipants");
            this.A07.A09(Message.obtain(null, 0, 30, 0, c0td));
        }
    }

    public void A0B(C0TD c0td) {
        if (this.A02.A06) {
            Log.i("sendmethods/sendSetGroupSubject");
            this.A07.A09(Message.obtain(null, 0, 17, 0, c0td));
        }
    }

    public void A0C(AbstractC005302j abstractC005302j, String str, AbstractC005302j abstractC005302j2, Integer num, String str2, String str3) {
        if (this.A02.A06) {
            C05Y c05y = this.A07;
            Message obtain = Message.obtain(null, 0, 117, 0, abstractC005302j);
            obtain.getData().putString("messageKeyId", str);
            if (abstractC005302j2 != null) {
                obtain.getData().putParcelable("remoteResource", abstractC005302j2);
            }
            if (num != null) {
                obtain.getData().putInt("errorCode", num.intValue());
            }
            if (str2 != null) {
                obtain.getData().putString("subType", str2);
            }
            if (str3 != null) {
                obtain.getData().putString("buttonIndex", str3);
            }
            c05y.A09(obtain);
        }
    }

    public void A0D(C011005l c011005l) {
        Log.i("sendmethods/sendGetGroupDescription");
        if (this.A02.A06) {
            C05Y c05y = this.A07;
            Message obtain = Message.obtain(null, 0, 158, 0);
            obtain.getData().putParcelable("gid", c011005l);
            c05y.A09(obtain);
        }
    }

    public void A0E(C011005l c011005l, int i, C0TD c0td) {
        if (this.A02.A06) {
            Log.i("sendmethods/sendSetGroupEphemeralSetting");
            C05Y c05y = this.A07;
            Message obtain = Message.obtain(null, 0, 224, 0, c0td);
            obtain.getData().putParcelable("gjid", c011005l);
            obtain.getData().putInt("ephemeralDuration", i);
            c05y.A09(obtain);
        }
    }

    public void A0F(C011005l c011005l, String str) {
        if (this.A02.A06) {
            if (!this.A0B.A00.A02(c011005l)) {
                Log.w("sendmethods/skip sendGetGroupInfo");
                return;
            }
            Log.w("sendmethods/sendGetGroupInfo");
            C05Y c05y = this.A07;
            Message obtain = Message.obtain(null, 0, 20, 0);
            obtain.getData().putParcelable("gid", c011005l);
            obtain.getData().putString("context", str);
            c05y.A09(obtain);
        }
    }

    public void A0G(C011005l c011005l, boolean z, C0TD c0td) {
        if (this.A02.A06) {
            Log.i("sendmethods/sendSetGroupAnnouncements");
            C05Y c05y = this.A07;
            Message obtain = Message.obtain(null, 0, 161, 0, c0td);
            obtain.getData().putParcelable("gjid", c011005l);
            obtain.getData().putBoolean("announcements_only", z);
            c05y.A09(obtain);
        }
    }

    public void A0H(C011005l c011005l, boolean z, C0TD c0td) {
        if (this.A02.A06) {
            Log.i("sendmethods/sendSetGroupNoFrequentlyForwarded");
            C05Y c05y = this.A07;
            Message obtain = Message.obtain(null, 0, 213, 0, c0td);
            obtain.getData().putParcelable("gjid", c011005l);
            obtain.getData().putBoolean("no_frequently_forwarded", z);
            c05y.A09(obtain);
        }
    }

    public void A0I(C011005l c011005l, boolean z, C0TD c0td) {
        if (this.A02.A06) {
            Log.i("sendmethods/sendSetGroupRestrictMode");
            C05Y c05y = this.A07;
            Message obtain = Message.obtain(null, 0, 159, 0, c0td);
            obtain.getData().putParcelable("gjid", c011005l);
            obtain.getData().putBoolean("restrict_mode", z);
            c05y.A09(obtain);
        }
    }

    public void A0J(C0SE c0se) {
        if (this.A02.A06) {
            StringBuilder A0P = C000200d.A0P("sendmethods/sendSubscribeLocations/");
            A0P.append(c0se.A00);
            A0P.append("/");
            C000200d.A1V(A0P, c0se.A01);
            this.A07.A09(Message.obtain(null, 0, 82, 0, c0se));
        }
    }

    public void A0K(C0Z5 c0z5) {
        if (this.A02.A06) {
            StringBuilder A0P = C000200d.A0P("sendmethods/sendUnsubscribeLocations/");
            A0P.append(c0z5.A00);
            Log.i(A0P.toString());
            this.A07.A09(Message.obtain(null, 0, 83, 0, c0z5));
        }
    }

    public void A0L(C04420Kc c04420Kc) {
        long j = c04420Kc.A00;
        C0EJ c0ej = this.A0A;
        int i = 4;
        if (c0ej.A01(1, j) == null) {
            if (c0ej.A04(j) != null) {
                i = 5;
            } else if (c0ej.A01(3, j) == null) {
                i = -1;
            }
        }
        AbstractC05150Nn A02 = c0ej.A02(j);
        if (i != -1 && A02 != null) {
            A02.A00(i);
        }
        if (this.A02.A06) {
            if ("receipt".equals(c04420Kc.A05)) {
                String str = c04420Kc.A08;
                if ("read".equals(str) || "read-self".equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("stanzaKey", c04420Kc);
                    bundle.putBoolean("disable", !this.A09.A02(C003101m.A04(c04420Kc.A01)));
                    this.A07.A09(Message.obtain(null, 0, 96, 0, bundle));
                    return;
                }
            }
            C05Y c05y = this.A07;
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("stanzaKey", c04420Kc);
            c05y.A09(Message.obtain(null, 0, 76, 0, bundle2));
        }
    }

    public void A0M(AnonymousClass097 anonymousClass097) {
        C09H c09h;
        AnonymousClass094 anonymousClass094 = anonymousClass097.A0n;
        if (!anonymousClass094.A02 && !C003101m.A0T(anonymousClass094.A00) && (c09h = anonymousClass097.A02) != null && c09h.A0U != null) {
            this.A01.A01(new SendMediaErrorReceiptJob(anonymousClass097));
        }
    }

    public void A0N(C0NW c0nw, int i, String str) {
        Object obj;
        if (this.A02.A06) {
            StringBuilder A0P = C000200d.A0P("sendmethods/sendSafetyNetVerifyAppsResult appsListSize=");
            if (c0nw != null) {
                obj = Integer.valueOf(c0nw.A01.size());
            } else {
                obj = "null";
            }
            A0P.append(obj);
            A0P.append(" errorCode=");
            A0P.append(i);
            A0P.append(" errorMessage=");
            C000200d.A1N(A0P, str);
            C05Y c05y = this.A07;
            Message obtain = Message.obtain(null, 0, 273, 0, c0nw);
            obtain.getData().putInt("errorCode", i);
            obtain.getData().putString("errorMessage", str);
            c05y.A09(obtain);
        }
    }

    public void A0O(String str, int i, String str2) {
        if (this.A02.A06) {
            StringBuilder sb = new StringBuilder("sendmethods/sendAttestationResult jws=");
            sb.append(str);
            sb.append(" errorCode=");
            sb.append(i);
            sb.append(" errorMessage=");
            C000200d.A1N(sb, str2);
            C05Y c05y = this.A07;
            Message obtain = Message.obtain(null, 0, 194, 0);
            obtain.getData().putString("result", str);
            obtain.getData().putInt("errorCode", i);
            obtain.getData().putString("errorMessage", str2);
            c05y.A09(obtain);
        }
    }

    public void A0P(String str, Long l) {
        if (this.A02.A06) {
            Log.i("sendmethods/sendClearDirty");
            C05Y c05y = this.A07;
            Message obtain = Message.obtain(null, 0, 18, 0);
            obtain.getData().putString("category", str);
            if (l != null) {
                obtain.getData().putLong("timestamp", l.longValue());
            }
            c05y.A09(obtain);
        }
    }

    public void A0Q(String str, String str2, List list) {
        if (this.A02.A06) {
            this.A07.A09(Message.obtain(null, 0, 1, 0, new C0ZK(str, str2, list)));
        }
    }

    public void A0R(List list) {
        StringBuilder sb = new StringBuilder("app/send-get-identities jids=");
        sb.append(list);
        Log.i(sb.toString());
        C010005b c010005b = this.A02;
        if (c010005b.A06 && c010005b.A02) {
            C05Y c05y = this.A07;
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("jids", (Jid[]) list.toArray(new DeviceJid[0]));
            c05y.A09(Message.obtain(null, 0, 153, 0, bundle));
        }
    }

    public void A0S(Set set, boolean z) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass092 anonymousClass092 = (AnonymousClass092) it.next();
            AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
            C27861Pb c27861Pb = new C27861Pb(anonymousClass094.A00, anonymousClass092.A0A());
            if (hashMap.containsKey(c27861Pb)) {
                ((List) hashMap.get(c27861Pb)).add(new C1RU(Long.valueOf(anonymousClass092.A0p), anonymousClass094.A01));
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C1RU(Long.valueOf(anonymousClass092.A0p), anonymousClass094.A01));
                hashMap.put(c27861Pb, arrayList);
            }
        }
        Iterator it2 = ((AbstractCollection) C0G1.A01(hashMap)).iterator();
        while (it2.hasNext()) {
            this.A01.A01(new SendPlayedReceiptJobV2((C09600eO) it2.next(), z));
        }
    }

    public void A0T(boolean z) {
        if (this.A02.A06) {
            Log.i("sendmethods/sendGetServerProps");
            C05Y c05y = this.A07;
            Bundle bundle = new Bundle();
            bundle.putBoolean("forceRefresh", z);
            c05y.A09(Message.obtain(null, 0, 21, 0, bundle));
        }
    }

    public void A0U(byte[] bArr, byte[] bArr2, Runnable runnable) {
        if (this.A02.A06) {
            Log.i("sendmethods/sendcreatecipherkey");
            AbstractC000600i abstractC000600i = this.A00;
            C03460Fu.A08(abstractC000600i, bArr);
            C03460Fu.A09(abstractC000600i, bArr2);
            this.A07.A09(C003101m.A02(bArr, bArr2, runnable));
        }
    }

    public boolean A0V(String str, String str2) {
        if (this.A02.A06) {
            this.A07.A09(Message.obtain(null, 0, 36, 0, new C0ZG(str, str2)));
            return true;
        }
        return false;
    }
}
