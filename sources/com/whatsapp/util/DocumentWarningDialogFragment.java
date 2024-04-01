package com.whatsapp.util;

import X.AbstractC000600i;
import X.C018308n;
import X.C018508q;
import X.C019208x;
import X.C01B;
import X.C0C9;
import X.C40421sE;
import X.InterfaceC002901k;
import android.app.Dialog;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.contentprovider.MediaProvider;
import com.whatsapp.util.DocumentWarningDialogFragment;
import com.whatsapp.util.Hilt_DocumentWarningDialogFragment;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class DocumentWarningDialogFragment extends Hilt_DocumentWarningDialogFragment {
    public C018308n A00;
    public AbstractC000600i A01;
    public C018508q A02;
    public C01B A03;
    public C0C9 A04;
    public C40421sE A05;
    public InterfaceC002901k A06;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        C019208x c019208x = new C019208x(((Hilt_DocumentWarningDialogFragment) this).A00);
        c019208x.A01.A0E = A0F(A02().getInt("warning_id", R.string.warning_opening_document));
        c019208x.A06(R.string.open, new DialogInterface.OnClickListener() { // from class: X.3Zq
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                DocumentWarningDialogFragment documentWarningDialogFragment = DocumentWarningDialogFragment.this;
                C09E c09e = (C09E) documentWarningDialogFragment.A04.A0C(documentWarningDialogFragment.A02().getLong("message_id"));
                if (c09e != null && ((AnonymousClass097) c09e).A02 != null) {
                    C018508q c018508q = documentWarningDialogFragment.A02;
                    AbstractC000600i abstractC000600i = documentWarningDialogFragment.A01;
                    InterfaceC002901k interfaceC002901k = documentWarningDialogFragment.A06;
                    C40421sE c40421sE = documentWarningDialogFragment.A05;
                    ContextWrapper contextWrapper = ((Hilt_DocumentWarningDialogFragment) documentWarningDialogFragment).A00;
                    C018308n c018308n = documentWarningDialogFragment.A00;
                    WeakReference weakReference = new WeakReference(contextWrapper);
                    c018508q.A06(0, R.string.loading_spinner);
                    MediaProvider.A05(c018508q, abstractC000600i, interfaceC002901k, c40421sE, c09e, new C83603sO(weakReference, c018508q, c018308n, c09e));
                    ((AnonymousClass097) c09e).A02.A07 = 2;
                    documentWarningDialogFragment.A04.A0T(c09e);
                }
            }
        });
        c019208x.A04(R.string.cancel, null);
        return c019208x.A00();
    }
}
