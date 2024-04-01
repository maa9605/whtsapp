package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.search.verification.client.R;
import com.whatsapp.tos.TosUpdateActivity;

/* renamed from: X.3ZN  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3ZN implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ TosUpdateActivity A01;

    public C3ZN(TosUpdateActivity tosUpdateActivity, View view) {
        this.A01 = tosUpdateActivity;
        this.A00 = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        View view = this.A00;
        view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        int measuredHeight = view.getMeasuredHeight();
        TosUpdateActivity tosUpdateActivity = this.A01;
        View findViewById = tosUpdateActivity.findViewById(R.id.illustration);
        int measuredHeight2 = findViewById.getMeasuredHeight();
        View findViewById2 = tosUpdateActivity.findViewById(R.id.illustration_dummy);
        if (measuredHeight2 > (measuredHeight << 1) / 5) {
            findViewById.setVisibility(8);
            findViewById2.setVisibility(0);
            return;
        }
        findViewById.setVisibility(0);
        findViewById2.setVisibility(8);
    }
}
