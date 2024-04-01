package X;

import android.os.SystemClock;
import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;

/* renamed from: X.2Ky  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractView$OnClickListenerC49532Ky extends ViewOnClickEmptyBase implements View.OnClickListener {
    public long A00;

    public abstract void A00(View view);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.A00 > 1000) {
            this.A00 = elapsedRealtime;
            A00(view);
        }
    }
}
