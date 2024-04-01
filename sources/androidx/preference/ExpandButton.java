package androidx.preference;

import X.C09L;
import X.C1U3;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ExpandButton extends Preference {
    public long A00;

    public ExpandButton(Context context, List list, long j) {
        super(context);
        this.A01 = R.layout.expand_button;
        Drawable A01 = C09L.A01(this.A05, R.drawable.ic_arrow_down_24dp);
        if (this.A07 != A01) {
            this.A07 = A01;
            super.A00 = 0;
            A05();
        }
        super.A00 = R.drawable.ic_arrow_down_24dp;
        A0J(this.A05.getString(R.string.expand_button_title));
        if (999 != this.A02) {
            this.A02 = 999;
            A06();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        String str = null;
        while (it.hasNext()) {
            Preference preference = (Preference) it.next();
            CharSequence charSequence = preference.A0H;
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequence)) {
                arrayList.add(preference);
            }
            if (arrayList.contains(preference.A0E)) {
                if (z) {
                    arrayList.add(preference);
                }
            } else if (!TextUtils.isEmpty(charSequence)) {
                str = str == null ? charSequence : this.A05.getString(R.string.summary_collapsed_preference_list, str, charSequence);
            }
        }
        A0I(str);
        this.A00 = j + SearchActionVerificationClientService.MS_TO_NS;
    }

    @Override // androidx.preference.Preference
    public long A00() {
        return this.A00;
    }

    @Override // androidx.preference.Preference
    public void A0S(C1U3 c1u3) {
        super.A0S(c1u3);
        c1u3.A00 = false;
    }
}
