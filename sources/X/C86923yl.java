package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.search.verification.client.R;

/* renamed from: X.3yl  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C86923yl extends C2CF {
    public View A00;
    public View A01;
    public boolean A02;

    public C86923yl(C003701t c003701t, Context context, LayoutInflater layoutInflater, C2AS c2as, C43791xz c43791xz, InterfaceC53342en interfaceC53342en, int i, C42531vt c42531vt) {
        super(c003701t, context, layoutInflater, c2as, c43791xz, interfaceC53342en, i, c42531vt);
    }

    @Override // X.C2CF, X.AbstractC461525e
    public void A03(View view) {
        super.A03(view);
        this.A00 = view.findViewById(R.id.empty);
        this.A01 = view.findViewById(R.id.more_info_button);
        View view2 = ((C2CF) this).A01;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }
}
