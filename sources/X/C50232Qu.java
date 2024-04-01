package X;

import android.util.SparseIntArray;
import java.nio.MappedByteBuffer;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: X.2Qu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C50232Qu {
    public final int A00;
    public final SparseIntArray A01 = new SparseIntArray();
    public final SparseIntArray A02 = new SparseIntArray();
    public final MappedByteBuffer A03;
    public final Charset A04;

    public C50232Qu(List list, MappedByteBuffer mappedByteBuffer) {
        int i;
        this.A03 = mappedByteBuffer;
        int A00 = A00(0);
        int A01 = A01(2);
        byte b = this.A03.get(6);
        Charset[] charsetArr = C47192Ag.A02;
        if (b >= charsetArr.length) {
            C47362Ax.A00("MMappedStringPack: unrecognized encoding");
        }
        this.A04 = charsetArr[b];
        this.A00 = A01(7);
        if (list.isEmpty()) {
            C47362Ax.A00("MMappedStringPack: parentLocales is empty");
            return;
        }
        int size = list.size();
        int[] iArr = new int[size];
        int i2 = 11;
        int i3 = 0;
        for (int i4 = 0; i4 < A00; i4++) {
            this.A03.position(i2);
            int position = this.A03.position();
            if (this.A03.get(position + 2) == 0) {
                i = 2;
            } else {
                byte b2 = this.A03.get(position + 5);
                i = 7;
                if (b2 == 0) {
                    i = 5;
                }
            }
            byte[] bArr = new byte[i];
            this.A03.get(bArr, 0, i);
            int indexOf = list.indexOf(new String(bArr, 0, i, C47192Ag.A01));
            if (indexOf != -1) {
                i3++;
                iArr[indexOf] = i2;
                if (i3 >= list.size()) {
                    break;
                }
            }
            i2 += 11;
        }
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = iArr[i5];
            if (i6 != 0) {
                this.A03.position(i6 + 7);
                int A012 = A01(this.A03.position()) + A01;
                int A002 = A00(A012);
                int i7 = A012 + 2;
                int A003 = A00(i7);
                int i8 = i7 + 2;
                for (int i9 = 0; i9 < A002; i9++) {
                    int A004 = A00(i8);
                    int i10 = i8 + 2;
                    this.A02.append(A004, i10);
                    i8 = i10 + 6;
                }
                for (int i11 = 0; i11 < A003; i11++) {
                    int A005 = A00(i8);
                    int i12 = i8 + 2;
                    this.A01.append(A005, i12);
                    byte b3 = this.A03.get(i12);
                    i8 = i12 + 1;
                    for (int i13 = 0; i13 < b3; i13++) {
                        i8 += 7;
                    }
                }
            }
        }
    }

    public final int A00(int i) {
        MappedByteBuffer mappedByteBuffer = this.A03;
        return ((mappedByteBuffer.get(i + 1) & 255) << 8) | (mappedByteBuffer.get(i) & 255);
    }

    public final int A01(int i) {
        MappedByteBuffer mappedByteBuffer = this.A03;
        return ((mappedByteBuffer.get(i + 3) & 255) << 24) | (mappedByteBuffer.get(i) & 255) | ((mappedByteBuffer.get(i + 1) & 255) << 8) | ((mappedByteBuffer.get(i + 2) & 255) << 16);
    }
}
