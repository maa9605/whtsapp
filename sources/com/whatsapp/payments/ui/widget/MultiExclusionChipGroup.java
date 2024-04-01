package com.whatsapp.payments.ui.widget;

import X.AbstractC92164Ht;
import X.C4A7;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.widget.MultiExclusionChipGroup;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class MultiExclusionChipGroup extends AbstractC92164Ht {
    public C4A7 A00;
    public Map A01;
    public Set A02;

    public MultiExclusionChipGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A02 = new HashSet();
        this.A01 = new HashMap();
    }

    public /* synthetic */ void A01(MultiExclusionChip multiExclusionChip, boolean z) {
        if (this.A01.containsKey(multiExclusionChip)) {
            boolean isChecked = multiExclusionChip.isChecked();
            int i = R.dimen.payment_filter_unchecked_stroke_width;
            if (isChecked) {
                i = R.dimen.payment_filter_checked_stroke_width;
            }
            multiExclusionChip.setChipStrokeWidthResource(i);
            boolean isChecked2 = multiExclusionChip.isChecked();
            int i2 = R.dimen.payment_filter_unchecked_text_start_padding;
            if (isChecked2) {
                i2 = R.dimen.payment_filter_checked_text_start_padding;
            }
            multiExclusionChip.setTextStartPaddingResource(i2);
            List list = (List) this.A01.get(multiExclusionChip);
            if (list != null) {
                for (int i3 = 0; i3 < list.size(); i3++) {
                    Chip chip = (Chip) list.get(i3);
                    if (chip != multiExclusionChip) {
                        chip.setClickable(!multiExclusionChip.isChecked());
                        chip.setCheckable(!multiExclusionChip.isChecked());
                        chip.setVisibility(multiExclusionChip.isChecked() ? 8 : 0);
                    }
                }
            }
        }
        Set set = this.A02;
        if (z) {
            set.add(multiExclusionChip);
        } else {
            set.remove(multiExclusionChip);
        }
        C4A7 c4a7 = this.A00;
        if (c4a7 != null) {
            c4a7.AOU(this.A02);
        }
    }

    public void A02(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final MultiExclusionChip multiExclusionChip = (MultiExclusionChip) it.next();
            this.A01.put(multiExclusionChip, list);
            multiExclusionChip.setCheckable(true);
            multiExclusionChip.setClickable(true);
            super.addView(multiExclusionChip);
            multiExclusionChip.setOnCheckedChangeListenerInternal(new CompoundButton.OnCheckedChangeListener() { // from class: X.3S8
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    MultiExclusionChipGroup.this.A01(multiExclusionChip, z);
                }
            });
        }
    }

    public void setOnSelectionChangedListener(C4A7 c4a7) {
        this.A00 = c4a7;
    }
}
