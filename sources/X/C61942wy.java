package X;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.redex.ViewOnClickEBaseShape2S0200000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaTextView;
import com.whatsapp.inappsupport.ui.SupportTopicsActivity;
import java.util.ArrayList;

/* renamed from: X.2wy  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C61942wy extends BaseAdapter {
    public SupportTopicsActivity A00;
    public ArrayList A01;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public C61942wy(SupportTopicsActivity supportTopicsActivity, ArrayList arrayList) {
        this.A00 = supportTopicsActivity;
        this.A01 = arrayList;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.A01.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.A01.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C61932wx c61932wx;
        C61872wr c61872wr = (C61872wr) this.A01.get(i);
        if (view == null) {
            c61932wx = new C61932wx();
            view = LayoutInflater.from(this.A00).inflate(R.layout.support_topic_list_item, viewGroup, false);
            c61932wx.A01 = (WaTextView) view.findViewById(R.id.topic_title);
            c61932wx.A00 = view.findViewById(R.id.topic_divider);
            view.setTag(c61932wx);
        } else {
            c61932wx = (C61932wx) view.getTag();
        }
        WaTextView waTextView = c61932wx.A01;
        waTextView.setText(c61872wr.A03);
        waTextView.setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1(this, c61872wr, 7));
        if (this.A00.A01 == 2) {
            int i2 = (int) (Resources.getSystem().getDisplayMetrics().density * 16.0f);
            waTextView.setPadding(i2, i2, i2, i2);
            c61932wx.A00.setVisibility(0);
            return view;
        }
        c61932wx.A00.setVisibility(8);
        return view;
    }
}
