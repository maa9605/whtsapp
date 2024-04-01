package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.1Er */
/* loaded from: classes.dex */
public abstract class AbstractC25261Er extends AbstractC39021pR implements InterfaceC18040t5, InterfaceC18030t4 {
    public List A01 = new ArrayList();
    public Set A02 = null;
    public String A00 = null;
    public Set A04 = null;
    public Set A03 = null;

    @Override // X.InterfaceC18030t4
    public Set ADQ() {
        return null;
    }

    @Override // X.InterfaceC18030t4
    public void ATx(Set set) {
    }

    public void A58(C18050t6 c18050t6) {
        this.A01.add(c18050t6);
    }

    @Override // X.InterfaceC18040t5
    public List A8t() {
        return this.A01;
    }

    @Override // X.InterfaceC18030t4
    public String ACn() {
        return this.A00;
    }

    @Override // X.InterfaceC18030t4
    public Set ACo() {
        return this.A02;
    }

    @Override // X.InterfaceC18030t4
    public Set ACp() {
        return this.A03;
    }

    @Override // X.InterfaceC18030t4
    public Set ACq() {
        return this.A04;
    }

    @Override // X.InterfaceC18030t4
    public void ATl(String str) {
        this.A00 = str;
    }

    @Override // X.InterfaceC18030t4
    public void ATm(Set set) {
        this.A02 = set;
    }

    @Override // X.InterfaceC18030t4
    public void ATn(Set set) {
        this.A03 = set;
    }

    @Override // X.InterfaceC18030t4
    public void ATo(Set set) {
        this.A04 = set;
    }
}
