package X;

import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;
import java.util.ArrayList;

/* renamed from: X.2nn  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class View$OnClickListenerC56662nn extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass087 A00;
    public final /* synthetic */ C016807u A01;
    public final /* synthetic */ C09P A02;

    public /* synthetic */ View$OnClickListenerC56662nn(C016807u c016807u, C09P c09p, AnonymousClass087 anonymousClass087) {
        this.A01 = c016807u;
        this.A02 = c09p;
        this.A00 = anonymousClass087;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C016807u c016807u = this.A01;
        C09P c09p = this.A02;
        AnonymousClass087 anonymousClass087 = this.A00;
        int i = ((AbstractC016907v) c016807u).A00;
        ArrayList arrayList = new ArrayList();
        InterfaceC020509l A0f = AnonymousClass088.A0f(c016807u);
        if (arrayList.size() == 0) {
            arrayList.add(A0f);
            C25031Du.A00(i, c09p, new C021109r(arrayList), anonymousClass087);
            return;
        }
        throw new IllegalArgumentException("arguments have to be continuous");
    }
}
