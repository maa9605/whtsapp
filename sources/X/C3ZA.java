package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape2S0200000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.support.faq.SearchFAQ;
import java.util.List;

/* renamed from: X.3ZA  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3ZA extends ArrayAdapter {
    public final /* synthetic */ SearchFAQ A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3ZA(SearchFAQ searchFAQ, Context context, List list) {
        super(context, (int) R.layout.search_faq_row, list);
        this.A00 = searchFAQ;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C3ZB c3zb;
        LinearLayout linearLayout;
        if (view == null) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.search_faq_row, (ViewGroup) linearLayout2, true);
            c3zb = new C3ZB(null);
            c3zb.A01 = (TextView) linearLayout2.findViewById(R.id.search_faq_row_text);
            c3zb.A00 = linearLayout2.findViewById(R.id.divider);
            linearLayout2.setTag(c3zb);
            linearLayout = linearLayout2;
        } else {
            c3zb = (C3ZB) view.getTag();
            linearLayout = view;
        }
        Object item = getItem(i);
        if (item != null) {
            C3Z9 c3z9 = (C3Z9) item;
            c3zb.A01.setText(c3z9.A02);
            c3zb.A00.setVisibility(i < getCount() - 1 ? 0 : 8);
            linearLayout.setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1(this, c3z9, 19));
            return linearLayout;
        }
        throw null;
    }
}
