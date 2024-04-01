package X;

import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;

/* renamed from: X.2nu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class View$OnClickListenerC56732nu extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C893146n A01;
    public final /* synthetic */ C893246o A02;

    public /* synthetic */ View$OnClickListenerC56732nu(C893246o c893246o, C893146n c893146n, int i) {
        this.A02 = c893246o;
        this.A01 = c893146n;
        this.A00 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.A02.A0G(this.A01, this.A00);
    }
}
