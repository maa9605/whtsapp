package X;

import java.util.Set;

/* renamed from: X.1z3  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44421z3 extends AnonymousClass064 {
    public static volatile C44421z3 A00;

    public static C44421z3 A00() {
        if (A00 == null) {
            synchronized (C44421z3.class) {
                if (A00 == null) {
                    A00 = new C44421z3();
                }
            }
        }
        return A00;
    }

    public void A02() {
        Set<InterfaceC44391yz> set = this.A00;
        synchronized (set) {
            for (InterfaceC44391yz interfaceC44391yz : set) {
                interfaceC44391yz.APV();
            }
        }
    }
}
