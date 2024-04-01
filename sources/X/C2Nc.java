package X;

import android.os.Bundle;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;

/* renamed from: X.2Nc  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C2Nc extends AbstractActivityC04650Lh {
    public boolean A00 = false;

    @Override // X.AbstractActivityC04660Li, X.AbstractActivityC04680Lk, X.AbstractActivityC02260Am, X.AbstractActivityC02280Ao, X.AbstractActivityC02300Aq
    public void A0q() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0CQ) generatedComponent()).A28((StarredMessagesActivity) this);
    }

    @Override // X.AbstractActivityC04650Lh, X.AbstractActivityC04660Li, X.AbstractActivityC04670Lj, X.AbstractActivityC04680Lk, X.AbstractActivityC02260Am, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        A0q();
        super.onCreate(bundle);
    }
}
