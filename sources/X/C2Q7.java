package X;

import android.os.Bundle;
import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.status.playback.StatusReplyActivity;

/* renamed from: X.2Q7  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C2Q7 extends MessageReplyActivity {
    public boolean A00 = false;

    @Override // X.AbstractActivityC50122Py, X.AbstractActivityC02280Ao, X.AbstractActivityC02300Aq
    public void A0q() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0CQ) generatedComponent()).A4c((StatusReplyActivity) this);
    }

    @Override // com.whatsapp.status.playback.MessageReplyActivity, X.AbstractActivityC50122Py, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        A0q();
        super.onCreate(bundle);
    }
}
