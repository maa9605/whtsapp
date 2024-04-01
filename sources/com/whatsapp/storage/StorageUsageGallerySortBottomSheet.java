package com.whatsapp.storage;

import X.C83123rc;
import X.C86553xk;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape0S0101000_I0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.storage.StorageUsageGallerySortBottomSheet;

/* loaded from: classes2.dex */
public class StorageUsageGallerySortBottomSheet extends Hilt_StorageUsageGallerySortBottomSheet {
    public C83123rc A00;
    public C86553xk A01;
    public C86553xk A02;
    public C86553xk A03;
    public C86553xk A04;

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.storage_usage_gallery_sort_bottom_sheet, viewGroup, false);
        C86553xk c86553xk = new C86553xk(((Hilt_StorageUsageGallerySortBottomSheet) this).A00);
        this.A02 = c86553xk;
        c86553xk.setText(A0F(R.string.sort_by_newest));
        this.A02.setOnClickListener(new ViewOnClickEBaseShape0S0101000_I0(this, 0, 6));
        viewGroup2.addView(this.A02);
        C86553xk c86553xk2 = new C86553xk(((Hilt_StorageUsageGallerySortBottomSheet) this).A00);
        this.A03 = c86553xk2;
        c86553xk2.setText(A0F(R.string.sort_by_oldest));
        this.A03.setOnClickListener(new ViewOnClickEBaseShape0S0101000_I0(this, 1, 6));
        viewGroup2.addView(this.A03);
        C86553xk c86553xk3 = new C86553xk(((Hilt_StorageUsageGallerySortBottomSheet) this).A00);
        this.A04 = c86553xk3;
        c86553xk3.setText(A0F(R.string.sort_by_size));
        this.A04.setOnClickListener(new ViewOnClickEBaseShape0S0101000_I0(this, 2, 6));
        viewGroup2.addView(this.A04);
        Bundle A02 = A02();
        if (A02.getBoolean("storage_usage_gallery_sort_bottom_sheet_show_forwarding_score", false)) {
            C86553xk c86553xk4 = new C86553xk(((Hilt_StorageUsageGallerySortBottomSheet) this).A00);
            this.A01 = c86553xk4;
            c86553xk4.setText(A0F(R.string.sort_by_forwarding_score));
            this.A01.setOnClickListener(new ViewOnClickEBaseShape0S0101000_I0(this, 3, 6));
            viewGroup2.addView(this.A01);
        }
        int i = A02.getInt("storage_usage_gallery_sort_bottom_sheet_selected_sort_row", 0);
        this.A02.setChecked(false);
        this.A03.setChecked(false);
        this.A04.setChecked(false);
        if (i != 0) {
            if (i == 1) {
                this.A03.setChecked(true);
            } else if (i == 2) {
                this.A04.setChecked(true);
            } else if (i == 3) {
                C86553xk c86553xk5 = this.A01;
                if (c86553xk5 != null) {
                    c86553xk5.setChecked(true);
                } else {
                    throw null;
                }
            }
        } else {
            this.A02.setChecked(true);
        }
        Dialog dialog = ((DialogFragment) this).A03;
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    window.getDecorView().setSystemUiVisibility(1280);
                    window.setStatusBarColor(0);
                }
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.width = -1;
                attributes.gravity = 48;
                window.setAttributes(attributes);
                dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: X.3YU
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        final StorageUsageGallerySortBottomSheet storageUsageGallerySortBottomSheet = StorageUsageGallerySortBottomSheet.this;
                        View findViewById = ((Dialog) dialogInterface).findViewById(R.id.design_bottom_sheet);
                        if (findViewById != null) {
                            BottomSheetBehavior A00 = BottomSheetBehavior.A00(findViewById);
                            A00.A0O(3);
                            A00.A0E = new AbstractC08940cM() { // from class: X.3rp
                                @Override // X.AbstractC08940cM
                                public void A00(View view, float f) {
                                }

                                @Override // X.AbstractC08940cM
                                public void A01(View view, int i2) {
                                    if (i2 == 4 || i2 == 5) {
                                        StorageUsageGallerySortBottomSheet.this.A10();
                                    }
                                }
                            };
                        }
                    }
                });
                return viewGroup2;
            }
            throw null;
        }
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0r() {
        super.A0r();
        this.A00 = null;
        this.A02 = null;
        this.A03 = null;
        this.A04 = null;
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        A12(0, 2131952200);
    }
}
