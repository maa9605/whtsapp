package X;

import android.util.Base64;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2AI  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2AI extends RunnableEmptyBase implements Runnable {
    public final AbstractC000600i A00;
    public final C02L A01;
    public final C05W A02;
    public final C41581uB A03;
    public final C41401tr A04;
    public final C0EC A05;
    public final C0EG A06;
    public final List A07;

    public C2AI(AbstractC000600i abstractC000600i, C02L c02l, C0EG c0eg, C05W c05w, C41581uB c41581uB, C0EC c0ec, C41401tr c41401tr, List list) {
        this.A00 = abstractC000600i;
        this.A01 = c02l;
        this.A06 = c0eg;
        this.A02 = c05w;
        this.A03 = c41581uB;
        this.A05 = c0ec;
        this.A04 = c41401tr;
        this.A07 = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // java.lang.Runnable
    public void run() {
        ?? r6;
        C07D c07d;
        C0EC c0ec = this.A05;
        C000700j.A0A(c0ec.A05.A04(), "SyncDeviceNotificationRunnable/run device sync disabled.");
        HashSet hashSet = new HashSet();
        List<C2AH> list = this.A07;
        for (C2AH c2ah : list) {
            String str = c2ah.A06;
            if (str != null) {
                if (str != null) {
                    byte[] decode = Base64.decode(str.getBytes(), 0);
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                        r6 = new ArrayList();
                        Iterator it = ((AbstractCollection) C23X.A0G(messageDigest, Collections.singletonList(decode), (List) this.A02.A05.A0H(true))).iterator();
                        while (it.hasNext()) {
                            Jid A02 = ((C06C) it.next()).A02();
                            if (A02 instanceof UserJid) {
                                r6.add(A02);
                            }
                        }
                    } catch (NoSuchAlgorithmException e) {
                        this.A00.A09("SyncDeviceNotificationRunnable/getSidelistContactsMatchingHash NoSuchAlgorithmException", e.toString(), true);
                        Log.e("SyncDeviceNotificationRunnable/onRun/NoSuchAlgorithmException.");
                        r6 = Collections.EMPTY_LIST;
                    }
                    hashSet.addAll(r6);
                } else {
                    throw null;
                }
            } else {
                UserJid userJid = c2ah.A03;
                if (userJid != null) {
                    C41401tr c41401tr = this.A04;
                    if (c41401tr.A08() && c0ec.A01(userJid) > c2ah.A00) {
                        Log.w("SyncDeviceNotificationRunnable/handleUserDeviceUpdate/local ts is larger than notification one");
                    } else {
                        C07E c07e = c2ah.A01;
                        Map map = c07e.A00;
                        if (!map.isEmpty()) {
                            C02L c02l = this.A01;
                            c02l.A05();
                            if (!userJid.equals(c02l.A03)) {
                                if (c41401tr.A08()) {
                                    byte[] bArr = c2ah.A07;
                                    if (bArr == null) {
                                        Log.e("SyncDeviceNotificationRunnable/verifyADVIndexList/no key index list in device add notification");
                                    } else {
                                        AnonymousClass296 A05 = c41401tr.A05(userJid, bArr);
                                        if (!c41401tr.A0B(userJid, A05, c2ah.A00)) {
                                            StringBuilder sb = new StringBuilder("SyncDeviceNotificationRunnable/verifyADVIndexList/validate indexList fail, userJid=");
                                            sb.append(userJid);
                                            Log.e(sb.toString());
                                        } else if (A05 != null) {
                                            Map A052 = c0ec.A05(userJid);
                                            ((AbstractMap) A052).putAll(new HashMap(map));
                                            C07E A00 = C07E.A00(C002501g.A0J(this.A00, c0ec.A05(userJid), A052, A05.A05, A05.A01));
                                            int i = A05.A02;
                                            C05250Nx A03 = c0ec.A03(userJid);
                                            c0ec.A0C(userJid, A00, new C05250Nx(i, A03 == null ? 0L : A03.A01));
                                        } else {
                                            throw null;
                                        }
                                    }
                                    Log.e("SyncDeviceNotificationRunnable/handleUserDeviceUpdate/invalid adv data");
                                    hashSet.add(userJid);
                                } else {
                                    c0ec.A09(userJid, c07e);
                                }
                            } else {
                                AbstractC000600i abstractC000600i = this.A00;
                                StringBuilder A0P = C000200d.A0P("Add self device, userJid=");
                                A0P.append(userJid);
                                A0P.append("; toAdd=");
                                A0P.append(c07e);
                                abstractC000600i.A09("invalid-device-notification", A0P.toString(), false);
                            }
                        }
                        C07E c07e2 = c2ah.A02;
                        Map map2 = c07e2.A00;
                        if (!map2.isEmpty()) {
                            C02L c02l2 = this.A01;
                            c02l2.A05();
                            if (!userJid.equals(c02l2.A03)) {
                                if (!c41401tr.A08()) {
                                    c07d = c07e2.A02();
                                } else {
                                    HashSet hashSet2 = new HashSet();
                                    for (Map.Entry entry : ((AbstractMap) c0ec.A05(userJid)).entrySet()) {
                                        if (map2.containsKey(entry.getKey()) && map2.get(entry.getKey()) == entry.getValue()) {
                                            hashSet2.add(entry.getKey());
                                        }
                                    }
                                    c07d = new C07D(hashSet2, null);
                                }
                                c0ec.A0A(userJid, c07d);
                            } else {
                                AbstractC000600i abstractC000600i2 = this.A00;
                                StringBuilder A0P2 = C000200d.A0P("Remove self device, userJid=");
                                A0P2.append(userJid);
                                A0P2.append("; toAdd=");
                                A0P2.append(c07e2);
                                abstractC000600i2.A09("invalid-device-notification", A0P2.toString(), false);
                            }
                        }
                        UserJid[] userJidArr = {userJid};
                        String str2 = c2ah.A05;
                        if (str2 != null) {
                            if (!c0ec.A0D(userJidArr, str2)) {
                                if (userJid == null) {
                                    throw null;
                                }
                                hashSet.add(userJid);
                            } else {
                                continue;
                            }
                        } else {
                            throw null;
                        }
                    }
                } else {
                    throw null;
                }
            }
        }
        if (!hashSet.isEmpty()) {
            this.A03.A02((UserJid[]) hashSet.toArray(new UserJid[0]), 2);
        }
        for (C2AH c2ah2 : list) {
            C04420Kc c04420Kc = c2ah2.A04;
            if (c04420Kc != null) {
                this.A06.A0L(c04420Kc);
            }
        }
    }
}
