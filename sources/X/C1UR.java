package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1UR  reason: invalid class name */
/* loaded from: classes.dex */
public class C1UR implements InterfaceC14630nK {
    public final /* synthetic */ RecyclerView A00;

    public C1UR(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public void A00(int i) {
        RecyclerView recyclerView = this.A00;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.A0h(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
