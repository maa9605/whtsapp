package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3w6 */
/* loaded from: classes2.dex */
public class C85713w6 extends C2JP {
    public final Activity A00;
    public final C01B A01;
    public final C02E A02;
    public final AnonymousClass011 A03;
    public final C455822q A04;
    public final C47212Ai A05;
    public final AnonymousClass229 A06;
    public final AnonymousClass228 A07;
    public final AnonymousClass227 A08;
    public final C02O A09;
    public final InterfaceC002901k A0A;

    @Override // X.C25f
    public String getId() {
        return "gif_starred_page";
    }

    public C85713w6(Activity activity, C455822q c455822q, InterfaceC002901k interfaceC002901k, C47212Ai c47212Ai, AnonymousClass011 anonymousClass011, C01B c01b, AnonymousClass227 anonymousClass227, AnonymousClass228 anonymousClass228, LayoutInflater layoutInflater, C02E c02e, InterfaceC48372Ez interfaceC48372Ez, C02O c02o) {
        super(activity, layoutInflater, interfaceC48372Ez);
        this.A06 = new C78753kT(this);
        this.A00 = activity;
        this.A04 = c455822q;
        this.A0A = interfaceC002901k;
        this.A05 = c47212Ai;
        this.A03 = anonymousClass011;
        this.A01 = c01b;
        this.A08 = anonymousClass227;
        this.A07 = anonymousClass228;
        this.A02 = c02e;
        this.A09 = c02o;
    }

    @Override // X.C2JP, X.C25f
    public View AJ3(ViewGroup viewGroup, int i) {
        View AJ3 = super.AJ3(viewGroup, i);
        this.A07.A01(this.A06);
        return AJ3;
    }
}
