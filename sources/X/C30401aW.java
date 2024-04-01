package X;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;

/* renamed from: X.1aW  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30401aW implements C0HQ {
    public final /* synthetic */ SignInHubActivity A00;

    @Override // X.C0HQ
    public final void ALZ(C13930m5 c13930m5) {
    }

    public C30401aW(SignInHubActivity signInHubActivity) {
        this.A00 = signInHubActivity;
    }

    @Override // X.C0HQ
    public final C13930m5 AJ7(int i, Bundle bundle) {
        SignInHubActivity signInHubActivity = this.A00;
        Set set = C0NE.A00;
        synchronized (set) {
        }
        return new C39501qE(signInHubActivity, set);
    }

    @Override // X.C0HQ
    public final /* synthetic */ void ALT(C13930m5 c13930m5, Object obj) {
        SignInHubActivity signInHubActivity = this.A00;
        signInHubActivity.setResult(signInHubActivity.A00, signInHubActivity.A01);
        signInHubActivity.finish();
    }
}
