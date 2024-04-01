package com.whatsapp.registration;

import X.AnonymousClass031;
import X.C000200d;
import X.C002301c;
import X.C019208x;
import X.C019308y;
import X.C26O;
import X.C3VM;
import X.DialogInterfaceC019408z;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.search.verification.client.R;
import com.whatsapp.registration.SelectPhoneNumberDialog;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class SelectPhoneNumberDialog extends Hilt_SelectPhoneNumberDialog {
    public AnonymousClass031 A00;
    public C002301c A01;
    public C26O A02;

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0e() {
        super.A0e();
        this.A02 = null;
    }

    @Override // com.whatsapp.registration.Hilt_SelectPhoneNumberDialog, com.whatsapp.base.Hilt_WaDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        if (context instanceof C26O) {
            this.A02 = (C26O) context;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        final ArrayList parcelableArrayList = A02().getParcelableArrayList("deviceSimInfoList");
        if (parcelableArrayList != null) {
            StringBuilder A0P = C000200d.A0P("select-phone-number-dialog/number-of-suggestions: ");
            A0P.append(parcelableArrayList.size());
            Log.i(A0P.toString());
            Context A00 = A00();
            final C3VM c3vm = new C3VM(A00, this.A00, parcelableArrayList);
            C019208x c019208x = new C019208x(A00);
            c019208x.A03(R.string.select_phone_number_dialog_title);
            C019308y c019308y = c019208x.A01;
            c019308y.A0D = c3vm;
            c019308y.A05 = null;
            c019208x.A06(R.string.use, new DialogInterface.OnClickListener() { // from class: X.3Uc
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    SelectPhoneNumberDialog selectPhoneNumberDialog = SelectPhoneNumberDialog.this;
                    ArrayList arrayList = parcelableArrayList;
                    C3VM c3vm2 = c3vm;
                    Log.i("select-phone-number-dialog/use-clicked");
                    C1KQ c1kq = (C1KQ) arrayList.get(c3vm2.A00);
                    C26O c26o = selectPhoneNumberDialog.A02;
                    if (c26o != null) {
                        c26o.AMW(c1kq);
                    }
                    selectPhoneNumberDialog.A10();
                }
            });
            c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.3Ud
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    SelectPhoneNumberDialog selectPhoneNumberDialog = SelectPhoneNumberDialog.this;
                    Log.i("select-phone-number-dialog/no-phone-number-selected");
                    C26O c26o = selectPhoneNumberDialog.A02;
                    if (c26o != null) {
                        c26o.AID();
                    }
                    selectPhoneNumberDialog.A10();
                }
            });
            DialogInterfaceC019408z A002 = c019208x.A00();
            A002.A00.A0L.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: X.3Ue
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                    C3VM c3vm2 = C3VM.this;
                    Log.i("select-phone-number-dialog/phone-number-selected");
                    if (c3vm2.A00 != i) {
                        c3vm2.A00 = i;
                        c3vm2.notifyDataSetChanged();
                    }
                }
            });
            return A002;
        }
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        C26O c26o = this.A02;
        if (c26o != null) {
            c26o.AID();
        }
    }
}
