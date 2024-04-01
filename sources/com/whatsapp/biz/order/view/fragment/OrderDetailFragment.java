package com.whatsapp.biz.order.view.fragment;

import X.AnonymousClass012;
import X.AnonymousClass345;
import X.C000200d;
import X.C002301c;
import X.C02590Ca;
import X.C02L;
import X.C04260Jm;
import X.C04P;
import X.C05Y;
import X.C0AT;
import X.C0CR;
import X.C0HK;
import X.C0MU;
import X.C0VW;
import X.C2Kj;
import X.C2MT;
import X.C2N3;
import X.C34A;
import X.C34C;
import X.C49412Kg;
import X.C49442Kl;
import X.C49462Ko;
import X.C53312ca;
import X.C56342n8;
import X.C56352n9;
import X.C68283Iw;
import X.InterfaceC002901k;
import X.InterfaceC05620Pl;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0_0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.order.view.fragment.OrderDetailFragment;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class OrderDetailFragment extends Hilt_OrderDetailFragment {
    public View A00;
    public ProgressBar A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public RecyclerView A05;
    public C02L A06;
    public C49462Ko A07;
    public C2MT A08;
    public C2N3 A09;
    public C49442Kl A0A;
    public C53312ca A0B;
    public C34A A0C;
    public C68283Iw A0D;
    public AnonymousClass012 A0E;
    public C002301c A0F;
    public UserJid A0G;
    public C05Y A0H;
    public InterfaceC002901k A0I;
    public String A0J;

    /* JADX WARN: Type inference failed for: r11v0, types: [X.2nA] */
    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        Object obj;
        View inflate = layoutInflater.inflate(R.layout.fragment_order_detail, viewGroup, false);
        inflate.findViewById(R.id.order_detail_close_btn).setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 21));
        this.A03 = (TextView) C0AT.A0D(inflate, R.id.order_detail_quantity);
        this.A02 = (TextView) C0AT.A0D(inflate, R.id.order_detail_estimate_value);
        this.A01 = (ProgressBar) C0AT.A0D(inflate, R.id.order_detail_loading_spinner);
        this.A00 = C0AT.A0D(inflate, R.id.order_detail_timestamp_divider);
        RecyclerView recyclerView = (RecyclerView) C0AT.A0D(inflate, R.id.order_detail_recycler_view);
        this.A05 = recyclerView;
        recyclerView.A0i = true;
        C0AT.A0f(recyclerView, false);
        this.A04 = (TextView) C0AT.A0D(inflate, R.id.order_detail_timestamp);
        inflate.setMinimumHeight(A19());
        Parcelable parcelable = A02().getParcelable("extra_key_seller_jid");
        if (parcelable != null) {
            this.A0G = (UserJid) parcelable;
            String string2 = A02().getString("extra_key_order_id");
            if (string2 != null) {
                this.A0J = string2;
                String string3 = A02().getString("extra_key_token");
                if (string3 != null) {
                    C56342n8 c56342n8 = new C56342n8(this.A0G, this.A0J, A01().getDimensionPixelSize(R.dimen.order_message_thumbnail_width), A01().getDimensionPixelSize(R.dimen.order_message_thumbnail_height), string3);
                    C0CR c0cr = new C0CR(this.A0E, ((Hilt_OrderDetailFragment) this).A00, new Object() { // from class: X.2nA
                    }, this.A0G, this.A06, this.A0F, new C2Kj(this.A0I, this.A0A, c56342n8, this.A0B, new AnonymousClass345(this.A0H, c56342n8, new C56352n9(new C49412Kg())))) { // from class: X.34B
                        public final Context A00;
                        public final C02L A01;
                        public final C2Kj A02;
                        public final C56362nA A03;
                        public final AnonymousClass012 A04;
                        public final C002301c A05;
                        public final UserJid A06;

                        {
                            this.A04 = r1;
                            this.A00 = r2;
                            this.A03 = r3;
                            this.A06 = r4;
                            this.A01 = r5;
                            this.A05 = r6;
                            this.A02 = r7;
                        }

                        @Override // X.C0CR
                        public C0MU A6e(Class cls) {
                            return new C34A(this.A04, this.A00, this.A03, this.A06, this.A01, this.A02, this.A05);
                        }
                    };
                    C0VW ADv = ADv();
                    String canonicalName = C34A.class.getCanonicalName();
                    if (canonicalName != null) {
                        String A0H = C000200d.A0H("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
                        HashMap hashMap = ADv.A00;
                        C0MU c0mu = (C0MU) hashMap.get(A0H);
                        if (!C34A.class.isInstance(c0mu)) {
                            c0mu = c0cr.A6e(C34A.class);
                            C0MU c0mu2 = (C0MU) hashMap.put(A0H, c0mu);
                            if (c0mu2 != null) {
                                c0mu2.A01();
                            }
                        }
                        C34A c34a = (C34A) c0mu;
                        this.A0C = c34a;
                        c34a.A01.A05(A0D(), new InterfaceC05620Pl() { // from class: X.348
                            {
                                OrderDetailFragment.this = this;
                            }

                            @Override // X.InterfaceC05620Pl
                            public final void AIK(Object obj2) {
                                OrderDetailFragment orderDetailFragment = OrderDetailFragment.this;
                                C2Km c2Km = (C2Km) obj2;
                                orderDetailFragment.A01.setVisibility(8);
                                C68283Iw c68283Iw = orderDetailFragment.A0D;
                                List<C56322n5> list = c2Km.A02;
                                if (c68283Iw != null) {
                                    int i = 0;
                                    for (C56322n5 c56322n5 : list) {
                                        i += c56322n5.A00;
                                    }
                                    orderDetailFragment.A03.setText(orderDetailFragment.A0F.A0A(R.plurals.products_total_quantity, i, Integer.valueOf(i)));
                                    orderDetailFragment.A02.setText(orderDetailFragment.A0D.A02(list));
                                    orderDetailFragment.A05.setAdapter(new AnonymousClass346(orderDetailFragment.A0F, orderDetailFragment.A09, list, orderDetailFragment));
                                    orderDetailFragment.A00.setVisibility(0);
                                    TextView textView = orderDetailFragment.A04;
                                    C34A c34a2 = orderDetailFragment.A0C;
                                    if (c34a2 != null) {
                                        long A06 = c34a2.A06.A06(TimeUnit.SECONDS.toMillis(c2Km.A00));
                                        C002301c c002301c = c34a2.A07;
                                        textView.setText(AbstractC40621sZ.A01(c002301c, c34a2.A02.getString(R.string.order_sent_date_and_time, C002501g.A0B(c002301c, A06), AbstractC40621sZ.A00(c002301c, A06)), A06));
                                        return;
                                    }
                                    throw null;
                                }
                                throw null;
                            }
                        });
                        this.A0C.A00.A05(A0D(), new InterfaceC05620Pl() { // from class: X.349
                            {
                                OrderDetailFragment.this = this;
                            }

                            @Override // X.InterfaceC05620Pl
                            public final void AIK(Object obj2) {
                                OrderDetailFragment orderDetailFragment = OrderDetailFragment.this;
                                orderDetailFragment.A01.setVisibility(8);
                                int intValue = ((Number) ((Pair) obj2).first).intValue();
                                int i = R.string.order_deleted_error;
                                if (intValue != 404) {
                                    i = R.string.catalog_something_went_wrong_error;
                                }
                                C09250cv.A00(orderDetailFragment.A05(), orderDetailFragment.A00().getString(i), 0).A04();
                            }
                        });
                        TextView textView = (TextView) C0AT.A0D(inflate, R.id.order_detail_title);
                        C34A c34a2 = this.A0C;
                        boolean A0A = c34a2.A03.A0A(c34a2.A08);
                        Context context = c34a2.A02;
                        if (A0A) {
                            string = context.getString(R.string.received_cart);
                        } else {
                            string = context.getString(R.string.your_sent_cart);
                        }
                        textView.setText(string);
                        C34C c34c = new C34C(A0A().getApplication(), this.A0F);
                        C0VW ADv2 = ADv();
                        String canonicalName2 = C68283Iw.class.getCanonicalName();
                        if (canonicalName2 != null) {
                            String A0H2 = C000200d.A0H("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName2);
                            HashMap hashMap2 = ADv2.A00;
                            Object obj2 = (C0MU) hashMap2.get(A0H2);
                            if (!C68283Iw.class.isInstance(obj2)) {
                                obj2 = new C68283Iw(c34c.A00, c34c.A01);
                                C0MU c0mu3 = (C0MU) hashMap2.put(A0H2, obj2);
                                if (c0mu3 != null) {
                                    c0mu3.A01();
                                }
                            }
                            this.A0D = (C68283Iw) obj2;
                            C2Kj c2Kj = this.A0C.A04;
                            Object obj3 = c2Kj.A02.A00.get(c2Kj.A04.A03);
                            if (obj3 != null) {
                                C0HK c0hk = c2Kj.A00;
                                if (c0hk != null) {
                                    c0hk.A0A(obj3);
                                }
                            } else {
                                C53312ca c53312ca = c2Kj.A03;
                                String str = c2Kj.A04.A03;
                                AnonymousClass345 anonymousClass345 = c2Kj.A05;
                                synchronized (c53312ca) {
                                    obj = (Future) c53312ca.A00.get(str);
                                    if (obj == null) {
                                        C05Y c05y = anonymousClass345.A03;
                                        String A02 = c05y.A02();
                                        ArrayList arrayList = new ArrayList();
                                        C56342n8 c56342n82 = anonymousClass345.A01;
                                        arrayList.add(new C02590Ca("width", (C04P[]) null, Integer.toString(c56342n82.A01)));
                                        arrayList.add(new C02590Ca("height", (C04P[]) null, Integer.toString(c56342n82.A00)));
                                        C02590Ca c02590Ca = new C02590Ca("image_dimensions", null, (C02590Ca[]) arrayList.toArray(new C02590Ca[0]), null);
                                        C02590Ca c02590Ca2 = new C02590Ca("token", (C04P[]) null, c56342n82.A04);
                                        ArrayList arrayList2 = new ArrayList();
                                        arrayList2.add(c02590Ca);
                                        arrayList2.add(c02590Ca2);
                                        c05y.A07(248, A02, new C02590Ca("iq", new C04P[]{new C04P("smax_id", "5", null, (byte) 0), new C04P("id", A02, null, (byte) 0), new C04P("xmlns", "fb:thrift_iq", null, (byte) 0), new C04P("type", "get", null, (byte) 0), new C04P("to", C04260Jm.A00)}, new C02590Ca("order", new C04P[]{new C04P("op", "get", null, (byte) 0), new C04P("id", c56342n82.A03, null, (byte) 0)}, (C02590Ca[]) arrayList2.toArray(new C02590Ca[0]), null)), anonymousClass345, 32000L);
                                        C000200d.A1J(C000200d.A0P("GetOrderProtocol jid="), c56342n82.A02);
                                        obj = anonymousClass345.A00;
                                        c53312ca.A00.put(str, obj);
                                        c53312ca.A01.AS1(new RunnableEBaseShape0S1200000_I0(c53312ca, str, obj, 6));
                                    }
                                }
                                c2Kj.A06.AS1(new RunnableEBaseShape0S0200000_I0_0(c2Kj, obj, 27));
                            }
                            this.A07.A03(35, 45, null, this.A0G, null, this.A0J, null, null, null);
                            return inflate;
                        }
                        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                    }
                    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.C0BA
    public void A0q() {
        this.A0U = true;
        this.A09.A00();
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        this.A09 = new C2N3(this.A08);
    }

    @Override // com.whatsapp.RoundedBottomSheetDialogFragment
    public void A1A(View view) {
        super.A1A(view);
        BottomSheetBehavior.A00(view).A0J = false;
    }
}
