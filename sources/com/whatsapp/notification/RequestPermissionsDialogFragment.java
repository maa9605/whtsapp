package com.whatsapp.notification;

import X.C000500h;
import X.C03150Ej;
import X.C0BA;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape10S0100000_I0_2;
import com.whatsapp.util.ViewOnClickCListenerShape3S0200000_I0;

/* loaded from: classes2.dex */
public final class RequestPermissionsDialogFragment extends Hilt_RequestPermissionsDialogFragment {
    public C03150Ej A00;
    public C000500h A01;

    @Override // com.whatsapp.base.WaDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0g() {
        super.A0g();
        Window window = ((DialogFragment) this).A03.getWindow();
        if (window != null) {
            window.setLayout(A01().getDisplayMetrics().widthPixels, A01().getDisplayMetrics().heightPixels);
            return;
        }
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        int i;
        Dialog dialog = new Dialog(A09());
        dialog.requestWindowFeature(1);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            dialog.setCancelable(false);
            dialog.setCanceledOnTouchOutside(false);
            dialog.setContentView(R.layout.permissions_request);
            Bundle bundle2 = ((C0BA) this).A06;
            int[] intArray = bundle2.getIntArray("drawables");
            if (intArray != null) {
                if (intArray.length == 1) {
                    ((ImageView) dialog.findViewById(R.id.permission_image_1)).setImageResource(intArray[0]);
                    dialog.findViewById(R.id.permission_image).setVisibility(8);
                    dialog.findViewById(R.id.permission_image_2).setVisibility(8);
                } else {
                    ((ImageView) dialog.findViewById(R.id.permission_image)).setImageResource(intArray[0]);
                    ((ImageView) dialog.findViewById(R.id.permission_image_1)).setImageResource(intArray[1]);
                    ((ImageView) dialog.findViewById(R.id.permission_image_2)).setImageResource(intArray[2]);
                    dialog.findViewById(R.id.permission_image).setVisibility(0);
                    dialog.findViewById(R.id.permission_image_2).setVisibility(0);
                }
            }
            dialog.findViewById(R.id.cancel).setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 5));
            String[] stringArray = bundle2.getStringArray("permissions");
            if (stringArray == null) {
                Log.e("permissions/dialog/fragment/no permissions provided");
                return dialog;
            }
            TextView textView = (TextView) dialog.findViewById(R.id.submit);
            boolean A0P = RequestPermissionActivity.A0P(A09(), stringArray);
            TextView textView2 = (TextView) dialog.findViewById(R.id.permission_message);
            boolean z = this.A00.A00;
            Bundle bundle3 = ((C0BA) this).A06;
            if (A0P) {
                i = bundle3.getInt(z ? "locked_msg_id" : "msg_id");
            } else {
                i = bundle3.getInt(z ? "locked_perm_denial_msg_id" : "perm_denial_msg_id");
            }
            textView2.setText(i);
            if (A0P) {
                textView.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(stringArray, this, 14));
                return dialog;
            }
            textView.setText(R.string.permission_settings_open);
            textView.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 6));
            return dialog;
        }
        throw null;
    }
}
