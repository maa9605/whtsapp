package com.whatsapp.conversation.selectlist;

import X.AbstractC04890Mh;
import X.AbstractC08920cK;
import X.AbstractC15200oF;
import X.AnonymousClass382;
import X.C0BA;
import X.C0XT;
import X.C0XV;
import X.C39V;
import X.C50382Rm;
import X.C54492iq;
import X.C59432sk;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape0S0200000_I0_0;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.selectlist.SelectListBottomSheet;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class SelectListBottomSheet extends Hilt_SelectListBottomSheet {
    public AnonymousClass382 A00;
    public C0XT A01;

    public static void A00(SelectListBottomSheet selectListBottomSheet, RecyclerView recyclerView, int i, int i2) {
        if (((C0BA) selectListBottomSheet).A0A != null) {
            boolean canScrollVertically = recyclerView.canScrollVertically(i);
            View findViewById = ((C0BA) selectListBottomSheet).A0A.findViewById(i2);
            if (canScrollVertically) {
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(4);
            }
        }
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.conversation_single_select_list_bottom_sheet, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0r() {
        super.A0r();
        this.A00 = null;
    }

    @Override // X.C0BA
    public void A0w(View view, Bundle bundle) {
        C0XT c0xt = (C0XT) A02().getParcelable("arg_select_list_content");
        this.A01 = c0xt;
        if (c0xt == null) {
            A16(false, false);
        }
        view.findViewById(R.id.close).setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 28));
        ((TextEmojiLabel) view.findViewById(R.id.select_list_title)).A03(this.A01.A02);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.select_list_items);
        recyclerView.A0m(new AbstractC15200oF() { // from class: X.39W
            {
                SelectListBottomSheet.this = this;
            }

            @Override // X.AbstractC15200oF
            public void A01(RecyclerView recyclerView2, int i, int i2) {
                SelectListBottomSheet selectListBottomSheet = SelectListBottomSheet.this;
                SelectListBottomSheet.A00(selectListBottomSheet, recyclerView2, -1, R.id.shadow_top);
                SelectListBottomSheet.A00(selectListBottomSheet, recyclerView2, 1, R.id.shadow_bottom);
            }
        });
        recyclerView.setNestedScrollingEnabled(true);
        recyclerView.A0k(new AbstractC08920cK() { // from class: X.39X
            @Override // X.AbstractC08920cK
            public void A01(Rect rect, View view2, RecyclerView recyclerView2, C0Y0 c0y0) {
                view2.getLayoutParams();
                rect.set(0, 0, 0, 0);
                int A00 = RecyclerView.A00(view2);
                AbstractC04890Mh abstractC04890Mh = recyclerView2.A0N;
                if (abstractC04890Mh != null) {
                    int A0D = abstractC04890Mh.A0D(A00);
                    if (A00 == 0 && A0D == 0) {
                        int A07 = C0AT.A07(view2);
                        int dimension = (int) view2.getResources().getDimension(R.dimen.select_list_header_top_padding);
                        int A06 = C0AT.A06(view2);
                        int paddingBottom = view2.getPaddingBottom();
                        if (Build.VERSION.SDK_INT >= 17) {
                            view2.setPaddingRelative(A07, dimension, A06, paddingBottom);
                        } else {
                            view2.setPadding(A07, dimension, A06, paddingBottom);
                        }
                    }
                }
            }
        });
        C54492iq c54492iq = new C54492iq();
        recyclerView.setAdapter(c54492iq);
        List<C50382Rm> list = this.A01.A06;
        ArrayList arrayList = new ArrayList();
        for (C50382Rm c50382Rm : list) {
            String str = c50382Rm.A00;
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(new C59432sk(str));
            }
            for (C0XV c0xv : c50382Rm.A01) {
                arrayList.add(new C59432sk(c0xv));
            }
        }
        List list2 = c54492iq.A02;
        list2.clear();
        list2.addAll(arrayList);
        ((AbstractC04890Mh) c54492iq).A01.A00();
        view.findViewById(R.id.select_list_button).setOnClickListener(new ViewOnClickEBaseShape0S0200000_I0_0(this, c54492iq, 20));
        c54492iq.A01 = new C39V(view);
        ((DialogFragment) this).A03.setOnShowListener(new DialogInterface.OnShowListener() { // from class: X.2sj
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                View findViewById = ((Dialog) dialogInterface).findViewById(R.id.design_bottom_sheet);
                if (findViewById != null) {
                    BottomSheetBehavior A002 = BottomSheetBehavior.A00(findViewById);
                    A002.A0O(3);
                    A002.A0N(findViewById.getHeight());
                    return;
                }
                throw null;
            }
        });
    }
}
