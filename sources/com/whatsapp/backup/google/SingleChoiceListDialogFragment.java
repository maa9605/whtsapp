package com.whatsapp.backup.google;

import X.C000200d;
import X.C018508q;
import X.C019208x;
import X.C019308y;
import X.C0BA;
import X.C0O7;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.Hilt_SingleChoiceListDialogFragment;
import com.whatsapp.backup.google.SingleChoiceListDialogFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class SingleChoiceListDialogFragment extends Hilt_SingleChoiceListDialogFragment {
    public C018508q A00;
    public C0O7 A01;
    public final AtomicBoolean A02 = new AtomicBoolean(false);

    @Override // com.whatsapp.backup.google.Hilt_SingleChoiceListDialogFragment, com.whatsapp.base.Hilt_WaDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        try {
            this.A01 = (C0O7) context;
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.toString());
            sb.append(" must implement SingleChoiceListListener");
            throw new ClassCastException(sb.toString());
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        String str;
        int length;
        int length2;
        final Bundle bundle2 = ((C0BA) this).A06;
        if (bundle2.containsKey("dialog_id")) {
            final int i = bundle2.getInt("dialog_id");
            this.A02.set(false);
            C019208x c019208x = new C019208x(A09());
            String string = bundle2.getString("title");
            C019308y c019308y = c019208x.A01;
            c019308y.A0I = string;
            c019208x.A06(R.string.cancel, null);
            if (bundle2.containsKey("items") && bundle2.containsKey("multi_line_list_items_key")) {
                throw new IllegalStateException("Cannot provide both items and multi_line_list_items_key");
            }
            if (!bundle2.containsKey("items") && !bundle2.containsKey("multi_line_list_items_key")) {
                throw new IllegalStateException("Must provide either items or multi_line_list_items_key");
            }
            final int i2 = bundle2.getInt("selected_item_index", -1);
            if (bundle2.containsKey("items")) {
                String[] stringArray = bundle2.getStringArray("items");
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.2lt
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        SingleChoiceListDialogFragment singleChoiceListDialogFragment = SingleChoiceListDialogFragment.this;
                        singleChoiceListDialogFragment.A01.AOh(i, i3, bundle2.getStringArray("items"));
                        singleChoiceListDialogFragment.A02.set(true);
                        dialogInterface.dismiss();
                    }
                };
                c019308y.A0M = stringArray;
                c019308y.A05 = onClickListener;
                c019308y.A00 = i2;
                c019308y.A0L = true;
            } else if (bundle2.containsKey("multi_line_list_items_key")) {
                final ArrayList arrayList = new ArrayList();
                final String[] stringArray2 = bundle2.getStringArray("multi_line_list_items_key");
                if (stringArray2 != null) {
                    String[] stringArray3 = bundle2.getStringArray("multi_line_list_item_values_key");
                    final boolean[] booleanArray = bundle2.getBooleanArray("list_item_enabled_key");
                    final String string2 = bundle2.getString("disabled_item_toast_key");
                    if (stringArray3 != null && (length = stringArray2.length) != (length2 = stringArray3.length)) {
                        StringBuilder A0P = C000200d.A0P("keys.length = ");
                        A0P.append(length);
                        A0P.append(" ≠ ");
                        throw new IllegalArgumentException(C000200d.A0K(A0P, length2, " values.length"));
                    }
                    for (int i3 = 0; i3 < stringArray2.length; i3++) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("line1", stringArray2[i3]);
                        if (stringArray3 != null) {
                            str = stringArray3[i3];
                        } else {
                            str = null;
                        }
                        hashMap.put("line2", str);
                        arrayList.add(hashMap);
                    }
                    final ContextWrapper contextWrapper = ((Hilt_SingleChoiceListDialogFragment) this).A00;
                    final String[] strArr = {"line1", "line2"};
                    final int[] iArr = {16908308, 16908309};
                    SimpleAdapter simpleAdapter = new SimpleAdapter(contextWrapper, arrayList, strArr, iArr) { // from class: X.2mE
                        @Override // android.widget.SimpleAdapter, android.widget.Adapter
                        public View getView(int i4, View view, ViewGroup viewGroup) {
                            View view2 = super.getView(i4, view, viewGroup);
                            TextView textView = (TextView) view2.findViewById(16908308);
                            TextView textView2 = (TextView) view2.findViewById(16908309);
                            SingleChoiceListDialogFragment singleChoiceListDialogFragment = SingleChoiceListDialogFragment.this;
                            if (singleChoiceListDialogFragment.A0W()) {
                                boolean[] zArr = booleanArray;
                                if (zArr != null && !zArr[i4]) {
                                    textView.setTextColor(C02160Ac.A00(((Hilt_SingleChoiceListDialogFragment) singleChoiceListDialogFragment).A00, R.color.settings_disabled_text));
                                    textView2.setTextColor(C02160Ac.A00(((Hilt_SingleChoiceListDialogFragment) singleChoiceListDialogFragment).A00, R.color.settings_disabled_text));
                                } else {
                                    textView.setTextColor(C02160Ac.A00(((Hilt_SingleChoiceListDialogFragment) singleChoiceListDialogFragment).A00, R.color.settings_item_title_text));
                                    textView2.setTextColor(C02160Ac.A00(((Hilt_SingleChoiceListDialogFragment) singleChoiceListDialogFragment).A00, R.color.settings_item_title_text));
                                }
                            }
                            if (TextUtils.isEmpty(textView2.getText())) {
                                textView2.setVisibility(8);
                            } else {
                                textView2.setVisibility(0);
                            }
                            int i5 = i2;
                            if (i5 >= 0 && TextUtils.equals(stringArray2[i5], textView.getText())) {
                                ((CompoundButton) view2.findViewById(R.id.radio)).setChecked(true);
                                return view2;
                            }
                            ((CompoundButton) view2.findViewById(R.id.radio)).setChecked(false);
                            return view2;
                        }
                    };
                    DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: X.2lu
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            SingleChoiceListDialogFragment singleChoiceListDialogFragment = SingleChoiceListDialogFragment.this;
                            boolean[] zArr = booleanArray;
                            int i5 = i;
                            String[] strArr2 = stringArray2;
                            String str2 = string2;
                            if (zArr == null || zArr[i4]) {
                                singleChoiceListDialogFragment.A01.AOh(i5, i4, strArr2);
                                singleChoiceListDialogFragment.A02.set(true);
                                dialogInterface.dismiss();
                            } else if (str2 != null) {
                                singleChoiceListDialogFragment.A00.A02(str2, 0).show();
                            }
                        }
                    };
                    c019308y.A0D = simpleAdapter;
                    c019308y.A05 = onClickListener2;
                    c019308y.A00 = i2;
                    c019308y.A0L = true;
                } else {
                    throw new IllegalArgumentException("Must provide multi_line_list_items_key");
                }
            }
            return c019208x.A00();
        }
        throw new IllegalStateException("dialog_id should be provided.");
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!((DialogFragment) this).A0C) {
            A16(true, true);
        }
        Bundle bundle = ((C0BA) this).A06;
        if (this.A01 == null || this.A02.get() || !bundle.containsKey("dialog_id")) {
            return;
        }
        this.A01.AJQ(bundle.getInt("dialog_id"));
    }
}
