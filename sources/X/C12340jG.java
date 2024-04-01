package X;

import android.os.Build;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.0jG  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C12340jG {
    public int A00;
    public final C12370jJ A04 = new C12370jJ();
    public final C12360jI A03 = new C12360jI();
    public final C12350jH A02 = new C12350jH();
    public final C12380jK A05 = new C12380jK();
    public HashMap A01 = new HashMap();

    public final void A00(int i, C0Wg c0Wg) {
        this.A00 = i;
        C12350jH c12350jH = this.A02;
        c12350jH.A0W = c0Wg.A0T;
        c12350jH.A0X = c0Wg.A0U;
        c12350jH.A0f = c0Wg.A0k;
        c12350jH.A0g = c0Wg.A0l;
        c12350jH.A0m = c0Wg.A0p;
        c12350jH.A0l = c0Wg.A0o;
        c12350jH.A0B = c0Wg.A0C;
        c12350jH.A0A = c0Wg.A0B;
        c12350jH.A08 = c0Wg.A0A;
        c12350jH.A0i = c0Wg.A0m;
        c12350jH.A0j = c0Wg.A0n;
        c12350jH.A0I = c0Wg.A0J;
        c12350jH.A0H = c0Wg.A0I;
        c12350jH.A03 = c0Wg.A02;
        c12350jH.A05 = c0Wg.A08;
        c12350jH.A0r = c0Wg.A0t;
        c12350jH.A0C = c0Wg.A0D;
        c12350jH.A0D = c0Wg.A0E;
        c12350jH.A00 = c0Wg.A00;
        c12350jH.A0E = c0Wg.A0G;
        c12350jH.A0F = c0Wg.A0H;
        c12350jH.A0d = c0Wg.A0b;
        c12350jH.A01 = c0Wg.A01;
        c12350jH.A0P = c0Wg.A0Q;
        c12350jH.A0Q = c0Wg.A0R;
        c12350jH.A0c = ((ViewGroup.MarginLayoutParams) c0Wg).width;
        c12350jH.A0a = ((ViewGroup.MarginLayoutParams) c0Wg).height;
        c12350jH.A0V = ((ViewGroup.MarginLayoutParams) c0Wg).leftMargin;
        c12350jH.A0e = ((ViewGroup.MarginLayoutParams) c0Wg).rightMargin;
        c12350jH.A0k = ((ViewGroup.MarginLayoutParams) c0Wg).topMargin;
        c12350jH.A09 = ((ViewGroup.MarginLayoutParams) c0Wg).bottomMargin;
        c12350jH.A06 = c0Wg.A09;
        c12350jH.A04 = c0Wg.A03;
        c12350jH.A0n = c0Wg.A0q;
        c12350jH.A0U = c0Wg.A0S;
        c12350jH.A0v = c0Wg.A0v;
        c12350jH.A0u = c0Wg.A0u;
        c12350jH.A0o = c0Wg.A0W;
        c12350jH.A0R = c0Wg.A0V;
        c12350jH.A0p = c0Wg.A0Y;
        c12350jH.A0S = c0Wg.A0X;
        c12350jH.A0q = c0Wg.A0a;
        c12350jH.A0T = c0Wg.A0Z;
        c12350jH.A07 = c0Wg.A05;
        c12350jH.A02 = c0Wg.A04;
        c12350jH.A0s = c0Wg.A0s;
        c12350jH.A0O = c0Wg.A0P;
        c12350jH.A0J = c0Wg.A0K;
        c12350jH.A0L = c0Wg.A0M;
        c12350jH.A0M = c0Wg.A0N;
        c12350jH.A0N = c0Wg.A0O;
        c12350jH.A0K = c0Wg.A0L;
        if (Build.VERSION.SDK_INT >= 17) {
            c12350jH.A0G = c0Wg.getMarginEnd();
            c12350jH.A0h = c0Wg.getMarginStart();
        }
    }

    public void A01(C0Wg c0Wg) {
        C12350jH c12350jH = this.A02;
        c0Wg.A0T = c12350jH.A0W;
        c0Wg.A0U = c12350jH.A0X;
        c0Wg.A0k = c12350jH.A0f;
        c0Wg.A0l = c12350jH.A0g;
        c0Wg.A0p = c12350jH.A0m;
        c0Wg.A0o = c12350jH.A0l;
        c0Wg.A0C = c12350jH.A0B;
        c0Wg.A0B = c12350jH.A0A;
        c0Wg.A0A = c12350jH.A08;
        c0Wg.A0m = c12350jH.A0i;
        c0Wg.A0n = c12350jH.A0j;
        c0Wg.A0J = c12350jH.A0I;
        c0Wg.A0I = c12350jH.A0H;
        ((ViewGroup.MarginLayoutParams) c0Wg).leftMargin = c12350jH.A0V;
        ((ViewGroup.MarginLayoutParams) c0Wg).rightMargin = c12350jH.A0e;
        ((ViewGroup.MarginLayoutParams) c0Wg).topMargin = c12350jH.A0k;
        ((ViewGroup.MarginLayoutParams) c0Wg).bottomMargin = c12350jH.A09;
        c0Wg.A0O = c12350jH.A0N;
        c0Wg.A0L = c12350jH.A0K;
        c0Wg.A0P = c12350jH.A0O;
        c0Wg.A0K = c12350jH.A0J;
        c0Wg.A02 = c12350jH.A03;
        c0Wg.A08 = c12350jH.A05;
        c0Wg.A0D = c12350jH.A0C;
        c0Wg.A0E = c12350jH.A0D;
        c0Wg.A00 = c12350jH.A00;
        c0Wg.A0t = c12350jH.A0r;
        c0Wg.A0G = c12350jH.A0E;
        c0Wg.A0H = c12350jH.A0F;
        c0Wg.A09 = c12350jH.A06;
        c0Wg.A03 = c12350jH.A04;
        c0Wg.A0q = c12350jH.A0n;
        c0Wg.A0S = c12350jH.A0U;
        c0Wg.A0v = c12350jH.A0v;
        c0Wg.A0u = c12350jH.A0u;
        c0Wg.A0W = c12350jH.A0o;
        c0Wg.A0V = c12350jH.A0R;
        c0Wg.A0Y = c12350jH.A0p;
        c0Wg.A0X = c12350jH.A0S;
        c0Wg.A0a = c12350jH.A0q;
        c0Wg.A0Z = c12350jH.A0T;
        c0Wg.A05 = c12350jH.A07;
        c0Wg.A04 = c12350jH.A02;
        c0Wg.A0b = c12350jH.A0d;
        c0Wg.A01 = c12350jH.A01;
        c0Wg.A0Q = c12350jH.A0P;
        c0Wg.A0R = c12350jH.A0Q;
        ((ViewGroup.MarginLayoutParams) c0Wg).width = c12350jH.A0c;
        ((ViewGroup.MarginLayoutParams) c0Wg).height = c12350jH.A0a;
        String str = c12350jH.A0s;
        if (str != null) {
            c0Wg.A0s = str;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            c0Wg.setMarginStart(c12350jH.A0h);
            c0Wg.setMarginEnd(c12350jH.A0G);
        }
        c0Wg.A00();
    }

    public Object clone() {
        C12340jG c12340jG = new C12340jG();
        C12350jH c12350jH = c12340jG.A02;
        C12350jH c12350jH2 = this.A02;
        if (c12350jH != null) {
            c12350jH.A0y = c12350jH2.A0y;
            c12350jH.A0c = c12350jH2.A0c;
            c12350jH.A0w = c12350jH2.A0w;
            c12350jH.A0a = c12350jH2.A0a;
            c12350jH.A0P = c12350jH2.A0P;
            c12350jH.A0Q = c12350jH2.A0Q;
            c12350jH.A01 = c12350jH2.A01;
            c12350jH.A0W = c12350jH2.A0W;
            c12350jH.A0X = c12350jH2.A0X;
            c12350jH.A0f = c12350jH2.A0f;
            c12350jH.A0g = c12350jH2.A0g;
            c12350jH.A0m = c12350jH2.A0m;
            c12350jH.A0l = c12350jH2.A0l;
            c12350jH.A0B = c12350jH2.A0B;
            c12350jH.A0A = c12350jH2.A0A;
            c12350jH.A08 = c12350jH2.A08;
            c12350jH.A0i = c12350jH2.A0i;
            c12350jH.A0j = c12350jH2.A0j;
            c12350jH.A0I = c12350jH2.A0I;
            c12350jH.A0H = c12350jH2.A0H;
            c12350jH.A03 = c12350jH2.A03;
            c12350jH.A05 = c12350jH2.A05;
            c12350jH.A0r = c12350jH2.A0r;
            c12350jH.A0C = c12350jH2.A0C;
            c12350jH.A0D = c12350jH2.A0D;
            c12350jH.A00 = c12350jH2.A00;
            c12350jH.A0E = c12350jH2.A0E;
            c12350jH.A0F = c12350jH2.A0F;
            c12350jH.A0d = c12350jH2.A0d;
            c12350jH.A0V = c12350jH2.A0V;
            c12350jH.A0e = c12350jH2.A0e;
            c12350jH.A0k = c12350jH2.A0k;
            c12350jH.A09 = c12350jH2.A09;
            c12350jH.A0G = c12350jH2.A0G;
            c12350jH.A0h = c12350jH2.A0h;
            c12350jH.A0L = c12350jH2.A0L;
            c12350jH.A0O = c12350jH2.A0O;
            c12350jH.A0M = c12350jH2.A0M;
            c12350jH.A0J = c12350jH2.A0J;
            c12350jH.A0K = c12350jH2.A0K;
            c12350jH.A0N = c12350jH2.A0N;
            c12350jH.A06 = c12350jH2.A06;
            c12350jH.A04 = c12350jH2.A04;
            c12350jH.A0U = c12350jH2.A0U;
            c12350jH.A0n = c12350jH2.A0n;
            c12350jH.A0o = c12350jH2.A0o;
            c12350jH.A0R = c12350jH2.A0R;
            c12350jH.A0p = c12350jH2.A0p;
            c12350jH.A0S = c12350jH2.A0S;
            c12350jH.A0q = c12350jH2.A0q;
            c12350jH.A0T = c12350jH2.A0T;
            c12350jH.A07 = c12350jH2.A07;
            c12350jH.A02 = c12350jH2.A02;
            c12350jH.A0Y = c12350jH2.A0Y;
            c12350jH.A0Z = c12350jH2.A0Z;
            c12350jH.A0b = c12350jH2.A0b;
            c12350jH.A0s = c12350jH2.A0s;
            int[] iArr = c12350jH2.A0z;
            if (iArr != null) {
                c12350jH.A0z = Arrays.copyOf(iArr, iArr.length);
            } else {
                c12350jH.A0z = null;
            }
            c12350jH.A0t = c12350jH2.A0t;
            c12350jH.A0v = c12350jH2.A0v;
            c12350jH.A0u = c12350jH2.A0u;
            c12350jH.A0x = c12350jH2.A0x;
            C12360jI c12360jI = c12340jG.A03;
            C12360jI c12360jI2 = this.A03;
            if (c12360jI != null) {
                c12360jI.A06 = c12360jI2.A06;
                c12360jI.A02 = c12360jI2.A02;
                c12360jI.A05 = c12360jI2.A05;
                c12360jI.A04 = c12360jI2.A04;
                c12360jI.A03 = c12360jI2.A03;
                c12360jI.A01 = c12360jI2.A01;
                c12360jI.A00 = c12360jI2.A00;
                C12370jJ c12370jJ = c12340jG.A04;
                C12370jJ c12370jJ2 = this.A04;
                if (c12370jJ != null) {
                    c12370jJ.A04 = c12370jJ2.A04;
                    c12370jJ.A03 = c12370jJ2.A03;
                    c12370jJ.A00 = c12370jJ2.A00;
                    c12370jJ.A01 = c12370jJ2.A01;
                    c12370jJ.A02 = c12370jJ2.A02;
                    C12380jK c12380jK = c12340jG.A05;
                    C12380jK c12380jK2 = this.A05;
                    if (c12380jK != null) {
                        c12380jK.A0C = c12380jK2.A0C;
                        c12380jK.A01 = c12380jK2.A01;
                        c12380jK.A02 = c12380jK2.A02;
                        c12380jK.A03 = c12380jK2.A03;
                        c12380jK.A04 = c12380jK2.A04;
                        c12380jK.A05 = c12380jK2.A05;
                        c12380jK.A06 = c12380jK2.A06;
                        c12380jK.A07 = c12380jK2.A07;
                        c12380jK.A08 = c12380jK2.A08;
                        c12380jK.A09 = c12380jK2.A09;
                        c12380jK.A0A = c12380jK2.A0A;
                        c12380jK.A0B = c12380jK2.A0B;
                        c12380jK.A00 = c12380jK2.A00;
                        c12340jG.A00 = this.A00;
                        return c12340jG;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}
