package com.whatsapp.payments.ui.widget;

import X.C2OS;
import X.C4AE;
import X.C4AN;
import X.C4FW;
import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes3.dex */
public class TransactionsExpandableView extends C4FW {
    public C4AN A00;

    public TransactionsExpandableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = new C4AN(context);
    }

    public /* synthetic */ void A01() {
        for (int i = 0; i < getChildCount(); i++) {
            ((C4AE) this.A05.getChildAt(i)).ARG();
        }
    }

    public void setAdapter(C4AN c4an) {
        this.A00 = c4an;
    }

    public void setPaymentRequestActionCallback(C2OS c2os) {
        this.A00.A01 = c2os;
    }
}
