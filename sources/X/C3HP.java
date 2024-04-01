package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;

/* renamed from: X.3HP  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3HP extends AbstractC15200oF {
    public int A00;
    public final /* synthetic */ C2IP A03;
    public int A02 = 0;
    public int A01 = 0;

    public C3HP(C2IP c2ip, Context context) {
        this.A03 = c2ip;
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.shape_picker_search_header_size);
    }

    @Override // X.AbstractC15200oF
    public void A00(RecyclerView recyclerView, int i) {
        int i2 = this.A02;
        if (i2 == 0 && i != i2) {
            this.A03.A0R.clearFocus();
        }
        this.A02 = i;
    }

    @Override // X.AbstractC15200oF
    public void A01(RecyclerView recyclerView, int i, int i2) {
        int i3 = this.A01 + i2;
        this.A01 = i3;
        this.A03.A0M.setAlpha(Math.min(1.0f, i3 / this.A00));
    }
}
