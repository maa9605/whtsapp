package X;

import android.util.Base64;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.1up */
/* loaded from: classes2.dex */
public class C41981up {
    public static volatile C41981up A05;
    public C42851wQ A00;
    public final C01B A01;
    public final C003701t A02;
    public final C018808t A03;
    public final C02O A04;

    public C41981up(C003701t c003701t, C01B c01b, C018808t c018808t, C02O c02o) {
        this.A02 = c003701t;
        this.A01 = c01b;
        this.A03 = c018808t;
        this.A04 = c02o;
    }

    public static C41981up A00() {
        if (A05 == null) {
            synchronized (C41981up.class) {
                if (A05 == null) {
                    A05 = new C41981up(C003701t.A00(), C01B.A00(), C018808t.A00(), C02O.A00());
                }
            }
        }
        return A05;
    }

    public synchronized C42851wQ A01() {
        C42851wQ c42851wQ;
        c42851wQ = this.A00;
        if (c42851wQ == null) {
            c42851wQ = new C42851wQ(this.A04);
            this.A00 = c42851wQ;
        }
        return c42851wQ;
    }

    public void A02(String str, boolean z) {
        C42851wQ A01 = A01();
        if (A01 != null) {
            byte[] decode = Base64.decode(str, 0);
            A01.A07 = decode;
            if (decode.length == 64) {
                byte[] bArr = new byte[32];
                A01.A05 = bArr;
                A01.A06 = new byte[32];
                System.arraycopy(decode, 0, bArr, 0, 32);
                System.arraycopy(A01.A07, 32, A01.A06, 0, 32);
            }
            if (z) {
                A01.A02("key", str);
                return;
            }
            return;
        }
        throw null;
    }

    public boolean A03() {
        return A01().A02 != null;
    }

    public boolean A04() {
        return A01().A03 != null;
    }

    public byte[] A05() {
        EnumC42931wZ enumC42931wZ = EnumC42931wZ.DEVELOPMENT;
        EnumC42931wZ enumC42931wZ2 = EnumC42931wZ.PRODUCTION;
        EnumC42931wZ enumC42931wZ3 = EnumC42931wZ.FORCE_UPGRADE;
        C0CT AVX = C42941wa.A0h.AVX();
        AVX.A02();
        C42941wa c42941wa = (C42941wa) AVX.A00;
        c42941wa.A01 |= 4;
        c42941wa.A0C = enumC42931wZ3.value;
        AVX.A02();
        C42941wa c42941wa2 = (C42941wa) AVX.A00;
        c42941wa2.A01 |= 64;
        c42941wa2.A0H = enumC42931wZ3.value;
        AVX.A02();
        C42941wa c42941wa3 = (C42941wa) AVX.A00;
        c42941wa3.A01 |= 16;
        c42941wa3.A04 = enumC42931wZ3.value;
        AVX.A02();
        C42941wa c42941wa4 = (C42941wa) AVX.A00;
        c42941wa4.A01 |= 4096;
        c42941wa4.A0G = enumC42931wZ3.value;
        AVX.A02();
        C42941wa c42941wa5 = (C42941wa) AVX.A00;
        c42941wa5.A01 |= 2048;
        c42941wa5.A0V = enumC42931wZ3.value;
        AVX.A02();
        C42941wa c42941wa6 = (C42941wa) AVX.A00;
        c42941wa6.A01 |= 134217728;
        c42941wa6.A0Y = enumC42931wZ2.value;
        AVX.A02();
        C42941wa c42941wa7 = (C42941wa) AVX.A00;
        c42941wa7.A01 |= 268435456;
        c42941wa7.A0X = enumC42931wZ2.value;
        AVX.A02();
        C42941wa c42941wa8 = (C42941wa) AVX.A00;
        c42941wa8.A01 |= 256;
        c42941wa8.A0e = enumC42931wZ3.value;
        AVX.A02();
        C42941wa c42941wa9 = (C42941wa) AVX.A00;
        c42941wa9.A01 |= 2;
        c42941wa9.A0f = enumC42931wZ3.value;
        AVX.A02();
        C42941wa c42941wa10 = (C42941wa) AVX.A00;
        c42941wa10.A01 |= 524288;
        c42941wa10.A0g = enumC42931wZ.value;
        AVX.A02();
        C42941wa c42941wa11 = (C42941wa) AVX.A00;
        c42941wa11.A01 |= 67108864;
        c42941wa11.A0d = enumC42931wZ.value;
        AVX.A02();
        C42941wa c42941wa12 = (C42941wa) AVX.A00;
        c42941wa12.A01 |= EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
        c42941wa12.A03 = enumC42931wZ3.value;
        AVX.A02();
        C42941wa c42941wa13 = (C42941wa) AVX.A00;
        c42941wa13.A01 |= 1024;
        c42941wa13.A0L = enumC42931wZ3.value;
        AVX.A02();
        C42941wa c42941wa14 = (C42941wa) AVX.A00;
        c42941wa14.A01 |= 65536;
        c42941wa14.A0c = enumC42931wZ3.value;
        AVX.A02();
        C42941wa c42941wa15 = (C42941wa) AVX.A00;
        c42941wa15.A01 |= 128;
        c42941wa15.A0N = enumC42931wZ3.value;
        AVX.A02();
        C42941wa c42941wa16 = (C42941wa) AVX.A00;
        c42941wa16.A01 |= C42271vT.A09;
        c42941wa16.A0b = enumC42931wZ3.value;
        C01B c01b = this.A01;
        if (c01b.A0E(C01C.A12)) {
            AVX.A02();
            C42941wa c42941wa17 = (C42941wa) AVX.A00;
            c42941wa17.A01 |= 4194304;
            c42941wa17.A0D = enumC42931wZ3.value;
        }
        if (c01b.A0E(C01C.A0u)) {
            AVX.A02();
            C42941wa c42941wa18 = (C42941wa) AVX.A00;
            c42941wa18.A01 |= 2097152;
            c42941wa18.A08 = enumC42931wZ3.value;
        }
        AVX.A02();
        C42941wa c42941wa19 = (C42941wa) AVX.A00;
        c42941wa19.A01 |= 1048576;
        c42941wa19.A0Z = enumC42931wZ3.value;
        AVX.A02();
        C42941wa c42941wa20 = (C42941wa) AVX.A00;
        c42941wa20.A01 |= 16384;
        c42941wa20.A0K = enumC42931wZ3.value;
        if (c01b.A0E(C01C.A0n)) {
            AVX.A02();
            C42941wa c42941wa21 = (C42941wa) AVX.A00;
            c42941wa21.A01 |= 536870912;
            c42941wa21.A07 = enumC42931wZ2.value;
        }
        AVX.A02();
        C42941wa c42941wa22 = (C42941wa) AVX.A00;
        c42941wa22.A01 |= 1073741824;
        c42941wa22.A05 = enumC42931wZ3.value;
        if (c01b.A0E(C01C.A29)) {
            AVX.A02();
            C42941wa c42941wa23 = (C42941wa) AVX.A00;
            c42941wa23.A02 |= 1;
            c42941wa23.A0Q = enumC42931wZ2.value;
        }
        if (c01b.A0E(C01C.A2J)) {
            AVX.A02();
            C42941wa c42941wa24 = (C42941wa) AVX.A00;
            c42941wa24.A01 |= 33554432;
            c42941wa24.A0T = enumC42931wZ2.value;
        }
        if (c01b.A0E(C01C.A2T)) {
            AVX.A02();
            C42941wa c42941wa25 = (C42941wa) AVX.A00;
            c42941wa25.A02 |= 2;
            c42941wa25.A0a = enumC42931wZ2.value;
        }
        if (this.A03.A01()) {
            AVX.A02();
            C42941wa c42941wa26 = (C42941wa) AVX.A00;
            c42941wa26.A02 |= 4;
            c42941wa26.A0W = enumC42931wZ2.value;
        }
        if (c01b.A0E(C01C.A16)) {
            AVX.A02();
            C42941wa c42941wa27 = (C42941wa) AVX.A00;
            c42941wa27.A02 |= 8;
            c42941wa27.A0A = enumC42931wZ3.value;
        }
        C003701t c003701t = this.A02;
        if (c003701t.A0C(308)) {
            AVX.A02();
            C42941wa c42941wa28 = (C42941wa) AVX.A00;
            c42941wa28.A02 |= 16;
            c42941wa28.A09 = enumC42931wZ.value;
        }
        if (c01b.A0E(C01C.A0j)) {
            AVX.A02();
            C42941wa c42941wa29 = (C42941wa) AVX.A00;
            c42941wa29.A02 |= 32;
            c42941wa29.A0S = enumC42931wZ.value;
            AVX.A02();
            C42941wa c42941wa30 = (C42941wa) AVX.A00;
            c42941wa30.A02 |= 64;
            c42941wa30.A00 = enumC42931wZ.value;
        }
        if (c003701t.A0C(432)) {
            AVX.A02();
            C42941wa c42941wa31 = (C42941wa) AVX.A00;
            c42941wa31.A02 |= 128;
            c42941wa31.A06 = enumC42931wZ2.value;
        }
        if (c003701t.A0C(495)) {
            AVX.A02();
            C42941wa c42941wa32 = (C42941wa) AVX.A00;
            c42941wa32.A02 |= 256;
            c42941wa32.A0I = enumC42931wZ3.value;
        }
        return AVX.A01().A0B();
    }
}
