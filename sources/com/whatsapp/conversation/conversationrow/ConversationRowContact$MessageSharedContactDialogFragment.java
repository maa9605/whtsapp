package com.whatsapp.conversation.conversationrow;

import X.C000200d;
import X.C003101m;
import X.C019208x;
import X.C019308y;
import X.C0BA;
import X.C2J8;
import X.C58802rj;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversation.conversationrow.ConversationRowContact$MessageSharedContactDialogFragment;
import com.whatsapp.conversation.conversationrow.Hilt_ConversationRowContact_MessageSharedContactDialogFragment;
import com.whatsapp.jid.UserJid;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class ConversationRowContact$MessageSharedContactDialogFragment extends Hilt_ConversationRowContact_MessageSharedContactDialogFragment {
    public C2J8 A00;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        List A0F = C003101m.A0F(UserJid.class, A02().getStringArrayList("jids"));
        ArrayList<String> stringArrayList = ((C0BA) this).A06.getStringArrayList("phones");
        ArrayList<String> stringArrayList2 = ((C0BA) this).A06.getStringArrayList("labels");
        final String string = ((C0BA) this).A06.getString("business_name");
        final ArrayList arrayList = new ArrayList();
        if (stringArrayList2 != null && stringArrayList != null) {
            int i = 0;
            while (true) {
                AbstractList abstractList = (AbstractList) A0F;
                if (i >= abstractList.size()) {
                    break;
                }
                if (abstractList.get(i) != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(((Hilt_ConversationRowContact_MessageSharedContactDialogFragment) this).A00.getString(R.string.message_contact_name, stringArrayList.get(i)));
                    sb.append(TextUtils.isEmpty(stringArrayList2.get(i)) ? "" : C000200d.A0L(C000200d.A0P(" ("), stringArrayList2.get(i), ")"));
                    arrayList.add(new C58802rj(sb.toString(), (UserJid) abstractList.get(i)));
                }
                i++;
            }
        }
        C019208x c019208x = new C019208x(A00());
        ArrayAdapter arrayAdapter = new ArrayAdapter(((Hilt_ConversationRowContact_MessageSharedContactDialogFragment) this).A00, (int) R.layout.select_phone_dialog_item, arrayList);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.2rK
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ConversationRowContact$MessageSharedContactDialogFragment conversationRowContact$MessageSharedContactDialogFragment = ConversationRowContact$MessageSharedContactDialogFragment.this;
                List list = arrayList;
                String str = string;
                UserJid userJid = ((C58802rj) list.get(i2)).A01;
                if (userJid != null) {
                    conversationRowContact$MessageSharedContactDialogFragment.A00.A01(((Hilt_ConversationRowContact_MessageSharedContactDialogFragment) conversationRowContact$MessageSharedContactDialogFragment).A00, userJid, str);
                }
            }
        };
        C019308y c019308y = c019208x.A01;
        c019308y.A0D = arrayAdapter;
        c019308y.A05 = onClickListener;
        return c019208x.A00();
    }
}
