package X;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3Sq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class ViewTreeObserver$OnGlobalLayoutListenerC70533Sq implements ViewTreeObserver.OnGlobalLayoutListener {
    public RecyclerView A00;
    public C82863rC A01;
    public boolean A02;

    public ViewTreeObserver$OnGlobalLayoutListenerC70533Sq(RecyclerView recyclerView, C82863rC c82863rC) {
        this.A00 = recyclerView;
        this.A01 = c82863rC;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (this.A02) {
            this.A01.A02(this.A00);
            this.A02 = false;
        }
    }
}
