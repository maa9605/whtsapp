package X;

import android.app.Activity;
import android.os.SystemClock;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.Jid;
import java.lang.ref.WeakReference;

/* renamed from: X.39O  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C39O extends C0HS {
    public final C018608r A01;
    public final C2MR A02;
    public final C06C A03;
    public final String A04;
    public final String A05;
    public final WeakReference A06;
    public final WeakReference A07;
    public final long A00 = SystemClock.elapsedRealtime();
    public final boolean A08 = true;

    public C39O(ActivityC02320As activityC02320As, C018608r c018608r, C2MR c2mr, C0B5 c0b5, C06C c06c, String str, String str2) {
        this.A06 = new WeakReference(activityC02320As);
        this.A07 = new WeakReference(c0b5);
        this.A01 = c018608r;
        this.A02 = c2mr;
        this.A03 = c06c;
        this.A05 = str;
        this.A04 = str2;
    }

    @Override // X.C0HS
    public void A06() {
        WeakReference weakReference = this.A07;
        if (weakReference.get() != null) {
            ((C0B5) weakReference.get()).AUr(0, R.string.register_wait_message);
        }
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        Activity activity = (Activity) this.A06.get();
        if (activity != null) {
            C2MR c2mr = this.A02;
            C06C c06c = this.A03;
            c2mr.A00(activity, null, c06c, this.A05, this.A04);
            C018608r c018608r = this.A01;
            Jid A03 = c06c.A03(AbstractC005302j.class);
            if (A03 != null) {
                c018608r.A0N((AbstractC005302j) A03, this.A08, true);
                ActivityC02290Ap.A06(this.A00, 300L);
                return null;
            }
            throw null;
        }
        return null;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        C0B5 c0b5 = (C0B5) this.A07.get();
        if (c0b5 != null) {
            c0b5.ARS();
        }
        Activity activity = (Activity) this.A06.get();
        if (activity != null) {
            activity.finish();
        }
    }
}
