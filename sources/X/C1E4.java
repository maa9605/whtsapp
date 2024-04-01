package X;

import android.content.Context;
import android.widget.EditText;

/* renamed from: X.1E4  reason: invalid class name */
/* loaded from: classes.dex */
public class C1E4 extends EditText {
    public C1E3 A00;

    public C1E4(Context context) {
        super(context);
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        C1E3 c1e3 = this.A00;
        if (c1e3 != null) {
            C33711gL c33711gL = ((C33691gJ) c1e3).A00;
            c33711gL.A05 = i;
            c33711gL.A04 = i2;
        }
    }

    public void setOnSelectionChangedListener(C1E3 c1e3) {
        this.A00 = c1e3;
    }
}
