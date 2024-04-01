package X;

import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;

/* renamed from: X.3Rq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class View$OnClickListenerC70273Rq extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ C0N2 A00;
    public final /* synthetic */ AnonymousClass093 A01;
    public final /* synthetic */ C4FI A02;

    public /* synthetic */ View$OnClickListenerC70273Rq(C4FI c4fi, C0N2 c0n2, AnonymousClass093 anonymousClass093) {
        this.A02 = c4fi;
        this.A00 = c0n2;
        this.A01 = anonymousClass093;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.A02.A09(this.A00, this.A01);
    }
}
