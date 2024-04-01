package X;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1rr */
/* loaded from: classes2.dex */
public class C40261rr {
    public static volatile C40261rr A0P;
    public C460824w A00;
    public boolean A01;
    public boolean A02;
    public final C0M8 A03;
    public final AbstractC000600i A04;
    public final C04480Ki A05;
    public final C018508q A06;
    public final C01B A07;
    public final C010005b A08;
    public final C460624u A09;
    public final C460724v A0A;
    public final AnonymousClass008 A0B;
    public final C42371vd A0C;
    public final C018708s A0D;
    public final AnonymousClass012 A0E;
    public final C000500h A0F;
    public final C002301c A0G;
    public final C0C9 A0H;
    public final C03180Eq A0I;
    public final C05O A0J;
    public final C05Y A0K;
    public final C07A A0L;
    public final InterfaceC002901k A0M;
    public final C41991uq A0N;
    public final Set A0O;

    public C40261rr(AnonymousClass012 anonymousClass012, C0M8 c0m8, C018508q c018508q, AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, C05O c05o, C41991uq c41991uq, C01B c01b, C05Y c05y, C018708s c018708s, C002301c c002301c, C04480Ki c04480Ki, AnonymousClass008 anonymousClass008, C0C9 c0c9, C03180Eq c03180Eq, AnonymousClass062 anonymousClass062, C010005b c010005b, C000500h c000500h, C07A c07a, C42371vd c42371vd, C460624u c460624u) {
        C460724v c460724v = new C460724v(anonymousClass062);
        this.A0O = new HashSet();
        this.A0E = anonymousClass012;
        this.A03 = c0m8;
        this.A06 = c018508q;
        this.A04 = abstractC000600i;
        this.A0M = interfaceC002901k;
        this.A0J = c05o;
        this.A0N = c41991uq;
        this.A07 = c01b;
        this.A0K = c05y;
        this.A0D = c018708s;
        this.A0G = c002301c;
        this.A05 = c04480Ki;
        this.A0B = anonymousClass008;
        this.A0H = c0c9;
        this.A0I = c03180Eq;
        this.A08 = c010005b;
        this.A0F = c000500h;
        this.A0L = c07a;
        this.A0C = c42371vd;
        this.A09 = c460624u;
        this.A0A = c460724v;
    }

    public static C40261rr A00() {
        if (A0P == null) {
            synchronized (C40261rr.class) {
                if (A0P == null) {
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C0M8 A002 = C0M8.A00();
                    C018508q A003 = C018508q.A00();
                    AbstractC000600i A004 = AbstractC000600i.A00();
                    InterfaceC002901k A005 = C002801j.A00();
                    C05O A006 = C05O.A00();
                    C41991uq A007 = C41991uq.A00();
                    C01B A008 = C01B.A00();
                    C05Y A01 = C05Y.A01();
                    C018708s A009 = C018708s.A00();
                    C002301c A0010 = C002301c.A00();
                    C04480Ki c04480Ki = C04480Ki.A01;
                    AnonymousClass008 anonymousClass008 = AnonymousClass008.A01;
                    C0C9 A0011 = C0C9.A00();
                    C03180Eq A0012 = C03180Eq.A00();
                    AnonymousClass062 A0013 = AnonymousClass062.A00();
                    C010005b c010005b = C010005b.A07;
                    C000500h A0014 = C000500h.A00();
                    C07A A012 = C07A.A01();
                    C42371vd A0015 = C42371vd.A00();
                    if (C460624u.A02 == null) {
                        synchronized (C460624u.class) {
                            if (C460624u.A02 == null) {
                                C460624u.A02 = new C460624u(C02O.A00());
                            }
                        }
                    }
                    A0P = new C40261rr(A00, A002, A003, A004, A005, A006, A007, A008, A01, A009, A0010, c04480Ki, anonymousClass008, A0011, A0012, A0013, c010005b, A0014, A012, A0015, C460624u.A02);
                }
            }
        }
        return A0P;
    }

    /* JADX WARN: Finally extract failed */
    public Boolean A01(AbstractC005302j abstractC005302j) {
        if (this.A0I.A03(abstractC005302j) == null) {
            return null;
        }
        C05O c05o = this.A0J;
        boolean z = false;
        String[] strArr = {String.valueOf(c05o.A00.A05(abstractC005302j))};
        C0CD A03 = c05o.A03.A03();
        try {
            Cursor A07 = A03.A02.A07("SELECT  1 FROM available_message_view WHERE chat_row_id=? AND message_type NOT IN ('7') AND from_me = 1 LIMIT 1", strArr);
            if (A07 != null && A07.getCount() > 0) {
                z = true;
            }
            if (A07 != null) {
                A07.close();
            }
            A03.close();
            return Boolean.valueOf(!z);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A03.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public synchronized Set A02() {
        return new HashSet(this.A0O);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x004b, code lost:
        if (r6.equals(r1) != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03() {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40261rr.A03():void");
    }

    public synchronized void A04() {
        if (!this.A01 && !this.A02) {
            this.A02 = true;
            this.A0M.ARy(new C0HS() { // from class: X.24x
                {
                    C40261rr.this = this;
                }

                @Override // X.C0HS
                public Object A07(Object[] objArr) {
                    C460724v c460724v = C40261rr.this.A0A;
                    if (c460724v != null) {
                        HashSet hashSet = new HashSet();
                        C0CD A0A = c460724v.A0A();
                        try {
                            Cursor A05 = AnonymousClass061.A05(A0A, "wa_block_list", new String[]{"jid"}, null, null, null, "CONTACT_BLOCK_LIST");
                            if (A05 == null) {
                                C000700j.A08(false, "contact-mgr-db/unable to get block list");
                            } else {
                                while (A05.moveToNext()) {
                                    UserJid nullable = UserJid.getNullable(A05.getString(0));
                                    if (nullable != null) {
                                        hashSet.add(nullable);
                                    }
                                }
                                A05.close();
                            }
                            A0A.close();
                            return hashSet;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                try {
                                    A0A.close();
                                } catch (Throwable unused) {
                                }
                                throw th2;
                            }
                        }
                    }
                    throw null;
                }

                @Override // X.C0HS
                public void A09(Object obj) {
                    Collection collection = (Collection) obj;
                    C40261rr c40261rr = C40261rr.this;
                    synchronized (c40261rr) {
                        c40261rr.A02 = false;
                        if (!c40261rr.A01) {
                            c40261rr.A0O.addAll(collection);
                            c40261rr.A01 = true;
                            c40261rr.A0E(c40261rr.A02());
                        }
                    }
                }
            }, new Void[0]);
        }
    }

    public synchronized void A05() {
        Set set = this.A0O;
        HashSet hashSet = new HashSet(set);
        set.clear();
        A06();
        C04480Ki c04480Ki = this.A05;
        c04480Ki.A00.post(new RunnableEBaseShape0S0100000_I0_0(this, 40));
        A0E(hashSet);
    }

    public synchronized void A06() {
        C000500h c000500h = this.A0F;
        C000200d.A0i(c000500h, "block_list_v2_dhash", null);
        c000500h.A0D().remove("block_list_receive_time").apply();
    }

    public void A07(Activity activity, InterfaceC40271rs interfaceC40271rs, UserJid userJid) {
        this.A03.A01(activity, false, new C34W(this, activity, interfaceC40271rs, new C461024y(false, userJid)));
    }

    public final void A08(final Activity activity, InterfaceC40271rs interfaceC40271rs, C04500Kk c04500Kk, boolean z, C461024y c461024y) {
        String str;
        C02590Ca c02590Ca;
        C04P[] c04pArr;
        boolean z2;
        byte b;
        C02590Ca c02590Ca2;
        InterfaceC40271rs interfaceC40271rs2 = interfaceC40271rs;
        UserJid userJid = c461024y.A00;
        final boolean z3 = c461024y.A04;
        if (this.A08.A06) {
            Set A02 = A02();
            AbstractCollection abstractCollection = (AbstractCollection) A02;
            if (z3) {
                abstractCollection.add(userJid);
            } else {
                abstractCollection.remove(userJid);
            }
            if (c04500Kk == null && interfaceC40271rs == null) {
                interfaceC40271rs2 = new InterfaceC40271rs() { // from class: X.34Y
                    {
                        C40261rr.this = this;
                    }

                    @Override // X.InterfaceC40271rs
                    public final void AOE(boolean z4) {
                        C40261rr c40261rr = C40261rr.this;
                        Activity activity2 = activity;
                        boolean z5 = z3;
                        if (!z4) {
                            C000200d.A0f(c40261rr.A0F, "block_list_receive_time");
                            if (activity2 != null && !activity2.isFinishing()) {
                                C018508q c018508q = c40261rr.A06;
                                int i = R.string.unblock_timeout;
                                if (z5) {
                                    i = R.string.block_timeout;
                                }
                                c018508q.A0D(null, activity2.getString(i));
                            }
                        }
                    }
                };
            }
            C461124z c461124z = new C461124z(activity, this.A06, this.A04, this.A0N, this.A07, this.A0K, this, this.A0B, this.A0F, interfaceC40271rs2, z, c04500Kk, A02, c461024y, this.A0C.A01(userJid));
            C04500Kk c04500Kk2 = c461124z.A0C;
            String A022 = c04500Kk2 != null ? c04500Kk2.A01 : c461124z.A0B.A02();
            str = "none";
            if (c461124z.A06.A07.A0E(C01C.A1K)) {
                AnonymousClass251 anonymousClass251 = new AnonymousClass251(c461124z.A02, c461124z.A04, c461124z.A0B, c461124z.A0A, new AnonymousClass250(c461124z));
                C461024y c461024y2 = c461124z.A07;
                C0MA c0ma = c461124z.A08;
                Log.i("blocklistv2setprotocolhelper/sendGetBlocklistRequest");
                C05Y c05y = anonymousClass251.A04;
                String string = anonymousClass251.A03.A00.getString("block_list_v2_dhash", null);
                String str2 = "block";
                if (TextUtils.isEmpty(string)) {
                    c04pArr = new C04P[2];
                    z2 = c461024y2.A04;
                    c04pArr[0] = new C04P("action", z2 ? "block" : "unblock", null, (byte) 0);
                    c04pArr[1] = new C04P("jid", c461024y2.A00);
                } else {
                    c04pArr = new C04P[3];
                    z2 = c461024y2.A04;
                    if (z2) {
                        b = 0;
                    } else {
                        b = 0;
                        str2 = "unblock";
                    }
                    c04pArr[b] = new C04P("action", str2, null, b);
                    c04pArr[1] = new C04P("jid", c461024y2.A00);
                    c04pArr[2] = new C04P("dhash", string, null, b);
                }
                C01B c01b = anonymousClass251.A01;
                if (c01b.A0E(C01C.A0k) && z2) {
                    Boolean bool = c461024y2.A01;
                    if (bool != null) {
                        str = bool.booleanValue() ? "true" : "false";
                    }
                    ArrayList arrayList = new ArrayList();
                    C000200d.A1A("first_message", str, arrayList);
                    String str3 = c461024y2.A03;
                    if (str3 != null) {
                        C000200d.A1A("reason", str3, arrayList);
                    }
                    String str4 = c461024y2.A02;
                    if (str4 != null) {
                        C000200d.A1A("entry_point", str4, arrayList);
                    }
                    if (c01b.A0E(C01C.A0m) && c0ma != null) {
                        arrayList.add(new C04P("business_discovery_entry_point", c0ma.A03, null, (byte) 0));
                        arrayList.add(new C04P("business_discovery_timestamp", c0ma.A00));
                        String str5 = c0ma.A02;
                        if (str5 != null) {
                            C000200d.A1A("business_discovery_id", str5, arrayList);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        c02590Ca2 = new C02590Ca("biz_opt_out", (C04P[]) arrayList.toArray(new C04P[0]), null, null);
                        c05y.A0B(2, A022, new C02590Ca("iq", new C04P[]{new C04P("to", C04260Jm.A00), new C04P("id", A022, null, (byte) 0), new C04P("type", "set", null, (byte) 0), new C04P("xmlns", "blocklist", null, (byte) 0)}, new C02590Ca("item", c04pArr, c02590Ca2)), anonymousClass251, 20000L);
                        return;
                    }
                }
                c02590Ca2 = null;
                c05y.A0B(2, A022, new C02590Ca("iq", new C04P[]{new C04P("to", C04260Jm.A00), new C04P("id", A022, null, (byte) 0), new C04P("type", "set", null, (byte) 0), new C04P("xmlns", "blocklist", null, (byte) 0)}, new C02590Ca("item", c04pArr, c02590Ca2)), anonymousClass251, 20000L);
                return;
            }
            AnonymousClass253 anonymousClass253 = new AnonymousClass253(c461124z.A04, c461124z.A0B, new AnonymousClass252(c461124z));
            Set<Jid> set = c461124z.A0G;
            C461024y c461024y3 = c461124z.A07;
            Log.i("blocklistv1setprotocolhelper/sendGetBlocklistRequest");
            C05Y c05y2 = anonymousClass253.A02;
            String str6 = c461024y3.A03;
            String str7 = c461024y3.A02;
            Boolean bool2 = c461024y3.A01;
            boolean z4 = c461024y3.A04;
            int size = set.size();
            C02590Ca[] c02590CaArr = new C02590Ca[size];
            if (anonymousClass253.A00.A0E(C01C.A0k) && z4 && str7 != null && str6 != null) {
                c02590Ca = new C02590Ca("biz_opt_out", new C04P[]{new C04P("entry_point", str7, null, (byte) 0), new C04P("first_message", bool2 != null ? String.valueOf(bool2) : "none", null, (byte) 0), new C04P("reason", str6, null, (byte) 0)}, null, null);
            } else {
                c02590Ca = null;
            }
            int i = 0;
            for (Jid jid : set) {
                C04P[] c04pArr2 = {new C04P("type", "jid", null, (byte) 0), new C04P("value", jid), new C04P("action", "deny", null, (byte) 0), new C04P("order", Integer.toString(i), null, (byte) 0)};
                C02590Ca c02590Ca3 = null;
                if (c461024y3.A00.equals(jid)) {
                    c02590Ca3 = c02590Ca;
                }
                c02590CaArr[i] = new C02590Ca("item", c04pArr2, c02590Ca3);
                i++;
            }
            C04P[] c04pArr3 = {new C04P("name", "default", null, (byte) 0)};
            if (size == 0) {
                c02590CaArr = null;
            }
            C02590Ca c02590Ca4 = new C02590Ca("query", (C04P[]) null, new C02590Ca("list", c04pArr3, c02590CaArr, null));
            C04P[] c04pArr4 = new C04P[c04500Kk2 == null ? 3 : 4];
            c04pArr4[0] = new C04P("id", A022, null, (byte) 0);
            c04pArr4[1] = new C04P("xmlns", "jabber:iq:privacy", null, (byte) 0);
            c04pArr4[2] = new C04P("type", "set", null, (byte) 0);
            if (c04500Kk2 != null) {
                c04pArr4[3] = new C04P("web", c04500Kk2.A00, null, (byte) 0);
            }
            c05y2.A0B(2, A022, new C02590Ca("iq", c04pArr4, c02590Ca4), anonymousClass253, 20000L);
        }
    }

    public void A09(Activity activity, C06C c06c, boolean z) {
        A0A(activity, false, null, z, c06c, null);
    }

    public final void A0A(Activity activity, boolean z, String str, boolean z2, C06C c06c, String str2) {
        InterfaceC40271rs interfaceC40271rs;
        Boolean bool;
        UserJid userJid = (UserJid) c06c.A03(UserJid.class);
        if (userJid != null) {
            if (z2) {
                interfaceC40271rs = new InterfaceC40271rs(activity, c06c, z, this.A06, this.A0D) { // from class: X.254
                    public final Context A00;
                    public final C018508q A01;
                    public final C018708s A02;
                    public final C06C A03;
                    public final boolean A04;

                    {
                        this.A00 = activity;
                        this.A03 = c06c;
                        this.A04 = z;
                        this.A01 = r4;
                        this.A02 = r5;
                    }

                    @Override // X.InterfaceC40271rs
                    public void AOE(boolean z3) {
                        if (z3) {
                            boolean z4 = this.A04;
                            int i = R.string.unblock_confirmation;
                            if (z4) {
                                i = R.string.block_confirmation;
                            }
                            this.A01.A0E(this.A00.getString(i, this.A02.A08(this.A03, false)), 1);
                        }
                    }
                };
            } else {
                interfaceC40271rs = new InterfaceC40271rs() { // from class: X.34X
                    @Override // X.InterfaceC40271rs
                    public final void AOE(boolean z3) {
                    }
                };
            }
            if (z && str != null) {
                bool = A01(userJid);
            } else {
                bool = null;
            }
            C461024y c461024y = new C461024y(z, userJid, str, bool, str2);
            this.A03.A01(activity, c461024y.A04, new C34W(this, activity, interfaceC40271rs, c461024y));
            return;
        }
        throw null;
    }

    public final void A0B(UserJid userJid, String str, boolean z) {
        A0C(userJid, z);
        C460724v c460724v = this.A0A;
        if (c460724v != null) {
            try {
                C0CD A0B = c460724v.A0B();
                if (z) {
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.put("jid", userJid.getRawString());
                    AnonymousClass061.A08(A0B, "wa_block_list", contentValues);
                } else {
                    AnonymousClass061.A09(A0B, "wa_block_list", "jid = ?", new String[]{userJid.getRawString()});
                }
                A0B.close();
                C000200d.A0i(this.A0F, "block_list_v2_dhash", str);
            } catch (IllegalArgumentException e) {
                StringBuilder sb = new StringBuilder("contact-mgr-db/unable to update blocked state  ");
                sb.append(userJid);
                sb.append(", ");
                sb.append(z);
                String obj = sb.toString();
                if (obj != null) {
                    Log.e(obj, e);
                } else {
                    throw null;
                }
            }
            this.A06.A02.post(new RunnableEBaseShape0S0200000_I0_0(this, userJid, 30));
            return;
        }
        throw null;
    }

    public synchronized void A0C(UserJid userJid, boolean z) {
        if (this.A07.A0E(C01C.A0k)) {
            C07A c07a = this.A0L;
            long A05 = this.A0E.A05();
            C05V c05v = c07a.A05;
            C0LW c0lw = (C0LW) C07A.A00(C05V.A00(c05v.A01, c05v.A00, userJid, true), A05, 58, c07a.A00);
            c0lw.A00 = z;
            this.A0H.A0k(c0lw, -1);
        }
    }

    public void A0D(InterfaceC04440Ke interfaceC04440Ke) {
        C02590Ca c02590Ca;
        AnonymousClass255 anonymousClass255 = new AnonymousClass255(this.A06, this.A04, this.A0K, this, this.A0F, interfaceC04440Ke);
        Log.i("getblocklistprotocolhelper/sendGetBlocklistRequest");
        C05Y c05y = anonymousClass255.A04;
        String A02 = c05y.A02();
        if (anonymousClass255.A06) {
            String string = anonymousClass255.A03.A00.getString("block_list_v2_dhash", null);
            c02590Ca = new C02590Ca("iq", new C04P[]{new C04P("to", C04260Jm.A00), new C04P("id", A02, null, (byte) 0), new C04P("type", "get", null, (byte) 0), new C04P("xmlns", "blocklist", null, (byte) 0)}, TextUtils.isEmpty(string) ? null : new C02590Ca("item", new C04P[]{new C04P("dhash", string, null, (byte) 0)}, null, null));
        } else {
            c02590Ca = new C02590Ca("iq", new C04P[]{new C04P("id", A02, null, (byte) 0), new C04P("xmlns", "jabber:iq:privacy", null, (byte) 0), new C04P("type", "get", null, (byte) 0)}, new C02590Ca("query", (C04P[]) null, new C02590Ca("list", new C04P[]{new C04P("name", "default", null, (byte) 0)}, null, null)));
        }
        c05y.A06(198, A02, c02590Ca, anonymousClass255, 0L);
    }

    public final void A0E(Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        this.A0B.A07(collection);
    }

    public synchronized void A0F(Set set, String str) {
        String str2;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.addAll(set);
        Set set2 = this.A0O;
        hashSet.removeAll(set2);
        hashSet2.addAll(set2);
        hashSet2.removeAll(set);
        hashSet3.addAll(hashSet);
        hashSet3.addAll(hashSet2);
        boolean z = this.A01;
        boolean A0G = A0G();
        this.A01 = true;
        if (!hashSet3.isEmpty()) {
            if (A0G && z) {
                StringBuilder sb = new StringBuilder();
                sb.append("old block list: ");
                sb.append(Arrays.toString(set2.toArray()));
                Log.e(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("new block list: ");
                sb2.append(Arrays.toString(set.toArray()));
                Log.e(sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append("added: ");
                sb3.append(Arrays.toString(hashSet.toArray()));
                Log.e(sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append("removed: ");
                sb4.append(Arrays.toString(hashSet2.toArray()));
                Log.e(sb4.toString());
                if (hashSet.isEmpty() || hashSet2.isEmpty()) {
                    str2 = !hashSet.isEmpty() ? "Added" : "Removed";
                } else {
                    str2 = "Added/Removed";
                }
                this.A04.A09("block list de-synchronization", str2, true);
            }
            this.A05.A00.post(new RunnableEBaseShape0S1300000_I0(this, set, str, hashSet3, 0));
        } else {
            this.A0F.A0D().putLong("block_list_receive_time", this.A0E.A05()).apply();
            if (!A0G) {
                this.A0B.A07(Collections.emptyList());
            }
        }
    }

    public synchronized boolean A0G() {
        return this.A0F.A00.getLong("block_list_receive_time", 0L) != 0;
    }

    public synchronized boolean A0H(UserJid userJid) {
        if (userJid == null) {
            return false;
        }
        return this.A0O.contains(userJid);
    }
}
