package X;

import com.whatsapp.inappsupport.ui.ContactUsActivity;
import com.whatsapp.util.Log;

/* renamed from: X.2He  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C48872He {
    public final /* synthetic */ C2O9 A00;
    public final /* synthetic */ C48882Hf A01;
    public final /* synthetic */ boolean A02;

    public C48872He(C2O9 c2o9, C48882Hf c48882Hf, boolean z) {
        this.A00 = c2o9;
        this.A01 = c48882Hf;
        this.A02 = z;
    }

    public void A00(int i) {
        C000200d.A0p("ChatSupportTicketManager/contactSupport/onError, errorCode=", i);
        C48882Hf c48882Hf = this.A01;
        if (c48882Hf != null) {
            StringBuilder sb = new StringBuilder("ContactUsActivity/createTicketIq/onError/errorCode=");
            sb.append(i);
            sb.append(" falling back to email support.");
            Log.e(sb.toString());
            ContactUsActivity contactUsActivity = c48882Hf.A00;
            contactUsActivity.ARS();
            contactUsActivity.A1P();
            return;
        }
        throw null;
    }
}
