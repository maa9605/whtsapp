package X;

import android.widget.CompoundButton;
import com.whatsapp.MuteDialogFragment;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.group.GroupChatInfo;

/* renamed from: X.2wa  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C61702wa implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ GroupChatInfo A00;

    public C61702wa(GroupChatInfo groupChatInfo) {
        this.A00 = groupChatInfo;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        GroupChatInfo groupChatInfo = this.A00;
        if (z) {
            groupChatInfo.AUg(MuteDialogFragment.A00(groupChatInfo.A13), null);
        } else {
            ((ChatInfoActivity) groupChatInfo).A0J.AS1(new RunnableEBaseShape8S0100000_I1_0(this, 31));
        }
    }
}
