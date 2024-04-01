package com.whatsapp.conversationslist;

import X.ActivityC02330At;
import X.C01B;
import X.C0CA;
import X.C23X;
import android.animation.AnimatorSet;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class ArchivedConversationsFragment extends Hilt_ArchivedConversationsFragment {
    public AnimatorSet A00;
    public View A01;
    public C01B A02;
    public C0CA A03;

    @Override // com.whatsapp.conversationslist.ConversationsFragment, X.C0BA
    public void A0m(Menu menu, MenuInflater menuInflater) {
        if (C23X.A0L(this.A02, this.A0y)) {
            menu.add(1, R.id.menuitem_archive_chat_notifications, 0, R.string.archive_settings);
        } else {
            super.A0m(menu, menuInflater);
        }
    }

    @Override // com.whatsapp.conversationslist.ConversationsFragment, X.C0BA
    public boolean A0o(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_archive_chat_notifications) {
            ActivityC02330At A09 = A09();
            if (A09 != null) {
                A0i(new Intent(A09, ArchiveNotificationSettingActivity.class));
                return true;
            }
            return true;
        }
        return super.A0o(menuItem);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r1.A0l() != false) goto L10;
     */
    @Override // com.whatsapp.conversationslist.ConversationsFragment, X.C0BA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View A0p(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            r4 = this;
            X.01B r0 = r4.A02
            X.00h r1 = r4.A0y
            boolean r0 = X.C23X.A0L(r0, r1)
            if (r0 == 0) goto L11
            boolean r1 = r1.A0l()
            r0 = 1
            if (r1 == 0) goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L24
            X.00h r3 = r4.A0y
            android.content.SharedPreferences r2 = r3.A00
            r0 = 0
            java.lang.String r1 = "new_archive_nux_shown_count"
            int r0 = r2.getInt(r1, r0)
            int r0 = r0 + 1
            X.C000200d.A0g(r3, r1, r0)
        L24:
            android.view.View r0 = super.A0p(r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.ArchivedConversationsFragment.A0p(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
