package com.whatsapp.voipcalling;

import X.ActivityC02330At;
import X.C000200d;
import X.C018508q;
import X.C018608r;
import X.C018708s;
import X.C019208x;
import X.C019308y;
import X.C02160Ac;
import X.C05M;
import X.C05W;
import X.C06C;
import X.C0C9;
import X.C0E7;
import X.C0EA;
import X.C2M7;
import X.C2QU;
import X.C40261rr;
import X.C40301ry;
import X.C41221tZ;
import X.C41521u3;
import X.InterfaceC002901k;
import X.InterfaceC74223cu;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape3S0200000_I0;
import com.whatsapp.voipcalling.CallSpamActivity;

/* loaded from: classes2.dex */
public class CallSpamActivity extends C2QU {
    public C05W A00;
    public C05M A01;
    public C0EA A02;
    public C41521u3 A03;
    public InterfaceC74223cu A04 = new InterfaceC74223cu() { // from class: X.3tT
        {
            CallSpamActivity.this = this;
        }

        @Override // X.InterfaceC74223cu
        public final void A7q() {
            CallSpamActivity.this.finish();
        }
    };
    public C2M7 A05;

    @Override // X.C2QU, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        UserJid nullable;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null && (nullable = UserJid.getNullable(extras.getString("caller_jid"))) != null) {
            C06C A09 = this.A00.A09(nullable);
            String string = extras.getString("call_id");
            if (A09 != null && string != null) {
                getWindow().setBackgroundDrawable(new ColorDrawable(C02160Ac.A00(this, R.color.popup_dim)));
                getWindow().addFlags(2621440);
                setContentView(R.layout.call_spam);
                findViewById(R.id.call_spam_report).setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(extras, this, 17));
                findViewById(R.id.call_spam_not_spam).setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(nullable, this, 18));
                findViewById(R.id.call_spam_block).setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(extras, this, 19));
                this.A05.A00.add(this.A04);
                return;
            }
            Log.e("callspamactivity/create/not-creating/null-args");
            finish();
            return;
        }
        StringBuilder A0P = C000200d.A0P("callspamactivity/create/not-creating/bad-jid: ");
        A0P.append(extras != null ? extras.getString("caller_jid") : null);
        Log.e(A0P.toString());
        finish();
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C2M7 c2m7 = this.A05;
        c2m7.A00.remove(this.A04);
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStop() {
        super.onStop();
        finish();
    }

    /* loaded from: classes2.dex */
    public class ReportSpamOrBlockDialogFragment extends Hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment {
        public long A00;
        public CheckBox A01;
        public C018508q A02;
        public C018608r A03;
        public C40261rr A04;
        public C05W A05;
        public C018708s A06;
        public C41221tZ A07;
        public C0E7 A08;
        public C0C9 A09;
        public C06C A0A;
        public UserJid A0B;
        public UserJid A0C;
        public C41521u3 A0D;
        public C40301ry A0E;
        public InterfaceC002901k A0F;
        public String A0G;
        public String A0H;
        public boolean A0I;
        public boolean A0J;
        public boolean A0K;

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0z(Bundle bundle) {
            String str;
            String A0G;
            Log.i("callspamactivity/createdialog");
            Bundle A02 = A02();
            UserJid nullable = UserJid.getNullable(A02.getString("caller_jid"));
            if (nullable != null) {
                this.A0C = nullable;
                this.A0B = UserJid.getNullable(A02.getString("call_creator_jid"));
                C06C A09 = this.A05.A09(this.A0C);
                if (A09 != null) {
                    this.A0A = A09;
                    String string = A02.getString("call_id");
                    if (string != null) {
                        this.A0G = string;
                        this.A00 = A02.getLong("call_duration", -1L);
                        this.A0I = A02.getBoolean("call_terminator", false);
                        this.A0H = A02.getString("call_termination_reason");
                        this.A0K = A02.getBoolean("call_video", false);
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.3bq
                            {
                                CallSpamActivity.ReportSpamOrBlockDialogFragment.this = this;
                            }

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                CallSpamActivity.ReportSpamOrBlockDialogFragment reportSpamOrBlockDialogFragment = CallSpamActivity.ReportSpamOrBlockDialogFragment.this;
                                if (!reportSpamOrBlockDialogFragment.A08.A05()) {
                                    Log.w("callspamactivity/spam/report/no-network-cannot-block-report");
                                    boolean A022 = C0E7.A02(reportSpamOrBlockDialogFragment.A09());
                                    int i2 = R.string.no_network_cannot_block;
                                    if (A022) {
                                        i2 = R.string.no_network_cannot_block_airplane;
                                    }
                                    reportSpamOrBlockDialogFragment.A02.A07(i2, 0);
                                    return;
                                }
                                reportSpamOrBlockDialogFragment.A02.A0B(null);
                                reportSpamOrBlockDialogFragment.A0F.AS1(new RunnableEBaseShape4S0200000_I0_4(reportSpamOrBlockDialogFragment, reportSpamOrBlockDialogFragment.A0A(), 44));
                            }
                        };
                        ActivityC02330At A0A = A0A();
                        C019208x c019208x = new C019208x(A0A);
                        if (this.A0J) {
                            A0G = A0F(R.string.report_contact_ask);
                        } else {
                            Object[] objArr = new Object[1];
                            C06C c06c = this.A0A;
                            if (c06c != null) {
                                str = this.A06.A08(c06c, false);
                            } else {
                                str = "";
                            }
                            objArr[0] = str;
                            A0G = A0G(R.string.block_ask, objArr);
                        }
                        C019308y c019308y = c019208x.A01;
                        c019308y.A0E = A0G;
                        c019208x.A06(R.string.ok, onClickListener);
                        c019208x.A04(R.string.cancel, null);
                        if (this.A0J) {
                            View inflate = LayoutInflater.from(A0A).inflate(R.layout.report_spam_dialog, (ViewGroup) null);
                            CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.block_contact);
                            this.A01 = checkBox;
                            checkBox.setChecked(true);
                            c019308y.A0C = inflate;
                            c019308y.A01 = 0;
                        }
                        return c019208x.A00();
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
    }
}
