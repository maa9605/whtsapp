package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I0_5;
import com.google.android.search.verification.client.R;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.25d  reason: invalid class name */
/* loaded from: classes2.dex */
public class C25d extends AbstractC461525e {
    public View A00;
    public TextView A01;
    public TextView A02;
    public C2IK A03;
    public List A04;
    public boolean A05;
    public final C2AM A06;
    public final C43791xz A07;
    public final InterfaceC53342en A08;
    public final C461325b A09;

    public C25d(C003701t c003701t, Context context, LayoutInflater layoutInflater, C2AM c2am, C461325b c461325b, C43791xz c43791xz, InterfaceC53342en interfaceC53342en, int i) {
        super(c003701t, context, layoutInflater, i);
        this.A06 = c2am;
        this.A09 = c461325b;
        this.A07 = c43791xz;
        this.A08 = interfaceC53342en;
    }

    @Override // X.AbstractC461525e
    public void A03(View view) {
        View findViewById = view.findViewById(R.id.empty);
        this.A00 = findViewById;
        findViewById.setVisibility(4);
        TextView textView = (TextView) view.findViewById(R.id.get_stickers_button);
        this.A01 = textView;
        textView.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 30));
        this.A02 = (TextView) view.findViewById(R.id.empty_text);
        C003301p.A06(this.A01);
    }

    @Override // X.AbstractC461525e, X.C25f
    public void AJJ(ViewGroup viewGroup, int i, View view) {
        super.AJJ(viewGroup, i, view);
        C2IK c2ik = this.A03;
        List<C0JM> list = null;
        if (c2ik != null) {
            c2ik.A03 = null;
            if (0 != 0) {
                for (C0JM c0jm : list) {
                    HashMap hashMap = c2ik.A09;
                    if (hashMap.get(c0jm.A0B) == null) {
                        long j = c2ik.A01;
                        c2ik.A01 = 1 + j;
                        hashMap.put(c0jm.A0B, Long.valueOf(j));
                    }
                }
            }
        }
        this.A00 = null;
    }
}
