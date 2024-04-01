package com.whatsapp.settings.chat.wallpaper;

import X.ActivityC02290Ap;
import X.C02180Ae;
import X.C03410Fp;
import X.C0VJ;
import X.C2Pe;
import X.C3WS;
import X.C86273xA;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I0_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.collections.MarginCorrectedViewPager;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;

/* loaded from: classes2.dex */
public class SolidColorWallpaperPreview extends C2Pe {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public CheckBox A08;
    public MarginCorrectedViewPager A09;
    public int[] A0C;
    public int[] A0D;
    public boolean A0B = false;
    public boolean A0A = false;

    public final void A1R(int i) {
        int i2;
        int i3;
        if (this.A0A) {
            this.A0B = true;
            this.A09.setScrollEnabled(false);
            DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
            if (i != getIntent().getIntExtra("scw_preview_color", -1)) {
                this.A02 = 0;
                this.A03 = 0;
                i2 = this.A09.getWidth() >> 1;
                i3 = this.A09.getWidth() >> 1;
            } else {
                i2 = 0;
                i3 = 0;
            }
            this.A09.setPivotX(i2);
            this.A09.setPivotY(i3);
            this.A05.setBackgroundColor(0);
            this.A09.animate().setDuration(250L).alpha(0.0f).scaleX(this.A00).scaleY(this.A01).translationX(this.A02).translationY(this.A03).setInterpolator(decelerateInterpolator).setListener(new AnimatorListenerAdapter() { // from class: X.3WT
                {
                    SolidColorWallpaperPreview.this = this;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    super.onAnimationCancel(animator);
                    SolidColorWallpaperPreview.this.finish();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    SolidColorWallpaperPreview.this.finish();
                }
            });
            this.A04.animate().setDuration(250L).alpha(0.0f).setInterpolator(decelerateInterpolator);
            this.A06.animate().setDuration(250L).alpha(0.0f).setInterpolator(decelerateInterpolator);
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (this.A0A && this.A0B) {
            overridePendingTransition(0, 0);
        }
    }

    public /* synthetic */ void lambda$onCreate$2381$SolidColorWallpaperPreview(View view) {
        setResult(0, null);
        A1R(this.A09.getCurrentItem());
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        setResult(0, null);
        A1R(this.A09.getCurrentItem());
    }

    @Override // X.C2Pe, X.C2PT, X.C2PU, X.C2PR, X.C2PS, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        final C86273xA c86273xA;
        super.onCreate(bundle);
        this.A05 = C0VJ.A0A(this, R.id.wallpaper_preview_container);
        this.A04 = C0VJ.A0A(this, R.id.appbar);
        this.A07 = C0VJ.A0A(this, R.id.transition_view);
        int[] A09 = C03410Fp.A09(this, ((ActivityC02290Ap) this).A0B);
        int length = A09.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = i;
        }
        Pair pair = new Pair(A09, iArr);
        this.A0C = (int[]) pair.first;
        this.A0D = (int[]) pair.second;
        MarginCorrectedViewPager marginCorrectedViewPager = (MarginCorrectedViewPager) C0VJ.A0A(this, R.id.wallpaper_preview);
        this.A09 = marginCorrectedViewPager;
        marginCorrectedViewPager.setSaveEnabled(false);
        if (C03410Fp.A08(((ActivityC02290Ap) this).A0B)) {
            CheckBox checkBox = (CheckBox) C0VJ.A0A(this, R.id.color_wallpaper_add_doodles);
            this.A08 = checkBox;
            checkBox.setVisibility(0);
            this.A08.setText(R.string.wallpaper_solid_color_add_whatsapp_doodle);
            c86273xA = new C86273xA(this, this);
            c86273xA.A00 = this.A08.isChecked();
            this.A08.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: X.3WJ
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    C86273xA c86273xA2 = c86273xA;
                    c86273xA2.A00 = z;
                    c86273xA2.A04();
                }
            });
        } else {
            c86273xA = new C86273xA(this, this);
        }
        this.A09.setAdapter(c86273xA);
        this.A09.setPageMargin((int) (getResources().getDisplayMetrics().density * 15.0f));
        this.A06 = C0VJ.A0A(this, R.id.control_holder);
        if (C03410Fp.A08(((ActivityC02290Ap) this).A0B)) {
            this.A06.setBackground(C02180Ae.A0N(this, R.drawable.wallpaper_color_confirmation_background));
        }
        C0VJ.A0A(this, R.id.cancel_button).setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 14));
        int i2 = C03410Fp.A09(this, ((ActivityC02290Ap) this).A0B)[getIntent().getIntExtra("scw_preview_color", 0)];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr2 = this.A0C;
            if (i4 >= iArr2.length) {
                break;
            } else if (iArr2[i4] == i2) {
                i3 = i4;
                break;
            } else {
                i4++;
            }
        }
        this.A09.setCurrentItem(i3);
        this.A0B = false;
        boolean booleanExtra = getIntent().getBooleanExtra("wallpaper_preview_intent_extra_animate", false);
        this.A0A = booleanExtra;
        if (booleanExtra) {
            overridePendingTransition(0, 0);
            Intent intent = getIntent();
            this.A0B = true;
            this.A09.setScrollEnabled(false);
            this.A07.getViewTreeObserver().addOnPreDrawListener(new C3WS(this, intent.getIntExtra("wallpaper_preview_intent_extra_x", 0), intent.getIntExtra("wallpaper_preview_intent_extra_y", 0), intent.getIntExtra("wallpaper_preview_intent_extra_width", 0), intent.getIntExtra("wallpaper_preview_intent_extra_height", 0)));
            return;
        }
        this.A05.setBackgroundColor(getResources().getColor(R.color.white));
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0, null);
        A1R(this.A09.getCurrentItem());
        return true;
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        int i = C03410Fp.A09(this, ((ActivityC02290Ap) this).A0B)[bundle.getInt("selected_index")];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.A0C;
            if (i3 >= iArr.length) {
                break;
            } else if (iArr[i3] == i) {
                i2 = i3;
                break;
            } else {
                i3++;
            }
        }
        this.A09.setCurrentItem(i2);
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("selected_index", this.A0D[this.A09.getCurrentItem()]);
    }
}
