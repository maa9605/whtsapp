package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;

/* renamed from: X.2JG  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2JG extends C2JH {
    public int A00;
    public ImageView A01;
    public final View.OnClickListener A02;
    public final Runnable A03;

    public C2JG(Context context, AnonymousClass097 anonymousClass097) {
        super(context, anonymousClass097);
        this.A00 = 0;
        this.A03 = new RunnableEBaseShape2S0100000_I0_2(this, 1);
        this.A02 = new ViewOnClickEBaseShape1S0100000_I0_1(this, 20);
        A0n();
    }

    @Override // X.AbstractC48182Ef
    public void A0N() {
        C000700j.A08(false, "ConversationRowViewOnceMedia/senders can not view their own media");
    }

    @Override // X.AbstractC48182Ef
    public Drawable getPopupDrawable() {
        return this.A0l.A01(getContext(), -1, new C43941yG(new int[]{129323}));
    }
}
