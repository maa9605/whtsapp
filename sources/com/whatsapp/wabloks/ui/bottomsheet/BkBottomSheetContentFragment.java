package com.whatsapp.wabloks.ui.bottomsheet;

import X.AbstractC016907v;
import X.ActivityC02290Ap;
import X.AnonymousClass144;
import X.C000200d;
import X.C000700j;
import X.C00J;
import X.C09M;
import X.C2MB;
import X.C33391fp;
import X.C45Q;
import X.C45v;
import X.C46M;
import X.C892046c;
import X.C90284Ak;
import X.C91694Fx;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;
import com.whatsapp.wabloks.base.BkFragment;
import com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment;
import com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment;

/* loaded from: classes3.dex */
public class BkBottomSheetContentFragment extends Hilt_BkBottomSheetContentFragment {
    public FrameLayout A00;
    public Toolbar A01;
    public C33391fp A02;
    public C00J A03;
    public C00J A04;
    public String A05;
    public boolean A06;

    public static BkBottomSheetContentFragment A00(C91694Fx c91694Fx, C90284Ak c90284Ak, String str, boolean z) {
        Bundle bundle = new Bundle();
        StringBuilder A0P = C000200d.A0P("bk_bottom_sheet_content_fragment");
        A0P.append(c90284Ak.hashCode());
        String obj = A0P.toString();
        bundle.putString("bottom_sheet_fragment_tag", str);
        bundle.putBoolean("bottom_sheet_back_stack", z);
        bundle.putString("bk_bottom_sheet_content_fragment", obj);
        c91694Fx.A02("bk_bottom_sheet_content_fragment", obj, c90284Ak);
        BkBottomSheetContentFragment bkBottomSheetContentFragment = new BkBottomSheetContentFragment();
        bkBottomSheetContentFragment.A0P(bundle);
        return bkBottomSheetContentFragment;
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle A02 = A02();
        View inflate = layoutInflater.inflate(R.layout.bk_bottom_sheet_fragment, viewGroup, false);
        this.A00 = (FrameLayout) inflate.findViewById(R.id.bloks_container);
        inflate.findViewById(R.id.error_view);
        inflate.findViewById(R.id.bloks_dialogfragment_progressbar);
        View findViewById = inflate.findViewById(R.id.bk_bottom_sheet_toolbar);
        if (findViewById != null) {
            this.A01 = (Toolbar) findViewById;
            this.A05 = A02.getString("bottom_sheet_fragment_tag");
            this.A06 = A02.getBoolean("bottom_sheet_back_stack");
            ((BkFragment) this).A00 = this.A00;
            final C90284Ak c90284Ak = (C90284Ak) ((C46M) this.A03.get()).A01("bk_bottom_sheet_content_fragment", A02.getString("bk_bottom_sheet_content_fragment", ""));
            if (c90284Ak != null) {
                AnonymousClass144 anonymousClass144 = c90284Ak.A00;
                String str = (String) anonymousClass144.A01.A00(C45v.A02);
                if (!TextUtils.isEmpty(str)) {
                    this.A01.setVisibility(0);
                    this.A01.setTitle(str);
                }
                if (this.A06) {
                    this.A01.setVisibility(0);
                    this.A01.getNavigationIcon().setVisible(true, true);
                    this.A01.setNavigationOnClickListener(new View.OnClickListener() { // from class: X.4Aj
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            C09P AA3 = c90284Ak.A00.AA3(C45v.A03);
                            if (AA3 != null) {
                                ActivityC02270An activityC02270An = (ActivityC02270An) BkBottomSheetContentFragment.this.A09();
                                C45Q.A0O(new C892046c(activityC02270An.A0N(), activityC02270An, activityC02270An.A0F), AA3, C021109r.A01);
                            }
                            BkBottomSheetContentFragment bkBottomSheetContentFragment = BkBottomSheetContentFragment.this;
                            C0BA c0ba = ((C0BA) bkBottomSheetContentFragment).A0D;
                            if (c0ba instanceof BkBottomSheetContainerFragment) {
                                String str2 = bkBottomSheetContentFragment.A05;
                                AbstractC02800Cx A0B = c0ba.A0B();
                                A0B.A0g(new C0ZW(A0B, str2, -1, 1), false);
                            }
                        }
                    });
                } else {
                    this.A01.getNavigationIcon().setVisible(false, false);
                }
                C45Q.A0A();
                this.A02 = C45Q.A00.A6g((AbstractC016907v) anonymousClass144.A01.A00(C45v.A00));
                FrameLayout frameLayout = ((BkFragment) this).A00;
                C000700j.A04(frameLayout, "bloksView is null -- setBloksView() not called.");
                frameLayout.setVisibility(0);
                C09M A00 = C09M.A00();
                C892046c c892046c = new C892046c(this.A0H, (ActivityC02290Ap) A09(), (C2MB) this.A04.get());
                C33391fp c33391fp = this.A02;
                FrameLayout frameLayout2 = ((BkFragment) this).A00;
                C000700j.A04(frameLayout2, "bloksView is null -- setBloksView() not called.");
                A00.A02(c892046c, c33391fp, frameLayout2);
            }
            return inflate;
        }
        throw null;
    }

    @Override // com.whatsapp.wabloks.base.BkFragment, X.C0BA
    public void A0r() {
        C09M.A00();
        FrameLayout frameLayout = ((BkFragment) this).A00;
        C000700j.A04(frameLayout, "bloksView is null -- setBloksView() not called.");
        C09M.A01(frameLayout);
        this.A01 = null;
        this.A00 = null;
        super.A0r();
    }
}
