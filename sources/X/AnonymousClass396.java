package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.396  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass396 implements C3ZU {
    public TextView A00;
    public final C002301c A01;

    @Override // X.C3ZU
    public /* synthetic */ void AEh(ViewStub viewStub) {
        C3ZT.A00(this, viewStub);
    }

    public AnonymousClass396(C002301c c002301c) {
        this.A01 = c002301c;
    }

    @Override // X.C3ZU
    public void A5h(Object obj) {
        C014006r c014006r;
        AnonymousClass093 anonymousClass093 = (AnonymousClass093) obj;
        this.A00.setVisibility(8);
        if (anonymousClass093 == null || (c014006r = anonymousClass093.A07) == null) {
            return;
        }
        this.A00.setText(C03750Gx.A01(this.A01, c014006r, anonymousClass093.A0B()));
        this.A00.setVisibility(0);
    }

    @Override // X.C3ZU
    public int AAr() {
        return R.layout.conversation_row_payment_amount_summary;
    }

    @Override // X.C3ZU
    public void AQO(View view) {
        this.A00 = (TextView) C0AT.A0D(view, R.id.amount_container);
    }
}
