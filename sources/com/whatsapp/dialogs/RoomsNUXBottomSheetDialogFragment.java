package com.whatsapp.dialogs;

import X.AbstractC005302j;
import X.C000200d;
import X.C06950Vu;
import X.C09720ee;
import X.C0AT;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape0S0201000_I0;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.MaxHeightLinearLayout;

/* loaded from: classes2.dex */
public class RoomsNUXBottomSheetDialogFragment extends Hilt_RoomsNUXBottomSheetDialogFragment {
    public C06950Vu A00;
    public MaxHeightLinearLayout A01;

    public static RoomsNUXBottomSheetDialogFragment A00(AbstractC005302j abstractC005302j, int i) {
        Bundle bundle = new Bundle();
        RoomsNUXBottomSheetDialogFragment roomsNUXBottomSheetDialogFragment = new RoomsNUXBottomSheetDialogFragment();
        if (abstractC005302j != null) {
            bundle.putString("ref", abstractC005302j.getRawString());
        }
        bundle.putInt("entry_point", i);
        roomsNUXBottomSheetDialogFragment.A0P(bundle);
        return roomsNUXBottomSheetDialogFragment;
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle A02 = A02();
        AbstractC005302j A022 = AbstractC005302j.A02(A02.getString("ref", null));
        int i = A02.getInt("entry_point");
        View inflate = layoutInflater.inflate(R.layout.rooms_bottom_sheet_nux, viewGroup, false);
        this.A01 = (MaxHeightLinearLayout) C0AT.A0D(inflate, R.id.container);
        View A0D = C0AT.A0D(inflate, R.id.continue_button);
        ((TextView) C0AT.A0D(inflate, R.id.dialog_title)).setText(R.string.rooms_nux_title);
        ((TextView) C0AT.A0D(inflate, R.id.dialog_message)).setText(R.string.rooms_create_link_in_messenger_nux);
        ((TextView) C0AT.A0D(inflate, R.id.dialog_submessage)).setText(R.string.rooms_non_e2e_warning);
        ((ImageView) C0AT.A0D(inflate, R.id.illustration)).setImageResource(R.drawable.ill_room);
        A0D.setOnClickListener(new ViewOnClickEBaseShape0S0201000_I0(this, A022, i, 0));
        A1B();
        return inflate;
    }

    public final void A1B() {
        if (A01().getConfiguration().orientation == 1) {
            this.A01.setMaxHeight((int) (A19() * 0.75f));
        } else {
            this.A01.setMaxHeight(0);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        Integer num;
        C06950Vu c06950Vu = this.A00;
        int i = A02().getInt("entry_point");
        if (c06950Vu != null) {
            C09720ee c09720ee = new C09720ee();
            if (i == 0) {
                num = 3;
            } else if (i != 1) {
                num = i != 2 ? null : 1;
            } else {
                num = 2;
            }
            c09720ee.A02 = num;
            c09720ee.A00 = 3;
            c06950Vu.A05.A0B(c09720ee, null, false);
            return;
        }
        throw null;
    }

    @Override // X.C0BA, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.A0U = true;
        A1B();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!((DialogFragment) this).A0C) {
            A16(true, true);
        }
        C000200d.A0j(this.A00.A03, "rooms_nux_shown", true);
    }
}
