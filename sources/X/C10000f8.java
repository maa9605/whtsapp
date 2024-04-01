package X;

import android.app.Activity;
import android.view.View;
import com.whatsapp.QuickContactActivity;

/* renamed from: X.0f8  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C10000f8 extends AbstractView$OnClickListenerC49532Ky {
    public final Activity A00;
    public final AbstractC005302j A01;
    public final String A02;

    public C10000f8(Activity activity, AbstractC005302j abstractC005302j, String str) {
        this.A00 = activity;
        this.A01 = abstractC005302j;
        this.A02 = str;
    }

    @Override // X.AbstractView$OnClickListenerC49532Ky
    public void A00(View view) {
        QuickContactActivity.A00(this.A00, view, this.A01, this.A02);
    }
}
