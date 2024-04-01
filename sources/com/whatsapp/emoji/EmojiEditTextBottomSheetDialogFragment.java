package com.whatsapp.emoji;

import X.AbstractC000600i;
import X.AnonymousClass223;
import X.C000200d;
import X.C000500h;
import X.C002301c;
import X.C002701i;
import X.C018508q;
import X.C02E;
import X.C02O;
import X.C09190cp;
import X.C0LX;
import X.C2MB;
import X.C2MI;
import X.C2Oc;
import X.C40081rY;
import X.C43871y8;
import X.C455822q;
import X.C47682Ce;
import X.C48362Ey;
import X.C52662b7;
import X.InterfaceC04830Lz;
import X.InterfaceC09180cm;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.WaButton;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.EmojiEditTextBottomSheetDialogFragment;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class EmojiEditTextBottomSheetDialogFragment extends Hilt_EmojiEditTextBottomSheetDialogFragment {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public ImageButton A06;
    public AbstractC000600i A07;
    public C018508q A08;
    public WaButton A09;
    public WaEditText A0A;
    public C02E A0B;
    public C000500h A0C;
    public C002301c A0D;
    public C43871y8 A0E;
    public C2Oc A0F;
    public C40081rY A0G;
    public C48362Ey A0H;
    public C47682Ce A0I;
    public C2MI A0J;
    public C455822q A0K;
    public C02O A0L;
    public C2MB A0M;
    public String A0N;
    public boolean A0Q;
    public String[] A0R;
    public boolean A0O = true;
    public boolean A0P = true;
    public final InterfaceC09180cm A0S = new InterfaceC09180cm() { // from class: X.3AN
        {
            EmojiEditTextBottomSheetDialogFragment.this = this;
        }

        @Override // X.InterfaceC09180cm
        public void AHj() {
            EmojiEditTextBottomSheetDialogFragment.this.A0A.dispatchKeyEvent(new KeyEvent(0, 67));
        }

        @Override // X.InterfaceC09180cm
        public void AJi(int[] iArr) {
            EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment = EmojiEditTextBottomSheetDialogFragment.this;
            C002701i.A1H(emojiEditTextBottomSheetDialogFragment.A0A, iArr, emojiEditTextBottomSheetDialogFragment.A04);
        }
    };

    public static EmojiEditTextBottomSheetDialogFragment A00(int i, int i2, int i3, String str, int i4, String[] strArr, int i5) {
        EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment = new EmojiEditTextBottomSheetDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("dialogId", i);
        bundle.putInt("titleResId", i2);
        bundle.putInt("hintResId", 0);
        bundle.putInt("emptyErrorResId", i3);
        bundle.putString("defaultStr", str);
        bundle.putInt("maxLength", i4);
        bundle.putInt("inputType", i5);
        bundle.putStringArray("codepointBlacklist", strArr);
        emojiEditTextBottomSheetDialogFragment.A0P(bundle);
        return emojiEditTextBottomSheetDialogFragment;
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0e() {
        super.A0e();
        this.A0F = null;
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0k(Bundle bundle) {
        super.A0k(bundle);
        boolean A00 = C2MB.A00(this.A0A);
        this.A0Q = A00;
        bundle.putBoolean("is_keyboard_showing", A00);
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = A0A().getLayoutInflater().inflate(R.layout.emoji_editext_bottomsheet_dialog, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.dialog_title_tv);
        int i = this.A05;
        if (i != 0) {
            textView.setText(i);
        }
        this.A0A = (WaEditText) inflate.findViewById(R.id.edit_text);
        TextView textView2 = (TextView) inflate.findViewById(R.id.counter_tv);
        C0LX.A0A(this.A0D, this.A0A);
        if (this.A04 > 0) {
            textView2.setVisibility(0);
        }
        ArrayList arrayList = new ArrayList();
        int i2 = this.A04;
        if (i2 > 0) {
            arrayList.add(new C09190cp(i2));
        }
        if (!arrayList.isEmpty()) {
            this.A0A.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[0]));
        }
        WaEditText waEditText = this.A0A;
        waEditText.addTextChangedListener(new C52662b7(this.A0G, this.A0B, this.A0D, this.A0L, waEditText, textView2, this.A04, 0, false));
        this.A09 = (WaButton) inflate.findViewById(R.id.save_button);
        this.A0A.setInputType(this.A03);
        this.A0A.A02(true);
        Window window = ((DialogFragment) this).A03.getWindow();
        if (Build.VERSION.SDK_INT >= 21) {
            window.getDecorView().setSystemUiVisibility(1280);
            window.setStatusBarColor(0);
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 48;
        ((DialogFragment) this).A03.getWindow().setAttributes(attributes);
        this.A09.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 41));
        inflate.findViewById(R.id.cancel_button).setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 42));
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) inflate.findViewById(R.id.emoji_edit_text_layout);
        keyboardPopupLayout.A07 = true;
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.emoji_btn);
        this.A06 = imageButton;
        this.A0H = new C48362Ey(A09(), this.A0K, this.A0M, this.A07, this.A0G, this.A0E, this.A0I, this.A0B, this.A0D, this.A0J, this.A0C, this.A0L, keyboardPopupLayout, imageButton, this.A0A);
        new AnonymousClass223((EmojiSearchContainer) inflate.findViewById(R.id.emoji_search_container), this.A0H, A09(), this.A0G, this.A0I, this.A0D, this.A0L).A00 = new InterfaceC04830Lz() { // from class: X.3AK
            {
                EmojiEditTextBottomSheetDialogFragment.this = this;
            }

            @Override // X.InterfaceC04830Lz
            public final void AJj(C2CI c2ci) {
                EmojiEditTextBottomSheetDialogFragment.this.A0S.AJi(c2ci.A00);
            }
        };
        C48362Ey c48362Ey = this.A0H;
        c48362Ey.A0A(this.A0S);
        c48362Ey.A0C = new RunnableEBaseShape2S0100000_I0_2(this, 40);
        int i3 = this.A02;
        if (i3 != 0) {
            this.A0A.setHint(A0F(i3));
        }
        this.A0A.setText(C002701i.A0g(this.A0N, A09(), this.A0G));
        if (!TextUtils.isEmpty(this.A0N)) {
            this.A0A.selectAll();
        }
        ((DialogFragment) this).A03.setOnShowListener(new DialogInterface.OnShowListener() { // from class: X.2un
            {
                EmojiEditTextBottomSheetDialogFragment.this = this;
            }

            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                final EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment = EmojiEditTextBottomSheetDialogFragment.this;
                BottomSheetBehavior A00 = BottomSheetBehavior.A00(((Dialog) dialogInterface).findViewById(R.id.design_bottom_sheet));
                A00.A0O(3);
                A00.A0E = new AbstractC08940cM() { // from class: X.3AO
                    @Override // X.AbstractC08940cM
                    public void A00(View view, float f) {
                    }

                    @Override // X.AbstractC08940cM
                    public void A01(View view, int i4) {
                        if (i4 == 4 || i4 == 5) {
                            emojiEditTextBottomSheetDialogFragment.A10();
                        }
                    }
                };
            }
        });
        if (bundle != null) {
            this.A0Q = bundle.getBoolean("is_keyboard_showing");
            return inflate;
        }
        this.A0Q = true;
        return inflate;
    }

    @Override // X.C0BA
    public void A0s() {
        this.A0U = true;
        this.A0A.requestFocus();
        if (this.A0Q) {
            this.A0A.A02(false);
        }
    }

    @Override // com.whatsapp.emoji.Hilt_EmojiEditTextBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        if (context instanceof C2Oc) {
            this.A0F = (C2Oc) context;
            return;
        }
        StringBuilder A0P = C000200d.A0P("Activity must implement ");
        A0P.append("EmojiEditTextBottomSheetDialogFragment$EmojiEditTextDialogListener");
        throw new IllegalStateException(A0P.toString());
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        A12(0, 2131952200);
        Bundle A02 = A02();
        this.A00 = A02.getInt("dialogId");
        this.A05 = A02.getInt("titleResId");
        this.A02 = A02.getInt("hintResId");
        this.A01 = A02.getInt("emptyErrorResId");
        this.A0N = A02.getString("defaultStr");
        this.A04 = A02.getInt("maxLength");
        this.A03 = A02.getInt("inputType");
        this.A0R = A02.getStringArray("codepointBlacklist");
    }
}
