package X;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.11A  reason: invalid class name */
/* loaded from: classes.dex */
public final class C11A {
    public static final int A0O;
    public static final int[] A0P;
    public static final int[] A0Q;
    public static final int[] A0R;
    public static final int[] A0S;
    public static final int[] A0T;
    public static final int[] A0U;
    public static final int[] A0V;
    public static final boolean[] A0W;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public static final int A0N = A00(2, 2, 2, 0);
    public static final int A0M = A00(0, 0, 0, 0);
    public final List A0L = new ArrayList();
    public final SpannableStringBuilder A0K = new SpannableStringBuilder();

    static {
        int A00 = A00(0, 0, 0, 3);
        A0O = A00;
        A0T = new int[]{0, 0, 0, 0, 0, 2, 0};
        A0U = new int[]{0, 0, 0, 0, 0, 0, 2};
        A0V = new int[]{3, 3, 3, 3, 3, 3, 1};
        A0W = new boolean[]{false, false, false, true, true, true, false};
        int i = A0M;
        A0S = new int[]{i, A00, i, i, A00, i, i};
        A0R = new int[]{0, 1, 2, 3, 4, 3, 4};
        A0Q = new int[]{0, 0, 0, 0, 0, 3, 3};
        A0P = new int[]{i, i, i, i, i, A00, A00};
    }

    public C11A() {
        A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r8 != 3) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(int r5, int r6, int r7, int r8) {
        /*
            r4 = 0
            r0 = 4
            X.C002701i.A17(r5, r0)
            X.C002701i.A17(r6, r0)
            X.C002701i.A17(r7, r0)
            X.C002701i.A17(r8, r0)
            r3 = 1
            if (r8 == 0) goto L1a
            if (r8 == r3) goto L1a
            r0 = 2
            if (r8 == r0) goto L2f
            r0 = 3
            r2 = 0
            if (r8 == r0) goto L1c
        L1a:
            r2 = 255(0xff, float:3.57E-43)
        L1c:
            r1 = 0
            if (r5 <= r3) goto L21
            r1 = 255(0xff, float:3.57E-43)
        L21:
            r0 = 0
            if (r6 <= r3) goto L26
            r0 = 255(0xff, float:3.57E-43)
        L26:
            if (r7 <= r3) goto L2a
            r4 = 255(0xff, float:3.57E-43)
        L2a:
            int r0 = android.graphics.Color.argb(r2, r1, r0, r4)
            return r0
        L2f:
            r2 = 127(0x7f, float:1.78E-43)
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11A.A00(int, int, int, int):int");
    }

    public SpannableString A01() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A0K);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.A06 != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.A06, length, 33);
            }
            if (this.A0C != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.A0C, length, 33);
            }
            if (this.A04 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.A03), this.A04, length, 33);
            }
            if (this.A02 != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.A01), this.A02, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public void A02() {
        this.A0L.clear();
        this.A0K.clear();
        this.A06 = -1;
        this.A0C = -1;
        this.A04 = -1;
        this.A02 = -1;
        this.A0A = 0;
        this.A0G = false;
        this.A0J = false;
        this.A09 = 4;
        this.A0H = false;
        this.A0D = 0;
        this.A05 = 0;
        this.A00 = 0;
        this.A0B = 15;
        this.A0I = true;
        this.A07 = 0;
        this.A0F = 0;
        this.A08 = 0;
        int i = A0M;
        this.A0E = i;
        this.A03 = A0N;
        this.A01 = i;
    }

    public void A03(char c) {
        if (c == '\n') {
            List list = this.A0L;
            list.add(A01());
            this.A0K.clear();
            if (this.A06 != -1) {
                this.A06 = 0;
            }
            if (this.A0C != -1) {
                this.A0C = 0;
            }
            if (this.A04 != -1) {
                this.A04 = 0;
            }
            if (this.A02 != -1) {
                this.A02 = 0;
            }
            while (true) {
                if ((!this.A0I || list.size() < this.A0B) && list.size() < 15) {
                    return;
                }
                list.remove(0);
            }
        } else {
            this.A0K.append(c);
        }
    }

    public void A04(int i, int i2) {
        int i3;
        int i4;
        if (this.A04 != -1 && (i4 = this.A03) != i) {
            SpannableStringBuilder spannableStringBuilder = this.A0K;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i4), this.A04, spannableStringBuilder.length(), 33);
        }
        if (i != A0N) {
            this.A04 = this.A0K.length();
            this.A03 = i;
        }
        if (this.A02 != -1 && (i3 = this.A01) != i2) {
            SpannableStringBuilder spannableStringBuilder2 = this.A0K;
            spannableStringBuilder2.setSpan(new BackgroundColorSpan(i3), this.A02, spannableStringBuilder2.length(), 33);
        }
        if (i2 != A0M) {
            this.A02 = this.A0K.length();
            this.A01 = i2;
        }
    }

    public void A05(boolean z, boolean z2) {
        if (this.A06 != -1) {
            if (!z) {
                SpannableStringBuilder spannableStringBuilder = this.A0K;
                spannableStringBuilder.setSpan(new StyleSpan(2), this.A06, spannableStringBuilder.length(), 33);
                this.A06 = -1;
            }
        } else if (z) {
            this.A06 = this.A0K.length();
        }
        if (this.A0C == -1) {
            if (!z2) {
                return;
            }
            this.A0C = this.A0K.length();
        } else if (!z2) {
            SpannableStringBuilder spannableStringBuilder2 = this.A0K;
            spannableStringBuilder2.setSpan(new UnderlineSpan(), this.A0C, spannableStringBuilder2.length(), 33);
            this.A0C = -1;
        }
    }
}
