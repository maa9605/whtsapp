package com.whatsapp.contact.picker;

import X.AbstractC51302Vw;
import X.C002301c;
import X.C2MB;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.AbsListView;
import com.google.android.search.verification.client.R;
import com.whatsapp.contact.picker.BidiContactListView;

/* loaded from: classes2.dex */
public class BidiContactListView extends AbstractC51302Vw {
    public C002301c A00;
    public C2MB A01;

    public BidiContactListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (this.A00.A0N()) {
            setVerticalScrollbarPosition(1);
            setPadding(getResources().getDimensionPixelSize(R.dimen.contact_list_padding_right), 0, getResources().getDimensionPixelSize(R.dimen.contact_list_padding_left), 0);
        } else {
            setVerticalScrollbarPosition(2);
            setPadding(getResources().getDimensionPixelSize(R.dimen.contact_list_padding_left), 0, getResources().getDimensionPixelSize(R.dimen.contact_list_padding_right), 0);
        }
        setFastScrollAlwaysVisible(true);
        setScrollBarStyle(33554432);
        setFastScrollEnabled(true);
        setScrollbarFadingEnabled(true);
        setOnScrollListener(new AbsListView.OnScrollListener() { // from class: X.2qE
            public int A00 = 0;

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i) {
                int i2 = this.A00;
                if (i2 == 0 && i != i2) {
                    BidiContactListView.this.A01.A01(absListView);
                }
                this.A00 = i;
            }
        });
    }
}
