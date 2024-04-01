package X;

import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

/* renamed from: X.3yg */
/* loaded from: classes2.dex */
public class C86883yg extends AbstractC86423xS {
    public C82373qP A00;
    public boolean A01;
    public final C018508q A02;
    public final C03320Ff A03;
    public final C05W A04;
    public final AnonymousClass008 A05;
    public final C018708s A06;
    public final C0L5 A07;
    public final AnonymousClass012 A08;
    public final C000500h A09;
    public final C002301c A0A;
    public final C00T A0B;
    public final C00A A0C;
    public final C03360Fk A0D;

    public C86883yg(AnonymousClass012 anonymousClass012, C003701t c003701t, C42461vm c42461vm, C018508q c018508q, C03010Du c03010Du, InterfaceC002901k interfaceC002901k, C0EB c0eb, C018608r c018608r, C018308n c018308n, C0L5 c0l5, C41471ty c41471ty, C05W c05w, C42761wH c42761wH, C018708s c018708s, C002301c c002301c, C42441vk c42441vk, AnonymousClass008 anonymousClass008, C0C9 c0c9, C00A c00a, C0CB c0cb, C03320Ff c03320Ff, C000500h c000500h, C2MV c2mv, C2EQ c2eq, C53132bw c53132bw, C41771uU c41771uU, C03360Fk c03360Fk, C53362fl c53362fl, AnonymousClass092 anonymousClass092, AbstractC53832ha abstractC53832ha) {
        super(c003701t, c42461vm, c018508q, c03010Du, interfaceC002901k, c0eb, c018608r, c018308n, c41471ty, c42761wH, c002301c, c42441vk, c0c9, c0cb, c2mv, c2eq, c53132bw, c41771uU, c53362fl, anonymousClass092, abstractC53832ha);
        this.A0B = new C82363qO(this);
        this.A08 = anonymousClass012;
        this.A02 = c018508q;
        this.A07 = c0l5;
        this.A04 = c05w;
        this.A06 = c018708s;
        this.A0A = c002301c;
        this.A05 = anonymousClass008;
        this.A0C = c00a;
        this.A03 = c03320Ff;
        this.A09 = c000500h;
        this.A0D = c03360Fk;
    }

    @Override // X.AbstractC53812hY, X.AbstractC53822hZ
    public View A00(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A00 = super.A00(layoutInflater, viewGroup);
        C82383qQ A0R = A0R();
        A0R.A0A.removeAllViews();
        layoutInflater.inflate(R.layout.status_playback_page_info_outgoing, A0R.A0A, true);
        A0R.A05 = new C53852hc(this.A08, this.A02, this.A07, this.A04, this.A06, this.A0A, this.A05, this.A03, this.A09, this.A0D, A0R.A08);
        A0R.A03 = (ImageView) A00.findViewById(R.id.status_playback_views_icon);
        A0R.A04 = (TextView) A00.findViewById(R.id.read_receipt_counter);
        A0R.A00 = A00.findViewById(R.id.delete);
        A0R.A01 = A00.findViewById(R.id.forward);
        A0R.A02 = A0R.A08.findViewById(R.id.list_container);
        return A00;
    }

    @Override // X.AbstractC53812hY, X.AbstractC53822hZ
    public void A02() {
        super.A02();
        C53852hc c53852hc = A0R().A05;
        c53852hc.A0A.A00();
        c53852hc.A08.A00(c53852hc.A07);
        c53852hc.A05.A00(c53852hc.A04);
        c53852hc.A0E.A00(c53852hc.A0D);
        C018508q c018508q = c53852hc.A03;
        c018508q.A02.removeCallbacks(c53852hc.A0G);
        c53852hc.A00 = true;
        C82373qP c82373qP = this.A00;
        if (c82373qP != null) {
            c82373qP.A05(true);
            this.A00 = null;
        }
        this.A0C.A00(this.A0B);
    }

    @Override // X.AbstractC53812hY, X.AbstractC53822hZ
    public void A08(Rect rect) {
        View view = A0R().A02;
        if (view != null) {
            view.setPadding(rect.left, 0, rect.right, rect.bottom);
        }
        super.A08(rect);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
        if (X.C0DB.A0q((X.C09B) r1) == false) goto L12;
     */
    @Override // X.AbstractC53812hY, X.AbstractC53822hZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A09(android.view.View r7) {
        /*
            r6 = this;
            super.A09(r7)
            X.3qQ r4 = r6.A0R()
            android.view.ViewGroup r5 = r4.A08
            int r2 = r5.getPaddingLeft()
            android.view.ViewGroup r0 = r4.A08
            int r1 = r0.getPaddingTop()
            android.view.ViewGroup r0 = r4.A08
            int r0 = r0.getPaddingRight()
            r3 = 0
            r5.setPadding(r2, r1, r0, r3)
            android.view.View r2 = r4.A06
            r1 = 17
            com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1 r0 = new com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1
            r0.<init>(r6, r1)
            r2.setOnClickListener(r0)
            android.view.ViewGroup r2 = r4.A0A
            r1 = 23
            com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1 r0 = new com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1
            r0.<init>(r6, r1)
            r2.setOnClickListener(r0)
            android.view.View r2 = r4.A00
            r1 = 24
            com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1 r0 = new com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1
            r0.<init>(r6, r1)
            r2.setOnClickListener(r0)
            android.view.View r2 = r4.A01
            r1 = 25
            com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1 r0 = new com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1
            r0.<init>(r6, r1)
            r2.setOnClickListener(r0)
            r6.A0S()
            X.092 r1 = r6.A04
            boolean r0 = r1 instanceof X.C0JP
            if (r0 == 0) goto L5f
            X.09B r1 = (X.C09B) r1
            boolean r1 = X.C0DB.A0q(r1)
            r0 = 1
            if (r1 != 0) goto L60
        L5f:
            r0 = 0
        L60:
            r6.A01 = r0
            if (r0 == 0) goto L72
            r6.A0P(r3)
            r6.A0J()
        L6a:
            X.00A r1 = r6.A0C
            X.00T r0 = r6.A0B
            r1.A01(r0)
            return
        L72:
            r6.A0Q()
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86883yg.A09(android.view.View):void");
    }

    @Override // X.AbstractC86423xS, X.AbstractC53812hY
    public void A0J() {
        if (this.A01) {
            super.A0J();
        }
    }

    @Override // X.AbstractC53812hY
    public void A0K(int i) {
        super.A0K(i);
        if (i == 3) {
            A0R().A05.A02.sendAccessibilityEvent(8);
        }
    }

    public C82383qQ A0R() {
        AbstractC71693Xc abstractC71693Xc = ((AbstractC53812hY) this).A01;
        if (abstractC71693Xc == null) {
            abstractC71693Xc = new C82383qQ();
            ((AbstractC53812hY) this).A01 = abstractC71693Xc;
        }
        return (C82383qQ) abstractC71693Xc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.3qP, X.0HS] */
    public final void A0S() {
        C82373qP c82373qP = this.A00;
        if (c82373qP != null) {
            c82373qP.A05(true);
        }
        ?? r2 = new C0HS(this) { // from class: X.3qP
            public final WeakReference A00;

            {
                this.A00 = new WeakReference(this);
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                AbstractC86423xS abstractC86423xS = (AbstractC86423xS) this.A00.get();
                if (abstractC86423xS == null) {
                    return null;
                }
                C42801wL A02 = abstractC86423xS.A0C.A02(abstractC86423xS.A04);
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : A02.A00.entrySet()) {
                    long A01 = ((C42811wM) entry.getValue()).A01(13);
                    if (A01 > 0) {
                        arrayList.add(new C71683Xb((UserJid) entry.getKey(), A01));
                    }
                }
                Collections.sort(arrayList, new Comparator() { // from class: X.3Xa
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return -(((C71683Xb) obj).A00 > ((C71683Xb) obj2).A00 ? 1 : (((C71683Xb) obj).A00 == ((C71683Xb) obj2).A00 ? 0 : -1));
                    }
                });
                return arrayList;
            }

            /* JADX WARN: Code restructure failed: missing block: B:34:0x00b3, code lost:
                if (r0 != 0) goto L17;
             */
            @Override // X.C0HS
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void A09(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.util.List r13 = (java.util.List) r13
                    java.lang.ref.WeakReference r0 = r12.A00
                    java.lang.Object r4 = r0.get()
                    X.3yg r4 = (X.C86883yg) r4
                    if (r4 == 0) goto Lbd
                    if (r13 == 0) goto Lbd
                    X.3qQ r3 = r4.A0R()
                    X.2hc r7 = r3.A05
                    android.widget.TextView r10 = r7.A02
                    X.01c r11 = r7.A0C
                    r9 = 2131755247(0x7f1000ef, float:1.9141368E38)
                    int r0 = r13.size()
                    long r0 = (long) r0
                    r2 = 1
                    java.lang.Object[] r8 = new java.lang.Object[r2]
                    int r5 = r13.size()
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
                    r5 = 0
                    r8[r5] = r6
                    java.lang.String r0 = r11.A0A(r9, r0, r8)
                    r10.setText(r0)
                    X.2hd r0 = r7.A0F
                    r0.A00 = r13
                    X.0S7 r0 = r0.A01
                    r0.A00()
                    android.widget.TextView r6 = r7.A01
                    boolean r1 = r13.isEmpty()
                    r0 = 8
                    if (r1 == 0) goto L49
                    r0 = 0
                L49:
                    r6.setVisibility(r0)
                    r7.A00()
                    android.view.ViewGroup r0 = r3.A08
                    r0.requestLayout()
                    android.widget.TextView r7 = r3.A04
                    X.01c r9 = r4.A0A
                    java.text.NumberFormat r6 = r9.A0G()
                    int r0 = r13.size()
                    long r0 = (long) r0
                    java.lang.String r0 = r6.format(r0)
                    r7.setText(r0)
                    android.view.ViewGroup r8 = r3.A0A
                    r7 = 2131755247(0x7f1000ef, float:1.9141368E38)
                    int r0 = r13.size()
                    long r0 = (long) r0
                    java.lang.Object[] r6 = new java.lang.Object[r2]
                    int r2 = r13.size()
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r6[r5] = r2
                    java.lang.String r0 = r9.A0A(r7, r0, r6)
                    r8.setContentDescription(r0)
                    android.view.ViewGroup r0 = r3.A0A
                    int r0 = r0.getVisibility()
                    if (r0 == 0) goto La4
                    android.view.ViewGroup r0 = r3.A0A
                    r0.setVisibility(r5)
                    r1 = 0
                    r0 = 1065353216(0x3f800000, float:1.0)
                    android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
                    r2.<init>(r1, r0)
                    r0 = 120(0x78, double:5.93E-322)
                    r2.setDuration(r0)
                    android.view.ViewGroup r0 = r3.A0A
                    r0.startAnimation(r2)
                La4:
                    X.00h r0 = r4.A09
                    boolean r0 = r0.A0m()
                    if (r0 != 0) goto Lb5
                    int r0 = r13.size()
                    r1 = 2131231721(0x7f0803e9, float:1.807953E38)
                    if (r0 == 0) goto Lb8
                Lb5:
                    r1 = 2131231766(0x7f080416, float:1.8079622E38)
                Lb8:
                    android.widget.ImageView r0 = r3.A03
                    r0.setImageResource(r1)
                Lbd:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C82373qP.A09(java.lang.Object):void");
            }
        };
        this.A00 = r2;
        this.A0M.ARy(r2, new Void[0]);
    }
}
