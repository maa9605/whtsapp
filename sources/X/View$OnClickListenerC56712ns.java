package X;

import android.hardware.Camera;
import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;

/* renamed from: X.2ns  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class View$OnClickListenerC56712ns extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ Camera.PictureCallback A00;
    public final /* synthetic */ C016807u A01;
    public final /* synthetic */ C890845p A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ View$OnClickListenerC56712ns(String str, C016807u c016807u, C890845p c890845p, Camera.PictureCallback pictureCallback) {
        this.A03 = str;
        this.A01 = c016807u;
        this.A02 = c890845p;
        this.A00 = pictureCallback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C47K.A06(this.A03, this.A01, this.A02, this.A00);
    }
}
