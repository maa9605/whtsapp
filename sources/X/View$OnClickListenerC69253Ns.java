package X;

import android.content.Context;
import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;

/* renamed from: X.3Ns  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class View$OnClickListenerC69253Ns extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass093 A01;
    public final /* synthetic */ C2OS A02;
    public final /* synthetic */ C4CZ A03;

    public /* synthetic */ View$OnClickListenerC69253Ns(C4CZ c4cz, Context context, AnonymousClass093 anonymousClass093, C2OS c2os) {
        this.A03 = c4cz;
        this.A00 = context;
        this.A01 = anonymousClass093;
        this.A02 = c2os;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.A03.A02(this.A00, this.A01, this.A02);
    }
}
