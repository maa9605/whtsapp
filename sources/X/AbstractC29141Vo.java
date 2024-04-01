package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Vo  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC29141Vo implements InterfaceC16740qw {
    public InterfaceC16770qz A00;
    public AbstractC16800r2 A01;
    public Object A02;
    public final List A03 = new ArrayList();

    public abstract boolean A01(C0OL workSpec);

    public abstract boolean A02(Object currentValue);

    public AbstractC29141Vo(AbstractC16800r2 tracker) {
        this.A01 = tracker;
    }

    public final void A00(InterfaceC16770qz callback, Object currentValue) {
        List<String> list = this.A03;
        if (list.isEmpty() || callback == null) {
            return;
        }
        if (currentValue != null && !A02(currentValue)) {
            C29131Vn c29131Vn = (C29131Vn) callback;
            synchronized (c29131Vn.A01) {
                ArrayList arrayList = new ArrayList();
                for (String str : list) {
                    if (c29131Vn.A02(str)) {
                        AbstractC16430qO.A00().A02(C29131Vn.A03, String.format("Constraints met for %s", str), new Throwable[0]);
                        arrayList.add(str);
                    }
                }
                InterfaceC16760qy interfaceC16760qy = c29131Vn.A00;
                if (interfaceC16760qy != null) {
                    interfaceC16760qy.AH3(arrayList);
                }
            }
            return;
        }
        C29131Vn c29131Vn2 = (C29131Vn) callback;
        synchronized (c29131Vn2.A01) {
            InterfaceC16760qy interfaceC16760qy2 = c29131Vn2.A00;
            if (interfaceC16760qy2 != null) {
                interfaceC16760qy2.AH4(list);
            }
        }
    }

    @Override // X.InterfaceC16740qw
    public void AIy(Object newValue) {
        this.A02 = newValue;
        A00(this.A00, newValue);
    }
}
