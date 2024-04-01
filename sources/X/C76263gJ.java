package X;

import com.whatsapp.util.Log;

/* renamed from: X.3gJ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C76263gJ extends C0MU {
    public C0HL A00;
    public final C07750Zs A05;
    public final C001200o A06;
    public final C42291vV A08;
    public final C0ER A09;
    public final InterfaceC002901k A0A;
    public final C3MM A07 = new C3MM() { // from class: X.3gI
        @Override // X.C3MM
        public void AIk() {
            Log.i("GoogleMigrateImporterViewModel/onComplete");
            C76263gJ.this.A02(3);
        }

        @Override // X.C3MM
        public void AJp(int i) {
            C76263gJ.this.A02(4);
        }

        @Override // X.C3MM
        public void ANO(int i, int i2) {
            C000200d.A0t("GoogleMigrateImporterViewModel/onProgress/processed=", i, "total=", i2);
            C76263gJ.this.A03.A0A(Integer.valueOf((int) ((i * 100.0f) / i2)));
        }
    };
    public C0HK A03 = new C0HK();
    public C0HK A01 = new C0HK();
    public C0HK A04 = new C0HK();
    public C0HK A02 = new C0HK();

    public C76263gJ(C07750Zs c07750Zs, C001200o c001200o, InterfaceC002901k interfaceC002901k, C0ER c0er, C02F c02f, C42291vV c42291vV) {
        this.A06 = c001200o;
        this.A0A = interfaceC002901k;
        this.A09 = c0er;
        this.A05 = c07750Zs;
        this.A08 = c42291vV;
        this.A00 = c07750Zs.A01("current_screen", false, null);
        c42291vV.A00(this.A07);
        if (this.A00.A01() == null) {
            Log.i("GoogleMigrateImporterViewModel/current screen is null");
            A02(c02f.A06() ? 2 : 0);
        }
    }

    @Override // X.C0MU
    public void A01() {
        this.A08.A01(this.A07);
    }

    public void A02(int i) {
        this.A0A.AS1(new RunnableEBaseShape1S0101000_I1(this, i, 4));
    }
}
