package X;

import android.os.Handler;
import android.os.Vibrator;
import android.view.View;
import com.google.android.search.verification.client.R;

/* renamed from: X.30o  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C637130o {
    public boolean A00;
    public final Handler A01;
    public final Vibrator A02;
    public final View A03;
    public final C637030n A04;
    public final Runnable A05;
    public final Runnable A06;

    public C637130o(C002301c c002301c, View view, C637030n c637030n, Handler handler) {
        this.A03 = view;
        this.A04 = c637030n;
        this.A01 = handler;
        view.setBackground(new C0We(c002301c, c637030n));
        this.A06 = new RunnableC62012xC(view, 0, 0.0f, 1.0f);
        this.A05 = new RunnableC62012xC(view, 4, 1.0f, 0.0f);
        this.A02 = (Vibrator) view.getContext().getSystemService("vibrator");
        A00();
    }

    public final void A00() {
        C637030n c637030n = this.A04;
        c637030n.A00 = this.A03.getContext().getResources().getColor(R.color.trashNormalBackground);
        c637030n.invalidateSelf();
    }

    public final boolean A01(float f, float f2) {
        View view = this.A03;
        return f >= ((float) view.getLeft()) && f <= ((float) view.getRight()) && f2 >= ((float) view.getTop()) && f2 <= ((float) view.getBottom());
    }
}
