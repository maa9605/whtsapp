package X;

import android.content.Context;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import com.facebook.redex.ViewOnClickEBaseShape0S0101000_I0;
import com.google.android.material.chip.Chip;
import com.google.android.search.verification.client.R;
import com.whatsapp.search.SearchViewModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: X.2Yn */
/* loaded from: classes2.dex */
public class C2Yn extends AbstractC51862Yo {
    public C2Yn(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
    }

    public void A01(SparseIntArray sparseIntArray, SearchViewModel searchViewModel) {
        C32651eT c32651eT = ((AbstractC51832Yh) this).A01;
        c32651eT.removeAllViews();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < sparseIntArray.size(); i++) {
            if (sparseIntArray.keyAt(i) != 0) {
                arrayList.add(new Pair(Integer.valueOf(sparseIntArray.keyAt(i)), Integer.valueOf(sparseIntArray.valueAt(i))));
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: X.3Vm
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Integer) ((Pair) obj2).second).compareTo((Integer) ((Pair) obj).second);
            }
        });
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) ((Pair) it.next()).first).intValue();
            C53422gt c53422gt = (C53422gt) C40731sm.A0A().get(intValue);
            if (c53422gt != null) {
                Chip chip = new Chip(getContext(), null);
                chip.setText(c53422gt.A05);
                chip.setClickable(true);
                chip.setOnClickListener(new ViewOnClickEBaseShape0S0101000_I0(searchViewModel, intValue, 5));
                C40731sm.A0a(getContext(), chip, intValue, R.color.search_token_text);
                chip.setChipIconTintResource(R.color.search_token_text);
                chip.setTextColor(C02160Ac.A00(getContext(), R.color.search_token_text));
                chip.setChipBackgroundColorResource(R.color.searchChipBackground);
                chip.setId(c53422gt.A04);
                c32651eT.addView(chip);
            }
        }
        setBackground(sparseIntArray.get(0) == 1);
    }

    private void setBackground(boolean z) {
        Context context = getContext();
        int i = R.color.primary_surface;
        if (z) {
            i = R.color.neutral_primary;
        }
        setBackgroundColor(C02160Ac.A00(context, i));
    }
}
