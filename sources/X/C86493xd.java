package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.search.verification.client.R;
import java.util.List;

/* renamed from: X.3xd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C86493xd extends AbstractC461525e {
    public final C43791xz A00;
    public final InterfaceC53342en A01;
    public final C82883rE A02;

    public C86493xd(C003701t c003701t, Context context, LayoutInflater layoutInflater, C43791xz c43791xz, InterfaceC53342en interfaceC53342en, C82883rE c82883rE, int i) {
        super(c003701t, context, layoutInflater, i);
        this.A00 = c43791xz;
        this.A01 = interfaceC53342en;
        this.A02 = c82883rE;
    }

    @Override // X.AbstractC461525e
    public void A03(View view) {
        C0HK c0hk = this.A02.A02;
        if (c0hk.A01() == null || ((List) c0hk.A01()).isEmpty()) {
            return;
        }
        C0AT.A0D(view, R.id.empty).setVisibility(8);
        view.findViewById(R.id.empty_text).setVisibility(8);
    }
}
