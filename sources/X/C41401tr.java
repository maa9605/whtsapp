package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.1tr */
/* loaded from: classes2.dex */
public class C41401tr {
    public static volatile C41401tr A0D;
    public final AbstractC000600i A02;
    public final C02L A03;
    public final C04h A04;
    public final AnonymousClass012 A05;
    public final C01J A06;
    public final C0E9 A07;
    public final C41711uO A08;
    public final C0EC A09;
    public final C003701t A0A;
    public final C0EE A0B;
    public final C0EG A0C;
    public boolean A01 = true;
    public WeakHashMap A00 = new WeakHashMap();

    public C41401tr(AnonymousClass012 anonymousClass012, C003701t c003701t, AbstractC000600i abstractC000600i, C02L c02l, C0EG c0eg, C0EE c0ee, C01J c01j, C0EC c0ec, C0E9 c0e9, C04h c04h, C41711uO c41711uO) {
        this.A05 = anonymousClass012;
        this.A0A = c003701t;
        this.A02 = abstractC000600i;
        this.A03 = c02l;
        this.A0C = c0eg;
        this.A0B = c0ee;
        this.A06 = c01j;
        this.A09 = c0ec;
        this.A07 = c0e9;
        this.A04 = c04h;
        this.A08 = c41711uO;
    }

    public static C0IR A00(byte[] bArr, byte b) {
        try {
            return C002701i.A0S(AnonymousClass029.A1h(new byte[]{b}, bArr));
        } catch (C05240Nw e) {
            Log.e("DeviceADVInfoManager/generatePublicIdentityKey invalidKeyException", e);
            return null;
        }
    }

    public static C41401tr A01() {
        if (A0D == null) {
            synchronized (C41401tr.class) {
                if (A0D == null) {
                    A0D = new C41401tr(AnonymousClass012.A00(), C003701t.A00(), AbstractC000600i.A00(), C02L.A00(), C0EG.A00(), C0EE.A00(), C01J.A00(), C0EC.A00(), C0E9.A00(), C04h.A00(), C41711uO.A00());
                }
            }
        }
        return A0D;
    }

    public final long A02(C0AN c0an, UserJid userJid) {
        C05250Nx A03 = this.A09.A03(userJid);
        long j = A03 == null ? 0L : A03.A01;
        if (c0an != null || this.A05.A05() - (1000 * j) < 2592000000L) {
            return j;
        }
        return 0L;
    }

    public final C0AN A03(UserJid userJid, Set set) {
        Map A05;
        Set<DeviceJid> keySet;
        C0IP A0A;
        C02L c02l = this.A03;
        boolean A0A2 = c02l.A0A(userJid);
        if (A0A2) {
            A05 = new HashMap();
        } else {
            A05 = this.A09.A05(userJid);
        }
        if (A0A2) {
            keySet = this.A09.A06(userJid);
        } else {
            keySet = A05.keySet();
        }
        HashSet hashSet = new HashSet();
        if (keySet.size() <= 1) {
            return null;
        }
        ArrayList<C0IP> arrayList = new ArrayList();
        for (DeviceJid deviceJid : keySet) {
            if (deviceJid.isPrimary() && c02l.A0A(deviceJid.userJid)) {
                A0A = this.A06.A0B().A01;
            } else {
                A0A = this.A06.A0A(C002701i.A0T(deviceJid));
            }
            if (A0A == null) {
                StringBuilder sb = new StringBuilder("DeviceADVInfoManager/getKeyHash cannot find identity key for device=");
                sb.append(deviceJid);
                sb.append("; isMe=");
                sb.append(A0A2);
                Log.w(sb.toString());
                if (A0A2) {
                    AbstractC000600i abstractC000600i = this.A02;
                    StringBuilder sb2 = new StringBuilder("self device identity is missing when creating metadata device=");
                    sb2.append(deviceJid);
                    abstractC000600i.A09("adv-data-error", sb2.toString(), true);
                    return null;
                }
                hashSet.add(deviceJid);
            } else {
                arrayList.add(A0A);
            }
        }
        if (arrayList.isEmpty()) {
            AbstractC000600i abstractC000600i2 = this.A02;
            StringBuilder sb3 = new StringBuilder("identity is missing for metadata jid=");
            sb3.append(userJid);
            abstractC000600i2.A09("adv-data-error", sb3.toString(), true);
            return null;
        }
        if (!hashSet.isEmpty()) {
            for (Map.Entry entry : A05.entrySet()) {
                if (!hashSet.contains(entry.getKey())) {
                    set.add(Integer.valueOf(((Number) entry.getValue()).intValue()));
                }
            }
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (C0IP c0ip : arrayList) {
                arrayList2.add(c0ip.A00.A01);
            }
            Collections.sort(arrayList2, new AnonymousClass294());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                messageDigest.update((byte[]) it.next());
            }
            return C0AN.A00(AnonymousClass029.A1g(messageDigest.digest(), this.A0A.A03(310)));
        } catch (NoSuchAlgorithmException e) {
            Log.e("DeviceADVInfoManager/getKeyHash no such algorithm exception", e);
            return null;
        }
    }

    public AnonymousClass295 A04(UserJid userJid) {
        if (this.A0A.A0C(309)) {
            C02L c02l = this.A03;
            c02l.A05();
            C0AN A03 = A03(c02l.A03, new HashSet());
            c02l.A05();
            long A02 = A02(A03, c02l.A03);
            boolean A0A = c02l.A0A(userJid);
            HashSet hashSet = new HashSet();
            C0AN A032 = A0A ? null : A03(userJid, hashSet);
            long A022 = A0A ? 0L : A02(A032, userJid);
            if (A03 == null && A02 == 0 && A032 == null && A022 == 0) {
                return null;
            }
            return new AnonymousClass295(A03, A02, A032, A022, hashSet.isEmpty() ? null : hashSet);
        }
        return null;
    }

    public AnonymousClass296 A05(UserJid userJid, byte[] bArr) {
        C0IP A0A = this.A06.A0A(C002701i.A0T(userJid.getPrimaryDevice()));
        if (A0A == null) {
            StringBuilder sb = new StringBuilder("DeviceADVInfoHandler/checkPrimaryIdentity/no primary identity. userJid=");
            sb.append(userJid);
            Log.w(sb.toString());
            this.A0C.A0R(Collections.singletonList(userJid.getPrimaryDevice()));
            return null;
        }
        try {
            AnonymousClass297 anonymousClass297 = (AnonymousClass297) C0AZ.A03(AnonymousClass297.A03, bArr);
            byte[] A06 = anonymousClass297.A02.A06();
            if (!C002701i.A1Q(A0A.A00, AnonymousClass029.A1h(C02M.A06, A06), anonymousClass297.A01.A06())) {
                Log.w("DeviceADVInfoManager/verifyADVSignedKeyIndexList/fail to verify account signature");
                this.A0C.A0R(Collections.singletonList(userJid.getPrimaryDevice()));
                return null;
            }
            try {
                return (AnonymousClass296) C0AZ.A03(AnonymousClass296.A06, A06);
            } catch (C0JX e) {
                StringBuilder A0P = C000200d.A0P("DeviceADVInfoManager/verifyADVSignedKeyIndexList/ADVKeyIndexList invalidProto:");
                A0P.append(e.getMessage());
                Log.e(A0P.toString());
                AbstractC000600i abstractC000600i = this.A02;
                StringBuilder A0U = C000200d.A0U("invalidProto of ADVKeyIndexList, userJid=", userJid, "; exception=");
                A0U.append(e.getMessage());
                abstractC000600i.A09("adv-data-error", A0U.toString(), true);
                return null;
            }
        } catch (C0JX e2) {
            StringBuilder A0P2 = C000200d.A0P("DeviceADVInfoManager/verifyADVSignedKeyIndexList/ADVSignedKeyIndexList invalidProto:");
            A0P2.append(e2.getMessage());
            Log.e(A0P2.toString());
            AbstractC000600i abstractC000600i2 = this.A02;
            StringBuilder A0U2 = C000200d.A0U("signed invalidProto of ADVSignedKeyIndexList, userJid=", userJid, "; exception=");
            A0U2.append(e2.getMessage());
            abstractC000600i2.A09("adv-data-error", A0U2.toString(), true);
            return null;
        }
    }

    public final void A06(DeviceJid deviceJid, AnonymousClass298 anonymousClass298, C0IR c0ir) {
        this.A06.A0M(C002701i.A0T(deviceJid.userJid.getPrimaryDevice()), new C0IP(c0ir));
        C0EC c0ec = this.A09;
        long A01 = c0ec.A01(deviceJid.userJid);
        UserJid userJid = deviceJid.userJid;
        HashMap hashMap = new HashMap();
        hashMap.put(userJid.getPrimaryDevice(), 0L);
        hashMap.put(deviceJid, Long.valueOf(anonymousClass298.A01));
        c0ec.A0C(userJid, new C07E(hashMap, null), new C05250Nx(anonymousClass298.A02, A01));
    }

    public void A07(DeviceJid deviceJid, boolean z) {
        boolean z2;
        C000700j.A07(!deviceJid.isPrimary());
        this.A06.A0H.A00();
        boolean z3 = false;
        if (z) {
            if (this.A03.A09(deviceJid)) {
                this.A08.A0C(deviceJid, false);
            } else {
                this.A09.A0A(deviceJid.userJid, C07D.A00(deviceJid));
            }
        }
        this.A07.A07(Collections.singleton(deviceJid));
        for (AxolotlMultiDeviceSessionRequirement axolotlMultiDeviceSessionRequirement : this.A00.keySet()) {
            synchronized (axolotlMultiDeviceSessionRequirement.A05) {
                Collection collection = axolotlMultiDeviceSessionRequirement.A06;
                if (collection == null || !collection.contains(deviceJid)) {
                    z2 = false;
                } else {
                    axolotlMultiDeviceSessionRequirement.A08 = false;
                    z2 = true;
                }
            }
            z3 |= z2;
        }
        if (z3) {
            C04h c04h = this.A04;
            c04h.A02.A01(new C05260Ny(deviceJid));
        }
    }

    public boolean A08() {
        return this.A0B.A04();
    }

    public boolean A09(DeviceJid deviceJid, byte[] bArr, C010805j c010805j) {
        byte[] bArr2;
        this.A06.A0H.A00();
        if (deviceJid == null || deviceJid.isPrimary() || c010805j == null || c010805j.A00 != 1) {
            return true;
        }
        byte[] bArr3 = c010805j.A02;
        try {
            bArr2 = C002701i.A0S(AnonymousClass029.A13(((C29B) C0AZ.A00(C29B.A07, C0AN.A01(bArr3, 1, bArr3.length - 1))).A05.A06()).A00()).A01;
        } catch (C02650Cg e) {
            Log.e("DeviceADVInfoManager/extractIdentityFromCipherText/fail to get key", e);
            bArr2 = null;
            return A0A(deviceJid, bArr, bArr2, (byte) 5);
        } catch (C0JX e2) {
            Log.e("DeviceADVInfoManager/extractIdentityFromCipherText/fail to get key", e2);
            bArr2 = null;
            return A0A(deviceJid, bArr, bArr2, (byte) 5);
        } catch (C05240Nw e3) {
            Log.e("DeviceADVInfoManager/extractIdentityFromCipherText/fail to get key", e3);
            bArr2 = null;
            return A0A(deviceJid, bArr, bArr2, (byte) 5);
        }
        return A0A(deviceJid, bArr, bArr2, (byte) 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x017d, code lost:
        if (new X.C0IP(r1).equals(r3) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01ae, code lost:
        if (((java.lang.Number) r1.get(r20)).longValue() != r5.A01) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x020d, code lost:
        if (r2 == null) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0A(com.whatsapp.jid.DeviceJid r20, byte[] r21, byte[] r22, byte r23) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41401tr.A0A(com.whatsapp.jid.DeviceJid, byte[], byte[], byte):boolean");
    }

    public boolean A0B(UserJid userJid, AnonymousClass296 anonymousClass296, long j) {
        if (anonymousClass296 == null) {
            StringBuilder sb = new StringBuilder("DeviceADVInfoManager/verifyKeyIndexListData/validate indexList fail, userJid=");
            sb.append(userJid);
            Log.w(sb.toString());
            return false;
        } else if (j != anonymousClass296.A04) {
            AbstractC000600i abstractC000600i = this.A02;
            StringBuilder sb2 = new StringBuilder("timestamp is different with indexList timestamp, userJid=");
            sb2.append(userJid);
            sb2.append("; synctime=");
            sb2.append(j);
            sb2.append("; listTime=");
            sb2.append(anonymousClass296.A04);
            abstractC000600i.A09("adv-data-error", sb2.toString(), true);
            return false;
        } else {
            C0EC c0ec = this.A09;
            C05250Nx A03 = c0ec.A03(userJid);
            if (A03 == null || A03.A00 != anonymousClass296.A02) {
                c0ec.A08(userJid);
            }
            return true;
        }
    }
}
