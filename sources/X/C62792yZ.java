package X;

import android.widget.RadioGroup;

/* renamed from: X.2yZ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C62792yZ implements RadioGroup.OnCheckedChangeListener {
    public int A00 = -1;

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (i != -1) {
            this.A00 = i;
        }
    }
}
