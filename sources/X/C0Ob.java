package X;

import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0Ob  reason: invalid class name */
/* loaded from: classes.dex */
public class C0Ob {
    public C2Qv A00;
    public C50232Qu A01;
    public final ConcurrentHashMap A03 = new ConcurrentHashMap();
    public final ConcurrentHashMap A02 = new ConcurrentHashMap();

    public C0Ob(InputStream inputStream, List list, MappedByteBuffer mappedByteBuffer) {
        if (mappedByteBuffer != null) {
            this.A01 = new C50232Qu(list, mappedByteBuffer);
        } else {
            this.A00 = new C2Qv(inputStream, list);
        }
    }

    public String A00(int i, Object obj, C2Ae c2Ae, boolean z) {
        char c;
        C50232Qu c50232Qu;
        ConcurrentHashMap concurrentHashMap = this.A02;
        Integer valueOf = Integer.valueOf(i);
        String[] strArr = (String[]) concurrentHashMap.get(valueOf);
        if (strArr == null) {
            if (z && (c50232Qu = this.A01) != null) {
                synchronized (c50232Qu) {
                    int i2 = c50232Qu.A01.get(i);
                    if (i2 != 0) {
                        MappedByteBuffer mappedByteBuffer = c50232Qu.A03;
                        mappedByteBuffer.position(i2);
                        int position = mappedByteBuffer.position();
                        byte b = mappedByteBuffer.get(position);
                        int i3 = position + 1;
                        strArr = new String[6];
                        for (int i4 = 0; i4 < b; i4++) {
                            byte b2 = mappedByteBuffer.get(i3);
                            int i5 = i3 + 1;
                            int A01 = c50232Qu.A01(i5);
                            int i6 = i5 + 4;
                            int A00 = c50232Qu.A00(i6);
                            i3 = i6 + 2;
                            byte[] bArr = new byte[A00];
                            mappedByteBuffer.position(c50232Qu.A00 + A01);
                            mappedByteBuffer.get(bArr, 0, A00);
                            strArr[b2] = new String(bArr, 0, A00, c50232Qu.A04);
                        }
                    } else {
                        return null;
                    }
                }
            } else {
                C2Qv c2Qv = this.A00;
                if (c2Qv != null) {
                    for (int length = c2Qv.A03.length - 1; length >= 0; length--) {
                        int i7 = c2Qv.A03[length];
                        int A002 = c2Qv.A00(i7);
                        int i8 = i7 + 2;
                        int A003 = c2Qv.A00(i8);
                        int i9 = i8 + 2;
                        byte[] bArr2 = c2Qv.A02;
                        int i10 = (A002 << 3) + i9;
                        if (bArr2.length < i10) {
                            C47362Ax.A00(String.format(Locale.US, "LoadedStringPack/readTranslations: header for locale incomplete, input.length=%d, caret=%d, numStrings=%d", Integer.valueOf(bArr2.length), Integer.valueOf(i9), Integer.valueOf(A002)));
                        } else {
                            for (int i11 = 0; i11 < A003; i11++) {
                                int A004 = c2Qv.A00(i10);
                                int i12 = i10 + 2;
                                int i13 = i12 + 1;
                                byte b3 = c2Qv.A02[i12];
                                if (A004 == i) {
                                    strArr = new String[6];
                                    int i14 = 0;
                                    while (i14 < b3) {
                                        byte[] bArr3 = c2Qv.A02;
                                        int i15 = i13 + 1;
                                        byte b4 = bArr3[i13];
                                        int A012 = c2Qv.A01(i15);
                                        int i16 = i15 + 4;
                                        strArr[b4] = new String(bArr3, c2Qv.A00 + A012, c2Qv.A00(i16), c2Qv.A01);
                                        i14++;
                                        i13 = i16 + 2;
                                    }
                                } else {
                                    i10 = (b3 * 7) + i13;
                                }
                            }
                            continue;
                        }
                    }
                    return null;
                }
                return null;
            }
            concurrentHashMap.put(valueOf, strArr);
        }
        int A04 = c2Ae.A04(obj);
        if (A04 != 1) {
            c = 2;
            if (A04 != 2) {
                c = 4;
                if (A04 == 4) {
                    c = 3;
                } else if (A04 != 8) {
                    c = 5;
                    if (A04 != 16) {
                        c = 0;
                    }
                }
            }
        } else {
            c = 1;
        }
        String str = strArr[c];
        return str != null ? str : strArr[0];
    }

    public String A01(int i, boolean z) {
        String str;
        C50232Qu c50232Qu;
        ConcurrentHashMap concurrentHashMap = this.A03;
        Integer valueOf = Integer.valueOf(i);
        String str2 = (String) concurrentHashMap.get(valueOf);
        if (str2 != null) {
            return str2;
        }
        String str3 = null;
        if (z && (c50232Qu = this.A01) != null) {
            synchronized (c50232Qu) {
                int i2 = c50232Qu.A02.get(i);
                if (i2 != 0) {
                    MappedByteBuffer mappedByteBuffer = c50232Qu.A03;
                    mappedByteBuffer.position(i2);
                    int position = mappedByteBuffer.position();
                    int A01 = c50232Qu.A01(position);
                    int A00 = c50232Qu.A00(position + 4);
                    byte[] bArr = new byte[A00];
                    mappedByteBuffer.position(c50232Qu.A00 + A01);
                    mappedByteBuffer.get(bArr, 0, A00);
                    str3 = new String(bArr, c50232Qu.A04);
                }
            }
        } else {
            C2Qv c2Qv = this.A00;
            if (c2Qv != null) {
                int length = c2Qv.A03.length - 1;
                while (true) {
                    if (length < 0) {
                        break;
                    }
                    int i3 = c2Qv.A03[length];
                    int A002 = c2Qv.A00(i3);
                    int i4 = i3 + 4;
                    byte[] bArr2 = c2Qv.A02;
                    if (bArr2.length < (A002 << 3) + i4) {
                        C47362Ax.A00(String.format(Locale.US, "ParsedStringPack/readTranslations: header for locale incomplete, input.length=%d, caret=%d, numStrings=%d", Integer.valueOf(bArr2.length), Integer.valueOf(i4), Integer.valueOf(A002)));
                    } else {
                        for (int i5 = 0; i5 < A002; i5++) {
                            if (c2Qv.A00(i4) == i) {
                                int i6 = i4 + 2;
                                str = new String(c2Qv.A02, c2Qv.A00 + c2Qv.A01(i6), c2Qv.A00(i6 + 4), c2Qv.A01);
                                break;
                            }
                            i4 += 8;
                        }
                    }
                    str = null;
                    if (str != null) {
                        str3 = str;
                        break;
                    }
                    length--;
                }
            }
        }
        if (str3 != null) {
            concurrentHashMap.put(valueOf, str3);
        }
        return str3;
    }
}
