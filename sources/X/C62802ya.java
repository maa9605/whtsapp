package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.location.PlaceInfo;
import java.util.List;

/* renamed from: X.2ya  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C62802ya extends BaseAdapter {
    public PlaceInfo A00;
    public List A01;
    public final Context A02;
    public final AnonymousClass241 A03;
    public final boolean A04 = true;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 1;
    }

    public C62802ya(Context context, AnonymousClass241 anonymousClass241) {
        this.A02 = context;
        this.A03 = anonymousClass241;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List list = this.A01;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        List list = this.A01;
        if (list == null || i >= list.size()) {
            return null;
        }
        return this.A01.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.A02).inflate(R.layout.location_picker_row, (ViewGroup) null);
        }
        TextView textView = (TextView) view.findViewById(R.id.location_name);
        TextView textView2 = (TextView) view.findViewById(R.id.location_description);
        ImageView imageView = (ImageView) view.findViewById(R.id.location_icon);
        if (this.A04) {
            C07O.A0h(imageView, C02160Ac.A02(this.A02, R.color.primary_surface));
        }
        List list = this.A01;
        if (list != null && i < list.size()) {
            PlaceInfo placeInfo = (PlaceInfo) this.A01.get(i);
            textView.setText(placeInfo.A06);
            if (!TextUtils.isEmpty(placeInfo.A0B)) {
                textView2.setVisibility(0);
                textView2.setText(placeInfo.A0B);
                textView2.setSingleLine(true);
            } else {
                textView2.setVisibility(8);
            }
            if (placeInfo == this.A00) {
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.pin_location_red, 0);
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
            int dimensionPixelSize = placeInfo.A03 == 3 ? this.A02.getResources().getDimensionPixelSize(R.dimen.place_icon_padding_fousquare) : 0;
            imageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            String str = placeInfo.A05;
            if (str != null) {
                this.A03.A01(str, imageView);
            } else {
                imageView.setImageDrawable(null);
                return view;
            }
        }
        return view;
    }
}
