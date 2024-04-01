package X;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1EE  reason: invalid class name */
/* loaded from: classes.dex */
public class C1EE implements Runnable {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ C33681gI A01;

    public C1EE(C33681gI c33681gI, RecyclerView recyclerView) {
        this.A01 = c33681gI;
        this.A00 = recyclerView;
    }

    @Override // java.lang.Runnable
    public void run() {
        C33681gI c33681gI = this.A01;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        c33681gI.A00 = ofFloat;
        ofFloat.addUpdateListener(new C1EF(this.A00, c33681gI.A03));
        c33681gI.A00.setDuration(200L);
        c33681gI.A00.start();
        c33681gI.A02 = false;
    }
}
