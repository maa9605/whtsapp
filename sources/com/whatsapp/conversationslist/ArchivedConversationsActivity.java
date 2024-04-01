package com.whatsapp.conversationslist;

import X.AbstractC02800Cx;
import X.ActivityC02290Ap;
import X.C02820Cz;
import X.C05O;
import X.C23X;
import X.C2Ng;
import X.InterfaceC002901k;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class ArchivedConversationsActivity extends C2Ng {
    public C05O A00;
    public InterfaceC002901k A01;

    @Override // X.C2Ng, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean A0L = C23X.A0L(((ActivityC02290Ap) this).A0B, ((ActivityC02290Ap) this).A0F);
        int i = R.string.archived_chats;
        if (A0L) {
            i = R.string.archived_chats_v2;
        }
        setTitle(i);
        A0c().A0L(true);
        setContentView(R.layout.archived_conversations);
        if (bundle == null) {
            AbstractC02800Cx A0N = A0N();
            if (A0N != null) {
                C02820Cz c02820Cz = new C02820Cz(A0N);
                c02820Cz.A00(R.id.container, new ArchivedConversationsFragment());
                c02820Cz.A04();
                return;
            }
            throw null;
        }
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0016, code lost:
        if (r2.A0l() != false) goto L10;
     */
    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            r5 = this;
            super.onPause()
            X.01k r4 = r5.A01
            X.05O r3 = r5.A00
            X.01B r0 = r5.A0B
            X.00h r2 = r5.A0F
            boolean r0 = X.C23X.A0L(r0, r2)
            if (r0 == 0) goto L18
            boolean r1 = r2.A0l()
            r0 = 1
            if (r1 == 0) goto L19
        L18:
            r0 = 0
        L19:
            if (r0 == 0) goto L25
            r1 = 49
            java.lang.RunnableEBaseShape0S0200000_I0_0 r0 = new java.lang.RunnableEBaseShape0S0200000_I0_0
            r0.<init>(r2, r3, r1)
            r4.AS1(r0)
        L25:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.ArchivedConversationsActivity.onPause():void");
    }
}
