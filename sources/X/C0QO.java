package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0QO */
/* loaded from: classes.dex */
public class C0QO {
    public int A00;
    public int A01;
    public InterfaceC48122Dw A02;
    public boolean A03;
    public boolean A04;
    public final C48942Hm A05;
    public final C48932Hl A06;
    public final File A07;
    public final RandomAccessFile A08;

    /* JADX WARN: Removed duplicated region for block: B:71:0x008e A[Catch: 2Ho -> 0x00d4, TRY_ENTER, TRY_LEAVE, TryCatch #1 {2Ho -> 0x00d4, blocks: (B:71:0x008e, B:74:0x0096, B:77:0x00c8, B:72:0x0091), top: B:91:0x0070, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c8 A[Catch: 2Ho -> 0x00d4, TryCatch #1 {2Ho -> 0x00d4, blocks: (B:71:0x008e, B:74:0x0096, B:77:0x00c8, B:72:0x0091), top: B:91:0x0070, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0QO(java.io.File r20, int r21, int r22, int r23, boolean r24, int r25, X.C006002r r26) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QO.<init>(java.io.File, int, int, int, boolean, int, X.02r):void");
    }

    public C0QO(File file, int i, int i2, boolean z, int i3, C006002r c006002r) {
        this(file, C2Hq.A00(), i, i2, z, i3, c006002r);
    }

    public final int A00() {
        return A06().A00();
    }

    public final int A01() {
        return this.A02.ABZ(this.A06.A01);
    }

    public final int A02() {
        return A06().A01();
    }

    public final int A03() {
        return A06().A03();
    }

    public final long A04() {
        return A06().A04();
    }

    public final C006402v A05(int i) {
        return A06().A05(i);
    }

    public final C2Hr A06() {
        return this.A02.A72();
    }

    public Integer A07() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) / 86400;
        C48932Hl c48932Hl = this.A06;
        if (seconds != c48932Hl.A03) {
            int i = this.A00;
            if (i == 0) {
                A0A();
            } else if (new Random().nextInt(i) == 0) {
                A0B();
            } else {
                A0A();
            }
            c48932Hl.A03 = seconds;
        }
        if (c48932Hl.A04) {
            return A08();
        }
        return null;
    }

    public final Integer A08() {
        C48932Hl c48932Hl = this.A06;
        int i = c48932Hl.A02 + 1;
        if (i <= 0) {
            A0A();
        }
        if (c48932Hl.A04) {
            c48932Hl.A02 = i;
            return Integer.valueOf(i);
        }
        return null;
    }

    public final Iterable A09() {
        return A06().A06();
    }

    public final void A0A() {
        C48932Hl c48932Hl = this.A06;
        c48932Hl.A02 = 0;
        c48932Hl.A04 = false;
    }

    public final void A0B() {
        C48932Hl c48932Hl = this.A06;
        c48932Hl.A02 = 0;
        c48932Hl.A04 = true;
    }

    public final void A0C() {
        if (this.A04) {
            if (!this.A02.A7s()) {
                Log.e("wambuffer: PERSISTENCE TURNED OFF");
                this.A04 = false;
                return;
            }
            try {
                this.A05.A02();
                this.A03 = false;
            } catch (IOException unused) {
                throw null;
            }
        }
    }

    public final void A0D() {
        C48932Hl c48932Hl = this.A06;
        c48932Hl.A01 = 0;
        c48932Hl.A00 = 0;
        c48932Hl.A04 = false;
        c48932Hl.A03 = 0L;
        c48932Hl.A02 = 0;
        this.A02.A69();
    }

    public final void A0E() {
        if (!A0K()) {
            if (A0J()) {
                Locale locale = Locale.US;
                C48932Hl c48932Hl = this.A06;
                Log.i(String.format(locale, "wambuffer/rotate: rotated event buffer %d: size = %d, event count = %d, timestamp = %d", Integer.valueOf(c48932Hl.A01), Integer.valueOf(A06().A02()), Integer.valueOf(A00()), Long.valueOf(A04())));
                c48932Hl.A01 = A01();
                this.A02.AG3();
                this.A03 = true;
                return;
            }
            throw new Error("Rotation failed since there is no empty buffer");
        }
        throw new Error("Rotation failed since the current event buffer is empty");
    }

    public final void A0F(int i) {
        try {
            this.A05.A04(i);
            this.A02.AEr();
        } catch (C2Hs e) {
            throw new C48952Ho(e.toString());
        }
    }

    public final void A0G(C0SN c0sn, C0SQ c0sq) {
        A06().A0A(c0sn, c0sq, C48962Ht.A00());
    }

    public final void A0H(RandomAccessFile randomAccessFile, int i) {
        A0I(randomAccessFile, i);
        try {
            this.A05.A02();
            Log.i("wambuffer/initnewfile: successfully created new WAM file");
        } catch (IOException e) {
            throw new C48952Ho(e.toString());
        }
    }

    public final void A0I(RandomAccessFile randomAccessFile, int i) {
        int i2;
        try {
            int i3 = this.A01;
            if (i3 == 0) {
                i2 = 65536;
            } else {
                i2 = 32768;
                if (i3 == 1) {
                    i2 = 16384;
                }
            }
            randomAccessFile.setLength((i2 * i) + 65536);
        } catch (IOException unused) {
            throw null;
        }
    }

    public boolean A0J() {
        return this.A02.A5w();
    }

    public final boolean A0K() {
        return A06().A0C();
    }
}
