package X;

import java.util.Comparator;

/* renamed from: X.294  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass294 implements Comparator {
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int length;
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = bArr.length;
            if (i >= length || i2 >= bArr2.length) {
                break;
            }
            int i3 = bArr[i] & 255;
            int i4 = bArr2[i2] & 255;
            if (i3 != i4) {
                return i3 - i4;
            }
            i++;
            i2++;
        }
        return length - bArr2.length;
    }
}
