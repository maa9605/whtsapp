package androidx.preference;

import X.C14500n3;
import X.C1U3;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;

/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    public CharSequence A00;
    public CharSequence A01;
    public final C14500n3 A02;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0n3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SwitchPreference(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            r1 = 2130969444(0x7f040364, float:1.754757E38)
            r0 = 16843629(0x101036d, float:2.3696016E-38)
            int r1 = X.C07O.A04(r5, r1, r0)
            r3 = 0
            r4.<init>(r5, r6, r1, r3)
            X.0n3 r0 = new X.0n3
            r0.<init>()
            r4.A02 = r0
            int[] r0 = X.C14460mz.A0t
            android.content.res.TypedArray r2 = r5.obtainStyledAttributes(r6, r0, r1, r3)
            r0 = 7
            java.lang.String r0 = r2.getString(r0)
            if (r0 != 0) goto L26
            java.lang.String r0 = r2.getString(r3)
        L26:
            r4.A01 = r0
            boolean r0 = r4.A02
            if (r0 == 0) goto L2f
            r4.A05()
        L2f:
            r0 = 6
            r1 = 1
            java.lang.String r0 = r2.getString(r0)
            if (r0 != 0) goto L3b
            java.lang.String r0 = r2.getString(r1)
        L3b:
            r4.A00 = r0
            boolean r0 = r4.A02
            if (r0 != 0) goto L44
            r4.A05()
        L44:
            r0 = 9
            r1 = 3
            java.lang.String r0 = r2.getString(r0)
            if (r0 != 0) goto L51
            java.lang.String r0 = r2.getString(r1)
        L51:
            r4.A01 = r0
            r4.A05()
            r0 = 8
            r1 = 4
            java.lang.String r0 = r2.getString(r0)
            if (r0 != 0) goto L63
            java.lang.String r0 = r2.getString(r1)
        L63:
            r4.A00 = r0
            r4.A05()
            r1 = 5
            r0 = 2
            boolean r0 = r2.getBoolean(r0, r3)
            boolean r0 = r2.getBoolean(r1, r0)
            r4.A04 = r0
            r2.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.SwitchPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    public void A0E(View view) {
        super.A0E(view);
        if (((AccessibilityManager) this.A05.getSystemService("accessibility")).isEnabled()) {
            A0V(view.findViewById(16908352));
            A0T(view.findViewById(16908304));
        }
    }

    @Override // androidx.preference.Preference
    public void A0S(C1U3 c1u3) {
        super.A0S(c1u3);
        A0V(c1u3.A0C(16908352));
        A0T(c1u3.A0C(16908304));
    }

    public final void A0V(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(((TwoStatePreference) this).A02);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.A01);
            r4.setTextOff(this.A00);
            r4.setOnCheckedChangeListener(this.A02);
        }
    }
}
