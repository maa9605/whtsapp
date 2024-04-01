package X;

import android.os.Message;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.settings.SettingsPrivacy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.277 */
/* loaded from: classes2.dex */
public class AnonymousClass277 implements C0EK {
    public static volatile AnonymousClass277 A0D;
    public final AbstractC000600i A00;
    public final C018508q A01;
    public final C02L A02;
    public final C05X A03;
    public final C04960Mq A04;
    public final C40261rr A05;
    public final C04470Kh A06;
    public final C000500h A07;
    public final C41711uO A08;
    public final C41401tr A09;
    public final C0EG A0A;
    public final C0EJ A0B;
    public final C22P A0C;

    @Override // X.C0EK
    public int[] AAP() {
        return new int[]{203};
    }

    public AnonymousClass277(C018508q c018508q, C05X c05x, AbstractC000600i abstractC000600i, C02L c02l, C0EG c0eg, C40261rr c40261rr, C22P c22p, C04470Kh c04470Kh, C0EJ c0ej, C000500h c000500h, C41401tr c41401tr, C04960Mq c04960Mq, C41711uO c41711uO) {
        this.A01 = c018508q;
        this.A03 = c05x;
        this.A00 = abstractC000600i;
        this.A02 = c02l;
        this.A0A = c0eg;
        this.A05 = c40261rr;
        this.A0C = c22p;
        this.A06 = c04470Kh;
        this.A0B = c0ej;
        this.A07 = c000500h;
        this.A09 = c41401tr;
        this.A04 = c04960Mq;
        this.A08 = c41711uO;
    }

    @Override // X.C0EK
    public boolean AEN(int i, Message message) {
        String str;
        String str2;
        String str3;
        if (i != 203) {
            return false;
        }
        C02590Ca c02590Ca = (C02590Ca) message.obj;
        C04420Kc c04420Kc = (C04420Kc) message.getData().getParcelable("stanzaKey");
        if (c04420Kc != null) {
            C02590Ca A0B = c02590Ca.A0B();
            C05140Nm A04 = this.A0B.A04(c04420Kc.A00);
            if (A04 != null) {
                A04.A00 = A0B.A00;
                A04.A00(3);
            }
            String str4 = A0B.A00;
            if ("status".equals(str4)) {
                C04P A0A = A0B.A0A("action");
                if (A0A != null) {
                    str3 = A0A.A03;
                } else {
                    str3 = null;
                }
                if ("modify".equals(str3)) {
                    C22P c22p = this.A0C;
                    C22Q c22q = new C22Q();
                    c22q.A05 = true;
                    c22p.A01(new C22R(c22q), false, true);
                } else {
                    C04P A0A2 = A0B.A0A("dhash");
                    this.A01.A02.post(new RunnableEBaseShape0S2100000_I0(this, A0B.A0F(), A0A2 != null ? A0A2.A03 : null, 5));
                }
            } else if ("picture".equals(str4)) {
                C04P A0A3 = A0B.A0A("action");
                if ("modify".equals(A0A3 != null ? A0A3.A03 : null)) {
                    C22P c22p2 = this.A0C;
                    C22Q c22q2 = new C22Q();
                    c22q2.A03 = true;
                    c22p2.A01(new C22R(c22q2), false, true);
                } else if (A0B.A0D("delete") != null) {
                    C04470Kh c04470Kh = this.A06;
                    C02L c02l = this.A02;
                    c02l.A05();
                    c04470Kh.A04(c02l.A03);
                }
            } else if ("devices".equals(str4)) {
                C04P A0A4 = A0B.A0A("action");
                if ("modify".equals(A0A4 != null ? A0A4.A03 : null)) {
                    C22P c22p3 = this.A0C;
                    C22Q c22q3 = new C22Q();
                    c22q3.A02 = true;
                    c22p3.A01(new C22R(c22q3), false, true);
                } else if (!A0B.A0H("device").isEmpty()) {
                    C02590Ca A0D2 = A0B.A0D("key-index-list");
                    if (this.A07.A00.getLong("adv_timestamp_sec", -1L) <= (A0D2 == null ? 0L : A0D2.A06("ts"))) {
                        this.A08.A0F(C40731sm.A0D(this.A00, A0B), this.A09.A08());
                    }
                }
            } else if ("privacy".equals(str4)) {
                C04P A0A5 = A0B.A0A("action");
                if ("modify".equals(A0A5 != null ? A0A5.A03 : null)) {
                    C22P c22p4 = this.A0C;
                    C22Q c22q4 = new C22Q();
                    c22q4.A04 = true;
                    c22p4.A01(new C22R(c22q4), false, true);
                } else if (!A0B.A0H("category").isEmpty()) {
                    HashMap hashMap = new HashMap();
                    for (C02590Ca c02590Ca2 : A0B.A0H("category")) {
                        hashMap.put(c02590Ca2.A0G("name"), c02590Ca2.A0G("value"));
                    }
                    C04960Mq c04960Mq = this.A04;
                    SettingsPrivacy.A03(c04960Mq.A00, c04960Mq.A03, c04960Mq.A01, c04960Mq, hashMap);
                }
            } else if ("blocklist".equals(str4)) {
                String string = this.A07.A00.getString("block_list_v2_dhash", null);
                C04P A0A6 = A0B.A0A("prev_dhash");
                if (A0A6 != null) {
                    str = A0A6.A03;
                } else {
                    str = null;
                }
                C04P A0A7 = A0B.A0A("action");
                if (A0A7 != null) {
                    str2 = A0A7.A03;
                } else {
                    str2 = null;
                }
                if (!"modify".equals(str2) && TextUtils.equals(string, str)) {
                    if (!A0B.A0H("item").isEmpty()) {
                        AbstractC000600i abstractC000600i = this.A00;
                        HashMap hashMap2 = new HashMap();
                        for (C02590Ca c02590Ca3 : A0B.A0H("item")) {
                            hashMap2.put(c02590Ca3.A09(UserJid.class, "jid", abstractC000600i), Boolean.valueOf("block".equals(c02590Ca3.A0G("action"))));
                        }
                        HashSet<UserJid> hashSet = new HashSet();
                        HashSet<UserJid> hashSet2 = new HashSet();
                        for (Map.Entry entry : hashMap2.entrySet()) {
                            boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
                            Object key = entry.getKey();
                            if (booleanValue) {
                                hashSet.add(key);
                            } else {
                                hashSet2.add(key);
                            }
                        }
                        C40261rr c40261rr = this.A05;
                        C04P A0A8 = A0B.A0A("dhash");
                        String str5 = A0A8 != null ? A0A8.A03 : null;
                        synchronized (c40261rr) {
                            Set set = c40261rr.A0O;
                            hashSet.removeAll(set);
                            hashSet2.retainAll(set);
                            if (!hashSet.isEmpty() || !hashSet2.isEmpty()) {
                                for (UserJid userJid : hashSet) {
                                    c40261rr.A0C(userJid, true);
                                }
                                for (UserJid userJid2 : hashSet2) {
                                    c40261rr.A0C(userJid2, false);
                                }
                                set.addAll(hashSet);
                                set.removeAll(hashSet2);
                                c40261rr.A0A.A0D(c40261rr.A02());
                                c40261rr.A0F.A0D().putString("block_list_v2_dhash", str5).apply();
                                HashSet hashSet3 = new HashSet(hashSet);
                                hashSet3.addAll(hashSet2);
                                c40261rr.A06.A02.post(new RunnableEBaseShape0S0200000_I0_0(c40261rr, hashSet3, 29));
                            }
                        }
                    }
                } else {
                    C22P c22p5 = this.A0C;
                    C22Q c22q5 = new C22Q();
                    c22q5.A01 = true;
                    c22p5.A01(new C22R(c22q5), false, true);
                }
            }
            this.A0A.A0L(c04420Kc);
            return true;
        }
        throw null;
    }
}
