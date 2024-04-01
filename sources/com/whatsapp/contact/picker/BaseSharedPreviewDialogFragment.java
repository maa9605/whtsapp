package com.whatsapp.contact.picker;

import X.AbstractC005302j;
import X.ActivityC02330At;
import X.AnonymousClass029;
import X.C000700j;
import X.C002301c;
import X.C003101m;
import X.C012005w;
import X.C018508q;
import X.C018708s;
import X.C02160Ac;
import X.C02E;
import X.C05W;
import X.C0We;
import X.C2ME;
import X.C41961un;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.WebPagePreviewView;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class BaseSharedPreviewDialogFragment extends Hilt_BaseSharedPreviewDialogFragment {
    public View A00;
    public View A01;
    public ViewGroup A02;
    public ImageButton A03;
    public LinearLayout A04;
    public RelativeLayout A05;
    public C012005w A06;
    public C018508q A07;
    public C05W A08;
    public C018708s A09;
    public C2ME A0A;
    public WebPagePreviewView A0B;
    public C02E A0C;
    public C002301c A0D;
    public EmojiSearchContainer A0E;
    public C41961un A0F;
    public List A0G;

    @Override // com.whatsapp.base.WaDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0g() {
        Dialog dialog = ((DialogFragment) this).A03;
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(-16777216));
                dialog.getWindow().getAttributes().windowAnimations = R.style.FullScreenDialogFragmentAnimation;
            } else {
                throw null;
            }
        }
        super.A0g();
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0j(Bundle bundle) {
        super.A0j(bundle);
        Toolbar toolbar = (Toolbar) this.A00.findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(C02160Ac.A00(A0A(), R.color.primary));
        ActivityC02330At A09 = A09();
        toolbar.A0B = 2131952194;
        TextView textView = toolbar.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(A09, 2131952194);
        }
        toolbar.setTitle(R.string.send_to);
        toolbar.setNavigationIcon(new C0We(this.A0D, C02160Ac.A03(A09(), R.drawable.ic_back)));
        toolbar.setNavigationOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 45));
        toolbar.setNavigationContentDescription(R.string.back);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = ((DialogFragment) this).A03.getWindow();
            if (window != null) {
                window.clearFlags(67108864);
                window.setStatusBarColor(C02160Ac.A00(A09(), R.color.primary_dark));
                return;
            }
            throw null;
        }
    }

    @Override // X.C0BA
    public void A0l(Menu menu) {
        menu.findItem(R.id.menuitem_search).setVisible(false);
    }

    @Override // X.C0BA
    public boolean A0o(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        A16(false, false);
        return true;
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String A08;
        this.A00 = A0A().getLayoutInflater().inflate(R.layout.base_shared_preview_fragment, viewGroup, false);
        A0J();
        A12(2, 0);
        this.A00.findViewById(R.id.top_layout);
        this.A04 = (LinearLayout) this.A00.findViewById(R.id.view_placeholder);
        this.A05 = (RelativeLayout) this.A00.findViewById(R.id.footer);
        this.A03 = (ImageButton) this.A00.findViewById(R.id.send);
        this.A02 = (ViewGroup) this.A00.findViewById(R.id.web_page_preview_container);
        this.A01 = this.A00.findViewById(R.id.link_preview_divider);
        this.A02.setVisibility(8);
        this.A01.setVisibility(8);
        EmojiSearchContainer emojiSearchContainer = (EmojiSearchContainer) this.A00.findViewById(R.id.emoji_search_container);
        this.A0E = emojiSearchContainer;
        emojiSearchContainer.setVisibility(8);
        ArrayList arrayList = new ArrayList();
        for (AbstractC005302j abstractC005302j : this.A0G) {
            if (C003101m.A0Z(abstractC005302j)) {
                A08 = A0F(R.string.my_status);
            } else {
                A08 = this.A09.A08(this.A08.A0A(abstractC005302j), false);
            }
            arrayList.add(0, A08);
        }
        ((TextEmojiLabel) this.A00.findViewById(R.id.recipients)).A03(AnonymousClass029.A0o(this.A09.A04, false, arrayList));
        A18();
        return this.A00;
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        if (!(A09() instanceof C2ME)) {
            throw new RuntimeException("Activity must implement BaseSharedPreviewDialogFragment.Host");
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        ArrayList<String> stringArrayList = A02().getStringArrayList("jids");
        C000700j.A04(stringArrayList, "null jids");
        this.A0G = C003101m.A0F(AbstractC005302j.class, stringArrayList);
        C2ME c2me = (C2ME) A09();
        this.A0A = c2me;
        if (c2me != null) {
            c2me.ATt(this);
        }
        A12(0, R.style.FullScreenDialogNoFloating);
        return super.A0z(bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0011, code lost:
        if (r0 != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A18() {
        /*
            r3 = this;
            android.widget.RelativeLayout r0 = r3.A05
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            com.whatsapp.conversation.conversationrow.WebPagePreviewView r0 = r3.A0B
            if (r0 == 0) goto L13
            int r0 = r0.getVisibility()
            r1 = 2131166176(0x7f0703e0, float:1.794659E38)
            if (r0 == 0) goto L16
        L13:
            r1 = 2131166177(0x7f0703e1, float:1.7946592E38)
        L16:
            android.content.res.Resources r0 = r3.A01()
            int r1 = r0.getDimensionPixelSize(r1)
            r2.height = r1
            android.widget.RelativeLayout r0 = r3.A05
            int r0 = r0.getHeight()
            if (r1 == r0) goto L2d
            android.widget.RelativeLayout r0 = r3.A05
            r0.setLayoutParams(r2)
        L2d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.BaseSharedPreviewDialogFragment.A18():void");
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        C2ME c2me = this.A0A;
        if (c2me != null) {
            c2me.ARU();
        }
        if (((DialogFragment) this).A0C) {
            return;
        }
        A16(true, true);
    }
}
