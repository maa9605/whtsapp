package X;

import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: X.1BB  reason: invalid class name */
/* loaded from: classes.dex */
public class C1BB {
    public C1BH A00;

    public C1BB(SwipeDismissBehavior swipeDismissBehavior) {
        swipeDismissBehavior.A01 = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        swipeDismissBehavior.A00 = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        swipeDismissBehavior.A03 = 0;
    }
}
