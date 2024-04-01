package X;

import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3M7  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3M7 extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C0HE A01;
    public final /* synthetic */ Jid A02;
    public final /* synthetic */ C2AK A03;
    public final /* synthetic */ C2UP A04;
    public final /* synthetic */ String A05;

    public /* synthetic */ C3M7(C2AK c2ak, C2UP c2up, String str, Jid jid, C0HE c0he, long j) {
        this.A03 = c2ak;
        this.A04 = c2up;
        this.A05 = str;
        this.A02 = jid;
        this.A01 = c0he;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<InterfaceC09100ce> arrayList;
        C2AK c2ak = this.A03;
        C2UP c2up = this.A04;
        String str = this.A05;
        Jid jid = this.A02;
        C0HE c0he = this.A01;
        long j = this.A00;
        int i = c2up.A00;
        if (i <= 0 && c2up.A01 <= 0) {
            c2ak.A0z.A0F(str, 400);
        } else {
            ArrayList arrayList2 = new ArrayList();
            if (c2ak.A09(str, jid, c0he, j)) {
                return;
            }
            C07610Yz c07610Yz = c2up.A02;
            List list = c07610Yz.A03;
            if (list == null) {
                list = new ArrayList();
                c07610Yz.A03 = list;
            }
            if (!list.isEmpty()) {
                arrayList = new ArrayList();
                List<String> list2 = c07610Yz.A03;
                if (list2 == null) {
                    list2 = new ArrayList();
                    c07610Yz.A03 = list2;
                }
                for (String str2 : list2) {
                    int hashCode = str2.hashCode();
                    if (hashCode != -1618876223) {
                        if (hashCode == -840272977) {
                            if (str2.equals("unread")) {
                                final C05M c05m = c2ak.A0O;
                                arrayList.add(new InterfaceC09100ce(c05m) { // from class: X.3g6
                                    public final C05M A00;

                                    @Override // X.InterfaceC09100ce
                                    public boolean A7m(AbstractC005302j abstractC005302j) {
                                        return false;
                                    }

                                    {
                                        this.A00 = c05m;
                                    }
                                });
                            } else {
                                C000200d.A13("app/xmpp/recv/webquery/filter/chats unsupported filter ", str2);
                            }
                        } else {
                            if (hashCode == 98629247 && str2.equals("group")) {
                                arrayList.add(new InterfaceC09100ce() { // from class: X.3Cg
                                    @Override // X.InterfaceC09100ce
                                    public boolean A7m(AbstractC005302j abstractC005302j) {
                                        return false;
                                    }
                                });
                            }
                            C000200d.A13("app/xmpp/recv/webquery/filter/chats unsupported filter ", str2);
                        }
                    } else if (str2.equals("broadcast")) {
                        arrayList.add(new InterfaceC09100ce() { // from class: X.39m
                            @Override // X.InterfaceC09100ce
                            public boolean A7m(AbstractC005302j abstractC005302j) {
                                return false;
                            }
                        });
                    } else {
                        C000200d.A13("app/xmpp/recv/webquery/filter/chats unsupported filter ", str2);
                    }
                }
            } else {
                arrayList = null;
            }
            if (c2ak.A09(str, jid, c0he, j)) {
                return;
            }
            ArrayList arrayList3 = new ArrayList();
            if (c07610Yz.A02()) {
                List<String> list3 = c07610Yz.A02;
                if (list3 == null) {
                    list3 = new ArrayList();
                    c07610Yz.A02 = list3;
                }
                for (String str3 : list3) {
                    C27641Oe A01 = c2ak.A0S.A01(Long.parseLong(str3));
                    if (A01 != null) {
                        arrayList3.add(A01.A02);
                    } else {
                        C000200d.A13("app/xmpp/recv/webquery/filter/non-existing label id ", str3);
                    }
                }
            }
            if (c2ak.A09(str, jid, c0he, j)) {
                return;
            }
            C0IU c0iu = new C0IU(c2ak.A0K);
            c0iu.A08 = c07610Yz.A01;
            c0iu.A03 = null;
            c0iu.A0C = arrayList3;
            c0iu.A00 = i - 1;
            int i2 = c2up.A01;
            c0iu.A01 = i2;
            c0iu.A04 = c2up.A03;
            List<AnonymousClass092> list4 = (List) c2ak.A0V.A07(c0iu, c0he).second;
            if (!list4.isEmpty()) {
                for (AnonymousClass092 anonymousClass092 : list4) {
                    if (arrayList != null && !arrayList.isEmpty()) {
                        for (InterfaceC09100ce interfaceC09100ce : arrayList) {
                            if (!interfaceC09100ce.A7m(anonymousClass092.A0n.A00)) {
                                break;
                            }
                        }
                    }
                    arrayList2.add(anonymousClass092);
                }
            }
            if (c2ak.A09(str, jid, c0he, j)) {
                return;
            }
            c2ak.A0w.A06(str, arrayList2, i2 != arrayList2.size() ? 24 : 19, null);
        }
        c2ak.A0s.A08(str, j, jid);
        c2ak.A1P.remove(str);
    }
}
