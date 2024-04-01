package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.4Gg */
/* loaded from: classes3.dex */
public class C91784Gg extends C28V {
    public final /* synthetic */ InterfaceC03640Gm A00;
    public final /* synthetic */ C48I A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91784Gg(C48I c48i, Context context, C018508q c018508q, C0E7 c0e7, C28S c28s, InterfaceC03640Gm interfaceC03640Gm) {
        super(context, c018508q, c0e7, c28s);
        this.A01 = c48i;
        this.A00 = interfaceC03640Gm;
    }

    @Override // X.C28V
    public void A02(C28Q c28q) {
        C28T AA9 = this.A01.A08.A03().AA9();
        if (AA9 != null) {
            AA9.reset();
        }
        InterfaceC03640Gm interfaceC03640Gm = this.A00;
        if (interfaceC03640Gm != null) {
            interfaceC03640Gm.ANw(c28q);
        }
    }

    @Override // X.C28V
    public void A03(C28Q c28q) {
        C28T AA9 = this.A01.A08.A03().AA9();
        if (AA9 != null) {
            AA9.reset();
        }
        InterfaceC03640Gm interfaceC03640Gm = this.A00;
        if (interfaceC03640Gm != null) {
            interfaceC03640Gm.AO1(c28q);
        }
    }

    @Override // X.C28V
    public void A04(C02590Ca c02590Ca) {
        C48I c48i = this.A01;
        c48i.A0A.ARy(new C0HS(c48i.A03, new RunnableC69163Nj(this)) { // from class: X.4CI
            public final C0C9 A00;
            public final Runnable A01;

            {
                this.A01 = r2;
                this.A00 = r1;
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                List A0b;
                synchronized (this) {
                    C0C9 c0c9 = this.A00;
                    c0c9.A0K(null, null);
                    synchronized (c0c9) {
                        C0DV c0dv = c0c9.A1N;
                        c0dv.A04();
                        C013306k c013306k = c0dv.A07;
                        synchronized (c013306k) {
                            c013306k.A08.A07(null, "failReceiverPendingTransactions/failPendingTransactions", null);
                            A0b = c013306k.A0b(false);
                        }
                        c0c9.A0e(A0b);
                    }
                }
                return null;
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                Runnable runnable = this.A01;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }, new Void[0]);
        InterfaceC03640Gm interfaceC03640Gm = this.A00;
        if (interfaceC03640Gm != null) {
            interfaceC03640Gm.AO2(new C77103hf());
        }
    }

    public void A05() {
        C48I c48i = this.A01;
        C0EU c0eu = c48i.A05;
        long j = c0eu.A04().getLong("payments_enabled_till", -1L);
        if (!(c48i instanceof C90644Bv)) {
            c48i.A07.A02(false, false);
        } else {
            c48i.A07.A02(true, false);
        }
        c0eu.A0F(j);
    }
}
