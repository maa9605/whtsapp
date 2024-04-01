package com.whatsapp;

import X.C002601h;
import X.DialogC32191dd;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.RoundedBottomSheetDialogFragment;

/* loaded from: classes.dex */
public abstract class RoundedBottomSheetDialogFragment extends Hilt_RoundedBottomSheetDialogFragment {
    public C002601h A00;

    @Override // X.C0BA
    public void A0V(boolean z) {
        super.A0V(z);
        if (z) {
            this.A00.A05(this, "visible");
        } else {
            this.A00.A05(this, "invisible");
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public int A0x() {
        return R.style.RoundedBottomSheetDialogTheme;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        final DialogC32191dd dialogC32191dd = new DialogC32191dd(A0a(), A0x());
        dialogC32191dd.setOnShowListener(new DialogInterface.OnShowListener() { // from class: X.1IQ
            {
                RoundedBottomSheetDialogFragment.this = this;
            }

            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                RoundedBottomSheetDialogFragment roundedBottomSheetDialogFragment = RoundedBottomSheetDialogFragment.this;
                View findViewById = dialogC32191dd.findViewById(R.id.design_bottom_sheet);
                if (findViewById != null) {
                    roundedBottomSheetDialogFragment.A1A(findViewById);
                    return;
                }
                throw null;
            }
        });
        return dialogC32191dd;
    }

    public int A19() {
        Point point = new Point();
        A0A().getWindowManager().getDefaultDisplay().getSize(point);
        Rect rect = new Rect();
        A0A().getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return point.y - rect.top;
    }

    public void A1A(View view) {
        BottomSheetBehavior A00 = BottomSheetBehavior.A00(view);
        A00.A0O(3);
        A00.A0N = true;
        A00.A0N(view.getHeight());
    }
}
