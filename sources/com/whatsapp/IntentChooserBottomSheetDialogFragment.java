package com.whatsapp;

import X.C000200d;
import X.C002301c;
import X.C35351j0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class IntentChooserBottomSheetDialogFragment extends Hilt_IntentChooserBottomSheetDialogFragment {
    public int A00;
    public int A01;
    public C002301c A02;
    public Integer A03;
    public ArrayList A04;

    public static IntentChooserBottomSheetDialogFragment A00(int i, List list, int i2) {
        Bundle A01 = C000200d.A01("title_resource", i);
        A01.putParcelableArrayList("choosable_intents", new ArrayList<>(list));
        A01.putInt("request_code", i2);
        IntentChooserBottomSheetDialogFragment intentChooserBottomSheetDialogFragment = new IntentChooserBottomSheetDialogFragment();
        intentChooserBottomSheetDialogFragment.A0P(A01);
        return intentChooserBottomSheetDialogFragment;
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.intent_selector, viewGroup, false);
        Bundle A02 = A02();
        this.A00 = A02.getInt("request_code");
        ArrayList parcelableArrayList = A02.getParcelableArrayList("choosable_intents");
        if (parcelableArrayList != null) {
            this.A04 = parcelableArrayList;
            this.A01 = A02.getInt("title_resource");
            if (A02.containsKey("parent_fragment")) {
                this.A03 = Integer.valueOf(A02.getInt("parent_fragment"));
            }
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.intent_recycler);
            A00();
            recyclerView.setLayoutManager(new GridLayoutManager(4));
            recyclerView.setAdapter(new C35351j0(this, this.A04));
            ((TextView) inflate.findViewById(R.id.title)).setText(this.A01);
            return inflate;
        }
        throw null;
    }
}
