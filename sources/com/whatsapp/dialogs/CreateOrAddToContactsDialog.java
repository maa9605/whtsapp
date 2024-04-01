package com.whatsapp.dialogs;

import X.C019208x;
import X.C019308y;
import X.C60542ue;
import X.InterfaceC52962bf;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import com.google.android.search.verification.client.R;
import com.whatsapp.dialogs.CreateOrAddToContactsDialog;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class CreateOrAddToContactsDialog extends Hilt_CreateOrAddToContactsDialog {
    public InterfaceC52962bf A00;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(new C60542ue(A0F(R.string.create_contact), R.id.menuitem_conversations_add_new_contact));
        arrayList.add(new C60542ue(A0F(R.string.add_exist), R.id.menuitem_conversations_add_to_existing_contact));
        C019208x c019208x = new C019208x(((Hilt_CreateOrAddToContactsDialog) this).A00);
        ArrayAdapter arrayAdapter = new ArrayAdapter(((Hilt_CreateOrAddToContactsDialog) this).A00, 17367043, arrayList);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.2ua
            {
                CreateOrAddToContactsDialog.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                CreateOrAddToContactsDialog createOrAddToContactsDialog = CreateOrAddToContactsDialog.this;
                List list = arrayList;
                if (createOrAddToContactsDialog.A00 != null) {
                    if (((C60542ue) list.get(i)).A00 == R.id.menuitem_conversations_add_new_contact) {
                        createOrAddToContactsDialog.A00.AJ8();
                        return;
                    } else {
                        createOrAddToContactsDialog.A00.AGz();
                        return;
                    }
                }
                throw null;
            }
        };
        C019308y c019308y = c019208x.A01;
        c019308y.A0D = arrayAdapter;
        c019308y.A05 = onClickListener;
        return c019208x.A00();
    }
}
