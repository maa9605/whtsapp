package X;

import java.util.ArrayList;

/* renamed from: X.0YE  reason: invalid class name */
/* loaded from: classes.dex */
public class C0YE extends C0YF {
    public ArrayList A00 = new ArrayList();

    @Override // X.C0YF
    public void A07() {
        this.A00.clear();
        super.A07();
    }

    @Override // X.C0YF
    public void A0A(C12120it c12120it) {
        super.A0A(c12120it);
        int size = this.A00.size();
        for (int i = 0; i < size; i++) {
            ((C0YF) this.A00.get(i)).A0A(c12120it);
        }
    }

    public void A0J() {
        ArrayList arrayList = this.A00;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0YF c0yf = (C0YF) this.A00.get(i);
            if (c0yf instanceof C0YE) {
                ((C0YE) c0yf).A0J();
            }
        }
    }
}
