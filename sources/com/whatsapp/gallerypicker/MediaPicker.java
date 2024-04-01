package com.whatsapp.gallerypicker;

import X.AbstractActivityC49932Nt;
import X.AbstractC02800Cx;
import X.C02160Ac;
import X.C02820Cz;
import X.C0BA;
import X.C0VJ;
import X.C2HC;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class MediaPicker extends AbstractActivityC49932Nt {
    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        C0BA A06 = A0N().A06(R.id.content);
        if (A06 != null) {
            A06.A0h(i, i2, intent);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // X.AbstractActivityC49932Nt, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        A0h(5);
        if (C2HC.A00) {
            Window window = getWindow();
            window.addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            window.clearFlags(67108864);
            window.requestFeature(13);
            window.requestFeature(12);
            Transition inflateTransition = TransitionInflater.from(this).inflateTransition(17760259);
            inflateTransition.excludeTarget(16908335, true);
            inflateTransition.excludeTarget(16908336, true);
            window.setEnterTransition(inflateTransition);
            Transition inflateTransition2 = TransitionInflater.from(this).inflateTransition(17760258);
            inflateTransition2.excludeTarget(16908335, true);
            inflateTransition2.excludeTarget(16908336, true);
            window.setReturnTransition(inflateTransition2);
            A0S();
        }
        super.onCreate(bundle);
        setTitle(R.string.gallery_label);
        A0c().A0L(true);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(R.id.content);
        if (bundle == null) {
            MediaPickerFragment mediaPickerFragment = new MediaPickerFragment();
            AbstractC02800Cx A0N = A0N();
            if (A0N != null) {
                C02820Cz c02820Cz = new C02820Cz(A0N);
                c02820Cz.A00(frameLayout.getId(), mediaPickerFragment);
                c02820Cz.A04();
                View view = new View(this);
                view.setBackgroundColor(C02160Ac.A00(this, R.color.divider_gray));
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) Math.ceil(getResources().getDisplayMetrics().density / 2.0f)));
                frameLayout.addView(view);
            } else {
                throw null;
            }
        }
        setContentView(frameLayout);
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            C0VJ.A0B(this);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
