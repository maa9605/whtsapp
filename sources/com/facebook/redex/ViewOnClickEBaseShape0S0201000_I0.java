package com.facebook.redex;

import X.AbstractC005302j;
import X.C2C7;
import X.C42531vt;
import android.view.View;
import com.whatsapp.dialogs.RoomsNUXBottomSheetDialogFragment;

/* loaded from: classes2.dex */
public class ViewOnClickEBaseShape0S0201000_I0 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public ViewOnClickEBaseShape0S0201000_I0(Object obj, Object obj2, int i, int i2) {
        this.A03 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.A03) {
            case 0:
                RoomsNUXBottomSheetDialogFragment roomsNUXBottomSheetDialogFragment = (RoomsNUXBottomSheetDialogFragment) this.A01;
                int i = this.A00;
                roomsNUXBottomSheetDialogFragment.A00.A04((AbstractC005302j) this.A02, i);
                roomsNUXBottomSheetDialogFragment.A10();
                return;
            case 1:
                int i2 = this.A00;
                ((C2C7) this.A01).A01.A0z((C42531vt) this.A02, i2);
                return;
            default:
                return;
        }
    }
}
