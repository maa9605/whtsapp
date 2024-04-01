package X;

import android.app.Application;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Il */
/* loaded from: classes2.dex */
public class C68193Il extends C0QY {
    public final C0HK A00;
    public final C06K A01;
    public final AbstractC09240cu A02;
    public final C06M A03;
    public final AnonymousClass075 A04;
    public final UserJid A05;
    public final InterfaceC002901k A06;

    public C68193Il(InterfaceC002901k interfaceC002901k, Application application, AnonymousClass075 anonymousClass075, C06K c06k, C06M c06m, UserJid userJid) {
        super(application);
        this.A00 = new C0HK();
        AbstractC09240cu abstractC09240cu = new AbstractC09240cu() { // from class: X.32a
            {
                C68193Il.this = this;
            }

            @Override // X.AbstractC09240cu
            public void A01(UserJid userJid2) {
                C68193Il c68193Il = C68193Il.this;
                if (c68193Il.A05.equals(userJid2)) {
                    c68193Il.A03();
                }
            }
        };
        this.A02 = abstractC09240cu;
        this.A06 = interfaceC002901k;
        this.A04 = anonymousClass075;
        this.A01 = c06k;
        this.A03 = c06m;
        this.A05 = userJid;
        c06m.A01(abstractC09240cu);
    }

    @Override // X.C0MU
    public void A01() {
        this.A03.A00(this.A02);
    }

    public String A02(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = (int) (i + ((C49382Kc) it.next()).A00);
        }
        if (i == 0) {
            return "";
        }
        if (i <= 999) {
            return String.valueOf(i);
        }
        return ((C0QY) this).A00.getString(R.string.cart_max_total_quantity);
    }

    public void A03() {
        this.A06.AS1(new RunnableEBaseShape8S0100000_I1_0(this, 6));
    }
}
