package X;

import java.util.LinkedList;

/* renamed from: X.1gS  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C33781gS implements AnonymousClass080 {
    public AbstractC016907v A00;
    public C09P A01;
    public C09P A02;
    public String A03;

    public static AbstractC016907v A00(C0AL c0al, C25311Ew c25311Ew, boolean z) {
        C33781gS c33781gS = new C33781gS();
        if (c0al.AQh() != C0AM.START_OBJECT) {
            c0al.AUv();
            c33781gS = null;
        } else {
            while (c0al.AGm() != C0AM.END_OBJECT) {
                String AQg = c0al.AQg();
                int A0C = AnonymousClass088.A0C(AQg, z);
                c0al.AGm();
                if (z) {
                    if (35 == A0C) {
                        c33781gS.A00 = (AbstractC016907v) C08i.A0A(c0al, c25311Ew);
                    } else if (33 == A0C) {
                        c33781gS.A03 = C08i.A0B(c0al);
                    } else if (38 == A0C) {
                        c33781gS.A02 = AnonymousClass088.A0b(c0al.AQi());
                    } else if (43 == A0C) {
                        c33781gS.A01 = AnonymousClass088.A0b(c0al.AQi());
                    }
                } else if ("child".equals(AQg)) {
                    c33781gS.A00 = (AbstractC016907v) C08i.A0A(c0al, c25311Ew);
                } else if ("id".equals(AQg)) {
                    c33781gS.A03 = C08i.A0B(c0al);
                } else if ("init_state".equals(AQg)) {
                    c33781gS.A02 = AnonymousClass088.A0b(c0al.AQi());
                } else if ("reduce".equals(AQg)) {
                    c33781gS.A01 = AnonymousClass088.A0b(c0al.AQi());
                }
                c0al.AUv();
            }
        }
        AbstractC016907v abstractC016907v = c33781gS.A00;
        if (abstractC016907v != null) {
            LinkedList linkedList = abstractC016907v.A06;
            if (linkedList == null) {
                linkedList = new LinkedList();
                abstractC016907v.A06 = linkedList;
            }
            linkedList.addFirst(c33781gS);
            c33781gS.A00 = null;
            return abstractC016907v;
        }
        throw new C018208m("Shadow component should never be a leaf node");
    }
}
