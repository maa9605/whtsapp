package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.payments.ui.PaymentInvitePickerActivity;
import java.util.ArrayList;

/* renamed from: X.3Qc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC69873Qc extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ PaymentInvitePickerActivity A00;
    public final /* synthetic */ ArrayList A01;

    public /* synthetic */ RunnableC69873Qc(PaymentInvitePickerActivity paymentInvitePickerActivity, ArrayList arrayList) {
        this.A00 = paymentInvitePickerActivity;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PaymentInvitePickerActivity paymentInvitePickerActivity = this.A00;
        ArrayList arrayList = this.A01;
        if (arrayList.size() == 1) {
            paymentInvitePickerActivity.setResult(-1, paymentInvitePickerActivity.getIntent().putExtra("extra_invitee_jid", ((Jid) arrayList.get(0)).getRawString()));
        } else {
            paymentInvitePickerActivity.setResult(501, paymentInvitePickerActivity.getIntent().putExtra("extra_inviter_count", arrayList.size()));
        }
        paymentInvitePickerActivity.finish();
    }
}
