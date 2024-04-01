package com.whatsapp.instrumentation.ui;

import X.C2OH;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class PermissionsFragment extends Hilt_PermissionsFragment {
    public C2OH A00;

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.instrumentation_permissions, viewGroup, false);
    }

    @Override // com.whatsapp.instrumentation.ui.Hilt_PermissionsFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        if (context instanceof C2OH) {
            this.A00 = (C2OH) context;
        }
    }

    @Override // X.C0BA
    public void A0w(View view, Bundle bundle) {
        view.findViewById(R.id.auth_button_next).setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1(this, 8));
        TextView textView = (TextView) view.findViewById(R.id.auth_privacy_disclosure_text);
        textView.setText(Html.fromHtml(A0F(R.string.instrumentation_auth_privacy_disclosure)));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
