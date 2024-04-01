package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.RemoveStickerFromFavoritesDialogFragment;
import com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment;
import com.whatsapp.stickers.StarStickerFromPickerDialogFragment;
import java.util.List;

/* renamed from: X.25e */
/* loaded from: classes2.dex */
public abstract class AbstractC461525e implements C25f {
    public int A00;
    public int A01;
    public int A02;
    public GridLayoutManager A03;
    public RecyclerView A04;
    public C2IK A05;
    public final int A08;
    public final Context A09;
    public final LayoutInflater A0A;
    public final C003701t A0B;
    public boolean A07 = false;
    public C83053rV A06 = new C83053rV(this);

    public void A03(View view) {
    }

    public AbstractC461525e(C003701t c003701t, Context context, LayoutInflater layoutInflater, int i) {
        this.A0B = c003701t;
        this.A09 = context;
        this.A0A = layoutInflater;
        this.A08 = i;
        int i2 = AnonymousClass088.A0M(context).x / i;
        if (this.A00 != i2) {
            this.A00 = i2;
            GridLayoutManager gridLayoutManager = this.A03;
            if (gridLayoutManager != null) {
                gridLayoutManager.A1q(i2);
            }
            C2IK c2ik = this.A05;
            if (c2ik != null) {
                ((AbstractC04890Mh) c2ik).A01.A00();
            }
        }
    }

    public C2IK A00() {
        C2IK c2ik = this.A05;
        if (c2ik == null) {
            if (this instanceof C2CF) {
                final C2CF c2cf = (C2CF) this;
                c2ik = new C2IK(c2cf.A04.A04, c2cf.A09, c2cf.A05, c2cf.A07, 6);
                c2ik.A02 = new C3Y4() { // from class: X.3rS
                    @Override // X.C3Y4
                    public final void AP6(C0JM c0jm) {
                        C2CF c2cf2 = c2cf;
                        ((ActivityC02290Ap) C018308n.A00(c2cf2.A09)).AUh(StarStickerFromPickerDialogFragment.A00(c0jm));
                    }
                };
            } else if (this instanceof C2IX) {
                final C2IX c2ix = (C2IX) this;
                c2ik = new C2IK(null, c2ix.A09, c2ix.A02, c2ix.A04, 4);
                c2ik.A02 = new C3Y4() { // from class: X.3rR
                    @Override // X.C3Y4
                    public final void AP6(C0JM c0jm) {
                        C2IX c2ix2 = c2ix;
                        RemoveStickerFromFavoritesDialogFragment removeStickerFromFavoritesDialogFragment = new RemoveStickerFromFavoritesDialogFragment();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("sticker", c0jm);
                        removeStickerFromFavoritesDialogFragment.A0P(bundle);
                        ((ActivityC02290Ap) C018308n.A00(c2ix2.A09)).AUh(removeStickerFromFavoritesDialogFragment);
                    }
                };
            } else if (this instanceof C25d) {
                final C25d c25d = (C25d) this;
                c2ik = c25d.A03;
                if (c2ik == null) {
                    c2ik = new C2IK(null, ((AbstractC461525e) c25d).A09, c25d.A07, c25d.A08, 3);
                    c25d.A03 = c2ik;
                    c2ik.A02 = new C3Y4() { // from class: X.3rP
                        @Override // X.C3Y4
                        public final void AP6(C0JM c0jm) {
                            C25d c25d2 = c25d;
                            StarOrRemoveFromRecentsStickerDialogFragment starOrRemoveFromRecentsStickerDialogFragment = new StarOrRemoveFromRecentsStickerDialogFragment();
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("sticker", c0jm);
                            starOrRemoveFromRecentsStickerDialogFragment.A0P(bundle);
                            ((ActivityC02290Ap) C018308n.A00(((AbstractC461525e) c25d2).A09)).AUh(starOrRemoveFromRecentsStickerDialogFragment);
                        }
                    };
                }
            } else if (!(this instanceof C86503xe)) {
                final C86493xd c86493xd = (C86493xd) this;
                c2ik = new C2IK((List) c86493xd.A02.A02.A01(), c86493xd.A09, c86493xd.A00, c86493xd.A01, 7);
                c2ik.A02 = new C3Y4() { // from class: X.3rN
                    @Override // X.C3Y4
                    public final void AP6(C0JM c0jm) {
                        C86493xd c86493xd2 = c86493xd;
                        ((ActivityC02290Ap) C018308n.A01(c86493xd2.A09, ActivityC02290Ap.class)).AUh(StarStickerFromPickerDialogFragment.A00(c0jm));
                    }
                };
            } else {
                final C86503xe c86503xe = (C86503xe) this;
                c2ik = new C2IK(c86503xe.A01, c86503xe.A09, c86503xe.A03, c86503xe.A04, 5);
                c2ik.A02 = new C3Y4() { // from class: X.3rO
                    @Override // X.C3Y4
                    public final void AP6(C0JM c0jm) {
                        C86503xe c86503xe2 = c86503xe;
                        ((ActivityC02290Ap) C018308n.A00(c86503xe2.A09)).AUh(StarStickerFromPickerDialogFragment.A00(c0jm));
                    }
                };
            }
            this.A05 = c2ik;
            boolean z = this.A07;
            c2ik.A04 = z;
            c2ik.A00 = z ? 2 : 1;
        }
        return c2ik;
    }

    public void A01() {
        if (this instanceof C2CF) {
            C2CF c2cf = (C2CF) this;
            ((AbstractC04890Mh) c2cf.A00()).A01.A00();
            c2cf.A05();
        } else if (this instanceof C2IX) {
            final C2IX c2ix = (C2IX) this;
            C2AS c2as = c2ix.A03;
            InterfaceC49102Im interfaceC49102Im = new InterfaceC49102Im() { // from class: X.3rQ
                @Override // X.InterfaceC49102Im
                public final void AP4(List list) {
                    C2IX c2ix2 = c2ix;
                    c2ix2.A01 = list;
                    C2IK A00 = c2ix2.A00();
                    if (A00 != null) {
                        A00.A0G(c2ix2.A01);
                        A00.A01();
                        if (c2ix2.A00 != null) {
                            c2ix2.A00.setVisibility(c2ix2.A00().A0C() == 0 ? 0 : 8);
                        }
                    }
                }
            };
            if (c2as != null) {
                c2as.A0S.ARy(new C82673qt(c2as, interfaceC49102Im), new Void[0]);
                return;
            }
            throw null;
        } else if (this instanceof C25d) {
            final C25d c25d = (C25d) this;
            C2AM c2am = c25d.A06;
            c2am.A09.execute(new RunnableEBaseShape4S0200000_I0_4(c2am, new InterfaceC49102Im() { // from class: X.3rT
                @Override // X.InterfaceC49102Im
                public final void AP4(List list) {
                    C25d c25d2 = c25d;
                    C2IK A00 = c25d2.A00();
                    c25d2.A04 = list;
                    A00.A0G(list);
                    ((AbstractC04890Mh) A00).A01.A00();
                    if (c25d2.A00 != null) {
                        c25d2.A00.setVisibility(c25d2.A00().A0C() == 0 ? 0 : 8);
                        if (c25d2.A05) {
                            c25d2.A02.setText(R.string.sticker_picker_no_sent_stickers);
                            c25d2.A01.setVisibility(4);
                            return;
                        }
                        c25d2.A02.setText(R.string.sticker_picker_no_recent_no_installed);
                        c25d2.A01.setVisibility(0);
                    }
                }
            }, 17));
        } else if (!(this instanceof C86503xe)) {
            C86493xd c86493xd = (C86493xd) this;
            c86493xd.A00().A0G((List) c86493xd.A02.A02.A01());
            ((AbstractC04890Mh) c86493xd.A00()).A01.A00();
        } else {
            C86503xe c86503xe = (C86503xe) this;
            ((AbstractC04890Mh) c86503xe.A00()).A01.A00();
            if (c86503xe.A00 != null) {
                List list = c86503xe.A01;
                c86503xe.A00.setVisibility((list == null ? 0 : list.size()) != 0 ? 8 : 0);
            }
        }
    }

    public void A02(int i, int i2) {
        if (i != 0 && i2 != 0) {
            int dimensionPixelSize = i2 - this.A09.getResources().getDimensionPixelSize(R.dimen.picker_footer_height);
            if (dimensionPixelSize != this.A01) {
                this.A01 = dimensionPixelSize;
                int i3 = this.A08;
                int i4 = (i3 * 3) >> 2;
                int i5 = dimensionPixelSize % i3;
                if (i5 >= (i3 >> 2) && i5 <= i4) {
                    i4 = i5;
                }
                int max = Math.max(0, dimensionPixelSize - i4);
                this.A02 = (max % i3) / ((max / i3) + 1);
            }
            int i6 = i / this.A08;
            if (this.A00 != i6) {
                this.A00 = i6;
                GridLayoutManager gridLayoutManager = this.A03;
                if (gridLayoutManager != null) {
                    gridLayoutManager.A1q(i6);
                }
                C2IK c2ik = this.A05;
                if (c2ik != null) {
                    ((AbstractC04890Mh) c2ik).A01.A00();
                }
            }
        }
    }

    public void A04(boolean z) {
        this.A07 = z;
        C2IK c2ik = this.A05;
        if (c2ik != null) {
            c2ik.A04 = z;
            c2ik.A00 = z ? 2 : 1;
            ((AbstractC04890Mh) c2ik).A01.A00();
        }
    }

    @Override // X.C25f
    public void A5I(AbstractC15200oF abstractC15200oF) {
        RecyclerView recyclerView = this.A04;
        if (recyclerView != null) {
            recyclerView.A0m(abstractC15200oF);
        }
    }

    @Override // X.C25f
    public View AJ3(ViewGroup viewGroup, int i) {
        int i2;
        LayoutInflater layoutInflater = this.A0A;
        if (this instanceof C2CF) {
            if (!(((C2CF) this) instanceof C86923yl)) {
                i2 = R.layout.sticker_pack_page;
            } else {
                i2 = R.layout.third_party_pack_page;
            }
        } else if (this instanceof C2IX) {
            i2 = R.layout.fixed_sticker_page;
        } else if (this instanceof C25d) {
            i2 = R.layout.fixed_sticker_page;
        } else if (!(this instanceof C86503xe)) {
            i2 = R.layout.fixed_sticker_page;
        } else {
            i2 = R.layout.reaction_sticker_page;
        }
        View inflate = layoutInflater.inflate(i2, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.sticker_grid);
        if (findViewById != null) {
            this.A04 = (RecyclerView) findViewById;
            int i3 = this.A00;
            if (i3 <= 0) {
                i3 = 1;
            }
            GridLayoutManager gridLayoutManager = new GridLayoutManager(i3);
            this.A03 = gridLayoutManager;
            this.A04.setLayoutManager(gridLayoutManager);
            this.A04.A0k(new AbstractC08920cK(this.A06, this.A02) { // from class: X.35i
                public int A00;
                public C83053rV A01;

                {
                    this.A01 = r1;
                    this.A00 = r2;
                }

                @Override // X.AbstractC08920cK
                public void A01(Rect rect, View view, RecyclerView recyclerView, C0Y0 c0y0) {
                    AbstractC04890Mh abstractC04890Mh;
                    int i4;
                    int A00 = RecyclerView.A00(view);
                    if (A00 < 0 || (abstractC04890Mh = recyclerView.A0N) == null || A00 > abstractC04890Mh.A0C() || (i4 = this.A01.A00.A00) <= 0) {
                        return;
                    }
                    int width = recyclerView.getWidth();
                    AbstractC461525e abstractC461525e = this.A01.A00;
                    int i5 = A00 % i4;
                    int i6 = (width - (abstractC461525e.A08 * i4)) / (i4 + 1);
                    rect.left = i6 - ((i5 * i6) / i4);
                    rect.right = ((i5 + 1) * i6) / i4;
                    if (A00 < abstractC461525e.A00) {
                        rect.top = this.A00;
                    }
                    rect.bottom = this.A00;
                }
            });
            RecyclerView recyclerView = this.A04;
            C2IK A00 = A00();
            recyclerView.setLayoutFrozen(false);
            recyclerView.A0j(A00, true, false);
            recyclerView.A0u(true);
            recyclerView.requestLayout();
            RecyclerView recyclerView2 = this.A04;
            recyclerView2.A0m(new C82863rC(this.A0B, recyclerView2.getResources(), this.A03));
            A03(inflate);
            A01();
            return inflate;
        }
        throw null;
    }

    @Override // X.C25f
    public void AJJ(ViewGroup viewGroup, int i, View view) {
        RecyclerView recyclerView = this.A04;
        if (recyclerView != null) {
            C15220oH recycledViewPool = recyclerView.getRecycledViewPool();
            int i2 = 0;
            while (true) {
                SparseArray sparseArray = recycledViewPool.A01;
                if (i2 >= sparseArray.size()) {
                    break;
                }
                ((C15210oG) sparseArray.valueAt(i2)).A03.clear();
                i2++;
            }
            recyclerView.setAdapter(null);
            this.A04 = null;
        }
        this.A03 = null;
        this.A05 = null;
    }

    @Override // X.C25f
    public void ARR(AbstractC15200oF abstractC15200oF) {
        List list;
        RecyclerView recyclerView = this.A04;
        if (recyclerView == null || (list = recyclerView.A0b) == null) {
            return;
        }
        list.remove(abstractC15200oF);
    }

    @Override // X.C25f
    public String getId() {
        if (this instanceof C2CF) {
            return ((C2CF) this).A04.A0D;
        }
        if (this instanceof C2IX) {
            return "starred";
        }
        if (this instanceof C25d) {
            return "recents";
        }
        if (!(this instanceof C86503xe)) {
            return "contextual_suggestion";
        }
        StringBuilder A0P = C000200d.A0P("reaction_");
        A0P.append(((C86503xe) this).A02);
        return A0P.toString();
    }
}
