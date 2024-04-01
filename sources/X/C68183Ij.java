package X;

import android.os.Bundle;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.util.Log;

/* renamed from: X.3Ij  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C68183Ij implements InterfaceC470229f {
    public int A00 = -1;
    public final /* synthetic */ RestoreFromBackupActivity A01;

    @Override // X.InterfaceC470229f
    public final void AGu(boolean z) {
    }

    @Override // X.InterfaceC470229f
    public final void AHk() {
    }

    @Override // X.InterfaceC470229f
    public final void AHl(boolean z) {
    }

    @Override // X.InterfaceC470229f
    public final void AHm(long j, long j2) {
    }

    @Override // X.InterfaceC470229f
    public final void AHn(long j, long j2) {
    }

    @Override // X.InterfaceC470229f
    public final void AHo(long j, long j2) {
    }

    @Override // X.InterfaceC470229f
    public final void AHp(long j, long j2) {
    }

    @Override // X.InterfaceC470229f
    public final void AHq(long j, long j2) {
    }

    @Override // X.InterfaceC470229f
    public final void AHr(int i) {
    }

    @Override // X.InterfaceC470229f
    public final void AHs() {
    }

    @Override // X.InterfaceC470229f
    public final void AHt(long j, long j2) {
    }

    @Override // X.InterfaceC470229f
    public final void AHu() {
    }

    @Override // X.InterfaceC470229f
    public final void AK1(int i, Bundle bundle) {
    }

    @Override // X.InterfaceC470229f
    public final void AK2(int i, Bundle bundle) {
    }

    @Override // X.InterfaceC470229f
    public final void ALq() {
    }

    @Override // X.InterfaceC470229f
    public final void ALr(boolean z, long j, long j2) {
    }

    @Override // X.InterfaceC470229f
    public final void ALs(long j, long j2) {
    }

    @Override // X.InterfaceC470229f
    public final void ALt(long j, long j2) {
    }

    @Override // X.InterfaceC470229f
    public final void ALu(long j, long j2) {
    }

    @Override // X.InterfaceC470229f
    public final void ALv(long j, long j2) {
    }

    @Override // X.InterfaceC470229f
    public final void ALw(long j, long j2) {
    }

    @Override // X.InterfaceC470229f
    public final void ALx(int i) {
    }

    @Override // X.InterfaceC470229f
    public final void ALy() {
    }

    @Override // X.InterfaceC470229f
    public final void ALz(long j, long j2, long j3) {
    }

    @Override // X.InterfaceC470229f
    public final void AOM() {
    }

    @Override // X.InterfaceC470229f
    public final void AQ8() {
    }

    public C68183Ij(RestoreFromBackupActivity restoreFromBackupActivity) {
        this.A01 = restoreFromBackupActivity;
    }

    @Override // X.InterfaceC470229f
    public void AK3(int i, Bundle bundle) {
        StringBuilder A0P = C000200d.A0P("gdrive-activity-observer/msgstore-download-error/");
        A0P.append(C40061rW.A04(i));
        Log.i(A0P.toString());
        C018508q c018508q = ((ActivityC02290Ap) this.A01).A0A;
        c018508q.A02.post(new RunnableEBaseShape1S0201000_I1(this, i, bundle, 0));
    }

    @Override // X.InterfaceC470229f
    public void AMC(boolean z) {
        C000200d.A1N(C000200d.A0P("gdrive-activity-observer/msgstore-download-finished/"), z ? "successful" : "failed");
        RestoreFromBackupActivity restoreFromBackupActivity = this.A01;
        int A05 = ((ActivityC02290Ap) restoreFromBackupActivity).A0F.A05();
        if (A05 == 10) {
            ((ActivityC02290Ap) restoreFromBackupActivity).A0A.A02.post(new RunnableEBaseShape1S0110000_I1(this, z, 0));
            return;
        }
        StringBuilder A0P = C000200d.A0P("gdrive-activity-observer/msgstore-download-finished/get-error/");
        A0P.append(C40061rW.A04(A05));
        Log.i(A0P.toString());
    }

    @Override // X.InterfaceC470229f
    public void AMD(long j, long j2) {
        int i = (int) ((100 * j) / j2);
        if (i - this.A00 > 0) {
            this.A00 = i;
            if (i % 10 == 0) {
                StringBuilder A0S = C000200d.A0S("gdrive-activity-observer/msgstore-download-progress:", j, "/");
                A0S.append(j2);
                A0S.append(" ");
                A0S.append(i);
                C000200d.A1N(A0S, "%");
            }
            C018508q c018508q = ((ActivityC02290Ap) this.A01).A0A;
            c018508q.A02.post(new RunnableC55542ln(this, i, j, j2));
        }
    }

    @Override // X.InterfaceC470229f
    public void AME() {
        C018508q c018508q = ((ActivityC02290Ap) this.A01).A0A;
        c018508q.A02.post(new RunnableEBaseShape8S0100000_I1_0(this, 1));
    }
}
