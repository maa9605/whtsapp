package X;

import android.text.SpannableStringBuilder;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.Locale;

/* renamed from: X.0SI  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0SI {
    public static final C0SI A03;
    public static final C0SI A04;
    public static final C07X A05 = C07Y.A01;
    public static final String A06 = Character.toString(8206);
    public static final String A07 = Character.toString(8207);
    public final int A00 = 2;
    public final C07X A01;
    public final boolean A02;

    static {
        C07X c07x = A05;
        A03 = new C0SI(false, c07x);
        A04 = new C0SI(true, c07x);
    }

    public C0SI(boolean z, C07X c07x) {
        this.A02 = z;
        this.A01 = c07x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
        if (r8 == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
        if (r4.A01 <= 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
        switch(r4.A00()) {
            case 14: goto L55;
            case 15: goto L55;
            case 16: goto L61;
            case 17: goto L61;
            case 18: goto L51;
            default: goto L64;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
        if (r6 != r3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0085, code lost:
        if (r6 != r3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0087, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0089, code lost:
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(java.lang.CharSequence r8) {
        /*
            r5 = 0
            X.0fP r4 = new X.0fP
            r4.<init>(r8)
            r4.A01 = r5
            r7 = 1
            r6 = 0
            r8 = 0
            r3 = 0
        Lc:
            int r2 = r4.A01
            int r0 = r4.A02
            if (r2 >= r0) goto L6c
            if (r6 != 0) goto L6f
            java.lang.CharSequence r1 = r4.A03
            char r0 = r1.charAt(r2)
            r4.A00 = r0
            boolean r0 = java.lang.Character.isHighSurrogate(r0)
            if (r0 == 0) goto L57
            int r0 = r4.A01
            int r2 = java.lang.Character.codePointAt(r1, r0)
            int r1 = r4.A01
            int r0 = java.lang.Character.charCount(r2)
            int r0 = r0 + r1
            r4.A01 = r0
            byte r1 = java.lang.Character.getDirectionality(r2)
        L35:
            if (r1 == 0) goto L54
            if (r1 == r7) goto L51
            r0 = 2
            if (r1 == r0) goto L51
            r0 = 9
            if (r1 == r0) goto Lc
            switch(r1) {
                case 14: goto L4d;
                case 15: goto L4d;
                case 16: goto L49;
                case 17: goto L49;
                case 18: goto L45;
                default: goto L43;
            }
        L43:
            r6 = r3
            goto Lc
        L45:
            int r3 = r3 + (-1)
            r8 = 0
            goto Lc
        L49:
            int r3 = r3 + 1
            r8 = 1
            goto Lc
        L4d:
            int r3 = r3 + 1
            r8 = -1
            goto Lc
        L51:
            if (r3 != 0) goto L43
            goto L87
        L54:
            if (r3 != 0) goto L43
            goto L83
        L57:
            int r0 = r4.A01
            int r0 = r0 + r7
            r4.A01 = r0
            char r1 = r4.A00
            r0 = 1792(0x700, float:2.511E-42)
            if (r1 >= r0) goto L67
            byte[] r0 = X.C10170fP.A04
            r1 = r0[r1]
            goto L35
        L67:
            byte r1 = java.lang.Character.getDirectionality(r1)
            goto L35
        L6c:
            if (r6 != 0) goto L6f
            return r5
        L6f:
            if (r8 == 0) goto L72
            return r8
        L72:
            int r0 = r4.A01
            if (r0 <= 0) goto L88
            byte r0 = r4.A00()
            switch(r0) {
                case 14: goto L81;
                case 15: goto L81;
                case 16: goto L85;
                case 17: goto L85;
                case 18: goto L7e;
                default: goto L7d;
            }
        L7d:
            goto L72
        L7e:
            int r3 = r3 + 1
            goto L72
        L81:
            if (r6 != r3) goto L89
        L83:
            r5 = -1
            return r5
        L85:
            if (r6 != r3) goto L89
        L87:
            r5 = 1
        L88:
            return r5
        L89:
            int r3 = r3 + (-1)
            goto L72
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SI.A00(java.lang.CharSequence):int");
    }

    public static int A01(CharSequence charSequence) {
        C10170fP c10170fP = new C10170fP(charSequence);
        c10170fP.A01 = c10170fP.A02;
        int i = 0;
        int i2 = 0;
        while (c10170fP.A01 > 0) {
            byte A00 = c10170fP.A00();
            if (A00 != 0) {
                if (A00 == 1 || A00 == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                        i2 = i;
                    }
                } else if (A00 != 9) {
                    switch (A00) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                        case 17:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                                break;
                            } else {
                                i2 = i;
                                break;
                            }
                    }
                } else {
                    continue;
                }
            } else if (i == 0) {
                return -1;
            } else {
                if (i2 == 0) {
                    i2 = i;
                }
            }
        }
        return 0;
    }

    public static C0SI A02() {
        boolean z = C07050Wl.A00(Locale.getDefault()) == 1;
        C07X c07x = A05;
        if (c07x == c07x) {
            if (z) {
                return A04;
            }
            return A03;
        }
        return new C0SI(z, c07x);
    }

    public CharSequence A03(CharSequence charSequence, C07X c07x) {
        C07X c07x2;
        C07X c07x3;
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean A01 = ((AbstractC014907a) c07x).A01(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str2 = "";
        if ((this.A00 & 2) != 0) {
            if (A01) {
                c07x3 = C07Y.A05;
            } else {
                c07x3 = C07Y.A04;
            }
            boolean A012 = ((AbstractC014907a) c07x3).A01(charSequence, charSequence.length());
            boolean z = this.A02;
            if (!z && (A012 || A00(charSequence) == 1)) {
                str = A06;
            } else {
                str = (!z || (A012 && A00(charSequence) != -1)) ? "" : A07;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        boolean z2 = this.A02;
        if (A01 != z2) {
            spannableStringBuilder.append(A01 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (A01) {
            c07x2 = C07Y.A05;
        } else {
            c07x2 = C07Y.A04;
        }
        boolean A013 = ((AbstractC014907a) c07x2).A01(charSequence, charSequence.length());
        if (z2) {
            if (!A013 || A01(charSequence) == -1) {
                str2 = A07;
            }
        } else if (A013 || A01(charSequence) == 1) {
            str2 = A06;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
