package X;

import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.Conversation;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.37u */
/* loaded from: classes2.dex */
public final /* synthetic */ class C655937u {
    public final /* synthetic */ AbstractC48182Ef A00;

    public /* synthetic */ C655937u(AbstractC48182Ef abstractC48182Ef) {
        this.A00 = abstractC48182Ef;
    }

    public final void A00(C2D3 c2d3) {
        AbstractC48182Ef abstractC48182Ef = this.A00;
        Conversation A0E = abstractC48182Ef.A0E();
        if (A0E == null) {
            Log.e("ConversationRow/dynamicReplyOnClickCallback/error: not click in Conversation");
        } else {
            C50322Rg c50322Rg = c2d3.A02;
            if (c50322Rg != null) {
                String str = c50322Rg.A00;
                if ("novi_hub".equals(str)) {
                    C37561mc c37561mc = new C37561mc();
                    c37561mc.A00 = Integer.valueOf(AnonymousClass088.A09(abstractC48182Ef.A0S.A00(abstractC48182Ef.getFMessage().A0B())));
                    c37561mc.A01 = 4;
                    c37561mc.A02 = 0;
                    c37561mc.A03 = 1;
                    c37561mc.A04 = "{\"CTA\":\"novi_hub\"}";
                    abstractC48182Ef.A0o.A0B(c37561mc, null, true);
                    Bundle bundle = new Bundle();
                    bundle.putString("nfm_action", str);
                    Class ABX = abstractC48182Ef.A0v.A03().ABX(bundle);
                    if (ABX == null) {
                        Log.e("[PAY]: ConversationRow -- NFM novi-hub is not supported");
                    } else {
                        Intent intent = new Intent(A0E, ABX);
                        HashMap hashMap = new HashMap();
                        hashMap.put("login_entry_point", "novi_care_navigate_to_hub");
                        intent.putExtra("screen_params", hashMap);
                        intent.putExtra("screen_name", "novipay_p_login_password");
                        A0E.startActivity(intent);
                    }
                } else if ("novi_login".equals(str)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("nfm_action", str);
                    Class ABX2 = abstractC48182Ef.A0v.A03().ABX(bundle2);
                    if (ABX2 == null) {
                        Log.e("[PAY]: NFM ConversationRow novi-login is not supported");
                    } else {
                        Intent intent2 = new Intent(A0E, ABX2);
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("login_entry_point", "novi_care_navigate_to_login");
                        intent2.putExtra("screen_params", hashMap2);
                        intent2.putExtra("screen_name", "novipay_p_login_password");
                        A0E.startActivity(intent2);
                    }
                }
            } else {
                AnonymousClass092 fMessage = abstractC48182Ef.getFMessage();
                C018608r c018608r = A0E.A10;
                Jid A03 = A0E.A2D.A03(AbstractC005302j.class);
                if (A03 != null) {
                    C05U c05u = c018608r.A12;
                    String str2 = c2d3.A03;
                    String str3 = c2d3.A04;
                    long A05 = c018608r.A0J.A05();
                    C05V c05v = c05u.A07;
                    C05510Pa c05510Pa = new C05510Pa(C05V.A00(c05v.A01, c05v.A00, (AbstractC005302j) A03, true), A05, str2, str3);
                    c05u.A05(c05510Pa, fMessage);
                    c018608r.A0R(c05510Pa);
                    c018608r.A0U.A0Q(c05510Pa);
                } else {
                    throw null;
                }
            }
        }
        abstractC48182Ef.A0I();
    }
}
