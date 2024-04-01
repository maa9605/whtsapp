package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* renamed from: X.0bk  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C08590bk {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public TimeInterpolator A04;

    public C08590bk(long j) {
        this.A02 = 0L;
        this.A03 = 300L;
        this.A04 = null;
        this.A00 = 0;
        this.A01 = 1;
        this.A02 = j;
        this.A03 = 150L;
    }

    public C08590bk(long j, long j2, TimeInterpolator timeInterpolator) {
        this.A02 = 0L;
        this.A03 = 300L;
        this.A04 = null;
        this.A00 = 0;
        this.A01 = 1;
        this.A02 = j;
        this.A03 = j2;
        this.A04 = timeInterpolator;
    }

    public void A00(Animator animator) {
        animator.setStartDelay(this.A02);
        animator.setDuration(this.A03);
        TimeInterpolator timeInterpolator = this.A04;
        if (timeInterpolator == null) {
            timeInterpolator = C08580bj.A02;
        }
        animator.setInterpolator(timeInterpolator);
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.A00);
            valueAnimator.setRepeatMode(this.A01);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C08590bk.class != obj.getClass()) {
            return false;
        }
        C08590bk c08590bk = (C08590bk) obj;
        if (this.A02 == c08590bk.A02 && this.A03 == c08590bk.A03 && this.A00 == c08590bk.A00 && this.A01 == c08590bk.A01) {
            TimeInterpolator timeInterpolator = this.A04;
            if (timeInterpolator == null) {
                timeInterpolator = C08580bj.A02;
            }
            Class<?> cls = timeInterpolator.getClass();
            TimeInterpolator timeInterpolator2 = c08590bk.A04;
            if (timeInterpolator2 == null) {
                timeInterpolator2 = C08580bj.A02;
            }
            return cls.equals(timeInterpolator2.getClass());
        }
        return false;
    }

    public int hashCode() {
        long j = this.A02;
        long j2 = this.A03;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        TimeInterpolator timeInterpolator = this.A04;
        if (timeInterpolator == null) {
            timeInterpolator = C08580bj.A02;
        }
        return ((((timeInterpolator.getClass().hashCode() + i) * 31) + this.A00) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(C08590bk.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.A02);
        sb.append(" duration: ");
        sb.append(this.A03);
        sb.append(" interpolator: ");
        TimeInterpolator timeInterpolator = this.A04;
        if (timeInterpolator == null) {
            timeInterpolator = C08580bj.A02;
        }
        sb.append(timeInterpolator.getClass());
        sb.append(" repeatCount: ");
        sb.append(this.A00);
        sb.append(" repeatMode: ");
        return C000200d.A0K(sb, this.A01, "}\n");
    }
}
