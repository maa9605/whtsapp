package X;

import android.os.Handler;

/* renamed from: X.0Bs */
/* loaded from: classes.dex */
public class C02510Bs implements InterfaceC02360Aw {
    public static final C02510Bs A08 = new C02510Bs();
    public Handler A02;
    public int A01 = 0;
    public int A00 = 0;
    public boolean A05 = true;
    public boolean A06 = true;
    public final C02520Bt A07 = new C02520Bt(this);
    public Runnable A04 = new Runnable() { // from class: X.0By
        {
            C02510Bs.this = this;
        }

        @Override // java.lang.Runnable
        public void run() {
            C02510Bs c02510Bs = C02510Bs.this;
            if (c02510Bs.A00 == 0) {
                c02510Bs.A05 = true;
                c02510Bs.A07.A05(C0C1.ON_PAUSE);
            }
            if (c02510Bs.A01 == 0 && c02510Bs.A05) {
                c02510Bs.A07.A05(C0C1.ON_STOP);
                c02510Bs.A06 = true;
            }
        }
    };
    public C0C0 A03 = new C02580Bz(this);

    public void A00() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i == 1) {
            if (!this.A05) {
                this.A02.removeCallbacks(this.A04);
                return;
            }
            this.A07.A05(C0C1.ON_RESUME);
            this.A05 = false;
        }
    }

    @Override // X.InterfaceC02360Aw
    public AbstractC02530Bu AAs() {
        return this.A07;
    }
}
