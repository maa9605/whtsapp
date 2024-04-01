package X;

import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.1al  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30541al implements InterfaceC229514q, C14Z {
    public IAccountAccessor A00 = null;
    public Set A01 = null;
    public boolean A02 = false;
    public final InterfaceC30511ah A03;
    public final C228114c A04;
    public final /* synthetic */ AnonymousClass146 A05;

    public C30541al(AnonymousClass146 anonymousClass146, InterfaceC30511ah interfaceC30511ah, C228114c c228114c) {
        this.A05 = anonymousClass146;
        this.A03 = interfaceC30511ah;
        this.A04 = c228114c;
    }

    public final void A00(C30451ab c30451ab) {
        C39561qK c39561qK = (C39561qK) this.A05.A08.get(this.A04);
        C07K.A1F(c39561qK.A0C.A05);
        c39561qK.A04.A7H();
        c39561qK.AIv(c30451ab);
    }

    @Override // X.InterfaceC229514q
    public final void ANu(final C30451ab c30451ab) {
        this.A05.A05.post(new Runnable() { // from class: X.14R
            @Override // java.lang.Runnable
            public final void run() {
                IAccountAccessor iAccountAccessor;
                C30451ab c30451ab2 = c30451ab;
                if (c30451ab2.A02()) {
                    C30541al c30541al = C30541al.this;
                    c30541al.A02 = true;
                    InterfaceC30511ah interfaceC30511ah = c30541al.A03;
                    if (interfaceC30511ah.ARg()) {
                        if (1 == 0 || (iAccountAccessor = c30541al.A00) == null) {
                            return;
                        }
                        interfaceC30511ah.ACl(iAccountAccessor, c30541al.A01);
                        return;
                    }
                    try {
                        interfaceC30511ah.ACl(null, Collections.emptySet());
                        return;
                    } catch (SecurityException unused) {
                        ((C39561qK) c30541al.A05.A08.get(c30541al.A04)).AIv(new C30451ab(10));
                        return;
                    }
                }
                C30541al c30541al2 = C30541al.this;
                ((C39561qK) c30541al2.A05.A08.get(c30541al2.A04)).AIv(c30451ab2);
            }
        });
    }
}
