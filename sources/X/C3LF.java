package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.3LF  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3LF extends AnonymousClass337 {
    public int A00;
    public final Button A01;
    public final LinearLayout A02;
    public final ProgressBar A03;
    public final TextView A04;
    public final AnonymousClass075 A05;
    public final C018708s A06;

    public C3LF(C018508q c018508q, C02L c02l, C018308n c018308n, C05W c05w, C018708s c018708s, AnonymousClass272 anonymousClass272, AnonymousClass075 anonymousClass075, View view) {
        super(c02l, c018308n, c05w, view);
        this.A03 = (ProgressBar) view.findViewById(R.id.catalog_list_footer_loading_spinner);
        this.A02 = (LinearLayout) view.findViewById(R.id.catalog_list_footer_end_of_results);
        this.A04 = (TextView) view.findViewById(R.id.catalog_list_footer_end_of_results_title);
        this.A06 = c018708s;
        this.A05 = anonymousClass075;
        this.A01 = (Button) view.findViewById(R.id.end_of_results_button);
    }

    public static C3LF A00(ViewGroup viewGroup, C018508q c018508q, C02L c02l, C018308n c018308n, C05W c05w, C018708s c018708s, AnonymousClass272 anonymousClass272, AnonymousClass075 anonymousClass075) {
        return new C3LF(c018508q, c02l, c018308n, c05w, c018708s, anonymousClass272, anonymousClass075, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.business_product_catalog_list_footer, viewGroup, false));
    }
}
