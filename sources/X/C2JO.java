package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.2JO */
/* loaded from: classes2.dex */
public class C2JO extends C2JP {
    public final Activity A00;
    public final C455822q A01;
    public final C47212Ai A02;
    public final AnonymousClass229 A03;
    public final AnonymousClass228 A04;
    public final C2BP A05;
    public final InterfaceC002901k A06;

    @Override // X.C25f
    public String getId() {
        return "recent_gif_page";
    }

    public C2JO(Activity activity, C455822q c455822q, InterfaceC002901k interfaceC002901k, C47212Ai c47212Ai, C2BP c2bp, AnonymousClass228 anonymousClass228, LayoutInflater layoutInflater, InterfaceC48372Ez interfaceC48372Ez) {
        super(activity, layoutInflater, interfaceC48372Ez);
        this.A03 = new C2JL(this);
        this.A00 = activity;
        this.A01 = c455822q;
        this.A06 = interfaceC002901k;
        this.A02 = c47212Ai;
        this.A05 = c2bp;
        this.A04 = anonymousClass228;
    }

    public void A02(String str) {
        C3KX c3kx = (C3KX) A00();
        int i = -1;
        for (int i2 = 0; i2 < c3kx.A02.size(); i2++) {
            if (((C2BR) c3kx.A02.get(i2)).A04.equals(str)) {
                i = i2;
            }
        }
        if (i != -1) {
            List list = c3kx.A02;
            list.remove(list.get(i));
            ((AbstractC04890Mh) c3kx).A01.A00();
        }
    }

    @Override // X.C2JP, X.C25f
    public View AJ3(ViewGroup viewGroup, int i) {
        View AJ3 = super.AJ3(viewGroup, i);
        this.A04.A01(this.A03);
        return AJ3;
    }
}
