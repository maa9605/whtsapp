package com.facebook.redex;

import X.C73393bZ;
import android.view.View;
import com.whatsapp.biz.BusinessHoursView;

/* loaded from: classes2.dex */
public class ViewOnClickEBaseShape1S0110000_I1 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public boolean A01;
    public final int A02;

    public ViewOnClickEBaseShape1S0110000_I1(Object obj, boolean z, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.A02) {
            case 0:
                BusinessHoursView businessHoursView = (BusinessHoursView) this.A00;
                if (this.A01 && !businessHoursView.A04) {
                    businessHoursView.A02.A00(4, null);
                }
                businessHoursView.A04 = !businessHoursView.A04;
                businessHoursView.A00();
                return;
            case 1:
                ((C73393bZ) this.A00).A01.A0P(false, this.A01, false);
                return;
            default:
                return;
        }
    }
}
