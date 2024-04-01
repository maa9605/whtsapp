package X;

import android.util.SparseArray;
import android.view.View;
import com.google.android.search.verification.client.R;

/* renamed from: X.1U3  reason: invalid class name */
/* loaded from: classes.dex */
public class C1U3 extends C0TS {
    public boolean A00;
    public boolean A01;
    public final SparseArray A02;

    public C1U3(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.A02 = sparseArray;
        sparseArray.put(16908310, view.findViewById(16908310));
        this.A02.put(16908304, view.findViewById(16908304));
        this.A02.put(16908294, view.findViewById(16908294));
        this.A02.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.A02.put(16908350, view.findViewById(16908350));
    }

    public View A0C(int i) {
        SparseArray sparseArray = this.A02;
        View view = (View) sparseArray.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = this.A0H.findViewById(i);
        if (findViewById != null) {
            sparseArray.put(i, findViewById);
        }
        return findViewById;
    }
}
