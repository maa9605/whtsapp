package X;

import android.util.Base64;

/* renamed from: X.2Rn  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C50392Rn implements C0J1 {
    public static volatile C50392Rn A01;
    public final C40411sD A00;

    @Override // X.C0J1
    public boolean A77(long j) {
        return true;
    }

    @Override // X.C0J1
    public boolean AS8(C19920wU c19920wU) {
        return true;
    }

    public C50392Rn(C40411sD c40411sD) {
        this.A00 = c40411sD;
    }

    @Override // X.C0J1
    public C19920wU AG9(String str, int i) {
        C0DC c0dc;
        switch (i) {
            case 0:
                c0dc = C0DC.A0A;
                break;
            case 1:
                c0dc = C0DC.A0D;
                break;
            case 2:
                c0dc = C0DC.A05;
                break;
            case 3:
                c0dc = C0DC.A07;
                break;
            case 4:
                c0dc = C0DC.A0N;
                break;
            case 5:
                c0dc = C0DC.A04;
                break;
            case 6:
                c0dc = C0DC.A0I;
                break;
            case 7:
            default:
                c0dc = null;
                break;
            case 8:
                c0dc = C0DC.A0E;
                break;
            case 9:
                c0dc = C0DC.A0F;
                break;
        }
        C42481vo A09 = this.A00.A09(str, c0dc != null ? c0dc.A00 : (byte) 0, false);
        if (A09 != null) {
            byte[] decode = Base64.decode(str, 0);
            byte[] decode2 = Base64.decode(A09.A03, 0);
            int A05 = C02180Ae.A05(C0DC.A01(A09.A00, 0));
            C09H c09h = A09.A02;
            return new C19920wU(decode, decode2, A05, c09h.A0U, c09h.A0B / 1000, c09h.A0G, A09.A04);
        }
        return null;
    }
}
