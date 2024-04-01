package com.whatsapp.picker.search;

import X.AbstractC08920cK;
import X.AbstractC14890nk;
import X.AbstractC15200oF;
import X.AnonymousClass011;
import X.C01B;
import X.C02E;
import X.C02O;
import X.C2MB;
import X.C2MQ;
import X.C36931lb;
import X.C455822q;
import X.C49302Jn;
import X.C53702hN;
import X.C66553Bm;
import X.C78823ka;
import X.C78833kb;
import X.InterfaceC48372Ez;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaEditText;
import com.whatsapp.picker.search.GifSearchDialogFragment;
import com.whatsapp.util.ViewOnClickCListenerShape10S0100000_I0_2;

/* loaded from: classes2.dex */
public class GifSearchDialogFragment extends Hilt_GifSearchDialogFragment implements InterfaceC48372Ez {
    public View A00;
    public View A01;
    public View A02;
    public RecyclerView A03;
    public C01B A04;
    public WaEditText A05;
    public C02E A06;
    public AnonymousClass011 A07;
    public C455822q A08;
    public C66553Bm A09;
    public C2MQ A0A;
    public C02O A0B;
    public C2MB A0C;
    public String A0D;

    public static void A00(GifSearchDialogFragment gifSearchDialogFragment, CharSequence charSequence) {
        gifSearchDialogFragment.A01.setVisibility(8);
        gifSearchDialogFragment.A02.setVisibility(8);
        gifSearchDialogFragment.A00.setVisibility(0);
        if (TextUtils.isEmpty(charSequence)) {
            gifSearchDialogFragment.A09.A0H(null);
            C66553Bm A19 = gifSearchDialogFragment.A19();
            gifSearchDialogFragment.A09 = A19;
            gifSearchDialogFragment.A03.setAdapter(A19);
            gifSearchDialogFragment.A09.A0H(gifSearchDialogFragment.A0A.A00());
        } else {
            gifSearchDialogFragment.A09.A0H(gifSearchDialogFragment.A0A.A01(charSequence, false));
        }
        gifSearchDialogFragment.A0D = charSequence.toString();
    }

    @Override // com.whatsapp.base.WaDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0g() {
        super.A0g();
        this.A05.A02(false);
    }

    @Override // com.whatsapp.picker.search.PickerSearchDialogFragment, X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int i;
        super.A0p(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.gif_search_dialog, viewGroup, false);
        this.A01 = inflate.findViewById(R.id.no_results);
        this.A02 = inflate.findViewById(R.id.retry_panel);
        this.A03 = (RecyclerView) inflate.findViewById(R.id.search_result);
        final int dimensionPixelSize = A01().getDimensionPixelSize(R.dimen.selected_contacts_top_offset);
        final GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        gridLayoutManager.A01 = new AbstractC14890nk() { // from class: X.3kX
            {
                GifSearchDialogFragment.this = this;
            }

            @Override // X.AbstractC14890nk
            public int A00(int i2) {
                if (GifSearchDialogFragment.this.A09.A0I(i2)) {
                    return gridLayoutManager.A00;
                }
                return 1;
            }
        };
        this.A03.setLayoutManager(gridLayoutManager);
        RecyclerView recyclerView = this.A03;
        recyclerView.A0i = true;
        recyclerView.A0k(new AbstractC08920cK() { // from class: X.3kY
            @Override // X.AbstractC08920cK
            public void A01(Rect rect, View view, RecyclerView recyclerView2, C0Y0 c0y0) {
                int i2 = dimensionPixelSize;
                rect.set(0, i2, i2, 0);
            }
        });
        inflate.findViewById(R.id.retry_button).setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 8));
        this.A00 = inflate.findViewById(R.id.progress_container);
        WaEditText waEditText = (WaEditText) inflate.findViewById(R.id.search_bar);
        this.A05 = waEditText;
        Object[] objArr = new Object[1];
        if (!(this.A0A instanceof C53702hN)) {
            str = "Giphy";
        } else {
            str = "Tenor";
        }
        objArr[0] = str;
        waEditText.setHint(A0G(R.string.gif_search_hint, objArr));
        this.A03.A0m(new AbstractC15200oF() { // from class: X.3kZ
            {
                GifSearchDialogFragment.this = this;
            }

            @Override // X.AbstractC15200oF
            public void A01(RecyclerView recyclerView2, int i2, int i3) {
                if (i3 != 0) {
                    GifSearchDialogFragment.this.A05.A01();
                }
            }
        });
        View findViewById = inflate.findViewById(R.id.clear_search_btn);
        findViewById.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 9));
        this.A05.addTextChangedListener(new C78823ka(this, findViewById));
        inflate.findViewById(R.id.back).setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 10));
        this.A00.setVisibility(8);
        this.A01.setVisibility(8);
        this.A02.setVisibility(8);
        this.A00.setVisibility(0);
        C66553Bm A19 = A19();
        this.A09 = A19;
        this.A03.setAdapter(A19);
        this.A09.A0H(this.A0A.A00());
        this.A0D = "";
        this.A05.setText("");
        this.A05.requestFocus();
        this.A05.A02(false);
        AnonymousClass011 anonymousClass011 = this.A07;
        C2MQ c2mq = this.A0A;
        C36931lb c36931lb = new C36931lb();
        if (!(c2mq instanceof C53702hN)) {
            i = 0;
        } else {
            i = 1;
        }
        c36931lb.A00 = Integer.valueOf(i);
        anonymousClass011.A0B(c36931lb, null, false);
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0r() {
        super.A0r();
        C66553Bm c66553Bm = this.A09;
        if (c66553Bm != null) {
            c66553Bm.A0H(null);
            this.A09 = null;
        }
        this.A03 = null;
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        this.A05 = null;
    }

    public final C66553Bm A19() {
        return new C66553Bm(this.A08, this.A07, this.A04, this.A06, this, this.A0B, A01().getDimensionPixelSize(R.dimen.gif_trend_preview_size)) { // from class: X.3w7
            {
                GifSearchDialogFragment.this = this;
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
                    com.whatsapp.picker.search.GifSearchDialogFragment r4 = com.whatsapp.picker.search.GifSearchDialogFragment.this
                    android.view.View r0 = r4.A00
                    r3 = 8
                    r0.setVisibility(r3)
                    android.view.View r2 = r4.A01
                    X.3Bm r0 = r4.A09
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
                    X.3Bm r0 = r4.A09
                    int r0 = r0.A0C()
                    if (r0 != 0) goto L2f
                    boolean r0 = r6.A02
                    if (r0 == 0) goto L2f
                    r3 = 0
                L2f:
                    r1.setVisibility(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C85723w7.A0G(X.2wB):void");
            }
        };
    }

    @Override // X.InterfaceC48372Ez
    public void AKr(C49302Jn c49302Jn) {
        InterfaceC48372Ez interfaceC48372Ez;
        this.A0C.A01(this.A05);
        C78833kb c78833kb = ((PickerSearchDialogFragment) this).A00;
        if (c78833kb == null || (interfaceC48372Ez = c78833kb.A01) == null) {
            return;
        }
        interfaceC48372Ez.AKr(c49302Jn);
    }
}
