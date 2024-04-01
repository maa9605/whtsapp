package X;

import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1uL */
/* loaded from: classes2.dex */
public class C41681uL {
    public static volatile C41681uL A0F;
    public final AbstractC000600i A00;
    public final C01B A01;
    public final C0E6 A02;
    public final C010005b A03;
    public final C05W A04;
    public final AnonymousClass075 A05;
    public final C018708s A06;
    public final C0KQ A07;
    public final C000500h A08;
    public final C0GU A09;
    public final C451720r A0A;
    public final C0CB A0B;
    public final InterfaceC002901k A0C;
    public final C41981up A0D;
    public final C41991uq A0E;

    public C41681uL(AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, C41981up c41981up, C41991uq c41991uq, C01B c01b, C0E6 c0e6, C0GU c0gu, C05W c05w, C018708s c018708s, C010005b c010005b, C0CB c0cb, C451720r c451720r, AnonymousClass075 anonymousClass075, C000500h c000500h, C0KQ c0kq) {
        this.A00 = abstractC000600i;
        this.A0C = interfaceC002901k;
        this.A0D = c41981up;
        this.A0E = c41991uq;
        this.A01 = c01b;
        this.A02 = c0e6;
        this.A09 = c0gu;
        this.A04 = c05w;
        this.A06 = c018708s;
        this.A03 = c010005b;
        this.A0B = c0cb;
        this.A0A = c451720r;
        this.A05 = anonymousClass075;
        this.A08 = c000500h;
        this.A07 = c0kq;
    }

    public static C41681uL A00() {
        if (A0F == null) {
            synchronized (C0EG.class) {
                if (A0F == null) {
                    A0F = new C41681uL(AbstractC000600i.A00(), C002801j.A00(), C41981up.A00(), C41991uq.A00(), C01B.A00(), C0E6.A00(), C0GU.A00(), C05W.A00(), C018708s.A00(), C010005b.A07, C0CB.A00(), C451720r.A00(), AnonymousClass075.A00(), C000500h.A00(), C0KQ.A00());
                }
            }
        }
        return A0F;
    }

    public String A01() {
        StringBuilder sb = new StringBuilder();
        int i = this.A07.A02().getInt("contact_version", 0);
        C000200d.A0q("contact-sync-prefs/getversion=", i);
        sb.append(i);
        sb.append(this.A08.A00.getString("web_contact_checksum", "unset"));
        return sb.toString();
    }

    public List A02(List list) {
        String str;
        int i;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C06C c06c = (C06C) it.next();
            if (c06c != null) {
                if (c06c.A03(AbstractC005302j.class) == null) {
                    if (c06c.A02() != null) {
                        StringBuilder sb = new StringBuilder("Contact with jid but not chat jid ");
                        sb.append(c06c);
                        Log.w(sb.toString());
                    }
                } else {
                    boolean z = false;
                    if (c06c.A0B()) {
                        if (this.A06 != null) {
                            str = c06c.A05();
                            i = c06c.A03;
                            C018108l A00 = this.A05.A00((UserJid) c06c.A03(UserJid.class));
                            if (A00 != null && A00.A01()) {
                                z = true;
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        str = (TextUtils.isEmpty(c06c.A0H) || c06c.A08 == null) ? null : c06c.A0H;
                        i = -1;
                    }
                    Jid A03 = c06c.A03(AbstractC005302j.class);
                    if (A03 != null) {
                        AbstractC005302j abstractC005302j = (AbstractC005302j) A03;
                        arrayList.add(new C27I(this.A00, this.A01, abstractC005302j, TextUtils.isEmpty(c06c.A0F) ? null : c06c.A0F, str, i, z, c06c.A0X, c06c.A0O, this.A0B.A07(abstractC005302j).A0G));
                    } else {
                        throw null;
                    }
                }
            }
        }
        return arrayList;
    }

    public void A03(C06C c06c) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c06c);
        A05(arrayList);
    }

    public void A04(AbstractC005302j abstractC005302j) {
        C06C A09;
        if (this.A0D.A04() && (A09 = this.A04.A09(abstractC005302j)) != null) {
            A03(A09);
        }
    }

    public void A05(List list) {
        if (!this.A0D.A04() || list.size() == 0) {
            return;
        }
        this.A0C.AS1(new RunnableEBaseShape0S1200000_I0(this, null, list, 13));
    }
}
