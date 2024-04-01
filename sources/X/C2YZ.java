package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageView;
import java.util.ArrayList;

/* renamed from: X.2YZ */
/* loaded from: classes2.dex */
public abstract class C2YZ extends FrameLayout implements AnonymousClass005 {
    public ViewGroup A00;
    public ViewGroup A01;
    public C2UB A02;

    public C2YZ(Context context) {
        super(context);
        A01();
        FrameLayout.inflate(getContext(), R.layout.search_message_attachment_container, this);
        this.A01 = (ViewGroup) C0AT.A0D(this, R.id.search_message_attachment_container_icon);
        this.A00 = (ViewGroup) C0AT.A0D(this, R.id.search_message_attachment_container_content);
    }

    public void A00() {
        View view;
        LinearLayout linearLayout;
        if (this instanceof C3TZ) {
            C3TZ c3tz = (C3TZ) this;
            c3tz.A01 = new C86083wp(c3tz.getContext(), c3tz.A05, c3tz.A02, c3tz.A09, c3tz.A03, c3tz.A04, c3tz.A08, c3tz.A07);
            int dimensionPixelSize = c3tz.getResources().getDimensionPixelSize(R.dimen.search_attachment_height_regular);
            c3tz.A01.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
            view = c3tz.A01;
        } else if (this instanceof C2YV) {
            C2YV c2yv = (C2YV) this;
            int dimensionPixelSize2 = c2yv.getResources().getDimensionPixelSize(R.dimen.search_attachment_height_regular);
            c2yv.A02 = new WaImageView(c2yv.getContext());
            c2yv.A02.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2));
            view = c2yv.A02;
        } else if (!(this instanceof C69123Nf)) {
            C3VW c3vw = (C3VW) this;
            Context context = c3vw.getContext();
            c3vw.A04 = new FrameLayout(context);
            int dimensionPixelSize3 = c3vw.getResources().getDimensionPixelSize(R.dimen.search_attachment_icon_size);
            c3vw.A00 = c3vw.getResources().getDimensionPixelSize(R.dimen.contact_card_border_size);
            c3vw.A02 = c3vw.getResources().getDimensionPixelSize(R.dimen.contact_card_radius);
            c3vw.A04.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            c3vw.A06 = c3vw.A02(context, dimensionPixelSize3);
            c3vw.A05 = c3vw.A02(context, dimensionPixelSize3);
            ArrayList arrayList = new ArrayList();
            c3vw.A09 = arrayList;
            arrayList.add(c3vw.A06);
            c3vw.A09.add(c3vw.A05);
            c3vw.A01 = c3vw.getResources().getDimensionPixelSize(R.dimen.search_attachment_margin);
            int dimensionPixelSize4 = c3vw.getResources().getDimensionPixelSize(R.dimen.search_attachment_contact_offset);
            c3vw.A03 = dimensionPixelSize4;
            C0LX.A07(c3vw.A0D, c3vw.A05, dimensionPixelSize4, 0, 0, 0);
            c3vw.A04.addView(c3vw.A05);
            c3vw.A04.addView(c3vw.A06);
            view = c3vw.A04;
        } else {
            C69123Nf c69123Nf = (C69123Nf) this;
            c69123Nf.A00 = new WaImageView(c69123Nf.getContext());
            int dimensionPixelSize5 = c69123Nf.getResources().getDimensionPixelSize(R.dimen.search_attachment_icon_size);
            int dimensionPixelSize6 = c69123Nf.getResources().getDimensionPixelSize(R.dimen.search_attachment_margin);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize5, dimensionPixelSize5);
            layoutParams.setMargins(dimensionPixelSize6, dimensionPixelSize6, dimensionPixelSize6, dimensionPixelSize6);
            c69123Nf.A00.setLayoutParams(layoutParams);
            c69123Nf.A00.setScaleType(ImageView.ScaleType.FIT_CENTER);
            view = c69123Nf.A00;
        }
        if (view != null) {
            this.A01.addView(view);
        }
        if (this instanceof C3TZ) {
            C3TZ c3tz2 = (C3TZ) this;
            c3tz2.A00 = new C51792Ya(c3tz2.getContext());
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            int dimensionPixelSize7 = c3tz2.getResources().getDimensionPixelSize(R.dimen.search_attachment_margin);
            C0LX.A08(c3tz2.A06, c3tz2.A00, dimensionPixelSize7, 0, dimensionPixelSize7, 0);
            c3tz2.A00.setLayoutParams(layoutParams2);
            linearLayout = c3tz2.A00;
        } else if (this instanceof C2YV) {
            C2YV c2yv2 = (C2YV) this;
            linearLayout = new LinearLayout(c2yv2.getContext());
            linearLayout.setOrientation(1);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams3.gravity = 16;
            linearLayout.setLayoutParams(layoutParams3);
            int dimensionPixelSize8 = c2yv2.getResources().getDimensionPixelSize(R.dimen.search_attachment_margin);
            C0LX.A08(c2yv2.A03, linearLayout, dimensionPixelSize8, 0, dimensionPixelSize8, 0);
            c2yv2.A00 = LayoutInflater.from(c2yv2.getContext()).inflate(R.layout.suspicious_link_indicator, (ViewGroup) linearLayout, false);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.topMargin = AnonymousClass088.A02(c2yv2.getContext(), 4.0f);
            layoutParams4.bottomMargin = AnonymousClass088.A02(c2yv2.getContext(), 4.0f);
            c2yv2.A00.setLayoutParams(layoutParams4);
            c2yv2.A00.setVisibility(8);
            c2yv2.A05 = new C51792Ya(c2yv2.getContext());
            c2yv2.A05.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            linearLayout.addView(c2yv2.A05);
            linearLayout.addView(c2yv2.A00);
        } else if (!(this instanceof C69123Nf)) {
            C3VW c3vw2 = (C3VW) this;
            c3vw2.A07 = new C51792Ya(c3vw2.getContext());
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -1);
            C0LX.A08(c3vw2.A0D, c3vw2.A07, 0, 0, c3vw2.getResources().getDimensionPixelSize(R.dimen.search_attachment_margin), 0);
            c3vw2.A07.setLayoutParams(layoutParams5);
            linearLayout = c3vw2.A07;
        } else {
            C69123Nf c69123Nf2 = (C69123Nf) this;
            c69123Nf2.A01 = new C51792Ya(c69123Nf2.getContext());
            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
            C0LX.A08(c69123Nf2.A02, c69123Nf2.A01, 0, 0, c69123Nf2.getResources().getDimensionPixelSize(R.dimen.search_attachment_margin), 0);
            c69123Nf2.A01.setLayoutParams(layoutParams6);
            linearLayout = c69123Nf2.A01;
        }
        if (linearLayout != null) {
            this.A00.addView(linearLayout);
        }
    }

    public void A01() {
        if (this instanceof C41S) {
            C41S c41s = (C41S) this;
            if (c41s.A00) {
                return;
            }
            c41s.A00 = true;
            c41s.generatedComponent();
        } else if (this instanceof C2YW) {
            C2YW c2yw = (C2YW) this;
            if (c2yw.A00) {
                return;
            }
            c2yw.A00 = true;
            ((AbstractC07960aN) c2yw.generatedComponent()).A2O((C2YV) c2yw);
        } else if (!(this instanceof C41T)) {
            C41R c41r = (C41R) this;
            if (!c41r.A00) {
                c41r.A00 = true;
                c41r.generatedComponent();
            }
        } else {
            C41T c41t = (C41T) this;
            if (c41t.A00) {
                return;
            }
            c41t.A00 = true;
            c41t.generatedComponent();
        }
    }

    @Override // X.AnonymousClass005
    public final Object generatedComponent() {
        C2UB c2ub = this.A02;
        if (c2ub == null) {
            c2ub = new C2UB(this);
            this.A02 = c2ub;
        }
        return c2ub.generatedComponent();
    }
}
