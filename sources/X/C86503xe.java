package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import java.util.List;

/* renamed from: X.3xe  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C86503xe extends AbstractC461525e {
    public View A00;
    public List A01;
    public final int A02;
    public final C43791xz A03;
    public final InterfaceC53342en A04;

    public C86503xe(int i, C003701t c003701t, Context context, LayoutInflater layoutInflater, C43791xz c43791xz, InterfaceC53342en interfaceC53342en, int i2) {
        super(c003701t, context, layoutInflater, i2);
        this.A04 = interfaceC53342en;
        this.A03 = c43791xz;
        this.A02 = i;
    }

    @Override // X.AbstractC461525e
    public void A03(View view) {
        this.A00 = view.findViewById(R.id.empty);
    }

    @Override // X.AbstractC461525e, X.C25f
    public void AJJ(ViewGroup viewGroup, int i, View view) {
        super.AJJ(viewGroup, i, view);
        this.A00 = null;
    }
}
