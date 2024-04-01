package com.whatsapp.settings;

import X.C02160Ac;
import X.C2P5;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.ViewOnClickCListenerShape10S0100000_I0_2;

/* loaded from: classes2.dex */
public class About extends C2P5 {
    @Override // X.C2P5, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.about);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(C02160Ac.A00(this, R.color.about_statusbar));
        }
        ((TextView) findViewById(R.id.version)).setText(getString(R.string.version, "2.21.9.15"));
        TextView textView = (TextView) findViewById(R.id.about_licenses);
        SpannableString spannableString = new SpannableString(getString(R.string.view_licenses));
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        textView.setText(spannableString);
        textView.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 28));
    }
}
