package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.3qn */
/* loaded from: classes2.dex */
public class C82613qn extends AbstractC04890Mh {
    public int A01;
    public View A02;
    public RecyclerView A03;
    public C3Y5 A04;
    public C82773r3 A05;
    public final int A06;
    public final int A07;
    public final C43791xz A0A;
    public final StickerView A0B;
    public final AnonymousClass241 A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final AbstractC15200oF A09 = new AbstractC15200oF() { // from class: X.3ql
        {
            C82613qn.this = this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x000f, code lost:
            if (r1 != 0) goto L12;
         */
        @Override // X.AbstractC15200oF
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void A01(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
            /*
                r3 = this;
                if (r5 != 0) goto L18
                if (r6 != 0) goto L18
                X.3qn r2 = X.C82613qn.this
                com.whatsapp.stickers.StickerView r0 = r2.A0B
                if (r0 == 0) goto L11
                int r1 = r0.getVisibility()
                r0 = 1
                if (r1 == 0) goto L12
            L11:
                r0 = 0
            L12:
                if (r0 == 0) goto L17
                r2.A0I()
            L17:
                return
            L18:
                X.3qn r0 = X.C82613qn.this
                r0.A0G()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C82593ql.A01(androidx.recyclerview.widget.RecyclerView, int, int):void");
        }
    };
    public int A00 = 0;
    public final int A08 = R.drawable.sticker_store_error;

    public C82613qn(AnonymousClass241 anonymousClass241, C43791xz c43791xz, int i, int i2, boolean z, boolean z2, StickerView stickerView) {
        this.A0A = c43791xz;
        this.A0C = anonymousClass241;
        this.A07 = i;
        this.A06 = i2;
        this.A0D = z;
        this.A0E = z2;
        this.A0B = stickerView;
        if (stickerView != null) {
            stickerView.setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1(this, 18));
            stickerView.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.3Xt
                {
                    C82613qn.this = this;
                }

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    C82613qn c82613qn = C82613qn.this;
                    return c82613qn.A0K(c82613qn.A01);
                }
            });
        }
    }

    @Override // X.AbstractC04890Mh
    public void A09(RecyclerView recyclerView) {
        this.A03 = recyclerView;
        recyclerView.A0m(this.A09);
    }

    @Override // X.AbstractC04890Mh
    public void A0A(RecyclerView recyclerView) {
        recyclerView.A0n(this.A09);
        this.A03 = null;
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        int size;
        C42531vt c42531vt = this.A04.A02;
        if (c42531vt == null) {
            return 0;
        }
        if (c42531vt.A0N || (c42531vt.A0E == null && !c42531vt.A04.isEmpty())) {
            size = c42531vt.A04.size();
        } else {
            size = c42531vt.A03.size();
        }
        int i = this.A00;
        return i > 0 ? Math.min(size, i) : size;
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        C82623qo c82623qo = new C82623qo(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sticker_store_preview, viewGroup, false));
        ImageView imageView = c82623qo.A01;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i2 = this.A07;
        layoutParams.height = i2;
        layoutParams.width = i2;
        imageView.setLayoutParams(layoutParams);
        int i3 = this.A06;
        imageView.setPadding(i3, i3, i3, i3);
        return c82623qo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0016, code lost:
        if (r0.get(r14) == false) goto L38;
     */
    @Override // X.AbstractC04890Mh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0F(X.C0TS r13, final int r14) {
        /*
            r12 = this;
            X.3qo r13 = (X.C82623qo) r13
            android.widget.ImageView r5 = r13.A01
            int r0 = r12.A08
            r5.setImageResource(r0)
            X.3Y5 r0 = r12.A04
            X.1vt r1 = r0.A02
            android.util.SparseBooleanArray r0 = r0.A01
            if (r0 == 0) goto L18
            boolean r0 = r0.get(r14)
            r3 = 1
            if (r0 != 0) goto L19
        L18:
            r3 = 0
        L19:
            android.view.View r2 = r13.A00
            r0 = 8
            if (r3 == 0) goto L20
            r0 = 0
        L20:
            r2.setVisibility(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L29
            r0 = 1056964608(0x3f000000, float:0.5)
        L29:
            r5.setAlpha(r0)
            if (r1 == 0) goto L8c
            java.util.List r0 = r1.A04
            int r0 = r0.size()
            if (r0 <= r14) goto La0
            java.util.List r0 = r1.A04
            java.lang.Object r3 = r0.get(r14)
            X.0JM r3 = (X.C0JM) r3
        L3e:
            boolean r0 = r1.A0N
            if (r0 != 0) goto L8d
            java.lang.String r0 = r1.A0E
            if (r0 != 0) goto L4e
            java.util.List r0 = r1.A04
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L8d
        L4e:
            boolean r0 = r12.A0L(r3, r1)
            if (r0 != 0) goto L8d
            X.241 r6 = r12.A0C
            java.lang.String r0 = "https://static.whatsapp.net/sticker?img="
            java.lang.StringBuilder r2 = X.C000200d.A0P(r0)
            java.util.List r0 = r1.A03
            java.lang.Object r0 = r0.get(r14)
            java.lang.String r0 = (java.lang.String) r0
            r2.append(r0)
            java.lang.String r7 = r2.toString()
            X.3qm r11 = new X.3qm
            r11.<init>()
            r9 = 0
            r8 = r5
            r10 = r9
            r6.A03(r7, r8, r9, r10, r11)
        L76:
            boolean r0 = r12.A0D
            if (r0 == 0) goto L8c
            android.view.View r2 = r13.A0H
            X.3Xr r0 = new X.3Xr
            r0.<init>()
            r2.setOnLongClickListener(r0)
            X.3Xs r0 = new X.3Xs
            r0.<init>(r12, r14, r3, r1)
            r2.setOnClickListener(r0)
        L8c:
            return
        L8d:
            X.1xz r2 = r12.A0A
            if (r3 == 0) goto La2
            int r6 = r12.A07
            X.3qZ r10 = new X.3qZ
            r10.<init>()
            r4 = 1
            r8 = 0
            r7 = r6
            r9 = r8
            r2.A06(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L76
        La0:
            r3 = 0
            goto L3e
        La2:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82613qn.A0F(X.0TS, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x000d, code lost:
        if (r2.getVisibility() != 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0G() {
        /*
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r3.A03
            if (r0 == 0) goto L29
            com.whatsapp.stickers.StickerView r2 = r3.A0B
            if (r2 == 0) goto Lf
            int r1 = r2.getVisibility()
            r0 = 1
            if (r1 == 0) goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L28
            if (r2 == 0) goto L28
            android.view.View r1 = r3.A02
            r0 = 0
            r1.setVisibility(r0)
            r0 = 4
            r2.setVisibility(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r3.A03
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            r2.A01()
        L28:
            return
        L29:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82613qn.A0G():void");
    }

    public final void A0H() {
        if (this.A03 != null) {
            StickerView stickerView = this.A0B;
            if (stickerView != null) {
                this.A02.setVisibility(4);
                stickerView.setVisibility(0);
                this.A03.setAlpha(0.2f);
                return;
            }
            return;
        }
        throw null;
    }

    public final void A0I() {
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            StickerView stickerView = this.A0B;
            if (stickerView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) recyclerView.getLayoutParams();
                int i = marginLayoutParams.leftMargin;
                int i2 = marginLayoutParams.rightMargin;
                int width = this.A03.getWidth();
                int height = this.A03.getHeight();
                C0TS A0C = this.A03.A0C(this.A01);
                if (A0C == null) {
                    A0G();
                    return;
                }
                View view = A0C.A0H;
                this.A02 = view;
                float width2 = (this.A02.getWidth() / 2.0f) + view.getX() + i;
                float y = this.A02.getY();
                float max = Math.max(width2 - (stickerView.getWidth() / 2.0f), 0.0f);
                float max2 = Math.max(((this.A02.getHeight() / 2.0f) + y) - (stickerView.getHeight() / 2.0f), 0.0f);
                stickerView.setX(max - Math.max(((stickerView.getWidth() + max) - width) - i2, 0.0f));
                stickerView.setY(max2 - Math.max((stickerView.getHeight() + max2) - height, 0.0f));
                return;
            }
            return;
        }
        throw null;
    }

    public void A0J(int i, C0JM c0jm, C42531vt c42531vt) {
        boolean z;
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            C0TS A0C = recyclerView.A0C(i);
            if (A0C == null) {
                A0G();
                return;
            }
            View view = A0C.A0H;
            this.A02 = view;
            ImageView imageView = (ImageView) view.findViewById(R.id.sticker_preview);
            this.A01 = i;
            A0I();
            StickerView stickerView = this.A0B;
            if (stickerView != null) {
                if (A0L(c0jm, c42531vt) && ((!(z = this.A0E) && c42531vt.A0K) || (z && c42531vt.A0M))) {
                    this.A0A.A06(c0jm, 1, stickerView, stickerView.getWidth(), stickerView.getHeight(), true, false, new InterfaceC44171yd() { // from class: X.3qa
                        {
                            C82613qn.this = this;
                        }

                        @Override // X.InterfaceC44171yd
                        public final void AP5(boolean z2) {
                            C82613qn.this.A0B.A00();
                        }
                    });
                    A0H();
                    return;
                }
                stickerView.setImageDrawable(imageView.getDrawable());
                A0H();
                return;
            }
            return;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x001b, code lost:
        if (r1 != 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0K(int r6) {
        /*
            r5 = this;
            X.3r3 r0 = r5.A05
            if (r0 == 0) goto L10
            X.3Y5 r0 = r5.A04
            android.util.SparseBooleanArray r0 = r0.A01
            if (r0 == 0) goto L12
            boolean r0 = r0.get(r6)
            if (r0 == 0) goto L12
        L10:
            r0 = 1
            return r0
        L12:
            com.whatsapp.stickers.StickerView r0 = r5.A0B
            if (r0 == 0) goto L1d
            int r1 = r0.getVisibility()
            r0 = 1
            if (r1 == 0) goto L1e
        L1d:
            r0 = 0
        L1e:
            if (r0 == 0) goto L24
            int r0 = r5.A01
            if (r0 != r6) goto L10
        L24:
            X.3Y5 r0 = r5.A04
            X.1vt r2 = r0.A02
            if (r2 == 0) goto L69
            java.util.List r0 = r2.A04
            int r0 = r0.size()
            if (r0 <= r6) goto L67
            if (r6 < 0) goto L67
            X.3r3 r1 = r5.A05
            java.util.List r0 = r2.A04
            java.lang.Object r4 = r0.get(r6)
            X.0JM r4 = (X.C0JM) r4
            com.whatsapp.stickers.StickerStorePackPreviewActivity r3 = r1.A00
            java.util.Set r1 = r3.A0S
            if (r1 == 0) goto L10
            java.lang.String r0 = r4.A0B
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L62
            com.whatsapp.stickers.RemoveStickerFromFavoritesDialogFragment r2 = new com.whatsapp.stickers.RemoveStickerFromFavoritesDialogFragment
            r2.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "sticker"
            r1.putParcelable(r0, r4)
            r2.A0P(r1)
        L5e:
            r3.AUh(r2)
            goto L10
        L62:
            com.whatsapp.stickers.StarStickerFromPickerDialogFragment r2 = com.whatsapp.stickers.StarStickerFromPickerDialogFragment.A00(r4)
            goto L5e
        L67:
            r0 = 0
            return r0
        L69:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82613qn.A0K(int):boolean");
    }

    public final boolean A0L(C0JM c0jm, C42531vt c42531vt) {
        if (c0jm == null || c0jm.A08 == null) {
            return false;
        }
        return this.A0E || !c42531vt.A01();
    }
}
