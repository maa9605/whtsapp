package X;

import android.content.Intent;
import android.os.SystemClock;
import com.google.android.search.verification.client.R;
import com.whatsapp.HomeActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.35O  reason: invalid class name */
/* loaded from: classes2.dex */
public class C35O extends C0HS {
    public final long A00 = SystemClock.elapsedRealtime();
    public final C018608r A01;
    public final AbstractC005302j A02;
    public final WeakReference A03;
    public final boolean A04;

    public C35O(ActivityC02290Ap activityC02290Ap, AbstractC005302j abstractC005302j, C018608r c018608r, boolean z) {
        this.A03 = new WeakReference(activityC02290Ap);
        this.A02 = abstractC005302j;
        this.A01 = c018608r;
        this.A04 = z;
    }

    @Override // X.C0HS
    public void A06() {
        WeakReference weakReference = this.A03;
        if (weakReference.get() != null) {
            ((ActivityC02290Ap) weakReference.get()).A12(R.string.register_wait_message);
        }
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        this.A01.A0N(this.A02, this.A04, true);
        ActivityC02290Ap.A06(this.A00, 300L);
        return null;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) this.A03.get();
        if (activityC02290Ap != null) {
            activityC02290Ap.ARS();
            activityC02290Ap.A14(new Intent(activityC02290Ap.getApplicationContext(), HomeActivity.class).addFlags(603979776));
        }
    }
}
