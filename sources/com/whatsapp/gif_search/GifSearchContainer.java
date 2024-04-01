package com.whatsapp.gif_search;

import X.AbstractC49282Jl;
import X.AnonymousClass011;
import X.C000500h;
import X.C01B;
import X.C02E;
import X.C02O;
import X.C2MB;
import X.C2MQ;
import X.C455822q;
import X.C66553Bm;
import X.InterfaceC48372Ez;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaEditText;
import com.whatsapp.gif_search.GifSearchContainer;

/* loaded from: classes2.dex */
public class GifSearchContainer extends AbstractC49282Jl {
    public View A00;
    public View A01;
    public View A02;
    public RecyclerView A03;
    public C01B A04;
    public WaEditText A05;
    public C02E A06;
    public C000500h A07;
    public AnonymousClass011 A08;
    public C455822q A09;
    public C66553Bm A0A;
    public C2MQ A0B;
    public InterfaceC48372Ez A0C;
    public C02O A0D;
    public C2MB A0E;
    public String A0F;
    public boolean A0G;
    public boolean A0H;

    public GifSearchContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0H = false;
    }

    public static void A00(GifSearchContainer gifSearchContainer, CharSequence charSequence) {
        if (gifSearchContainer.A0B != null) {
            gifSearchContainer.A01.setVisibility(8);
            gifSearchContainer.A02.setVisibility(8);
            gifSearchContainer.A00.setVisibility(0);
            if (TextUtils.isEmpty(charSequence)) {
                gifSearchContainer.A0A.A0H(null);
                C66553Bm A01 = gifSearchContainer.A01();
                gifSearchContainer.A0A = A01;
                gifSearchContainer.A03.setAdapter(A01);
                gifSearchContainer.A0A.A0H(gifSearchContainer.A0B.A00());
            } else {
                gifSearchContainer.A0A.A0H(gifSearchContainer.A0B.A01(charSequence, false));
            }
            gifSearchContainer.A0F = charSequence.toString();
        }
    }

    public final C66553Bm A01() {
        return new C66553Bm(this.A09, this.A08, this.A04, this.A06, this.A0C, this.A0D, getResources().getDimensionPixelSize(R.dimen.gif_trend_preview_size)) { // from class: X.3KW
            {
                GifSearchContainer.this = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0019, code lost:
                if (r6.A02 != false) goto L13;
             */
            @Override // X.C66553Bm
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void A0G(X.AbstractC61452wB r6) {
                /*
                    r5 = this;
                    super.A0G(r6)
                    com.whatsapp.gif_search.GifSearchContainer r4 = com.whatsapp.gif_search.GifSearchContainer.this
                    android.view.View r0 = r4.A00
                    r3 = 8
                    r0.setVisibility(r3)
                    android.view.View r2 = r4.A01
                    X.3Bm r0 = r4.A0A
                    int r0 = r0.A0C()
                    if (r0 != 0) goto L1b
                    boolean r1 = r6.A02
                    r0 = 0
                    if (r1 == 0) goto L1d
                L1b:
                    r0 = 8
                L1d:
                    r2.setVisibility(r0)
                    android.view.View r1 = r4.A02
                    X.3Bm r0 = r4.A0A
                    int r0 = r0.A0C()
                    if (r0 != 0) goto L2f
                    boolean r0 = r6.A02
                    if (r0 == 0) goto L2f
                    r3 = 0
                L2f:
                    r1.setVisibility(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C3KW.A0G(X.2wB):void");
            }
        };
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getMeasuredHeight() != i4 - i2) {
            if (!this.A0H) {
                post(new RunnableEBaseShape3S0100000_I0_3(this, 4));
            }
            this.A0H = !this.A0H;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x003b, code lost:
        if (r0 == 0) goto L17;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            boolean r0 = r6.isInEditMode()
            if (r0 == 0) goto La
            super.onMeasure(r7, r8)
            return
        La:
            int r4 = android.view.View.MeasureSpec.getMode(r8)
            int r5 = android.view.View.MeasureSpec.getSize(r8)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L4d
            int r3 = r6.getSuggestedMinimumHeight()
            boolean r0 = X.C2MB.A00(r6)
            if (r0 != 0) goto L49
            android.content.res.Resources r0 = r6.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.orientation
            r0 = 1
            if (r1 == r0) goto L55
            r0 = 2
            if (r1 != r0) goto L3d
            X.00h r0 = r6.A07
            android.content.SharedPreferences r2 = r0.A00
            java.lang.String r1 = "keyboard_height_landscape"
            r0 = 0
            int r0 = r2.getInt(r1, r0)
        L3b:
            if (r0 != 0) goto L48
        L3d:
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165689(0x7f0701f9, float:1.7945602E38)
            int r0 = r1.getDimensionPixelSize(r0)
        L48:
            int r3 = r3 + r0
        L49:
            int r5 = java.lang.Math.min(r3, r5)
        L4d:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r4)
            super.onMeasure(r7, r0)
            return
        L55:
            X.00h r0 = r6.A07
            android.content.SharedPreferences r2 = r0.A00
            java.lang.String r1 = "keyboard_height_portrait"
            r0 = 0
            int r0 = r2.getInt(r1, r0)
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gif_search.GifSearchContainer.onMeasure(int, int):void");
    }
}
