package X;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.1gM  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C33721gM implements C08C {
    public final /* synthetic */ AnonymousClass087 A00;
    public final /* synthetic */ AbstractC016907v A01;
    public final /* synthetic */ C09P A02;

    public C33721gM(AbstractC016907v abstractC016907v, C09P c09p, AnonymousClass087 anonymousClass087) {
        this.A01 = abstractC016907v;
        this.A02 = c09p;
        this.A00 = anonymousClass087;
    }

    @Override // X.C08C
    public void A5g(Context context, Object obj, Object obj2, Object obj3) {
        ((View) obj).setOnClickListener(new View.OnClickListener() { // from class: X.1EO
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C33721gM c33721gM = C33721gM.this;
                AbstractC016907v abstractC016907v = c33721gM.A01;
                int i = abstractC016907v.A00;
                C09P c09p = c33721gM.A02;
                ArrayList arrayList = new ArrayList();
                InterfaceC020509l A0f = AnonymousClass088.A0f(abstractC016907v);
                if (arrayList.size() == 0) {
                    arrayList.add(A0f);
                    C25031Du.A00(i, c09p, new C021109r(arrayList), c33721gM.A00);
                    return;
                }
                throw new IllegalArgumentException("arguments have to be continuous");
            }
        });
    }

    @Override // X.C08C
    public boolean AUY(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }

    @Override // X.C08C
    public void AVh(Context context, Object obj, Object obj2, Object obj3) {
        ((View) obj).setOnClickListener(null);
    }
}
