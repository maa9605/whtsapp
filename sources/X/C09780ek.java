package X;

/* renamed from: X.0ek  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09780ek {
    public static final AbstractC09800em A00;

    static {
        A00 = (C09760ei.A02 && C09760ei.A03) ? new AbstractC09800em() { // from class: X.1fK
            @Override // X.AbstractC09800em
            public int A00(CharSequence charSequence, byte[] bArr, int i, int i2) {
                char c;
                long j;
                long j2;
                int i3;
                char charAt;
                long j3 = C09760ei.A00;
                long j4 = j3 + i;
                long j5 = i2 + j4;
                int length = charSequence.length();
                if (length <= i2 && bArr.length - i2 >= i) {
                    int i4 = 0;
                    while (true) {
                        c = 128;
                        j = 1;
                        if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                            break;
                        }
                        C09760ei.A00(bArr, j4, (byte) charAt);
                        i4++;
                        j4 = 1 + j4;
                    }
                    if (i4 != length) {
                        while (i4 < length) {
                            char charAt2 = charSequence.charAt(i4);
                            if (charAt2 < c && j4 < j5) {
                                j2 = j4 + j;
                                C09760ei.A00(bArr, j4, (byte) charAt2);
                            } else {
                                if (charAt2 < 2048 && j4 <= j5 - 2) {
                                    long j6 = j4 + j;
                                    C09760ei.A00(bArr, j4, (byte) ((charAt2 >>> 6) | 960));
                                    j4 = j6 + j;
                                    C09760ei.A00(bArr, j6, (byte) ((charAt2 & '?') | 128));
                                } else if ((charAt2 >= 55296 && 57343 >= charAt2) || j4 > j5 - 3) {
                                    if (j4 <= j5 - 4) {
                                        int i5 = i4 + 1;
                                        if (i5 != length) {
                                            char charAt3 = charSequence.charAt(i5);
                                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                                long j7 = j4 + 1;
                                                C09760ei.A00(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                                long j8 = 1 + j7;
                                                C09760ei.A00(bArr, j7, (byte) (((codePoint >>> 12) & 63) | 128));
                                                long j9 = 1 + j8;
                                                C09760ei.A00(bArr, j8, (byte) (((codePoint >>> 6) & 63) | 128));
                                                j = 1;
                                                j4 = j9 + 1;
                                                C09760ei.A00(bArr, j9, (byte) ((codePoint & 63) | 128));
                                                i4 = i5;
                                            } else {
                                                i4 = i5;
                                            }
                                        }
                                        throw new C24811Cy(i4 - 1, length);
                                    } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                                        throw new C24811Cy(i4, length);
                                    } else {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("Failed writing ");
                                        sb.append(charAt2);
                                        sb.append(" at index ");
                                        sb.append(j4);
                                        throw new ArrayIndexOutOfBoundsException(sb.toString());
                                    }
                                } else {
                                    long j10 = j4 + j;
                                    C09760ei.A00(bArr, j4, (byte) ((charAt2 >>> '\f') | 480));
                                    long j11 = j + j10;
                                    C09760ei.A00(bArr, j10, (byte) (((charAt2 >>> 6) & 63) | 128));
                                    j2 = j11 + 1;
                                    C09760ei.A00(bArr, j11, (byte) ((charAt2 & '?') | 128));
                                    j = 1;
                                }
                                i4++;
                                c = 128;
                            }
                            j4 = j2;
                            i4++;
                            c = 128;
                        }
                    }
                    return (int) (j4 - j3);
                }
                StringBuilder A0P = C000200d.A0P("Failed writing ");
                A0P.append(charSequence.charAt(length - 1));
                A0P.append(" at index ");
                A0P.append(i + i2);
                throw new ArrayIndexOutOfBoundsException(A0P.toString());
            }
        } : new AbstractC09800em() { // from class: X.0el
            /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
                return r10 + r2;
             */
            @Override // X.AbstractC09800em
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public int A00(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
                /*
                    Method dump skipped, instructions count: 250
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C09790el.A00(java.lang.CharSequence, byte[], int, int):int");
            }
        };
    }

    public static int A00(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new C24811Cy(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder A0P = C000200d.A0P("UTF-8 length does not fit in int: ");
        A0P.append(i3 + 4294967296L);
        throw new IllegalArgumentException(A0P.toString());
    }
}
