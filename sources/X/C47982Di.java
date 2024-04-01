package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Di  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47982Di {
    public List A00;

    public C47982Di(InterfaceC47992Dj... interfaceC47992DjArr) {
        this.A00 = new ArrayList(interfaceC47992DjArr.length);
        for (InterfaceC47992Dj interfaceC47992Dj : interfaceC47992DjArr) {
            if (interfaceC47992Dj != null) {
                this.A00.add(interfaceC47992Dj);
            }
        }
    }

    public boolean A00() {
        for (InterfaceC47992Dj interfaceC47992Dj : this.A00) {
            if (!interfaceC47992Dj.isValid()) {
                return false;
            }
        }
        return true;
    }
}
