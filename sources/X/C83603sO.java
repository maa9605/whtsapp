package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.lang.ref.WeakReference;

/* renamed from: X.3sO  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C83603sO implements C0CG {
    public final /* synthetic */ C018308n A00;
    public final /* synthetic */ C018508q A01;
    public final /* synthetic */ C09E A02;
    public final /* synthetic */ WeakReference A03;

    public /* synthetic */ C83603sO(WeakReference weakReference, C018508q c018508q, C018308n c018308n, C09E c09e) {
        this.A03 = weakReference;
        this.A01 = c018508q;
        this.A00 = c018308n;
        this.A02 = c09e;
    }

    @Override // X.C0CG
    public final void A54(Object obj) {
        WeakReference weakReference = this.A03;
        C018508q c018508q = this.A01;
        C018308n c018308n = this.A00;
        C09E c09e = this.A02;
        Uri uri = (Uri) obj;
        if (weakReference.get() != null) {
            c018508q.A03();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uri, ((AnonymousClass097) c09e).A07);
            intent.setFlags(1);
            c018308n.A06((Context) weakReference.get(), intent);
        }
    }
}
