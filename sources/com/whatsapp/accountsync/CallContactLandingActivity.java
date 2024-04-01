package com.whatsapp.accountsync;

import X.ActivityC02270An;
import X.C06C;
import X.C0DS;
import X.C0WN;
import X.C2IY;
import android.content.Intent;
import com.whatsapp.jid.UserJid;
import com.whatsapp.tos.TosUpdateActivity;

/* loaded from: classes.dex */
public class CallContactLandingActivity extends C0WN {
    public C2IY A00;

    @Override // com.whatsapp.accountsync.ProfileActivity
    public boolean A1W(UserJid userJid, String str) {
        C06C A0A = ((C0DS) this).A04.A0A(userJid);
        if (!((ActivityC02270An) this).A0E.A05()) {
            startActivity(new Intent(this, TosUpdateActivity.class));
            return true;
        } else if ("vnd.android.cursor.item/vnd.com.whatsapp.voip.call".equals(str)) {
            this.A00.A06(A0A, this, 14, false);
            return true;
        } else if ("vnd.android.cursor.item/vnd.com.whatsapp.video.call".equals(str)) {
            this.A00.A00(A0A, this, 14, false, true);
            return true;
        } else {
            return false;
        }
    }
}
