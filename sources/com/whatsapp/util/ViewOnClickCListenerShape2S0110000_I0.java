package com.whatsapp.util;

import X.AbstractView$OnClickListenerC49532Ky;
import X.C000500h;
import X.C011005l;
import X.C0LD;
import X.C0UF;
import X.C0UG;
import X.C23X;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.MuteDialogFragment;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.voipcalling.PermissionDialogFragment;

/* loaded from: classes2.dex */
public class ViewOnClickCListenerShape2S0110000_I0 extends AbstractView$OnClickListenerC49532Ky {
    public Object A00;
    public boolean A01;
    public final int A02;

    public ViewOnClickCListenerShape2S0110000_I0(Object obj, boolean z, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    @Override // X.AbstractView$OnClickListenerC49532Ky
    public void A00(View view) {
        switch (this.A02) {
            case 0:
                if (this.A01) {
                    ChatInfoActivity chatInfoActivity = (ChatInfoActivity) this.A00;
                    C23X.A0H(chatInfoActivity, chatInfoActivity.A03, chatInfoActivity.findViewById(R.id.content), chatInfoActivity.A1R());
                    return;
                }
                ChatInfoActivity chatInfoActivity2 = (ChatInfoActivity) this.A00;
                chatInfoActivity2.AUg(MuteDialogFragment.A00(chatInfoActivity2.A1R()), null);
                return;
            case 1:
                GroupChatInfo groupChatInfo = (GroupChatInfo) this.A00;
                C011005l c011005l = groupChatInfo.A13;
                if (c011005l != null) {
                    groupChatInfo.AUg(ChatInfoActivity.EncryptionExplanationDialogFragment.A00(c011005l, 1, null, this.A01), null);
                    return;
                }
                throw null;
            case 2:
                if (this.A01) {
                    PermissionDialogFragment permissionDialogFragment = (PermissionDialogFragment) this.A00;
                    permissionDialogFragment.A0A = true;
                    C0LD.A05(permissionDialogFragment.A0A(), "com.whatsapp");
                    return;
                }
                PermissionDialogFragment permissionDialogFragment2 = (PermissionDialogFragment) this.A00;
                permissionDialogFragment2.A01.dismiss();
                C000500h c000500h = permissionDialogFragment2.A08;
                String[] strArr = permissionDialogFragment2.A0D;
                RequestPermissionActivity.A0G(c000500h, strArr);
                C0UG c0ug = permissionDialogFragment2.A0F;
                if (c0ug != null) {
                    ((C0UF) c0ug).A00.A0a(permissionDialogFragment2, strArr, 100);
                    return;
                }
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(permissionDialogFragment2);
                sb.append(" not attached to Activity");
                throw new IllegalStateException(sb.toString());
            default:
                super.A00(view);
                return;
        }
    }
}
