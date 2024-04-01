package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.49N  reason: invalid class name */
/* loaded from: classes3.dex */
public class C49N extends ArrayAdapter {
    public List A00;
    public final /* synthetic */ IndiaUpiBankAccountPickerActivity A01;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49N(IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity, Context context) {
        super(context, (int) R.layout.india_upi_account_picker_list_row, new ArrayList());
        this.A01 = indiaUpiBankAccountPickerActivity;
        this.A00 = new ArrayList();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        List list = this.A00;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public Object getItem(int i) {
        return this.A00.get(i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C49O c49o;
        if (view == null) {
            IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity = this.A01;
            view = indiaUpiBankAccountPickerActivity.getLayoutInflater().inflate(R.layout.india_upi_account_picker_list_row, viewGroup, false);
            c49o = new C49O(indiaUpiBankAccountPickerActivity, view);
            view.setTag(c49o);
        } else {
            c49o = (C49O) view.getTag();
        }
        C49M c49m = (C49M) this.A00.get(i);
        if (c49m != null) {
            IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity2 = c49o.A03;
            if (!TextUtils.isEmpty(indiaUpiBankAccountPickerActivity2.A0J)) {
                indiaUpiBankAccountPickerActivity2.A0I.A02(indiaUpiBankAccountPickerActivity2.A0J, c49o.A00, indiaUpiBankAccountPickerActivity2.getResources().getDrawable(R.drawable.bank_logo_placeholder));
            } else {
                c49o.A00.setImageResource(R.drawable.bank_logo_placeholder);
            }
            c49o.A02.setText(C40841sx.A0R(c49m.A01, c49m.A02));
            c49o.A01.setText(c49m.A00);
        }
        return view;
    }
}
