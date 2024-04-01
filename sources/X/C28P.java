package X;

/* renamed from: X.28P */
/* loaded from: classes2.dex */
public class C28P implements InterfaceC03640Gm {
    public static volatile C28P A0A;
    public int A00;
    public int A01;
    public final AnonymousClass012 A02;
    public final C013306k A03;
    public final C0GZ A04;
    public final C0EU A05;
    public final C0DW A06;
    public final C0DV A07;
    public final C014406v A08 = C014406v.A00("PaymentUnfinishedTransactionsSyncer", "network", "COMMON");
    public final InterfaceC002901k A09;

    public C28P(AnonymousClass012 anonymousClass012, InterfaceC002901k interfaceC002901k, C0DV c0dv, C0EU c0eu, C0GZ c0gz, C0DW c0dw, C013306k c013306k) {
        this.A02 = anonymousClass012;
        this.A09 = interfaceC002901k;
        this.A07 = c0dv;
        this.A05 = c0eu;
        this.A04 = c0gz;
        this.A06 = c0dw;
        this.A03 = c013306k;
    }

    public static C28P A00() {
        if (A0A == null) {
            synchronized (C28P.class) {
                if (A0A == null) {
                    A0A = new C28P(AnonymousClass012.A00(), C002801j.A00(), C0DV.A00(), C0EU.A00(), C0GZ.A00(), C0DW.A00(), C013306k.A07());
                }
            }
        }
        return A0A;
    }

    public synchronized void A01(C28R c28r) {
        if (this.A06.A02() && this.A04.A09()) {
            this.A09.AS1(new RunnableEBaseShape3S0200000_I0_3(this, c28r, 31));
        } else {
            this.A08.A07(null, "skipped as account setup is incomplete.", null);
        }
    }

    @Override // X.InterfaceC03640Gm
    public void ANw(C28Q c28q) {
        C014406v c014406v = this.A08;
        StringBuilder sb = new StringBuilder("onRequestError: ");
        sb.append(c28q);
        c014406v.A04(sb.toString());
        C28T AA9 = this.A07.A03().AA9();
        if (AA9 != null) {
            AA9.AKp(c28q);
        }
    }

    @Override // X.InterfaceC03640Gm
    public void AO1(C28Q c28q) {
        C014406v c014406v = this.A08;
        StringBuilder sb = new StringBuilder("onResponseError: ");
        sb.append(c28q);
        c014406v.A04(sb.toString());
        C28T AA9 = this.A07.A03().AA9();
        if (AA9 != null) {
            AA9.AKp(c28q);
        }
    }

    @Override // X.InterfaceC03640Gm
    public void AO2(C468228k c468228k) {
        C28T AA9 = this.A07.A03().AA9();
        if (AA9 != null) {
            AA9.AKp(null);
        }
        if (c468228k.A02) {
            int i = this.A00 + 1;
            this.A00 = i;
            C014406v c014406v = this.A08;
            StringBuilder A0P = C000200d.A0P("finished syncing ");
            A0P.append(i);
            A0P.append(" transactions; total to sync: ");
            A0P.append(this.A01);
            c014406v.A07(null, A0P.toString(), null);
            if (this.A01 == this.A00) {
                long A05 = this.A02.A05();
                this.A05.A04().edit().putLong("payments_pending_transactions_last_sync_time", A05).apply();
                StringBuilder sb = new StringBuilder("updatePendingTransactionsLastSyncTimeMilli to: ");
                sb.append(A05);
                c014406v.A07(null, sb.toString(), null);
            }
        }
    }
}
