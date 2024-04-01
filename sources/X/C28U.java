package X;

import android.content.Context;

/* renamed from: X.28U  reason: invalid class name */
/* loaded from: classes2.dex */
public class C28U extends C28V {
    public final /* synthetic */ InterfaceC03640Gm A00;
    public final /* synthetic */ C28O A01;
    public final /* synthetic */ boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28U(C28O c28o, Context context, C018508q c018508q, C0E7 c0e7, C28S c28s, boolean z, InterfaceC03640Gm interfaceC03640Gm) {
        super(context, c018508q, c0e7, c28s);
        this.A01 = c28o;
        this.A02 = z;
        this.A00 = interfaceC03640Gm;
    }

    @Override // X.C28V
    public void A02(C28Q c28q) {
        A03(c28q);
    }

    @Override // X.C28V
    public void A03(C28Q c28q) {
        C28T AA9 = this.A01.A09.A03().AA9();
        if (AA9 != null) {
            AA9.AKq(c28q);
        }
        InterfaceC03640Gm interfaceC03640Gm = this.A00;
        if (interfaceC03640Gm != null) {
            interfaceC03640Gm.AO1(c28q);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0092, code lost:
        if ("true".equals(r1) != false) goto L47;
     */
    @Override // X.C28V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A04(X.C02590Ca r15) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28U.A04(X.0Ca):void");
    }
}
