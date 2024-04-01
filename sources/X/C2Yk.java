package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import com.whatsapp.search.views.itemviews.MessageGifVideoPlayer;

/* renamed from: X.2Yk  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C2Yk extends TextureView implements AnonymousClass005 {
    public C2UB A00;
    public boolean A01;

    public C2Yk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (this.A01) {
            return;
        }
        this.A01 = true;
        ((AbstractC07960aN) generatedComponent()).A2V((MessageGifVideoPlayer) this);
    }

    @Override // X.AnonymousClass005
    public final Object generatedComponent() {
        C2UB c2ub = this.A00;
        if (c2ub == null) {
            c2ub = new C2UB(this);
            this.A00 = c2ub;
        }
        return c2ub.generatedComponent();
    }
}
