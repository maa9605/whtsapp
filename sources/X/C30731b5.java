package X;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* renamed from: X.1b5  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30731b5 implements AnonymousClass141 {
    public final /* synthetic */ C0NE A00;
    public final /* synthetic */ C39571qL A01;
    public final /* synthetic */ C30691b1 A02;
    public final /* synthetic */ boolean A03;

    public C30731b5(C30691b1 c30691b1, C39571qL c39571qL, boolean z, C0NE c0ne) {
        this.A02 = c30691b1;
        this.A01 = c39571qL;
        this.A03 = z;
        this.A00 = c0ne;
    }

    @Override // X.AnonymousClass141
    public final void AO4(C08H c08h) {
        Status status = (Status) c08h;
        C30691b1 c30691b1 = this.A02;
        C13U A00 = C13U.A00(c30691b1.A07);
        String A04 = A00.A04("defaultGoogleSignInAccount");
        A00.A05("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(A04)) {
            A00.A05(C13U.A01("googleSignInAccount", A04));
            A00.A05(C13U.A01("googleSignInOptions", A04));
        }
        if (status.A01 <= 0 && c30691b1.A0B()) {
            c30691b1.A0A();
            c30691b1.A09();
        }
        A07(status);
        if (this.A03) {
            this.A00.A0A();
        }
    }
}
