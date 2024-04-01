package java.lang;

import X.AbstractC005302j;
import X.ActivityC02290Ap;
import X.AnonymousClass092;
import X.AnonymousClass338;
import X.C00A;
import X.C0TO;
import X.C2E4;
import X.C2IY;
import X.C2L3;
import X.C471029p;
import X.C49032Ic;
import android.content.Intent;
import android.os.Message;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.Set;

/* loaded from: classes2.dex */
public class RunnableEBaseShape0S0201000_I0 extends RunnableEmptyBase implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public RunnableEBaseShape0S0201000_I0(Object obj, int i, Object obj2, int i2) {
        this.A03 = i2;
        this.A01 = obj;
        this.A00 = i;
        this.A02 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A03) {
            case 0:
                ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) this.A01;
                int i = this.A00;
                Intent intent = ((C0TO) this.A02).mIntent;
                activityC02290Ap.A15(intent == null ? null : new Intent(intent), i);
                return;
            case 1:
                Object obj = this.A02;
                int i2 = this.A00;
                AnonymousClass338 anonymousClass338 = (AnonymousClass338) ((C2L3) this.A01).A0G.remove(obj);
                if (anonymousClass338 == null) {
                    Log.e("The response handler must not be null");
                    return;
                } else {
                    anonymousClass338.A00(i2);
                    return;
                }
            case 2:
                C471029p c471029p = (C471029p) this.A01;
                int i3 = this.A00;
                for (AbstractC005302j abstractC005302j : (Set) this.A02) {
                    ConversationsFragment conversationsFragment = c471029p.A0F;
                    conversationsFragment.A0n.A01(abstractC005302j, conversationsFragment.A0v.A05());
                }
                ConversationsFragment conversationsFragment2 = c471029p.A0F;
                conversationsFragment2.A0I.A0F(conversationsFragment2.A01().getQuantityString(R.plurals.pin_toast, i3), 0);
                return;
            case 3:
                ((C00A) this.A01).A05((AnonymousClass092) this.A02, this.A00);
                return;
            case 4:
                ((C2E4) this.A01).A0N.A07((DeviceJid) this.A02, this.A00 == 406);
                return;
            case 5:
                ((View) this.A01).setLayoutParams(new FrameLayout.LayoutParams(this.A00, -1));
                ((Runnable) this.A02).run();
                return;
            case 6:
                Message obtain = Message.obtain(null, 0, this.A00, 0, this.A02);
                ((C2IY) this.A01).A0K.A00.obtainMessage(1, new C49032Ic("start_from_call_log", null, obtain)).sendToTarget();
                return;
            default:
                return;
        }
    }
}
