package X;

import android.app.Activity;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

/* renamed from: X.4Bi  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C90524Bi {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C45A A01;
    public final /* synthetic */ C3NR A02;

    public C90524Bi(C45A c45a, Activity activity, C3NR c3nr) {
        this.A01 = c45a;
        this.A00 = activity;
        this.A02 = c3nr;
    }

    public void A00(boolean z, C28Q c28q) {
        String A0D;
        StringBuilder sb = new StringBuilder("PAY: IndiaUpiBlockListManager/on-error blocked: ");
        sb.append(z);
        sb.append(" error: ");
        sb.append(c28q);
        Log.e(sb.toString());
        C45A c45a = this.A01;
        C018508q c018508q = c45a.A02;
        Activity activity = this.A00;
        c018508q.A09((C0B5) activity);
        if (!activity.isFinishing()) {
            if (z) {
                A0D = c45a.A06.A06(R.string.block_upi_id_error);
            } else {
                C002301c c002301c = c45a.A06;
                A0D = c002301c.A0D(R.string.unblock_payment_id_error_default, c002301c.A06(R.string.india_upi_payment_id_name));
            }
            c018508q.A0I(A0D, 0);
        }
        C3NR c3nr = this.A02;
        if (c3nr != null) {
            c3nr.AO5(c28q);
        }
    }
}
