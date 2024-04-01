package X;

import java.util.Collection;

/* renamed from: X.2MJ */
/* loaded from: classes2.dex */
public class C2MJ {
    public InterfaceC61502wG A00;
    public boolean A01;
    public boolean A02 = false;
    public final C2Qo A03;

    public C2MJ(C2Qo c2Qo) {
        this.A03 = c2Qo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.3C5, X.0HS] */
    public C61512wH A00(String str, boolean z, boolean z2) {
        C61512wH c61512wH = new C61512wH();
        if (this.A02) {
            C2Qo c2Qo = this.A03;
            C3C2 c3c2 = new C3C2(c61512wH);
            if (c2Qo != null) {
                C000700j.A01();
                C3C5 c3c5 = c2Qo.A00;
                if (c3c5 != null) {
                    c3c5.A05(true);
                }
                ?? r4 = new C0HS(c3c2, c2Qo.A09, z, z2) { // from class: X.3C5
                    public final int A00 = 200;
                    public final C3C2 A01;
                    public final InterfaceC42341va A02;
                    public final boolean A03;
                    public final boolean A04;

                    {
                        this.A01 = c3c2;
                        this.A02 = r4;
                        this.A03 = z;
                        this.A04 = z2;
                    }

                    @Override // X.C0HS
                    public Object A07(Object[] objArr) {
                        String[] strArr = (String[]) objArr;
                        if (strArr != null) {
                            C000700j.A06(strArr.length == 1);
                            return this.A02.A7l(strArr[0], this.A00, this.A03, this.A04);
                        }
                        throw null;
                    }

                    @Override // X.C0HS
                    public void A09(Object obj) {
                        Collection collection = (Collection) obj;
                        C2Qo c2Qo2 = C2Qo.this;
                        if (c2Qo2.A00 == this) {
                            c2Qo2.A00 = null;
                        }
                        if (!A04()) {
                            C61512wH c61512wH2 = this.A01.A00;
                            if (c61512wH2 != null) {
                                C000700j.A01();
                                if (collection != null) {
                                    c61512wH2.A01.addAll(collection);
                                }
                                C2IR c2ir = c61512wH2.A00;
                                if (c2ir != null) {
                                    c2ir.AOG(c61512wH2);
                                    return;
                                }
                                return;
                            }
                            throw null;
                        }
                    }
                };
                c2Qo.A00 = r4;
                c2Qo.A0A.ARy(r4, str);
                return c61512wH;
            }
            throw null;
        }
        return c61512wH;
    }

    public synchronized void A01() {
        if (this.A01) {
            return;
        }
        this.A01 = true;
        final C2Qo c2Qo = this.A03;
        final C3C3 c3c3 = new C3C3(this);
        if (c2Qo != null) {
            C000700j.A01();
            c2Qo.A0A.ARy(new C0HS() { // from class: X.3C4
                @Override // X.C0HS
                public void A03(Object[] objArr) {
                    boolean booleanValue = ((Boolean[]) objArr)[0].booleanValue();
                    c2Qo.A09.ATC(booleanValue);
                    c3c3.A00(booleanValue);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:524:0x054a  */
                /* JADX WARN: Type inference failed for: r1v37, types: [java.util.zip.GZIPInputStream] */
                @Override // X.C0HS
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.lang.Object A07(java.lang.Object[] r39) {
                    /*
                        Method dump skipped, instructions count: 1373
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C3C4.A07(java.lang.Object[]):java.lang.Object");
                }

                @Override // X.C0HS
                public void A08() {
                    c3c3.A00(c2Qo.A01);
                }

                @Override // X.C0HS
                public void A09(Object obj) {
                    InterfaceC42341va interfaceC42341va = c2Qo.A09;
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    interfaceC42341va.ATC(booleanValue);
                    c3c3.A00(booleanValue);
                }
            }, new String[0]);
            return;
        }
        throw null;
    }
}
