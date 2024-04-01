package X;

import android.app.Application;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.3It  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C68253It extends C0QY {
    public final C04880Mg A00;
    public final C04880Mg A01;
    public final C0HK A02;
    public final C41611uE A03;
    public final C50952Tz A04;
    public final C56202ms A05;
    public final C56262my A06;
    public final UserJid A07;

    public C68253It(Application application, UserJid userJid, C56262my c56262my, final C50332Rh c50332Rh, C41611uE c41611uE, C56202ms c56202ms) {
        super(application);
        this.A02 = new C0HK();
        this.A01 = new C04880Mg();
        this.A00 = new C04880Mg();
        this.A07 = userJid;
        this.A06 = c56262my;
        this.A03 = c41611uE;
        this.A05 = c56202ms;
        String valueOf = String.valueOf((int) ((C0QY) this).A00.getResources().getDimension(R.dimen.medium_thumbnail_size));
        ArrayList arrayList = new ArrayList();
        for (C50352Rj c50352Rj : c50332Rh.A02) {
            for (C50342Ri c50342Ri : c50352Rj.A01) {
                arrayList.add(c50342Ri.A00);
            }
        }
        this.A04 = new C50952Tz(userJid, arrayList, valueOf, valueOf);
        c56202ms.A00 = this.A02;
        C0HK c0hk = new C0HK();
        this.A00.A0C(c0hk, new InterfaceC05620Pl() { // from class: X.33o
            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                List list;
                List list2;
                List list3;
                C68253It c68253It = C68253It.this;
                C2U2 c2u2 = (C2U2) obj;
                int i = c2u2.A00;
                if (i == 0) {
                    c68253It.A00.A0B(1);
                } else if (i == 4 && ((list3 = c2u2.A01) == null || list3.size() == 0)) {
                } else {
                    if (c2u2.A00 == 1 && (list2 = c2u2.A01) != null && list2.size() == 0) {
                        c68253It.A00.A0B(1);
                        c68253It.A03.A01(c68253It.A04);
                    } else if (c2u2.A00 == 5 && ((list = c2u2.A01) == null || list.size() == 0)) {
                        c68253It.A00.A0B(3);
                    } else {
                        int i2 = c2u2.A00;
                        if (i2 == 2) {
                            c68253It.A00.A0B(4);
                        } else if (i2 == 6) {
                            c68253It.A00.A0B(5);
                        } else {
                            c68253It.A00.A0B(2);
                        }
                    }
                }
            }
        });
        this.A01.A0C(c0hk, new InterfaceC05620Pl() { // from class: X.33p
            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                C68253It c68253It = C68253It.this;
                C50332Rh c50332Rh2 = c50332Rh;
                C2U2 c2u2 = (C2U2) obj;
                C04880Mg c04880Mg = c68253It.A01;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (C50352Rj c50352Rj2 : c50332Rh2.A02) {
                    ArrayList arrayList4 = new ArrayList();
                    for (C50342Ri c50342Ri2 : c50352Rj2.A01) {
                        arrayList4.add(c50342Ri2.A00);
                    }
                    arrayList2.add(c50352Rj2.A00);
                    arrayList3.add(arrayList4);
                }
                List<C468628o> list = c2u2.A01;
                ArrayList arrayList5 = new ArrayList();
                if (list != null) {
                    for (C468628o c468628o : list) {
                        String str = c468628o.A09;
                        if (!linkedHashMap.containsKey(str)) {
                            linkedHashMap.put(str, c468628o);
                        }
                    }
                    for (int i = 0; i < arrayList2.size(); i++) {
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj2 : (List) arrayList3.get(i)) {
                            if (linkedHashMap.containsKey(obj2)) {
                                arrayList6.add(new C33O((C468628o) linkedHashMap.get(obj2)));
                            }
                        }
                        if (!arrayList6.isEmpty()) {
                            String str2 = (String) arrayList2.get(i);
                            if (!TextUtils.isEmpty(str2)) {
                                arrayList5.add(new C33N(str2));
                            }
                            arrayList5.addAll(arrayList6);
                        }
                    }
                }
                c04880Mg.A0A(arrayList5);
            }
        });
        c41611uE.A02(this.A04, c0hk);
    }
}
