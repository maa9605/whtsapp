package com.whatsapp.wabloks.ui;

import X.AbstractView$OnClickListenerC49532Ky;
import X.AnonymousClass081;
import X.C00J;
import X.C2MB;
import X.C2MU;
import X.C2Qg;
import X.C2Qk;
import X.C46D;
import X.C46M;
import X.C91644Fs;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.wabloks.ui.BkActionBottomSheet;
import java.util.List;

/* loaded from: classes3.dex */
public class BkActionBottomSheet extends Hilt_BkActionBottomSheet {
    public C2MB A00;
    public C2Qg A01;
    public C2MU A02;
    public C00J A03;

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        List<AnonymousClass081> list;
        C2Qg A00 = this.A02.A00(A00());
        this.A01 = A00;
        A00.A01(C91644Fs.class, this, new C2Qk() { // from class: X.3ur
            {
                BkActionBottomSheet.this = this;
            }

            @Override // X.C2Qk
            public final void AK4(Object obj) {
                BkActionBottomSheet.this.A16(false, false);
            }
        });
        Bundle A02 = A02();
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.action_bottom_sheet, viewGroup, false);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.bloks_action_sheet_title);
        TextView textView2 = (TextView) viewGroup2.findViewById(R.id.bloks_action_sheet_description);
        String string = A02.getString("action_sheet_title", "");
        String string2 = A02.getString("action_sheet_message", "");
        if (!TextUtils.isEmpty(string)) {
            textView.setVisibility(0);
            textView.setText(A02.getString("action_sheet_title"));
        }
        if (!TextUtils.isEmpty(string2)) {
            textView2.setVisibility(0);
            textView2.setText(A02.getString("action_sheet_message"));
        }
        if (A02.getBoolean("action_sheet_has_buttons")) {
            boolean z = A02.getBoolean("action_sheet_has_buttons", false);
            String string3 = A02.getString("action_sheet_buttons", "");
            if (z && (list = (List) ((C46M) this.A03.get()).A01("action_sheet_buttons", string3)) != null) {
                for (final AnonymousClass081 anonymousClass081 : list) {
                    TextView textView3 = (TextView) layoutInflater.inflate(R.layout.action_sheet_button, viewGroup, false);
                    textView3.setText(anonymousClass081.ADJ(C46D.A01));
                    textView3.setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.4G0
                        {
                            BkActionBottomSheet.this = this;
                        }

                        @Override // X.AbstractView$OnClickListenerC49532Ky
                        public void A00(View view) {
                            C09P AA3 = anonymousClass081.AA3(C46D.A00);
                            if (AA3 != null) {
                                BkActionBottomSheet bkActionBottomSheet = BkActionBottomSheet.this;
                                C45Q.A0O(new C892046c(bkActionBottomSheet.A0H, (ActivityC02290Ap) bkActionBottomSheet.A09(), bkActionBottomSheet.A00), AA3, C021109r.A01);
                            }
                        }
                    });
                    viewGroup2.addView(textView3);
                }
            } else {
                A16(false, false);
            }
        }
        return viewGroup2;
    }
}
