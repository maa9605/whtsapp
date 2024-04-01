package X;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/* renamed from: X.2iG  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C54192iG {
    public final Set A00 = new HashSet();

    public void A00() {
        Set<InterfaceC70393Sc> set = this.A00;
        synchronized (set) {
            if (set.isEmpty()) {
                return;
            }
            LinkedList<InterfaceC70393Sc> linkedList = null;
            for (InterfaceC70393Sc interfaceC70393Sc : set) {
                if (interfaceC70393Sc.AH1()) {
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                    }
                    linkedList.add(interfaceC70393Sc);
                }
            }
            if (linkedList != null) {
                for (InterfaceC70393Sc interfaceC70393Sc2 : linkedList) {
                    set.remove(interfaceC70393Sc2);
                }
            }
        }
    }

    public void A01(InterfaceC70393Sc interfaceC70393Sc) {
        Set set = this.A00;
        synchronized (set) {
            set.add(interfaceC70393Sc);
        }
    }
}
