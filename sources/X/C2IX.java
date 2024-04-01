package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import java.util.List;

/* renamed from: X.2IX  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2IX extends AbstractC461525e {
    public View A00;
    public List A01;
    public final C43791xz A02;
    public final C2AS A03;
    public final InterfaceC53342en A04;

    public C2IX(C003701t c003701t, Context context, C2AS c2as, LayoutInflater layoutInflater, C43791xz c43791xz, InterfaceC53342en interfaceC53342en, int i) {
        super(c003701t, context, layoutInflater, i);
        this.A03 = c2as;
        this.A02 = c43791xz;
        this.A04 = interfaceC53342en;
    }

    @Override // X.AbstractC461525e
    public void A03(View view) {
        View findViewById = view.findViewById(R.id.empty);
        this.A00 = findViewById;
        findViewById.setVisibility(4);
        ((TextView) view.findViewById(R.id.empty_text)).setText(R.string.sticker_picker_no_favorited_stickers);
    }

    @Override // X.AbstractC461525e, X.C25f
    public void AJJ(ViewGroup viewGroup, int i, View view) {
        super.AJJ(viewGroup, i, view);
        this.A00 = null;
    }
}
