package X;

import com.whatsapp.voipcalling.DefaultCryptoCallback;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.31N */
/* loaded from: classes2.dex */
public class C31N {
    public int A00;
    public C31P A01;
    public final C31Q A02;

    public C31N(C31Q c31q) {
        this.A02 = c31q;
    }

    public int A00() {
        if (!(this instanceof C3IW)) {
            A02();
            C31Q c31q = this.A02;
            c31q.readInt();
            int readInt = this.A01.A00[C31O.A00(c31q.readByte() & 255).typeId] * c31q.readInt();
            A04(readInt);
            return this.A00 + 4 + 4 + 1 + readInt;
        }
        A02();
        C31Q c31q2 = this.A02;
        c31q2.readInt();
        int readInt2 = this.A01.A00[C31O.A00(c31q2.readByte() & 255).typeId] * c31q2.readInt();
        C3IX c3ix = (C3IX) c31q2;
        c3ix.A00.AR5(new byte[readInt2]);
        c3ix.A01.write(new byte[readInt2]);
        return this.A00 + 4 + 4 + 1 + readInt2;
    }

    public int A01() {
        return this.A02.readShort() & 65535;
    }

    public long A02() {
        int i = this.A00;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        return this.A02.readLong();
                    }
                    throw new IllegalArgumentException("ID Length must be 1, 2, 4, or 8");
                }
                return this.A02.readInt();
            }
            return this.A02.readShort();
        }
        return this.A02.readByte();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void A03() {
        C31Q c31q;
        int i;
        long j;
        int i2;
        int i3;
        this.A01 = new C31P();
        do {
            try {
                c31q = this.A02;
            } catch (EOFException unused) {
                return;
            }
        } while (c31q.readByte() != 0);
        int readInt = c31q.readInt();
        this.A00 = readInt;
        C31P c31p = this.A01;
        int i4 = -1;
        for (int i5 = 0; i5 < C31O.values().length; i5++) {
            i4 = Math.max(C31O.values()[i5].typeId, i4);
        }
        int[] iArr = new int[i4 + 1];
        c31p.A00 = iArr;
        Arrays.fill(iArr, -1);
        for (int i6 = 0; i6 < C31O.values().length; i6++) {
            c31p.A00[C31O.values()[i6].typeId] = C31O.values()[i6].size;
        }
        c31p.A00[C31O.OBJECT.typeId] = readInt;
        c31q.readLong();
        while (c31q.AEX()) {
            int readByte = c31q.readByte() & 255;
            c31q.readInt();
            long readInt2 = c31q.readInt() & 4294967295L;
            if (readByte != 12 && readByte != 28) {
                A04(readInt2);
            } else {
                while (readInt2 > 0) {
                    int readByte2 = c31q.readByte() & 255;
                    long j2 = readInt2 - 1;
                    if (readByte2 != 144) {
                        if (readByte2 != 195) {
                            if (readByte2 == 254) {
                                c31q.readInt();
                                A02();
                                i2 = this.A00;
                            } else if (readByte2 != 255) {
                                switch (readByte2) {
                                    case 1:
                                        A04(this.A00);
                                        j2 -= this.A00;
                                        A02();
                                        i = this.A00;
                                        j = i;
                                        break;
                                    case 2:
                                    case 3:
                                        A04(this.A00 + 4 + 4);
                                        i3 = this.A00;
                                        i2 = i3 + 4;
                                        break;
                                    case 4:
                                        A02();
                                        c31q.readInt();
                                        i2 = this.A00;
                                        break;
                                    case 5:
                                    case 7:
                                        break;
                                    case 6:
                                        A02();
                                        c31q.readInt();
                                        i2 = this.A00;
                                        break;
                                    case 8:
                                        A02();
                                        c31q.readInt();
                                        c31q.readInt();
                                        i3 = this.A00;
                                        i2 = i3 + 4;
                                        break;
                                    default:
                                        switch (readByte2) {
                                            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                                                if (!(this instanceof C3IW)) {
                                                    if (!(this instanceof C3IV)) {
                                                        throw null;
                                                    }
                                                    C3IV c3iv = (C3IV) this;
                                                    long A02 = c3iv.A02();
                                                    C31Q c31q2 = c3iv.A02;
                                                    c31q2.readInt();
                                                    long A022 = c3iv.A02();
                                                    c3iv.A02();
                                                    c3iv.A02();
                                                    c3iv.A02();
                                                    c3iv.A02();
                                                    c3iv.A02();
                                                    c31q2.readInt();
                                                    int A01 = c3iv.A01();
                                                    int i7 = (((C31N) c3iv).A00 * 7) + 4 + 4 + 2;
                                                    for (int i8 = 0; i8 < A01; i8++) {
                                                        c3iv.A01();
                                                        int i9 = c3iv.A01.A00[C31O.A00(c31q2.readByte() & 255).typeId];
                                                        c3iv.A04(i9);
                                                        i7 += i9 + 1 + 2;
                                                    }
                                                    int A012 = c3iv.A01();
                                                    int i10 = i7 + 2;
                                                    for (int i11 = 0; i11 < A012; i11++) {
                                                        c3iv.A02();
                                                        C31O A00 = C31O.A00(c31q2.readByte());
                                                        c3iv.A04(c3iv.A01.A00[A00.typeId]);
                                                        i10 += c3iv.A01.A00[A00.typeId] + ((C31N) c3iv).A00 + 1;
                                                    }
                                                    int A013 = c3iv.A01();
                                                    C31O[] c31oArr = new C31O[A013];
                                                    i = i10 + 2;
                                                    for (int i12 = 0; i12 < A013; i12++) {
                                                        c3iv.A02();
                                                        c31oArr[i12] = C31O.A00(c31q2.readByte() & 255);
                                                        i += ((C31N) c3iv).A00 + 1;
                                                    }
                                                    C31L c31l = new C31L(A02, A022, c31oArr);
                                                    c3iv.A00.A00.put(Long.valueOf(c31l.A00), c31l);
                                                } else {
                                                    A02();
                                                    C31Q c31q3 = this.A02;
                                                    c31q3.readInt();
                                                    A02();
                                                    A02();
                                                    A02();
                                                    A02();
                                                    A02();
                                                    A02();
                                                    c31q3.readInt();
                                                    int A014 = A01();
                                                    int i13 = (this.A00 * 7) + 4 + 4 + 2;
                                                    for (int i14 = 0; i14 < A014; i14++) {
                                                        A01();
                                                        int i15 = this.A01.A00[C31O.A00(c31q3.readByte() & 255).typeId];
                                                        A04(i15);
                                                        i13 += i15 + 1 + 2;
                                                    }
                                                    int A015 = A01();
                                                    int i16 = i13 + 2;
                                                    for (int i17 = 0; i17 < A015; i17++) {
                                                        A02();
                                                        C31O A002 = C31O.A00(c31q3.readByte());
                                                        if (A002 == C31O.OBJECT) {
                                                            A02();
                                                        } else {
                                                            C3IX c3ix = (C3IX) c31q3;
                                                            int i18 = A002.size;
                                                            if (c3ix != null) {
                                                                c3ix.A00.AR5(new byte[i18]);
                                                                c3ix.A01.write(new byte[i18]);
                                                            } else {
                                                                throw null;
                                                            }
                                                        }
                                                        i16 += this.A01.A00[A002.typeId] + this.A00 + 1;
                                                    }
                                                    int A016 = A01();
                                                    i = i16 + 2;
                                                    for (int i19 = 0; i19 < A016; i19++) {
                                                        A02();
                                                        c31q3.readByte();
                                                        i += this.A00 + 1;
                                                    }
                                                }
                                                j = i;
                                                break;
                                            case 33:
                                                if (this instanceof C3IW) {
                                                    C3IW c3iw = (C3IW) this;
                                                    c3iw.A02();
                                                    C31Q c31q4 = c3iw.A02;
                                                    c31q4.readInt();
                                                    long A023 = c3iw.A02();
                                                    int readInt3 = c31q4.readInt();
                                                    C31M c31m = c3iw.A00;
                                                    if (c31m != null) {
                                                        ArrayList arrayList = new ArrayList();
                                                        C31L c31l2 = (C31L) c31m.A00.get(Long.valueOf(A023));
                                                        arrayList.add(c31l2);
                                                        while (c31l2.A01 != 0) {
                                                            c31l2 = (C31L) c31m.A00.get(Long.valueOf(c31l2.A01));
                                                            arrayList.add(c31l2);
                                                        }
                                                        Iterator it = arrayList.iterator();
                                                        while (it.hasNext()) {
                                                            for (C31O c31o : ((C31L) it.next()).A02) {
                                                                if (c31o == C31O.OBJECT) {
                                                                    c3iw.A02();
                                                                } else {
                                                                    C3IX c3ix2 = (C3IX) c31q4;
                                                                    int i20 = c31o.size;
                                                                    if (c3ix2 != null) {
                                                                        c3ix2.A00.AR5(new byte[i20]);
                                                                        c3ix2.A01.write(new byte[i20]);
                                                                    } else {
                                                                        throw null;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        int i21 = ((C31N) c3iw).A00;
                                                        i = i21 + 4 + i21 + 4 + readInt3;
                                                    } else {
                                                        throw null;
                                                    }
                                                } else {
                                                    A02();
                                                    C31Q c31q5 = this.A02;
                                                    c31q5.readInt();
                                                    A02();
                                                    int readInt4 = c31q5.readInt();
                                                    A04(readInt4);
                                                    int i22 = this.A00;
                                                    i = i22 + 4 + i22 + 4 + readInt4;
                                                }
                                                j = i;
                                                break;
                                            case 34:
                                                A02();
                                                c31q.readInt();
                                                int readInt5 = c31q.readInt();
                                                A02();
                                                int i23 = readInt5 * this.A00;
                                                A04(i23);
                                                int i24 = this.A00;
                                                j = i24 + 4 + 4 + i24 + i23;
                                                break;
                                            case 35:
                                                i = A00();
                                                j = i;
                                                break;
                                            default:
                                                switch (readByte2) {
                                                    case 137:
                                                    case 138:
                                                    case 139:
                                                    case 140:
                                                    case 141:
                                                        break;
                                                    case 142:
                                                        A02();
                                                        c31q.readInt();
                                                        c31q.readInt();
                                                        i3 = this.A00;
                                                        i2 = i3 + 4;
                                                        break;
                                                    default:
                                                        StringBuilder A0Q = C000200d.A0Q("loadHeapDump loop with unknown tag ", readByte2, " with ");
                                                        A0Q.append(c31q.ARH());
                                                        A0Q.append(" bytes possibly remaining");
                                                        throw new IllegalArgumentException(A0Q.toString());
                                                }
                                                j = i;
                                                break;
                                        }
                                }
                                readInt2 = j2 - j;
                            }
                            i = i2 + 4;
                            j = i;
                            readInt2 = j2 - j;
                        } else {
                            System.err.println("+--- PRIMITIVE ARRAY NODATA DUMP");
                            A00();
                            throw new IllegalArgumentException("Don't know how to load a nodata array");
                        }
                    }
                    A04(this.A00);
                    i = this.A00;
                    j = i;
                    readInt2 = j2 - j;
                }
                continue;
            }
        }
    }

    public void A04(long j) {
        C31Q c31q = this.A02;
        c31q.ATe(c31q.position() + j);
    }
}
