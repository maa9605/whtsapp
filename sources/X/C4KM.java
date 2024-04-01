package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiMandateHistoryActivity;
import com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity;
import com.whatsapp.payments.ui.widget.PayToolbar;

/* renamed from: X.4KM */
/* loaded from: classes3.dex */
public class C4KM extends C4K6 {
    public RecyclerView A00;
    public PayToolbar A01;
    public final C4E4 A03 = new C4E4(this);
    public final C014406v A02 = C014406v.A00("PaymentComponentListActivity", "infra", "COMMON");

    public C0TS A1P(ViewGroup viewGroup, int i) {
        C014406v c014406v = this.A02;
        StringBuilder sb = new StringBuilder("Create view holder for ");
        sb.append(i);
        c014406v.A03(sb.toString());
        switch (i) {
            case C42311vX.A0A /* 100 */:
                return new C4HU(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_common_component_section_header, viewGroup, false));
            case 101:
            default:
                StringBuilder sb2 = new StringBuilder("no valid mapping for: ");
                sb2.append(i);
                throw new RuntimeException(C014406v.A01("PaymentComponentListActivity", sb2.toString()));
            case 102:
                return new AbstractC91274Eh(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_common_component_section_separator, viewGroup, false)) { // from class: X.4HV
                };
            case 103:
                return new AbstractC91274Eh(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.divider, viewGroup, false)) { // from class: X.4HV
                };
            case 104:
                return new AbstractC91264Eg(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_common_component_centered_title, viewGroup, false)) { // from class: X.4HT
                    public TextView A00;
                    public TextView A01;

                    {
                        super(r2);
                        this.A01 = (TextView) C0AT.A0D(r2, R.id.title_text);
                        this.A00 = (TextView) C0AT.A0D(r2, R.id.subtitle_text);
                    }
                };
        }
    }

    @Override // X.C4K6, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        if (this instanceof PaymentTransactionDetailsListActivity) {
            z = false;
        } else {
            z = !(this instanceof IndiaUpiMandateHistoryActivity);
        }
        if (z) {
            setContentView(R.layout.payment_component_pay_service_list_activity);
            int A00 = C02160Ac.A00(this, R.color.fb_pay_hub_icon_tint);
            PayToolbar payToolbar = (PayToolbar) findViewById(R.id.pay_service_toolbar);
            this.A01 = payToolbar;
            A0k(payToolbar);
            C0U1 A0c = A0c();
            if (A0c != null) {
                A0c.A08(R.string.facebook_pay);
                A0c.A0L(true);
                A0c.A0A(C02180Ae.A0Q(getResources().getDrawable(R.drawable.ic_close), A00));
            }
        } else {
            setContentView(R.layout.payment_component_list_activity);
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.payment_component_list);
        this.A00 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        this.A00.setAdapter(this.A03);
    }
}
