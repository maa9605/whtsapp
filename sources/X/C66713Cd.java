package X;

import android.os.Bundle;
import com.whatsapp.conversationslist.LeaveGroupsDialogFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.3Cd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C66713Cd extends C0HS {
    public final C00B A00;
    public final C011005l A01;
    public final WeakReference A02;

    public C66713Cd(C0B5 c0b5, C00B c00b, C011005l c011005l) {
        this.A02 = new WeakReference(c0b5);
        this.A00 = c00b;
        this.A01 = c011005l;
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        return Integer.valueOf(this.A00.A01(this.A01));
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        Number number = (Number) obj;
        C0B5 c0b5 = (C0B5) this.A02.get();
        if (c0b5 != null) {
            c0b5.ARS();
            C011005l c011005l = this.A01;
            int intValue = number.intValue();
            LeaveGroupsDialogFragment leaveGroupsDialogFragment = new LeaveGroupsDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("jid", c011005l.getRawString());
            bundle.putInt("unsent_count", intValue);
            bundle.putBoolean("report_upsell", false);
            bundle.putString("block_spam_flow", null);
            bundle.putInt("leave_group_action", 0);
            bundle.putBoolean("show_neutral_button", true);
            leaveGroupsDialogFragment.A0P(bundle);
            c0b5.AUg(leaveGroupsDialogFragment, null);
        }
    }
}
