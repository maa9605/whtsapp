package com.whatsapp.search;

import X.AbstractC000600i;
import X.AbstractC005302j;
import X.AbstractC08920cK;
import X.AbstractC09240cu;
import X.AbstractC15200oF;
import X.ActivityC02330At;
import X.AnonymousClass008;
import X.AnonymousClass011;
import X.AnonymousClass012;
import X.AnonymousClass017;
import X.AnonymousClass024;
import X.AnonymousClass029;
import X.C000200d;
import X.C000500h;
import X.C001200o;
import X.C002301c;
import X.C003401q;
import X.C003701t;
import X.C00B;
import X.C011505r;
import X.C015307e;
import X.C018308n;
import X.C018508q;
import X.C018608r;
import X.C018708s;
import X.C01B;
import X.C02160Ac;
import X.C02180Ae;
import X.C02520Bt;
import X.C02980Dr;
import X.C02E;
import X.C02F;
import X.C02L;
import X.C02O;
import X.C03120Eg;
import X.C03180Eq;
import X.C03300Fd;
import X.C03320Ff;
import X.C03340Fh;
import X.C03360Fk;
import X.C03750Gx;
import X.C05M;
import X.C05W;
import X.C05Y;
import X.C06040Rh;
import X.C06K;
import X.C06L;
import X.C06M;
import X.C07630Zb;
import X.C09250cv;
import X.C0AT;
import X.C0C8;
import X.C0CB;
import X.C0DJ;
import X.C0DK;
import X.C0ES;
import X.C0GA;
import X.C0GC;
import X.C0GE;
import X.C0GG;
import X.C0GK;
import X.C0GV;
import X.C0L5;
import X.C0L7;
import X.C0L8;
import X.C0LM;
import X.C0WZ;
import X.C0We;
import X.C0Zn;
import X.C23K;
import X.C2AR;
import X.C2MG;
import X.C2MS;
import X.C2MZ;
import X.C35301iv;
import X.C35541jJ;
import X.C40081rY;
import X.C40261rr;
import X.C40301ry;
import X.C40421sE;
import X.C40731sm;
import X.C40951t8;
import X.C41181tV;
import X.C41221tZ;
import X.C41321tj;
import X.C41461tx;
import X.C41471ty;
import X.C41521u3;
import X.C41541u6;
import X.C42461vm;
import X.C42711wC;
import X.C43081wp;
import X.C461925o;
import X.C470629j;
import X.C470729k;
import X.C52762bH;
import X.C80793nr;
import X.InterfaceC002901k;
import X.InterfaceC02360Aw;
import X.InterfaceC05620Pl;
import X.InterfaceC05790Qg;
import X.InterfaceC52832bQ;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape4S0100000_I0_4;
import com.google.android.material.chip.Chip;
import com.google.android.search.verification.client.R;
import com.whatsapp.BidiToolbar;
import com.whatsapp.Conversation;
import com.whatsapp.QuickContactActivity;
import com.whatsapp.base.WaFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.search.Hilt_SearchFragment;
import com.whatsapp.search.SearchFragment;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.search.views.ProgressView;
import com.whatsapp.search.views.TokenizedSearchInput;
import com.whatsapp.text.FinalBackspaceAwareEntry;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class SearchFragment extends Hilt_SearchFragment {
    public ValueAnimator A00;
    public View A01;
    public ViewGroup A02;
    public RecyclerView A03;
    public C09250cv A04;
    public C018308n A05;
    public BidiToolbar A06;
    public C06040Rh A07;
    public AbstractC000600i A08;
    public C018508q A09;
    public C02L A0A;
    public C01B A0B;
    public C0LM A0C;
    public C018608r A0D;
    public C0L8 A0E;
    public C06K A0F;
    public C06M A0G;
    public C06L A0H;
    public C40261rr A0I;
    public C03320Ff A0J;
    public C41541u6 A0K;
    public C0L7 A0L;
    public C05W A0M;
    public AnonymousClass008 A0N;
    public C018708s A0O;
    public C011505r A0P;
    public C0Zn A0Q;
    public C0L5 A0R;
    public C41321tj A0S;
    public C41221tZ A0T;
    public C03120Eg A0U;
    public C470629j A0V;
    public C02E A0W;
    public AnonymousClass012 A0X;
    public C001200o A0Y;
    public C02F A0Z;
    public C000500h A0a;
    public C002301c A0b;
    public C41181tV A0c;
    public C05M A0d;
    public C0DK A0e;
    public C03340Fh A0f;
    public C0GK A0g;
    public C42711wC A0h;
    public C0GV A0i;
    public C0C8 A0j;
    public C03180Eq A0k;
    public C0WZ A0l;
    public C43081wp A0m;
    public C00B A0n;
    public C40421sE A0o;
    public C40081rY A0p;
    public C003701t A0q;
    public C03300Fd A0r;
    public AnonymousClass011 A0s;
    public C0ES A0t;
    public C03360Fk A0u;
    public AbstractC005302j A0v;
    public C41461tx A0w;
    public C41471ty A0x;
    public C02980Dr A0y;
    public C05Y A0z;
    public C41521u3 A10;
    public C40301ry A11;
    public C03750Gx A12;
    public C02O A13;
    public IteratingPlayer A14;
    public C461925o A15;
    public SearchViewModel A16;
    public ProgressView A17;
    public TokenizedSearchInput A18;
    public C0CB A19;
    public C2AR A1A;
    public C2MG A1B;
    public C42461vm A1C;
    public C52762bH A1D;
    public C2MS A1E;
    public C2MZ A1F;
    public C003401q A1G;
    public InterfaceC002901k A1H;
    public C23K A1I;
    public C40951t8 A1J;
    public Runnable A1K;
    public boolean A1L;
    public final C0GA A1P = new C0GA() { // from class: X.3nb
        {
            SearchFragment.this = this;
        }

        @Override // X.C0GA
        public void A00() {
            SearchFragment.A00(SearchFragment.this);
        }

        @Override // X.C0GA
        public void A01(AbstractC005302j abstractC005302j) {
            SearchFragment.A01(SearchFragment.this, abstractC005302j);
        }

        @Override // X.C0GA
        public void A03(UserJid userJid) {
            SearchFragment.A01(SearchFragment.this, userJid);
        }

        @Override // X.C0GA
        public void A04(UserJid userJid) {
            SearchFragment.A01(SearchFragment.this, userJid);
        }
    };
    public final C0GC A1O = new C0GC() { // from class: X.3nc
        {
            SearchFragment.this = this;
        }

        @Override // X.C0GC
        public void A00(AbstractC005302j abstractC005302j) {
            SearchFragment.A00(SearchFragment.this);
        }

        @Override // X.C0GC
        public void A01(AbstractC005302j abstractC005302j) {
            SearchFragment.A01(SearchFragment.this, abstractC005302j);
        }
    };
    public final C0GE A1R = new C0GE() { // from class: X.3nd
        {
            SearchFragment.this = this;
        }

        @Override // X.C0GE
        public void A00(Set set) {
            SearchFragment.A00(SearchFragment.this);
        }
    };
    public final AbstractC09240cu A1N = new AbstractC09240cu() { // from class: X.3ne
        {
            SearchFragment.this = this;
        }

        @Override // X.AbstractC09240cu
        public void A01(UserJid userJid) {
            SearchFragment.A01(SearchFragment.this, userJid);
        }
    };
    public final C0GG A1Q = new C0GG() { // from class: X.3nf
        {
            SearchFragment.this = this;
        }

        @Override // X.C0GG
        public void A00() {
            SearchFragment.A00(SearchFragment.this);
        }

        @Override // X.C0GG
        public void A03(AbstractC005302j abstractC005302j) {
            SearchFragment.A01(SearchFragment.this, abstractC005302j);
        }

        @Override // X.C0GG
        public void A05(AbstractC005302j abstractC005302j) {
            SearchViewModel searchViewModel = SearchFragment.this.A16;
            C52412ag c52412ag = searchViewModel.A0l;
            c52412ag.A02.A0A(c52412ag.A00);
            C52422ah c52422ah = searchViewModel.A0m;
            c52422ah.A02.A0A(c52422ah.A00);
        }
    };
    public final AbstractC15200oF A1M = new AbstractC15200oF() { // from class: X.3ng
        {
            SearchFragment.this = this;
        }

        @Override // X.AbstractC15200oF
        public void A01(RecyclerView recyclerView, int i, int i2) {
            SearchFragment searchFragment = SearchFragment.this;
            C09250cv c09250cv = searchFragment.A04;
            if (c09250cv != null) {
                c09250cv.A02(3);
            }
            searchFragment.A11();
            if (i2 == 0 || recyclerView.A0B != 1) {
                return;
            }
            searchFragment.A16.A0L(false);
        }
    };

    public static void A00(SearchFragment searchFragment) {
        C018508q c018508q = searchFragment.A09;
        c018508q.A02.post(new RunnableEBaseShape6S0100000_I0_6(searchFragment, 8));
    }

    public static void A01(SearchFragment searchFragment, AbstractC005302j abstractC005302j) {
        C018508q c018508q = searchFragment.A09;
        c018508q.A02.post(new RunnableEBaseShape4S0200000_I0_4(searchFragment, abstractC005302j, 10));
    }

    @Override // X.C0BA
    public void A0d(Bundle bundle) {
        super.A0U = true;
        final SearchViewModel searchViewModel = this.A16;
        ActivityC02330At A0A = A0A();
        searchViewModel.A0F.A05(A0A, new InterfaceC05620Pl() { // from class: X.3nE
            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                searchViewModel.A0D();
            }
        });
        searchViewModel.A0D.A05(A0A, new InterfaceC05620Pl() { // from class: X.3nP
            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                searchViewModel.A0D();
            }
        });
        searchViewModel.A0C.A05(A0A, new InterfaceC05620Pl() { // from class: X.3nM
            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                SearchViewModel searchViewModel2 = searchViewModel;
                String str = (String) obj;
                if (!AnonymousClass024.A0l(str, searchViewModel2.A0X)) {
                    searchViewModel2.A0X = str;
                    searchViewModel2.A0B();
                }
            }
        });
        searchViewModel.A05.A05(A0A, new InterfaceC05620Pl() { // from class: X.3nH
            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                SearchViewModel searchViewModel2 = searchViewModel;
                Integer num = (Integer) obj;
                if (!AnonymousClass024.A0l(num, searchViewModel2.A0U)) {
                    searchViewModel2.A0U = num;
                    searchViewModel2.A0B();
                }
            }
        });
        searchViewModel.A04.A05(A0A, new InterfaceC05620Pl() { // from class: X.3nK
            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                SearchViewModel searchViewModel2 = searchViewModel;
                UserJid userJid = (UserJid) obj;
                if (!AnonymousClass024.A0l(userJid, searchViewModel2.A0I)) {
                    searchViewModel2.A0I = userJid;
                    searchViewModel2.A0B();
                }
            }
        });
    }

    @Override // X.C0BA
    public void A0h(int i, int i2, Intent intent) {
        this.A0V.A01(i);
    }

    @Override // X.C0BA
    public void A0k(Bundle bundle) {
        bundle.putLong("ephemeral_session_start", this.A0i.A00);
    }

    @Override // X.C0BA
    public boolean A0n(MenuItem menuItem) {
        if (this.A0V.A02(A09(), this, menuItem)) {
            this.A0U.A05();
            return true;
        }
        return false;
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        StringBuilder sb = new StringBuilder("SearchFragment/onCreateView ");
        sb.append(this);
        Log.i(sb.toString());
        try {
            AnonymousClass017.A00(this.A0Y.A00);
        } catch (IOException unused) {
        }
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.search_fragment, viewGroup, false);
        this.A02 = viewGroup2;
        this.A03 = (RecyclerView) viewGroup2.findViewById(R.id.result_list);
        this.A01 = this.A02.findViewById(R.id.divider);
        SearchViewModel searchViewModel = this.A16;
        if (searchViewModel != null) {
            try {
                searchViewModel.A0p.AS1(new RunnableEBaseShape6S0100000_I0_6(searchViewModel.A0n, 4));
            } catch (Exception e) {
                StringBuilder A0P = C000200d.A0P("SearchViewModel/warmContacts/");
                A0P.append(searchViewModel.A0p);
                A0P.append("/");
                A0P.append(searchViewModel.A0n);
                Log.e(A0P.toString(), e);
            }
            if (!this.A1L) {
                if (this.A02 != null) {
                    SearchViewModel searchViewModel2 = this.A16;
                    if (searchViewModel2 != null) {
                        searchViewModel2.A0G(1);
                    }
                    this.A1K = this.A1H.ASB(new RunnableEBaseShape6S0100000_I0_6(this, 6), 50L);
                    this.A02.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.3Ve
                        {
                            SearchFragment.this = this;
                        }

                        @Override // android.view.View.OnLayoutChangeListener
                        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                            view.removeOnLayoutChangeListener(this);
                            SearchFragment searchFragment = SearchFragment.this;
                            searchFragment.A12(i, i2, i3, i4, true, new RunnableEBaseShape9S0100000_I1_1(searchFragment, 14));
                        }
                    });
                }
                this.A1L = true;
            }
            IteratingPlayer iteratingPlayer = new IteratingPlayer(this.A09, this.A03);
            this.A14 = iteratingPlayer;
            super.A0K.A02(iteratingPlayer);
            super.A0K.A02(this.A16);
            C001200o c001200o = this.A0Y;
            C40951t8 c40951t8 = this.A1J;
            C05W c05w = this.A0M;
            C002301c c002301c = this.A0b;
            C011505r c011505r = this.A0P;
            C06K c06k = this.A0F;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 5L, TimeUnit.SECONDS, new PriorityBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            C23K c23k = new C23K(c001200o, c40951t8, c05w, c002301c, c011505r, c06k, threadPoolExecutor);
            this.A1I = c23k;
            this.A15 = new C461925o(this.A0X, this.A0q, A09(), this.A0y, super.A0K, this.A1C, this.A09, this.A08, this.A1H, this.A0A, this.A0Y, this.A0d, this.A0p, this.A0B, this.A05, this.A0x, this.A12, this.A0L, this.A0M, this.A07, this.A0g, this.A0W, this.A0O, this.A0b, this.A0l, this.A0I, this.A0k, this.A1A, this.A19, c23k, this.A0o, this.A0Z, this.A0Q, this.A0a, this.A0F, this.A0w, this.A13, this.A0C, this.A16, this.A0e, this.A14);
            Context A00 = A00();
            SearchGridLayoutManager searchGridLayoutManager = new SearchGridLayoutManager(A00, this.A15);
            RecyclerView recyclerView = this.A03;
            recyclerView.A0i = true;
            recyclerView.setLayoutManager(searchGridLayoutManager);
            this.A03.setAdapter(this.A15);
            RecyclerView recyclerView2 = this.A03;
            IteratingPlayer iteratingPlayer2 = this.A14;
            List list = recyclerView2.A0a;
            if (list == null) {
                list = new ArrayList();
                recyclerView2.A0a = list;
            }
            list.add(iteratingPlayer2);
            this.A03.A0k(new C35301iv(this.A0b, A01().getDimensionPixelSize(R.dimen.search_grid_padding)));
            RecyclerView recyclerView3 = this.A03;
            recyclerView3.A0k(new C35541jJ(recyclerView3, this.A15));
            this.A03.A0k(new AbstractC08920cK(this.A15, C02160Ac.A00(A00, R.color.search_large_divider_color), C02160Ac.A00(A00, R.color.list_section_divider), A01().getDimensionPixelSize(R.dimen.search_header_divider_height), A01().getDimensionPixelSize(R.dimen.search_message_divider_height)) { // from class: X.3nu
                public final int A00;
                public final int A01;
                public final int A02;
                public final int A03;
                public final Paint A04;
                public final C461925o A05;

                {
                    this.A05 = r3;
                    this.A03 = r6;
                    this.A01 = r7;
                    this.A02 = r4;
                    this.A00 = r5;
                    Paint paint = new Paint();
                    this.A04 = paint;
                    paint.setAntiAlias(true);
                    ((AbstractC04890Mh) r3).A01.registerObserver(new AbstractC15100o5() { // from class: X.3nt
                        @Override // X.AbstractC15100o5
                        public void A02(int i, int i2) {
                            int i3 = i - 1;
                            if (i3 > 0) {
                                r1.A02(i3);
                            }
                        }
                    });
                }

                @Override // X.AbstractC08920cK
                public void A00(Canvas canvas, RecyclerView recyclerView4, C0Y0 c0y0) {
                    int A03;
                    int i;
                    int dimensionPixelSize;
                    Integer valueOf;
                    int intValue;
                    int childCount = recyclerView4.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = recyclerView4.getChildAt(i2);
                        if (childAt != null && (A03 = A03(RecyclerView.A00(childAt))) != 0) {
                            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin;
                            if (A03 != 1) {
                                i = A03 != 2 ? 0 : this.A03;
                            } else {
                                i = this.A01;
                            }
                            int i3 = i + bottom;
                            int A002 = RecyclerView.A00(childAt);
                            int paddingLeft = recyclerView4.getPaddingLeft();
                            int A032 = A03(A002);
                            if (A032 != 2 && A032 != 0) {
                                Resources resources = recyclerView4.getContext().getResources();
                                C461925o c461925o = this.A05;
                                if (c461925o != null) {
                                    if (A002 != -1 && (valueOf = Integer.valueOf(c461925o.A0e.A00(A002))) != null && ((intValue = valueOf.intValue()) == 3 || intValue == 2)) {
                                        dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.contact_selector_width);
                                    } else {
                                        dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.search_item_horizontal_margin);
                                    }
                                    paddingLeft += dimensionPixelSize;
                                } else {
                                    throw null;
                                }
                            }
                            int width = recyclerView4.getWidth() - recyclerView4.getPaddingRight();
                            int i4 = this.A02;
                            if (A03 == 1) {
                                i4 = this.A00;
                            }
                            Paint paint = this.A04;
                            paint.setColor(i4);
                            canvas.drawRect(paddingLeft, bottom, width, i3, paint);
                        }
                    }
                }

                @Override // X.AbstractC08920cK
                public void A01(Rect rect, View view, RecyclerView recyclerView4, C0Y0 c0y0) {
                    int i;
                    int A03 = A03(RecyclerView.A00(view));
                    if (A03 == 0) {
                        return;
                    }
                    if (A03 != 1) {
                        i = A03 != 2 ? 0 : this.A03;
                    } else {
                        i = this.A01;
                    }
                    rect.bottom = i;
                }

                public final int A03(int i) {
                    int intValue;
                    int i2 = i + 1;
                    if (i2 > 0) {
                        C461925o c461925o = this.A05;
                        if (i2 < c461925o.A0C() && c461925o.A0I(i2)) {
                            return 2;
                        }
                    }
                    C461925o c461925o2 = this.A05;
                    if (c461925o2 != null) {
                        Integer valueOf = i != -1 ? Integer.valueOf(c461925o2.A0e.A00(i)) : null;
                        if (i > c461925o2.A0C() || i < 0 || valueOf == null || (intValue = valueOf.intValue()) == 4 || intValue == 13 || c461925o2.A0H() || c461925o2.A0J(i)) {
                            return 0;
                        }
                        return (i2 >= c461925o2.A0C() || !c461925o2.A0I(i2)) ? 1 : 0;
                    }
                    throw null;
                }
            });
            this.A03.setItemAnimator(null);
            AnonymousClass012 anonymousClass012 = this.A0X;
            C018508q c018508q = this.A09;
            InterfaceC002901k interfaceC002901k = this.A1H;
            C41181tV c41181tV = this.A0c;
            C01B c01b = this.A0B;
            C41541u6 c41541u6 = this.A0K;
            C05W c05w2 = this.A0M;
            C41521u3 c41521u3 = this.A10;
            C0ES c0es = this.A0t;
            C0CB c0cb = this.A19;
            C00B c00b = this.A0n;
            C2MZ c2mz = this.A1F;
            C0C8 c0c8 = this.A0j;
            this.A0V = new C470629j(A00, super.A0H, anonymousClass012, c018508q, interfaceC002901k, this.A0d, this.A1B, c41181tV, c01b, this.A0D, c05w2, this.A0b, c0es, this.A1A, this.A1D, c0cb, this.A0E, this.A1E, this.A0S, this.A11, this.A0a, this.A0F, this.A0T, c2mz, c0c8, new C470729k(A00, anonymousClass012, c018508q, interfaceC002901k, c41181tV, c41541u6, c05w2, c41521u3, c0es, c0cb, c00b, c2mz, c0c8, new InterfaceC52832bQ() { // from class: X.3nX
                {
                    SearchFragment.this = this;
                }

                @Override // X.InterfaceC52832bQ
                public final void A53(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
                    final SearchFragment searchFragment = SearchFragment.this;
                    View view = ((C0BA) searchFragment).A0A;
                    if (((Hilt_SearchFragment) searchFragment).A00 != null && view != null) {
                        C09250cv A002 = C09250cv.A00(view.findViewById(R.id.search_fragment), charSequence, 0);
                        A002.A06(charSequence2, onClickListener);
                        A002.A05(C02160Ac.A00(((Hilt_SearchFragment) searchFragment).A00, R.color.bulkArchiveSnackbarButton));
                        C09270cx c09270cx = new C09270cx() { // from class: X.3wj
                            @Override // X.AbstractC09280cy
                            public void A00(Object obj, int i) {
                                searchFragment.A04 = null;
                            }
                        };
                        List list2 = ((AbstractC09260cw) A002).A01;
                        if (list2 == null) {
                            list2 = new ArrayList();
                            ((AbstractC09260cw) A002).A01 = list2;
                        }
                        list2.add(c09270cx);
                        searchFragment.A04 = A002;
                        A002.A04();
                    }
                }
            }), 1);
            this.A03.setOnCreateContextMenuListener(this);
            BidiToolbar bidiToolbar = (BidiToolbar) this.A02.findViewById(R.id.toolbar);
            this.A06 = bidiToolbar;
            bidiToolbar.setNavigationIcon(new C0We(this.A0b, C02180Ae.A0O(A00, R.drawable.ic_back, R.color.searchNavigateBackTint)));
            this.A06.setNavigationContentDescription(R.string.close);
            this.A06.setNavigationOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(this, 3));
            this.A06.setContentInsetStartWithNavigation(A01().getDimensionPixelSize(R.dimen.search_input_offset));
            final TokenizedSearchInput tokenizedSearchInput = (TokenizedSearchInput) this.A06.findViewById(R.id.search_input_layout);
            this.A18 = tokenizedSearchInput;
            InterfaceC02360Aw A0D = A0D();
            tokenizedSearchInput.A0C = this.A16;
            tokenizedSearchInput.A06 = A0D;
            Chip chip = tokenizedSearchInput.A0N;
            chip.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(tokenizedSearchInput, 5));
            Chip chip2 = tokenizedSearchInput.A0M;
            chip2.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(tokenizedSearchInput, 7));
            C0AT.A0c(chip, tokenizedSearchInput.A05);
            C0AT.A0c(chip2, tokenizedSearchInput.A05);
            tokenizedSearchInput.A0C.A05.A05(A0D, new InterfaceC05620Pl() { // from class: X.3nk
                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    TokenizedSearchInput tokenizedSearchInput2 = tokenizedSearchInput;
                    Integer num = (Integer) obj;
                    if (tokenizedSearchInput2.A0C != null && !AnonymousClass024.A0l(tokenizedSearchInput2.A0E, num)) {
                        tokenizedSearchInput2.A0E = num;
                        tokenizedSearchInput2.A05();
                        tokenizedSearchInput2.A03();
                    }
                }
            });
            tokenizedSearchInput.A0C.A04.A05(A0D, new InterfaceC05620Pl() { // from class: X.3no
                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    TokenizedSearchInput tokenizedSearchInput2 = tokenizedSearchInput;
                    UserJid userJid = (UserJid) obj;
                    if (tokenizedSearchInput2.A0C != null && tokenizedSearchInput2.A0B != userJid) {
                        tokenizedSearchInput2.A0B = userJid;
                        if (userJid != null) {
                            tokenizedSearchInput2.A0M.setText(tokenizedSearchInput2.A08.A08(tokenizedSearchInput2.A07.A0A(userJid), false));
                        }
                        tokenizedSearchInput2.A04();
                        tokenizedSearchInput2.A03();
                    }
                }
            });
            tokenizedSearchInput.A0C.A0C.A05(A0D, new InterfaceC05620Pl() { // from class: X.3nj
                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    TokenizedSearchInput tokenizedSearchInput2 = tokenizedSearchInput;
                    String str = (String) obj;
                    if (!AnonymousClass024.A0l(tokenizedSearchInput2.A0H, str)) {
                        if (tokenizedSearchInput2.A00 != 0 && !TextUtils.isEmpty(str)) {
                            TokenizedSearchInput.setFocus(tokenizedSearchInput2, 0);
                        }
                        tokenizedSearchInput2.A0H = str;
                    }
                }
            });
            tokenizedSearchInput.A0C.A0G.A05(A0D, new InterfaceC05620Pl() { // from class: X.3nn
                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    TokenizedSearchInput tokenizedSearchInput2 = tokenizedSearchInput;
                    Boolean bool = (Boolean) obj;
                    if (bool != null) {
                        if (bool.booleanValue()) {
                            TokenizedSearchInput.setFocus(tokenizedSearchInput2, 0);
                            FinalBackspaceAwareEntry finalBackspaceAwareEntry = tokenizedSearchInput2.A0Q;
                            finalBackspaceAwareEntry.requestFocus();
                            finalBackspaceAwareEntry.A02(false);
                            return;
                        }
                        TokenizedSearchInput.setFocus(tokenizedSearchInput2, 3);
                        tokenizedSearchInput2.A0Q.clearFocus();
                        tokenizedSearchInput2.A0L.requestFocus();
                        InputMethodManager A0I = tokenizedSearchInput2.A09.A0I();
                        if (A0I == null) {
                            return;
                        }
                        A0I.hideSoftInputFromWindow(tokenizedSearchInput2.getWindowToken(), 2);
                    }
                }
            });
            final FinalBackspaceAwareEntry finalBackspaceAwareEntry = tokenizedSearchInput.A0Q;
            finalBackspaceAwareEntry.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(tokenizedSearchInput, 4));
            if (tokenizedSearchInput.A0A.A0M()) {
                finalBackspaceAwareEntry.setSingleLine(true);
            }
            finalBackspaceAwareEntry.setFilters(new InputFilter[]{new InputFilter.LengthFilter(1024)});
            C80793nr c80793nr = tokenizedSearchInput.A0D;
            List list2 = finalBackspaceAwareEntry.A01;
            if (list2 == null) {
                list2 = new ArrayList();
                finalBackspaceAwareEntry.A01 = list2;
            }
            list2.add(c80793nr);
            InterfaceC05620Pl interfaceC05620Pl = new InterfaceC05620Pl() { // from class: X.3s3
                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    finalBackspaceAwareEntry.A08((String) obj);
                }
            };
            TokenizedSearchInput tokenizedSearchInput2 = c80793nr.A00;
            SearchViewModel searchViewModel3 = tokenizedSearchInput2.A0C;
            if (searchViewModel3 != null) {
                searchViewModel3.A0C.A05(tokenizedSearchInput2.A06, interfaceC05620Pl);
            }
            finalBackspaceAwareEntry.setOnFocusChangeListener(tokenizedSearchInput.A0K);
            finalBackspaceAwareEntry.setInputEnterAction(3);
            finalBackspaceAwareEntry.setOnEditorActionListener(tokenizedSearchInput.A04);
            finalBackspaceAwareEntry.setOnKeyListener(tokenizedSearchInput.A03);
            if (!tokenizedSearchInput.A0J) {
                LayoutTransition layoutTransition = new LayoutTransition();
                layoutTransition.setAnimator(2, null);
                layoutTransition.setDuration(100L);
                ((ViewGroup) C0AT.A0D(tokenizedSearchInput, R.id.input_layout)).setLayoutTransition(layoutTransition);
            }
            tokenizedSearchInput.A0P.setOnClickListener(tokenizedSearchInput.A02);
            tokenizedSearchInput.A0E = Integer.valueOf(tokenizedSearchInput.A0C.A03());
            tokenizedSearchInput.A0B = tokenizedSearchInput.A0C.A06();
            tokenizedSearchInput.A0H = tokenizedSearchInput.A0C.A09();
            tokenizedSearchInput.A05();
            UserJid userJid = tokenizedSearchInput.A0B;
            if (userJid != null) {
                chip2.setText(tokenizedSearchInput.A08.A08(tokenizedSearchInput.A07.A0A(userJid), false));
            }
            tokenizedSearchInput.A04();
            tokenizedSearchInput.A03();
            if (tokenizedSearchInput.A0C != null) {
                tokenizedSearchInput.A01();
                tokenizedSearchInput.A0O.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I0_4(tokenizedSearchInput, 6));
                tokenizedSearchInput.A0C.A09.A05(tokenizedSearchInput.A06, new InterfaceC05620Pl() { // from class: X.3nm
                    /* JADX WARN: Code restructure failed: missing block: B:14:0x000b, code lost:
                        if (r4.booleanValue() == false) goto L8;
                     */
                    @Override // X.InterfaceC05620Pl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void AIK(java.lang.Object r4) {
                        /*
                            r3 = this;
                            com.whatsapp.search.views.TokenizedSearchInput r2 = r1
                            java.lang.Boolean r4 = (java.lang.Boolean) r4
                            if (r4 == 0) goto Ld
                            boolean r1 = r4.booleanValue()
                            r0 = 1
                            if (r1 != 0) goto Le
                        Ld:
                            r0 = 0
                        Le:
                            r2.A0I = r0
                            r2.A01()
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C80743nm.AIK(java.lang.Object):void");
                    }
                });
                tokenizedSearchInput.A0C.A08.A05(tokenizedSearchInput.A06, new InterfaceC05620Pl() { // from class: X.3nl
                    @Override // X.InterfaceC05620Pl
                    public final void AIK(Object obj) {
                        TokenizedSearchInput tokenizedSearchInput3 = tokenizedSearchInput;
                        Boolean bool = (Boolean) obj;
                        int i = 0;
                        if (bool != null && bool.booleanValue()) {
                            i = 1;
                        }
                        tokenizedSearchInput3.A01 = i;
                        tokenizedSearchInput3.A01();
                    }
                });
                this.A17 = (ProgressView) C0AT.A0D(this.A02, R.id.progress);
                this.A03.A0m(this.A1M);
                A0z();
                return this.A02;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.C0BA
    public void A0q() {
        StringBuilder sb = new StringBuilder("SearchFragment/onDestroy ");
        sb.append(this);
        Log.i(sb.toString());
        if (super.A0g) {
            this.A0h.A04(null, SearchFragment.class.getName());
        }
        this.A0N.A00(this.A1P);
        this.A0J.A00(this.A1O);
        this.A0f.A01(this.A1Q);
        this.A0G.A00(this.A1N);
        this.A0u.A00(this.A1R);
        super.A0U = true;
    }

    @Override // X.C0BA
    public void A0r() {
        StringBuilder sb = new StringBuilder("SearchFragment/onDestroyView ");
        sb.append(this);
        Log.i(sb.toString());
        Runnable runnable = this.A1K;
        if (runnable != null) {
            this.A1H.ART(runnable);
        }
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.A0U.A05();
        TokenizedSearchInput tokenizedSearchInput = this.A18;
        FinalBackspaceAwareEntry finalBackspaceAwareEntry = tokenizedSearchInput.A0Q;
        C80793nr c80793nr = tokenizedSearchInput.A0D;
        List list = finalBackspaceAwareEntry.A01;
        if (list != null) {
            list.remove(c80793nr);
        }
        FinalBackspaceAwareEntry finalBackspaceAwareEntry2 = tokenizedSearchInput.A0Q;
        finalBackspaceAwareEntry2.setOnFocusChangeListener(null);
        finalBackspaceAwareEntry2.setOnEditorActionListener(null);
        finalBackspaceAwareEntry2.setOnKeyListener(null);
        RecyclerView recyclerView = this.A03;
        IteratingPlayer iteratingPlayer = this.A14;
        List list2 = recyclerView.A0a;
        if (list2 != null) {
            list2.remove(iteratingPlayer);
        }
        this.A03.A0n(this.A1M);
        C02520Bt c02520Bt = super.A0K;
        c02520Bt.A01.A01(this.A14);
        this.A0Q.A00();
        this.A1I.A07();
        this.A02 = null;
        super.A0U = true;
    }

    @Override // X.C0BA
    public void A0s() {
        StringBuilder sb = new StringBuilder("SearchFragment/onResume ");
        sb.append(this);
        Log.i(sb.toString());
        super.A0U = true;
    }

    @Override // X.C0BA
    public void A0t() {
        StringBuilder sb = new StringBuilder("SearchFragment/onStop ");
        sb.append(this);
        Log.i(sb.toString());
        super.A0U = true;
    }

    @Override // com.whatsapp.search.Hilt_SearchFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        this.A1D = new C52762bH(this.A0s, this.A0B, this.A0W, this.A0Z);
        this.A0Q = this.A0R.A04(context.getApplicationContext());
    }

    @Override // X.C0BA
    public void A0v(Bundle bundle) {
        StringBuilder sb = new StringBuilder("SearchFragment/onCreate ");
        sb.append(this);
        Log.i(sb.toString());
        super.A0v(bundle);
        this.A1L = bundle != null;
        InterfaceC05790Qg interfaceC05790Qg = (InterfaceC05790Qg) A09();
        if (interfaceC05790Qg == null || interfaceC05790Qg.isFinishing()) {
            return;
        }
        C0GV c0gv = this.A0i;
        if (bundle != null) {
            c0gv.A00 = bundle.getLong("ephemeral_session_start", -1L);
        }
        this.A0h.A03(null, SearchFragment.class.getName());
        SearchViewModel ACz = interfaceC05790Qg.ACz(this.A0Q);
        this.A16 = ACz;
        ACz.A0D.A05(this, new InterfaceC05620Pl() { // from class: X.3n9
            {
                SearchFragment.this = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:53:0x0058  */
            @Override // X.InterfaceC05620Pl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void AIK(java.lang.Object r11) {
                /*
                    r10 = this;
                    com.whatsapp.search.SearchFragment r4 = com.whatsapp.search.SearchFragment.this
                    X.25k r11 = (X.C461725k) r11
                    X.25o r7 = r4.A15
                    com.whatsapp.search.SearchViewModel r0 = r4.A16
                    java.lang.String r8 = r0.A09()
                    r9 = 0
                    if (r7 == 0) goto L8c
                    boolean r0 = r11.isEmpty()
                    r3 = 1
                    r2 = 0
                    if (r0 != 0) goto L63
                    androidx.recyclerview.widget.RecyclerView r1 = r7.A00
                    if (r1 == 0) goto L88
                    r0 = -1
                    boolean r0 = r1.canScrollVertically(r0)
                    if (r0 != 0) goto L88
                    com.whatsapp.search.SearchViewModel r1 = r7.A0f
                    X.0HK r0 = r1.A0E
                    java.lang.Object r0 = r0.A01()
                    if (r0 == 0) goto L3b
                    X.0HK r0 = r1.A0E
                    java.lang.Object r0 = r0.A01()
                    java.lang.Number r0 = (java.lang.Number) r0
                    int r1 = r0.intValue()
                    r0 = 6
                    if (r1 > r0) goto L88
                L3b:
                    r6 = 1
                L3c:
                    X.25k r5 = r7.A0e
                    java.lang.String r1 = r7.A01
                    X.3na r0 = new X.3na
                    r0.<init>(r5, r11, r1, r8)
                    X.0nY r1 = X.C14820nd.A00(r0)
                    r5.clear()
                    r5.addAll(r11)
                    r7.A01 = r8
                    X.3wi r0 = r7.A0d
                    r1.A02(r0)
                    if (r6 == 0) goto L63
                    com.whatsapp.search.SearchViewModel r0 = r7.A0f
                    X.25l r1 = r0.A0Q
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                    r1.A0B(r0)
                L63:
                    X.25o r5 = r4.A15
                    if (r5 == 0) goto L8b
                    X.25k r0 = r5.A0e
                    java.util.ArrayList r4 = new java.util.ArrayList
                    r4.<init>(r0)
                L6e:
                    int r0 = r4.size()
                    if (r2 >= r0) goto L8a
                    java.lang.Object r0 = r4.get(r2)
                    X.2ak r0 = (X.AbstractC52452ak) r0
                    int r1 = r0.A00
                    if (r1 == r3) goto L82
                    r0 = 12
                    if (r1 != r0) goto L85
                L82:
                    r5.A02(r2)
                L85:
                    int r2 = r2 + 1
                    goto L6e
                L88:
                    r6 = 0
                    goto L3c
                L8a:
                    return
                L8b:
                    throw r9
                L8c:
                    throw r9
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C80353n9.AIK(java.lang.Object):void");
            }
        });
        this.A16.A07.A05(this, new InterfaceC05620Pl() { // from class: X.3n8
            {
                SearchFragment.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                C461925o c461925o = SearchFragment.this.A15;
                if (c461925o != null) {
                    ArrayList arrayList = new ArrayList(c461925o.A0e);
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (obj.equals(((AbstractC52452ak) arrayList.get(i)).A01)) {
                            c461925o.A02(i);
                            return;
                        }
                    }
                    return;
                }
                throw null;
            }
        });
        this.A16.A0A.A05(this, new InterfaceC05620Pl() { // from class: X.3nA
            {
                SearchFragment.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                Collection collection = (Collection) obj;
                C461925o c461925o = SearchFragment.this.A15;
                if (c461925o != null) {
                    ArrayList arrayList = new ArrayList(c461925o.A0e);
                    for (Object obj2 : collection) {
                        if (obj2 != null) {
                            for (int i = 0; i < arrayList.size(); i++) {
                                if (obj2.equals(((AbstractC52452ak) arrayList.get(i)).A01)) {
                                    c461925o.A02(i);
                                    return;
                                }
                            }
                            continue;
                        }
                    }
                    return;
                }
                throw null;
            }
        });
        this.A0N.A01(this.A1P);
        this.A0J.A01(this.A1O);
        this.A0f.A00(this.A1Q);
        this.A0G.A01(this.A1N);
        this.A0u.A01(this.A1R);
        this.A16.A03.A05(this, new InterfaceC05620Pl() { // from class: X.3nV
            {
                SearchFragment.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                ActivityC02330At A09;
                SearchFragment searchFragment = SearchFragment.this;
                Number number = (Number) obj;
                if (number != null && (A09 = searchFragment.A09()) != null && !A09.isFinishing()) {
                    int intValue = number.intValue();
                    if (intValue != 0) {
                        if (intValue == 1 || intValue == 2 || intValue == 3 || intValue == 4) {
                            searchFragment.A02.setVisibility(0);
                            return;
                        } else if (intValue != 5) {
                            return;
                        }
                    }
                    searchFragment.A02.setVisibility(4);
                }
            }
        });
        this.A16.A0B.A05(this, new InterfaceC05620Pl() { // from class: X.3nW
            {
                SearchFragment.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                ProgressView progressView = SearchFragment.this.A17;
                if (progressView != null) {
                    if (Boolean.TRUE.equals(obj)) {
                        progressView.A00(true);
                    } else {
                        progressView.A00(false);
                    }
                }
            }
        });
        this.A16.A0T.A05(this, new InterfaceC05620Pl() { // from class: X.3mw
            {
                SearchFragment.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                SearchFragment searchFragment = SearchFragment.this;
                searchFragment.A0U.A05();
                ((WaFragment) searchFragment).A00.A01(searchFragment, Conversation.A04(searchFragment.A00(), (AnonymousClass092) obj, searchFragment.A16.A09()));
            }
        });
        this.A16.A0R.A05(this, new InterfaceC05620Pl() { // from class: X.3nS
            {
                SearchFragment.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                View view;
                C02820Cz c02820Cz;
                Object obj2;
                SearchFragment searchFragment = SearchFragment.this;
                AnonymousClass097 anonymousClass097 = (AnonymousClass097) obj;
                AbstractC02800Cx A0N = searchFragment.A0A().A0N();
                int A05 = searchFragment.A16.A05(anonymousClass097);
                if (A05 == -2) {
                    searchFragment.A09.A07(R.string.gallery_media_not_exist, 0);
                    return;
                }
                C0TS A0C = searchFragment.A03.A0C(A05);
                if (A0C != null) {
                    view = A0C.A0H.findViewById(R.id.thumb_view);
                } else {
                    view = null;
                }
                searchFragment.A16.A0G(4);
                ActivityC02330At A0A = searchFragment.A0A();
                C1M7 c1m7 = new C1M7(searchFragment.A0A());
                RunnableEBaseShape6S0100000_I0_6 runnableEBaseShape6S0100000_I0_6 = new RunnableEBaseShape6S0100000_I0_6(searchFragment, 9);
                MediaViewFragment A01 = MediaViewFragment.A01(anonymousClass097.A0n, null, false, false, 5, SystemClock.uptimeMillis(), C2HC.A03(A0A, view), 1, false, 2);
                boolean z = C2HC.A00;
                if (z) {
                    A01.A06().A0C = true;
                }
                ((MediaViewBaseFragment) A01).A0D = runnableEBaseShape6S0100000_I0_6;
                ActivityC02320As activityC02320As = (ActivityC02320As) A0A;
                String A08 = C2JE.A08(anonymousClass097);
                if (z && view != null) {
                    ArrayList A00 = C2HB.A00(view, activityC02320As, c1m7, A08);
                    if (A0N != null) {
                        c02820Cz = new C02820Cz(A0N);
                        Iterator it = A00.iterator();
                        while (it.hasNext()) {
                            C0FK c0fk = (C0FK) it.next();
                            Object obj3 = c0fk.A00;
                            if (obj3 != null && (obj2 = c0fk.A01) != null) {
                                View view2 = (View) obj3;
                                String str = (String) obj2;
                                if (C09370d9.A00 != null || C09370d9.A01 != null) {
                                    String A0G = C0AT.A0G(view2);
                                    if (A0G != null) {
                                        if (c02820Cz.A0B == null) {
                                            c02820Cz.A0B = new ArrayList();
                                            c02820Cz.A0C = new ArrayList();
                                        } else if (!c02820Cz.A0C.contains(str)) {
                                            if (c02820Cz.A0B.contains(A0G)) {
                                                throw new IllegalArgumentException(C000200d.A0I("A shared element with the source name '", A0G, "' has already been added to the transaction."));
                                            }
                                        } else {
                                            throw new IllegalArgumentException(C000200d.A0I("A shared element with the target name '", str, "' has already been added to the transaction."));
                                        }
                                        c02820Cz.A0B.add(A0G);
                                        c02820Cz.A0C.add(str);
                                    } else {
                                        throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
                                    }
                                }
                            }
                        }
                    } else {
                        throw null;
                    }
                } else if (A0N != null) {
                    c02820Cz = new C02820Cz(A0N);
                } else {
                    throw null;
                }
                c02820Cz.A0F = true;
                c02820Cz.A01(R.id.media_fragment_holder, A01, "media_view_fragment");
                c02820Cz.A03("media_view_fragment");
                c02820Cz.A04();
            }
        });
        this.A16.A0M.A05(this, new InterfaceC05620Pl() { // from class: X.3n7
            {
                SearchFragment.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                SearchFragment searchFragment = SearchFragment.this;
                searchFragment.A0U.A05();
                ((WaFragment) searchFragment).A00.A01(searchFragment, Conversation.A01(searchFragment.A00(), (AbstractC005302j) obj));
            }
        });
        this.A16.A0O.A05(this, new InterfaceC05620Pl() { // from class: X.3nU
            {
                SearchFragment.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                View findViewById;
                SearchFragment searchFragment = SearchFragment.this;
                AbstractC005302j abstractC005302j = (AbstractC005302j) obj;
                searchFragment.A0U.A05();
                C0TS A0C = searchFragment.A03.A0C(searchFragment.A16.A04(abstractC005302j));
                if (A0C != null && (findViewById = A0C.A0H.findViewById(R.id.contact_photo)) != null) {
                    QuickContactActivity.A00(searchFragment.A09(), findViewById, abstractC005302j, C0AT.A0G(findViewById));
                }
            }
        });
        this.A16.A0N.A05(this, new InterfaceC05620Pl() { // from class: X.3nQ
            {
                SearchFragment.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                SearchFragment searchFragment = SearchFragment.this;
                AbstractC005302j abstractC005302j = (AbstractC005302j) obj;
                searchFragment.A0r.A01 = 4;
                C0TS A0C = searchFragment.A03.A0C(searchFragment.A16.A04(abstractC005302j));
                if (A0C != null) {
                    searchFragment.A0v = abstractC005302j;
                    searchFragment.A03.showContextMenuForChild(A0C.A0H);
                }
            }
        });
        this.A16.A0Q.A05(this, new InterfaceC05620Pl() { // from class: X.3mv
            {
                SearchFragment.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                SearchFragment searchFragment = SearchFragment.this;
                if (obj != null) {
                    C018508q c018508q = searchFragment.A09;
                    c018508q.A02.post(new RunnableEBaseShape4S0200000_I0_4(searchFragment, obj, 9));
                }
            }
        });
        this.A16.A05.A05(this, new InterfaceC05620Pl() { // from class: X.3nY
            {
                SearchFragment.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                SearchFragment.this.A14(obj);
            }
        });
        this.A16.A0C.A05(this, new InterfaceC05620Pl() { // from class: X.3nT
            {
                SearchFragment.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                SearchFragment.this.A14(obj);
            }
        });
        this.A16.A04.A05(this, new InterfaceC05620Pl() { // from class: X.3nR
            {
                SearchFragment.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                SearchFragment.this.A14(obj);
            }
        });
        this.A16.A0S.A05(this, new InterfaceC05620Pl() { // from class: X.3nB
            {
                SearchFragment.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                SearchFragment.this.A13((Boolean) obj);
            }
        });
    }

    public void A0y() {
        SearchViewModel searchViewModel = this.A16;
        if (searchViewModel != null && ((Hilt_SearchFragment) this).A00 != null) {
            searchViewModel.A0G(3);
            this.A01.setVisibility(8);
            if (Build.VERSION.SDK_INT >= 21) {
                this.A06.setElevation(A01().getDimension(R.dimen.actionbar_elevation));
            } else {
                C07630Zb.A00(this.A06);
            }
        }
    }

    public final void A0z() {
        if (Build.VERSION.SDK_INT >= 23) {
            ActivityC02330At A0A = A0A();
            Window window = A0A.getWindow();
            window.setStatusBarColor(C02160Ac.A00(A0A, R.color.searchStatusBar));
            AnonymousClass029.A1B(window, !AnonymousClass029.A1K(A00()));
            window.addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            window.clearFlags(67108864);
        }
    }

    public final void A10() {
        ActivityC02330At A09;
        if (Build.VERSION.SDK_INT < 23 || (A09 = A09()) == null) {
            return;
        }
        AnonymousClass029.A1B(A09.getWindow(), false);
    }

    public final void A11() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.A03.A0S;
        if (linearLayoutManager != null) {
            SearchViewModel searchViewModel = this.A16;
            Integer valueOf = Integer.valueOf(linearLayoutManager.A1F() + 6);
            if (!valueOf.equals(searchViewModel.A0E.A01())) {
                searchViewModel.A0E.A0A(valueOf);
            }
            SearchViewModel searchViewModel2 = this.A16;
            Integer valueOf2 = Integer.valueOf(linearLayoutManager.A1H());
            if (valueOf2.equals(searchViewModel2.A0F.A01())) {
                return;
            }
            searchViewModel2.A0F.A0A(valueOf2);
        }
    }

    public final void A12(int i, int i2, int i3, int i4, boolean z, final Runnable runnable) {
        int i5;
        float f;
        Bundle bundle = super.A06;
        if (bundle == null) {
            return;
        }
        if (z) {
            i5 = bundle.getInt("enter_duration_ms", 500);
        } else {
            i5 = bundle.getInt("exit_duration_ms", 250);
        }
        C015307e c015307e = new C015307e();
        float f2 = 0.0f;
        if (Build.VERSION.SDK_INT >= 21) {
            if (this.A02 != null) {
                int i6 = bundle.getInt("x", 0);
                int i7 = bundle.getInt("y", 0);
                float hypot = (float) Math.hypot(i3 - i, i4 - i2);
                float f3 = hypot;
                if (z) {
                    f3 = 0.0f;
                    f2 = hypot;
                }
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.A02, i6, i7, f3, f2);
                createCircularReveal.setDuration(i5);
                createCircularReveal.setInterpolator(c015307e);
                if (runnable != null) {
                    createCircularReveal.addListener(new AnimatorListenerAdapter() { // from class: X.3Vf
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            runnable.run();
                            super.onAnimationEnd(animator);
                        }
                    });
                }
                createCircularReveal.start();
                return;
            }
            return;
        }
        ViewGroup viewGroup = this.A02;
        if (viewGroup == null) {
            return;
        }
        float f4 = -viewGroup.getHeight();
        if (z) {
            f = 0.0f;
        } else {
            f = f4;
            f4 = 0.0f;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, f4, f);
        translateAnimation.setInterpolator(c015307e);
        translateAnimation.setDuration(i5);
        if (runnable != null) {
            translateAnimation.setAnimationListener(new C0DJ() { // from class: X.3nh
                @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    runnable.run();
                }
            });
        }
        this.A02.startAnimation(translateAnimation);
    }

    public void A13(Boolean bool) {
        View view;
        if (bool == null || !bool.booleanValue() || (view = super.A0A) == null || !(view.getParent() instanceof FrameLayout)) {
            return;
        }
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.A00 = null;
        }
        SearchViewModel searchViewModel = this.A16;
        if (searchViewModel != null) {
            searchViewModel.A0G(2);
        }
        ((View) super.A0A.getParent()).setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.A01.setVisibility(0);
        if (Build.VERSION.SDK_INT >= 21) {
            this.A06.setElevation(0.0f);
        } else {
            this.A06.setBackgroundResource(0);
            this.A06.setBackgroundColor(C02160Ac.A00(((Hilt_SearchFragment) this).A00, R.color.neutral_primary));
        }
        this.A02.forceLayout();
    }

    public final void A14(Object obj) {
        View view;
        View view2;
        ValueAnimator valueAnimator;
        this.A0U.A05();
        if (obj == null || AnonymousClass024.A0l(obj, 0) || AnonymousClass024.A0l(obj, "")) {
            return;
        }
        Integer num = 2;
        if (!num.equals(this.A16.A03.A01()) || (view = super.A0A) == null || (view2 = (View) view.getParent()) == null) {
            return;
        }
        RunnableEBaseShape6S0100000_I0_6 runnableEBaseShape6S0100000_I0_6 = new RunnableEBaseShape6S0100000_I0_6(this, 7);
        View view3 = (View) view2.getParent();
        if (view3 != null) {
            valueAnimator = C40731sm.A06(view2, view3.getHeight(), new RunnableEBaseShape0S0201000_I0(view2, -1, runnableEBaseShape6S0100000_I0_6, 5));
        } else {
            valueAnimator = null;
        }
        this.A00 = valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    @Override // X.C0BA, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.A0U = true;
        A0z();
    }

    @Override // X.C0BA, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        A0A().onCreateContextMenu(contextMenu, view, contextMenuInfo);
        this.A0V.A00(contextMenu, this.A0v, true, true);
    }
}
