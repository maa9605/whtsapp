package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;

/* renamed from: X.2JN */
/* loaded from: classes2.dex */
public class C2JN extends AbstractC461425c {
    public final Activity A00;
    public final C01B A01;
    public final C02E A02;
    public final AnonymousClass011 A03;
    public final C455822q A04;
    public final AnonymousClass229 A05;
    public final AnonymousClass228 A06;
    public final C66543Bl A07;
    public final C2MQ A08;
    public final InterfaceC48372Ez A09;
    public final C2JO A0A;
    public final C85713w6 A0B;
    public final C02O A0C;
    public final C2JP[] A0D;

    public C2JN(Activity activity, C455822q c455822q, InterfaceC002901k interfaceC002901k, C47212Ai c47212Ai, C2BP c2bp, AnonymousClass011 anonymousClass011, C01B c01b, AnonymousClass227 anonymousClass227, AnonymousClass228 anonymousClass228, C02E c02e, C002301c c002301c, C2MQ c2mq, C02O c02o, ViewGroup viewGroup, AbstractC15200oF abstractC15200oF, InterfaceC48372Ez interfaceC48372Ez) {
        super(activity, c002301c, viewGroup, R.id.gif_pager, abstractC15200oF);
        this.A05 = new C2JM(this);
        this.A00 = activity;
        this.A04 = c455822q;
        this.A03 = anonymousClass011;
        this.A01 = c01b;
        this.A06 = anonymousClass228;
        this.A02 = c02e;
        this.A08 = c2mq;
        this.A09 = interfaceC48372Ez;
        this.A0C = c02o;
        LayoutInflater layoutInflater = super.A01;
        C2JO c2jo = new C2JO(activity, c455822q, interfaceC002901k, c47212Ai, c2bp, anonymousClass228, layoutInflater, interfaceC48372Ez);
        this.A0A = c2jo;
        C85713w6 c85713w6 = new C85713w6(activity, c455822q, interfaceC002901k, c47212Ai, anonymousClass011, c01b, anonymousClass227, anonymousClass228, layoutInflater, c02e, interfaceC48372Ez, c02o);
        this.A0B = c85713w6;
        C2JP[] c2jpArr = new C2JP[8];
        this.A0D = c2jpArr;
        c2jpArr[0] = c2jo;
        c2jpArr[1] = c85713w6;
        c2jpArr[2] = new C86823yP(activity, c455822q, anonymousClass011, c01b, layoutInflater, c02e, c2mq, interfaceC48372Ez, c02o);
        c2jpArr[3] = A04(R.string.gif_search_lol);
        this.A0D[4] = A04(R.string.gif_search_love);
        this.A0D[5] = A04(R.string.gif_search_sad);
        this.A0D[6] = A04(R.string.gif_search_happy);
        this.A0D[7] = A04(R.string.gif_search_dancing);
        A03(new C85693w4(c002301c, this.A0D));
        C66543Bl c66543Bl = new C66543Bl(super.A01, viewGroup, this.A0D);
        this.A07 = c66543Bl;
        InterfaceC70493Sm interfaceC70493Sm = super.A04;
        if (interfaceC70493Sm != null) {
            interfaceC70493Sm.ASt(null);
        }
        super.A04 = c66543Bl;
        c66543Bl.A0A = this;
        c66543Bl.AMi(A00());
        A02(0, true);
        anonymousClass228.A01(this.A05);
    }

    public final C86833yQ A04(int i) {
        Activity activity = this.A00;
        return new C86833yQ(activity, this.A04, this.A03, this.A01, super.A01, this.A02, this.A08, this.A09, this.A0C, activity.getString(i));
    }
}
