package X;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.4Fc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C91484Fc extends FrameLayout implements AnonymousClass005 {
    public TextView A00;
    public TextView A01;
    public AnonymousClass012 A02;
    public C002301c A03;
    public C03750Gx A04;
    public C2UB A05;
    public boolean A06;

    public C91484Fc(Context context) {
        super(context);
        if (!this.A06) {
            this.A06 = true;
            ((AbstractC07960aN) generatedComponent()).A2F(this);
        }
        FrameLayout.inflate(getContext(), R.layout.payout_transaction_row, this);
        this.A01 = (TextView) C0AT.A0D(this, R.id.date);
        this.A00 = (TextView) C0AT.A0D(this, R.id.amount);
    }

    @Override // X.AnonymousClass005
    public final Object generatedComponent() {
        C2UB c2ub = this.A05;
        if (c2ub == null) {
            c2ub = new C2UB(this);
            this.A05 = c2ub;
        }
        return c2ub.generatedComponent();
    }
}
