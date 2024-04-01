package com.whatsapp.report;

import X.C000500h;
import X.C001200o;
import X.C018508q;
import X.C0HK;
import X.C0QY;
import X.C2E3;
import X.C2EA;
import X.C2EB;
import X.C53782hV;
import X.C53792hW;
import X.C53902hh;
import X.C53912hi;
import X.C53922hj;
import X.C53932hk;
import X.InterfaceC002901k;

/* loaded from: classes2.dex */
public class BusinessActivityReportViewModel extends C0QY {
    public final C0HK A00;
    public final C0HK A01;
    public final C0HK A02;
    public final C018508q A03;
    public final C000500h A04;
    public final C2EA A05;
    public final C2E3 A06;
    public final C53932hk A07;
    public final C53792hW A08;
    public final C53912hi A09;
    public final C2EB A0A;
    public final C53902hh A0B;
    public final C53782hV A0C;
    public final C53922hj A0D;
    public final InterfaceC002901k A0E;

    public BusinessActivityReportViewModel(C018508q c018508q, C001200o c001200o, InterfaceC002901k interfaceC002901k, C000500h c000500h, C2EA c2ea, C2E3 c2e3, C53782hV c53782hV, C53902hh c53902hh, C53922hj c53922hj) {
        super(c001200o.A00);
        this.A02 = new C0HK();
        this.A01 = new C0HK(0);
        this.A00 = new C0HK();
        C53932hk c53932hk = new C53932hk(this);
        this.A07 = c53932hk;
        C53792hW c53792hW = new C53792hW(this);
        this.A08 = c53792hW;
        C53912hi c53912hi = new C53912hi(this);
        this.A09 = c53912hi;
        C2EB c2eb = new C2EB(this);
        this.A0A = c2eb;
        this.A03 = c018508q;
        this.A0E = interfaceC002901k;
        this.A04 = c000500h;
        this.A05 = c2ea;
        this.A0C = c53782hV;
        this.A06 = c2e3;
        this.A0B = c53902hh;
        this.A0D = c53922hj;
        c53922hj.A00 = c53932hk;
        c53902hh.A00 = c53912hi;
        c53782hV.A00 = c53792hW;
        c2e3.A00 = c2eb;
    }

    public static void A00(BusinessActivityReportViewModel businessActivityReportViewModel) {
        businessActivityReportViewModel.A02.A0A(0);
        businessActivityReportViewModel.A05.A03();
    }

    @Override // X.C0MU
    public void A01() {
        this.A0C.A00 = null;
        this.A0B.A00 = null;
        this.A0D.A00 = null;
        this.A06.A00 = null;
    }

    public long A02() {
        return this.A04.A00.getLong("business_activity_report_timestamp", -1L);
    }
}
