package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.conversationslist.LeaveGroupsDialogFragment;

/* renamed from: X.39s  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C660939s implements InterfaceC53372gA {
    public final /* synthetic */ int A00;
    public final /* synthetic */ LeaveGroupsDialogFragment A01;

    @Override // X.InterfaceC53372gA
    public void AQE(C06C c06c) {
    }

    public C660939s(LeaveGroupsDialogFragment leaveGroupsDialogFragment, int i) {
        this.A01 = leaveGroupsDialogFragment;
        this.A00 = i;
    }

    @Override // X.InterfaceC53372gA
    public void AKv(C06C c06c) {
        LeaveGroupsDialogFragment leaveGroupsDialogFragment = this.A01;
        if (this.A00 != 1) {
            C018508q c018508q = leaveGroupsDialogFragment.A00;
            if (0 != 0) {
                c018508q.A06(R.string.participant_removing, R.string.register_wait_message);
            } else {
                c018508q.A03();
            }
        }
        C018508q c018508q2 = leaveGroupsDialogFragment.A00;
        c018508q2.A02.post(new RunnableEBaseShape8S0100000_I1_0(this, 22));
    }
}
