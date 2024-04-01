package X;

import com.whatsapp.util.Log;

/* renamed from: X.4CV */
/* loaded from: classes3.dex */
public class C4CV implements C28T {
    public static volatile C4CV A04;
    public Integer A00;
    public final AnonymousClass011 A01;
    public final C90564Bm A02;
    public final C2Lw A03;

    public C4CV(AnonymousClass011 anonymousClass011, C2Lw c2Lw, C90564Bm c90564Bm) {
        this.A01 = anonymousClass011;
        this.A03 = c2Lw;
        this.A02 = c90564Bm;
    }

    public static C4CV A00() {
        if (A04 == null) {
            synchronized (C4CV.class) {
                if (A04 == null) {
                    A04 = new C4CV(AnonymousClass011.A00(), C2Lw.A00(), C90564Bm.A00());
                }
            }
        }
        return A04;
    }

    public C36971lf A01(int i) {
        C2Lw c2Lw = this.A03;
        String str = c2Lw.A02;
        if (str == null) {
            str = c2Lw.A02();
        }
        C36971lf c36971lf = new C36971lf();
        c36971lf.A00 = this.A00;
        c36971lf.A07 = str;
        c36971lf.A03 = Long.valueOf(c2Lw.A01());
        c36971lf.A02 = Integer.valueOf(i);
        return c36971lf;
    }

    public final C36971lf A02(int i, C28Q c28q) {
        int i2;
        C36971lf A01 = A01(i);
        A04(this.A02.A03());
        if (c28q != null) {
            A01.A05 = String.valueOf(c28q.A00);
            A01.A06 = c28q.A06;
            i2 = 2;
        } else {
            i2 = 1;
        }
        A01.A01 = Integer.valueOf(i2);
        return A01;
    }

    public void A03(int i, C0N2 c0n2, C28Q c28q) {
        C36971lf A02 = A02(i, c28q);
        C0N0 c0n0 = c0n2.A06;
        A02.A04 = c0n0 == null ? "" : ((C4IA) c0n0).A09;
        StringBuilder A0P = C000200d.A0P("PAY: PaymentWamEvent event:");
        A0P.append(A02.toString());
        Log.i(A0P.toString());
        this.A01.A0B(A02, null, false);
    }

    public void A04(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 81882) {
                if (hashCode != 2023329) {
                    if (hashCode == 2212537 && str.equals("HDFC")) {
                        this.A00 = 2;
                        return;
                    }
                } else if (str.equals("AXIS")) {
                    this.A00 = 3;
                    return;
                }
            } else if (str.equals("SBI")) {
                this.A00 = 4;
                return;
            }
            this.A00 = 1;
            return;
        }
        this.A00 = 1;
    }

    @Override // X.C28T
    public void AG6(int i, C28Q c28q) {
        C36971lf A02 = A02(i, c28q);
        StringBuilder A0P = C000200d.A0P("PAY: PaymentWamEvent event: ");
        A0P.append(A02.toString());
        Log.i(A0P.toString());
        this.A01.A0B(A02, null, false);
    }

    @Override // X.C28T
    public void AKk(C28Q c28q) {
        AG6(12, c28q);
    }

    @Override // X.C28T
    public void AKp(C28Q c28q) {
        AG6(10, c28q);
    }

    @Override // X.C28T
    public void AKq(C28Q c28q) {
        AG6(11, c28q);
    }

    @Override // X.C28T
    public void AV3() {
        this.A03.A04();
    }

    @Override // X.C28T
    public void reset() {
        this.A03.A03();
    }
}
