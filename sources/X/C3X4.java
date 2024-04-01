package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewTreeObserver;
import androidx.fragment.app.ListFragment;
import com.whatsapp.status.StatusesFragment;

/* renamed from: X.3X4  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3X4 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ StatusesFragment A00;

    public C3X4(StatusesFragment statusesFragment) {
        this.A00 = statusesFragment;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        StatusesFragment statusesFragment = this.A00;
        statusesFragment.A0x();
        ((ListFragment) statusesFragment).A04.getViewTreeObserver().removeOnPreDrawListener(this);
        statusesFragment.A1A(true, new AnimatorListenerAdapter() { // from class: X.3X3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C3X4.this.A00.A00 = null;
            }
        });
        return false;
    }
}
