package com.whatsapp.picker.search;

import X.AbstractC15200oF;
import X.AnonymousClass011;
import X.AnonymousClass014;
import X.C000200d;
import X.C003701t;
import X.C02160Ac;
import X.C04050If;
import X.C0JM;
import X.C0MU;
import X.C0VW;
import X.C0ZT;
import X.C1BQ;
import X.C1BR;
import X.C2AM;
import X.C2CI;
import X.C2IK;
import X.C2MI;
import X.C32811em;
import X.C37551mb;
import X.C48352Ex;
import X.C70523Sp;
import X.C70553Ss;
import X.C78833kb;
import X.C78853kd;
import X.C78883kg;
import X.C78893kh;
import X.C82863rC;
import X.C85733w8;
import X.InterfaceC05620Pl;
import X.InterfaceC08320bF;
import X.InterfaceC53342en;
import X.ViewTreeObserver$OnGlobalLayoutListenerC70533Sq;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I0_3;
import com.google.android.material.tabs.TabLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaEditText;
import com.whatsapp.picker.search.StickerSearchDialogFragment;
import com.whatsapp.util.ViewOnClickCListenerShape10S0100000_I0_2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class StickerSearchDialogFragment extends Hilt_StickerSearchDialogFragment implements InterfaceC53342en {
    public View A00;
    public ViewTreeObserver.OnGlobalLayoutListener A01;
    public RecyclerView A02;
    public ViewPager A03;
    public TabLayout A04;
    public WaEditText A05;
    public C2MI A06;
    public C003701t A07;
    public AnonymousClass011 A08;
    public ViewTreeObserver$OnGlobalLayoutListenerC70533Sq A09;
    public C78883kg A0A;
    public C2AM A0B;
    public C2IK A0C;
    public Runnable A0D;
    public final C70523Sp A0F = new C70523Sp();
    public String A0E = "";

    @Override // com.whatsapp.base.WaDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0g() {
        super.A0g();
        this.A05.A02(false);
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0k(Bundle bundle) {
        super.A0k(bundle);
        if (TextUtils.isEmpty(this.A0E)) {
            return;
        }
        bundle.putString("search_term", this.A0E);
    }

    @Override // com.whatsapp.picker.search.PickerSearchDialogFragment, X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.A0p(layoutInflater, viewGroup, bundle);
        Context A00 = A00();
        if (bundle != null) {
            this.A0E = bundle.getString("search_term");
        }
        if (this.A0E == null) {
            this.A0E = "";
        }
        View inflate = layoutInflater.inflate(R.layout.sticker_search_dialog, viewGroup, false);
        this.A00 = inflate.findViewById(R.id.no_results);
        View findViewById = inflate.findViewById(R.id.get_more_stickers_button);
        if (((PickerSearchDialogFragment) this).A00 != null) {
            findViewById.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(this, 18));
        }
        this.A02 = (RecyclerView) inflate.findViewById(R.id.search_result);
        View findViewById2 = inflate.findViewById(R.id.search_bar_container);
        this.A05 = (WaEditText) inflate.findViewById(R.id.search_bar);
        C70553Ss c70553Ss = new C70553Ss(A00, viewGroup, this.A02, this.A0C);
        this.A01 = c70553Ss.A07;
        this.A02.getViewTreeObserver().addOnGlobalLayoutListener(this.A01);
        this.A02.A0m(new AbstractC15200oF() { // from class: X.3kc
            {
                StickerSearchDialogFragment.this = this;
            }

            @Override // X.AbstractC15200oF
            public void A01(RecyclerView recyclerView, int i, int i2) {
                if (i2 != 0) {
                    StickerSearchDialogFragment.this.A05.A01();
                }
            }
        });
        C82863rC c82863rC = new C82863rC(this.A07, A01(), c70553Ss.A08);
        this.A02.A0m(c82863rC);
        RecyclerView recyclerView = this.A02;
        this.A09 = new ViewTreeObserver$OnGlobalLayoutListenerC70533Sq(recyclerView, c82863rC);
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this.A09);
        C78893kh c78893kh = new C78893kh(this.A06);
        C0VW ADv = ADv();
        String canonicalName = C78883kg.class.getCanonicalName();
        if (canonicalName != null) {
            String A0H = C000200d.A0H("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            HashMap hashMap = ADv.A00;
            Object obj = (C0MU) hashMap.get(A0H);
            if (!C78883kg.class.isInstance(obj)) {
                obj = new C78883kg(c78893kh.A00);
                C0MU c0mu = (C0MU) hashMap.put(A0H, obj);
                if (c0mu != null) {
                    c0mu.A01();
                }
            }
            C78883kg c78883kg = (C78883kg) obj;
            this.A0A = c78883kg;
            c78883kg.A00.A05(A0D(), new InterfaceC05620Pl() { // from class: X.3kV
                {
                    StickerSearchDialogFragment.this = this;
                }

                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj2) {
                    StickerSearchDialogFragment.this.A0A.A02();
                }
            });
            this.A0A.A01.A05(A0D(), new InterfaceC05620Pl() { // from class: X.3kU
                {
                    StickerSearchDialogFragment.this = this;
                }

                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj2) {
                    StickerSearchDialogFragment stickerSearchDialogFragment = StickerSearchDialogFragment.this;
                    List list = (List) obj2;
                    C2IK c2ik = stickerSearchDialogFragment.A0C;
                    if (c2ik != null) {
                        c2ik.A04 = !TextUtils.isEmpty(stickerSearchDialogFragment.A0E);
                        stickerSearchDialogFragment.A0C.A0G(list);
                        ((AbstractC04890Mh) stickerSearchDialogFragment.A0C).A01.A00();
                        ViewTreeObserver$OnGlobalLayoutListenerC70533Sq viewTreeObserver$OnGlobalLayoutListenerC70533Sq = stickerSearchDialogFragment.A09;
                        if (viewTreeObserver$OnGlobalLayoutListenerC70533Sq != null) {
                            viewTreeObserver$OnGlobalLayoutListenerC70533Sq.A02 = true;
                        }
                        stickerSearchDialogFragment.A1A();
                    }
                }
            });
            if (this.A0C == null) {
                C78833kb c78833kb = ((PickerSearchDialogFragment) this).A00;
                if (c78833kb != null) {
                    List list = c78833kb.A05;
                    if (list == null) {
                        c78833kb.A08.A02();
                    } else {
                        this.A0A.A00.A0B(list);
                    }
                    List list2 = (List) this.A0A.A01.A01();
                    ContextWrapper contextWrapper = ((Hilt_StickerSearchDialogFragment) this).A00;
                    C48352Ex c48352Ex = ((PickerSearchDialogFragment) this).A00.A00;
                    C2IK c2ik = new C2IK(list2, contextWrapper, c48352Ex == null ? null : c48352Ex.A0Y, this, 1);
                    this.A0C = c2ik;
                    this.A02.setAdapter(c2ik);
                } else {
                    throw null;
                }
            }
            View findViewById3 = inflate.findViewById(R.id.clear_search_btn);
            findViewById3.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 11));
            this.A05.addTextChangedListener(new C78853kd(this, findViewById3));
            inflate.findViewById(R.id.back).setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 12));
            TabLayout tabLayout = (TabLayout) inflate.findViewById(R.id.sticker_category_tabs);
            this.A04 = tabLayout;
            int A002 = C02160Ac.A00(((Hilt_StickerSearchDialogFragment) this).A00, R.color.mediaGalleryTabInactive);
            int A003 = C02160Ac.A00(((Hilt_StickerSearchDialogFragment) this).A00, R.color.mediaGalleryTabActive);
            if (tabLayout != null) {
                tabLayout.setTabTextColors(TabLayout.A00(A002, A003));
                this.A04.setBackgroundColor(C02160Ac.A00(((Hilt_StickerSearchDialogFragment) this).A00, R.color.elevated_background));
                findViewById2.setBackgroundColor(C02160Ac.A00(((Hilt_StickerSearchDialogFragment) this).A00, R.color.elevated_background));
                A1B(R.string.sticker_search_tab_all);
                A1B(R.string.sticker_search_tab_love);
                A1B(R.string.sticker_search_tab_greetings);
                A1B(R.string.sticker_search_tab_happy);
                A1B(R.string.sticker_search_tab_sad);
                A1B(R.string.sticker_search_tab_angry);
                A1B(R.string.sticker_search_tab_celebrate);
                this.A04.setTabMode(0);
                this.A03 = (ViewPager) inflate.findViewById(R.id.sticker_category_viewpager);
                this.A03.setAdapter(new C85733w8(A0B()));
                this.A03.setOffscreenPageLimit(7);
                this.A03.A0F(new C32811em(this.A04));
                TabLayout tabLayout2 = this.A04;
                InterfaceC08320bF interfaceC08320bF = new InterfaceC08320bF() { // from class: X.3ke
                    {
                        StickerSearchDialogFragment.this = this;
                    }

                    @Override // X.InterfaceC08320bF
                    public void APY(C1BQ c1bq) {
                        StickerSearchDialogFragment stickerSearchDialogFragment = StickerSearchDialogFragment.this;
                        stickerSearchDialogFragment.A05.A01();
                        stickerSearchDialogFragment.A03.setCurrentItem(c1bq.A00);
                    }
                };
                if (!tabLayout2.A0c.contains(interfaceC08320bF)) {
                    tabLayout2.A0c.add(interfaceC08320bF);
                }
                this.A05.setText("");
                this.A05.requestFocus();
                this.A05.A02(false);
                AnonymousClass014 anonymousClass014 = new AnonymousClass014() { // from class: X.1ma
                    {
                        AnonymousClass015 anonymousClass015 = AnonymousClass014.DEFAULT_SAMPLING_RATE;
                    }
                };
                this.A08.A09(anonymousClass014, 1);
                AnonymousClass011.A01(anonymousClass014, "");
                return inflate;
            }
            throw null;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0r() {
        this.A02.getViewTreeObserver().removeGlobalOnLayoutListener(this.A01);
        this.A02.getViewTreeObserver().removeGlobalOnLayoutListener(this.A09);
        List list = this.A02.A0b;
        if (list != null) {
            list.clear();
        }
        Runnable runnable = this.A0D;
        if (runnable != null) {
            this.A05.removeCallbacks(runnable);
            this.A0D = null;
        }
        super.A0r();
    }

    public List A19(int i) {
        List<C0JM> list = (List) this.A0A.A00.A01();
        if (list == null) {
            return new ArrayList(0);
        }
        C70523Sp c70523Sp = this.A0F;
        if (c70523Sp != null) {
            if (i == 0) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            Set set = (Set) c70523Sp.A00.get(Integer.valueOf(i));
            if (set != null) {
                for (C0JM c0jm : list) {
                    C04050If c04050If = c0jm.A04;
                    if (c04050If != null && c04050If.A06 != null) {
                        int i2 = 0;
                        while (true) {
                            C2CI[] c2ciArr = c04050If.A06;
                            if (i2 >= c2ciArr.length) {
                                break;
                            } else if (set.contains(c2ciArr[i2])) {
                                arrayList.add(c0jm);
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
            }
            return arrayList;
        }
        throw null;
    }

    public final void A1A() {
        List list = (List) this.A0A.A01.A01();
        List list2 = (List) this.A0A.A00.A01();
        int i = 0;
        if (TextUtils.isEmpty(this.A0E)) {
            this.A04.setVisibility(0);
            if (this.A03.getVisibility() != 0) {
                this.A03.setVisibility(0);
                A1C(true);
            }
            View view = this.A00;
            if (list2 != null && !list2.isEmpty()) {
                i = 8;
            }
            view.setVisibility(i);
            return;
        }
        this.A04.setVisibility(8);
        if (this.A03.getVisibility() != 8) {
            A1C(false);
            this.A03.setVisibility(8);
        }
        if (list != null && !list.isEmpty()) {
            this.A00.setVisibility(8);
        } else {
            this.A00.setVisibility(0);
        }
    }

    public final void A1B(int i) {
        C1BQ A03 = this.A04.A03();
        A03.A01(i);
        A03.A03 = A0G(R.string.sticker_search_tab_content_description, A01().getString(i));
        C1BR c1br = A03.A01;
        if (c1br != null) {
            c1br.A00();
        }
        TabLayout tabLayout = this.A04;
        tabLayout.A0E(A03, tabLayout.A0d.isEmpty());
    }

    public final void A1C(boolean z) {
        StickerSearchTabFragment stickerSearchTabFragment;
        C2IK c2ik;
        C0ZT c0zt = this.A03.A0V;
        if (!(c0zt instanceof C85733w8) || (c2ik = (stickerSearchTabFragment = ((C85733w8) c0zt).A00).A03) == null) {
            return;
        }
        c2ik.A04 = z;
        stickerSearchTabFragment.A01.setAdapter(null);
        stickerSearchTabFragment.A01.setAdapter(stickerSearchTabFragment.A03);
    }

    @Override // X.InterfaceC53342en
    public void AP7(C0JM c0jm, Integer num) {
        if (((PickerSearchDialogFragment) this).A00 != null) {
            C2AM c2am = this.A0B;
            c2am.A09.execute(new RunnableEBaseShape0S0210000_I0(c2am, c0jm, true, 12));
            InterfaceC53342en interfaceC53342en = ((PickerSearchDialogFragment) this).A00.A04;
            if (interfaceC53342en != null) {
                interfaceC53342en.AP7(c0jm, num);
            }
            C37551mb c37551mb = new C37551mb();
            c37551mb.A02 = 1;
            c37551mb.A01 = Boolean.valueOf(!c0jm.A02());
            this.A08.A09(c37551mb, 1);
            AnonymousClass011.A01(c37551mb, "");
        }
    }
}
