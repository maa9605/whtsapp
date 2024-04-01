package X;

import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: X.0D0  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0D0 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public CharSequence A07;
    public CharSequence A08;
    public String A09;
    public ArrayList A0B;
    public ArrayList A0C;
    public boolean A0D;
    public ArrayList A0A = new ArrayList();
    public boolean A0E = true;
    public boolean A0F = false;

    public abstract int A04();

    public abstract int A05();

    public abstract C0D0 A06(C0BA c0ba);

    public abstract void A08();

    public void A00(int i, C0BA c0ba) {
        A09(i, c0ba, null, 1);
    }

    public void A01(int i, C0BA c0ba, String str) {
        if (i != 0) {
            A09(i, c0ba, str, 2);
            return;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public void A02(C09320d3 c09320d3) {
        this.A0A.add(c09320d3);
        c09320d3.A01 = this.A02;
        c09320d3.A02 = this.A03;
        c09320d3.A03 = this.A04;
        c09320d3.A04 = this.A05;
    }

    public void A03(String str) {
        if (this.A0E) {
            this.A0D = true;
            this.A09 = str;
            return;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public C0D0 A07(C0BA c0ba, EnumC02560Bx enumC02560Bx) {
        A02(new C09320d3(c0ba, enumC02560Bx));
        return this;
    }

    public void A09(int i, C0BA c0ba, String str, int i2) {
        Class<?> cls = c0ba.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str2 = c0ba.A0Q;
                if (str2 != null && !str.equals(str2)) {
                    StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                    sb.append(c0ba);
                    sb.append(": was ");
                    throw new IllegalStateException(C000200d.A0M(sb, c0ba.A0Q, " now ", str));
                }
                c0ba.A0Q = str;
            }
            if (i != 0) {
                if (i != -1) {
                    int i3 = c0ba.A03;
                    if (i3 != 0 && i3 != i) {
                        StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                        sb2.append(c0ba);
                        sb2.append(": was ");
                        sb2.append(c0ba.A03);
                        sb2.append(" now ");
                        sb2.append(i);
                        throw new IllegalStateException(sb2.toString());
                    }
                    c0ba.A03 = i;
                    c0ba.A02 = i;
                } else {
                    StringBuilder sb3 = new StringBuilder("Can't add fragment ");
                    sb3.append(c0ba);
                    sb3.append(" with tag ");
                    sb3.append(str);
                    sb3.append(" to container view with no id");
                    throw new IllegalArgumentException(sb3.toString());
                }
            }
            A02(new C09320d3(i2, c0ba));
            return;
        }
        StringBuilder A0P = C000200d.A0P("Fragment ");
        A0P.append(cls.getCanonicalName());
        A0P.append(" must be a public static class to be  properly recreated from instance state.");
        throw new IllegalStateException(A0P.toString());
    }
}
