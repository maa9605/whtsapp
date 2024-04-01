package X;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.0sg */
/* loaded from: classes.dex */
public class C17790sg {
    public EnumC17700sX A00;
    public EnumC17780sf A01;
    public boolean A02 = false;

    public C17790sg(EnumC17700sX enumC17700sX, EnumC17780sf enumC17780sf) {
        this.A00 = enumC17700sX;
        this.A01 = enumC17780sf;
    }

    public static int A00(List list, int i, AbstractC29261Wb abstractC29261Wb) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        Object obj = list.get(i);
        InterfaceC18040t5 interfaceC18040t5 = ((C18050t6) abstractC29261Wb).A00;
        if (obj != interfaceC18040t5) {
            return -1;
        }
        for (Object obj2 : interfaceC18040t5.A8t()) {
            if (obj2 == abstractC29261Wb) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static List A01(C1WP c1wp) {
        ArrayList arrayList = new ArrayList();
        do {
            boolean A0C = c1wp.A0C();
            if (!A0C) {
                String str = null;
                if (!A0C) {
                    int i = c1wp.A01;
                    char charAt = c1wp.A03.charAt(i);
                    if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
                        int A04 = c1wp.A04();
                        while (true) {
                            if ((A04 < 65 || A04 > 90) && (A04 < 97 || A04 > 122)) {
                                break;
                            }
                            A04 = c1wp.A04();
                        }
                        str = c1wp.A03.substring(i, c1wp.A01);
                    } else {
                        c1wp.A01 = i;
                    }
                }
                if (str == null) {
                    break;
                }
                try {
                    arrayList.add(EnumC17700sX.valueOf(str));
                } catch (IllegalArgumentException unused) {
                }
            } else {
                break;
            }
        } while (c1wp.A0D());
        return arrayList;
    }

    public static boolean A02(C17740sb c17740sb, C17760sd c17760sd, int i, List list, int i2) {
        int i3 = i2;
        C17770se c17770se = (C17770se) c17760sd.A01.get(i);
        AbstractC29261Wb abstractC29261Wb = (AbstractC29261Wb) list.get(i2);
        if (A05(c17740sb, c17770se, abstractC29261Wb)) {
            C0sW c0sW = c17770se.A00;
            if (c0sW == C0sW.DESCENDANT) {
                if (i == 0) {
                    return true;
                }
                while (i3 > 0) {
                    i3--;
                    if (A02(c17740sb, c17760sd, i - 1, list, i3)) {
                        return true;
                    }
                }
                return false;
            } else if (c0sW == C0sW.CHILD) {
                return A02(c17740sb, c17760sd, i - 1, list, i2 - 1);
            } else {
                int A00 = A00(list, i2, abstractC29261Wb);
                if (A00 <= 0) {
                    return false;
                }
                return A03(c17740sb, c17760sd, i - 1, list, i3, (AbstractC29261Wb) ((C18050t6) abstractC29261Wb).A00.A8t().get(A00 - 1));
            }
        }
        return false;
    }

    public static boolean A03(C17740sb c17740sb, C17760sd c17760sd, int i, List list, int i2, AbstractC29261Wb abstractC29261Wb) {
        C17770se c17770se = (C17770se) c17760sd.A01.get(i);
        if (A05(c17740sb, c17770se, abstractC29261Wb)) {
            C0sW c0sW = c17770se.A00;
            if (c0sW == C0sW.DESCENDANT) {
                if (i == 0) {
                    return true;
                }
                while (i2 >= 0) {
                    if (A02(c17740sb, c17760sd, i - 1, list, i2)) {
                        return true;
                    }
                    i2--;
                }
                return false;
            } else if (c0sW == C0sW.CHILD) {
                return A02(c17740sb, c17760sd, i - 1, list, i2);
            } else {
                int A00 = A00(list, i2, abstractC29261Wb);
                if (A00 <= 0) {
                    return false;
                }
                return A03(c17740sb, c17760sd, i - 1, list, i2, (AbstractC29261Wb) ((C18050t6) abstractC29261Wb).A00.A8t().get(A00 - 1));
            }
        }
        return false;
    }

    public static boolean A04(C17740sb c17740sb, C17760sd c17760sd, AbstractC29261Wb abstractC29261Wb) {
        List list;
        ArrayList arrayList = new ArrayList();
        InterfaceC18040t5 interfaceC18040t5 = ((C18050t6) abstractC29261Wb).A00;
        while (true) {
            if (interfaceC18040t5 == null) {
                break;
            }
            arrayList.add(0, interfaceC18040t5);
            interfaceC18040t5 = ((C18050t6) interfaceC18040t5).A00;
        }
        int size = arrayList.size() - 1;
        List list2 = c17760sd.A01;
        if (list2 != null && list2.size() == 1) {
            return A05(c17740sb, (C17770se) c17760sd.A01.get(0), abstractC29261Wb);
        }
        return A03(c17740sb, c17760sd, (c17760sd.A01 != null ? list.size() : 0) - 1, arrayList, size, abstractC29261Wb);
    }

    public static boolean A05(C17740sb c17740sb, C17770se c17770se, AbstractC29261Wb abstractC29261Wb) {
        List list;
        String str = c17770se.A01;
        if (str == null || str.equals(abstractC29261Wb.A00().toLowerCase(Locale.US))) {
            List<C17670sT> list2 = c17770se.A02;
            if (list2 != null) {
                for (C17670sT c17670sT : list2) {
                    String str2 = c17670sT.A01;
                    int hashCode = str2.hashCode();
                    if (hashCode != 3355) {
                        if (hashCode != 94742904 || !str2.equals("class") || (list = abstractC29261Wb.A04) == null || !list.contains(c17670sT.A02)) {
                            return false;
                        }
                    } else if (!str2.equals("id") || !c17670sT.A02.equals(abstractC29261Wb.A03)) {
                        return false;
                    }
                }
            }
            List<InterfaceC17710sY> list3 = c17770se.A03;
            if (list3 != null) {
                for (InterfaceC17710sY interfaceC17710sY : list3) {
                    if (!interfaceC17710sY.AGM(c17740sb, abstractC29261Wb)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final C17750sc A06(C1WP c1wp) {
        char charAt;
        int A01;
        C17750sc c17750sc = new C17750sc();
        while (!c1wp.A0C()) {
            try {
                if (!c1wp.A0F("<!--") && !c1wp.A0F("-->")) {
                    if (c1wp.A0E('@')) {
                        String A0H = c1wp.A0H();
                        c1wp.A0B();
                        if (A0H != null) {
                            boolean z = this.A02;
                            int i = 0;
                            if (!z && A0H.equals("media")) {
                                List A012 = A01(c1wp);
                                if (c1wp.A0E('{')) {
                                    c1wp.A0B();
                                    EnumC17700sX enumC17700sX = this.A00;
                                    for (Object obj : A012) {
                                        if (obj != EnumC17700sX.all) {
                                            if (obj == enumC17700sX) {
                                            }
                                        }
                                        this.A02 = true;
                                        c17750sc.A01(A06(c1wp));
                                        this.A02 = false;
                                    }
                                    A06(c1wp);
                                    if (!c1wp.A0C() && !c1wp.A0E('}')) {
                                        throw new C17650sR("Invalid @media rule: expected '}' at end of rule set");
                                    }
                                } else {
                                    throw new C17650sR("Invalid @media rule: missing rule set");
                                }
                            } else if (!z && A0H.equals("import")) {
                                if (!c1wp.A0C()) {
                                    int i2 = c1wp.A01;
                                    if (c1wp.A0F("url(")) {
                                        c1wp.A0B();
                                        if (c1wp.A0G() == null) {
                                            StringBuilder sb = new StringBuilder();
                                            while (!c1wp.A0C() && (charAt = c1wp.A03.charAt(c1wp.A01)) != '\'' && charAt != '\"' && charAt != '(' && charAt != ')' && !C18210tM.A00(charAt) && !Character.isISOControl((int) charAt)) {
                                                int i3 = c1wp.A01 + 1;
                                                c1wp.A01 = i3;
                                                if (charAt == '\\') {
                                                    if (!c1wp.A0C()) {
                                                        String str = c1wp.A03;
                                                        c1wp.A01 = i3 + 1;
                                                        charAt = str.charAt(i3);
                                                        if (charAt != '\n' && charAt != '\r' && charAt != '\f') {
                                                            int A013 = C1WP.A01(charAt);
                                                            if (A013 != -1) {
                                                                int i4 = 1;
                                                                while (!c1wp.A0C() && (A01 = C1WP.A01(c1wp.A03.charAt(c1wp.A01))) != -1) {
                                                                    c1wp.A01++;
                                                                    A013 = (A013 << 4) + A01;
                                                                    i4++;
                                                                    if (i4 > 5) {
                                                                        break;
                                                                    }
                                                                }
                                                                sb.append((char) A013);
                                                            }
                                                        }
                                                    }
                                                }
                                                sb.append(charAt);
                                            }
                                            if (sb.length() == 0 || sb.toString() == null) {
                                                c1wp.A01 = i2;
                                            }
                                        }
                                        c1wp.A0B();
                                        if (!c1wp.A0C() && !c1wp.A0F(")")) {
                                            c1wp.A01 = i2;
                                        }
                                        c1wp.A0B();
                                        A01(c1wp);
                                        if (!c1wp.A0C() && !c1wp.A0E(';')) {
                                            throw new C17650sR("Invalid @media rule: expected '}' at end of rule set");
                                        }
                                    }
                                }
                                if (c1wp.A0G() == null) {
                                    throw new C17650sR("Invalid @import rule: expected string or url()");
                                }
                                c1wp.A0B();
                                A01(c1wp);
                                if (!c1wp.A0C()) {
                                    throw new C17650sR("Invalid @media rule: expected '}' at end of rule set");
                                }
                            } else {
                                Log.w("CSSParser", String.format("Ignoring @%s rule", A0H));
                                while (!c1wp.A0C()) {
                                    int intValue = c1wp.A08().intValue();
                                    if (intValue != 59) {
                                        if (intValue == 123) {
                                            i++;
                                        } else if (intValue == 125 && i > 0 && i - 1 == 0) {
                                            break;
                                        }
                                    } else if (i == 0) {
                                        break;
                                    }
                                }
                            }
                            c1wp.A0B();
                        } else {
                            throw new C17650sR("Invalid '@' rule");
                        }
                    } else {
                        List<C17760sd> A0I = c1wp.A0I();
                        if (A0I == null || A0I.isEmpty()) {
                            break;
                        } else if (c1wp.A0E('{')) {
                            c1wp.A0B();
                            C18020t3 c18020t3 = new C18020t3();
                            do {
                                String A0H2 = c1wp.A0H();
                                c1wp.A0B();
                                if (c1wp.A0E(':')) {
                                    c1wp.A0B();
                                    if (!c1wp.A0C()) {
                                        int i5 = c1wp.A01;
                                        int charAt2 = c1wp.A03.charAt(i5);
                                        int i6 = i5;
                                        while (charAt2 != -1 && charAt2 != 59 && charAt2 != 125 && charAt2 != 33 && charAt2 != 10 && charAt2 != 13) {
                                            if (!C18210tM.A00(charAt2)) {
                                                i6 = c1wp.A01 + 1;
                                            }
                                            charAt2 = c1wp.A04();
                                        }
                                        if (c1wp.A01 > i5) {
                                            String substring = c1wp.A03.substring(i5, i6);
                                            if (substring != null) {
                                                c1wp.A0B();
                                                if (c1wp.A0E('!')) {
                                                    c1wp.A0B();
                                                    if (c1wp.A0F("important")) {
                                                        c1wp.A0B();
                                                    } else {
                                                        throw new C17650sR("Malformed rule set: found unexpected '!'");
                                                    }
                                                }
                                                c1wp.A0E(';');
                                                C18230tO.A0H(c18020t3, A0H2, substring);
                                                c1wp.A0B();
                                                if (c1wp.A0C()) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            c1wp.A01 = i5;
                                        }
                                    }
                                    throw new C17650sR("Expected property value");
                                }
                                throw new C17650sR("Expected ':'");
                            } while (!c1wp.A0E('}'));
                            c1wp.A0B();
                            for (C17760sd c17760sd : A0I) {
                                c17750sc.A00(new C17730sa(c17760sd, c18020t3, this.A01));
                            }
                        } else {
                            throw new C17650sR("Malformed rule block: expected '{'");
                        }
                    }
                }
            } catch (C17650sR e) {
                StringBuilder A0P = C000200d.A0P("CSS parser terminated early due to error: ");
                A0P.append(e.getMessage());
                Log.e("CSSParser", A0P.toString());
            }
        }
        return c17750sc;
    }
}
