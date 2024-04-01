package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1pe  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C39141pe extends AbstractC016307p {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C0TR A04;
    public AbstractC28841Ub A05;
    public C20620xp A06;
    public C30901bM A07;
    public List A08;
    public List A09;
    public final long A0A;
    public static C08C A0B = new C08C() { // from class: X.1Yg
        @Override // X.C08C
        public void A5g(Context context, Object obj, Object obj2, Object obj3) {
            int i;
            Parcelable parcelable;
            RecyclerView recyclerView = (RecyclerView) obj;
            C39141pe c39141pe = (C39141pe) obj2;
            recyclerView.setAdapter(c39141pe.A07);
            recyclerView.setItemAnimator(null);
            C20620xp c20620xp = c39141pe.A06;
            if (c20620xp != null && (parcelable = c20620xp.A00) != null) {
                recyclerView.A0S.A0x(parcelable);
            } else if ((c20620xp != null && c20620xp.A00 != null) || (i = c39141pe.A03) < 0) {
            } else {
                recyclerView.A0Y(i);
            }
        }

        @Override // X.C08C
        public boolean AUY(Object obj, Object obj2, Object obj3, Object obj4) {
            return ((C39141pe) obj).A07 != ((C39141pe) obj2).A07;
        }

        @Override // X.C08C
        public void AVh(Context context, Object obj, Object obj2, Object obj3) {
            RecyclerView recyclerView = (RecyclerView) obj;
            C20620xp c20620xp = ((C39141pe) obj2).A06;
            if (c20620xp != null) {
                c20620xp.A00 = recyclerView.A0S.A0m();
            }
            recyclerView.setAdapter(null);
        }
    };
    public static C08C A0G = new C08C() { // from class: X.1Yh
        @Override // X.C08C
        public void A5g(Context context, Object obj, Object obj2, Object obj3) {
            ((RecyclerView) obj).setLayoutManager(new LinearLayoutManager(((C39141pe) obj2).A01));
        }

        @Override // X.C08C
        public boolean AUY(Object obj, Object obj2, Object obj3, Object obj4) {
            return ((C39141pe) obj).A01 != ((C39141pe) obj2).A01;
        }

        @Override // X.C08C
        public void AVh(Context context, Object obj, Object obj2, Object obj3) {
            ((RecyclerView) obj).setLayoutManager(null);
        }
    };
    public static C08C A0I = new C08C() { // from class: X.1Yi
        @Override // X.C08C
        public void A5g(Context context, Object obj, Object obj2, Object obj3) {
            RecyclerView recyclerView = (RecyclerView) obj;
            List list = ((C39141pe) obj2).A09;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    recyclerView.A0m((AbstractC15200oF) list.get(i));
                }
            }
        }

        @Override // X.C08C
        public boolean AUY(Object obj, Object obj2, Object obj3, Object obj4) {
            List list = ((C39141pe) obj).A09;
            List list2 = ((C39141pe) obj2).A09;
            if (list == list2) {
                return false;
            }
            if (list == null || list2 == null || list.size() != list2.size()) {
                return true;
            }
            return !list.equals(list2);
        }

        @Override // X.C08C
        public void AVh(Context context, Object obj, Object obj2, Object obj3) {
            RecyclerView recyclerView = (RecyclerView) obj;
            List list = ((C39141pe) obj2).A09;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    recyclerView.A0n((AbstractC15200oF) list.get(i));
                }
            }
        }
    };
    public static C08C A0J = new C08C() { // from class: X.1Yj
        @Override // X.C08C
        public void A5g(Context context, Object obj, Object obj2, Object obj3) {
            RecyclerView recyclerView = (RecyclerView) obj;
            AbstractC28841Ub abstractC28841Ub = ((C39141pe) obj2).A05;
            if (abstractC28841Ub != null) {
                abstractC28841Ub.A01(recyclerView);
            }
        }

        @Override // X.C08C
        public boolean AUY(Object obj, Object obj2, Object obj3, Object obj4) {
            AbstractC28841Ub abstractC28841Ub = ((C39141pe) obj).A05;
            AbstractC28841Ub abstractC28841Ub2 = ((C39141pe) obj2).A05;
            if (abstractC28841Ub != abstractC28841Ub2) {
                return abstractC28841Ub == null || !abstractC28841Ub.equals(abstractC28841Ub2);
            }
            return false;
        }

        @Override // X.C08C
        public void AVh(Context context, Object obj, Object obj2, Object obj3) {
            AbstractC28841Ub abstractC28841Ub = ((C39141pe) obj2).A05;
            if (abstractC28841Ub != null) {
                abstractC28841Ub.A01(null);
            }
        }
    };
    public static C08C A0E = new C08C() { // from class: X.1Yk
        @Override // X.C08C
        public void A5g(Context context, Object obj, Object obj2, Object obj3) {
            RecyclerView recyclerView = (RecyclerView) obj;
            List<AbstractC08920cK> list = ((C39141pe) obj2).A08;
            if (list != null) {
                for (AbstractC08920cK abstractC08920cK : list) {
                    recyclerView.A0k(abstractC08920cK);
                }
            }
        }

        @Override // X.C08C
        public boolean AUY(Object obj, Object obj2, Object obj3, Object obj4) {
            List list = ((C39141pe) obj).A08;
            List list2 = ((C39141pe) obj2).A08;
            if (list != list2) {
                return list == null || !list.equals(list2);
            }
            return false;
        }

        @Override // X.C08C
        public void AVh(Context context, Object obj, Object obj2, Object obj3) {
            RecyclerView recyclerView = (RecyclerView) obj;
            List<AbstractC08920cK> list = ((C39141pe) obj2).A08;
            if (list != null) {
                for (AbstractC08920cK abstractC08920cK : list) {
                    recyclerView.A0l(abstractC08920cK);
                }
            }
        }
    };
    public static C08C A0D = new C08C() { // from class: X.1Yl
        @Override // X.C08C
        public void A5g(Context context, Object obj, Object obj2, Object obj3) {
            ((RecyclerView) obj).setItemAnimator(((C39141pe) obj2).A04);
        }

        @Override // X.C08C
        public boolean AUY(Object obj, Object obj2, Object obj3, Object obj4) {
            return ((C39141pe) obj).A04 != ((C39141pe) obj2).A04;
        }

        @Override // X.C08C
        public void AVh(Context context, Object obj, Object obj2, Object obj3) {
            ((RecyclerView) obj).setItemAnimator(null);
        }
    };
    public static C08C A0F = new C08C() { // from class: X.1Ym
        @Override // X.C08C
        public void A5g(Context context, Object obj, Object obj2, Object obj3) {
            C39141pe c39141pe = (C39141pe) obj2;
            if (obj3 != null) {
                final C30901bM c30901bM = c39141pe.A07;
                C20610xo c20610xo = (C20610xo) obj3;
                if (c30901bM != null) {
                    c30901bM.A01 = c20610xo.A01;
                    c30901bM.A00 = c20610xo.A00;
                    final List list = c30901bM.A04;
                    c30901bM.A04 = c20610xo.A02;
                    C14820nd.A00(new AbstractC14760nX() { // from class: X.1Yq
                        @Override // X.AbstractC14760nX
                        public int A00() {
                            return C30901bM.this.A04.size();
                        }

                        @Override // X.AbstractC14760nX
                        public int A01() {
                            return list.size();
                        }

                        @Override // X.AbstractC14760nX
                        public boolean A03(int i, int i2) {
                            return ((C08Q) list.get(i)).A02.equals(((C08Q) C30901bM.this.A04.get(i2)).A02);
                        }

                        @Override // X.AbstractC14760nX
                        public boolean A04(int i, int i2) {
                            return ((long) ((C08Q) list.get(i)).A02.A00) == ((long) ((C08Q) C30901bM.this.A04.get(i2)).A02.A00);
                        }
                    }).A02(new C1U9(c30901bM));
                    return;
                }
                throw null;
            }
            throw new IllegalStateException("List data was not computed during layout");
        }

        @Override // X.C08C
        public boolean AUY(Object obj, Object obj2, Object obj3, Object obj4) {
            C20610xo c20610xo = (C20610xo) obj3;
            C20610xo c20610xo2 = (C20610xo) obj4;
            return (c20610xo.A01 == c20610xo2.A01 && c20610xo.A00 == c20610xo2.A00 && c20610xo.A02.equals(c20610xo2.A02)) ? false : true;
        }

        @Override // X.C08C
        public void AVh(Context context, Object obj, Object obj2, Object obj3) {
        }
    };
    public static C08C A0C = new C08C() { // from class: X.1Yn
        @Override // X.C08C
        public void A5g(Context context, Object obj, Object obj2, Object obj3) {
            View view = (View) obj;
            C39141pe c39141pe = (C39141pe) obj2;
            if (Build.VERSION.SDK_INT >= 17) {
                view.setBackgroundColor(c39141pe.A00);
            } else {
                view.setBackgroundDrawable(new ColorDrawable(c39141pe.A00));
            }
        }

        @Override // X.C08C
        public boolean AUY(Object obj, Object obj2, Object obj3, Object obj4) {
            return ((C39141pe) obj).A00 != ((C39141pe) obj2).A00;
        }

        @Override // X.C08C
        public void AVh(Context context, Object obj, Object obj2, Object obj3) {
        }
    };
    public static C08C A0H = new C08C() { // from class: X.1Yo
        @Override // X.C08C
        public void A5g(Context context, Object obj, Object obj2, Object obj3) {
            ((View) obj).setOverScrollMode(((C39141pe) obj2).A02);
        }

        @Override // X.C08C
        public boolean AUY(Object obj, Object obj2, Object obj3, Object obj4) {
            return ((C39141pe) obj).A02 != ((C39141pe) obj2).A02;
        }

        @Override // X.C08C
        public void AVh(Context context, Object obj, Object obj2, Object obj3) {
        }
    };

    public C39141pe(long j) {
        super(EnumC20560xj.VIEW);
        this.A00 = 0;
        this.A02 = 0;
        this.A0A = j;
        C08D[] c08dArr = {new C08D(this, A0G), new C08D(this, A0B), new C08D(this, A0I), new C08D(this, A0J), new C08D(this, A0E), new C08D(this, A0D), new C08D(this, A0F), new C08D(this, A0C), new C08D(this, A0H)};
        for (int i = 0; i < 9; i++) {
            A06(c08dArr[i]);
        }
    }

    @Override // X.AbstractC016307p
    public long A04() {
        return this.A0A;
    }

    @Override // X.AbstractC016307p
    public Object A07(Context context) {
        return new RecyclerView(context, null);
    }

    public void A08(AbstractC15200oF abstractC15200oF) {
        List list = this.A09;
        if (list == null) {
            list = new ArrayList(4);
            this.A09 = list;
        }
        list.add(abstractC15200oF);
    }

    @Override // X.AbstractC016307p, X.C07T
    public /* bridge */ /* synthetic */ C07T AGA() {
        return super.AGA();
    }
}
