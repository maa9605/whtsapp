package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversationslist.ViewHolder;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.search.IteratingPlayer;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.concurrent.Executors;

/* renamed from: X.25o */
/* loaded from: classes2.dex */
public class C461925o extends AbstractC462025p implements C0Mi {
    public RecyclerView A00;
    public final Activity A02;
    public final AbstractC02530Bu A03;
    public final C018308n A04;
    public final C06040Rh A05;
    public final AbstractC000600i A06;
    public final C018508q A07;
    public final C02L A08;
    public final C01B A09;
    public final C0LM A0A;
    public final C06K A0B;
    public final C40261rr A0C;
    public final C0L7 A0D;
    public final C05W A0E;
    public final C018708s A0F;
    public final C0Zn A0G;
    public final C52782bL A0I;
    public final C02E A0J;
    public final AnonymousClass012 A0K;
    public final C001200o A0L;
    public final C02F A0M;
    public final C000500h A0N;
    public final C002301c A0O;
    public final C05M A0P;
    public final C0DK A0Q;
    public final C0GK A0R;
    public final C03180Eq A0S;
    public final C0WZ A0T;
    public final C40421sE A0U;
    public final C40081rY A0V;
    public final C003701t A0W;
    public final C41461tx A0X;
    public final C41471ty A0Y;
    public final C02980Dr A0Z;
    public final C03750Gx A0a;
    public final C02O A0b;
    public final IteratingPlayer A0c;
    public final C461725k A0e;
    public final SearchViewModel A0f;
    public final C0CB A0g;
    public final C2AR A0h;
    public final C42461vm A0i;
    public final InterfaceC002901k A0j;
    public final C23K A0k;
    public String A01 = "";
    public final C52682b9 A0H = new C52682b9(Executors.newSingleThreadExecutor());
    public final C86023wi A0d = new InterfaceC15040nz(this) { // from class: X.3wi
        public int A00 = -1;
        public final AbstractC04890Mh A01;

        {
            C461925o.this = this;
            this.A01 = this;
        }

        @Override // X.InterfaceC15040nz
        public void AIJ(int i, int i2, Object obj) {
            this.A01.A01.A04(i, i2, obj);
        }

        @Override // X.InterfaceC15040nz
        public void AL5(int i, int i2) {
            int i3 = this.A00;
            if (i3 == -1 || i3 >= i) {
                this.A00 = i;
                if (i == 0) {
                    SearchViewModel searchViewModel = C461925o.this.A0f;
                    if (searchViewModel.A0E.A01() == null || ((Number) searchViewModel.A0E.A01()).intValue() == 0) {
                        searchViewModel.A0Q.A0B(0);
                    }
                }
            }
            this.A01.A01.A02(i, i2);
        }

        @Override // X.InterfaceC15040nz
        public void AMG(int i, int i2) {
            this.A01.A01.A01(i, i2);
        }

        @Override // X.InterfaceC15040nz
        public void ANn(int i, int i2) {
            this.A01.A01.A03(i, i2);
        }
    };

    public static boolean A00(int i) {
        return i == 9 || i == 8 || i == 10;
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [X.3wi] */
    public C461925o(AnonymousClass012 anonymousClass012, C003701t c003701t, Activity activity, C02980Dr c02980Dr, AbstractC02530Bu abstractC02530Bu, C42461vm c42461vm, C018508q c018508q, AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, C02L c02l, C001200o c001200o, C05M c05m, C40081rY c40081rY, C01B c01b, C018308n c018308n, C41471ty c41471ty, C03750Gx c03750Gx, C0L7 c0l7, C05W c05w, C06040Rh c06040Rh, C0GK c0gk, C02E c02e, C018708s c018708s, C002301c c002301c, C0WZ c0wz, C40261rr c40261rr, C03180Eq c03180Eq, C2AR c2ar, C0CB c0cb, C23K c23k, C40421sE c40421sE, C02F c02f, C0Zn c0Zn, C000500h c000500h, C06K c06k, C41461tx c41461tx, C02O c02o, C0LM c0lm, SearchViewModel searchViewModel, C0DK c0dk, IteratingPlayer iteratingPlayer) {
        this.A0K = anonymousClass012;
        this.A0W = c003701t;
        this.A02 = activity;
        this.A0Z = c02980Dr;
        this.A03 = abstractC02530Bu;
        this.A0i = c42461vm;
        this.A07 = c018508q;
        this.A06 = abstractC000600i;
        this.A0j = interfaceC002901k;
        this.A08 = c02l;
        this.A0L = c001200o;
        this.A0P = c05m;
        this.A0V = c40081rY;
        this.A09 = c01b;
        this.A0Y = c41471ty;
        this.A0a = c03750Gx;
        this.A04 = c018308n;
        this.A0D = c0l7;
        this.A0E = c05w;
        this.A05 = c06040Rh;
        this.A0J = c02e;
        this.A0F = c018708s;
        this.A0O = c002301c;
        this.A0R = c0gk;
        this.A0T = c0wz;
        this.A0f = searchViewModel;
        this.A0c = iteratingPlayer;
        this.A0C = c40261rr;
        this.A0S = c03180Eq;
        this.A0h = c2ar;
        this.A0g = c0cb;
        this.A0G = c0Zn;
        this.A0k = c23k;
        this.A0U = c40421sE;
        this.A0M = c02f;
        this.A0N = c000500h;
        this.A0B = c06k;
        this.A0X = c41461tx;
        this.A0b = c02o;
        this.A0A = c0lm;
        this.A0Q = c0dk;
        this.A0I = new C52782bL(activity);
        this.A0e = new C461725k(c002301c);
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A0e.size();
    }

    @Override // X.AbstractC04890Mh
    public int A0D(int i) {
        return this.A0e.A00(i);
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        if (i != -1) {
            if (i != 99) {
                if (i == 1) {
                    return new C86123wt(new C86093wq(viewGroup.getContext()));
                }
                if (i != 2 && i != 3) {
                    if (i != 4) {
                        switch (i) {
                            case 6:
                                return new C86233x4(new C51842Yl(viewGroup.getContext()));
                            case 7:
                                Context context = viewGroup.getContext();
                                AnonymousClass012 anonymousClass012 = this.A0K;
                                C02L c02l = this.A08;
                                C40081rY c40081rY = this.A0V;
                                C52782bL c52782bL = this.A0I;
                                C05W c05w = this.A0E;
                                C02E c02e = this.A0J;
                                C018708s c018708s = this.A0F;
                                C002301c c002301c = this.A0O;
                                C2AR c2ar = this.A0h;
                                C02O c02o = this.A0b;
                                SearchViewModel searchViewModel = this.A0f;
                                C3NY c3ny = new C3NY(context, anonymousClass012, c02l, c40081rY, c52782bL, c05w, c02e, c018708s, c002301c, c2ar, this.A0H, c02o);
                                c3ny.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                                return new C86213x2(c3ny, searchViewModel);
                            case 8:
                                return new C86173wy(new C2Yp(viewGroup.getContext()), this.A0f);
                            case 9:
                                return new C86173wy(new C41W(viewGroup.getContext()), this.A0f);
                            case 10:
                                return new C86173wy(new C51912Yu(viewGroup.getContext()), this.A0f);
                            case GoogleMigrateImporterActivity.A0E /* 11 */:
                                AnonymousClass012 anonymousClass0122 = this.A0K;
                                C42461vm c42461vm = this.A0i;
                                C018508q c018508q = this.A07;
                                AbstractC000600i abstractC000600i = this.A06;
                                C02L c02l2 = this.A08;
                                InterfaceC002901k interfaceC002901k = this.A0j;
                                C40081rY c40081rY2 = this.A0V;
                                C01B c01b = this.A09;
                                C52782bL c52782bL2 = this.A0I;
                                C018308n c018308n = this.A04;
                                C05W c05w2 = this.A0E;
                                C02E c02e2 = this.A0J;
                                C018708s c018708s2 = this.A0F;
                                C002301c c002301c2 = this.A0O;
                                C2AR c2ar2 = this.A0h;
                                C40421sE c40421sE = this.A0U;
                                C02F c02f = this.A0M;
                                C02O c02o2 = this.A0b;
                                SearchViewModel searchViewModel2 = this.A0f;
                                C61972x7 c61972x7 = new C61972x7(viewGroup.getContext(), anonymousClass0122, c42461vm, c018508q, abstractC000600i, c02l2, interfaceC002901k, c40081rY2, c01b, c52782bL2, c018308n, c05w2, c02e2, c018708s2, c002301c2, c2ar2, c40421sE, c02f, this.A0H, c02o2);
                                c61972x7.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                                return new C86163wx(c61972x7, searchViewModel2);
                            case 12:
                                return new C86103wr(new C86093wq(viewGroup.getContext()));
                            case 13:
                                return new C86133wu(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.search_no_result, viewGroup, false));
                            case 14:
                                Context context2 = viewGroup.getContext();
                                AnonymousClass012 anonymousClass0123 = this.A0K;
                                C02L c02l3 = this.A08;
                                C40081rY c40081rY3 = this.A0V;
                                C52782bL c52782bL3 = this.A0I;
                                C05W c05w3 = this.A0E;
                                C02E c02e3 = this.A0J;
                                C018708s c018708s3 = this.A0F;
                                C002301c c002301c3 = this.A0O;
                                C2AR c2ar3 = this.A0h;
                                C02O c02o3 = this.A0b;
                                SearchViewModel searchViewModel3 = this.A0f;
                                C69083Nb c69083Nb = new C69083Nb(context2, anonymousClass0123, c02l3, c40081rY3, c52782bL3, c05w3, c02e3, c018708s3, c002301c3, c2ar3, this.A0H, c02o3);
                                c69083Nb.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                                return new C86153ww(c69083Nb, searchViewModel3);
                            case 15:
                                Context context3 = viewGroup.getContext();
                                AnonymousClass012 anonymousClass0124 = this.A0K;
                                C02L c02l4 = this.A08;
                                C40081rY c40081rY4 = this.A0V;
                                C52782bL c52782bL4 = this.A0I;
                                C05W c05w4 = this.A0E;
                                C02E c02e4 = this.A0J;
                                C018708s c018708s4 = this.A0F;
                                C002301c c002301c4 = this.A0O;
                                C2AR c2ar4 = this.A0h;
                                C02O c02o4 = this.A0b;
                                SearchViewModel searchViewModel4 = this.A0f;
                                C3MG c3mg = new C3MG(context3, anonymousClass0124, c02l4, c40081rY4, c52782bL4, c05w4, c02e4, c018708s4, c002301c4, c2ar4, this.A0H, c02o4);
                                c3mg.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                                return new C86223x3(c3mg, searchViewModel4);
                            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                                Context context4 = viewGroup.getContext();
                                AnonymousClass012 anonymousClass0125 = this.A0K;
                                C02L c02l5 = this.A08;
                                C40081rY c40081rY5 = this.A0V;
                                C52782bL c52782bL5 = this.A0I;
                                C05W c05w5 = this.A0E;
                                C02E c02e5 = this.A0J;
                                C018708s c018708s5 = this.A0F;
                                C002301c c002301c5 = this.A0O;
                                C2AR c2ar5 = this.A0h;
                                C02O c02o5 = this.A0b;
                                return new C86203x1(new C3NZ(context4, anonymousClass0125, c02l5, c40081rY5, c52782bL5, c05w5, c02e5, c018708s5, c002301c5, c2ar5, this.A0H, c02o5), this.A0f);
                            case 17:
                                Context context5 = viewGroup.getContext();
                                AnonymousClass012 anonymousClass0126 = this.A0K;
                                C02L c02l6 = this.A08;
                                C40081rY c40081rY6 = this.A0V;
                                C52782bL c52782bL6 = this.A0I;
                                C05W c05w6 = this.A0E;
                                C02E c02e6 = this.A0J;
                                C018708s c018708s6 = this.A0F;
                                C002301c c002301c6 = this.A0O;
                                C2AR c2ar6 = this.A0h;
                                C02O c02o6 = this.A0b;
                                return new C86203x1(new C3MH(context5, anonymousClass0126, c02l6, c40081rY6, c52782bL6, c05w6, c02e6, c018708s6, c002301c6, c2ar6, this.A0H, c02o6), this.A0f);
                            case 18:
                                Context context6 = viewGroup.getContext();
                                AnonymousClass012 anonymousClass0127 = this.A0K;
                                C02L c02l7 = this.A08;
                                C40081rY c40081rY7 = this.A0V;
                                C52782bL c52782bL7 = this.A0I;
                                C05W c05w7 = this.A0E;
                                C02E c02e7 = this.A0J;
                                C018708s c018708s7 = this.A0F;
                                C002301c c002301c7 = this.A0O;
                                C2AR c2ar7 = this.A0h;
                                C02O c02o7 = this.A0b;
                                return new C86203x1(new C69073Na(context6, anonymousClass0127, c02l7, c40081rY7, c52782bL7, c05w7, c02e7, c018708s7, c002301c7, c2ar7, this.A0H, c02o7), this.A0f);
                            case 19:
                                Context context7 = viewGroup.getContext();
                                AnonymousClass012 anonymousClass0128 = this.A0K;
                                C02L c02l8 = this.A08;
                                C40081rY c40081rY8 = this.A0V;
                                C52782bL c52782bL8 = this.A0I;
                                C05W c05w8 = this.A0E;
                                C02E c02e8 = this.A0J;
                                C018708s c018708s8 = this.A0F;
                                C002301c c002301c8 = this.A0O;
                                C0WZ c0wz = this.A0T;
                                C2AR c2ar8 = this.A0h;
                                C02O c02o8 = this.A0b;
                                SearchViewModel searchViewModel5 = this.A0f;
                                C61952x4 c61952x4 = new C61952x4(context7, anonymousClass0128, c02l8, c40081rY8, c52782bL8, c05w8, c02e8, c018708s8, c002301c8, c0wz, c2ar8, this.A0H, c02o8);
                                c61952x4.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                                return new C86183wz(c61952x4, searchViewModel5);
                            case C0M6.A01 /* 20 */:
                                Context context8 = viewGroup.getContext();
                                AnonymousClass012 anonymousClass0129 = this.A0K;
                                C02L c02l9 = this.A08;
                                C40081rY c40081rY9 = this.A0V;
                                C52782bL c52782bL9 = this.A0I;
                                C41471ty c41471ty = this.A0Y;
                                C0L7 c0l7 = this.A0D;
                                C05W c05w9 = this.A0E;
                                SearchViewModel searchViewModel6 = this.A0f;
                                C61962x6 c61962x6 = new C61962x6(context8, anonymousClass0129, c02l9, c40081rY9, c52782bL9, c41471ty, c0l7, c05w9, this.A0J, this.A0F, this.A0O, this.A0h, this.A0G, this.A0X, this.A0b, this.A0Q, this.A0H);
                                c61962x6.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                                return new C86193x0(c61962x6, searchViewModel6);
                            case 21:
                                Context context9 = viewGroup.getContext();
                                AnonymousClass012 anonymousClass01210 = this.A0K;
                                C018508q c018508q2 = this.A07;
                                C02L c02l10 = this.A08;
                                C40081rY c40081rY10 = this.A0V;
                                C52782bL c52782bL10 = this.A0I;
                                C0L7 c0l72 = this.A0D;
                                C05W c05w10 = this.A0E;
                                C02E c02e9 = this.A0J;
                                C018708s c018708s9 = this.A0F;
                                C002301c c002301c9 = this.A0O;
                                C2AR c2ar9 = this.A0h;
                                C23K c23k = this.A0k;
                                SearchViewModel searchViewModel7 = this.A0f;
                                C61992xA c61992xA = new C61992xA(context9, anonymousClass01210, c018508q2, c02l10, c40081rY10, c52782bL10, c0l72, c05w10, c02e9, c018708s9, c002301c9, c2ar9, c23k, this.A0G, this.A0H, this.A0b);
                                c61992xA.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                                return new C86143wv(c61992xA, searchViewModel7);
                            default:
                                throw new UnsupportedOperationException(C000200d.A0D("Invalid viewType: ", i));
                        }
                    }
                    return new C86243x5(new C2Yn(viewGroup.getContext()));
                }
            }
            AbstractC54772jK abstractC54772jK = AbstractC54772jK.A03;
            if (i == 99) {
                abstractC54772jK = AbstractC54772jK.A02;
            }
            AnonymousClass012 anonymousClass01211 = this.A0K;
            C003701t c003701t = this.A0W;
            C02980Dr c02980Dr = this.A0Z;
            C02L c02l11 = this.A08;
            C001200o c001200o = this.A0L;
            C05M c05m = this.A0P;
            C01B c01b2 = this.A09;
            C03750Gx c03750Gx = this.A0a;
            C0L7 c0l73 = this.A0D;
            C05W c05w11 = this.A0E;
            C06040Rh c06040Rh = this.A05;
            C0GK c0gk = this.A0R;
            C018708s c018708s10 = this.A0F;
            C002301c c002301c10 = this.A0O;
            C40261rr c40261rr = this.A0C;
            C03180Eq c03180Eq = this.A0S;
            C2AR c2ar10 = this.A0h;
            C0CB c0cb = this.A0g;
            C0Zn c0Zn = this.A0G;
            C000500h c000500h = this.A0N;
            C52682b9 c52682b9 = this.A0H;
            ViewHolder viewHolder = new ViewHolder(viewGroup.getContext(), c001200o, anonymousClass01211, c003701t, c02980Dr, c02l11, c05m, c01b2, c03750Gx, c0l73, c05w11, c06040Rh, c0gk, c018708s10, c002301c10, c40261rr, c03180Eq, c2ar10, c0cb, c000500h, this.A0B, this.A0A, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.conversations_row, viewGroup, false), abstractC54772jK, c0Zn, c52682b9, this.A0f.A0K);
            this.A03.A02(viewHolder);
            return viewHolder;
        }
        return new AbstractC09080cc(new View(viewGroup.getContext())) { // from class: X.3ws
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x02ad, code lost:
        if (r3.A0C(442) != false) goto L81;
     */
    @Override // X.AbstractC04890Mh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0F(X.C0TS r17, int r18) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C461925o.A0F(X.0TS, int):void");
    }

    public boolean A0H() {
        return Boolean.TRUE.equals(this.A0f.A08.A01());
    }

    public boolean A0I(int i) {
        if (A0H()) {
            int i2 = i - 1;
            return i2 >= 0 && this.A0e.A00(i2) == 6 && A0J(i);
        } else if (A0J(i)) {
            return true;
        } else {
            return i != -1 && this.A0e.A00(i) == 4;
        }
    }

    public boolean A0J(int i) {
        if (i == -1) {
            return false;
        }
        int A00 = this.A0e.A00(i);
        return A00 == 1 || A00 == 12;
    }
}
