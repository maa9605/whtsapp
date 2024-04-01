package X;

import android.view.View;
import android.view.ViewStub;

/* renamed from: X.3ZT  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3ZT {
    public static void A00(final C3ZU c3zu, ViewStub viewStub) {
        viewStub.setLayoutResource(c3zu.AAr());
        viewStub.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: X.3ZS
            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub2, View view) {
                C3ZU.this.AQO(view);
            }
        });
        viewStub.inflate();
    }
}
