package com.whatsapp.support;

import X.AbstractC005302j;
import X.ActivityC02330At;
import X.C018508q;
import X.C018708s;
import X.C019208x;
import X.C019308y;
import X.C01B;
import X.C01C;
import X.C05W;
import X.C06C;
import X.C2MR;
import X.DialogInterfaceC019408z;
import X.InterfaceC002901k;
import X.InterfaceC53372gA;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.HomeActivity;
import com.whatsapp.support.Hilt_ReportSpamDialogFragment;
import com.whatsapp.support.ReportSpamDialogFragment;

/* loaded from: classes2.dex */
public class ReportSpamDialogFragment extends Hilt_ReportSpamDialogFragment implements InterfaceC53372gA {
    public C018508q A00;
    public C01B A01;
    public C05W A02;
    public C018708s A03;
    public C2MR A04;
    public InterfaceC002901k A05;

    public static ReportSpamDialogFragment A00(AbstractC005302j abstractC005302j, String str, boolean z) {
        ReportSpamDialogFragment reportSpamDialogFragment = new ReportSpamDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("jid", abstractC005302j.getRawString());
        bundle.putString("flow", str);
        bundle.putBoolean("hasLoggedInPairedDevices", z);
        reportSpamDialogFragment.A0P(bundle);
        return reportSpamDialogFragment;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        ActivityC02330At A09 = A09();
        AbstractC005302j A02 = AbstractC005302j.A02(A02().getString("jid"));
        if (A02 != null) {
            final String string = A02().getString("flow");
            boolean z = A02().getBoolean("hasLoggedInPairedDevices");
            final C06C A0A = this.A02.A0A(A02);
            View inflate = LayoutInflater.from(((Hilt_ReportSpamDialogFragment) this).A00).inflate(R.layout.dialog_report_spam, (ViewGroup) null);
            final CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.block_checkbox);
            checkBox.setChecked(true);
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.3Yp
                {
                    ReportSpamDialogFragment.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ReportSpamDialogFragment reportSpamDialogFragment = ReportSpamDialogFragment.this;
                    C06C c06c = A0A;
                    String str = string;
                    CheckBox checkBox2 = checkBox;
                    if (i == -1) {
                        boolean isChecked = checkBox2.isChecked();
                        if (reportSpamDialogFragment.A04.A02(((Hilt_ReportSpamDialogFragment) reportSpamDialogFragment).A00)) {
                            reportSpamDialogFragment.A0i(new Intent(((Hilt_ReportSpamDialogFragment) reportSpamDialogFragment).A00, HomeActivity.class).addFlags(603979776));
                            reportSpamDialogFragment.A00.A06(R.string.reporting_spam_title, R.string.register_wait_message);
                            reportSpamDialogFragment.A05.AS1(new RunnableEBaseShape0S1210000_I0(reportSpamDialogFragment, isChecked, c06c, str, 1));
                        }
                    }
                }
            };
            TextView textView = (TextView) inflate.findViewById(R.id.block_checkbox_text);
            TextView textView2 = (TextView) inflate.findViewById(R.id.report_spam_dialog_message);
            if (A09 != null) {
                C019208x c019208x = new C019208x(A09);
                C019308y c019308y = c019208x.A01;
                c019308y.A0C = inflate;
                c019308y.A01 = 0;
                if (A0A.A0C()) {
                    c019208x.A03(R.string.report_group_ask);
                    int i = R.string.reporting_flow_general_group;
                    if (z) {
                        i = R.string.reporting_flow_general_group_md_message;
                    }
                    textView2.setText(i);
                    textView.setText(R.string.report_exit_group_also);
                } else if (this.A01.A0E(C01C.A0k) && A0A.A0B()) {
                    c019308y.A0I = A0F(R.string.report_business_ask);
                    int i2 = R.string.reporting_flow_general_one_on_one_with_business;
                    if (z) {
                        i2 = R.string.reporting_flow_general_one_on_one_with_business_md_message;
                    }
                    textView2.setText(i2);
                    textView.setText(R.string.report_block_business_also);
                } else {
                    c019208x.A03(R.string.report_contact_ask);
                    int i3 = R.string.reporting_flow_general_one_on_one;
                    if (z) {
                        i3 = R.string.reporting_flow_general_one_on_one_md_message;
                    }
                    textView2.setText(i3);
                    textView.setText(R.string.report_block_also);
                }
                c019208x.A06(R.string.report_spam, onClickListener);
                c019208x.A04(R.string.cancel, null);
                DialogInterfaceC019408z A00 = c019208x.A00();
                A00.setCanceledOnTouchOutside(true);
                return A00;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.InterfaceC53372gA
    public void AKv(C06C c06c) {
        this.A00.A03();
        C018508q c018508q = this.A00;
        c018508q.A02.post(new RunnableEBaseShape7S0100000_I0_7(this, 14));
    }

    @Override // X.InterfaceC53372gA
    public void AQE(C06C c06c) {
        this.A00.A03();
        C018508q c018508q = this.A00;
        c018508q.A02.post(new RunnableEBaseShape4S0200000_I0_4(this, c06c, 37));
    }
}
