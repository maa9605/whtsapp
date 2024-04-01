package X;

import android.text.TextUtils;
import java.util.Collections;
import java.util.LinkedHashSet;

/* renamed from: X.0Gn */
/* loaded from: classes.dex */
public class C03650Gn {
    public static C03650Gn[] A0C;
    public static final C03650Gn A0D;
    public static final C03650Gn A0E;
    public static final C03650Gn A0F;
    public int A00;
    public int A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public int[] A06;
    public C03680Gq[] A07;
    public C03680Gq[] A08;
    public final InterfaceC013706o A09;
    public final LinkedHashSet A0A;
    public final boolean A0B;

    static {
        InterfaceC013706o interfaceC013706o = C013806p.A06;
        A0F = new C03650Gn("UNSET", "UNSET", false, 0, 0, interfaceC013706o, new LinkedHashSet(Collections.singletonList(interfaceC013706o)), false, null, null, null, false);
        InterfaceC013706o interfaceC013706o2 = C013806p.A05;
        new int[1][0] = 2;
        A0E = new C03650Gn("IN", "91", true, 3, 3, interfaceC013706o2, new LinkedHashSet(Collections.singletonList(interfaceC013706o2)), true, new int[]{2}, new C03680Gq[]{new C03680Gq("tos_no_wallet", "1", false), new C03680Gq("add_bank", "1", false), new C03680Gq("2fa", "1", false)}, null, true);
        InterfaceC013706o interfaceC013706o3 = C013806p.A04;
        int[] iArr = {1, 4, 6};
        C03650Gn c03650Gn = new C03650Gn("BR", "55", true, 1, 1, interfaceC013706o3, new LinkedHashSet(Collections.singletonList(interfaceC013706o3)), true, new int[]{1, 4, 6}, new C03680Gq[]{new C03680Gq("tos_no_wallet", "1", false), new C03680Gq("add_card", "1", false)}, new C03680Gq[]{new C03680Gq("tos_merchant", "1", false), new C03680Gq("add_business", "1", true)}, false);
        A0D = c03650Gn;
        A0C = new C03650Gn[]{A0F, A0E, c03650Gn};
    }

    public C03650Gn(String str, String str2, boolean z, int i, int i2, InterfaceC013706o interfaceC013706o, LinkedHashSet linkedHashSet, boolean z2, int[] iArr, C03680Gq[] c03680GqArr, C03680Gq[] c03680GqArr2, boolean z3) {
        C000700j.A03(str);
        this.A02 = str;
        this.A03 = str2;
        this.A0B = z;
        this.A00 = i;
        this.A01 = i2;
        this.A09 = interfaceC013706o;
        this.A0A = linkedHashSet;
        this.A05 = z2;
        this.A06 = iArr;
        this.A08 = c03680GqArr;
        this.A07 = c03680GqArr2;
        this.A04 = z3;
    }

    public static C03650Gn A00(String str) {
        C03650Gn[] c03650GnArr;
        if (str != null) {
            for (C03650Gn c03650Gn : A0C) {
                if (c03650Gn.A02.equalsIgnoreCase(str)) {
                    return c03650Gn;
                }
            }
        }
        return A0F;
    }

    public static C03650Gn A01(String str) {
        C03650Gn[] c03650GnArr;
        if (!TextUtils.isEmpty(str)) {
            for (C03650Gn c03650Gn : A0C) {
                if (c03650Gn.A03.equals(str)) {
                    return c03650Gn;
                }
            }
        }
        return A0F;
    }
}
