package X;

import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;
import com.whatsapp.SuspiciousLinkWarningDialogFragment;
import java.util.Set;

/* renamed from: X.3Vk  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class View$OnClickListenerC71253Vk extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ C2YV A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Set A02;

    public /* synthetic */ View$OnClickListenerC71253Vk(C2YV c2yv, String str, Set set) {
        this.A00 = c2yv;
        this.A01 = str;
        this.A02 = set;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ((ActivityC02290Ap) C018308n.A00(this.A00.getContext())).AUh(SuspiciousLinkWarningDialogFragment.A00(this.A01, this.A02));
    }
}
