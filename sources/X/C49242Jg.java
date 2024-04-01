package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.2Jg */
/* loaded from: classes2.dex */
public class C49242Jg {
    public C44651zQ A00;
    public C24M A01;
    public Integer A02;
    public List A03;
    public byte[] A04;
    public byte[] A05;
    public final String A06;
    public final List A07;
    public final byte[] A08;

    public C49242Jg(String str) {
        List emptyList = Collections.emptyList();
        this.A06 = str;
        this.A07 = emptyList;
        this.A08 = null;
    }

    public C49242Jg(String str, List list, byte[] bArr) {
        this.A06 = str;
        this.A07 = list;
        this.A08 = bArr;
    }

    public C24K A00() {
        if (this.A03 == null && this.A01 == null) {
            return new C24K(this.A06, this.A07, null, this.A08);
        }
        C0CT AVX = C24L.A09.AVX();
        List list = this.A03;
        if (list != null) {
            AVX.A02();
            C24L c24l = (C24L) AVX.A00;
            C0CX c0cx = c24l.A04;
            if (!((C0CY) c0cx).A00) {
                c24l.A04 = C0AZ.A05(c0cx);
            }
            C0Aa.A08(list, c24l.A04);
        } else {
            C24M c24m = this.A01;
            if (c24m != null) {
                AVX.A02();
                C24L c24l2 = (C24L) AVX.A00;
                c24l2.A06 = c24m;
                c24l2.A00 |= 2;
            }
        }
        if (this.A00 != null) {
            C0CT AVX2 = C24Z.A02.AVX();
            C0AN A00 = C0AN.A00(this.A00.A00);
            AVX2.A02();
            C24Z c24z = (C24Z) AVX2.A00;
            c24z.A00 |= 1;
            c24z.A01 = A00;
            AVX.A02();
            C24L c24l3 = (C24L) AVX.A00;
            if (c24l3 != null) {
                c24l3.A07 = (C24Z) AVX2.A01();
                c24l3.A00 |= 16;
            } else {
                throw null;
            }
        }
        byte[] bArr = this.A05;
        if (bArr != null) {
            C0AN A01 = C0AN.A01(bArr, 0, bArr.length);
            AVX.A02();
            C24L c24l4 = (C24L) AVX.A00;
            c24l4.A00 |= 4;
            c24l4.A03 = A01;
        }
        byte[] bArr2 = this.A04;
        if (bArr2 != null) {
            C0AN A012 = C0AN.A01(bArr2, 0, bArr2.length);
            AVX.A02();
            C24L c24l5 = (C24L) AVX.A00;
            c24l5.A00 |= 8;
            c24l5.A02 = A012;
        }
        Integer num = this.A02;
        if (num != null) {
            int intValue = num.intValue();
            AVX.A02();
            C24L c24l6 = (C24L) AVX.A00;
            c24l6.A00 |= 64;
            c24l6.A01 = intValue;
        }
        return new C24K(this.A06, this.A07, (C24L) AVX.A01(), this.A08);
    }
}
