package X;

import android.content.DialogInterface;
import com.google.android.search.verification.client.R;

/* renamed from: X.2hL  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C53682hL extends C0HS {
    public final /* synthetic */ ActivityC02330At A00;
    public final /* synthetic */ C0CI A01;
    public final /* synthetic */ C2MZ A02;

    public C53682hL(C2MZ c2mz, ActivityC02330At activityC02330At, C0CI c0ci) {
        this.A02 = c2mz;
        this.A00 = activityC02330At;
        this.A01 = c0ci;
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        return Boolean.valueOf(this.A02.A03.A0E());
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        Boolean bool = (Boolean) obj;
        ActivityC02330At activityC02330At = this.A00;
        if (!C002701i.A1P(activityC02330At)) {
            if (!this.A02.A01.A00.getBoolean("delete_chat_clear_chat_nux_accepted", false) && bool.booleanValue()) {
                C0U4 c0u4 = new C0U4();
                c0u4.A02 = R.layout.dialog_delete_clear_nux;
                c0u4.A05 = R.string.delete_chat_clear_chat_nux_title;
                c0u4.A0A = new Object[0];
                final C0CI c0ci = this.A01;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.3Zk
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C53682hL c53682hL = C53682hL.this;
                        C0CI c0ci2 = c0ci;
                        C000200d.A0j(c53682hL.A02.A01, "delete_chat_clear_chat_nux_accepted", true);
                        c0ci2.A00(Boolean.TRUE);
                    }
                };
                c0u4.A03 = R.string.delete_chat_clear_chat_nux_button_text;
                c0u4.A06 = onClickListener;
                c0u4.A01().A14(activityC02330At.A0N(), null);
                return;
            }
            this.A01.A00(bool);
        }
    }
}
