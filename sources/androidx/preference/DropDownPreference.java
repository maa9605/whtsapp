package androidx.preference;

import X.C1U3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.preference.DropDownPreference;
import androidx.preference.ListPreference;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    public Spinner A00;
    public final Context A01;
    public final AdapterView.OnItemSelectedListener A02;
    public final ArrayAdapter A03;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle, 0);
        this.A02 = new AdapterView.OnItemSelectedListener() { // from class: X.0mW
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView adapterView) {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
                if (i >= 0) {
                    DropDownPreference dropDownPreference = DropDownPreference.this;
                    String charSequence = ((ListPreference) dropDownPreference).A04[i].toString();
                    if (charSequence.equals(((ListPreference) dropDownPreference).A01) || !dropDownPreference.A0R(charSequence)) {
                        return;
                    }
                    dropDownPreference.A0V(charSequence);
                }
            }
        };
        this.A01 = context;
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367049);
        this.A03 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = ((ListPreference) this).A03;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public void A05() {
        super.A05();
        ArrayAdapter arrayAdapter = this.A03;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public void A08() {
        this.A00.performClick();
    }

    @Override // androidx.preference.Preference
    public void A0S(C1U3 c1u3) {
        Spinner spinner = (Spinner) c1u3.A0H.findViewById(R.id.spinner);
        this.A00 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.A03);
        this.A00.setOnItemSelectedListener(this.A02);
        Spinner spinner2 = this.A00;
        String str = ((ListPreference) this).A01;
        CharSequence[] charSequenceArr = ((ListPreference) this).A04;
        int i = -1;
        if (str != null && charSequenceArr != null) {
            int length = charSequenceArr.length - 1;
            while (true) {
                if (length < 0) {
                    break;
                } else if (charSequenceArr[length].equals(str)) {
                    i = length;
                    break;
                } else {
                    length--;
                }
            }
        }
        spinner2.setSelection(i);
        super.A0S(c1u3);
    }

    @Override // androidx.preference.ListPreference
    public void A0W(CharSequence[] charSequenceArr) {
        ((ListPreference) this).A03 = charSequenceArr;
        ArrayAdapter arrayAdapter = this.A03;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr2 = ((ListPreference) this).A03;
        if (charSequenceArr2 != null) {
            for (CharSequence charSequence : charSequenceArr2) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }
}
