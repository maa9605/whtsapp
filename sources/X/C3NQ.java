package X;

import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.3NQ  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3NQ extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ AnonymousClass093 A01;
    public final /* synthetic */ C77133hi A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C3NQ(C77133hi c77133hi, TextView textView, AnonymousClass093 anonymousClass093, boolean z) {
        this.A02 = c77133hi;
        this.A00 = textView;
        this.A01 = anonymousClass093;
        this.A03 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C77133hi c77133hi = this.A02;
        TextView textView = this.A00;
        AnonymousClass093 anonymousClass093 = this.A01;
        boolean z = this.A03;
        C2OU c2ou = c77133hi.A04;
        c2ou.A05(textView, false, anonymousClass093, z);
        c2ou.A00.A07(R.string.payments_request_canceling_failure_message, 0);
    }
}
