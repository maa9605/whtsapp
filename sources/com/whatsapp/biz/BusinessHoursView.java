package com.whatsapp.biz;

import X.C002301c;
import X.C02160Ac;
import X.C2VA;
import X.C40201rk;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class BusinessHoursView extends C2VA {
    public ImageView A00;
    public BusinessHoursContentView A01;
    public C40201rk A02;
    public C002301c A03;
    public boolean A04;

    public BusinessHoursView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A04 = false;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.business_hours_layout, (ViewGroup) this, true);
        setFocusable(true);
        this.A01 = (BusinessHoursContentView) inflate.findViewById(R.id.business_hours_content_view);
        this.A00 = (ImageView) inflate.findViewById(R.id.business_hours_chevron_icon);
    }

    public final void A00() {
        this.A01.setFullView(this.A04);
        ImageView imageView = this.A00;
        Context context = getContext();
        boolean z = this.A04;
        int i = R.drawable.ic_chevron_down;
        if (z) {
            i = R.drawable.ic_chevron_up;
        }
        imageView.setImageDrawable(C02160Ac.A03(context, i));
    }
}
