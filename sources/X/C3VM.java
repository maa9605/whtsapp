package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import java.util.List;

/* renamed from: X.3VM  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3VM extends ArrayAdapter {
    public int A00;
    public final AnonymousClass031 A01;
    public final List A02;

    public C3VM(Context context, AnonymousClass031 anonymousClass031, List list) {
        super(context, (int) R.layout.item_select_phone_number, list);
        this.A00 = 0;
        this.A02 = list;
        this.A01 = anonymousClass031;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.A02.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C3VL c3vl;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_select_phone_number, viewGroup, false);
            c3vl = new C3VL(null);
            view.setTag(c3vl);
            c3vl.A02 = (TextView) view.findViewById(R.id.title);
            c3vl.A01 = (TextView) view.findViewById(R.id.subtitle);
            c3vl.A00 = (RadioButton) view.findViewById(R.id.radio);
        } else {
            c3vl = (C3VL) view.getTag();
        }
        C1KQ c1kq = (C1KQ) this.A02.get(i);
        String str = c1kq.A00;
        String str2 = c1kq.A02;
        TextView textView = c3vl.A02;
        AnonymousClass031 anonymousClass031 = this.A01;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        textView.setText(C28E.A09(anonymousClass031, str, sb.toString()));
        c3vl.A01.setText(viewGroup.getContext().getString(R.string.select_phone_number_subtitle, Integer.valueOf(i + 1), c1kq.A01));
        c3vl.A00.setChecked(i == this.A00);
        return view;
    }
}
