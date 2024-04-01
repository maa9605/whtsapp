package X;

import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;

/* renamed from: X.3Qa  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class View$OnClickListenerC69853Qa extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ C06C A00;
    public final /* synthetic */ C49T A01;
    public final /* synthetic */ C49U A02;

    public /* synthetic */ View$OnClickListenerC69853Qa(C49U c49u, C06C c06c, C49T c49t) {
        this.A02 = c49u;
        this.A00 = c06c;
        this.A01 = c49t;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.A02.A00(this.A00, this.A01, view);
    }
}
