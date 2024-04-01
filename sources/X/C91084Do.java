package X;

import com.whatsapp.payments.ui.IndiaUpiResetPinActivity;

/* renamed from: X.4Do  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C91084Do implements InterfaceC03640Gm {
    public final /* synthetic */ IndiaUpiResetPinActivity A00;

    public C91084Do(IndiaUpiResetPinActivity indiaUpiResetPinActivity) {
        this.A00 = indiaUpiResetPinActivity;
    }

    @Override // X.InterfaceC03640Gm
    public void ANw(C28Q c28q) {
        IndiaUpiResetPinActivity indiaUpiResetPinActivity = this.A00;
        C014406v c014406v = indiaUpiResetPinActivity.A0G;
        StringBuilder sb = new StringBuilder("incorrect format retry: get-methods request error: ");
        sb.append(c28q);
        c014406v.A08(sb.toString(), null);
        indiaUpiResetPinActivity.A1g();
    }

    @Override // X.InterfaceC03640Gm
    public void AO1(C28Q c28q) {
        IndiaUpiResetPinActivity indiaUpiResetPinActivity = this.A00;
        C014406v c014406v = indiaUpiResetPinActivity.A0G;
        StringBuilder sb = new StringBuilder("incorrect format retry: get-methods response error: ");
        sb.append(c28q);
        c014406v.A08(sb.toString(), null);
        indiaUpiResetPinActivity.A1g();
    }

    @Override // X.InterfaceC03640Gm
    public void AO2(C468228k c468228k) {
        IndiaUpiResetPinActivity indiaUpiResetPinActivity = this.A00;
        InterfaceC002901k interfaceC002901k = ((AbstractActivityC92444Kp) indiaUpiResetPinActivity).A06;
        final C0DV c0dv = ((AbstractActivityC92484Li) indiaUpiResetPinActivity).A0C;
        final String str = indiaUpiResetPinActivity.A04.A07;
        final C78083jK c78083jK = new C78083jK(this);
        interfaceC002901k.ARy(new C0HS(c0dv, str, c78083jK) { // from class: X.4Dq
            public final C0DV A00;
            public final C78083jK A01;
            public final String A02;

            {
                this.A00 = c0dv;
                this.A02 = str;
                this.A01 = c78083jK;
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                C0DV c0dv2 = this.A00;
                c0dv2.A04();
                return c0dv2.A08.A08(this.A02);
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                C0N2 c0n2 = (C0N2) obj;
                C91084Do c91084Do = this.A01.A00;
                if (c0n2 != null) {
                    IndiaUpiResetPinActivity indiaUpiResetPinActivity2 = c91084Do.A00;
                    C0N6 c0n6 = (C0N6) c0n2;
                    indiaUpiResetPinActivity2.A04 = c0n6;
                    indiaUpiResetPinActivity2.A07.A00((C4IA) c0n6.A06, indiaUpiResetPinActivity2);
                    return;
                }
                c91084Do.A00.A1g();
            }
        }, new Void[0]);
    }
}
