package com.whatsapp.storage;

import X.AbstractC02800Cx;
import X.C002301c;
import X.C018508q;
import X.C019208x;
import X.C02180Ae;
import X.C02820Cz;
import X.C0AT;
import X.C38801p0;
import X.C54032hw;
import android.app.Dialog;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class StorageUsageDeleteCompleteDialogFragment extends Hilt_StorageUsageDeleteCompleteDialogFragment {
    public C018508q A00;
    public C002301c A01;

    @Override // X.C0BA
    public void A0s() {
        this.A0U = true;
        ((DialogFragment) this).A03.getWindow().setLayout(A01().getDimensionPixelSize(R.dimen.storage_usage_delete_complete_dialog_width), -2);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        ContextWrapper contextWrapper = ((Hilt_StorageUsageDeleteCompleteDialogFragment) this).A00;
        Bundle A02 = A02();
        View inflate = LayoutInflater.from(contextWrapper).inflate(R.layout.storage_usage_delete_complete_dialog, (ViewGroup) null, false);
        ImageView imageView = (ImageView) C0AT.A0D(inflate, R.id.check_mark_image_view);
        C38801p0 A00 = C38801p0.A00(contextWrapper, R.drawable.storage_usage_check_mark_icon);
        if (A00 != null) {
            imageView.setImageDrawable(A00);
            A00.start();
            A00.A02(new C54032hw(this));
            ((TextView) C0AT.A0D(inflate, R.id.title_text_view)).setText(C02180Ae.A0j(this.A01, R.plurals.storage_usage_delete_completed_text, A02.getLong("deleted_disk_size"), true));
            C019208x c019208x = new C019208x(contextWrapper);
            c019208x.A07(inflate);
            c019208x.A01.A0J = true;
            return c019208x.A00();
        }
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void A14(AbstractC02800Cx abstractC02800Cx, String str) {
        if (abstractC02800Cx != null) {
            C02820Cz c02820Cz = new C02820Cz(abstractC02800Cx);
            c02820Cz.A09(0, this, str, 1);
            c02820Cz.A05();
            return;
        }
        throw null;
    }
}
