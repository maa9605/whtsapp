package X;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0bi */
/* loaded from: classes.dex */
public class C08570bi {
    public final C006802z A00 = new C006802z();

    public static C08570bi A00(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return A02(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(loadAnimator);
                return A02(arrayList);
            }
            return null;
        } catch (Exception e) {
            StringBuilder A0P = C000200d.A0P("Can't load animation resource ID #0x");
            A0P.append(Integer.toHexString(i));
            Log.w("MotionSpec", A0P.toString(), e);
            return null;
        }
    }

    public static C08570bi A01(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return A00(context, resourceId);
    }

    public static C08570bi A02(List list) {
        C08570bi c08570bi = new C08570bi();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
                    if (interpolator instanceof AccelerateInterpolator) {
                        interpolator = C08580bj.A01;
                    } else if (interpolator instanceof DecelerateInterpolator) {
                        interpolator = C08580bj.A04;
                    }
                } else {
                    interpolator = C08580bj.A02;
                }
                C08590bk c08590bk = new C08590bk(startDelay, duration, interpolator);
                c08590bk.A00 = objectAnimator.getRepeatCount();
                c08590bk.A01 = objectAnimator.getRepeatMode();
                c08570bi.A00.put(propertyName, c08590bk);
            } else {
                StringBuilder sb = new StringBuilder("Animator must be an ObjectAnimator: ");
                sb.append(animator);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return c08570bi;
    }

    public C08590bk A03(String str) {
        C006802z c006802z = this.A00;
        if (c006802z.getOrDefault(str, null) != null) {
            return (C08590bk) c006802z.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C08570bi.class != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C08570bi) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(C08570bi.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" timings: ");
        sb.append(this.A00);
        sb.append("}\n");
        return sb.toString();
    }
}
