package X;

import android.view.View;
import android.widget.CheckBox;
import com.facebook.redex.ViewOnClickEmptyBase;

/* renamed from: X.2nU  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2nU extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ CheckBox A00;
    public final /* synthetic */ AnonymousClass087 A01;
    public final /* synthetic */ C016807u A02;

    public /* synthetic */ C2nU(CheckBox checkBox, C016807u c016807u, AnonymousClass087 anonymousClass087) {
        this.A00 = checkBox;
        this.A02 = c016807u;
        this.A01 = anonymousClass087;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C45Q.A0D(this.A00, this.A02, this.A01);
    }
}
