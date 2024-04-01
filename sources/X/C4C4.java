package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4C4 */
/* loaded from: classes3.dex */
public class C4C4 extends C48B {
    public final Context A00;
    public final C018508q A01;
    public final C02L A02;
    public final C0E7 A03;
    public final C013606n A04;
    public final C90564Bm A05;
    public final C28S A06;
    public final C0DV A07;
    public final C4CV A08;

    public C4C4(Context context, C018508q c018508q, C02L c02l, C0DV c0dv, C0E7 c0e7, C463026g c463026g, C013606n c013606n, C4CV c4cv, C28S c28s, C90564Bm c90564Bm, C3NV c3nv) {
        super(c463026g, c3nv);
        this.A00 = context;
        this.A01 = c018508q;
        this.A02 = c02l;
        this.A07 = c0dv;
        this.A03 = c0e7;
        this.A04 = c013606n;
        this.A08 = c4cv;
        this.A06 = c28s;
        this.A05 = c90564Bm;
    }

    public void A00(UserJid userJid, final AnonymousClass486 anonymousClass486) {
        C000200d.A0x("PAY: sendGetContactInfoForJid: ", userJid);
        this.A08.A03.A04();
        C3NV c3nv = super.A00;
        if (c3nv != null) {
            c3nv.A04("upi-get-vpa");
        }
        super.A01.A0F("get", new C02590Ca("account", new C04P[]{new C04P("action", "upi-get-vpa", null, (byte) 0), new C04P("user", userJid)}, null, null), new C91754Gd(this.A00, this.A01, this.A03, this.A06, c3nv) { // from class: X.4IK
            {
                C4C4.this = this;
            }

            @Override // X.C91754Gd, X.C28V
            public void A02(C28Q c28q) {
                super.A02(c28q);
                C4C4.this.A08.AG6(8, c28q);
                AnonymousClass486 anonymousClass4862 = anonymousClass486;
                if (anonymousClass4862 != null) {
                    anonymousClass4862.AJs(c28q);
                }
            }

            @Override // X.C91754Gd, X.C28V
            public void A03(C28Q c28q) {
                super.A03(c28q);
                C4C4.this.A08.AG6(8, c28q);
                AnonymousClass486 anonymousClass4862 = anonymousClass486;
                if (anonymousClass4862 != null) {
                    anonymousClass4862.AJs(new C28Q());
                }
            }

            @Override // X.C91754Gd, X.C28V
            public void A04(C02590Ca c02590Ca) {
                super.A04(c02590Ca);
                C4C4 c4c4 = C4C4.this;
                c4c4.A08.AG6(8, null);
                C02590Ca A0D = c02590Ca.A0D("account");
                if (A0D == null) {
                    AnonymousClass486 anonymousClass4862 = anonymousClass486;
                    if (anonymousClass4862 != null) {
                        anonymousClass4862.AJs(new C28Q());
                        return;
                    }
                    return;
                }
                C4GI c4gi = new C4GI();
                c4gi.A03(c4c4.A04, 0, A0D);
                if (((C0TN) c4gi).A03 == null) {
                    AnonymousClass486 anonymousClass4863 = anonymousClass486;
                    if (anonymousClass4863 != null) {
                        anonymousClass4863.AJs(new C28Q());
                        return;
                    }
                    return;
                }
                if (!c4gi.A03) {
                    C03560Ge A01 = c4c4.A07.A01();
                    A01.A03.ARy(new C68433Js(A01, c4gi), new Void[0]);
                } else {
                    C03560Ge A012 = c4c4.A07.A01();
                    A012.A03.ARy(new C68443Jt(A012, ((C0TN) c4gi).A03), new Void[0]);
                }
                AnonymousClass486 anonymousClass4864 = anonymousClass486;
                if (anonymousClass4864 != null) {
                    anonymousClass4864.AIz(c4gi);
                }
            }
        }, 0L);
    }
}
