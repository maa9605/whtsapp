package com.whatsapp.authentication;

import X.AbstractC08940cM;
import X.AbstractC35891ju;
import X.AnonymousClass012;
import X.AnonymousClass088;
import X.C002301c;
import X.C003301p;
import X.C0HE;
import X.InterfaceC06550Tv;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.authentication.FingerprintView;

/* loaded from: classes.dex */
public class FingerprintBottomSheet extends Hilt_FingerprintBottomSheet implements InterfaceC06550Tv {
    public TextView A01;
    public TextView A02;
    public C0HE A03;
    public AbstractC35891ju A04;
    public FingerprintView A05;
    public AnonymousClass012 A06;
    public C002301c A07;
    public long A00 = 0;
    public boolean A08 = false;

    public static FingerprintBottomSheet A00(int i, int i2, int i3, int i4) {
        FingerprintBottomSheet fingerprintBottomSheet = new FingerprintBottomSheet();
        Bundle bundle = new Bundle();
        bundle.putInt("title", i);
        bundle.putInt("negative_button_text", i2);
        bundle.putInt("positive_button_text", i3);
        if (i4 != 0) {
            bundle.putInt("header_layout_id", i4);
        }
        bundle.putInt("fingerprint_view_style_id", R.style.FingerprintView);
        bundle.putBoolean("full_screen", false);
        fingerprintBottomSheet.A0P(bundle);
        return fingerprintBottomSheet;
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0e() {
        super.A0e();
        this.A04 = null;
    }

    @Override // X.C0BA
    public void A0f() {
        this.A0U = true;
        A1A();
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final Bundle A02 = A02();
        int i = A02.getInt("custom_layout_id");
        if (i == 0) {
            i = R.layout.fingerprint_bottom_sheet;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        int i2 = A02.getInt("header_layout_id");
        if (i2 != 0) {
            ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.header_container);
            layoutInflater.inflate(i2, viewGroup2);
            viewGroup2.setVisibility(0);
        }
        ViewGroup viewGroup3 = (ViewGroup) inflate.findViewById(R.id.fingerprint_view_wrapper);
        if (viewGroup3 != null) {
            FingerprintView fingerprintView = new FingerprintView(inflate.getContext(), null, 0, A02.getInt("fingerprint_view_style_id"));
            this.A05 = fingerprintView;
            viewGroup3.addView(fingerprintView);
        } else {
            this.A05 = (FingerprintView) inflate.findViewById(R.id.fingerprint_view);
        }
        ((TextView) inflate.findViewById(R.id.fingerprint_bottomsheet_title)).setText(A0F(A02.getInt("title", R.string.fingerprint_bottom_sheet_title)));
        if (A02.getInt("positive_button_text") != 0) {
            String A0F = A0F(A02.getInt("positive_button_text"));
            TextView textView = (TextView) inflate.findViewById(R.id.fingerprint_bottomsheet_positive_button);
            this.A02 = textView;
            textView.setText(A0F);
            this.A02.setOnClickListener(new View.OnClickListener() { // from class: X.1Mc
                {
                    FingerprintBottomSheet.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FingerprintBottomSheet.this.A1C();
                }
            });
        }
        if (A02.getInt("negative_button_text") != 0) {
            String A0F2 = A0F(A02.getInt("negative_button_text"));
            TextView textView2 = (TextView) inflate.findViewById(R.id.fingerprint_bottomsheet_negative_button);
            this.A01 = textView2;
            AnonymousClass088.A1U(textView2);
            this.A01.setText(A0F2);
            this.A01.setOnClickListener(new View.OnClickListener() { // from class: X.1Md
                {
                    FingerprintBottomSheet.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FingerprintBottomSheet.this.A19();
                }
            });
        }
        this.A05.A00 = this.A04;
        Window window = ((DialogFragment) this).A03.getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.getDecorView().setSystemUiVisibility(1280);
                window.setStatusBarColor(0);
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 48;
            window.setAttributes(attributes);
            ((DialogFragment) this).A03.setOnShowListener(new DialogInterface.OnShowListener() { // from class: X.1Me
                {
                    FingerprintBottomSheet.this = this;
                }

                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    FingerprintBottomSheet.this.A1E(A02, dialogInterface);
                }
            });
            return inflate;
        }
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0r() {
        super.A0r();
        FingerprintView fingerprintView = this.A05;
        if (fingerprintView != null) {
            fingerprintView.A00 = null;
            this.A05 = null;
        }
    }

    @Override // X.C0BA
    public void A0s() {
        this.A0U = true;
        if (this.A00 <= this.A06.A05()) {
            A1B();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        A12(0, 2131952200);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void A10() {
        A1A();
        A16(false, false);
    }

    public void A18() {
        C0HE c0he = new C0HE();
        this.A03 = c0he;
        AbstractC35891ju abstractC35891ju = this.A04;
        if (abstractC35891ju != null) {
            abstractC35891ju.A03(c0he, this);
        }
    }

    public void A19() {
        A11();
    }

    public final void A1A() {
        C0HE c0he = this.A03;
        if (c0he != null) {
            c0he.A01();
            this.A03 = null;
        }
    }

    public final void A1B() {
        if (this.A08) {
            return;
        }
        FingerprintView fingerprintView = this.A05;
        if (fingerprintView != null) {
            fingerprintView.A03(fingerprintView.A04);
        }
        C0HE c0he = new C0HE();
        this.A03 = c0he;
        AbstractC35891ju abstractC35891ju = this.A04;
        if (abstractC35891ju != null) {
            abstractC35891ju.A03(c0he, this);
        }
    }

    public /* synthetic */ void A1C() {
        A11();
        AbstractC35891ju abstractC35891ju = this.A04;
        if (abstractC35891ju != null) {
            abstractC35891ju.A02();
        }
    }

    public void A1D(final long j) {
        if (j <= this.A06.A05()) {
            return;
        }
        this.A00 = j;
        A1A();
        new CountDownTimer(j - this.A06.A05()) { // from class: X.1Mq
            public final /* synthetic */ int A00 = R.string.payment_pin_timeout;

            {
                FingerprintBottomSheet.this = this;
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                FingerprintBottomSheet fingerprintBottomSheet = FingerprintBottomSheet.this;
                if (j <= fingerprintBottomSheet.A06.A05()) {
                    fingerprintBottomSheet.A1B();
                }
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j2) {
                FingerprintBottomSheet fingerprintBottomSheet = FingerprintBottomSheet.this;
                FingerprintView fingerprintView = fingerprintBottomSheet.A05;
                if (fingerprintView != null) {
                    fingerprintView.A04(fingerprintBottomSheet.A0G(this.A00, AnonymousClass029.A0g(fingerprintBottomSheet.A07, j2 / 1000)));
                }
            }
        }.start();
    }

    public void A1E(Bundle bundle, DialogInterface dialogInterface) {
        View findViewById = ((Dialog) dialogInterface).findViewById(R.id.design_bottom_sheet);
        if (findViewById != null) {
            BottomSheetBehavior A00 = BottomSheetBehavior.A00(findViewById);
            if (bundle.getBoolean("full_screen")) {
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                layoutParams.height = Resources.getSystem().getDisplayMetrics().heightPixels - C003301p.A02(((Hilt_FingerprintBottomSheet) this).A00);
                findViewById.setLayoutParams(layoutParams);
            }
            A00.A0O(3);
            A00.A0E = new AbstractC08940cM() { // from class: X.1jt
                @Override // X.AbstractC08940cM
                public void A00(View view, float f) {
                }

                {
                    FingerprintBottomSheet.this = this;
                }

                @Override // X.AbstractC08940cM
                public void A01(View view, int i) {
                    if (i == 4 || i == 5) {
                        FingerprintBottomSheet.this.A10();
                    }
                }
            };
            return;
        }
        throw null;
    }

    @Override // X.InterfaceC06550Tv
    public void AHZ(int i, CharSequence charSequence) {
        AbstractC35891ju abstractC35891ju = this.A04;
        if (abstractC35891ju != null) {
            abstractC35891ju.A01();
        }
        if (this.A05 != null) {
            if (i == 7) {
                charSequence = A0G(R.string.app_auth_lockout_error_short, 30);
            }
            this.A05.A04(charSequence);
        }
        A1A();
    }

    @Override // X.InterfaceC06550Tv
    public void AHa() {
        FingerprintView fingerprintView = this.A05;
        if (fingerprintView != null) {
            fingerprintView.A00();
        }
    }

    @Override // X.InterfaceC06550Tv
    public void AHb(int i, CharSequence charSequence) {
        FingerprintView fingerprintView = this.A05;
        if (fingerprintView != null) {
            fingerprintView.A05(charSequence.toString());
        }
    }

    @Override // X.InterfaceC06550Tv
    public void AHc(byte[] bArr) {
        AbstractC35891ju abstractC35891ju = this.A04;
        if (abstractC35891ju != null) {
            abstractC35891ju.A04(bArr);
        }
        FingerprintView fingerprintView = this.A05;
        if (fingerprintView != null) {
            fingerprintView.A01();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        A1A();
    }
}
