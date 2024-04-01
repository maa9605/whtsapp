package X;

import com.whatsapp.mediacomposer.doodle.DoodleView;

/* renamed from: X.3H1  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3H1 implements InterfaceC63442zn {
    public final /* synthetic */ InterfaceC63432zm A00;
    public final /* synthetic */ InterfaceC48812Gv A01;

    public C3H1(InterfaceC48812Gv interfaceC48812Gv, InterfaceC63432zm interfaceC63432zm) {
        this.A01 = interfaceC48812Gv;
        this.A00 = interfaceC63432zm;
    }

    public void A00() {
        C2HF c2hf;
        C2HG c2hg;
        C2HG c2hg2;
        InterfaceC48812Gv interfaceC48812Gv = this.A01;
        if (interfaceC48812Gv != null && (c2hg = (c2hf = ((DoodleView) interfaceC48812Gv).A0I).A02) != null && c2hg == (c2hg2 = c2hf.A01)) {
            c2hf.A03.A00.add(new C67933Hk(c2hg2, c2hf.A00));
            c2hf.A02 = null;
            c2hf.A00 = null;
        }
        this.A00.AQ6();
    }
}
