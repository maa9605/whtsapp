package X;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.1au  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30631au extends C14I {
    public final Map A00;
    public final /* synthetic */ C30611as A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30631au(C30611as c30611as, Map map) {
        super(c30611as);
        this.A01 = c30611as;
        this.A00 = map;
    }

    @Override // X.C14I
    public final void A00() {
        final C30611as c30611as = this.A01;
        AnonymousClass154 anonymousClass154 = new AnonymousClass154(c30611as.A0E);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Map map = this.A00;
        for (InterfaceC30511ah interfaceC30511ah : map.keySet()) {
            if (!interfaceC30511ah.ARf() || ((C30621at) map.get(interfaceC30511ah)).A02) {
                arrayList2.add(interfaceC30511ah);
            } else {
                arrayList.add(interfaceC30511ah);
            }
        }
        int i = -1;
        int i2 = 0;
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                i = anonymousClass154.A00(c30611as.A0C, (InterfaceC30511ah) obj);
                if (i == 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList.size();
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                i = anonymousClass154.A00(c30611as.A0C, (InterfaceC30511ah) obj2);
                if (i != 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            final C30451ab c30451ab = new C30451ab(i, null);
            C39591qN c39591qN = c30611as.A0G;
            C14L c14l = new C14L(c30611as) { // from class: X.1av
                @Override // X.C14L
                public final void A00() {
                    C30631au.this.A01.A03(c30451ab);
                }
            };
            HandlerC30761b8 handlerC30761b8 = c39591qN.A06;
            handlerC30761b8.sendMessage(handlerC30761b8.obtainMessage(1, c14l));
            return;
        }
        if (c30611as.A08) {
            c30611as.A05.connect();
        }
        for (InterfaceC30511ah interfaceC30511ah2 : map.keySet()) {
            final InterfaceC229514q interfaceC229514q = (InterfaceC229514q) map.get(interfaceC30511ah2);
            if (!interfaceC30511ah2.ARf() || anonymousClass154.A00(c30611as.A0C, interfaceC30511ah2) == 0) {
                interfaceC30511ah2.A6Q(interfaceC229514q);
            } else {
                C39591qN c39591qN2 = c30611as.A0G;
                C14L c14l2 = new C14L(c30611as) { // from class: X.1aw
                    @Override // X.C14L
                    public final void A00() {
                        interfaceC229514q.ANu(new C30451ab(16, null));
                    }
                };
                HandlerC30761b8 handlerC30761b82 = c39591qN2.A06;
                handlerC30761b82.sendMessage(handlerC30761b82.obtainMessage(1, c14l2));
            }
        }
    }
}
