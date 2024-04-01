package com.facebook.redex;

import X.AbstractC005302j;
import X.ActivityC02290Ap;
import X.C018308n;
import X.C06C;
import X.C0AT;
import X.C0DJ;
import X.C3TK;
import X.C3XV;
import X.C3ZJ;
import X.C58932rw;
import X.C82113pz;
import X.C84543tv;
import X.C84553tw;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import com.whatsapp.QuickContactActivity;
import com.whatsapp.SuspiciousLinkWarningDialogFragment;
import com.whatsapp.TextEmojiLabel;
import java.util.Set;

/* loaded from: classes2.dex */
public class ViewOnClickEBaseShape1S0300000_I1 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public ViewOnClickEBaseShape1S0300000_I1(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.A03) {
            case 0:
                ((ActivityC02290Ap) C018308n.A00(((C58932rw) this.A00).A00)).AUh(SuspiciousLinkWarningDialogFragment.A00(((C3TK) this.A01).A02, (Set) this.A02));
                return;
            case 1:
            default:
                return;
            case 2:
                final C82113pz c82113pz = (C82113pz) this.A00;
                final ViewGroup viewGroup = (ViewGroup) this.A02;
                Rect bounds = ((C3ZJ) this.A01).A03.getBounds();
                int centerX = bounds.centerX();
                TextEmojiLabel textEmojiLabel = c82113pz.A02;
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 0, (centerX + textEmojiLabel.getTotalPaddingLeft()) - textEmojiLabel.getScrollX(), 0, (bounds.centerY() + textEmojiLabel.getTotalPaddingTop()) - textEmojiLabel.getScrollY());
                scaleAnimation.setDuration(160L);
                scaleAnimation.setInterpolator(new DecelerateInterpolator());
                scaleAnimation.setAnimationListener(new C0DJ() { // from class: X.3px
                    @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        c82113pz.A00 = null;
                        viewGroup.setVisibility(8);
                    }
                });
                View view2 = c82113pz.A00;
                if (view2 != null) {
                    view2.startAnimation(scaleAnimation);
                    c82113pz.A00.setVisibility(8);
                    ((C3XV) c82113pz).A05.A00.A0G();
                    return;
                }
                return;
            case 3:
                C84553tw c84553tw = (C84553tw) this.A01;
                QuickContactActivity.A00(((C84543tv) this.A00).A02, c84553tw.A02, (AbstractC005302j) ((C06C) this.A02).A03(AbstractC005302j.class), C0AT.A0G(c84553tw.A02));
                return;
        }
    }
}
