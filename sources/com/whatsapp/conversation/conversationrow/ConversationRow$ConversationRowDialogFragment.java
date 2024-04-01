package com.whatsapp.conversation.conversationrow;

import X.AbstractC005302j;
import X.C000700j;
import X.C018708s;
import X.C019208x;
import X.C019308y;
import X.C05W;
import X.C06C;
import X.C0BA;
import X.C58802rj;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.conversation.conversationrow.ConversationRow$ConversationRowDialogFragment;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class ConversationRow$ConversationRowDialogFragment extends Hilt_ConversationRow_ConversationRowDialogFragment {
    public C05W A00;
    public C018708s A01;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        String string = ((C0BA) this).A06.getString("jid");
        final AbstractC005302j A02 = AbstractC005302j.A02(string);
        StringBuilder sb = new StringBuilder("ConversationRow/onCreateDialog/invalid jid=");
        sb.append(string);
        C000700j.A04(A02, sb.toString());
        C06C A0A = this.A00.A0A(A02);
        final ArrayList arrayList = new ArrayList();
        if (A0A.A08 == null) {
            arrayList.add(new C58802rj(((Hilt_ConversationRow_ConversationRowDialogFragment) this).A00.getString(R.string.add_contact), (int) R.id.menuitem_add_to_contacts));
            arrayList.add(new C58802rj(((Hilt_ConversationRow_ConversationRowDialogFragment) this).A00.getString(R.string.add_exist), (int) R.id.menuitem_add_to_existing_contact));
        }
        String A04 = this.A01.A04(A0A);
        arrayList.add(new C58802rj(((Hilt_ConversationRow_ConversationRowDialogFragment) this).A00.getString(R.string.message_contact_name, A04), (int) R.id.menuitem_message_contact));
        arrayList.add(new C58802rj(((Hilt_ConversationRow_ConversationRowDialogFragment) this).A00.getString(R.string.voice_call_contact_name, A04), (int) R.id.menuitem_voice_call_contact));
        arrayList.add(new C58802rj(((Hilt_ConversationRow_ConversationRowDialogFragment) this).A00.getString(R.string.video_call_contact_name, A04), (int) R.id.menuitem_video_call_contact));
        C019208x c019208x = new C019208x(((Hilt_ConversationRow_ConversationRowDialogFragment) this).A00);
        ArrayAdapter arrayAdapter = new ArrayAdapter(((Hilt_ConversationRow_ConversationRowDialogFragment) this).A00, 17367043, arrayList);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.2rF
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ConversationRow$ConversationRowDialogFragment conversationRow$ConversationRowDialogFragment = ConversationRow$ConversationRowDialogFragment.this;
                List list = arrayList;
                AbstractC005302j abstractC005302j = A02;
                ActivityC02330At A09 = conversationRow$ConversationRowDialogFragment.A09();
                if (A09 instanceof Conversation) {
                    ((Conversation) A09).A2Y(((C58802rj) list.get(i)).A00, abstractC005302j);
                }
            }
        };
        C019308y c019308y = c019208x.A01;
        c019308y.A0D = arrayAdapter;
        c019308y.A05 = onClickListener;
        return c019208x.A00();
    }
}
