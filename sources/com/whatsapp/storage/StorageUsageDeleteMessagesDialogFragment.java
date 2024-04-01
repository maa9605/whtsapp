package com.whatsapp.storage;

import X.AbstractC02800Cx;
import X.AbstractC83153rf;
import X.AnonymousClass092;
import X.C002301c;
import X.C018608r;
import X.C019208x;
import X.C019308y;
import X.C02820Cz;
import X.C3YX;
import X.C3YY;
import X.C83113rb;
import X.InterfaceC002901k;
import android.app.Dialog;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape2S0200000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment;
import com.whatsapp.util.RtlCheckBox;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public class StorageUsageDeleteMessagesDialogFragment extends Hilt_StorageUsageDeleteMessagesDialogFragment {
    public C018608r A00;
    public C002301c A01;
    public C83113rb A02;
    public InterfaceC002901k A03;
    public Collection A04;
    public Collection A05;
    public boolean A06;
    public boolean A07;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        boolean z;
        boolean z2;
        final String A08;
        Iterator it = this.A05.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((AnonymousClass092) it.next()).A0j) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        Iterator it2 = this.A04.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((AnonymousClass092) it2.next()).A0j) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (z) {
            int size = this.A05.size();
            int i = R.string.storage_usage_delete_dialog_starred_item_multiple_subtitle;
            if (size == 1) {
                i = R.string.storage_usage_delete_dialog_starred_item_single_subtitle;
            }
            A08 = A0F(i);
        } else if (!z2 && this.A04.size() > this.A05.size()) {
            A08 = this.A01.A08(R.plurals.storage_usage_delete_dialog_duplicate_item_subtitle, this.A05.size());
        } else {
            A08 = this.A01.A08(R.plurals.storage_usage_delete_dialog_subtitle, this.A05.size());
        }
        final ContextWrapper contextWrapper = ((Hilt_StorageUsageDeleteMessagesDialogFragment) this).A00;
        final ArrayList arrayList = new ArrayList();
        final String A082 = this.A01.A08(R.plurals.storage_usage_delete_messages_title, this.A05.size());
        if (z) {
            if (this.A05.size() == 1) {
                this.A07 = true;
            } else {
                arrayList.add(new C3YX(A0F(R.string.storage_usage_delete_dialog_starred_checkbox_text), new C3YY() { // from class: X.3rY
                    @Override // X.C3YY
                    public final void AIP(boolean z3) {
                        StorageUsageDeleteMessagesDialogFragment.this.A07 = z3;
                    }
                }));
            }
        } else if (!z2 && this.A04.size() > this.A05.size()) {
            arrayList.add(new C3YX(A0F(R.string.storage_usage_delete_dialog_duplicate_checkbox_text), new C3YY() { // from class: X.3rZ
                @Override // X.C3YY
                public final void AIP(boolean z3) {
                    StorageUsageDeleteMessagesDialogFragment.this.A06 = z3;
                }
            }));
        }
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.3YR
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                StorageUsageDeleteMessagesDialogFragment storageUsageDeleteMessagesDialogFragment = StorageUsageDeleteMessagesDialogFragment.this;
                Collection<AnonymousClass092> collection = storageUsageDeleteMessagesDialogFragment.A06 ? storageUsageDeleteMessagesDialogFragment.A04 : storageUsageDeleteMessagesDialogFragment.A05;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (!storageUsageDeleteMessagesDialogFragment.A07) {
                    for (AnonymousClass092 anonymousClass092 : collection) {
                        if (!anonymousClass092.A0j) {
                            linkedHashSet.add(anonymousClass092);
                        }
                    }
                } else {
                    linkedHashSet.addAll(collection);
                }
                storageUsageDeleteMessagesDialogFragment.A03.AS1(new RunnableEBaseShape4S0200000_I0_4(storageUsageDeleteMessagesDialogFragment, linkedHashSet, 34));
            }
        };
        C019208x c019208x = new C019208x(((Hilt_StorageUsageDeleteMessagesDialogFragment) this).A00);
        AbstractC83153rf abstractC83153rf = new AbstractC83153rf(contextWrapper, A082, A08, arrayList) { // from class: X.3xf
            {
                super(contextWrapper);
                LayoutInflater.from(contextWrapper).inflate(R.layout.dialog_fragment_custom_view, this);
                setOrientation(1);
                int dimensionPixelSize = contextWrapper.getResources().getDimensionPixelSize(R.dimen.dialog_fragment_custom_view_padding_horizontal);
                int i2 = 0;
                setPadding(dimensionPixelSize, contextWrapper.getResources().getDimensionPixelSize(R.dimen.dialog_fragment_custom_view_padding_top), dimensionPixelSize, 0);
                TextView textView = (TextView) C0AT.A0D(this, R.id.title);
                TextView textView2 = (TextView) C0AT.A0D(this, R.id.subtitle);
                if (!TextUtils.isEmpty(A082)) {
                    textView.setText(A082);
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
                if (!TextUtils.isEmpty(A08)) {
                    textView2.setText(A08);
                    textView2.setVisibility(0);
                } else {
                    textView2.setVisibility(8);
                }
                int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dialog_fragment_custom_view_first_checkbox_margin_top);
                int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.dialog_fragment_custom_view_checkbox_margin_top);
                while (i2 < arrayList.size()) {
                    C3YX c3yx = (C3YX) arrayList.get(i2);
                    int i3 = i2 == 0 ? dimensionPixelSize2 : dimensionPixelSize3;
                    RtlCheckBox rtlCheckBox = new RtlCheckBox(getContext(), null);
                    rtlCheckBox.setTextSize(2, 16.0f);
                    rtlCheckBox.setTextColor(C02160Ac.A00(getContext(), R.color.secondary_text));
                    addView(rtlCheckBox);
                    ((ViewGroup.MarginLayoutParams) rtlCheckBox.getLayoutParams()).topMargin = i3;
                    rtlCheckBox.setText(c3yx.A01);
                    rtlCheckBox.setChecked(false);
                    if (c3yx.A00 != null) {
                        rtlCheckBox.setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1(c3yx, rtlCheckBox, 18));
                    }
                    i2++;
                }
            }
        };
        C019308y c019308y = c019208x.A01;
        c019308y.A0C = abstractC83153rf;
        c019308y.A01 = 0;
        c019208x.A06(R.string.delete, onClickListener);
        c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.3YQ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                StorageUsageDeleteMessagesDialogFragment.this.A11();
            }
        });
        c019308y.A0J = true;
        return c019208x.A00();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void A14(AbstractC02800Cx abstractC02800Cx, String str) {
        if (abstractC02800Cx != null) {
            C02820Cz c02820Cz = new C02820Cz(abstractC02800Cx);
            c02820Cz.A09(0, this, str, 1);
            c02820Cz.A05();
            return;
        }
        throw null;
    }
}
