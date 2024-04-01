package X;

import android.util.Log;
import java.util.AbstractCollection;

/* renamed from: X.1pi  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC39181pi implements C1Z6 {
    public int A00;
    public int A01;
    public long A02;
    public C21180yv A03;
    public InterfaceC220210s A04;
    public boolean A05 = true;
    public boolean A06;
    public C21030yg[] A07;
    public final int A08;

    public int A04() {
        return 0;
    }

    public abstract int A05(C21030yg c21030yg);

    public void A07() {
    }

    public void A08() {
    }

    public abstract void A09();

    public abstract void A0A(long j, boolean z);

    public void A0B(boolean z) {
    }

    public abstract void A0C(C21030yg[] c21030ygArr, long j);

    @Override // X.C1Z6
    public final AbstractC39181pi A8n() {
        return this;
    }

    @Override // X.C1Z6
    public InterfaceC223312a AB9() {
        return null;
    }

    @Override // X.InterfaceC21150ys
    public void AEG(int i, Object obj) {
    }

    @Override // X.C1Z6
    public /* synthetic */ void ATY(float f) {
    }

    public AbstractC39181pi(int i) {
        this.A08 = i;
    }

    public static boolean A03(InterfaceC21720zn interfaceC21720zn, C21690zk c21690zk) {
        if (c21690zk == null) {
            return true;
        }
        if (interfaceC21720zn == null) {
            return false;
        }
        if (((AbstractCollection) C1ZO.A00(c21690zk)).isEmpty()) {
            if (c21690zk.A01 != 1 || !c21690zk.A03[0].A00(C20910yU.A01)) {
                return false;
            }
            StringBuilder sb = new StringBuilder("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
            sb.append((Object) null);
            Log.w("DefaultDrmSessionMgr", sb.toString());
        }
        String str = c21690zk.A02;
        return str == null || "cenc".equals(str) || !("cbc1".equals(str) || "cbcs".equals(str) || "cens".equals(str)) || C08M.A00 >= 25;
    }

    public final int A06(C21040yh c21040yh, C1ZK c1zk, boolean z) {
        int AR6 = this.A04.AR6(c21040yh, c1zk, z);
        if (AR6 == -4) {
            if (!c1zk.A01()) {
                c1zk.A00 += this.A02;
            } else {
                this.A05 = true;
                return !this.A06 ? -3 : -4;
            }
        } else if (AR6 == -5) {
            C21030yg c21030yg = c21040yh.A00;
            long j = c21030yg.A0G;
            if (j != Long.MAX_VALUE) {
                c21040yh.A00 = new C21030yg(c21030yg.A0M, c21030yg.A0N, c21030yg.A0L, c21030yg.A0P, c21030yg.A0K, c21030yg.A04, c21030yg.A09, c21030yg.A0F, c21030yg.A08, c21030yg.A01, c21030yg.A0B, c21030yg.A02, c21030yg.A0R, c21030yg.A0E, c21030yg.A0J, c21030yg.A05, c21030yg.A0C, c21030yg.A0A, c21030yg.A06, c21030yg.A07, c21030yg.A0D, c21030yg.A0O, c21030yg.A03, j + this.A02, c21030yg.A0Q, c21030yg.A0H, c21030yg.A0I);
                return AR6;
            }
        }
        return AR6;
    }

    @Override // X.C1Z6
    public final void A7D() {
        C002701i.A1K(this.A01 == 1);
        this.A01 = 0;
        this.A04 = null;
        this.A07 = null;
        this.A06 = false;
        A09();
    }

    @Override // X.C1Z6
    public final void A7Y(C21180yv c21180yv, C21030yg[] c21030ygArr, InterfaceC220210s interfaceC220210s, long j, boolean z, long j2) {
        C002701i.A1K(this.A01 == 0);
        this.A03 = c21180yv;
        this.A01 = 1;
        A0B(z);
        C002701i.A1K(!this.A06);
        this.A04 = interfaceC220210s;
        this.A05 = false;
        this.A07 = c21030ygArr;
        this.A02 = j2;
        A0C(c21030ygArr, j2);
        A0A(j, z);
    }

    @Override // X.C1Z6
    public final int ADF() {
        return this.A01;
    }

    @Override // X.C1Z6
    public final InterfaceC220210s ADI() {
        return this.A04;
    }

    @Override // X.C1Z6
    public final int ADa() {
        return this.A08;
    }

    @Override // X.C1Z6
    public final boolean AEW() {
        return this.A05;
    }

    @Override // X.C1Z6
    public final boolean AFC() {
        return this.A06;
    }

    @Override // X.C1Z6
    public final void AGV() {
        this.A04.AGS();
    }

    @Override // X.C1Z6
    public final void ARY(C21030yg[] c21030ygArr, InterfaceC220210s interfaceC220210s, long j) {
        C002701i.A1K(!this.A06);
        this.A04 = interfaceC220210s;
        this.A05 = false;
        this.A07 = c21030ygArr;
        this.A02 = j;
        A0C(c21030ygArr, j);
    }

    @Override // X.C1Z6
    public final void ARm(long j) {
        this.A06 = false;
        this.A05 = false;
        A0A(j, false);
    }

    @Override // X.C1Z6
    public final void ASw() {
        this.A06 = true;
    }

    @Override // X.C1Z6
    public final void AT9(int i) {
        this.A00 = i;
    }

    @Override // X.C1Z6
    public final void start() {
        C002701i.A1K(this.A01 == 1);
        this.A01 = 2;
        A07();
    }

    @Override // X.C1Z6
    public final void stop() {
        C002701i.A1K(this.A01 == 2);
        this.A01 = 1;
        A08();
    }
}
