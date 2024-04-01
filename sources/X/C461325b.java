package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.StickerStoreActivity;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I0_3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.25b */
/* loaded from: classes2.dex */
public class C461325b extends AbstractC461425c {
    public int A00;
    public int A01;
    public int A02;
    public C85693w4 A03;
    public InterfaceC53342en A04;
    public C86493xd A05;
    public C86503xe A06;
    public C86503xe A07;
    public C86503xe A08;
    public C86503xe A09;
    public C25d A0A;
    public C2IX A0B;
    public AbstractC461525e A0C;
    public String A0D;
    public HashMap A0E;
    public List A0F;
    public List A0G;
    public boolean A0H;
    public final int A0I;
    public final LayoutInflater A0J;
    public final View A0K;
    public final ViewTreeObserver.OnGlobalLayoutListener A0L;
    public final C000500h A0M;
    public final C003701t A0N;
    public final AnonymousClass011 A0O;
    public final C78833kb A0P;
    public final C2AM A0Q;
    public final C43791xz A0R;
    public final C2Bk A0S;
    public final C3Y7 A0T;
    public final C2AS A0U;
    public final InterfaceC53342en A0V;
    public final C49712Mb A0W;
    public final C82883rE A0X;
    public final C82963rM A0Y;
    public final C461225a A0Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C461325b(C003701t c003701t, Activity activity, InterfaceC002901k interfaceC002901k, AnonymousClass011 anonymousClass011, C2AM c2am, C002301c c002301c, C2Bk c2Bk, C2AS c2as, C000500h c000500h, ViewGroup viewGroup, C78833kb c78833kb, C43791xz c43791xz, AbstractC15200oF abstractC15200oF, C461225a c461225a, C82883rE c82883rE, C49712Mb c49712Mb) {
        super(activity, c002301c, viewGroup, R.id.sticker_pager, abstractC15200oF);
        C461225a c461225a2 = c461225a;
        this.A0H = false;
        this.A0V = new InterfaceC53342en() { // from class: X.3rK
            {
                C461325b.this = this;
            }

            @Override // X.InterfaceC53342en
            public void AP7(C0JM c0jm, Integer num) {
                C461325b c461325b = C461325b.this;
                C2AM c2am2 = c461325b.A0Q;
                c2am2.A09.execute(new RunnableEBaseShape0S0210000_I0(c2am2, c0jm, false, 12));
                InterfaceC53342en interfaceC53342en = c461325b.A04;
                if (interfaceC53342en != null) {
                    interfaceC53342en.AP7(c0jm, num);
                }
            }
        };
        this.A0L = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.3YK
            {
                C461325b.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                C461325b c461325b = C461325b.this;
                ViewPager viewPager = ((AbstractC461425c) c461325b).A0A;
                int height = viewPager.getHeight();
                int width = viewPager.getWidth();
                if (height != 0 && width != 0 && (c461325b.A01 != width || c461325b.A00 != height)) {
                    c461325b.A01 = width;
                    c461325b.A00 = height;
                    for (AbstractC461525e abstractC461525e : c461325b.A0G) {
                        if (abstractC461525e != null) {
                            abstractC461525e.A02(c461325b.A01, c461325b.A00);
                        }
                    }
                }
                int width2 = ((View) viewPager.getParent()).getWidth();
                if (width2 != c461325b.A02) {
                    c461325b.A02 = width2;
                    C82963rM c82963rM = c461325b.A0Y;
                    if (c82963rM != null) {
                        int dimensionPixelSize = c82963rM.A08.getContext().getResources().getDimensionPixelSize(R.dimen.sticker_picker_header_item);
                        boolean A0M = c82963rM.A0B.A0M();
                        RecyclerView recyclerView = c82963rM.A0A;
                        int i = ((width2 / 9) - dimensionPixelSize) >> 1;
                        if (A0M) {
                            recyclerView.setPadding(i, 0, 0, 0);
                        } else {
                            recyclerView.setPadding(0, 0, i, 0);
                        }
                    }
                }
            }
        };
        this.A0N = c003701t;
        this.A0O = anonymousClass011;
        this.A0S = c2Bk;
        this.A0U = c2as;
        this.A0M = c000500h;
        this.A0R = c43791xz;
        this.A0P = c78833kb;
        this.A0Q = c2am;
        this.A0J = LayoutInflater.from(activity);
        this.A0T = new C3Y7();
        this.A0Z = c461225a == null ? new C461225a(c2as, interfaceC002901k, c2am, c2Bk, c000500h) : c461225a2;
        this.A0X = c82883rE;
        this.A0W = c49712Mb;
        View findViewById = viewGroup.findViewById(R.id.sticker_store_button);
        this.A0I = super.A0A.getContext().getResources().getDimensionPixelSize(R.dimen.sticker_picker_item);
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.sticker_picker_header_height);
        this.A01 = viewGroup.getWidth();
        this.A00 = viewGroup.getHeight() - dimensionPixelSize;
        this.A0G = new ArrayList();
        this.A0E = new HashMap();
        C85693w4 c85693w4 = new C85693w4(c002301c, new AbstractC461525e[0]);
        this.A03 = c85693w4;
        A03(c85693w4);
        this.A0Y = new C82963rM(super.A07, c002301c, viewGroup);
        if (c82883rE != null) {
            c82883rE.A02.A05((InterfaceC02360Aw) activity, new InterfaceC05620Pl() { // from class: X.3rG
                {
                    C461325b.this = this;
                }

                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    C461325b c461325b = C461325b.this;
                    if (!c461325b.A0G.isEmpty() && c461325b.A0H) {
                        AbstractC461525e A00 = C461325b.A00(c461325b.A0G, "contextual_suggestion");
                        if (!c461325b.A07()) {
                            if (A00 == null) {
                                return;
                            }
                            c461325b.A0G.remove(A00);
                            c461325b.A05();
                            c461325b.A01(c461325b.A00());
                        } else if (A00 != null) {
                            if (A00.A04 != null) {
                                A00.A01();
                            }
                        } else {
                            C86493xd c86493xd = c461325b.A05;
                            if (c86493xd != null) {
                                if (c86493xd.A04 != null) {
                                    c86493xd.A01();
                                }
                            } else {
                                c461325b.A05 = new C86493xd(c461325b.A0N, ((AbstractC461425c) c461325b).A07, c461325b.A0J, c461325b.A0R, c461325b.A0V, c461325b.A0X, c461325b.A0I);
                            }
                            c461325b.A0G.add(0, c461325b.A05);
                            c461325b.A05();
                            c461325b.A02(c461325b.A0G.indexOf(c461325b.A05), true);
                        }
                    }
                }
            });
        }
        findViewById.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_3(this, 0));
        this.A0K = viewGroup.findViewById(R.id.sticker_store_badge);
        C82963rM c82963rM = this.A0Y;
        InterfaceC70493Sm interfaceC70493Sm = super.A04;
        if (interfaceC70493Sm != null) {
            interfaceC70493Sm.ASt(null);
        }
        super.A04 = c82963rM;
        c82963rM.A04 = this;
        c82963rM.AMi(A00());
    }

    public static final AbstractC461525e A00(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC461525e abstractC461525e = (AbstractC461525e) it.next();
            if (str.equals(abstractC461525e.getId())) {
                return abstractC461525e;
            }
        }
        return null;
    }

    public void A04() {
        if (this.A0K.getVisibility() == 0) {
            C000500h c000500h = this.A0M;
            long j = c000500h.A00.getLong("sticker_store_update_hidden_time", 0L);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - j >= 604800000) {
                C000200d.A0h(c000500h, "sticker_store_update_hidden_time", currentTimeMillis);
            }
        }
        C2Bk c2Bk = this.A0S;
        if (c2Bk != null) {
            C000700j.A01();
            Iterator it = ((AnonymousClass009) c2Bk).A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((C25R) c0g5.next()).A00();
                } else {
                    Context context = super.A07;
                    context.startActivity(new Intent(context, StickerStoreActivity.class));
                    return;
                }
            }
        } else {
            throw null;
        }
    }

    public final void A05() {
        AbstractC461525e[] abstractC461525eArr = (AbstractC461525e[]) this.A0G.toArray(new AbstractC461525e[0]);
        this.A0Y.A00(abstractC461525eArr);
        C85693w4 c85693w4 = this.A03;
        if (c85693w4 != null) {
            c85693w4.A0K(abstractC461525eArr);
            c85693w4.A04();
            this.A03.A04();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:389:0x0437, code lost:
        if (r27.A0Z.A05 != false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0447, code lost:
        if (r27.A0Z.A06 != false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x04b7, code lost:
        if (r32 != null) goto L188;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:406:0x047c A[LOOP:10: B:404:0x0476->B:406:0x047c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:424:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x04d8  */
    /* JADX WARN: Type inference failed for: r30v0, types: [java.util.AbstractMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r31v0, types: [java.util.AbstractMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r9v4, types: [X.25e, X.2CF] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [X.2CF] */
    /* JADX WARN: Type inference failed for: r9v7, types: [X.3yl] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A06(java.util.List r28, java.util.HashSet r29, java.util.HashMap r30, java.util.HashMap r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 1247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C461325b.A06(java.util.List, java.util.HashSet, java.util.HashMap, java.util.HashMap, java.lang.String):void");
    }

    public final boolean A07() {
        C82883rE c82883rE;
        C49712Mb c49712Mb = this.A0W;
        if (c49712Mb != null && c49712Mb.A00 && (c82883rE = this.A0X) != null) {
            C0HK c0hk = c82883rE.A02;
            if (c0hk.A01() != null && !((List) c0hk.A01()).isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
