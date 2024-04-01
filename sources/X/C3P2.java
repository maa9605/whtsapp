package X;

import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;

/* renamed from: X.3P2  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3P2 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0TS A01;
    public final /* synthetic */ C4DS A02;

    public /* synthetic */ C3P2(C4DS c4ds, C0TS c0ts, int i) {
        this.A02 = c4ds;
        this.A01 = c0ts;
        this.A00 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.A02.A0G(this.A01, this.A00);
    }
}
