package X;

import android.text.TextUtils;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.1BQ */
/* loaded from: classes.dex */
public class C1BQ {
    public int A00 = -1;
    public C1BR A01;
    public TabLayout A02;
    public CharSequence A03;
    public CharSequence A04;

    public void A00() {
        TabLayout tabLayout = this.A02;
        if (tabLayout != null) {
            tabLayout.A0F(this, true);
            return;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }

    public void A01(int i) {
        TabLayout tabLayout = this.A02;
        if (tabLayout != null) {
            A02(tabLayout.getResources().getText(i));
            return;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }

    public void A02(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.A03) && !TextUtils.isEmpty(charSequence)) {
            this.A01.setContentDescription(charSequence);
        }
        this.A04 = charSequence;
        C1BR c1br = this.A01;
        if (c1br != null) {
            c1br.A00();
        }
    }
}
